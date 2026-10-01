package o2;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class t implements y1.h {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final y1.h f9525v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f9526w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final r0 f9527x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final byte[] f9528y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f9529z;

    public t(y1.h hVar, int i, r0 r0Var) {
        w1.a.d(i > 0);
        this.f9525v = hVar;
        this.f9526w = i;
        this.f9527x = r0Var;
        this.f9528y = new byte[1];
        this.f9529z = i;
    }

    @Override // y1.h
    public final void a(y1.z zVar) {
        zVar.getClass();
        this.f9525v.a(zVar);
    }

    @Override // y1.h
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // y1.h
    public final long h(y1.k kVar) {
        throw new UnsupportedOperationException();
    }

    @Override // y1.h
    public final Map j() {
        return this.f9525v.j();
    }

    @Override // t1.g
    public final int read(byte[] bArr, int i, int i10) {
        int i11 = this.f9529z;
        y1.h hVar = this.f9525v;
        if (i11 == 0) {
            byte[] bArr2 = this.f9528y;
            int i12 = 0;
            if (hVar.read(bArr2, 0, 1) != -1) {
                int i13 = (bArr2[0] & 255) << 4;
                if (i13 != 0) {
                    byte[] bArr3 = new byte[i13];
                    int i14 = i13;
                    while (i14 > 0) {
                        int i15 = hVar.read(bArr3, i12, i14);
                        if (i15 != -1) {
                            i12 += i15;
                            i14 -= i15;
                        }
                    }
                    while (i13 > 0 && bArr3[i13 - 1] == 0) {
                        i13--;
                    }
                    if (i13 > 0) {
                        w1.t tVar = new w1.t(i13, bArr3);
                        r0 r0Var = this.f9527x;
                        long jMax = !r0Var.G ? r0Var.D : Math.max(r0Var.H.y(true), r0Var.D);
                        int iA = tVar.a();
                        w2.g0 g0Var = r0Var.F;
                        g0Var.getClass();
                        g0Var.d(iA, tVar);
                        g0Var.a(jMax, 1, iA, 0, null);
                        r0Var.G = true;
                    }
                }
                this.f9529z = this.f9526w;
            }
            return -1;
        }
        int i16 = hVar.read(bArr, i, Math.min(this.f9529z, i10));
        if (i16 != -1) {
            this.f9529z -= i16;
        }
        return i16;
    }

    @Override // y1.h
    public final Uri s() {
        return this.f9525v.s();
    }
}
