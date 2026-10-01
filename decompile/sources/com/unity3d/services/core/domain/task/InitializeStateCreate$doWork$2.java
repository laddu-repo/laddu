package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.domain.task.InitializeStateCreate;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.webview.WebViewApp;
import gf.c0;
import he.a;
import he.k;
import he.y;
import java.util.concurrent.CancellationException;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.services.core.domain.task.InitializeStateCreate$doWork$2", f = "InitializeStateCreate.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class InitializeStateCreate$doWork$2 extends j implements p {
    final /* synthetic */ InitializeStateCreate.Params $params;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateCreate$doWork$2(InitializeStateCreate.Params params, c cVar) {
        super(2, cVar);
        this.$params = params;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new InitializeStateCreate$doWork$2(this.$params, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((InitializeStateCreate$doWork$2) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        if (this.label == 0) {
            a.f(obj);
            InitializeStateCreate.Params params = this.$params;
            try {
                DeviceLog.debug("Unity Ads init: creating webapp");
                Configuration config = params.getConfig();
                config.setWebViewData(params.getWebViewData());
                try {
                    ErrorState create = WebViewApp.create(config, false);
                    obj2 = config;
                    if (create != null) {
                        String str = "Unity Ads WebApp creation failed";
                        if (WebViewApp.getCurrentApp().getWebAppFailureMessage() != null) {
                            str = WebViewApp.getCurrentApp().getWebAppFailureMessage();
                        }
                        DeviceLog.error(str);
                        throw new InitializationException(create, new Exception(str), config);
                    }
                } catch (IllegalThreadStateException e10) {
                    DeviceLog.exception("Illegal Thread", e10);
                    throw new InitializationException(ErrorState.CreateWebApp, e10, config);
                }
            } catch (CancellationException e11) {
                throw e11;
            } catch (Throwable th) {
                obj2 = a.b(th);
            }
            boolean z10 = obj2 instanceof he.j;
            Object obj3 = obj2;
            if (z10) {
                Throwable a10 = k.a(obj2);
                obj3 = obj2;
                if (a10 != null) {
                    obj3 = a.b(a10);
                }
            }
            return new k(obj3);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
