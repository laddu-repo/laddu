package o2;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class n implements e1 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final y9.z0 f9486v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f9487w;

    public n(List list, List list2) {
        y9.b0 b0VarJ = y9.f0.j();
        w1.a.d(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            b0VarJ.a(new m((e1) list.get(i), (List) list2.get(i)));
        }
        this.f9486v = b0VarJ.g();
        this.f9487w = -9223372036854775807L;
    }

    @Override // o2.e1
    public final boolean c() {
        int i = 0;
        while (true) {
            y9.z0 z0Var = this.f9486v;
            if (i >= z0Var.f14639y) {
                return false;
            }
            if (((m) z0Var.get(i)).f9479v.c()) {
                return true;
            }
            i++;
        }
    }

    @Override // o2.e1
    public final boolean d(c2.v0 v0Var) {
        boolean zD;
        boolean z2 = false;
        do {
            long jH = h();
            if (jH == Long.MIN_VALUE) {
                return z2;
            }
            int i = 0;
            zD = false;
            while (true) {
                y9.z0 z0Var = this.f9486v;
                if (i >= z0Var.f14639y) {
                    break;
                }
                long jH2 = ((m) z0Var.get(i)).f9479v.h();
                boolean z10 = jH2 != Long.MIN_VALUE && jH2 <= v0Var.f1978a;
                if (jH2 == jH || z10) {
                    zD |= ((m) z0Var.get(i)).f9479v.d(v0Var);
                }
                i++;
            }
            z2 |= zD;
        } while (zD);
        return z2;
    }

    @Override // o2.e1
    public final long h() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            y9.z0 z0Var = this.f9486v;
            if (i >= z0Var.f14639y) {
                break;
            }
            long jH = ((m) z0Var.get(i)).f9479v.h();
            if (jH != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jH);
            }
            i++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // o2.e1
    public final long u() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            y9.z0 z0Var = this.f9486v;
            if (i >= z0Var.f14639y) {
                break;
            }
            m mVar = (m) z0Var.get(i);
            long jU = mVar.f9479v.u();
            y9.f0 f0Var = mVar.f9480w;
            if ((f0Var.contains(1) || f0Var.contains(2) || f0Var.contains(4)) && jU != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jU);
            }
            if (jU != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jU);
            }
            i++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.f9487w = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j8 = this.f9487w;
        return j8 != -9223372036854775807L ? j8 : jMin2;
    }

    @Override // o2.e1
    public final void x(long j8) {
        int i = 0;
        while (true) {
            y9.z0 z0Var = this.f9486v;
            if (i >= z0Var.f14639y) {
                return;
            }
            ((m) z0Var.get(i)).x(j8);
            i++;
        }
    }
}
