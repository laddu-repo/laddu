package mc;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f8572a;

    public a0(b0 b0Var) {
        this.f8572a = b0Var;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        if (i >= 50) {
            ((SwipeRefreshLayout) this.f8572a.f8574w0.f11786w).setRefreshing(false);
        }
    }
}
