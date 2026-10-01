package id;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6820a;

    /* renamed from: b, reason: collision with root package name */
    public final WebView f6821b;

    public c(Context context, WebView webView) {
        this.f6820a = context;
        this.f6821b = webView;
    }

    @JavascriptInterface
    public final void onAdSizeReceived(int i6, int i10) {
        final float f3 = this.f6820a.getResources().getDisplayMetrics().density;
        final int i11 = (int) (i10 / f3);
        a8.i.r(new Runnable() { // from class: id.b
            @Override // java.lang.Runnable
            public final void run() {
                c cVar = c.this;
                ViewGroup.LayoutParams layoutParams = cVar.f6821b.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = (int) (i11 * f3);
                cVar.f6821b.setLayoutParams(layoutParams);
            }
        });
    }
}
