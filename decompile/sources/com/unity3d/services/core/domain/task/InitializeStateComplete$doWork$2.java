package com.unity3d.services.core.domain.task;

import b1.g0;
import b1.h;
import com.unity3d.services.core.configuration.IModuleConfiguration;
import com.unity3d.services.core.domain.task.InitializeStateComplete;
import gf.c0;
import he.a;
import he.y;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.k;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.services.core.domain.task.InitializeStateComplete$doWork$2", f = "InitializeStateComplete.kt", l = {26}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class InitializeStateComplete$doWork$2 extends j implements p {
    final /* synthetic */ InitializeStateComplete.Params $params;
    int label;
    final /* synthetic */ InitializeStateComplete this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateComplete$doWork$2(InitializeStateComplete.Params params, InitializeStateComplete initializeStateComplete, c cVar) {
        super(2, cVar);
        this.$params = params;
        this.this$0 = initializeStateComplete;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new InitializeStateComplete$doWork$2(this.$params, this.this$0, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((InitializeStateComplete$doWork$2) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        Object b10;
        Throwable a10;
        h hVar;
        int i6 = this.label;
        try {
            if (i6 != 0) {
                if (i6 == 1) {
                    a.f(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a.f(obj);
                InitializeStateComplete.Params params = this.$params;
                InitializeStateComplete initializeStateComplete = this.this$0;
                Class[] moduleConfigurationList = params.getConfig().getModuleConfigurationList();
                k.d(moduleConfigurationList, "params.config.moduleConfigurationList");
                for (Class cls : moduleConfigurationList) {
                    IModuleConfiguration moduleConfiguration = params.getConfig().getModuleConfiguration(cls);
                    if (moduleConfiguration != null) {
                        moduleConfiguration.initCompleteState(params.getConfig());
                    }
                }
                hVar = initializeStateComplete.dataStore;
                InitializeStateComplete$doWork$2$1$1 initializeStateComplete$doWork$2$1$1 = new InitializeStateComplete$doWork$2$1$1(null);
                this.label = 1;
                Object i10 = ((g0) hVar).i(initializeStateComplete$doWork$2$1$1, this);
                me.a aVar = me.a.f8833x;
                if (i10 == aVar) {
                    return aVar;
                }
            }
            b10 = y.f6101a;
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th) {
            b10 = a.b(th);
        }
        if ((b10 instanceof he.j) && (a10 = he.k.a(b10)) != null) {
            b10 = a.b(a10);
        }
        return new he.k(b10);
    }
}
