package t2;

import db.a1;
import db.k0;
import db.z;
import db.z0;
import okhttp3.HttpUrl;
import r1.e1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m extends o implements Comparable {
    public final int B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final boolean J;

    public m(int i6, e1 e1Var, int i10, k kVar, int i11, String str, String str2) {
        super(i6, e1Var, i10);
        boolean z10;
        boolean z11;
        k0 k0Var;
        int i12;
        int i13;
        boolean z12;
        boolean z13;
        boolean z14;
        int i14 = 0;
        this.C = r4.a.f(i11, false);
        int i15 = this.A.f11662e;
        int i16 = kVar.f11561y;
        k0 k0Var2 = kVar.f11558v;
        int i17 = i15 & (~i16);
        if ((i17 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.D = z10;
        if ((i17 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.E = z11;
        if (str2 != null) {
            k0Var = k0.o(str2);
        } else if (k0Var2.isEmpty()) {
            k0Var = k0.o(HttpUrl.FRAGMENT_ENCODE_SET);
        } else {
            k0Var = k0Var2;
        }
        int i18 = 0;
        while (true) {
            if (i18 < k0Var.size()) {
                i12 = q.d(this.A, (String) k0Var.get(i18), kVar.f11562z);
                if (i12 > 0) {
                    break;
                } else {
                    i18++;
                }
            } else {
                i18 = Integer.MAX_VALUE;
                i12 = 0;
                break;
            }
        }
        this.F = i18;
        this.G = i12;
        if (str2 != null) {
            i13 = 1088;
        } else {
            i13 = kVar.f11559w;
        }
        int i19 = this.A.f11663f;
        a1 a1Var = q.f12544k;
        int bitCount = (i19 == 0 || i19 != i13) ? Integer.bitCount(i13 & i19) : Integer.MAX_VALUE;
        this.H = bitCount;
        if ((1088 & this.A.f11663f) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.J = z12;
        if (q.g(str) == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        int d10 = q.d(this.A, str, z13);
        this.I = d10;
        if (i12 <= 0 && ((!k0Var2.isEmpty() || bitCount <= 0) && !this.D && (!this.E || d10 <= 0))) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (r4.a.f(i11, kVar.f12536t0) && z14) {
            i14 = 1;
        }
        this.B = i14;
    }

    @Override // t2.o
    public final int a() {
        return this.B;
    }

    @Override // t2.o
    public final /* bridge */ /* synthetic */ boolean b(o oVar) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(m mVar) {
        z c10 = z.f4060a.c(this.C, mVar.C);
        Integer valueOf = Integer.valueOf(this.F);
        Integer valueOf2 = Integer.valueOf(mVar.F);
        z0 z0Var = z0.f4063y;
        z0 z0Var2 = z0.f4064z;
        z b10 = c10.b(valueOf, valueOf2, z0Var2);
        int i6 = mVar.G;
        int i10 = this.G;
        z a10 = b10.a(i10, i6);
        int i11 = mVar.H;
        int i12 = this.H;
        z c11 = a10.a(i12, i11).c(this.D, mVar.D);
        Boolean valueOf3 = Boolean.valueOf(this.E);
        Boolean valueOf4 = Boolean.valueOf(mVar.E);
        if (i10 != 0) {
            z0Var = z0Var2;
        }
        z a11 = c11.b(valueOf3, valueOf4, z0Var).a(this.I, mVar.I);
        if (i12 == 0) {
            a11 = a11.d(this.J, mVar.J);
        }
        return a11.e();
    }
}
