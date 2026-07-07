package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.DisplayMessage;
import gf.c0;
import he.y;
import kf.q0;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3$2$1", f = "FullScreenWebViewDisplay.kt", l = {111}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3$2$1 extends j implements p {
    final /* synthetic */ Throwable $it;
    int label;
    final /* synthetic */ FullScreenWebViewDisplay this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3$2$1(FullScreenWebViewDisplay fullScreenWebViewDisplay, Throwable th, c cVar) {
        super(2, cVar);
        this.this$0 = fullScreenWebViewDisplay;
        this.$it = th;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3$2$1(this.this$0, this.$it, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3$2$1) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        String str;
        int i6 = this.label;
        if (i6 != 0) {
            if (i6 == 1) {
                he.a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            he.a.f(obj);
            q0 displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
            str = this.this$0.opportunityId;
            String message = this.$it.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            DisplayMessage.DisplayError displayError = new DisplayMessage.DisplayError(str, message);
            this.label = 1;
            Object emit = displayMessages.emit(displayError, this);
            me.a aVar = me.a.f8833x;
            if (emit == aVar) {
                return aVar;
            }
        }
        return y.f6101a;
    }
}
