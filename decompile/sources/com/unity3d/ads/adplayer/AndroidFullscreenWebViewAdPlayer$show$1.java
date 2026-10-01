package com.unity3d.ads.adplayer;

import gf.q;
import he.y;
import kf.i;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$1", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidFullscreenWebViewAdPlayer$show$1 extends j implements p {
    final /* synthetic */ gf.p $listenerStarted;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFullscreenWebViewAdPlayer$show$1(gf.p pVar, c cVar) {
        super(2, cVar);
        this.$listenerStarted = pVar;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new AndroidFullscreenWebViewAdPlayer$show$1(this.$listenerStarted, cVar);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            he.a.f(obj);
            q qVar = (q) this.$listenerStarted;
            y yVar = y.f6101a;
            qVar.K(yVar);
            return yVar;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // ve.p
    public final Object invoke(i iVar, c cVar) {
        return ((AndroidFullscreenWebViewAdPlayer$show$1) create(iVar, cVar)).invokeSuspend(y.f6101a);
    }
}
