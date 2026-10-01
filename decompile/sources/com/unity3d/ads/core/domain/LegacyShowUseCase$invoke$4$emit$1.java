package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.ShowEvent;
import ne.c;
import ne.e;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4", f = "LegacyShowUseCase.kt", l = {207, 212, 221}, m = "emit")
/* loaded from: classes.dex */
public final class LegacyShowUseCase$invoke$4$emit$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LegacyShowUseCase$invoke$4<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LegacyShowUseCase$invoke$4$emit$1(LegacyShowUseCase$invoke$4<? super T> legacyShowUseCase$invoke$4, le.c cVar) {
        super(cVar);
        this.this$0 = legacyShowUseCase$invoke$4;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((ShowEvent) null, (le.c) this);
    }
}
