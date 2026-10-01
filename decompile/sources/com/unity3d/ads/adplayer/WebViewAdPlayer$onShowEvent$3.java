package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.ShowStatus;
import com.unity3d.ads.core.data.model.ShowEvent;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.q;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$onShowEvent$3", f = "WebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class WebViewAdPlayer$onShowEvent$3 extends j implements q {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    public WebViewAdPlayer$onShowEvent$3(c cVar) {
        super(3, cVar);
    }

    public final Object invoke(ShowEvent showEvent, boolean z10, c cVar) {
        WebViewAdPlayer$onShowEvent$3 webViewAdPlayer$onShowEvent$3 = new WebViewAdPlayer$onShowEvent$3(cVar);
        webViewAdPlayer$onShowEvent$3.L$0 = showEvent;
        webViewAdPlayer$onShowEvent$3.Z$0 = z10;
        return webViewAdPlayer$onShowEvent$3.invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            he.a.f(obj);
            ShowEvent showEvent = (ShowEvent) this.L$0;
            if (this.Z$0) {
                return new ShowEvent.Completed(ShowStatus.COMPLETED, null, null, 6, null);
            }
            return showEvent;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // ve.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((ShowEvent) obj, ((Boolean) obj2).booleanValue(), (c) obj3);
    }
}
