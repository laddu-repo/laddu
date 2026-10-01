package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.InitializationException;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.events.EventObservers;
import com.unity3d.ads.core.domain.om.InitializeOMSDK;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.services.core.configuration.ConfigurationReader;
import ef.j;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import gf.f0;
import gf.y;
import he.e;
import he.i;
import ie.w;
import java.util.Map;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import le.c;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidInitializeBoldSDK implements InitializeBoldSDK {
    public static final Companion Companion = new Companion(null);
    public static final String MSG_GATEWAY_DENIED = "Gateway communication failure";
    public static final String MSG_NETWORK = "Network";
    public static final String MSG_TIMEOUT = "Timeout";
    public static final String MSG_UNKNOWN = "Initialization failure";
    private final CleanAssets cleanAssets;
    private final y defaultDispatcher;
    private final DiagnosticEventRepository diagnosticEventRepository;
    private final EventObservers eventObservers;
    private final GatewayClient gatewayClient;
    private final GetGameId getGameId;
    private final GetInitializationRequest getInitializeRequest;
    private final GetRequestPolicy getRequestPolicy;
    private final AndroidHandleFocusCounters handleFocusCounters;
    private final HandleGatewayInitializationResponse handleGatewayInitializationResponse;
    private final InitializeOMSDK initializeOM;
    private final ConfigurationReader legacyConfigurationReader;
    private final Logger logger;
    private final SDKPropertiesManager sdkPropertiesManager;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final StorageManager storageManager;
    private final TriggerInitializeListener triggerInitializeListener;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private Companion() {
        }
    }

    public AndroidInitializeBoldSDK(y defaultDispatcher, InitializeOMSDK initializeOM, GetInitializationRequest getInitializeRequest, GetRequestPolicy getRequestPolicy, CleanAssets cleanAssets, HandleGatewayInitializationResponse handleGatewayInitializationResponse, GatewayClient gatewayClient, SessionRepository sessionRepository, EventObservers eventObservers, TriggerInitializeListener triggerInitializeListener, SendDiagnosticEvent sendDiagnosticEvent, DiagnosticEventRepository diagnosticEventRepository, StorageManager storageManager, ConfigurationReader legacyConfigurationReader, SDKPropertiesManager sdkPropertiesManager, GetGameId getGameId, Logger logger, AndroidHandleFocusCounters handleFocusCounters) {
        k.e(defaultDispatcher, "defaultDispatcher");
        k.e(initializeOM, "initializeOM");
        k.e(getInitializeRequest, "getInitializeRequest");
        k.e(getRequestPolicy, "getRequestPolicy");
        k.e(cleanAssets, "cleanAssets");
        k.e(handleGatewayInitializationResponse, "handleGatewayInitializationResponse");
        k.e(gatewayClient, "gatewayClient");
        k.e(sessionRepository, "sessionRepository");
        k.e(eventObservers, "eventObservers");
        k.e(triggerInitializeListener, "triggerInitializeListener");
        k.e(sendDiagnosticEvent, "sendDiagnosticEvent");
        k.e(diagnosticEventRepository, "diagnosticEventRepository");
        k.e(storageManager, "storageManager");
        k.e(legacyConfigurationReader, "legacyConfigurationReader");
        k.e(sdkPropertiesManager, "sdkPropertiesManager");
        k.e(getGameId, "getGameId");
        k.e(logger, "logger");
        k.e(handleFocusCounters, "handleFocusCounters");
        this.defaultDispatcher = defaultDispatcher;
        this.initializeOM = initializeOM;
        this.getInitializeRequest = getInitializeRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.cleanAssets = cleanAssets;
        this.handleGatewayInitializationResponse = handleGatewayInitializationResponse;
        this.gatewayClient = gatewayClient;
        this.sessionRepository = sessionRepository;
        this.eventObservers = eventObservers;
        this.triggerInitializeListener = triggerInitializeListener;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.diagnosticEventRepository = diagnosticEventRepository;
        this.storageManager = storageManager;
        this.legacyConfigurationReader = legacyConfigurationReader;
        this.sdkPropertiesManager = sdkPropertiesManager;
        this.getGameId = getGameId;
        this.logger = logger;
        this.handleFocusCounters = handleFocusCounters;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkCanInitialize() {
        if (this.sessionRepository.getShouldInitialize()) {
            if (this.getGameId.invoke() != null) {
                return;
            }
            throw new InitializationException("gameId is null.", null, "invalid_game_id", "null", 2, null);
        }
        throw new InitializationException(MSG_GATEWAY_DENIED, null, "gateway", "!sessionRepository.shouldInitialize", 2, null);
    }

    private final String getInitLog() {
        String str;
        StringBuilder sb2 = new StringBuilder("Initializing SDK 4.16.5 41605 with game id ");
        sb2.append(this.getGameId.invoke());
        sb2.append(" in ");
        if (this.sessionRepository.isTestModeEnabled()) {
            str = "test";
        } else {
            str = "production";
        }
        sb2.append(str);
        sb2.append(" mode, session ");
        sb2.append(ProtobufExtensionsKt.toUUID(this.sessionRepository.getSessionId()));
        return sb2.toString();
    }

    private final Map<String, String> getTags(InitializationException initializationException, String str, boolean z10) {
        je.f fVar = new je.f();
        fVar.put("operation", OperationType.INITIALIZATION.toString());
        fVar.put("reason", initializationException.getReason());
        fVar.put("source", str);
        fVar.put("is_retry", String.valueOf(z10));
        if (initializationException.getReasonDebug() != null) {
            fVar.put("reason_debug", initializationException.getReasonDebug());
        }
        return fVar.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleResponse(UniversalResponseOuterClass.UniversalResponse universalResponse, c cVar) {
        if (!universalResponse.hasError()) {
            if (universalResponse.hasPayload()) {
                if (universalResponse.getPayload().hasInitializationResponse()) {
                    HandleGatewayInitializationResponse handleGatewayInitializationResponse = this.handleGatewayInitializationResponse;
                    InitializationResponseOuterClass.InitializationResponse initializationResponse = universalResponse.getPayload().getInitializationResponse();
                    k.d(initializationResponse, "response.payload.initializationResponse");
                    Object invoke = handleGatewayInitializationResponse.invoke(initializationResponse, cVar);
                    if (invoke == me.a.f8833x) {
                        return invoke;
                    }
                    return he.y.f6101a;
                }
                throw new InitializationException(MSG_GATEWAY_DENIED, null, "gateway", "No initialization response", 2, null);
            }
            throw new InitializationException(MSG_GATEWAY_DENIED, null, "gateway", "No payload", 2, null);
        }
        this.sessionRepository.setShouldInitialize(false);
        throw new InitializationException(MSG_GATEWAY_DENIED, null, "gateway", universalResponse.getError().getErrorText(), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializationFailure(j jVar, InitializationException initializationException, String str, boolean z10) {
        this.logger.error("Initialization failed: " + initializationException.getMessage(), initializationException);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_initialize_task_failure_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(jVar)), getTags(initializationException, str, z10), null, null, null, 56, null);
        this.sessionRepository.setInitializationState(InitializationState.FAILED);
        this.sdkPropertiesManager.setInitialized(false);
        this.triggerInitializeListener.error(UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, initializationException.getMessage());
        setupDiagnosticEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object initializationStart(String str, boolean z10, c cVar) {
        this.logger.info(getInitLog());
        this.sdkPropertiesManager.setInitializationTime();
        this.sdkPropertiesManager.setInitializationTimeSinceEpoch();
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        i iVar = new i("source", str);
        i iVar2 = new i("is_retry", String.valueOf(z10));
        e.f6071y.getClass();
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_initialization_started", null, w.y(iVar, iVar2, new i("kotlin_version", "2.2.21")), null, null, null, 58, null);
        this.sessionRepository.setInitializationState(InitializationState.INITIALIZING);
        Object invoke = this.eventObservers.invoke(cVar);
        if (invoke == me.a.f8833x) {
            return invoke;
        }
        return he.y.f6101a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ac, code lost:
    
        if (r1.invoke(r2) != r7) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object initializationSuccess(ef.j r18, java.lang.String r19, boolean r20, le.c r21) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.initializationSuccess(ef.j, java.lang.String, boolean, le.c):java.lang.Object");
    }

    private final void setupDiagnosticEvents() {
        NativeConfigurationOuterClass.DiagnosticEventsConfiguration config = this.sessionRepository.getNativeConfiguration().getDiagnosticEvents();
        DiagnosticEventRepository diagnosticEventRepository = this.diagnosticEventRepository;
        k.d(config, "config");
        diagnosticEventRepository.configure(config);
    }

    @Override // com.unity3d.ads.core.domain.InitializeBoldSDK
    public Object invoke(String str, c cVar) {
        Object J = f0.J(this.defaultDispatcher, new AndroidInitializeBoldSDK$invoke$2(this, str, null), cVar);
        if (J == me.a.f8833x) {
            return J;
        }
        return he.y.f6101a;
    }
}
