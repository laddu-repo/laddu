package q2;

import android.net.Uri;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t implements w1.h {
    public final byte[] A;
    public int B;

    /* renamed from: x, reason: collision with root package name */
    public final w1.h f10961x;

    /* renamed from: y, reason: collision with root package name */
    public final int f10962y;

    /* renamed from: z, reason: collision with root package name */
    public final p0 f10963z;

    public t(w1.h hVar, int i6, p0 p0Var) {
        boolean z10;
        if (i6 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.b(z10);
        this.f10961x = hVar;
        this.f10962y = i6;
        this.f10963z = p0Var;
        this.A = new byte[1];
        this.B = i6;
    }

    @Override // w1.h
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // w1.h
    public final void q(w1.a0 a0Var) {
        a0Var.getClass();
        this.f10961x.q(a0Var);
    }

    @Override // r1.i
    public final int read(byte[] bArr, int i6, int i10) {
        long max;
        int i11 = this.B;
        w1.h hVar = this.f10961x;
        if (i11 == 0) {
            byte[] bArr2 = this.A;
            int i12 = 0;
            if (hVar.read(bArr2, 0, 1) != -1) {
                int i13 = (bArr2[0] & 255) << 4;
                if (i13 != 0) {
                    byte[] bArr3 = new byte[i13];
                    int i14 = i13;
                    while (i14 > 0) {
                        int read = hVar.read(bArr3, i12, i14);
                        if (read != -1) {
                            i12 += read;
                            i14 -= read;
                        }
                    }
                    while (i13 > 0 && bArr3[i13 - 1] == 0) {
                        i13--;
                    }
                    if (i13 > 0) {
                        u1.t tVar = new u1.t(i13, bArr3);
                        p0 p0Var = this.f10963z;
                        if (!p0Var.I) {
                            max = p0Var.F;
                        } else {
                            max = Math.max(p0Var.J.u(true), p0Var.F);
                        }
                        long j = max;
                        int a10 = tVar.a();
                        y2.f0 f0Var = p0Var.H;
                        f0Var.getClass();
                        f0Var.a(a10, tVar);
                        f0Var.c(j, 1, a10, 0, null);
                        p0Var.I = true;
                    }
                }
                this.B = this.f10962y;
            }
            return -1;
        }
        int read2 = hVar.read(bArr, i6, Math.min(this.B, i10));
        if (read2 != -1) {
            this.B -= read2;
        }
        return read2;
    }

    @Override // w1.h
    public final Map u() {
        return this.f10961x.u();
    }

    @Override // w1.h
    public final long y(w1.l lVar) {
        throw new UnsupportedOperationException();
    }

    @Override // w1.h
    public final Uri z() {
        return this.f10961x.z();
    }
}
