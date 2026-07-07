package t1;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p0 f12110a = new p0();

    static {
        w1.b0.H(0);
        w1.b0.H(1);
        w1.b0.H(2);
    }

    public int a(boolean z2) {
        return p() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z2) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i, q0 q0Var, r0 r0Var, int i10, boolean z2) {
        int i11 = f(i, q0Var, false).f12088c;
        if (m(i11, r0Var, 0L).f12107o != i) {
            return i + 1;
        }
        int iE = e(i11, i10, z2);
        if (iE == -1) {
            return -1;
        }
        return m(iE, r0Var, 0L).f12106n;
    }

    public int e(int i, int i10, boolean z2) {
        if (i10 == 0) {
            if (i == c(z2)) {
                return -1;
            }
            return i + 1;
        }
        if (i10 == 1) {
            return i;
        }
        if (i10 == 2) {
            return i == c(z2) ? a(z2) : i + 1;
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        int iC;
        if (this != obj) {
            if (obj instanceof s0) {
                s0 s0Var = (s0) obj;
                if (s0Var.o() == o() && s0Var.h() == h()) {
                    r0 r0Var = new r0();
                    q0 q0Var = new q0();
                    r0 r0Var2 = new r0();
                    q0 q0Var2 = new q0();
                    int i = 0;
                    while (true) {
                        if (i >= o()) {
                            int i10 = 0;
                            while (true) {
                                if (i10 >= h()) {
                                    int iA = a(true);
                                    if (iA == s0Var.a(true) && (iC = c(true)) == s0Var.c(true)) {
                                        while (iA != iC) {
                                            int iE = e(iA, 0, true);
                                            if (iE == s0Var.e(iA, 0, true)) {
                                                iA = iE;
                                            }
                                        }
                                    }
                                } else {
                                    if (!f(i10, q0Var, true).equals(s0Var.f(i10, q0Var2, true))) {
                                        break;
                                    }
                                    i10++;
                                }
                            }
                        } else {
                            if (!m(i, r0Var, 0L).equals(s0Var.m(i, r0Var2, 0L))) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract q0 f(int i, q0 q0Var, boolean z2);

    public q0 g(Object obj, q0 q0Var) {
        return f(b(obj), q0Var, true);
    }

    public abstract int h();

    public int hashCode() {
        r0 r0Var = new r0();
        q0 q0Var = new q0();
        int iO = o() + 217;
        for (int i = 0; i < o(); i++) {
            iO = (iO * 31) + m(i, r0Var, 0L).hashCode();
        }
        int iH = h() + (iO * 31);
        for (int i10 = 0; i10 < h(); i10++) {
            iH = (iH * 31) + f(i10, q0Var, true).hashCode();
        }
        int iA = a(true);
        while (iA != -1) {
            iH = (iH * 31) + iA;
            iA = e(iA, 0, true);
        }
        return iH;
    }

    public final Pair i(r0 r0Var, q0 q0Var, int i, long j8) {
        Pair pairJ = j(r0Var, q0Var, i, j8, 0L);
        pairJ.getClass();
        return pairJ;
    }

    public final Pair j(r0 r0Var, q0 q0Var, int i, long j8, long j9) {
        w1.a.g(i, o());
        m(i, r0Var, j9);
        if (j8 == -9223372036854775807L) {
            j8 = r0Var.f12104l;
            if (j8 == -9223372036854775807L) {
                return null;
            }
        }
        int i10 = r0Var.f12106n;
        f(i10, q0Var, false);
        while (i10 < r0Var.f12107o && q0Var.f12090e != j8) {
            int i11 = i10 + 1;
            if (f(i11, q0Var, false).f12090e > j8) {
                break;
            }
            i10 = i11;
        }
        f(i10, q0Var, true);
        long jMin = j8 - q0Var.f12090e;
        long j10 = q0Var.f12089d;
        if (j10 != -9223372036854775807L) {
            jMin = Math.min(jMin, j10 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = q0Var.f12087b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public int k(int i, int i10, boolean z2) {
        if (i10 == 0) {
            if (i == a(z2)) {
                return -1;
            }
            return i - 1;
        }
        if (i10 == 1) {
            return i;
        }
        if (i10 == 2) {
            return i == a(z2) ? c(z2) : i - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object l(int i);

    public abstract r0 m(int i, r0 r0Var, long j8);

    public final void n(int i, r0 r0Var) {
        m(i, r0Var, 0L);
    }

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}
