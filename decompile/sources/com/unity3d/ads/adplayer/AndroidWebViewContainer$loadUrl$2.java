package com.unity3d.ads.adplayer;

import gf.c0;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$2", f = "AndroidWebViewContainer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidWebViewContainer$loadUrl$2 extends j implements p {
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ AndroidWebViewContainer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidWebViewContainer$loadUrl$2(AndroidWebViewContainer androidWebViewContainer, String str, c cVar) {
        super(2, cVar);
        this.this$0 = androidWebViewContainer;
        this.$url = str;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new AndroidWebViewContainer$loadUrl$2(this.this$0, this.$url, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((AndroidWebViewContainer$loadUrl$2) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            he.a.f(obj);
            this.this$0.getWebView().loadUrl(this.$url);
            return y.f6101a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
