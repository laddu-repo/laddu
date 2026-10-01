package qc;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map f10977a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f10979c;

    public f(String str, h hVar) {
        this.f10978b = str;
        this.f10979c = hVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        if (android.support.v4.media.session.b.a(this.f10978b, str)) {
            this.f10979c.h(str, this.f10977a);
            webView.stopLoading();
            webView.destroy();
        }
        super.onLoadResource(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.f10979c.h("http://error", null);
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest != null) {
            this.f10977a = webResourceRequest.getRequestHeaders();
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String string = webResourceRequest.getUrl().toString();
        if (!android.support.v4.media.session.b.a(this.f10978b, string)) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        this.f10979c.h(string, this.f10977a);
        webView.stopLoading();
        webView.destroy();
        return true;
    }
}
