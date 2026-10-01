package androidx.webkit;

import a8.g;
import android.app.PendingIntent;
import android.os.Build;
import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import dg.b;
import e9.a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewClientBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import t5.f;
import u5.d;
import u5.j;
import u5.p;
import u5.r;
import u5.s;
import u5.u;
import u5.v;
import u5.y;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class WebViewClientCompat extends WebViewClient implements WebViewClientBoundaryInterface {
    private static final String[] sSupportedFeatures = {"VISUAL_STATE_CALLBACK", "RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_HTTP_ERROR", "SHOULD_OVERRIDE_WITH_REDIRECTS", "SAFE_BROWSING_HIT"};

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return sSupportedFeatures;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [u5.s, java.lang.Object, t5.f] */
    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, InvocationHandler invocationHandler) {
        ?? obj = new Object();
        obj.f12918b = (WebResourceErrorBoundaryInterface) b.d(WebResourceErrorBoundaryInterface.class, invocationHandler);
        onReceivedError(webView, webResourceRequest, (f) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [t5.b, u5.p, java.lang.Object] */
    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i6, InvocationHandler invocationHandler) {
        ?? obj = new Object();
        obj.f12913b = (SafeBrowsingResponseBoundaryInterface) b.d(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
        onSafeBrowsingHit(webView, webResourceRequest, i6, (t5.b) obj);
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public boolean onWebAuthnIntent(WebView webView, PendingIntent pendingIntent, InvocationHandler invocationHandler) {
        return false;
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, d.a(webResourceRequest).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [u5.s, java.lang.Object, t5.f] */
    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        ?? obj = new Object();
        obj.f12917a = webResourceError;
        onReceivedError(webView, webResourceRequest, (f) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [t5.b, u5.p, java.lang.Object] */
    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i6, SafeBrowsingResponse safeBrowsingResponse) {
        ?? obj = new Object();
        obj.f12912a = safeBrowsingResponse;
        onSafeBrowsingHit(webView, webResourceRequest, i6, (t5.b) obj);
    }

    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i6, t5.b bVar) {
        if (g.l("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL")) {
            p pVar = (p) bVar;
            pVar.getClass();
            u5.b bVar2 = u.f12922c;
            if (bVar2.a()) {
                if (pVar.f12912a == null) {
                    r rVar = v.f12925a;
                    pVar.f12912a = a.b(((WebkitToCompatConverterBoundaryInterface) rVar.f12916y).convertSafeBrowsingResponse(Proxy.getInvocationHandler(pVar.f12913b)));
                }
                j.e(pVar.f12912a, true);
                return;
            }
            if (bVar2.b()) {
                if (pVar.f12913b == null) {
                    r rVar2 = v.f12925a;
                    pVar.f12913b = (SafeBrowsingResponseBoundaryInterface) b.d(SafeBrowsingResponseBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) rVar2.f12916y).convertSafeBrowsingResponse(pVar.f12912a));
                }
                pVar.f12913b.showInterstitial(true);
                return;
            }
            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
        }
        u5.b bVar3 = u.f12920a;
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, f fVar) {
        int errorCode;
        CharSequence description;
        if (g.l("WEB_RESOURCE_ERROR_GET_CODE") && g.l("WEB_RESOURCE_ERROR_GET_DESCRIPTION") && d.b(webResourceRequest)) {
            s sVar = (s) fVar;
            sVar.getClass();
            u5.b bVar = u.f12921b;
            if (bVar.a()) {
                if (sVar.f12917a == null) {
                    r rVar = v.f12925a;
                    sVar.f12917a = y.f(((WebkitToCompatConverterBoundaryInterface) rVar.f12916y).convertWebResourceError(Proxy.getInvocationHandler(sVar.f12918b)));
                }
                errorCode = u5.g.f(sVar.f12917a);
            } else if (bVar.b()) {
                if (sVar.f12918b == null) {
                    r rVar2 = v.f12925a;
                    sVar.f12918b = (WebResourceErrorBoundaryInterface) b.d(WebResourceErrorBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) rVar2.f12916y).convertWebResourceError(sVar.f12917a));
                }
                errorCode = sVar.f12918b.getErrorCode();
            } else {
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            }
            u5.b bVar2 = u.f12920a;
            if (bVar2.a()) {
                if (sVar.f12917a == null) {
                    r rVar3 = v.f12925a;
                    sVar.f12917a = y.f(((WebkitToCompatConverterBoundaryInterface) rVar3.f12916y).convertWebResourceError(Proxy.getInvocationHandler(sVar.f12918b)));
                }
                description = u5.g.e(sVar.f12917a);
            } else if (bVar2.b()) {
                if (sVar.f12918b == null) {
                    r rVar4 = v.f12925a;
                    sVar.f12918b = (WebResourceErrorBoundaryInterface) b.d(WebResourceErrorBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) rVar4.f12916y).convertWebResourceError(sVar.f12917a));
                }
                description = sVar.f12918b.getDescription();
            } else {
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            }
            onReceivedError(webView, errorCode, description.toString(), d.a(webResourceRequest).toString());
        }
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onPageCommitVisible(WebView webView, String str) {
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }
}
