package od;

import android.app.Application;
import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.j1;
import androidx.lifecycle.k1;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kf.f1;
import kf.y0;
import okhttp3.Response;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c0 extends k1 {

    /* renamed from: b, reason: collision with root package name */
    public final Application f10062b;

    /* renamed from: d, reason: collision with root package name */
    public fd.z f10064d;

    /* renamed from: g, reason: collision with root package name */
    public final f1 f10067g;

    /* renamed from: h, reason: collision with root package name */
    public final f1 f10068h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.lifecycle.k f10069i;
    public boolean j;

    /* renamed from: c, reason: collision with root package name */
    public final q0 f10063c = new o0(0);

    /* renamed from: e, reason: collision with root package name */
    public final f1 f10065e = y0.c(null);

    /* renamed from: f, reason: collision with root package name */
    public final f1 f10066f = y0.c(jd.w.f7411a);

    /* JADX WARN: Type inference failed for: r12v1, types: [androidx.lifecycle.o0, androidx.lifecycle.q0] */
    public c0(a1 a1Var, Application application) {
        fd.z zVar;
        this.f10062b = application;
        f1 c10 = y0.c(0);
        this.f10067g = c10;
        f1 c11 = y0.c(ie.r.f6846x);
        this.f10068h = c11;
        this.f10069i = d1.a(y0.j(new j1(new k7.c(c11, 21), c10, new b0(this, null))));
        try {
            zVar = a.a.j(a1Var);
            i();
        } catch (Exception unused) {
            zVar = new fd.z(null, 0, 0, false, null, null, null, null, 255);
        }
        this.f10064d = zVar;
    }

    public static final LinkedHashMap f(c0 c0Var, Response response) {
        List<String> list;
        String L;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 17_5_1 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/14.0.1 Mobile/15E148 Safari/605.1.15/Clipbox+/2.2.8");
        linkedHashMap.put("Referer", "https://www.youtube.com/");
        linkedHashMap.put("Origin", "https://www.youtube.com");
        linkedHashMap.put("Connection", "keep-alive");
        linkedHashMap.put("Accept", "*/*");
        linkedHashMap.put("Accept-Encoding", "identity");
        List<String> headers = response.headers("Set-Cookie");
        if (!headers.isEmpty()) {
            list = headers;
        } else {
            list = null;
        }
        if (list != null && (L = ie.j.L(list, "; ", null, null, new cf.p(27), 30)) != null) {
            linkedHashMap.put("Cookie", L);
        }
        String header$default = Response.header$default(response, "Accept-Language", null, 2, null);
        if (header$default != null) {
            linkedHashMap.put("Accept-Language", header$default);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        if (r12 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007d, code lost:
    
        if (r12 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f1, code lost:
    
        if (r12 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.jvm.internal.w] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object g(od.c0 r10, kd.p0 r11, ne.c r12) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: od.c0.g(od.c0, kd.p0, ne.c):java.lang.Object");
    }

    public static final String h(c0 c0Var, String str) {
        if (!df.m.S(str)) {
            Iterator it = ie.k.t("v=([a-zA-Z0-9_-]{11})", "youtu\\.be/([a-zA-Z0-9_-]{11})", "embed/([a-zA-Z0-9_-]{11})", "shorts/([a-zA-Z0-9_-]{11})", "/watch/\\?v=([a-zA-Z0-9_-]{11})", "m\\.youtube\\.com/watch\\?v=([a-zA-Z0-9_-]{11})").iterator();
            while (it.hasNext()) {
                Matcher matcher = Pattern.compile((String) it.next()).matcher(str);
                if (matcher.find()) {
                    return matcher.group(1);
                }
            }
            Pattern compile = Pattern.compile("^[a-zA-Z0-9_-]{11}$");
            kotlin.jvm.internal.k.d(compile, "compile(...)");
            if (compile.matcher(str).matches()) {
                return str;
            }
            return null;
        }
        return null;
    }

    public final void getData() {
        f1 f1Var = this.f10068h;
        f1Var.getClass();
        f1Var.h(null, ie.r.f6846x);
        f1 f1Var2 = this.f10066f;
        f1Var2.getClass();
        f1Var2.h(null, jd.w.f7411a);
        d1.h(this, new androidx.lifecycle.c(this, null, 13)).f15225x = new df.v(this, 5);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0058 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            r13 = this;
            kf.f1 r0 = r13.f10068h
            r0.getClass()
            r1 = 0
            ie.r r2 = ie.r.f6846x
            r0.h(r1, r2)
            kf.f1 r2 = r13.f10066f
            r2.getClass()
            jd.w r3 = jd.w.f7411a
            r2.h(r1, r3)
            fd.z r2 = r13.f10064d
            int r2 = r2.f5225c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kf.f1 r3 = r13.f10067g
            r3.getClass()
            r3.h(r1, r2)
            fd.z r2 = r13.f10064d
            int r3 = r2.f5224b
            r4 = 1
            if (r3 == r4) goto L37
            r0 = 2
            if (r3 == r0) goto L33
            r13.getData()
            return
        L33:
            r13.j()
            return
        L37:
            java.lang.String r5 = r2.f5223a
            java.lang.String r10 = r2.f5229g
            java.lang.String r8 = r2.f5230h
            java.io.Serializable r2 = r2.f5228f
            boolean r3 = r2 instanceof java.util.Map
            if (r3 == 0) goto L46
            java.util.Map r2 = (java.util.Map) r2
            goto L47
        L46:
            r2 = r1
        L47:
            if (r2 == 0) goto L94
            java.util.Set r2 = r2.entrySet()
            if (r2 == 0) goto L94
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L58:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L8e
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r6 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            boolean r7 = r6 instanceof java.lang.String
            if (r7 == 0) goto L73
            java.lang.String r6 = (java.lang.String) r6
            goto L74
        L73:
            r6 = r1
        L74:
            if (r6 != 0) goto L78
        L76:
            r7 = r1
            goto L88
        L78:
            boolean r7 = r4 instanceof java.lang.String
            if (r7 == 0) goto L7f
            java.lang.String r4 = (java.lang.String) r4
            goto L80
        L7f:
            r4 = r1
        L80:
            if (r4 != 0) goto L83
            goto L76
        L83:
            he.i r7 = new he.i
            r7.<init>(r6, r4)
        L88:
            if (r7 == 0) goto L58
            r3.add(r7)
            goto L58
        L8e:
            java.util.Map r2 = ie.w.C(r3)
            r7 = r2
            goto L95
        L94:
            r7 = r1
        L95:
            if (r8 == 0) goto La9
            if (r10 == 0) goto La9
            java.lang.String r2 = "|"
            java.lang.String r2 = df.m.k0(r5, r2)
            kd.p0 r6 = new kd.p0
            r11 = 1
            r12 = 1
            r9 = r7
            r7 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12)
            goto Lb4
        La9:
            kd.p0 r4 = new kd.p0
            r8 = 0
            r10 = 29
            r6 = 0
            r9 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r6 = r4
        Lb4:
            java.util.List r2 = a8.g.m(r6)
            r0.getClass()
            r0.h(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: od.c0.i():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00cc, code lost:
    
        if (r2 == null) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: od.c0.j():void");
    }

    public final void k(String newSlug) {
        kotlin.jvm.internal.k.e(newSlug, "newSlug");
        if (newSlug.equals(this.f10064d.f5223a)) {
            return;
        }
        fd.z a10 = fd.z.a(this.f10064d, newSlug, 0, 248);
        this.f10064d = a10;
        Integer valueOf = Integer.valueOf(a10.f5225c);
        f1 f1Var = this.f10067g;
        f1Var.getClass();
        f1Var.h(null, valueOf);
        getData();
    }

    @Override // androidx.lifecycle.k1
    public final void e() {
    }
}
