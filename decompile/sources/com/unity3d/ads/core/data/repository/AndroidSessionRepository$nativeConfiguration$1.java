package com.unity3d.ads.core.data.repository;

import gf.c0;
import he.a;
import he.y;
import kf.h;
import kf.y0;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$nativeConfiguration$1", f = "AndroidSessionRepository.kt", l = {178}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidSessionRepository$nativeConfiguration$1 extends j implements p {
    int label;
    final /* synthetic */ AndroidSessionRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSessionRepository$nativeConfiguration$1(AndroidSessionRepository androidSessionRepository, c cVar) {
        super(2, cVar);
        this.this$0 = androidSessionRepository;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new AndroidSessionRepository$nativeConfiguration$1(this.this$0, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((AndroidSessionRepository$nativeConfiguration$1) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        h hVar;
        int i6 = this.label;
        if (i6 != 0) {
            if (i6 == 1) {
                a.f(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a.f(obj);
        hVar = this.this$0.persistedNativeConfiguration;
        this.label = 1;
        Object l10 = y0.l(hVar, this);
        me.a aVar = me.a.f8833x;
        if (l10 == aVar) {
            return aVar;
        }
        return l10;
    }
}
