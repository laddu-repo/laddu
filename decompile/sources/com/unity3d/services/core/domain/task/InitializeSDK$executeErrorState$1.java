package com.unity3d.services.core.domain.task;

import he.k;
import me.a;
import ne.c;
import ne.e;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.services.core.domain.task.InitializeSDK", f = "InitializeSDK.kt", l = {120}, m = "executeErrorState-BWLJW6A")
/* loaded from: classes.dex */
public final class InitializeSDK$executeErrorState$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeSDK$executeErrorState$1(InitializeSDK initializeSDK, le.c cVar) {
        super(cVar);
        this.this$0 = initializeSDK;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        Object m75executeErrorStateBWLJW6A;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m75executeErrorStateBWLJW6A = this.this$0.m75executeErrorStateBWLJW6A(null, null, null, this);
        if (m75executeErrorStateBWLJW6A == a.f8833x) {
            return m75executeErrorStateBWLJW6A;
        }
        return new k(m75executeErrorStateBWLJW6A);
    }
}
