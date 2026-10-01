package com.unity3d.services.core.webview;

import a2.e0;
import a2.e1;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.media.session.b;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import com.unity3d.services.core.configuration.Experiments;
import com.unity3d.services.core.configuration.IExperiments;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.misc.ViewUtilities;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker;
import com.unity3d.services.core.webview.bridge.IWebViewBridge;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import com.unity3d.services.core.webview.bridge.WebViewBridgeInterface;
import df.n;
import he.f;
import he.g;
import he.j;
import java.util.WeakHashMap;
import kotlin.jvm.internal.k;
import l0.c;
import okhttp3.HttpUrl;
import t0.h0;
import t0.q0;
import t0.t1;
import t0.w1;
import t5.h;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class WebView extends android.webkit.WebView implements IServiceComponent {
    private final f sdkMetricsSender$delegate;
    private final WebViewBridgeInterface webViewBridgeInterface;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(Context context) {
        this(context, false, null, null, null, 30, null);
        k.e(context, "context");
    }

    private final void applySafeAreaInsets() {
        e0 e0Var = new e0(this, 15);
        WeakHashMap weakHashMap = q0.f12397a;
        h0.l(this, e0Var);
    }

    public static final w1 applySafeAreaInsets$lambda$3(WebView this$0, View v10, w1 insets) {
        Object b10;
        k.e(this$0, "this$0");
        k.e(v10, "v");
        k.e(insets, "insets");
        t1 t1Var = insets.f12417a;
        c f3 = t1Var.f(519);
        k.d(f3, "insets.getInsets(WindowI…Compat.Type.systemBars())");
        c f10 = t1Var.f(128);
        k.d(f10, "insets.getInsets(WindowI…pat.Type.displayCutout())");
        try {
            b10 = Float.valueOf(this$0.getContext().getResources().getDisplayMetrics().density);
        } catch (Throwable th) {
            b10 = he.a.b(th);
        }
        Object valueOf = Float.valueOf(1.0f);
        if (b10 instanceof j) {
            b10 = valueOf;
        }
        float floatValue = ((Number) b10).floatValue();
        int applySafeAreaInsets$lambda$3$toPx = applySafeAreaInsets$lambda$3$toPx(Math.max(f3.f8062a, f10.f8062a), floatValue);
        int applySafeAreaInsets$lambda$3$toPx2 = applySafeAreaInsets$lambda$3$toPx(Math.max(f3.f8063b, f10.f8063b), floatValue);
        int applySafeAreaInsets$lambda$3$toPx3 = applySafeAreaInsets$lambda$3$toPx(Math.max(f3.f8064c, f10.f8064c), floatValue);
        int applySafeAreaInsets$lambda$3$toPx4 = applySafeAreaInsets$lambda$3$toPx(Math.max(f3.f8065d, f10.f8065d), floatValue);
        StringBuilder p10 = r4.a.p(applySafeAreaInsets$lambda$3$toPx, applySafeAreaInsets$lambda$3$toPx3, "\n                (function() {\n                    const root = document.documentElement;\n                    root.style.setProperty('--safe-area-inset-left', '", "px');\n                    root.style.setProperty('--safe-area-inset-right', '", "px');\n                    root.style.setProperty('--safe-area-inset-top', '");
        p10.append(applySafeAreaInsets$lambda$3$toPx2);
        p10.append("px');\n                    root.style.setProperty('--safe-area-inset-bottom', '");
        p10.append(applySafeAreaInsets$lambda$3$toPx4);
        p10.append("px');\n                })();\n            ");
        this$0.evaluateJavascript(n.s(p10.toString()), null);
        return insets;
    }

    private static final int applySafeAreaInsets$lambda$3$toPx(int i6, float f3) {
        return (int) (i6 / f3);
    }

    public static /* synthetic */ void b(WebView webView, String str, ValueCallback valueCallback) {
        evaluateJavascript$lambda$1(webView, str, valueCallback);
    }

    public static final void evaluateJavascript$lambda$1(WebView this$0, String script, ValueCallback valueCallback) {
        k.e(this$0, "this$0");
        k.e(script, "$script");
        super.evaluateJavascript(script, valueCallback);
    }

    private final SDKMetricsSender getSdkMetricsSender() {
        return (SDKMetricsSender) this.sdkMetricsSender$delegate.getValue();
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(String script, ValueCallback<String> valueCallback) {
        k.e(script, "script");
        Utilities.runOnUiThread(new e1(this, script, valueCallback, 4));
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String url) {
        k.e(url, "url");
        DeviceLog.debug("Loading url: ".concat(url));
        super.loadUrl(url);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(Context context, boolean z10) {
        this(context, z10, null, null, null, 28, null);
        k.e(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(Context context, boolean z10, IWebViewBridge webViewBridge) {
        this(context, z10, webViewBridge, null, null, 24, null);
        k.e(context, "context");
        k.e(webViewBridge, "webViewBridge");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(Context context, boolean z10, IWebViewBridge webViewBridge, IInvocationCallbackInvoker callbackInvoker) {
        this(context, z10, webViewBridge, callbackInvoker, null, 16, null);
        k.e(context, "context");
        k.e(webViewBridge, "webViewBridge");
        k.e(callbackInvoker, "callbackInvoker");
    }

    public /* synthetic */ WebView(Context context, boolean z10, IWebViewBridge iWebViewBridge, IInvocationCallbackInvoker iInvocationCallbackInvoker, IExperiments iExperiments, int i6, kotlin.jvm.internal.f fVar) {
        this(context, (i6 & 2) != 0 ? false : z10, (i6 & 4) != 0 ? SharedInstances.INSTANCE.getWebViewBridge() : iWebViewBridge, (i6 & 8) != 0 ? SharedInstances.INSTANCE.getWebViewAppInvocationCallbackInvoker() : iInvocationCallbackInvoker, (i6 & 16) != 0 ? new Experiments() : iExperiments);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebView(Context context, boolean z10, IWebViewBridge webViewBridge, IInvocationCallbackInvoker callbackInvoker, IExperiments experiments) {
        super(context);
        k.e(context, "context");
        k.e(webViewBridge, "webViewBridge");
        k.e(callbackInvoker, "callbackInvoker");
        k.e(experiments, "experiments");
        this.sdkMetricsSender$delegate = he.a.c(g.f6075z, new WebView$special$$inlined$inject$default$1(this, HttpUrl.FRAGMENT_ENCODE_SET));
        WebViewBridgeInterface webViewBridgeInterface = new WebViewBridgeInterface(webViewBridge, callbackInvoker);
        this.webViewBridgeInterface = webViewBridgeInterface;
        WebSettings settings = getSettings();
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setAllowUniversalAccessFromFileURLs(true);
        settings.setAllowFileAccess(true);
        settings.setBlockNetworkImage(false);
        settings.setBlockNetworkLoads(false);
        settings.setBuiltInZoomControls(false);
        settings.setCacheMode(2);
        settings.setDatabaseEnabled(false);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(false);
        settings.setEnableSmoothTransition(false);
        settings.setGeolocationEnabled(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setJavaScriptEnabled(true);
        settings.setLightTouchEnabled(false);
        settings.setLoadWithOverviewMode(false);
        settings.setLoadsImagesAutomatically(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setMixedContentMode(1);
        settings.setNeedInitialFocus(true);
        settings.setPluginState(WebSettings.PluginState.OFF);
        settings.setRenderPriority(WebSettings.RenderPriority.NORMAL);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(false);
        settings.setSupportZoom(false);
        settings.setUseWideViewPort(true);
        settings.setMediaPlaybackRequiresUserGesture(!z10);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setInitialScale(0);
        setBackgroundColor(0);
        ViewUtilities.setBackground(this, new ColorDrawable(0));
        setBackgroundResource(0);
        boolean isWebMessageEnabled = experiments.isWebMessageEnabled();
        if (isWebMessageEnabled) {
            getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerEnabledMetric());
        } else {
            getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerDisabledMetric());
        }
        boolean l10 = a8.g.l("WEB_MESSAGE_LISTENER");
        if (l10) {
            getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerSupportedMetric());
        } else {
            getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerUnsupportedMetric());
        }
        if (isWebMessageEnabled && l10) {
            h.a(this, "handleInvocation", b.r("*"), new a(webViewBridgeInterface, 0));
            h.a(this, "handleCallback", b.r("*"), new a(webViewBridgeInterface, 1));
        } else {
            addJavascriptInterface(webViewBridgeInterface, "webviewbridge");
        }
        applySafeAreaInsets();
    }
}
