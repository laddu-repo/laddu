package q2;

import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h extends l1 {
    public final long I;
    public final long J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final ArrayList O;
    public final r1.c1 P;
    public f Q;
    public g R;
    public long S;
    public long T;

    public h(e eVar) {
        super(eVar.f10857a);
        this.I = eVar.f10858b;
        this.J = eVar.f10859c;
        this.K = eVar.f10860d;
        this.L = eVar.f10861e;
        this.M = eVar.f10862f;
        this.N = eVar.f10863g;
        this.O = new ArrayList();
        this.P = new r1.c1();
    }

    @Override // q2.l1
    public final void E(r1.d1 d1Var) {
        if (this.R != null) {
            return;
        }
        H(d1Var);
    }

    public final void H(r1.d1 d1Var) {
        long j;
        long j10;
        long j11;
        r1.c1 c1Var = this.P;
        d1Var.n(0, c1Var);
        long j12 = c1Var.f11341p;
        f fVar = this.Q;
        long j13 = this.J;
        long j14 = Long.MIN_VALUE;
        ArrayList arrayList = this.O;
        if (fVar != null && !arrayList.isEmpty() && !this.L) {
            j = this.S - j12;
            if (j13 != Long.MIN_VALUE) {
                j14 = this.T - j12;
            }
            j11 = j14;
        } else {
            boolean z10 = this.M;
            j = this.I;
            if (z10) {
                long j15 = c1Var.f11337l;
                j += j15;
                j10 = j15 + j13;
            } else {
                j10 = j13;
            }
            this.S = j12 + j;
            if (j13 != Long.MIN_VALUE) {
                j14 = j12 + j10;
            }
            this.T = j14;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                d dVar = (d) arrayList.get(i6);
                long j16 = this.S;
                long j17 = this.T;
                dVar.B = j16;
                dVar.C = j17;
            }
            j11 = j10;
        }
        try {
            f fVar2 = new f(d1Var, j, j11, this.N);
            this.Q = fVar2;
            p(fVar2);
        } catch (g e10) {
            this.R = e10;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((d) arrayList.get(i10)).D = this.R;
            }
        }
    }

    @Override // q2.a
    public final boolean a(r1.e0 e0Var) {
        a aVar = this.H;
        if (aVar.i().f11382e.equals(e0Var.f11382e) && aVar.a(e0Var)) {
            return true;
        }
        return false;
    }

    @Override // q2.a
    public final a0 c(c0 c0Var, u2.e eVar, long j) {
        d dVar = new d(this.H.c(c0Var, eVar, j), this.K, this.S, this.T);
        this.O.add(dVar);
        return dVar;
    }

    @Override // q2.l, q2.a
    public final void l() {
        g gVar = this.R;
        if (gVar == null) {
            super.l();
            return;
        }
        throw gVar;
    }

    @Override // q2.a
    public final void q(a0 a0Var) {
        ArrayList arrayList = this.O;
        u1.c.g(arrayList.remove(a0Var));
        this.H.q(((d) a0Var).f10842x);
        if (arrayList.isEmpty() && !this.L) {
            f fVar = this.Q;
            fVar.getClass();
            H(fVar.f10943e);
        }
    }

    @Override // q2.l, q2.a
    public final void s() {
        super.s();
        this.R = null;
        this.Q = null;
    }
}
