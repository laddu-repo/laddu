package r2;

import r1.q;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class l extends e {
    public final long G;

    public l(w1.h hVar, w1.l lVar, q qVar, int i6, Object obj, long j, long j10, long j11) {
        super(hVar, lVar, 1, qVar, i6, obj, j, j10);
        qVar.getClass();
        this.G = j11;
    }

    public long a() {
        long j = this.G;
        if (j == -1) {
            return -1L;
        }
        return j + 1;
    }

    public abstract boolean b();
}
