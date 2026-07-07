package com.unity3d.services;

import android.content.Context;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.domain.GetAdObject;
import com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetGameId;
import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.InitializeBoldSDK;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.ShouldAllowInitialization;
import com.unity3d.ads.core.domain.TokenNumberProvider;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.domain.task.InitializeSDK;
import ef.i;
import ef.k;
import gf.a2;
import gf.c0;
import gf.f0;
import gf.j1;
import gf.m1;
import he.a;
import he.f;
import he.g;
import he.y;
import ie.w;
import kotlin.jvm.internal.x;
import le.c;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class UnityAdsSDK implements IServiceComponent {
    private j1 initializationJob;
    private final IServiceProvider serviceProvider;

    public UnityAdsSDK() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchToken(String str, c cVar) {
        String str2;
        String str3;
        String str4;
        String str5;
        UnityAdsSDK$fetchToken$$inlined$inject$default$1 unityAdsSDK$fetchToken$$inlined$inject$default$1 = new UnityAdsSDK$fetchToken$$inlined$inject$default$1(this, HttpUrl.FRAGMENT_ENCODE_SET);
        g gVar = g.f6075z;
        f c10 = a.c(gVar, unityAdsSDK$fetchToken$$inlined$inject$default$1);
        f c11 = a.c(gVar, new UnityAdsSDK$fetchToken$$inlined$inject$default$2(this, HttpUrl.FRAGMENT_ENCODE_SET));
        f c12 = a.c(gVar, new UnityAdsSDK$fetchToken$$inlined$inject$default$3(this, HttpUrl.FRAGMENT_ENCODE_SET));
        f c13 = a.c(gVar, new UnityAdsSDK$fetchToken$$inlined$inject$default$4(this, HttpUrl.FRAGMENT_ENCODE_SET));
        f c14 = a.c(gVar, new UnityAdsSDK$fetchToken$$inlined$inject$default$5(this, HttpUrl.FRAGMENT_ENCODE_SET));
        long b10 = i.b();
        SendDiagnosticEvent.DefaultImpls.invoke$default(fetchToken$lambda$13(c13), "native_gateway_token_started", null, w.y(new he.i("sync", str), new he.i("state", GetInitializationState.DefaultImpls.invoke$default(fetchToken$lambda$12(c12), false, 1, null).toString())), null, null, null, 58, null);
        if (GetInitializationState.DefaultImpls.invoke$default(fetchToken$lambda$12(c12), false, 1, null) != InitializationState.INITIALIZED) {
            str2 = "not_initialized";
            str3 = null;
            str4 = null;
        } else {
            try {
                str4 = (String) f0.B(le.i.f8353x, new UnityAdsSDK$fetchToken$token$1(c11, c10, null));
                str2 = null;
                str3 = null;
            } catch (Exception e10) {
                String shortenedStackTrace$default = ExceptionExtensionsKt.getShortenedStackTrace$default(e10, 0, 1, null);
                str2 = "uncaught_exception";
                str3 = shortenedStackTrace$default;
                str4 = null;
            }
        }
        SendDiagnosticEvent fetchToken$lambda$13 = fetchToken$lambda$13(c13);
        if (str4 == null) {
            str5 = "native_gateway_token_failure_time";
        } else {
            str5 = "native_gateway_token_success_time";
        }
        String str6 = str5;
        Double d10 = new Double(TimeExtensionsKt.elapsedMillis(new k(b10)));
        je.f fVar = new je.f();
        fVar.put("sync", str);
        fVar.put("state", GetInitializationState.DefaultImpls.invoke$default(fetchToken$lambda$12(c12), false, 1, null).toString());
        if (str2 != null) {
        }
        if (str3 != null) {
            fVar.put("reason_debug", str3);
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(fetchToken$lambda$13, str6, d10, fVar.b(), null, null, new Integer(fetchToken$lambda$10(c10).invoke()), 24, null);
        if (str4 == null) {
            Logger.DefaultImpls.error$default(fetchToken$lambda$14(c14), r4.a.k("Returned nil token due to: ", str2), null, 2, null);
        } else {
            fetchToken$lambda$14(c14).info("Generated a valid token.");
        }
        return str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TokenNumberProvider fetchToken$lambda$10(f fVar) {
        return (TokenNumberProvider) fVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetHeaderBiddingToken fetchToken$lambda$11(f fVar) {
        return (GetHeaderBiddingToken) fVar.getValue();
    }

    private static final GetInitializationState fetchToken$lambda$12(f fVar) {
        return (GetInitializationState) fVar.getValue();
    }

    private static final SendDiagnosticEvent fetchToken$lambda$13(f fVar) {
        return (SendDiagnosticEvent) fVar.getValue();
    }

    private static final Logger fetchToken$lambda$14(f fVar) {
        return (Logger) fVar.getValue();
    }

    private static final AlternativeFlowReader finishOMIDSession$lambda$18(f fVar) {
        return (AlternativeFlowReader) fVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetAdObject finishOMIDSession$lambda$20(f fVar) {
        return (GetAdObject) fVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OmFinishSession finishOMIDSession$lambda$21(f fVar) {
        return (OmFinishSession) fVar.getValue();
    }

    private static final GetGameId getToken$lambda$7(f fVar) {
        return (GetGameId) fVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TokenNumberProvider getToken$lambda$8(f fVar) {
        return (TokenNumberProvider) fVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetAsyncHeaderBiddingToken getToken$lambda$9(f fVar) {
        return (GetAsyncHeaderBiddingToken) fVar.getValue();
    }

    public static /* synthetic */ j1 initialize$default(UnityAdsSDK unityAdsSDK, String str, String str2, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            str2 = "api";
        }
        return unityAdsSDK.initialize(str, str2);
    }

    private static final ShouldAllowInitialization initialize$lambda$4$lambda$0(f fVar) {
        return (ShouldAllowInitialization) fVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlternativeFlowReader initialize$lambda$4$lambda$1(f fVar) {
        return (AlternativeFlowReader) fVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InitializeSDK initialize$lambda$4$lambda$2(f fVar) {
        return (InitializeSDK) fVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InitializeBoldSDK initialize$lambda$4$lambda$3(f fVar) {
        return (InitializeBoldSDK) fVar.getValue();
    }

    public static /* synthetic */ j1 load$default(UnityAdsSDK unityAdsSDK, String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener, UnityBannerSize unityBannerSize, int i6, Object obj) {
        if ((i6 & 8) != 0) {
            unityBannerSize = null;
        }
        return unityAdsSDK.load(str, unityAdsLoadOptions, iUnityAdsLoadListener, unityBannerSize);
    }

    private static final GetGameId load$lambda$5(f fVar) {
        return (GetGameId) fVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context load$lambda$6(f fVar) {
        return (Context) fVar.getValue();
    }

    private static final AlternativeFlowReader sendBannerDestroyed$lambda$22(f fVar) {
        return (AlternativeFlowReader) fVar.getValue();
    }

    private static final SendDiagnosticEvent sendBannerDestroyed$lambda$23(f fVar) {
        return (SendDiagnosticEvent) fVar.getValue();
    }

    public final j1 finishOMIDSession(String opportunityId) {
        kotlin.jvm.internal.k.e(opportunityId, "opportunityId");
        UnityAdsSDK$finishOMIDSession$$inlined$inject$default$1 unityAdsSDK$finishOMIDSession$$inlined$inject$default$1 = new UnityAdsSDK$finishOMIDSession$$inlined$inject$default$1(this, HttpUrl.FRAGMENT_ENCODE_SET);
        g gVar = g.f6075z;
        if (!finishOMIDSession$lambda$18(a.c(gVar, unityAdsSDK$finishOMIDSession$$inlined$inject$default$1)).invoke()) {
            m1 c10 = f0.c();
            c10.K(y.f6101a);
            return c10;
        }
        f c11 = a.c(gVar, new UnityAdsSDK$finishOMIDSession$$inlined$inject$default$2(this, HttpUrl.FRAGMENT_ENCODE_SET));
        f c12 = a.c(gVar, new UnityAdsSDK$finishOMIDSession$$inlined$inject$default$3(this, HttpUrl.FRAGMENT_ENCODE_SET));
        c0 c0Var = (c0) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_OMID_SCOPE, x.a(c0.class));
        return f0.w(c0Var, null, new UnityAdsSDK$finishOMIDSession$2(opportunityId, c0Var, c11, c12, null), 3);
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return this.serviceProvider;
    }

    public final String getToken() {
        return (String) f0.B(le.i.f8353x, new UnityAdsSDK$getToken$1(this, null));
    }

    public final j1 initialize(String str, String source) {
        kotlin.jvm.internal.k.e(source, "source");
        synchronized (this) {
            j1 j1Var = this.initializationJob;
            if (j1Var != null && j1Var.isActive()) {
                return j1Var;
            }
            g gVar = g.f6075z;
            if (!initialize$lambda$4$lambda$0(a.c(gVar, new UnityAdsSDK$initialize$lambda$4$$inlined$inject$default$1(this, HttpUrl.FRAGMENT_ENCODE_SET))).invoke(str)) {
                return f0.c();
            }
            f c10 = a.c(gVar, new UnityAdsSDK$initialize$lambda$4$$inlined$inject$default$2(this, HttpUrl.FRAGMENT_ENCODE_SET));
            f c11 = a.c(gVar, new UnityAdsSDK$initialize$lambda$4$$inlined$inject$default$3(this, HttpUrl.FRAGMENT_ENCODE_SET));
            f c12 = a.c(gVar, new UnityAdsSDK$initialize$lambda$4$$inlined$inject$default$4(this, HttpUrl.FRAGMENT_ENCODE_SET));
            c0 c0Var = (c0) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_INIT_SCOPE, x.a(c0.class));
            a2 w10 = f0.w(c0Var, null, new UnityAdsSDK$initialize$1$newInitializationJob$1(source, str, c0Var, c10, c12, c11, null), 3);
            this.initializationJob = w10;
            return w10;
        }
    }

    public final j1 load(String str, UnityAdsLoadOptions loadOptions, IUnityAdsLoadListener iUnityAdsLoadListener, UnityBannerSize unityBannerSize) {
        kotlin.jvm.internal.k.e(loadOptions, "loadOptions");
        UnityAdsSDK$load$$inlined$inject$default$1 unityAdsSDK$load$$inlined$inject$default$1 = new UnityAdsSDK$load$$inlined$inject$default$1(this, HttpUrl.FRAGMENT_ENCODE_SET);
        g gVar = g.f6075z;
        initialize(load$lambda$5(a.c(gVar, unityAdsSDK$load$$inlined$inject$default$1)).invoke(), "load");
        c0 c0Var = (c0) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_LOAD_SCOPE, x.a(c0.class));
        return f0.w(c0Var, null, new UnityAdsSDK$load$1(this, str, loadOptions, iUnityAdsLoadListener, unityBannerSize, c0Var, a.c(gVar, new UnityAdsSDK$load$$inlined$inject$default$2(this, HttpUrl.FRAGMENT_ENCODE_SET)), null), 3);
    }

    public final void sendBannerDestroyed() {
        UnityAdsSDK$sendBannerDestroyed$$inlined$inject$default$1 unityAdsSDK$sendBannerDestroyed$$inlined$inject$default$1 = new UnityAdsSDK$sendBannerDestroyed$$inlined$inject$default$1(this, HttpUrl.FRAGMENT_ENCODE_SET);
        g gVar = g.f6075z;
        if (!sendBannerDestroyed$lambda$22(a.c(gVar, unityAdsSDK$sendBannerDestroyed$$inlined$inject$default$1)).invoke()) {
            return;
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendBannerDestroyed$lambda$23(a.c(gVar, new UnityAdsSDK$sendBannerDestroyed$$inlined$inject$default$2(this, HttpUrl.FRAGMENT_ENCODE_SET))), "native_banner_destroyed", null, null, null, null, null, 62, null);
    }

    public final j1 show(String str, UnityAdsShowOptions unityAdsShowOptions, Listeners listener) {
        kotlin.jvm.internal.k.e(listener, "listener");
        c0 c0Var = (c0) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_SHOW_SCOPE, x.a(c0.class));
        return f0.w(c0Var, null, new UnityAdsSDK$show$1((LegacyShowUseCase) getServiceProvider().getRegistry().getService(HttpUrl.FRAGMENT_ENCODE_SET, x.a(LegacyShowUseCase.class)), str, unityAdsShowOptions, listener, c0Var, null), 3);
    }

    public UnityAdsSDK(IServiceProvider serviceProvider) {
        kotlin.jvm.internal.k.e(serviceProvider, "serviceProvider");
        this.serviceProvider = serviceProvider;
    }

    public /* synthetic */ UnityAdsSDK(IServiceProvider iServiceProvider, int i6, kotlin.jvm.internal.f fVar) {
        this((i6 & 1) != 0 ? ServiceProvider.INSTANCE : iServiceProvider);
    }

    public final j1 getToken(IUnityAdsTokenListener iUnityAdsTokenListener) {
        return getToken(null, iUnityAdsTokenListener);
    }

    public final j1 getToken(TokenConfiguration tokenConfiguration, IUnityAdsTokenListener iUnityAdsTokenListener) {
        UnityAdsSDK$getToken$$inlined$inject$default$1 unityAdsSDK$getToken$$inlined$inject$default$1 = new UnityAdsSDK$getToken$$inlined$inject$default$1(this, HttpUrl.FRAGMENT_ENCODE_SET);
        g gVar = g.f6075z;
        initialize(getToken$lambda$7(a.c(gVar, unityAdsSDK$getToken$$inlined$inject$default$1)).invoke(), "get_token");
        f c10 = a.c(gVar, new UnityAdsSDK$getToken$$inlined$inject$default$2(this, HttpUrl.FRAGMENT_ENCODE_SET));
        f c11 = a.c(gVar, new UnityAdsSDK$getToken$$inlined$inject$default$3(this, HttpUrl.FRAGMENT_ENCODE_SET));
        c0 c0Var = (c0) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_GET_TOKEN_SCOPE, x.a(c0.class));
        return f0.w(c0Var, null, new UnityAdsSDK$getToken$2(tokenConfiguration, iUnityAdsTokenListener, c0Var, c11, c10, null), 3);
    }
}
