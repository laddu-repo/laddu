package jd;

import android.net.http.SslError;
import android.os.Handler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kd.p0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b0 extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.w f7364a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Handler f7365b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f7366c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gf.k f7367d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p0 f7368e;

    public b0(kotlin.jvm.internal.w wVar, Handler handler, AtomicBoolean atomicBoolean, gf.k kVar, p0 p0Var) {
        this.f7364a = wVar;
        this.f7365b = handler;
        this.f7366c = atomicBoolean;
        this.f7367d = kVar;
        this.f7368e = p0Var;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView view, String url) {
        kotlin.jvm.internal.k.e(view, "view");
        kotlin.jvm.internal.k.e(url, "url");
        if (e0.c(url)) {
            view.stopLoading();
            view.destroy();
            e0.a(this.f7366c, this.f7367d, this.f7368e, url, (Map) this.f7364a.f8055x);
            return;
        }
        super.onLoadResource(view, url);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView view, String url) {
        kotlin.jvm.internal.k.e(view, "view");
        kotlin.jvm.internal.k.e(url, "url");
        super.onPageFinished(view, url);
        p0 p0Var = this.f7368e;
        AtomicBoolean atomicBoolean = this.f7366c;
        kotlin.jvm.internal.w wVar = this.f7364a;
        gf.k kVar = this.f7367d;
        z zVar = new z(atomicBoolean, view, wVar, kVar, p0Var, 0);
        Handler handler = this.f7365b;
        handler.postDelayed(zVar, 0L);
        handler.postDelayed(new a0(atomicBoolean, view, 0), 800L);
        handler.postDelayed(new z(atomicBoolean, view, wVar, kVar, this.f7368e, 1), 1400L);
        handler.postDelayed(new z(atomicBoolean, view, wVar, kVar, this.f7368e, 2), 3000L);
        handler.postDelayed(new z(atomicBoolean, view, wVar, kVar, this.f7368e, 3), 6000L);
        handler.postDelayed(new z(atomicBoolean, view, wVar, kVar, this.f7368e, 4), 8000L);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        kotlin.jvm.internal.k.e(view, "view");
        kotlin.jvm.internal.k.e(handler, "handler");
        kotlin.jvm.internal.k.e(error, "error");
        handler.proceed();
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        kotlin.jvm.internal.k.e(view, "view");
        kotlin.jvm.internal.k.e(request, "request");
        Map<String, String> requestHeaders = request.getRequestHeaders();
        this.f7364a.f8055x = requestHeaders;
        String uri = request.getUrl().toString();
        kotlin.jvm.internal.k.d(uri, "toString(...)");
        if (e0.c(uri)) {
            AtomicBoolean atomicBoolean = this.f7366c;
            this.f7365b.post(new a0(atomicBoolean, view, 1));
            e0.a(atomicBoolean, this.f7367d, this.f7368e, uri, requestHeaders);
        }
        return super.shouldInterceptRequest(view, request);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        kotlin.jvm.internal.k.e(view, "view");
        kotlin.jvm.internal.k.e(request, "request");
        String uri = request.getUrl().toString();
        kotlin.jvm.internal.k.d(uri, "toString(...)");
        if (e0.c(uri)) {
            view.stopLoading();
            view.destroy();
            e0.a(this.f7366c, this.f7367d, this.f7368e, uri, (Map) this.f7364a.f8055x);
            return true;
        }
        return super.shouldOverrideUrlLoading(view, request);
    }
}
