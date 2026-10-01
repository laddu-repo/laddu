package g4;

import ef.g;
import r1.l0;
import u1.t;
import y2.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f5449a = {0, 0, 0, 0, 16, 0, Byte.MIN_VALUE, 0, 0, -86, 0, 56, -101, 113};

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f5450b = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static boolean a(p pVar) {
        t tVar = new t(8);
        int i6 = g.b(pVar, tVar).f4580a;
        if (i6 != 1380533830 && i6 != 1380333108) {
            return false;
        }
        pVar.C(tVar.f12811a, 0, 4);
        tVar.K(0);
        int k8 = tVar.k();
        if (k8 != 1463899717) {
            u1.a.g("WavHeaderReader", "Unsupported form type: " + k8);
            return false;
        }
        return true;
    }

    public static g b(int i6, p pVar, t tVar) {
        g b10 = g.b(pVar, tVar);
        while (true) {
            int i10 = b10.f4580a;
            if (i10 != i6) {
                h8.c.p(i10, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
                long j = b10.f4581b;
                long j10 = 8 + j;
                if (j % 2 != 0) {
                    j10 = 9 + j;
                }
                if (j10 <= 2147483647L) {
                    pVar.w((int) j10);
                    b10 = g.b(pVar, tVar);
                } else {
                    throw l0.c("Chunk is too large (~2GB+) to skip; id: " + i10);
                }
            } else {
                return b10;
            }
        }
    }
}
