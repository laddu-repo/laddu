package com.unity3d.services.core.domain.task;

import he.k;
import me.a;
import ne.c;
import ne.e;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.services.core.domain.task.InitializeStateReset", f = "InitializeStateReset.kt", l = {33}, m = "doWork-gIAlu-s$suspendImpl")
/* loaded from: classes.dex */
public final class InitializeStateReset$doWork$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateReset this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateReset$doWork$1(InitializeStateReset initializeStateReset, le.c cVar) {
        super(cVar);
        this.this$0 = initializeStateReset;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m86doWorkgIAlus$suspendImpl = InitializeStateReset.m86doWorkgIAlus$suspendImpl(this.this$0, null, this);
        if (m86doWorkgIAlus$suspendImpl == a.f8833x) {
            return m86doWorkgIAlus$suspendImpl;
        }
        return new k(m86doWorkgIAlus$suspendImpl);
    }
}
