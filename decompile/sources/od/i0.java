package od;

import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.j1;
import androidx.lifecycle.k1;
import gf.o0;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kf.b1;
import kf.f1;
import kf.r0;
import kf.t0;
import kf.y0;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2;
import org.json.JSONObject;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i0 extends k1 implements n {

    /* renamed from: l, reason: collision with root package name */
    public static final df.k f10094l = new df.k("tvg-logo=\"(.*?)\"");

    /* renamed from: m, reason: collision with root package name */
    public static final df.k f10095m = new df.k("group-title=\"([^\"]+)\"");

    /* renamed from: b, reason: collision with root package name */
    public final xf.c f10096b;

    /* renamed from: c, reason: collision with root package name */
    public final pd.b f10097c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10098d;

    /* renamed from: e, reason: collision with root package name */
    public final f1 f10099e;

    /* renamed from: f, reason: collision with root package name */
    public final f1 f10100f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.lifecycle.k f10101g;

    /* renamed from: h, reason: collision with root package name */
    public final f1 f10102h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.lifecycle.k f10103i;
    public final f1 j;

    /* renamed from: k, reason: collision with root package name */
    public final androidx.lifecycle.k f10104k;

    public i0(a1 a1Var, xf.c cVar, pd.b bVar) {
        gf.d0 d0Var;
        this.f10096b = cVar;
        this.f10097c = bVar;
        Object b10 = a1Var.b("path");
        kotlin.jvm.internal.k.b(b10);
        this.f10098d = (String) b10;
        jd.w wVar = jd.w.f7411a;
        f1 c10 = y0.c(wVar);
        this.f10099e = c10;
        f1 c11 = y0.c(ie.r.f6846x);
        this.f10100f = c11;
        this.f10101g = d1.a(c11);
        f1 c12 = y0.c("All");
        this.f10102h = c12;
        this.f10103i = d1.a(c12);
        f1 c13 = y0.c(HttpUrl.FRAGMENT_ENCODE_SET);
        this.j = c13;
        int i6 = 3;
        le.c cVar2 = null;
        kf.h n10 = y0.n(new j1(new j1(new j1(c10, a8.i.d(bVar.f10752a, new String[]{"playlistFav"}, new e0(4)), new t(i6, cVar2, 1)), c12, new k(i6, cVar2, 1)), c13, new k(i6, cVar2, 2)), o0.f5693a);
        p1.a g10 = d1.g(this);
        s8.n i10 = y0.i(n10, 1);
        f1 c14 = y0.c(wVar);
        le.h hVar = (le.h) i10.f12262d;
        kf.h hVar2 = (kf.h) i10.f12260b;
        kf.j jVar = b1.f7925a;
        kf.j jVar2 = b1.f7926b;
        if (jVar2.equals(jVar)) {
            d0Var = gf.d0.f5655x;
        } else {
            d0Var = gf.d0.A;
        }
        gf.f0.v(g10, hVar, d0Var, new kf.n(jVar2, hVar2, c14, wVar, (le.c) null));
        this.f10104k = d1.a(new t0(c14));
        mo157getData();
    }

    public static final List f(i0 i0Var, List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(ie.w.w(1));
        linkedHashSet.add(new String[]{"All"}[0]);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((kd.h0) it.next()).f7858y;
            if (str != null) {
                linkedHashSet.add(str);
            }
        }
        return ie.j.Z(linkedHashSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
    
        if (r9 == r6) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object g(od.i0 r8, ne.c r9) {
        /*
            boolean r0 = r9 instanceof od.f0
            if (r0 == 0) goto L13
            r0 = r9
            od.f0 r0 = (od.f0) r0
            int r1 = r0.f10081z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10081z = r1
            goto L18
        L13:
            od.f0 r0 = new od.f0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f10079x
            int r1 = r0.f10081z
            r2 = 3
            r3 = 1
            r4 = 2
            r5 = 0
            me.a r6 = me.a.f8833x
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L3a
            if (r1 == r4) goto L36
            if (r1 != r2) goto L2e
            he.a.f(r9)
            return r9
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            he.a.f(r9)
            return r9
        L3a:
            he.a.f(r9)
            goto L52
        L3e:
            he.a.f(r9)
            of.d r9 = gf.o0.f5694b
            androidx.lifecycle.b r1 = new androidx.lifecycle.b
            r7 = 2
            r1.<init>(r8, r5, r7)
            r0.f10081z = r3
            java.lang.Object r9 = gf.f0.J(r9, r1, r0)
            if (r9 != r6) goto L52
            goto L7a
        L52:
            java.util.Map r9 = (java.util.Map) r9
            java.lang.String r1 = r8.f10098d
            java.lang.String r3 = "http"
            r7 = 0
            boolean r1 = df.u.H(r1, r3, r7)
            if (r1 == 0) goto L69
            r0.f10081z = r4
            java.lang.Object r8 = r8.i(r9, r0)
            if (r8 != r6) goto L68
            goto L7a
        L68:
            return r8
        L69:
            of.d r1 = gf.o0.f5694b
            dd.c r3 = new dd.c
            r4 = 10
            r3.<init>(r8, r9, r5, r4)
            r0.f10081z = r2
            java.lang.Object r8 = gf.f0.J(r1, r3, r0)
            if (r8 != r6) goto L7b
        L7a:
            return r6
        L7b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: od.i0.g(od.i0, ne.c):java.lang.Object");
    }

    public static final d0 h(i0 i0Var, InputStream inputStream, Map map, kf.n nVar) {
        String str;
        Integer num;
        boolean z10;
        String str2;
        String str3;
        ArrayList arrayList = new ArrayList();
        int i6 = 1;
        LinkedHashSet linkedHashSet = new LinkedHashSet(ie.w.w(1));
        boolean z11 = false;
        linkedHashSet.add(new String[]{"All"}[0]);
        String str4 = null;
        he.n nVar2 = new he.n(null, null, null);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, df.a.f4115a), Http2.INITIAL_MAX_FRAME_SIZE);
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        int i10 = 0;
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    return new d0(arrayList, ie.j.Z(linkedHashSet));
                }
                i10 += i6;
                if (i10 % 96 == 0) {
                    gf.f0.l(nVar.getContext());
                }
                if (df.u.H(readLine, "#", z11)) {
                    if (df.m.I(readLine, "inputstream.adaptive.license_type=", z11)) {
                        str10 = df.m.g0(readLine, "inputstream.adaptive.license_type=");
                    } else if (df.m.I(readLine, "inputstream.adaptive.license_key=", z11)) {
                        str9 = df.m.g0(readLine, "inputstream.adaptive.license_key=");
                    } else if (df.m.I(readLine, "http-referrer=", z11)) {
                        str6 = df.m.g0(readLine, "http-referrer=");
                    } else if (df.m.I(readLine, "http-user-agent=", z11)) {
                        str5 = df.m.g0(readLine, "http-user-agent=");
                    } else if (df.m.I(readLine, "http-origin=", z11)) {
                        str7 = df.m.g0(readLine, "http-origin=");
                    } else {
                        if (df.u.H(readLine, "#EXTINF:", z11)) {
                            c6.h a10 = df.k.a(f10094l, readLine);
                            if (a10 != null) {
                                str2 = (String) ((df.i) a10.n()).get(i6);
                            } else {
                                str2 = str4;
                            }
                            String g02 = df.m.g0(readLine, ",");
                            c6.h a11 = df.k.a(f10095m, readLine);
                            if (a11 != null) {
                                str3 = (String) ((df.i) a11.n()).get(i6);
                            } else {
                                str3 = null;
                            }
                            nVar2 = new he.n(g02, str3, str2);
                        } else if (df.u.H(readLine, "#EXTHTTP:", z11)) {
                            try {
                                str8 = new JSONObject(df.m.g0(readLine, "#EXTHTTP:")).getString("cookie");
                            } catch (Exception unused) {
                                str8 = null;
                            }
                        }
                        str4 = null;
                    }
                } else if (df.u.H(readLine, "http", z11)) {
                    String str11 = (String) nVar2.f6086x;
                    if (str11 != null) {
                        str = df.m.n0(str11).toString();
                    } else {
                        str = null;
                    }
                    if (str != null && str.length() != 0) {
                        String str12 = (String) nVar2.f6087y;
                        if (str12 != null) {
                            linkedHashSet.add(str12);
                        }
                        kd.h0 h0Var = (kd.h0) map.get(readLine);
                        String str13 = (String) nVar2.f6086x;
                        String str14 = (String) nVar2.f6087y;
                        String str15 = (String) nVar2.f6088z;
                        if (h0Var != null) {
                            num = h0Var.H;
                        } else {
                            num = null;
                        }
                        kd.h0 h0Var2 = new kd.h0(str13, str14, str15, readLine, str5, str6, str7, str8, str9, str10, num);
                        if (h0Var != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        h0Var2.I = z10;
                        arrayList.add(h0Var2);
                        nVar2 = new he.n(null, null, null);
                        str4 = null;
                        str5 = null;
                        str6 = null;
                        str7 = null;
                        str8 = null;
                        str9 = null;
                        str10 = null;
                        i6 = 1;
                        z11 = false;
                    }
                }
                str4 = null;
                i6 = 1;
                z11 = false;
            } finally {
            }
        }
    }

    @Override // od.n
    public final r0 a() {
        return this.j;
    }

    @Override // od.n
    public final androidx.lifecycle.o0 getData() {
        return this.f10104k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0065 -> B:16:0x0068). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(java.util.Map r7, ne.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof od.g0
            if (r0 == 0) goto L13
            r0 = r8
            od.g0 r0 = (od.g0) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.E = r1
            goto L18
        L13:
            od.g0 r0 = new od.g0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.C
            int r1 = r0.E
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            int r7 = r0.B
            int r1 = r0.A
            int r3 = r0.f10085z
            kotlin.jvm.internal.w r4 = r0.f10084y
            java.util.Map r5 = r0.f10083x
            he.a.f(r8)     // Catch: java.lang.Throwable -> L2f
            return r8
        L2f:
            r8 = move-exception
            goto L68
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            he.a.f(r8)
            kotlin.jvm.internal.w r8 = new kotlin.jvm.internal.w
            r8.<init>()
            r1 = 0
            r3 = 2
            r4 = r8
            r8 = r7
            r7 = 0
        L46:
            if (r7 >= r3) goto L71
            od.h0 r1 = new od.h0     // Catch: java.lang.Throwable -> L64
            r5 = 0
            r1.<init>(r6, r8, r5)     // Catch: java.lang.Throwable -> L64
            r0.f10083x = r8     // Catch: java.lang.Throwable -> L64
            r0.f10084y = r4     // Catch: java.lang.Throwable -> L64
            r0.f10085z = r3     // Catch: java.lang.Throwable -> L64
            r0.A = r7     // Catch: java.lang.Throwable -> L64
            r0.B = r7     // Catch: java.lang.Throwable -> L64
            r0.E = r2     // Catch: java.lang.Throwable -> L64
            java.lang.Object r7 = gf.f0.j(r1, r0)     // Catch: java.lang.Throwable -> L64
            me.a r8 = me.a.f8833x
            if (r7 != r8) goto L63
            return r8
        L63:
            return r7
        L64:
            r1 = move-exception
            r5 = r8
            r8 = r1
            r1 = r7
        L68:
            r4.f8055x = r8
            if (r7 == r2) goto L70
            int r7 = r1 + 1
            r8 = r5
            goto L46
        L70:
            throw r8
        L71:
            java.lang.Object r7 = r4.f8055x
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            if (r7 != 0) goto L7e
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Playlist request failed"
            r7.<init>(r8)
        L7e:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: od.i0.i(java.util.Map, ne.c):java.lang.Object");
    }

    @Override // od.n
    /* renamed from: getData, reason: collision with other method in class */
    public final void mo157getData() {
        f1 f1Var = this.f10099e;
        f1Var.getClass();
        f1Var.h(null, jd.w.f7411a);
        gf.f0.w(d1.g(this), o0.f5694b, new androidx.lifecycle.c(this, null, 15), 2);
    }
}
