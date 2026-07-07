package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.domain.task.InitializeStateLoadCache;
import he.k;
import me.a;
import ne.c;
import ne.e;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.services.core.domain.task.InitializeStateLoadCache", f = "InitializeStateLoadCache.kt", l = {32}, m = "doWork-gIAlu-s")
/* loaded from: classes.dex */
public final class InitializeStateLoadCache$doWork$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateLoadCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateLoadCache$doWork$1(InitializeStateLoadCache initializeStateLoadCache, le.c cVar) {
        super(cVar);
        this.this$0 = initializeStateLoadCache;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object mo70doWorkgIAlus = this.this$0.mo70doWorkgIAlus((InitializeStateLoadCache.Params) null, (le.c) this);
        if (mo70doWorkgIAlus == a.f8833x) {
            return mo70doWorkgIAlus;
        }
        return new k(mo70doWorkgIAlus);
    }
}
