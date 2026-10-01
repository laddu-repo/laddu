package com.unity3d.services.ads.token;

import com.unity3d.ads.adplayer.b;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.reader.GameSessionIdReader;
import com.unity3d.services.core.device.reader.builder.DeviceInfoReaderBuilder;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import he.a;
import he.f;
import he.g;
import he.y;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kf.f1;
import kf.r0;
import kf.y0;
import kotlin.jvm.internal.k;
import okhttp3.HttpUrl;
import org.json.JSONArray;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class InMemoryTokenStorage implements TokenStorage, IServiceComponent {
    private final ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
    private final r0 accessCounter = y0.c(-1);
    private final r0 initToken = y0.c(null);
    private final ExecutorService executorService = Executors.newSingleThreadExecutor();
    private final f asyncTokenStorage$delegate = a.c(g.f6075z, new InMemoryTokenStorage$special$$inlined$inject$default$1(this, HttpUrl.FRAGMENT_ENCODE_SET));

    public static final void _get_nativeGeneratedToken_$lambda$2(String str) {
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.TOKEN, TokenEvent.TOKEN_NATIVE_DATA, str);
    }

    public static /* synthetic */ void a(String str) {
        _get_nativeGeneratedToken_$lambda$2(str);
    }

    private final AsyncTokenStorage getAsyncTokenStorage() {
        return (AsyncTokenStorage) this.asyncTokenStorage$delegate.getValue();
    }

    private final void triggerTokenAvailable(boolean z10) {
        InitializeEventsMetricSender.getInstance().sdkTokenDidBecomeAvailableWithConfig(z10);
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public void appendTokens(JSONArray tokens) {
        k.e(tokens, "tokens");
        ((f1) this.accessCounter).f(-1, 0);
        int length = tokens.length();
        for (int i6 = 0; i6 < length; i6++) {
            this.queue.add(tokens.getString(i6));
        }
        if (length > 0) {
            triggerTokenAvailable(false);
            getAsyncTokenStorage().onTokenAvailable();
        }
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public void createTokens(JSONArray tokens) {
        k.e(tokens, "tokens");
        deleteTokens();
        appendTokens(tokens);
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public void deleteTokens() {
        f1 f1Var;
        Object value;
        this.queue.clear();
        r0 r0Var = this.accessCounter;
        do {
            f1Var = (f1) r0Var;
            value = f1Var.getValue();
            ((Number) value).intValue();
        } while (!f1Var.f(value, -1));
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public y getNativeGeneratedToken() {
        new NativeTokenGenerator(this.executorService, new DeviceInfoReaderBuilder(new ConfigurationReader(), PrivacyConfigStorage.getInstance(), GameSessionIdReader.getInstance()), null).generateToken(new b(1));
        return y.f6101a;
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public String getToken() {
        f1 f1Var;
        Object value;
        Number number;
        if (((Number) ((f1) this.accessCounter).getValue()).intValue() == -1) {
            return (String) ((f1) this.initToken).getValue();
        }
        if (this.queue.isEmpty()) {
            WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.TOKEN, TokenEvent.QUEUE_EMPTY, new Object[0]);
            return null;
        }
        r0 r0Var = this.accessCounter;
        do {
            f1Var = (f1) r0Var;
            value = f1Var.getValue();
            number = (Number) value;
        } while (!f1Var.f(value, Integer.valueOf(number.intValue() + 1)));
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.TOKEN, TokenEvent.TOKEN_ACCESS, Integer.valueOf(number.intValue()));
        return this.queue.poll();
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public void setInitToken(String str) {
        f1 f1Var;
        Object value;
        if (str == null) {
            return;
        }
        r0 r0Var = this.initToken;
        do {
            f1Var = (f1) r0Var;
            value = f1Var.getValue();
        } while (!f1Var.f(value, str));
        triggerTokenAvailable(true);
        getAsyncTokenStorage().onTokenAvailable();
    }
}
