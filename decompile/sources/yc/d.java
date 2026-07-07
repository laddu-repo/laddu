package yc;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import jd.c0;
import org.json.JSONObject;
import uc.j;
import wc.f;

/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: f, reason: collision with root package name */
    public WebView f15053f;

    /* renamed from: g, reason: collision with root package name */
    public Long f15054g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f15055h;

    public d(String str, Map map) {
        super(str);
        this.f15054g = null;
        this.f15055h = map;
    }

    @Override // yc.a
    public final void b(j jVar, uc.d dVar) {
        JSONObject jSONObject = new JSONObject();
        Map unmodifiableMap = Collections.unmodifiableMap(dVar.f13078d);
        Iterator it = unmodifiableMap.keySet().iterator();
        if (!it.hasNext()) {
            c(jVar, dVar, jSONObject);
        } else {
            unmodifiableMap.get((String) it.next()).getClass();
            throw new ClassCastException();
        }
    }

    @Override // yc.a
    public final void d() {
        long convert;
        super.d();
        if (this.f15054g == null) {
            convert = 4000;
        } else {
            convert = TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f15054g.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new c0(this), Math.max(4000 - convert, 2000L));
        this.f15053f = null;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [cd.a, java.lang.ref.WeakReference] */
    @Override // yc.a
    public final void f() {
        WebView webView = new WebView(f.f14285b.f14286a);
        this.f15053f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f15053f.getSettings().setAllowContentAccess(false);
        this.f15053f.getSettings().setAllowFileAccess(false);
        this.f15053f.setWebViewClient(new c(this));
        this.f15048b = new WeakReference(this.f15053f);
        WebView webView2 = this.f15053f;
        if (webView2 != null && !TextUtils.isEmpty(null)) {
            try {
                webView2.evaluateJavascript(null, null);
            } catch (IllegalStateException unused) {
                webView2.loadUrl("javascript: null");
            }
        }
        Map map = this.f15055h;
        Iterator it = map.keySet().iterator();
        if (!it.hasNext()) {
            this.f15054g = Long.valueOf(System.nanoTime());
        } else {
            map.get((String) it.next()).getClass();
            throw new ClassCastException();
        }
    }
}
