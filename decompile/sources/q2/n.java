package q2;

import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n implements b1 {

    /* renamed from: x, reason: collision with root package name */
    public final db.c1 f10916x;

    /* renamed from: y, reason: collision with root package name */
    public long f10917y;

    public n(List list, List list2) {
        boolean z10;
        db.h0 j = db.k0.j();
        if (list.size() == list2.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.b(z10);
        for (int i6 = 0; i6 < list.size(); i6++) {
            j.a(new m((b1) list.get(i6), (List) list2.get(i6)));
        }
        this.f10916x = j.g();
        this.f10917y = -9223372036854775807L;
    }

    @Override // q2.b1
    public final boolean a() {
        int i6 = 0;
        while (true) {
            db.c1 c1Var = this.f10916x;
            if (i6 >= c1Var.A) {
                return false;
            }
            if (((m) c1Var.get(i6)).f10914x.a()) {
                return true;
            }
            i6++;
        }
    }

    @Override // q2.b1
    public final long e() {
        int i6 = 0;
        long j = Long.MAX_VALUE;
        while (true) {
            db.c1 c1Var = this.f10916x;
            if (i6 >= c1Var.A) {
                break;
            }
            long e10 = ((m) c1Var.get(i6)).f10914x.e();
            if (e10 != Long.MIN_VALUE) {
                j = Math.min(j, e10);
            }
            i6++;
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // q2.b1
    public final boolean f(a2.a1 a1Var) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        do {
            long e10 = e();
            if (e10 == Long.MIN_VALUE) {
                return z12;
            }
            int i6 = 0;
            z10 = false;
            while (true) {
                db.c1 c1Var = this.f10916x;
                if (i6 >= c1Var.A) {
                    break;
                }
                long e11 = ((m) c1Var.get(i6)).f10914x.e();
                if (e11 != Long.MIN_VALUE && e11 <= a1Var.f158a) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (e11 == e10 || z11) {
                    z10 |= ((m) c1Var.get(i6)).f10914x.f(a1Var);
                }
                i6++;
            }
            z12 |= z10;
        } while (z10);
        return z12;
    }

    @Override // q2.b1
    public final long r() {
        int i6 = 0;
        long j = Long.MAX_VALUE;
        long j10 = Long.MAX_VALUE;
        while (true) {
            db.c1 c1Var = this.f10916x;
            if (i6 >= c1Var.A) {
                break;
            }
            m mVar = (m) c1Var.get(i6);
            long r10 = mVar.f10914x.r();
            db.k0 k0Var = mVar.f10915y;
            if ((k0Var.contains(1) || k0Var.contains(2) || k0Var.contains(4)) && r10 != Long.MIN_VALUE) {
                j = Math.min(j, r10);
            }
            if (r10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, r10);
            }
            i6++;
        }
        if (j != Long.MAX_VALUE) {
            this.f10917y = j;
            return j;
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j11 = this.f10917y;
        if (j11 != -9223372036854775807L) {
            return j11;
        }
        return j10;
    }

    @Override // q2.b1
    public final void s(long j) {
        int i6 = 0;
        while (true) {
            db.c1 c1Var = this.f10916x;
            if (i6 < c1Var.A) {
                ((m) c1Var.get(i6)).s(j);
                i6++;
            } else {
                return;
            }
        }
    }
}
