package q2;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final p f10930a;

    /* renamed from: b, reason: collision with root package name */
    public final w1.g f10931b;

    /* renamed from: c, reason: collision with root package name */
    public p.l f10932c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10933d;

    /* renamed from: e, reason: collision with root package name */
    public final long f10934e;

    /* renamed from: f, reason: collision with root package name */
    public final long f10935f;

    /* renamed from: g, reason: collision with root package name */
    public final float f10936g;

    /* renamed from: h, reason: collision with root package name */
    public final float f10937h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10938i;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p.l] */
    public q(w1.g gVar, y2.m mVar) {
        this.f10931b = gVar;
        ?? obj = new Object();
        this.f10932c = obj;
        p pVar = new p(mVar, obj);
        this.f10930a = pVar;
        if (gVar != ((w1.g) pVar.B)) {
            pVar.B = gVar;
            ((HashMap) pVar.f10926z).clear();
            ((HashMap) pVar.A).clear();
        }
        this.f10933d = -9223372036854775807L;
        this.f10934e = -9223372036854775807L;
        this.f10935f = -9223372036854775807L;
        this.f10936g = -3.4028235E38f;
        this.f10937h = -3.4028235E38f;
        this.f10938i = true;
    }

    public static b0 e(Class cls, w1.g gVar) {
        try {
            return (b0) cls.getConstructor(w1.g.class).newInstance(gVar);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // q2.b0
    public final b0 a(p.l lVar) {
        this.f10932c = lVar;
        p pVar = this.f10930a;
        pVar.C = lVar;
        y2.m mVar = (y2.m) pVar.f10925y;
        synchronized (mVar) {
            mVar.f14928z = lVar;
        }
        Iterator it = ((HashMap) pVar.A).values().iterator();
        while (it.hasNext()) {
            ((b0) it.next()).a(lVar);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [o5.e0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [r1.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v38, types: [r1.w, r1.x] */
    /* JADX WARN: Type inference failed for: r6v2, types: [o5.e0, java.lang.Object] */
    @Override // q2.b0
    public final a b(r1.e0 e0Var) {
        char c10;
        boolean z10;
        r1.a0 a0Var;
        b0 b0Var;
        long j;
        Uri uri;
        String str;
        r1.u uVar;
        String str2;
        boolean z11;
        r1.a0 a0Var2;
        r1.y yVar;
        f5.b bVar;
        r1.e0 e0Var2 = e0Var;
        e0Var2.f11379b.getClass();
        String scheme = e0Var2.f11379b.f11283a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (!Objects.equals(e0Var2.f11379b.f11284b, "application/x-image-uri")) {
            r1.a0 a0Var3 = e0Var2.f11379b;
            int I = u1.a0.I(a0Var3.f11283a, a0Var3.f11284b);
            if (e0Var2.f11379b.f11290h != -9223372036854775807L) {
                y2.m mVar = (y2.m) this.f10930a.f10925y;
                synchronized (mVar) {
                    mVar.A = 1;
                }
            }
            try {
                p pVar = this.f10930a;
                HashMap hashMap = (HashMap) pVar.A;
                b0 b0Var2 = (b0) hashMap.get(Integer.valueOf(I));
                if (b0Var2 == null) {
                    b0Var2 = (b0) pVar.b(I).get();
                    b0Var2.a((p.l) pVar.C);
                    b0Var2.c(pVar.f10924x);
                    b0Var2.d();
                    hashMap.put(Integer.valueOf(I), b0Var2);
                }
                e2.t a10 = e0Var2.f11380c.a();
                r1.z zVar = e0Var2.f11380c;
                if (zVar.f11768a == -9223372036854775807L) {
                    a10.f4275a = this.f10933d;
                }
                if (zVar.f11771d == -3.4028235E38f) {
                    a10.f4278d = this.f10936g;
                }
                if (zVar.f11772e == -3.4028235E38f) {
                    a10.f4279e = this.f10937h;
                }
                if (zVar.f11769b == -9223372036854775807L) {
                    a10.f4276b = this.f10934e;
                }
                if (zVar.f11770c == -9223372036854775807L) {
                    a10.f4277c = this.f10935f;
                }
                r1.z zVar2 = new r1.z(a10);
                if (!zVar2.equals(e0Var2.f11380c)) {
                    f5.b bVar2 = new f5.b();
                    List list = Collections.EMPTY_LIST;
                    db.k0 k0Var = db.c1.B;
                    r1.b0 b0Var3 = r1.b0.f11307d;
                    r1.x xVar = e0Var2.f11382e;
                    ?? obj = new Object();
                    obj.f11713a = xVar.f11729b;
                    obj.f11714b = xVar.f11731d;
                    obj.f11715c = xVar.f11732e;
                    obj.f11716d = xVar.f11733f;
                    obj.f11717e = xVar.f11734g;
                    obj.f11718f = xVar.f11735h;
                    String str3 = e0Var2.f11378a;
                    r1.h0 h0Var = e0Var2.f11381d;
                    e0Var2.f11380c.a();
                    r1.b0 b0Var4 = e0Var2.f11383f;
                    r1.a0 a0Var4 = e0Var2.f11379b;
                    if (a0Var4 != null) {
                        String str4 = a0Var4.f11288f;
                        String str5 = a0Var4.f11284b;
                        Uri uri2 = a0Var4.f11283a;
                        list = a0Var4.f11287e;
                        k0Var = a0Var4.f11289g;
                        a0Var = null;
                        r1.y yVar2 = a0Var4.f11285c;
                        if (yVar2 != null) {
                            bVar = yVar2.a();
                        } else {
                            bVar = new f5.b();
                        }
                        c10 = 0;
                        b0Var = b0Var2;
                        str2 = str4;
                        bVar2 = bVar;
                        uVar = a0Var4.f11286d;
                        str = str5;
                        uri = uri2;
                        j = a0Var4.f11290h;
                    } else {
                        a0Var = null;
                        b0Var = b0Var2;
                        c10 = 0;
                        j = -9223372036854775807L;
                        uri = null;
                        str = null;
                        uVar = null;
                        str2 = null;
                    }
                    List list2 = list;
                    db.k0 k0Var2 = k0Var;
                    e2.t a11 = zVar2.a();
                    if (((Uri) bVar2.f5022e) != null && ((UUID) bVar2.f5021d) == null) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    u1.c.g(z11);
                    if (uri != null) {
                        if (((UUID) bVar2.f5021d) != null) {
                            yVar = new r1.y(bVar2);
                        } else {
                            yVar = a0Var;
                        }
                        a0Var2 = new r1.a0(uri, str, yVar, uVar, list2, str2, k0Var2, j);
                    } else {
                        a0Var2 = a0Var;
                    }
                    if (str3 == null) {
                        str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    String str6 = str3;
                    ?? wVar = new r1.w(obj);
                    r1.z zVar3 = new r1.z(a11);
                    if (h0Var == null) {
                        h0Var = r1.h0.K;
                    }
                    e0Var2 = new r1.e0(str6, wVar, a0Var2, zVar3, h0Var, b0Var4);
                    b0Var2 = b0Var;
                } else {
                    c10 = 0;
                }
                a b10 = b0Var2.b(e0Var2);
                db.k0 k0Var3 = e0Var2.f11379b.f11289g;
                if (!k0Var3.isEmpty()) {
                    a[] aVarArr = new a[k0Var3.size() + 1];
                    aVarArr[c10] = b10;
                    for (int i6 = 0; i6 < k0Var3.size(); i6++) {
                        if (this.f10938i) {
                            r1.p pVar2 = new r1.p();
                            pVar2.f11611m = r1.k0.p(((r1.d0) k0Var3.get(i6)).f11362b);
                            pVar2.f11603d = ((r1.d0) k0Var3.get(i6)).f11363c;
                            pVar2.f11604e = ((r1.d0) k0Var3.get(i6)).f11364d;
                            pVar2.f11605f = ((r1.d0) k0Var3.get(i6)).f11365e;
                            pVar2.f11601b = ((r1.d0) k0Var3.get(i6)).f11366f;
                            pVar2.f11600a = ((r1.d0) k0Var3.get(i6)).f11367g;
                            r1.q qVar = new r1.q(pVar2);
                            b2.b bVar3 = new b2.b(18, this, qVar);
                            w1.g gVar = this.f10931b;
                            j2.u uVar2 = new j2.u(bVar3, 11);
                            androidx.lifecycle.j1 j1Var = new androidx.lifecycle.j1(14);
                            ?? obj2 = new Object();
                            if (this.f10932c.g(qVar)) {
                                r1.p a12 = qVar.a();
                                a12.f11611m = r1.k0.p("application/x-media3-cues");
                                a12.j = qVar.f11670n;
                                a12.K = this.f10932c.o(qVar);
                                qVar = new r1.q(a12);
                            }
                            r1.e0 b11 = r1.e0.b(((r1.d0) k0Var3.get(i6)).f11361a.toString());
                            b11.f11379b.getClass();
                            aVarArr[i6 + 1] = new u0(b11, gVar, uVar2, j1Var.f(b11), obj2, 1048576, qVar);
                        } else {
                            w1.g gVar2 = this.f10931b;
                            gVar2.getClass();
                            aVarArr[i6 + 1] = new h1((r1.d0) k0Var3.get(i6), gVar2, new Object());
                        }
                    }
                    b10 = new m0(aVarArr);
                }
                r1.x xVar2 = e0Var2.f11382e;
                if (xVar2.f11729b != 0 || xVar2.f11731d != Long.MIN_VALUE || xVar2.f11733f) {
                    e eVar = new e(b10);
                    long j10 = xVar2.f11729b;
                    if (j10 >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    u1.c.b(z10);
                    u1.c.g(!eVar.f10864h);
                    eVar.f10858b = j10;
                    long j11 = xVar2.f11731d;
                    u1.c.g(!eVar.f10864h);
                    eVar.f10859c = j11;
                    boolean z12 = !xVar2.f11734g;
                    u1.c.g(!eVar.f10864h);
                    eVar.f10860d = z12;
                    boolean z13 = xVar2.f11732e;
                    u1.c.g(!eVar.f10864h);
                    eVar.f10861e = z13;
                    boolean z14 = xVar2.f11733f;
                    u1.c.g(!eVar.f10864h);
                    eVar.f10862f = z14;
                    boolean z15 = xVar2.f11735h;
                    u1.c.g(!eVar.f10864h);
                    eVar.f10863g = z15;
                    eVar.f10864h = true;
                    b10 = new h(eVar);
                }
                e0Var2.f11379b.getClass();
                if (e0Var2.f11379b.f11286d == null) {
                    return b10;
                }
                u1.a.p("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
                return b10;
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException(e10);
            }
        }
        long j12 = e0Var2.f11379b.f11290h;
        String str7 = u1.a0.f12750a;
        throw null;
    }

    @Override // q2.b0
    public final b0 c(boolean z10) {
        this.f10938i = z10;
        p pVar = this.f10930a;
        pVar.f10924x = z10;
        y2.m mVar = (y2.m) pVar.f10925y;
        synchronized (mVar) {
            mVar.f14927y = z10;
        }
        Iterator it = ((HashMap) pVar.A).values().iterator();
        while (it.hasNext()) {
            ((b0) it.next()).c(z10);
        }
        return this;
    }

    @Override // q2.b0
    public final b0 d() {
        p pVar = this.f10930a;
        pVar.getClass();
        synchronized (((y2.m) pVar.f10925y)) {
        }
        return this;
    }
}
