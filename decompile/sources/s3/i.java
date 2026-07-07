package s3;

import u1.a0;
import y2.f0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f12069a;

    /* renamed from: d, reason: collision with root package name */
    public t f12072d;

    /* renamed from: e, reason: collision with root package name */
    public f f12073e;

    /* renamed from: f, reason: collision with root package name */
    public int f12074f;

    /* renamed from: g, reason: collision with root package name */
    public int f12075g;

    /* renamed from: h, reason: collision with root package name */
    public int f12076h;

    /* renamed from: i, reason: collision with root package name */
    public int f12077i;
    public final r1.q j;

    /* renamed from: m, reason: collision with root package name */
    public boolean f12080m;

    /* renamed from: b, reason: collision with root package name */
    public final s f12070b = new s();

    /* renamed from: c, reason: collision with root package name */
    public final u1.t f12071c = new u1.t();

    /* renamed from: k, reason: collision with root package name */
    public final u1.t f12078k = new u1.t(1);

    /* renamed from: l, reason: collision with root package name */
    public final u1.t f12079l = new u1.t();

    public i(f0 f0Var, t tVar, f fVar, r1.q qVar) {
        this.f12069a = f0Var;
        this.f12072d = tVar;
        this.f12073e = fVar;
        this.j = qVar;
        this.f12072d = tVar;
        this.f12073e = fVar;
        f0Var.f(qVar);
        e();
    }

    public final int a() {
        int i6;
        if (!this.f12080m) {
            i6 = this.f12072d.f12183g[this.f12074f];
        } else if (this.f12070b.j[this.f12074f]) {
            i6 = 1;
        } else {
            i6 = 0;
        }
        if (b() != null) {
            return i6 | 1073741824;
        }
        return i6;
    }

    public final r b() {
        if (this.f12080m) {
            s sVar = this.f12070b;
            f fVar = sVar.f12161a;
            String str = a0.f12750a;
            int i6 = fVar.f12061a;
            r rVar = sVar.f12172m;
            if (rVar == null) {
                r[] rVarArr = this.f12072d.f12177a.f12155l;
                if (rVarArr == null) {
                    rVar = null;
                } else {
                    rVar = rVarArr[i6];
                }
            }
            if (rVar != null && rVar.f12156a) {
                return rVar;
            }
        }
        return null;
    }

    public final boolean c() {
        this.f12074f++;
        if (!this.f12080m) {
            return false;
        }
        int i6 = this.f12075g + 1;
        this.f12075g = i6;
        int[] iArr = this.f12070b.f12167g;
        int i10 = this.f12076h;
        if (i6 != iArr[i10]) {
            return true;
        }
        this.f12076h = i10 + 1;
        this.f12075g = 0;
        return false;
    }

    public final int d(int i6, int i10) {
        u1.t tVar;
        boolean z10;
        boolean z11;
        int i11;
        r b10 = b();
        if (b10 == null) {
            return 0;
        }
        int i12 = b10.f12159d;
        s sVar = this.f12070b;
        if (i12 != 0) {
            tVar = sVar.f12173n;
        } else {
            byte[] bArr = b10.f12160e;
            String str = a0.f12750a;
            int length = bArr.length;
            u1.t tVar2 = this.f12079l;
            tVar2.I(length, bArr);
            i12 = bArr.length;
            tVar = tVar2;
        }
        int i13 = this.f12074f;
        if (sVar.f12170k && sVar.f12171l[i13]) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && i10 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        u1.t tVar3 = this.f12078k;
        byte[] bArr2 = tVar3.f12811a;
        if (z11) {
            i11 = 128;
        } else {
            i11 = 0;
        }
        bArr2[0] = (byte) (i11 | i12);
        tVar3.K(0);
        f0 f0Var = this.f12069a;
        f0Var.b(tVar3, 1, 1);
        f0Var.b(tVar, i12, 1);
        if (!z11) {
            return i12 + 1;
        }
        u1.t tVar4 = this.f12071c;
        if (!z10) {
            tVar4.H(8);
            byte[] bArr3 = tVar4.f12811a;
            bArr3[0] = 0;
            bArr3[1] = 1;
            bArr3[2] = (byte) 0;
            bArr3[3] = (byte) (i10 & 255);
            bArr3[4] = (byte) ((i6 >> 24) & 255);
            bArr3[5] = (byte) ((i6 >> 16) & 255);
            bArr3[6] = (byte) ((i6 >> 8) & 255);
            bArr3[7] = (byte) (i6 & 255);
            f0Var.b(tVar4, 8, 1);
            return i12 + 9;
        }
        u1.t tVar5 = sVar.f12173n;
        int E = tVar5.E();
        tVar5.L(-2);
        int i14 = (E * 6) + 2;
        if (i10 != 0) {
            tVar4.H(i14);
            byte[] bArr4 = tVar4.f12811a;
            tVar5.i(bArr4, 0, i14);
            int i15 = (((bArr4[2] & 255) << 8) | (bArr4[3] & 255)) + i10;
            bArr4[2] = (byte) ((i15 >> 8) & 255);
            bArr4[3] = (byte) (i15 & 255);
        } else {
            tVar4 = tVar5;
        }
        f0Var.b(tVar4, i14, 1);
        return i12 + 1 + i14;
    }

    public final void e() {
        s sVar = this.f12070b;
        sVar.f12164d = 0;
        sVar.f12175p = 0L;
        sVar.f12176q = false;
        sVar.f12170k = false;
        sVar.f12174o = false;
        sVar.f12172m = null;
        this.f12074f = 0;
        this.f12076h = 0;
        this.f12075g = 0;
        this.f12077i = 0;
        this.f12080m = false;
    }
}
