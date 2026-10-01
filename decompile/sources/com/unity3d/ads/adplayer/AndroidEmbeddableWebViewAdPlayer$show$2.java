package com.unity3d.ads.adplayer;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.core.misc.ViewUtilities;
import gf.c0;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$2", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidEmbeddableWebViewAdPlayer$show$2 extends j implements p {
    final /* synthetic */ BannerView $bannerView;
    int label;
    final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidEmbeddableWebViewAdPlayer$show$2(AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, BannerView bannerView, c cVar) {
        super(2, cVar);
        this.this$0 = androidEmbeddableWebViewAdPlayer;
        this.$bannerView = bannerView;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new AndroidEmbeddableWebViewAdPlayer$show$2(this.this$0, this.$bannerView, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((AndroidEmbeddableWebViewAdPlayer$show$2) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        Context context;
        Context context2;
        if (this.label == 0) {
            he.a.f(obj);
            WebView webView = this.this$0.getWebViewContainer().getWebView();
            context = this.this$0.context;
            int pxFromDp = (int) ViewUtilities.pxFromDp(context, this.$bannerView.getSize().getWidth());
            context2 = this.this$0.context;
            webView.setLayoutParams(new ViewGroup.LayoutParams(pxFromDp, (int) ViewUtilities.pxFromDp(context2, this.$bannerView.getSize().getHeight())));
            return y.f6101a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
