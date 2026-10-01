package y;

import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import n9.j;
import s8.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: q, reason: collision with root package name */
    public static boolean f14774q = false;

    /* renamed from: d, reason: collision with root package name */
    public final d f14778d;

    /* renamed from: m, reason: collision with root package name */
    public final j f14786m;

    /* renamed from: p, reason: collision with root package name */
    public b f14789p;

    /* renamed from: a, reason: collision with root package name */
    public int f14775a = UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14776b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f14777c = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f14779e = 32;

    /* renamed from: f, reason: collision with root package name */
    public int f14780f = 32;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14782h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean[] f14783i = new boolean[32];
    public int j = 1;

    /* renamed from: k, reason: collision with root package name */
    public int f14784k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f14785l = 32;

    /* renamed from: n, reason: collision with root package name */
    public f[] f14787n = new f[UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT];

    /* renamed from: o, reason: collision with root package name */
    public int f14788o = 0;

    /* renamed from: g, reason: collision with root package name */
    public b[] f14781g = new b[32];

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, y.b, y.d] */
    public c() {
        s();
        j jVar = new j(21);
        jVar.f9355y = new s0.c();
        jVar.f9356z = new s0.c();
        jVar.A = new f[32];
        this.f14786m = jVar;
        ?? bVar = new b(jVar);
        bVar.f14790f = new f[128];
        bVar.f14791g = new f[128];
        bVar.f14792h = 0;
        bVar.f14793i = new l((Object) bVar, 29);
        this.f14778d = bVar;
        this.f14789p = new b(jVar);
    }

    public static int n(Object obj) {
        f fVar = ((a0.c) obj).f29i;
        if (fVar != null) {
            return (int) (fVar.B + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final f a(int i6) {
        s0.c cVar = (s0.c) this.f14786m.f9356z;
        int i10 = cVar.f11962b;
        f fVar = null;
        if (i10 > 0) {
            int i11 = i10 - 1;
            ?? r32 = cVar.f11961a;
            ?? r42 = r32[i11];
            r32[i11] = 0;
            cVar.f11962b = i11;
            fVar = r42;
        }
        f fVar2 = fVar;
        if (fVar2 == null) {
            fVar2 = new f(i6);
            fVar2.I = i6;
        } else {
            fVar2.c();
            fVar2.I = i6;
        }
        int i12 = this.f14788o;
        int i13 = this.f14775a;
        if (i12 >= i13) {
            int i14 = i13 * 2;
            this.f14775a = i14;
            this.f14787n = (f[]) Arrays.copyOf(this.f14787n, i14);
        }
        f[] fVarArr = this.f14787n;
        int i15 = this.f14788o;
        this.f14788o = i15 + 1;
        fVarArr[i15] = fVar2;
        return fVar2;
    }

    public final void b(f fVar, f fVar2, int i6, float f3, f fVar3, f fVar4, int i10, int i11) {
        b l10 = l();
        if (fVar2 == fVar3) {
            l10.f14772d.g(fVar, 1.0f);
            l10.f14772d.g(fVar4, 1.0f);
            l10.f14772d.g(fVar2, -2.0f);
        } else if (f3 == 0.5f) {
            l10.f14772d.g(fVar, 1.0f);
            l10.f14772d.g(fVar2, -1.0f);
            l10.f14772d.g(fVar3, -1.0f);
            l10.f14772d.g(fVar4, 1.0f);
            if (i6 > 0 || i10 > 0) {
                l10.f14770b = (-i6) + i10;
            }
        } else if (f3 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            l10.f14772d.g(fVar, -1.0f);
            l10.f14772d.g(fVar2, 1.0f);
            l10.f14770b = i6;
        } else if (f3 >= 1.0f) {
            l10.f14772d.g(fVar4, -1.0f);
            l10.f14772d.g(fVar3, 1.0f);
            l10.f14770b = -i10;
        } else {
            float f10 = 1.0f - f3;
            l10.f14772d.g(fVar, f10 * 1.0f);
            l10.f14772d.g(fVar2, f10 * (-1.0f));
            l10.f14772d.g(fVar3, (-1.0f) * f3);
            l10.f14772d.g(fVar4, 1.0f * f3);
            if (i6 > 0 || i10 > 0) {
                l10.f14770b = (i10 * f3) + ((-i6) * f10);
            }
        }
        if (i11 != 8) {
            l10.a(this, i11);
        }
        c(l10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d5, code lost:
    
        if (r4.H <= 1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d7, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d9, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e3, code lost:
    
        if (r4.H <= 1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00fa, code lost:
    
        if (r4.H <= 1) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00fc, code lost:
    
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00fe, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0108, code lost:
    
        if (r4.H <= 1) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(y.b r18) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y.c.c(y.b):void");
    }

    public final void d(f fVar, int i6) {
        int i10 = fVar.f14797z;
        if (i10 == -1) {
            fVar.d(this, i6);
            for (int i11 = 0; i11 < this.f14777c + 1; i11++) {
                f fVar2 = ((f[]) this.f14786m.A)[i11];
            }
            return;
        }
        if (i10 != -1) {
            b bVar = this.f14781g[i10];
            if (bVar.f14773e) {
                bVar.f14770b = i6;
                return;
            }
            if (bVar.f14772d.d() == 0) {
                bVar.f14773e = true;
                bVar.f14770b = i6;
                return;
            }
            b l10 = l();
            if (i6 < 0) {
                l10.f14770b = i6 * (-1);
                l10.f14772d.g(fVar, 1.0f);
            } else {
                l10.f14770b = i6;
                l10.f14772d.g(fVar, -1.0f);
            }
            c(l10);
            return;
        }
        b l11 = l();
        l11.f14769a = fVar;
        float f3 = i6;
        fVar.B = f3;
        l11.f14770b = f3;
        l11.f14773e = true;
        c(l11);
    }

    public final void e(f fVar, f fVar2, int i6, int i10) {
        if (i10 == 8 && fVar2.C && fVar.f14797z == -1) {
            fVar.d(this, fVar2.B + i6);
            return;
        }
        b l10 = l();
        boolean z10 = false;
        if (i6 != 0) {
            if (i6 < 0) {
                i6 *= -1;
                z10 = true;
            }
            l10.f14770b = i6;
        }
        if (!z10) {
            l10.f14772d.g(fVar, -1.0f);
            l10.f14772d.g(fVar2, 1.0f);
        } else {
            l10.f14772d.g(fVar, 1.0f);
            l10.f14772d.g(fVar2, -1.0f);
        }
        if (i10 != 8) {
            l10.a(this, i10);
        }
        c(l10);
    }

    public final void f(f fVar, f fVar2, int i6, int i10) {
        b l10 = l();
        f m9 = m();
        m9.A = 0;
        l10.b(fVar, fVar2, m9, i6);
        if (i10 != 8) {
            l10.f14772d.g(j(i10), (int) (l10.f14772d.c(m9) * (-1.0f)));
        }
        c(l10);
    }

    public final void g(f fVar, f fVar2, int i6, int i10) {
        b l10 = l();
        f m9 = m();
        m9.A = 0;
        l10.c(fVar, fVar2, m9, i6);
        if (i10 != 8) {
            l10.f14772d.g(j(i10), (int) (l10.f14772d.c(m9) * (-1.0f)));
        }
        c(l10);
    }

    public final void h(b bVar) {
        int i6;
        if (bVar.f14773e) {
            bVar.f14769a.d(this, bVar.f14770b);
        } else {
            b[] bVarArr = this.f14781g;
            int i10 = this.f14784k;
            bVarArr[i10] = bVar;
            f fVar = bVar.f14769a;
            fVar.f14797z = i10;
            this.f14784k = i10 + 1;
            fVar.e(this, bVar);
        }
        if (this.f14776b) {
            int i11 = 0;
            while (i11 < this.f14784k) {
                if (this.f14781g[i11] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f14781g[i11];
                if (bVar2 != null && bVar2.f14773e) {
                    bVar2.f14769a.d(this, bVar2.f14770b);
                    ((s0.c) this.f14786m.f9355y).b(bVar2);
                    this.f14781g[i11] = null;
                    int i12 = i11 + 1;
                    int i13 = i12;
                    while (true) {
                        i6 = this.f14784k;
                        if (i12 >= i6) {
                            break;
                        }
                        b[] bVarArr2 = this.f14781g;
                        int i14 = i12 - 1;
                        b bVar3 = bVarArr2[i12];
                        bVarArr2[i14] = bVar3;
                        f fVar2 = bVar3.f14769a;
                        if (fVar2.f14797z == i12) {
                            fVar2.f14797z = i14;
                        }
                        i13 = i12;
                        i12++;
                    }
                    if (i13 < i6) {
                        this.f14781g[i13] = null;
                    }
                    this.f14784k = i6 - 1;
                    i11--;
                }
                i11++;
            }
            this.f14776b = false;
        }
    }

    public final void i() {
        for (int i6 = 0; i6 < this.f14784k; i6++) {
            b bVar = this.f14781g[i6];
            bVar.f14769a.B = bVar.f14770b;
        }
    }

    public final f j(int i6) {
        if (this.j + 1 >= this.f14780f) {
            o();
        }
        f a10 = a(4);
        float[] fArr = a10.E;
        int i10 = this.f14777c + 1;
        this.f14777c = i10;
        this.j++;
        a10.f14796y = i10;
        a10.A = i6;
        ((f[]) this.f14786m.A)[i10] = a10;
        d dVar = this.f14778d;
        dVar.f14793i.f12251y = a10;
        Arrays.fill(fArr, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        fArr[a10.A] = 1.0f;
        dVar.j(a10);
        return a10;
    }

    public final f k(Object obj) {
        if (obj != null) {
            if (this.j + 1 >= this.f14780f) {
                o();
            }
            if (obj instanceof a0.c) {
                a0.c cVar = (a0.c) obj;
                f fVar = cVar.f29i;
                if (fVar == null) {
                    cVar.k();
                    fVar = cVar.f29i;
                }
                int i6 = fVar.f14796y;
                j jVar = this.f14786m;
                if (i6 != -1 && i6 <= this.f14777c && ((f[]) jVar.A)[i6] != null) {
                    return fVar;
                }
                if (i6 != -1) {
                    fVar.c();
                }
                int i10 = this.f14777c + 1;
                this.f14777c = i10;
                this.j++;
                fVar.f14796y = i10;
                fVar.I = 1;
                ((f[]) jVar.A)[i10] = fVar;
                return fVar;
            }
            return null;
        }
        return null;
    }

    public final b l() {
        Object obj;
        j jVar = this.f14786m;
        s0.c cVar = (s0.c) jVar.f9355y;
        int i6 = cVar.f11962b;
        if (i6 > 0) {
            int i10 = i6 - 1;
            Object[] objArr = cVar.f11961a;
            obj = objArr[i10];
            objArr[i10] = null;
            cVar.f11962b = i10;
        } else {
            obj = null;
        }
        b bVar = (b) obj;
        if (bVar == null) {
            return new b(jVar);
        }
        bVar.f14769a = null;
        bVar.f14772d.b();
        bVar.f14770b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        bVar.f14773e = false;
        return bVar;
    }

    public final f m() {
        if (this.j + 1 >= this.f14780f) {
            o();
        }
        f a10 = a(3);
        int i6 = this.f14777c + 1;
        this.f14777c = i6;
        this.j++;
        a10.f14796y = i6;
        ((f[]) this.f14786m.A)[i6] = a10;
        return a10;
    }

    public final void o() {
        int i6 = this.f14779e * 2;
        this.f14779e = i6;
        this.f14781g = (b[]) Arrays.copyOf(this.f14781g, i6);
        j jVar = this.f14786m;
        jVar.A = (f[]) Arrays.copyOf((f[]) jVar.A, this.f14779e);
        int i10 = this.f14779e;
        this.f14783i = new boolean[i10];
        this.f14780f = i10;
        this.f14785l = i10;
    }

    public final void p() {
        d dVar = this.f14778d;
        if (dVar.e()) {
            i();
            return;
        }
        if (this.f14782h) {
            for (int i6 = 0; i6 < this.f14784k; i6++) {
                if (!this.f14781g[i6].f14773e) {
                    q(dVar);
                    return;
                }
            }
            i();
            return;
        }
        q(dVar);
    }

    public final void q(d dVar) {
        int i6 = 0;
        while (true) {
            if (i6 >= this.f14784k) {
                break;
            }
            b bVar = this.f14781g[i6];
            int i10 = 1;
            if (bVar.f14769a.I != 1) {
                float f3 = bVar.f14770b;
                float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    boolean z10 = false;
                    int i11 = 0;
                    while (!z10) {
                        i11 += i10;
                        float f11 = Float.MAX_VALUE;
                        int i12 = 0;
                        int i13 = -1;
                        int i14 = -1;
                        int i15 = 0;
                        while (i12 < this.f14784k) {
                            b bVar2 = this.f14781g[i12];
                            if (bVar2.f14769a.I != i10 && !bVar2.f14773e && bVar2.f14770b < f10) {
                                int d10 = bVar2.f14772d.d();
                                int i16 = 0;
                                while (i16 < d10) {
                                    f e10 = bVar2.f14772d.e(i16);
                                    float c10 = bVar2.f14772d.c(e10);
                                    if (c10 > f10) {
                                        for (int i17 = 0; i17 < 9; i17++) {
                                            float f12 = e10.D[i17] / c10;
                                            if ((f12 < f11 && i17 == i15) || i17 > i15) {
                                                i15 = i17;
                                                i14 = e10.f14796y;
                                                i13 = i12;
                                                f11 = f12;
                                            }
                                        }
                                    }
                                    i16++;
                                    f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                }
                            }
                            i12++;
                            f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            i10 = 1;
                        }
                        if (i13 != -1) {
                            b bVar3 = this.f14781g[i13];
                            bVar3.f14769a.f14797z = -1;
                            bVar3.g(((f[]) this.f14786m.A)[i14]);
                            f fVar = bVar3.f14769a;
                            fVar.f14797z = i13;
                            fVar.e(this, bVar3);
                        } else {
                            z10 = true;
                        }
                        if (i11 > this.j / 2) {
                            z10 = true;
                        }
                        f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        i10 = 1;
                    }
                }
            }
            i6++;
        }
        r(dVar);
        i();
    }

    public final void r(b bVar) {
        boolean z10;
        for (int i6 = 0; i6 < this.j; i6++) {
            this.f14783i[i6] = false;
        }
        boolean z11 = false;
        int i10 = 0;
        while (!z11) {
            int i11 = 1;
            i10++;
            if (i10 < this.j * 2) {
                f fVar = bVar.f14769a;
                if (fVar != null) {
                    this.f14783i[fVar.f14796y] = true;
                }
                f d10 = bVar.d(this.f14783i);
                if (d10 != null) {
                    boolean[] zArr = this.f14783i;
                    int i12 = d10.f14796y;
                    if (!zArr[i12]) {
                        zArr[i12] = true;
                    } else {
                        return;
                    }
                }
                if (d10 != null) {
                    float f3 = Float.MAX_VALUE;
                    int i13 = 0;
                    int i14 = -1;
                    while (i13 < this.f14784k) {
                        b bVar2 = this.f14781g[i13];
                        if (bVar2.f14769a.I != i11 && !bVar2.f14773e) {
                            a aVar = bVar2.f14772d;
                            int i15 = aVar.f14767h;
                            if (i15 != -1) {
                                for (int i16 = 0; i15 != -1 && i16 < aVar.f14760a; i16++) {
                                    if (aVar.f14764e[i15] == d10.f14796y) {
                                        z10 = true;
                                        break;
                                    }
                                    i15 = aVar.f14765f[i15];
                                }
                            }
                            z10 = false;
                            if (z10) {
                                float c10 = bVar2.f14772d.c(d10);
                                if (c10 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    float f10 = (-bVar2.f14770b) / c10;
                                    if (f10 < f3) {
                                        f3 = f10;
                                        i14 = i13;
                                    }
                                }
                            }
                        }
                        i13++;
                        i11 = 1;
                    }
                    if (i14 > -1) {
                        b bVar3 = this.f14781g[i14];
                        bVar3.f14769a.f14797z = -1;
                        bVar3.g(d10);
                        f fVar2 = bVar3.f14769a;
                        fVar2.f14797z = i14;
                        fVar2.e(this, bVar3);
                    }
                } else {
                    z11 = true;
                }
            } else {
                return;
            }
        }
    }

    public final void s() {
        for (int i6 = 0; i6 < this.f14784k; i6++) {
            b bVar = this.f14781g[i6];
            if (bVar != null) {
                ((s0.c) this.f14786m.f9355y).b(bVar);
            }
            this.f14781g[i6] = null;
        }
    }

    public final void t() {
        j jVar;
        int i6 = 0;
        while (true) {
            jVar = this.f14786m;
            f[] fVarArr = (f[]) jVar.A;
            if (i6 >= fVarArr.length) {
                break;
            }
            f fVar = fVarArr[i6];
            if (fVar != null) {
                fVar.c();
            }
            i6++;
        }
        s0.c cVar = (s0.c) jVar.f9356z;
        f[] fVarArr2 = this.f14787n;
        int i10 = this.f14788o;
        cVar.getClass();
        if (i10 > fVarArr2.length) {
            i10 = fVarArr2.length;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            f fVar2 = fVarArr2[i11];
            int i12 = cVar.f11962b;
            Object[] objArr = cVar.f11961a;
            if (i12 < objArr.length) {
                objArr[i12] = fVar2;
                cVar.f11962b = i12 + 1;
            }
        }
        this.f14788o = 0;
        Arrays.fill((f[]) jVar.A, (Object) null);
        this.f14777c = 0;
        d dVar = this.f14778d;
        dVar.f14792h = 0;
        dVar.f14770b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.j = 1;
        for (int i13 = 0; i13 < this.f14784k; i13++) {
            b bVar = this.f14781g[i13];
        }
        s();
        this.f14784k = 0;
        this.f14789p = new b(jVar);
    }
}
