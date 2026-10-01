package com.unity3d.ads.adplayer;

import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.webkit.WebViewClientCompat;
import com.unity3d.ads.adplayer.model.ErrorReason;
import com.unity3d.ads.adplayer.model.WebViewClientError;
import com.unity3d.ads.core.domain.GetCachedAsset;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ViewExtensionsKt;
import df.m;
import gf.f0;
import gf.i0;
import gf.p;
import gf.q;
import gf.t1;
import he.i;
import ie.j;
import ie.r;
import ie.s;
import ie.w;
import java.util.List;
import java.util.Map;
import kf.d1;
import kf.f1;
import kf.r0;
import kf.t0;
import kf.y0;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidWebViewClient extends WebViewClientCompat {
    public static final String BLANK_PAGE = "about:blank";
    public static final Companion Companion = new Companion(null);
    private final r0 _isRenderProcessGone;
    private final p _onLoadFinished;
    private final GetCachedAsset getCachedAsset;
    private final d1 isRenderProcessGone;
    private final r0 loadErrors;
    private final i0 onLoadFinished;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final r0 webviewType;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private Companion() {
        }
    }

    public AndroidWebViewClient(GetCachedAsset getCachedAsset, SendDiagnosticEvent sendDiagnosticEvent) {
        k.e(getCachedAsset, "getCachedAsset");
        k.e(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.getCachedAsset = getCachedAsset;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.loadErrors = y0.c(r.f6846x);
        q a10 = f0.a();
        this._onLoadFinished = a10;
        this.onLoadFinished = a10;
        f1 c10 = y0.c(Boolean.FALSE);
        this._isRenderProcessGone = c10;
        this.isRenderProcessGone = new t0(c10);
        this.webviewType = y0.c(HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public final i0 getOnLoadFinished() {
        return this.onLoadFinished;
    }

    public final d1 isRenderProcessGone() {
        return this.isRenderProcessGone;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        String str;
        k.e(view, "view");
        k.e(url, "url");
        if (url.equals(BLANK_PAGE)) {
            r0 r0Var = this.loadErrors;
            while (true) {
                f1 f1Var = (f1) r0Var;
                Object value = f1Var.getValue();
                str = url;
                if (f1Var.f(value, j.Q((List) value, new WebViewClientError(str, ErrorReason.REASON_WEB_BLANK, null, 4, null)))) {
                    break;
                } else {
                    url = str;
                }
            }
        } else {
            str = url;
        }
        super.onPageFinished(view, str);
        ((q) this._onLoadFinished).K(((f1) this.loadErrors).getValue());
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        f1 f1Var;
        Object value;
        k.e(view, "view");
        k.e(detail, "detail");
        ViewExtensionsKt.removeViewFromParent(view);
        view.destroy();
        if (((t1) this._onLoadFinished).E() instanceof gf.d1) {
            r0 r0Var = this.loadErrors;
            do {
                f1Var = (f1) r0Var;
                value = f1Var.getValue();
            } while (!f1Var.f(value, j.Q((List) value, new WebViewClientError(String.valueOf(view.getUrl()), ErrorReason.REASON_WEBVIEW_RENDER_PROCESS_GONE, null, 4, null))));
            ((q) this._onLoadFinished).K(((f1) this.loadErrors).getValue());
            return true;
        }
        r0 r0Var2 = this._isRenderProcessGone;
        Boolean bool = Boolean.TRUE;
        f1 f1Var2 = (f1) r0Var2;
        f1Var2.getClass();
        f1Var2.h(null, bool);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        Map map;
        Object b10;
        k.e(view, "view");
        k.e(request, "request");
        Uri url = request.getUrl();
        if (url == null) {
            return super.shouldInterceptRequest(view, request);
        }
        try {
            try {
                b10 = url.getQueryParameter("webviewType");
            } catch (Throwable th) {
                b10 = he.a.b(th);
            }
            if (b10 instanceof he.j) {
                b10 = null;
            }
            String str = (String) b10;
            if (str != null && !m.S(str)) {
                f1 f1Var = (f1) this.webviewType;
                f1Var.getClass();
                f1Var.h(null, str);
            }
            if (k.a(url.getLastPathSegment(), "favicon.ico")) {
                return new WebResourceResponse("image/png", null, null);
            }
            GetCachedAsset getCachedAsset = this.getCachedAsset;
            Uri url2 = request.getUrl();
            k.d(url2, "request.url");
            return getCachedAsset.invoke(url2, (String) ((f1) this.webviewType).getValue());
        } catch (Throwable th2) {
            String message = th2.getMessage();
            if (message != null) {
                map = w.x(new i("reason", message));
            } else {
                map = s.f6847x;
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "webview_could_not_handle_intercepted_url", null, map, null, null, null, 58, null);
            return super.shouldInterceptRequest(view, request);
        }
    }
}
