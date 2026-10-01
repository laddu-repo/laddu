package id;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.playfy.tv.R;
import com.unity3d.ads.UnityAds;
import df.m;
import df.n;
import df.u;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kd.m0;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6829a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f6830b;

    /* renamed from: c, reason: collision with root package name */
    public final kd.c f6831c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6832d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6833e;

    /* renamed from: f, reason: collision with root package name */
    public final String f6834f;

    public h(Context context, xf.c cVar, SharedPreferences sharedPreferences) {
        this.f6829a = context;
        this.f6830b = sharedPreferences;
        String string = sharedPreferences.getString("ads", null);
        k.b(string);
        kd.c cVar2 = (kd.c) cVar.a(string, kd.c.Companion.serializer());
        this.f6831c = cVar2;
        if (cVar2.f7841b) {
            UnityAds.initialize(context, cVar2.f7840a, true, new a(this));
        }
        byte[] decode = Base64.decode("UmV3YXJkZWRfQW5kcm9pZA==", 0);
        k.d(decode, "decode(...)");
        this.f6834f = new String(decode, df.a.f4115a);
    }

    public static String a(int i6, String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        k.d(lowerCase, "toLowerCase(...)");
        return "last_exec_" + i6 + "_" + m.n0(lowerCase).toString();
    }

    public final boolean b(int i6, String str) {
        m0 m0Var = (m0) ie.j.I(i6, this.f6831c.f7843d);
        if (m0Var != null) {
            if (m0Var.f7880a <= 0) {
                m0Var = null;
            }
            if (m0Var != null) {
                return c(str, m0Var.f7884e, i6, true);
            }
            return false;
        }
        return false;
    }

    public final boolean c(String str, int i6, int i10, boolean z10) {
        long millis;
        long j = this.f6830b.getLong(a(i10, str), 0L);
        if (j != 0) {
            if (z10) {
                millis = TimeUnit.HOURS.toMillis(i6);
            } else {
                millis = TimeUnit.MINUTES.toMillis(i6);
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis < j || currentTimeMillis - j >= millis) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [kotlin.jvm.internal.s, java.lang.Object] */
    public final void d(LinearLayout layout) {
        k.e(layout, "layout");
        kd.c cVar = this.f6831c;
        m0 m0Var = (m0) ie.j.I(1, cVar.f7843d);
        m0 m0Var2 = (m0) ie.j.I(4, cVar.f7843d);
        Context context = this.f6829a;
        if (m0Var2 != null && m0Var2.f7880a > 0) {
            layout.setVisibility(0);
            String str = m0Var2.f7882c;
            int childCount = layout.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = layout.getChildAt(i6);
                if (childAt instanceof WebView) {
                    WebView webView = (WebView) childAt;
                    try {
                        webView.stopLoading();
                        webView.destroy();
                    } catch (Throwable unused) {
                    }
                }
            }
            layout.removeAllViews();
            WebView webView2 = new WebView(context.getApplicationContext());
            webView2.setBackgroundColor(-16777216);
            ?? obj = new Object();
            webView2.setOnTouchListener(new com.unity3d.ads.adplayer.a(obj, 2));
            webView2.setWebViewClient(new g(obj, context));
            WebSettings settings = webView2.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(false);
            settings.setSupportMultipleWindows(false);
            settings.setMediaPlaybackRequiresUserGesture(true);
            settings.setMixedContentMode(2);
            settings.setSupportZoom(false);
            settings.setBuiltInZoomControls(false);
            settings.setDisplayZoomControls(false);
            webView2.addJavascriptInterface(new c(context, webView2), "AndroidInterface");
            if (u.H(m.n0(str).toString(), "http", false)) {
                webView2.loadUrl(str);
            } else {
                webView2.loadDataWithBaseURL(null, n.s("\n                <!doctype html>\n                <html>\n                  <head>\n                    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n                  </head>\n                  <body>\n                    " + str + "\n                  </body>\n                </html>\n                "), "text/html", "utf-8", null);
            }
            layout.addView(webView2, new LinearLayout.LayoutParams(-1, layout.getResources().getDimensionPixelSize(R.dimen._45sdp)));
            return;
        }
        if (m0Var != null && m0Var.f7880a > 0) {
            layout.setVisibility(0);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setAdjustViewBounds(true);
            layout.removeAllViews();
            layout.addView(imageView, -1, -2);
            String str2 = m0Var.f7881b;
            l6.f a10 = l6.a.a(imageView.getContext());
            v6.i iVar = new v6.i(imageView.getContext());
            iVar.f13364c = str2;
            iVar.c(imageView);
            ((l6.k) a10).b(iVar.a());
            imageView.setClickable(true);
            imageView.setFocusable(true);
            imageView.setOnClickListener(new fd.b(10, this, m0Var));
        }
    }

    public final void e(int i6, String str) {
        SharedPreferences.Editor edit = this.f6830b.edit();
        edit.putLong(a(i6, str), System.currentTimeMillis());
        edit.apply();
    }
}
