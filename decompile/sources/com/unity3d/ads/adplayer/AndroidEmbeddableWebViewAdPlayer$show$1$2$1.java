package com.unity3d.ads.adplayer;

import gf.c0;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$2$1", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {83}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidEmbeddableWebViewAdPlayer$show$1$2$1 extends j implements p {
    int label;
    final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidEmbeddableWebViewAdPlayer$show$1$2$1(AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, c cVar) {
        super(2, cVar);
        this.this$0 = androidEmbeddableWebViewAdPlayer;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new AndroidEmbeddableWebViewAdPlayer$show$1$2$1(this.this$0, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((AndroidEmbeddableWebViewAdPlayer$show$1$2$1) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        int i6 = this.label;
        if (i6 != 0) {
            if (i6 == 1) {
                he.a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            he.a.f(obj);
            AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer = this.this$0;
            this.label = 1;
            Object destroy = androidEmbeddableWebViewAdPlayer.destroy(this);
            me.a aVar = me.a.f8833x;
            if (destroy == aVar) {
                return aVar;
            }
        }
        return y.f6101a;
    }
}
