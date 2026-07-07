package q2;

import a2.c2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d implements a0, z {
    public long A;
    public long B;
    public long C;
    public g D;

    /* renamed from: x, reason: collision with root package name */
    public final a0 f10842x;

    /* renamed from: y, reason: collision with root package name */
    public z f10843y;

    /* renamed from: z, reason: collision with root package name */
    public c[] f10844z = new c[0];

    public d(a0 a0Var, boolean z10, long j, long j10) {
        long j11;
        this.f10842x = a0Var;
        if (z10) {
            j11 = j;
        } else {
            j11 = -9223372036854775807L;
        }
        this.A = j11;
        this.B = j;
        this.C = j10;
    }

    @Override // q2.b1
    public final boolean a() {
        return this.f10842x.a();
    }

    public final boolean b() {
        if (this.A != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override // q2.a0
    public final long c(long j, c2 c2Var) {
        long j10;
        long j11 = this.B;
        if (j == j11) {
            return j11;
        }
        long j12 = u1.a0.j(c2Var.f192a, 0L, j - j11);
        long j13 = c2Var.f193b;
        long j14 = this.C;
        if (j14 == Long.MIN_VALUE) {
            j10 = Long.MAX_VALUE;
        } else {
            j10 = j14 - j;
        }
        long j15 = u1.a0.j(j13, 0L, j10);
        if (j12 != c2Var.f192a || j15 != c2Var.f193b) {
            c2Var = new c2(j12, j15);
        }
        return this.f10842x.c(j, c2Var);
    }

    @Override // q2.b1
    public final long e() {
        long e10 = this.f10842x.e();
        if (e10 != Long.MIN_VALUE) {
            long j = this.C;
            if (j == Long.MIN_VALUE || e10 < j) {
                return e10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // q2.b1
    public final boolean f(a2.a1 a1Var) {
        return this.f10842x.f(a1Var);
    }

    @Override // q2.a0
    public final void g() {
        g gVar = this.D;
        if (gVar == null) {
            this.f10842x.g();
            return;
        }
        throw gVar;
    }

    @Override // q2.a0
    public final long h(long j) {
        this.A = -9223372036854775807L;
        for (c cVar : this.f10844z) {
            if (cVar != null) {
                cVar.f10832y = false;
            }
        }
        long h4 = this.f10842x.h(j);
        long j10 = this.B;
        long j11 = this.C;
        long max = Math.max(h4, j10);
        if (j11 != Long.MIN_VALUE) {
            return Math.min(max, j11);
        }
        return max;
    }

    @Override // q2.a0
    public final void i(long j) {
        this.f10842x.i(j);
    }

    @Override // q2.a1
    public final void j(b1 b1Var) {
        z zVar = this.f10843y;
        zVar.getClass();
        zVar.j(this);
    }

    @Override // q2.z
    public final void k(a0 a0Var) {
        if (this.D != null) {
            return;
        }
        z zVar = this.f10843y;
        zVar.getClass();
        zVar.k(this);
    }

    @Override // q2.a0
    public final void l(z zVar, long j) {
        this.f10843y = zVar;
        this.f10842x.l(this, j);
    }

    @Override // q2.a0
    public final long m() {
        if (b()) {
            long j = this.A;
            this.A = -9223372036854775807L;
            long m9 = m();
            if (m9 != -9223372036854775807L) {
                return m9;
            }
            return j;
        }
        long m10 = this.f10842x.m();
        if (m10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j10 = this.B;
        long j11 = this.C;
        long max = Math.max(m10, j10);
        if (j11 != Long.MIN_VALUE) {
            return Math.min(max, j11);
        }
        return max;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    @Override // q2.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long p(t2.s[] r18, boolean[] r19, q2.z0[] r20, boolean[] r21, long r22) {
        /*
            r17 = this;
            r0 = r17
            r8 = r20
            int r1 = r8.length
            q2.c[] r1 = new q2.c[r1]
            r0.f10844z = r1
            int r1 = r8.length
            q2.z0[] r4 = new q2.z0[r1]
            r1 = 0
        Ld:
            int r2 = r8.length
            if (r1 >= r2) goto L23
            q2.c[] r2 = r0.f10844z
            r3 = r8[r1]
            q2.c r3 = (q2.c) r3
            r2[r1] = r3
            if (r3 == 0) goto L1d
            q2.z0 r10 = r3.f10831x
            goto L1e
        L1d:
            r10 = 0
        L1e:
            r4[r1] = r10
            int r1 = r1 + 1
            goto Ld
        L23:
            q2.a0 r1 = r0.f10842x
            r2 = r18
            r3 = r19
            r5 = r21
            r6 = r22
            long r11 = r1.p(r2, r3, r4, r5, r6)
            long r13 = r0.C
            r3 = 0
            long r9 = java.lang.Math.max(r11, r6)
            r15 = -9223372036854775808
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 == 0) goto L42
            long r9 = java.lang.Math.min(r9, r13)
        L42:
            boolean r5 = r0.b()
            if (r5 == 0) goto L6e
            int r5 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r5 >= 0) goto L4d
            goto L69
        L4d:
            r5 = 0
            int r7 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r7 == 0) goto L6e
            int r5 = r2.length
            r6 = 0
        L55:
            if (r6 >= r5) goto L6e
            r7 = r2[r6]
            if (r7 == 0) goto L6b
            r1.q r7 = r7.n()
            java.lang.String r11 = r7.f11670n
            java.lang.String r7 = r7.f11667k
            boolean r7 = r1.k0.a(r11, r7)
            if (r7 != 0) goto L6b
        L69:
            r5 = r9
            goto L73
        L6b:
            int r6 = r6 + 1
            goto L55
        L6e:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L73:
            r0.A = r5
            r1 = 0
        L76:
            int r2 = r8.length
            if (r1 >= r2) goto L9c
            r2 = r4[r1]
            if (r2 != 0) goto L82
            q2.c[] r2 = r0.f10844z
            r2[r1] = r3
            goto L93
        L82:
            q2.c[] r5 = r0.f10844z
            r6 = r5[r1]
            if (r6 == 0) goto L8c
            q2.z0 r6 = r6.f10831x
            if (r6 == r2) goto L93
        L8c:
            q2.c r6 = new q2.c
            r6.<init>(r0, r2)
            r5[r1] = r6
        L93:
            q2.c[] r2 = r0.f10844z
            r2 = r2[r1]
            r8[r1] = r2
            int r1 = r1 + 1
            goto L76
        L9c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.d.p(t2.s[], boolean[], q2.z0[], boolean[], long):long");
    }

    @Override // q2.a0
    public final k1 q() {
        return this.f10842x.q();
    }

    @Override // q2.b1
    public final long r() {
        long r10 = this.f10842x.r();
        if (r10 != Long.MIN_VALUE) {
            long j = this.C;
            if (j == Long.MIN_VALUE || r10 < j) {
                return r10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // q2.b1
    public final void s(long j) {
        this.f10842x.s(j);
    }
}
