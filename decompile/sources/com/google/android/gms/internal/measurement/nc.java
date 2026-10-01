package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class nc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final nc f2930b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y9.k0 f2931a;

    static {
        int i = y9.k0.A;
        f2930b = new nc(y9.g1.C);
    }

    public nc(y9.k0 k0Var) {
        this.f2931a = k0Var;
    }

    public static nc a(w0 w0Var) throws u1 {
        long j8;
        String strC;
        mc mcVar;
        int iM = w0Var.M();
        if (iM < 0) {
            throw new u1("Negative number of flags");
        }
        int i = y9.k0.A;
        y9.j0 j0Var = new y9.j0();
        long j9 = 0;
        for (int i10 = 0; i10 < iM; i10++) {
            long jN = w0Var.N();
            int i11 = (int) jN;
            long j10 = jN >>> 3;
            if (j10 == 0) {
                j8 = 0;
                strC = w0Var.C();
            } else {
                long j11 = j10 + j9;
                if (j11 > 2305843009213693951L) {
                    throw new u1("Flag name larger than max size");
                }
                j8 = j11;
                strC = null;
            }
            int i12 = i11 & 7;
            if (i12 == 0 || i12 == 1) {
                mcVar = new mc(j8, strC, i12, 0L, null);
            } else if (i12 == 2) {
                mcVar = new mc(j8, strC, i12, w0Var.N(), null);
            } else if (i12 == 3) {
                mcVar = new mc(j8, strC, i12, Double.doubleToRawLongBits(w0Var.t()), null);
            } else if (i12 == 4) {
                mcVar = new mc(j8, strC, i12, 0L, w0Var.C());
            } else {
                if (i12 != 5) {
                    throw new u1(u5.a.b(i12, "Unrecognized flag type ", new StringBuilder(String.valueOf(i12).length() + 23)));
                }
                mcVar = new mc(j8, strC, i12, 0L, w0Var.F());
            }
            long j12 = mcVar.f2893v;
            if (j12 != 0) {
                j9 = j12;
            }
            j0Var.a(mcVar);
        }
        return new nc(j0Var.i());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nc)) {
            return false;
        }
        return this.f2931a.equals(((nc) obj).f2931a);
    }

    public final int hashCode() {
        y9.k0 k0Var = this.f2931a;
        k0Var.getClass();
        return y9.p.n(k0Var);
    }
}
