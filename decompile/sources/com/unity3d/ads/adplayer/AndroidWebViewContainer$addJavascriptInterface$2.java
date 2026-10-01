package com.unity3d.ads.adplayer;

import android.webkit.JavascriptInterface;
import com.unity3d.ads.adplayer.model.WebViewBridgeInterface;
import gf.c0;
import he.y;
import kotlin.jvm.internal.k;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2", f = "AndroidWebViewContainer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidWebViewContainer$addJavascriptInterface$2 extends j implements p {
    final /* synthetic */ String $name;
    final /* synthetic */ WebViewBridge $webViewBridgeInterface;
    int label;
    final /* synthetic */ AndroidWebViewContainer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidWebViewContainer$addJavascriptInterface$2(AndroidWebViewContainer androidWebViewContainer, String str, WebViewBridge webViewBridge, c cVar) {
        super(2, cVar);
        this.this$0 = androidWebViewContainer;
        this.$name = str;
        this.$webViewBridgeInterface = webViewBridge;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new AndroidWebViewContainer$addJavascriptInterface$2(this.this$0, this.$name, this.$webViewBridgeInterface, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((AndroidWebViewContainer$addJavascriptInterface$2) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            he.a.f(obj);
            final WebViewBridge webViewBridge = this.$webViewBridgeInterface;
            this.this$0.getWebView().addJavascriptInterface(new WebViewBridgeInterface() { // from class: com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2$wrapper$1
                @Override // com.unity3d.ads.adplayer.model.WebViewBridgeInterface
                @JavascriptInterface
                public void handleCallback(String callbackId, String callbackStatus, String rawParameters) {
                    k.e(callbackId, "callbackId");
                    k.e(callbackStatus, "callbackStatus");
                    k.e(rawParameters, "rawParameters");
                    WebViewBridge.this.handleCallback(callbackId, callbackStatus, rawParameters);
                }

                @Override // com.unity3d.ads.adplayer.model.WebViewBridgeInterface
                @JavascriptInterface
                public void handleInvocation(String message) {
                    k.e(message, "message");
                    WebViewBridge.this.handleInvocation(message);
                }
            }, this.$name);
            return y.f6101a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
