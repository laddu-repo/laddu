package p2;

import t1.o;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class l extends f {
    public final long E;

    public l(y1.h hVar, y1.k kVar, o oVar, int i, Object obj, long j8, long j9, long j10) {
        super(hVar, kVar, 1, oVar, i, obj, j8, j9);
        oVar.getClass();
        this.E = j10;
    }

    public long a() {
        long j8 = this.E;
        if (j8 != -1) {
            return j8 + 1;
        }
        return -1L;
    }

    public abstract boolean b();
}
