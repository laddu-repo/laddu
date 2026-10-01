package com.unity3d.services.core.domain.task;

import gf.c0;
import gf.k;
import he.a;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$2$1$success$1", f = "InitializeStateNetworkError.kt", l = {82}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class InitializeStateNetworkError$doWork$2$1$success$1 extends j implements p {
    Object L$0;
    int label;
    final /* synthetic */ InitializeStateNetworkError this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateNetworkError$doWork$2$1$success$1(InitializeStateNetworkError initializeStateNetworkError, c cVar) {
        super(2, cVar);
        this.this$0 = initializeStateNetworkError;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new InitializeStateNetworkError$doWork$2$1$success$1(this.this$0, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((InitializeStateNetworkError$doWork$2$1$success$1) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        int i6 = this.label;
        if (i6 != 0) {
            if (i6 == 1) {
                a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a.f(obj);
            InitializeStateNetworkError initializeStateNetworkError = this.this$0;
            this.L$0 = initializeStateNetworkError;
            this.label = 1;
            k kVar = new k(1, a8.c.i(this));
            kVar.s();
            initializeStateNetworkError.startListening(kVar);
            Object r10 = kVar.r();
            me.a aVar = me.a.f8833x;
            if (r10 == aVar) {
                return aVar;
            }
        }
        return y.f6101a;
    }
}
