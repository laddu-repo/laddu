package com.unity3d.ads.adplayer;

import gf.c0;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {209, 210, 211, 212, 213, 215}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1 extends j implements p {
    final /* synthetic */ DisplayMessage $displayMessage;
    int label;
    final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1(DisplayMessage displayMessage, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, c cVar) {
        super(2, cVar);
        this.$displayMessage = displayMessage;
        this.this$0 = androidFullscreenWebViewAdPlayer;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1(this.$displayMessage, this.this$0, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r5.requestShow(r0, r4) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ba, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        if (r5.emit(r0, r4) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        if (r5.sendVisibilityChange(r0, r4) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:
    
        if (r5.sendFocusChange(r0, r4) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a8, code lost:
    
        if (r5.sendActivityDestroyed(r4) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b8, code lost:
    
        if (r5.destroy(r4) == r1) goto L36;
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
            switch(r0) {
                case 0: goto L12;
                case 1: goto Ld;
                case 2: goto Ld;
                case 3: goto Ld;
                case 4: goto Ld;
                case 5: goto Ld;
                case 6: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        Ld:
            he.a.f(r5)
            goto Lbb
        L12:
            he.a.f(r5)
            com.unity3d.ads.adplayer.DisplayMessage r5 = r4.$displayMessage
            boolean r0 = r5 instanceof com.unity3d.ads.adplayer.DisplayMessage.DisplayReady
            me.a r1 = me.a.f8833x
            if (r0 == 0) goto L36
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r5 = r4.this$0
            com.unity3d.ads.adplayer.WebViewAdPlayer r5 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.access$getWebViewAdPlayer$p(r5)
            com.unity3d.ads.adplayer.DisplayMessage r0 = r4.$displayMessage
            com.unity3d.ads.adplayer.DisplayMessage$DisplayReady r0 = (com.unity3d.ads.adplayer.DisplayMessage.DisplayReady) r0
            java.util.Map r0 = r0.getShowOptions()
            r2 = 1
            r4.label = r2
            java.lang.Object r5 = r5.requestShow(r0, r4)
            if (r5 != r1) goto Lbb
            goto Lba
        L36:
            boolean r0 = r5 instanceof com.unity3d.ads.adplayer.DisplayMessage.WebViewInstanceRequest
            if (r0 == 0) goto L5f
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$Companion r5 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.Companion
            kf.q0 r5 = r5.getDisplayMessages()
            com.unity3d.ads.adplayer.DisplayMessage$WebViewInstanceResponse r0 = new com.unity3d.ads.adplayer.DisplayMessage$WebViewInstanceResponse
            com.unity3d.ads.adplayer.DisplayMessage r2 = r4.$displayMessage
            java.lang.String r2 = r2.getOpportunityId()
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r3 = r4.this$0
            com.unity3d.ads.adplayer.AndroidWebViewContainer r3 = r3.getWebViewContainer()
            android.webkit.WebView r3 = r3.getWebView()
            r0.<init>(r2, r3)
            r2 = 2
            r4.label = r2
            java.lang.Object r5 = r5.emit(r0, r4)
            if (r5 != r1) goto Lbb
            goto Lba
        L5f:
            boolean r0 = r5 instanceof com.unity3d.ads.adplayer.DisplayMessage.VisibilityChanged
            if (r0 == 0) goto L7b
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r5 = r4.this$0
            com.unity3d.ads.adplayer.WebViewAdPlayer r5 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.access$getWebViewAdPlayer$p(r5)
            com.unity3d.ads.adplayer.DisplayMessage r0 = r4.$displayMessage
            com.unity3d.ads.adplayer.DisplayMessage$VisibilityChanged r0 = (com.unity3d.ads.adplayer.DisplayMessage.VisibilityChanged) r0
            boolean r0 = r0.isVisible()
            r2 = 3
            r4.label = r2
            java.lang.Object r5 = r5.sendVisibilityChange(r0, r4)
            if (r5 != r1) goto Lbb
            goto Lba
        L7b:
            boolean r0 = r5 instanceof com.unity3d.ads.adplayer.DisplayMessage.FocusChanged
            if (r0 == 0) goto L97
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r5 = r4.this$0
            com.unity3d.ads.adplayer.WebViewAdPlayer r5 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.access$getWebViewAdPlayer$p(r5)
            com.unity3d.ads.adplayer.DisplayMessage r0 = r4.$displayMessage
            com.unity3d.ads.adplayer.DisplayMessage$FocusChanged r0 = (com.unity3d.ads.adplayer.DisplayMessage.FocusChanged) r0
            boolean r0 = r0.isFocused()
            r2 = 4
            r4.label = r2
            java.lang.Object r5 = r5.sendFocusChange(r0, r4)
            if (r5 != r1) goto Lbb
            goto Lba
        L97:
            boolean r0 = r5 instanceof com.unity3d.ads.adplayer.DisplayMessage.DisplayDestroyed
            if (r0 == 0) goto Lab
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r5 = r4.this$0
            com.unity3d.ads.adplayer.WebViewAdPlayer r5 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.access$getWebViewAdPlayer$p(r5)
            r0 = 5
            r4.label = r0
            java.lang.Object r5 = r5.sendActivityDestroyed(r4)
            if (r5 != r1) goto Lbb
            goto Lba
        Lab:
            boolean r5 = r5 instanceof com.unity3d.ads.adplayer.DisplayMessage.DisplayError
            if (r5 == 0) goto Lbb
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r5 = r4.this$0
            r0 = 6
            r4.label = r0
            java.lang.Object r5 = r5.destroy(r4)
            if (r5 != r1) goto Lbb
        Lba:
            return r1
        Lbb:
            he.y r5 = he.y.f6101a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
