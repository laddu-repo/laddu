package y;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import n9.j;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class b {

    /* renamed from: d, reason: collision with root package name */
    public final a f14772d;

    /* renamed from: a, reason: collision with root package name */
    public f f14769a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f14770b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f14771c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f14773e = false;

    public b(j jVar) {
        this.f14772d = new a(this, jVar);
    }

    public final void a(c cVar, int i6) {
        this.f14772d.g(cVar.j(i6), 1.0f);
        this.f14772d.g(cVar.j(i6), -1.0f);
    }

    public final void b(f fVar, f fVar2, f fVar3, int i6) {
        boolean z10 = false;
        if (i6 != 0) {
            if (i6 < 0) {
                i6 *= -1;
                z10 = true;
            }
            this.f14770b = i6;
        }
        if (!z10) {
            this.f14772d.g(fVar, -1.0f);
            this.f14772d.g(fVar2, 1.0f);
            this.f14772d.g(fVar3, 1.0f);
        } else {
            this.f14772d.g(fVar, 1.0f);
            this.f14772d.g(fVar2, -1.0f);
            this.f14772d.g(fVar3, -1.0f);
        }
    }

    public final void c(f fVar, f fVar2, f fVar3, int i6) {
        boolean z10 = false;
        if (i6 != 0) {
            if (i6 < 0) {
                i6 *= -1;
                z10 = true;
            }
            this.f14770b = i6;
        }
        if (!z10) {
            this.f14772d.g(fVar, -1.0f);
            this.f14772d.g(fVar2, 1.0f);
            this.f14772d.g(fVar3, -1.0f);
        } else {
            this.f14772d.g(fVar, 1.0f);
            this.f14772d.g(fVar2, -1.0f);
            this.f14772d.g(fVar3, 1.0f);
        }
    }

    public f d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        if (this.f14769a == null && this.f14770b == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.f14772d.d() == 0) {
            return true;
        }
        return false;
    }

    public final f f(boolean[] zArr, f fVar) {
        int i6;
        int d10 = this.f14772d.d();
        f fVar2 = null;
        float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        for (int i10 = 0; i10 < d10; i10++) {
            float f10 = this.f14772d.f(i10);
            if (f10 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f e10 = this.f14772d.e(i10);
                if ((zArr == null || !zArr[e10.f14796y]) && e10 != fVar && (((i6 = e10.I) == 3 || i6 == 4) && f10 < f3)) {
                    f3 = f10;
                    fVar2 = e10;
                }
            }
        }
        return fVar2;
    }

    public final void g(f fVar) {
        f fVar2 = this.f14769a;
        if (fVar2 != null) {
            this.f14772d.g(fVar2, -1.0f);
            this.f14769a.f14797z = -1;
            this.f14769a = null;
        }
        float h4 = this.f14772d.h(fVar, true) * (-1.0f);
        this.f14769a = fVar;
        if (h4 == 1.0f) {
            return;
        }
        this.f14770b /= h4;
        a aVar = this.f14772d;
        int i6 = aVar.f14767h;
        for (int i10 = 0; i6 != -1 && i10 < aVar.f14760a; i10++) {
            float[] fArr = aVar.f14766g;
            fArr[i6] = fArr[i6] / h4;
            i6 = aVar.f14765f[i6];
        }
    }

    public final void h(c cVar, f fVar, boolean z10) {
        if (fVar.C) {
            float c10 = this.f14772d.c(fVar);
            this.f14770b = (fVar.B * c10) + this.f14770b;
            this.f14772d.h(fVar, z10);
            if (z10) {
                fVar.b(this);
            }
            if (this.f14772d.d() == 0) {
                this.f14773e = true;
                cVar.f14776b = true;
            }
        }
    }

    public void i(c cVar, b bVar, boolean z10) {
        a aVar = this.f14772d;
        aVar.getClass();
        float c10 = aVar.c(bVar.f14769a);
        aVar.h(bVar.f14769a, z10);
        a aVar2 = bVar.f14772d;
        int d10 = aVar2.d();
        for (int i6 = 0; i6 < d10; i6++) {
            f e10 = aVar2.e(i6);
            aVar.a(e10, aVar2.c(e10) * c10, z10);
        }
        this.f14770b = (bVar.f14770b * c10) + this.f14770b;
        if (z10) {
            bVar.f14769a.b(this);
        }
        if (this.f14769a != null && this.f14772d.d() == 0) {
            this.f14773e = true;
            cVar.f14776b = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            y.f r0 = r10.f14769a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            y.f r1 = r10.f14769a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = w8.k.c(r0, r1)
            float r1 = r10.f14770b
            r2 = 0
            r3 = 1
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L35
            java.lang.StringBuilder r0 = y.e.b(r0)
            float r1 = r10.f14770b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 1
            goto L36
        L35:
            r1 = 0
        L36:
            y.a r5 = r10.f14772d
            int r5 = r5.d()
        L3c:
            if (r2 >= r5) goto L9d
            y.a r6 = r10.f14772d
            y.f r6 = r6.e(r2)
            if (r6 != 0) goto L47
            goto L9a
        L47:
            y.a r7 = r10.f14772d
            float r7 = r7.f(r2)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 != 0) goto L52
            goto L9a
        L52:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L67
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto L77
            java.lang.String r1 = "- "
            java.lang.String r0 = w8.k.c(r0, r1)
        L64:
            float r7 = r7 * r9
            goto L77
        L67:
            if (r8 <= 0) goto L70
            java.lang.String r1 = " + "
            java.lang.String r0 = w8.k.c(r0, r1)
            goto L77
        L70:
            java.lang.String r1 = " - "
            java.lang.String r0 = w8.k.c(r0, r1)
            goto L64
        L77:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L82
            java.lang.String r0 = w8.k.c(r0, r6)
            goto L99
        L82:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L99:
            r1 = 1
        L9a:
            int r2 = r2 + 1
            goto L3c
        L9d:
            if (r1 != 0) goto La5
            java.lang.String r1 = "0.0"
            java.lang.String r0 = w8.k.c(r0, r1)
        La5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y.b.toString():java.lang.String");
    }
}
