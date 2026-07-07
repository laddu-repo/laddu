package com.unity3d.services.ads.token;

import android.os.Handler;
import com.unity3d.services.ads.gmascar.GMA;
import com.unity3d.services.ads.gmascar.managers.IBiddingManager;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.TokenType;
import com.unity3d.services.core.device.reader.GameSessionIdReader;
import com.unity3d.services.core.device.reader.builder.DeviceInfoReaderBuilderWithExtras;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.InitializationStatusReader;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.request.metrics.TSIMetric;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class InMemoryAsyncTokenStorage implements AsyncTokenStorage {
    private DeviceInfoReaderBuilderWithExtras _deviceInfoReaderBuilderWithExtras;
    private final Handler _handler;
    private INativeTokenGenerator _nativeTokenGenerator;
    private final SDKMetricsSender _sdkMetrics;
    private TokenStorage _tokenStorage;
    private final List<TokenListenerState> _tokenListeners = new LinkedList();
    private boolean _tokenAvailable = false;
    private boolean _configurationWasSet = false;
    private Configuration _configuration = new Configuration();
    private final InitializationStatusReader _initStatusReader = new InitializationStatusReader();

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.ads.token.InMemoryAsyncTokenStorage$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$core$device$TokenType;

        static {
            int[] iArr = new int[TokenType.values().length];
            $SwitchMap$com$unity3d$services$core$device$TokenType = iArr;
            try {
                iArr[TokenType.TOKEN_NATIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$services$core$device$TokenType[TokenType.TOKEN_REMOTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public class TokenListenerState {
        public IBiddingManager biddingManager;
        public boolean invoked;
        public Runnable runnable;
        public TokenType tokenType;

        public TokenListenerState() {
        }
    }

    public InMemoryAsyncTokenStorage(INativeTokenGenerator iNativeTokenGenerator, Handler handler, SDKMetricsSender sDKMetricsSender, TokenStorage tokenStorage) {
        this._handler = handler;
        this._nativeTokenGenerator = iNativeTokenGenerator;
        this._sdkMetrics = sDKMetricsSender;
        this._tokenStorage = tokenStorage;
    }

    private synchronized TokenListenerState addTimeoutHandler(IBiddingManager iBiddingManager) {
        final TokenListenerState tokenListenerState;
        tokenListenerState = new TokenListenerState();
        tokenListenerState.biddingManager = iBiddingManager;
        tokenListenerState.tokenType = TokenType.TOKEN_REMOTE;
        tokenListenerState.runnable = new Runnable() { // from class: com.unity3d.services.ads.token.InMemoryAsyncTokenStorage.1
            @Override // java.lang.Runnable
            public void run() {
                InMemoryAsyncTokenStorage.this.notifyTokenReady(tokenListenerState, null);
            }
        };
        this._tokenListeners.add(tokenListenerState);
        this._handler.postDelayed(tokenListenerState.runnable, this._configuration.getTokenTimeout());
        return tokenListenerState;
    }

    private Map<String, String> getMetricTags() {
        HashMap hashMap = new HashMap();
        hashMap.put("state", this._initStatusReader.getInitializationStateString(SdkProperties.getCurrentInitializationState()));
        return hashMap;
    }

    private void handleTokenInvocation(final TokenListenerState tokenListenerState) {
        if (!tokenListenerState.invoked) {
            tokenListenerState.invoked = true;
            if (!this._tokenAvailable) {
                tokenListenerState.tokenType = TokenType.TOKEN_NATIVE;
                if (GMA.getInstance().hasSCARBiddingSupport() && this._deviceInfoReaderBuilderWithExtras != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(ScarConstants.TOKEN_ID_KEY, tokenListenerState.biddingManager.getTokenIdentifier());
                    this._deviceInfoReaderBuilderWithExtras.setExtras(hashMap);
                }
                this._nativeTokenGenerator.generateToken(new INativeTokenGeneratorListener() { // from class: com.unity3d.services.ads.token.InMemoryAsyncTokenStorage.2
                    @Override // com.unity3d.services.ads.token.INativeTokenGeneratorListener
                    public void onReady(final String str) {
                        InMemoryAsyncTokenStorage.this._handler.post(new Runnable() { // from class: com.unity3d.services.ads.token.InMemoryAsyncTokenStorage.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                InMemoryAsyncTokenStorage.this.notifyTokenReady(tokenListenerState, str);
                            }
                        });
                    }
                });
                return;
            }
            tokenListenerState.tokenType = TokenType.TOKEN_REMOTE;
            String token = this._tokenStorage.getToken();
            if (token != null && !token.isEmpty()) {
                notifyTokenReady(tokenListenerState, token);
            }
        }
    }

    private boolean isValidConfig(Configuration configuration) {
        if (configuration != null) {
            return true;
        }
        return false;
    }

    private synchronized void notifyListenersTokenReady() {
        String token;
        while (!this._tokenListeners.isEmpty() && (token = this._tokenStorage.getToken()) != null) {
            notifyTokenReady(this._tokenListeners.get(0), token);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void notifyTokenReady(TokenListenerState tokenListenerState, String str) {
        String str2;
        try {
            if (this._tokenListeners.remove(tokenListenerState)) {
                if (tokenListenerState.tokenType == TokenType.TOKEN_REMOTE) {
                    str2 = tokenListenerState.biddingManager.getFormattedToken(str);
                } else {
                    str2 = str;
                }
                tokenListenerState.biddingManager.onUnityAdsTokenReady(str2);
                try {
                    this._handler.removeCallbacks(tokenListenerState.runnable);
                } catch (Exception e10) {
                    DeviceLog.exception("Failed to remove callback from a handler", e10);
                }
            }
            sendTokenMetrics(str, tokenListenerState.tokenType);
        } catch (Throwable th) {
            throw th;
        }
    }

    private void sendNativeTokenMetrics(String str) {
        SDKMetricsSender sDKMetricsSender = this._sdkMetrics;
        if (sDKMetricsSender == null) {
            return;
        }
        if (str == null) {
            sDKMetricsSender.sendMetric(TSIMetric.newNativeGeneratedTokenNull(getMetricTags()));
        } else {
            sDKMetricsSender.sendMetric(TSIMetric.newNativeGeneratedTokenAvailable(getMetricTags()));
        }
    }

    private void sendRemoteTokenMetrics(String str) {
        if (this._sdkMetrics == null) {
            return;
        }
        if (str != null && !str.isEmpty()) {
            this._sdkMetrics.sendMetric(TSIMetric.newAsyncTokenAvailable(getMetricTags()));
        } else {
            this._sdkMetrics.sendMetric(TSIMetric.newAsyncTokenNull(getMetricTags()));
        }
    }

    private void sendTokenMetrics(String str, TokenType tokenType) {
        int i6 = AnonymousClass3.$SwitchMap$com$unity3d$services$core$device$TokenType[tokenType.ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                DeviceLog.error("Unknown token type passed to sendTokenMetrics");
                return;
            } else {
                sendRemoteTokenMetrics(str);
                return;
            }
        }
        sendNativeTokenMetrics(str);
    }

    @Override // com.unity3d.services.ads.token.AsyncTokenStorage
    public synchronized void getToken(IBiddingManager iBiddingManager) {
        if (SdkProperties.getCurrentInitializationState() == SdkProperties.InitializationState.INITIALIZED_FAILED) {
            iBiddingManager.onUnityAdsTokenReady(null);
            sendTokenMetrics(null, TokenType.TOKEN_REMOTE);
        } else if (SdkProperties.getCurrentInitializationState() == SdkProperties.InitializationState.NOT_INITIALIZED) {
            iBiddingManager.onUnityAdsTokenReady(null);
            sendTokenMetrics(null, TokenType.TOKEN_REMOTE);
        } else {
            TokenListenerState addTimeoutHandler = addTimeoutHandler(iBiddingManager);
            if (!this._configurationWasSet) {
                return;
            }
            handleTokenInvocation(addTimeoutHandler);
        }
    }

    @Override // com.unity3d.services.ads.token.AsyncTokenStorage
    public synchronized void onTokenAvailable() {
        this._tokenAvailable = true;
        if (!this._configurationWasSet) {
            return;
        }
        notifyListenersTokenReady();
    }

    @Override // com.unity3d.services.ads.token.AsyncTokenStorage
    public synchronized void setConfiguration(Configuration configuration) {
        try {
            this._configuration = configuration;
            boolean isValidConfig = isValidConfig(configuration);
            this._configurationWasSet = isValidConfig;
            if (!isValidConfig) {
                return;
            }
            if (this._nativeTokenGenerator == null) {
                this._deviceInfoReaderBuilderWithExtras = new DeviceInfoReaderBuilderWithExtras(new ConfigurationReader(), PrivacyConfigStorage.getInstance(), GameSessionIdReader.getInstance());
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                this._nativeTokenGenerator = new NativeTokenGenerator(newSingleThreadExecutor, this._deviceInfoReaderBuilderWithExtras);
                if (configuration.getExperiments().shouldNativeTokenAwaitPrivacy()) {
                    this._nativeTokenGenerator = new NativeTokenGeneratorWithPrivacyAwait(newSingleThreadExecutor, this._nativeTokenGenerator, configuration.getPrivacyRequestWaitTimeout());
                }
            }
            ArrayList arrayList = new ArrayList(this._tokenListeners);
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6++;
                handleTokenInvocation((TokenListenerState) obj);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
