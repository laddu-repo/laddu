package mc;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class b0 extends a {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public sc.b f8574w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public String f8575x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public String f8576y0;

    @Override // androidx.fragment.app.y
    public final void E() {
        this.f8571v0 = this.f8576y0;
        ((WebView) this.f8574w0.f11787x).getSettings().setJavaScriptEnabled(true);
        ((WebView) this.f8574w0.f11787x).getSettings().setDomStorageEnabled(true);
        ((WebView) this.f8574w0.f11787x).getSettings().setLoadsImagesAutomatically(true);
        ((WebView) this.f8574w0.f11787x).setWebViewClient(new WebViewClient());
        ((WebView) this.f8574w0.f11787x).getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        ((WebView) this.f8574w0.f11787x).getSettings().setAllowContentAccess(true);
        ((WebView) this.f8574w0.f11787x).getSettings().setAllowFileAccess(true);
        ((WebView) this.f8574w0.f11787x).getSettings().setDisplayZoomControls(false);
        ((WebView) this.f8574w0.f11787x).getSettings().setMixedContentMode(0);
        ((WebView) this.f8574w0.f11787x).getSettings().setUserAgentString("Mozilla/5.0 (Linux; Android 13; Mobile) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36");
        ((WebView) this.f8574w0.f11787x).setWebChromeClient(new a0(this));
        if ("no".equals(this.f8575x0)) {
            return;
        }
        String str = this.f8575x0;
        this.f8575x0 = str;
        ((SwipeRefreshLayout) this.f8574w0.f11786w).setRefreshing(true);
        ((WebView) this.f8574w0.f11787x).loadUrl(str);
    }

    @Override // mc.a
    public final boolean P() {
        WebBackForwardList webBackForwardListCopyBackForwardList = ((WebView) this.f8574w0.f11787x).copyBackForwardList();
        int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
        if (currentIndex > 0 && "about:blank".equals(webBackForwardListCopyBackForwardList.getItemAtIndex(currentIndex - 1).getUrl())) {
            ((WebView) this.f8574w0.f11787x).stopLoading();
            ((WebView) this.f8574w0.f11787x).clearHistory();
            ((WebView) this.f8574w0.f11787x).loadUrl("about:blank");
            return true;
        }
        if (((WebView) this.f8574w0.f11787x).canGoBack()) {
            ((WebView) this.f8574w0.f11787x).goBack();
            return false;
        }
        ((WebView) this.f8574w0.f11787x).stopLoading();
        ((WebView) this.f8574w0.f11787x).clearHistory();
        ((WebView) this.f8574w0.f11787x).loadUrl("about:blank");
        return true;
    }

    @Override // mc.a
    public final void T() {
        ((WebView) this.f8574w0.f11787x).reload();
    }

    @Override // androidx.fragment.app.y
    public final void v(Bundle bundle) {
        super.v(bundle);
        Bundle bundle2 = this.B;
        if (bundle2 != null) {
            this.f8575x0 = bundle2.getString("url");
            this.f8576y0 = this.B.getString("title");
        }
    }

    @Override // androidx.fragment.app.y
    public final View w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(fc.m.fragment_web, (ViewGroup) null, false);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewInflate;
        int i = fc.l.web_view;
        WebView webView = (WebView) a.a.k(viewInflate, i);
        if (webView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
        this.f8574w0 = new sc.b(swipeRefreshLayout, swipeRefreshLayout, webView);
        return swipeRefreshLayout;
    }
}
