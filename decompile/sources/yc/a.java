package yc;

import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.Date;
import org.json.JSONObject;
import uc.j;
import wc.g;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f15047a;

    /* renamed from: c, reason: collision with root package name */
    public uc.a f15049c;

    /* renamed from: e, reason: collision with root package name */
    public long f15051e = System.nanoTime();

    /* renamed from: d, reason: collision with root package name */
    public int f15050d = 1;

    /* renamed from: b, reason: collision with root package name */
    public cd.a f15048b = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r3v1, types: [cd.a, java.lang.ref.WeakReference] */
    public a(String str) {
        this.f15047a = str;
    }

    public final void a(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        zc.b.b(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        g.f14287a.a(e(), "setLastActivity", jSONObject);
    }

    public void b(j jVar, uc.d dVar) {
        c(jVar, dVar, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(uc.j r10, uc.d r11, org.json.JSONObject r12) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yc.a.c(uc.j, uc.d, org.json.JSONObject):void");
    }

    public void d() {
        this.f15048b.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView e() {
        return (WebView) this.f15048b.get();
    }

    public void f() {
    }
}
