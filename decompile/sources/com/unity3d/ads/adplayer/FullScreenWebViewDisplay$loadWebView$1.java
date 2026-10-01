package com.unity3d.ads.adplayer;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.services.core.domain.ISDKDispatchers;
import gf.c0;
import gf.f0;
import he.y;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kf.q0;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$loadWebView$1", f = "FullScreenWebViewDisplay.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FullScreenWebViewDisplay$loadWebView$1 extends j implements p {
    final /* synthetic */ WebView $webView;
    int label;
    final /* synthetic */ FullScreenWebViewDisplay this$0;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    @e(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$loadWebView$1$1", f = "FullScreenWebViewDisplay.kt", l = {155}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$loadWebView$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends j implements p {
        int label;
        final /* synthetic */ FullScreenWebViewDisplay this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FullScreenWebViewDisplay fullScreenWebViewDisplay, c cVar) {
            super(2, cVar);
            this.this$0 = fullScreenWebViewDisplay;
        }

        @Override // ne.a
        public final c create(Object obj, c cVar) {
            return new AnonymousClass1(this.this$0, cVar);
        }

        @Override // ve.p
        public final Object invoke(c0 c0Var, c cVar) {
            return ((AnonymousClass1) create(c0Var, cVar)).invokeSuspend(y.f6101a);
        }

        @Override // ne.a
        public final Object invokeSuspend(Object obj) {
            String str;
            Map map;
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
                map = this.this$0.showOptions;
                DisplayMessage.DisplayReady displayReady = new DisplayMessage.DisplayReady(str, map);
                this.label = 1;
                Object emit = displayMessages.emit(displayReady, this);
                me.a aVar = me.a.f8833x;
                if (emit == aVar) {
                    return aVar;
                }
            }
            return y.f6101a;
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    @e(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$loadWebView$1$2", f = "FullScreenWebViewDisplay.kt", l = {161}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$loadWebView$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends j implements p {
        int label;
        final /* synthetic */ FullScreenWebViewDisplay this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(FullScreenWebViewDisplay fullScreenWebViewDisplay, c cVar) {
            super(2, cVar);
            this.this$0 = fullScreenWebViewDisplay;
        }

        @Override // ne.a
        public final c create(Object obj, c cVar) {
            return new AnonymousClass2(this.this$0, cVar);
        }

        @Override // ve.p
        public final Object invoke(c0 c0Var, c cVar) {
            return ((AnonymousClass2) create(c0Var, cVar)).invokeSuspend(y.f6101a);
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
                DisplayMessage.DisplayError displayError = new DisplayMessage.DisplayError(str, "WebView failed to attach to FullScreenWebViewDisplay.");
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenWebViewDisplay$loadWebView$1(WebView webView, FullScreenWebViewDisplay fullScreenWebViewDisplay, c cVar) {
        super(2, cVar);
        this.$webView = webView;
        this.this$0 = fullScreenWebViewDisplay;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new FullScreenWebViewDisplay$loadWebView$1(this.$webView, this.this$0, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((FullScreenWebViewDisplay$loadWebView$1) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        ISDKDispatchers dispatchers;
        ViewGroup viewGroup;
        ISDKDispatchers dispatchers2;
        y yVar = y.f6101a;
        if (this.label == 0) {
            he.a.f(obj);
            try {
                ViewParent parent = this.$webView.getParent();
                if (parent instanceof ViewGroup) {
                    viewGroup = (ViewGroup) parent;
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    viewGroup.removeView(this.$webView);
                }
                this.this$0.setContentView(this.$webView);
                dispatchers2 = this.this$0.getDispatchers();
                f0.w(f0.b(dispatchers2.getDefault()), null, new AnonymousClass1(this.this$0, null), 3);
                return yVar;
            } catch (Throwable th) {
                if (!(th instanceof CancellationException)) {
                    dispatchers = this.this$0.getDispatchers();
                    f0.w(f0.b(dispatchers.getDefault()), null, new AnonymousClass2(this.this$0, null), 3);
                    this.this$0.setResult(0);
                    this.this$0.finish();
                    return yVar;
                }
                return yVar;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
