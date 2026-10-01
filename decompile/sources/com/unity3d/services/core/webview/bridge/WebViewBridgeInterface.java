package com.unity3d.services.core.webview.bridge;

import android.net.Uri;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.unity3d.ads.core.extensions.JSONArrayExtensionsKt;
import com.unity3d.services.core.log.DeviceLog;
import df.m;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import org.json.JSONArray;
import org.json.JSONObject;
import t5.a;
import t5.d;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class WebViewBridgeInterface {
    private final IInvocationCallbackInvoker webViewAppInvocationCallbackInvoker;
    private final IWebViewBridge webViewBridge;

    public WebViewBridgeInterface() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @JavascriptInterface
    public final void handleCallback(String callbackId, String callbackStatus, String rawParameters) {
        k.e(callbackId, "callbackId");
        k.e(callbackStatus, "callbackStatus");
        k.e(rawParameters, "rawParameters");
        DeviceLog.debug("handleCallback " + callbackId + ' ' + callbackStatus + ' ' + rawParameters);
        this.webViewBridge.handleCallback(callbackId, callbackStatus, JSONArrayExtensionsKt.toTypedArray(new JSONArray(rawParameters)));
    }

    @JavascriptInterface
    public final void handleInvocation(String data) {
        k.e(data, "data");
        DeviceLog.debug("handleInvocation ".concat(data));
        JSONArray jSONArray = new JSONArray(data);
        Invocation invocation = new Invocation(this.webViewAppInvocationCallbackInvoker, this.webViewBridge);
        int length = jSONArray.length();
        for (int i6 = 0; i6 < length; i6++) {
            Object obj = jSONArray.get(i6);
            k.c(obj, "null cannot be cast to non-null type org.json.JSONArray");
            JSONArray jSONArray2 = (JSONArray) obj;
            Object obj2 = jSONArray2.get(0);
            k.c(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = jSONArray2.get(1);
            k.c(obj3, "null cannot be cast to non-null type kotlin.String");
            Object obj4 = jSONArray2.get(2);
            k.c(obj4, "null cannot be cast to non-null type org.json.JSONArray");
            Object obj5 = jSONArray2.get(3);
            k.c(obj5, "null cannot be cast to non-null type kotlin.String");
            invocation.addInvocation((String) obj2, (String) obj3, JSONArrayExtensionsKt.toTypedArray((JSONArray) obj4), new WebViewCallback((String) obj5, invocation.getId()));
            invocation.nextInvocation();
        }
        invocation.sendInvocationCallback();
    }

    public final void onHandleCallback(WebView view, d message, Uri sourceOrigin, boolean z10, a replyProxy) {
        k.e(view, "view");
        k.e(message, "message");
        k.e(sourceOrigin, "sourceOrigin");
        k.e(replyProxy, "replyProxy");
        String str = message.f12610b;
        if (z10 && str != null && !m.S(str)) {
            JSONObject jSONObject = new JSONObject(str);
            String callbackId = jSONObject.getString("id");
            String callbackStatus = jSONObject.getString("status");
            String rawParameters = jSONObject.getString("parameters");
            k.d(callbackId, "callbackId");
            k.d(callbackStatus, "callbackStatus");
            k.d(rawParameters, "rawParameters");
            handleCallback(callbackId, callbackStatus, rawParameters);
        }
    }

    public final void onHandleInvocation(WebView view, d message, Uri sourceOrigin, boolean z10, a replyProxy) {
        k.e(view, "view");
        k.e(message, "message");
        k.e(sourceOrigin, "sourceOrigin");
        k.e(replyProxy, "replyProxy");
        String str = message.f12610b;
        if (z10 && str != null && !m.S(str)) {
            handleInvocation(str);
        }
    }

    public WebViewBridgeInterface(IWebViewBridge webViewBridge, IInvocationCallbackInvoker webViewAppInvocationCallbackInvoker) {
        k.e(webViewBridge, "webViewBridge");
        k.e(webViewAppInvocationCallbackInvoker, "webViewAppInvocationCallbackInvoker");
        this.webViewBridge = webViewBridge;
        this.webViewAppInvocationCallbackInvoker = webViewAppInvocationCallbackInvoker;
    }

    public /* synthetic */ WebViewBridgeInterface(IWebViewBridge iWebViewBridge, IInvocationCallbackInvoker iInvocationCallbackInvoker, int i6, f fVar) {
        this((i6 & 1) != 0 ? SharedInstances.INSTANCE.getWebViewBridge() : iWebViewBridge, (i6 & 2) != 0 ? SharedInstances.INSTANCE.getWebViewAppInvocationCallbackInvoker() : iInvocationCallbackInvoker);
    }
}
