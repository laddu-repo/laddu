package com.unity3d.ads.adplayer;

import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.adplayer.Invocation$handle$2", f = "Invocation.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class Invocation$handle$2 extends j implements l {
    int label;

    public Invocation$handle$2(c cVar) {
        super(1, cVar);
    }

    @Override // ne.a
    public final c create(c cVar) {
        return new Invocation$handle$2(cVar);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            he.a.f(obj);
            return y.f6101a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // ve.l
    public final Object invoke(c cVar) {
        return ((Invocation$handle$2) create(cVar)).invokeSuspend(y.f6101a);
    }
}
