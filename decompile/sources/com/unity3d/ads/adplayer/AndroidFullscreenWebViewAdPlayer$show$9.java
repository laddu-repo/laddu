package com.unity3d.ads.adplayer;

import android.content.Context;
import android.content.Intent;
import gf.c0;
import gf.q;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$9", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {129}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidFullscreenWebViewAdPlayer$show$9 extends j implements p {
    final /* synthetic */ Intent $intent;
    final /* synthetic */ gf.p $listenerStarted;
    int label;
    final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFullscreenWebViewAdPlayer$show$9(gf.p pVar, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, Intent intent, c cVar) {
        super(2, cVar);
        this.$listenerStarted = pVar;
        this.this$0 = androidFullscreenWebViewAdPlayer;
        this.$intent = intent;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new AndroidFullscreenWebViewAdPlayer$show$9(this.$listenerStarted, this.this$0, this.$intent, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((AndroidFullscreenWebViewAdPlayer$show$9) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        Context context;
        int i6 = this.label;
        if (i6 != 0) {
            if (i6 == 1) {
                he.a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            he.a.f(obj);
            gf.p pVar = this.$listenerStarted;
            this.label = 1;
            Object p10 = ((q) pVar).p(this);
            me.a aVar = me.a.f8833x;
            if (p10 == aVar) {
                return aVar;
            }
        }
        context = this.this$0.context;
        context.startActivity(this.$intent);
        return y.f6101a;
    }
}
