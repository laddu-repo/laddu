package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.IModuleConfiguration;
import com.unity3d.services.core.domain.task.InitializeStateError;
import com.unity3d.services.core.log.DeviceLog;
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
@e(c = "com.unity3d.services.core.domain.task.InitializeStateError$doWork$2", f = "InitializeStateError.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class InitializeStateError$doWork$2 extends j implements p {
    final /* synthetic */ InitializeStateError.Params $params;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateError$doWork$2(InitializeStateError.Params params, c cVar) {
        super(2, cVar);
        this.$params = params;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new InitializeStateError$doWork$2(this.$params, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((InitializeStateError$doWork$2) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        Object b10;
        Throwable a10;
        if (this.label == 0) {
            a.f(obj);
            InitializeStateError.Params params = this.$params;
            try {
                DeviceLog.error("Unity Ads init: halting init in " + params.getErrorState().getMetricName() + ": " + params.getException().getMessage());
                Class[] moduleConfigurationList = params.getConfig().getModuleConfigurationList();
                if (moduleConfigurationList == null) {
                    moduleConfigurationList = new Class[0];
                }
                for (Class cls : moduleConfigurationList) {
                    IModuleConfiguration moduleConfiguration = params.getConfig().getModuleConfiguration(cls);
                    if (moduleConfiguration != null) {
                        moduleConfiguration.initErrorState(params.getConfig(), params.getErrorState(), params.getException().getMessage());
                    }
                }
                b10 = y.f6101a;
            } catch (CancellationException e10) {
                throw e10;
            } catch (Throwable th) {
                b10 = a.b(th);
            }
            if ((b10 instanceof he.j) && (a10 = k.a(b10)) != null) {
                b10 = a.b(a10);
            }
            return new k(b10);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
