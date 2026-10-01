package com.unity3d.ads.adplayer;

import gf.c0;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$3$1", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {97, 98}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidEmbeddableWebViewAdPlayer$show$3$1 extends j implements p {
    final /* synthetic */ ShowOptions $showOptions;
    int label;
    final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidEmbeddableWebViewAdPlayer$show$3$1(AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, ShowOptions showOptions, c cVar) {
        super(2, cVar);
        this.this$0 = androidEmbeddableWebViewAdPlayer;
        this.$showOptions = showOptions;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new AndroidEmbeddableWebViewAdPlayer$show$3$1(this.this$0, this.$showOptions, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((AndroidEmbeddableWebViewAdPlayer$show$3$1) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (r5.collect(r0, r4) == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r5.requestShow(r0, r4) == r3) goto L15;
     */
    @Override // ne.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.label
            r1 = 2
            r2 = 1
            me.a r3 = me.a.f8833x
            if (r0 == 0) goto L1c
            if (r0 == r2) goto L18
            if (r0 == r1) goto L14
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L14:
            he.a.f(r5)
            goto L50
        L18:
            he.a.f(r5)
            goto L36
        L1c:
            he.a.f(r5)
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer r5 = r4.this$0
            com.unity3d.ads.adplayer.WebViewAdPlayer r5 = com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.access$getWebViewAdPlayer$p(r5)
            com.unity3d.ads.adplayer.ShowOptions r0 = r4.$showOptions
            com.unity3d.ads.adplayer.AndroidShowOptions r0 = (com.unity3d.ads.adplayer.AndroidShowOptions) r0
            java.util.Map r0 = r0.getUnityAdsShowOptions()
            r4.label = r2
            java.lang.Object r5 = r5.requestShow(r0, r4)
            if (r5 != r3) goto L36
            goto L4f
        L36:
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer r5 = r4.this$0
            com.unity3d.ads.core.data.datasource.LifecycleDataSource r5 = com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.access$getLifecycleDataSource$p(r5)
            kf.d1 r5 = r5.getAppActive()
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$3$1$1 r0 = new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$3$1$1
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer r2 = r4.this$0
            r0.<init>()
            r4.label = r1
            java.lang.Object r5 = r5.collect(r0, r4)
            if (r5 != r3) goto L50
        L4f:
            return r3
        L50:
            a2.x0 r5 = new a2.x0
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
