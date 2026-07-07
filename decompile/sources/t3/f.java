package t3;

import java.io.EOFException;
import r1.l0;
import u1.t;
import y2.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f12581a;

    /* renamed from: b, reason: collision with root package name */
    public long f12582b;

    /* renamed from: c, reason: collision with root package name */
    public int f12583c;

    /* renamed from: d, reason: collision with root package name */
    public int f12584d;

    /* renamed from: e, reason: collision with root package name */
    public int f12585e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f12586f = new int[255];

    /* renamed from: g, reason: collision with root package name */
    public final t f12587g = new t(255);

    public final boolean a(p pVar, boolean z10) {
        boolean z11;
        boolean z12;
        this.f12581a = 0;
        this.f12582b = 0L;
        this.f12583c = 0;
        this.f12584d = 0;
        this.f12585e = 0;
        t tVar = this.f12587g;
        tVar.H(27);
        try {
            z11 = pVar.k(tVar.f12811a, 0, 27, z10);
        } catch (EOFException e10) {
            if (z10) {
                z11 = false;
            } else {
                throw e10;
            }
        }
        if (z11 && tVar.A() == 1332176723) {
            if (tVar.y() != 0) {
                if (!z10) {
                    throw l0.c("unsupported bit stream revision");
                }
            } else {
                this.f12581a = tVar.y();
                this.f12582b = tVar.n();
                tVar.p();
                tVar.p();
                tVar.p();
                int y9 = tVar.y();
                this.f12583c = y9;
                this.f12584d = y9 + 27;
                tVar.H(y9);
                try {
                    z12 = pVar.k(tVar.f12811a, 0, this.f12583c, z10);
                } catch (EOFException e11) {
                    if (z10) {
                        z12 = false;
                    } else {
                        throw e11;
                    }
                }
                if (z12) {
                    for (int i6 = 0; i6 < this.f12583c; i6++) {
                        int y10 = tVar.y();
                        this.f12586f[i6] = y10;
                        this.f12585e += y10;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(p pVar, long j) {
        boolean z10;
        boolean z11;
        if (pVar.getPosition() == pVar.l()) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.b(z10);
        t tVar = this.f12587g;
        tVar.H(4);
        while (true) {
            if (j != -1 && pVar.getPosition() + 4 >= j) {
                break;
            }
            try {
                z11 = pVar.k(tVar.f12811a, 0, 4, true);
            } catch (EOFException unused) {
                z11 = false;
            }
            if (!z11) {
                break;
            }
            tVar.K(0);
            if (tVar.A() == 1332176723) {
                pVar.v();
                return true;
            }
            pVar.w(1);
        }
        do {
            if (j != -1 && pVar.getPosition() >= j) {
                break;
            }
        } while (pVar.p(1) != -1);
        return false;
    }
}
