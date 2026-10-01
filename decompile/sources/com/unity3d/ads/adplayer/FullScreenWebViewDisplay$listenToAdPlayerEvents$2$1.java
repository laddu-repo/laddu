package com.unity3d.ads.adplayer;

import androidx.lifecycle.a0;
import androidx.lifecycle.d1;
import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.services.core.domain.ISDKDispatchers;
import gf.c0;
import gf.f0;
import he.y;
import kf.i;
import kf.q0;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1", f = "FullScreenWebViewDisplay.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1 extends j implements p {
    final /* synthetic */ gf.j $continuation;
    int label;
    final /* synthetic */ FullScreenWebViewDisplay this$0;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    @e(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1", f = "FullScreenWebViewDisplay.kt", l = {94}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends j implements p {
        final /* synthetic */ gf.j $continuation;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ FullScreenWebViewDisplay this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FullScreenWebViewDisplay fullScreenWebViewDisplay, gf.j jVar, c cVar) {
            super(2, cVar);
            this.this$0 = fullScreenWebViewDisplay;
            this.$continuation = jVar;
        }

        @Override // ne.a
        public final c create(Object obj, c cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$continuation, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // ve.p
        public final Object invoke(c0 c0Var, c cVar) {
            return ((AnonymousClass1) create(c0Var, cVar)).invokeSuspend(y.f6101a);
        }

        @Override // ne.a
        public final Object invokeSuspend(Object obj) {
            c0 c0Var;
            String str;
            int i6 = this.label;
            if (i6 != 0) {
                if (i6 == 1) {
                    c0Var = (c0) this.L$0;
                    he.a.f(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                he.a.f(obj);
                c0Var = (c0) this.L$0;
                q0 displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                str = this.this$0.opportunityId;
                DisplayMessage.WebViewInstanceRequest webViewInstanceRequest = new DisplayMessage.WebViewInstanceRequest(str);
                this.L$0 = c0Var;
                this.label = 1;
                Object emit = displayMessages.emit(webViewInstanceRequest, this);
                me.a aVar = me.a.f8833x;
                if (emit == aVar) {
                    return aVar;
                }
            }
            f0.l(c0Var.getCoroutineContext());
            gf.j jVar = this.$continuation;
            y yVar = y.f6101a;
            jVar.resumeWith(yVar);
            return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1(FullScreenWebViewDisplay fullScreenWebViewDisplay, gf.j jVar, c cVar) {
        super(2, cVar);
        this.this$0 = fullScreenWebViewDisplay;
        this.$continuation = jVar;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1(this.this$0, this.$continuation, cVar);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        ISDKDispatchers dispatchers;
        if (this.label == 0) {
            he.a.f(obj);
            a0 e10 = d1.e(this.this$0);
            dispatchers = this.this$0.getDispatchers();
            f0.w(e10, dispatchers.getDefault(), new AnonymousClass1(this.this$0, this.$continuation, null), 2);
            return y.f6101a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // ve.p
    public final Object invoke(i iVar, c cVar) {
        return ((FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1) create(iVar, cVar)).invokeSuspend(y.f6101a);
    }
}
