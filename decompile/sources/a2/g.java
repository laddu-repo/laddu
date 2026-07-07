package a2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class g implements u1 {
    public y1 A;
    public int B;
    public b2.m C;
    public u1.v D;
    public int E;
    public q2.z0 F;
    public r1.q[] G;
    public long H;
    public long I;
    public boolean K;
    public boolean L;
    public q2.c0 N;
    public t2.q O;

    /* renamed from: y, reason: collision with root package name */
    public final int f245y;

    /* renamed from: x, reason: collision with root package name */
    public final Object f244x = new Object();

    /* renamed from: z, reason: collision with root package name */
    public final j4.b0 f246z = new Object();
    public long J = Long.MIN_VALUE;
    public r1.d1 M = r1.d1.f11368a;

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, j4.b0] */
    public g(int i6) {
        this.f245y = i6;
    }

    public abstract int A(r1.q qVar);

    public int B() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final a2.q a(java.lang.Throwable r12, r1.q r13, boolean r14, int r15) {
        /*
            r11 = this;
            r0 = 4
            if (r13 == 0) goto L1a
            boolean r1 = r11.L
            if (r1 != 0) goto L1a
            r1 = 1
            r11.L = r1
            r1 = 0
            int r2 = r11.A(r13)     // Catch: java.lang.Throwable -> L14 a2.q -> L18
            r2 = r2 & 7
            r11.L = r1
            goto L1b
        L14:
            r0 = move-exception
            r11.L = r1
            throw r0
        L18:
            r11.L = r1
        L1a:
            r2 = 4
        L1b:
            java.lang.String r5 = r11.j()
            int r6 = r11.B
            q2.c0 r9 = r11.N
            a2.q r1 = new a2.q
            if (r13 != 0) goto L29
            r8 = 4
            goto L2a
        L29:
            r8 = r2
        L2a:
            r2 = 1
            r3 = r12
            r7 = r13
            r10 = r14
            r4 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.g.a(java.lang.Throwable, r1.q, boolean, int):a2.q");
    }

    public long c(long j, long j10) {
        if (this.E == 1) {
            if (m() || l()) {
                return 1000000L;
            }
            return 10000L;
        }
        return 10000L;
    }

    public b1 i() {
        return null;
    }

    public abstract String j();

    public final boolean k() {
        if (this.J == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public abstract boolean l();

    public abstract boolean m();

    public final boolean n() {
        if (k()) {
            return this.K;
        }
        q2.z0 z0Var = this.F;
        z0Var.getClass();
        return z0Var.isReady();
    }

    public abstract void o();

    public abstract void q(boolean z10, long j);

    public final int w(j4.b0 b0Var, y1.h hVar, int i6) {
        q2.z0 z0Var = this.F;
        z0Var.getClass();
        int n10 = z0Var.n(b0Var, hVar, i6);
        if (n10 == -4) {
            if (hVar.isEndOfStream()) {
                this.J = Long.MIN_VALUE;
                if (this.K) {
                    return -4;
                }
                return -3;
            }
            long j = hVar.B + this.H;
            hVar.B = j;
            this.J = Math.max(this.J, j);
            return n10;
        }
        if (n10 == -5) {
            r1.q qVar = (r1.q) b0Var.f7159y;
            qVar.getClass();
            long j10 = qVar.s;
            if (j10 != Long.MAX_VALUE) {
                r1.p a10 = qVar.a();
                a10.f11616r = j10 + this.H;
                b0Var.f7159y = new r1.q(a10);
            }
        }
        return n10;
    }

    public abstract void x(long j, long j10);

    public final void y(r1.q[] qVarArr, q2.z0 z0Var, long j, long j10, q2.c0 c0Var) {
        u1.c.g(!this.K);
        this.F = z0Var;
        this.N = c0Var;
        if (this.J == Long.MIN_VALUE) {
            this.J = j;
        }
        this.G = qVarArr;
        this.H = j10;
        v(qVarArr, j, j10, c0Var);
    }

    public void b() {
    }

    public void r() {
    }

    public void s() {
    }

    public void t() {
    }

    public void u() {
    }

    @Override // a2.u1
    public void h(int i6, Object obj) {
    }

    public void p(boolean z10, boolean z11) {
    }

    public void z(float f3, float f10) {
    }

    public void v(r1.q[] qVarArr, long j, long j10, q2.c0 c0Var) {
    }
}
