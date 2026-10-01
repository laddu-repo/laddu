package yc;

import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class c extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f15052a;

    public c(d dVar) {
        this.f15052a = dVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [cd.a, java.lang.ref.WeakReference] */
    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + webView);
        d dVar = this.f15052a;
        if (dVar.e() == webView) {
            Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
            dVar.f15048b = new WeakReference(null);
        }
        webView.destroy();
        return true;
    }
}
