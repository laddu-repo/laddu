package o2;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h extends k1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f9438l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f9439m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f9440n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t1.r0 f9441o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public f f9442p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public g f9443q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f9444r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f9445s;

    public h(e eVar) {
        super(eVar.f9409a);
        this.f9438l = eVar.f9410b;
        this.f9439m = eVar.f9411c;
        this.f9440n = new ArrayList();
        this.f9441o = new t1.r0();
    }

    public final void C(t1.s0 s0Var) {
        long j8;
        t1.r0 r0Var = this.f9441o;
        s0Var.n(0, r0Var);
        long j9 = r0Var.f12108p;
        f fVar = this.f9442p;
        long j10 = this.f9438l;
        ArrayList arrayList = this.f9440n;
        if (fVar == null || arrayList.isEmpty()) {
            this.f9444r = j9;
            this.f9445s = j10 != Long.MIN_VALUE ? j9 + j10 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                d dVar = (d) arrayList.get(i);
                long j11 = this.f9444r;
                long j12 = this.f9445s;
                dVar.f9403z = j11;
                dVar.A = j12;
            }
            j8 = 0;
        } else {
            j8 = this.f9444r - j9;
            j10 = j10 == Long.MIN_VALUE ? Long.MIN_VALUE : this.f9445s - j9;
        }
        try {
            f fVar2 = new f(s0Var, j8, j10);
            this.f9442p = fVar2;
            m(fVar2);
        } catch (g e7) {
            this.f9443q = e7;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((d) arrayList.get(i10)).B = this.f9443q;
            }
        }
    }

    @Override // o2.a
    public final b0 b(d0 d0Var, s2.e eVar, long j8) {
        d dVar = new d(this.f9474k.b(d0Var, eVar, j8), this.f9439m, this.f9444r, this.f9445s);
        this.f9440n.add(dVar);
        return dVar;
    }

    @Override // o2.l, o2.a
    public final void j() throws g {
        g gVar = this.f9443q;
        if (gVar != null) {
            throw gVar;
        }
        super.j();
    }

    @Override // o2.a
    public final void n(b0 b0Var) {
        ArrayList arrayList = this.f9440n;
        w1.a.j(arrayList.remove(b0Var));
        this.f9474k.n(((d) b0Var).f9399v);
        if (arrayList.isEmpty()) {
            f fVar = this.f9442p;
            fVar.getClass();
            C(fVar.f9522b);
        }
    }

    @Override // o2.l, o2.a
    public final void p() {
        super.p();
        this.f9443q = null;
        this.f9442p = null;
    }

    @Override // o2.k1
    public final void z(t1.s0 s0Var) {
        if (this.f9443q != null) {
            return;
        }
        C(s0Var);
    }
}
