package com.unity3d.ads.adplayer;

import androidx.lifecycle.a0;
import androidx.lifecycle.d1;
import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.services.core.domain.ISDKDispatchers;
import gf.f0;
import he.k;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3", f = "FullScreenWebViewDisplay.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3 extends j implements p {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FullScreenWebViewDisplay this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3(FullScreenWebViewDisplay fullScreenWebViewDisplay, c cVar) {
        super(2, cVar);
        this.this$0 = fullScreenWebViewDisplay;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3 fullScreenWebViewDisplay$listenToAdPlayerEvents$2$3 = new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3(this.this$0, cVar);
        fullScreenWebViewDisplay$listenToAdPlayerEvents$2$3.L$0 = obj;
        return fullScreenWebViewDisplay$listenToAdPlayerEvents$2$3;
    }

    @Override // ve.p
    public final Object invoke(DisplayMessage displayMessage, c cVar) {
        return ((FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3) create(displayMessage, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        Object b10;
        ISDKDispatchers dispatchers;
        y yVar = y.f6101a;
        if (this.label == 0) {
            he.a.f(obj);
            DisplayMessage displayMessage = (DisplayMessage) this.L$0;
            FullScreenWebViewDisplay fullScreenWebViewDisplay = this.this$0;
            try {
                if (displayMessage instanceof DisplayMessage.DisplayFinishRequest) {
                    fullScreenWebViewDisplay.finish();
                } else if (displayMessage instanceof DisplayMessage.WebViewInstanceResponse) {
                    fullScreenWebViewDisplay.loadWebView(((DisplayMessage.WebViewInstanceResponse) displayMessage).getWebView());
                } else if (displayMessage instanceof DisplayMessage.SetOrientation) {
                    fullScreenWebViewDisplay.setRequestedOrientation(((DisplayMessage.SetOrientation) displayMessage).getOrientation());
                } else if (displayMessage instanceof DisplayMessage.OpenUrl) {
                    fullScreenWebViewDisplay.openUrl(displayMessage.getOpportunityId(), ((DisplayMessage.OpenUrl) displayMessage).getIntent(), ((DisplayMessage.OpenUrl) displayMessage).getUseActivityForResult());
                }
                b10 = yVar;
            } catch (Throwable th) {
                b10 = he.a.b(th);
            }
            FullScreenWebViewDisplay fullScreenWebViewDisplay2 = this.this$0;
            Throwable a10 = k.a(b10);
            if (a10 != null) {
                a0 e10 = d1.e(fullScreenWebViewDisplay2);
                dispatchers = fullScreenWebViewDisplay2.getDispatchers();
                f0.w(e10, dispatchers.getDefault(), new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3$2$1(fullScreenWebViewDisplay2, a10, null), 2);
            }
            return yVar;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
