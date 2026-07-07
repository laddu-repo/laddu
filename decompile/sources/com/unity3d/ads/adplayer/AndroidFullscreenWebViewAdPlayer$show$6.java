package com.unity3d.ads.adplayer;

import com.unity3d.ads.core.data.model.ShowEvent;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$6", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {101}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidFullscreenWebViewAdPlayer$show$6 extends j implements p {
    int label;
    final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFullscreenWebViewAdPlayer$show$6(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, c cVar) {
        super(2, cVar);
        this.this$0 = androidFullscreenWebViewAdPlayer;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new AndroidFullscreenWebViewAdPlayer$show$6(this.this$0, cVar);
    }

    @Override // ve.p
    public final Object invoke(ShowEvent showEvent, c cVar) {
        return ((AndroidFullscreenWebViewAdPlayer$show$6) create(showEvent, cVar)).invokeSuspend(y.f6101a);
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
            AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer = this.this$0;
            this.label = 1;
            Object destroy = androidFullscreenWebViewAdPlayer.destroy(this);
            me.a aVar = me.a.f8833x;
            if (destroy == aVar) {
                return aVar;
            }
        }
        return y.f6101a;
    }
}
