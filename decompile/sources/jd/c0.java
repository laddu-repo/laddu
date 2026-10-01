package jd;

import android.webkit.WebView;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c0 implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f7370x = 0;

    /* renamed from: y, reason: collision with root package name */
    public final WebView f7371y;

    public c0(WebView webView) {
        this.f7371y = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7370x) {
            case 0:
                WebView webView = this.f7371y;
                webView.stopLoading();
                webView.destroy();
                return;
            default:
                this.f7371y.destroy();
                return;
        }
    }

    public c0(yc.d dVar) {
        this.f7371y = dVar.f15053f;
    }
}
