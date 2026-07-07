package fc;

import c2.s0;
import c2.t0;
import w1.b0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e implements t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s2.e f5365a = new s2.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5366b = ((long) 60000) * 1000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5367c = ((long) 120000) * 1000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f5368d = 2500000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f5369e = 5000000;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5370g;

    @Override // c2.t0
    public final boolean a() {
        return false;
    }

    @Override // c2.t0
    public final void b(d2.l lVar) {
        this.f = 0;
        this.f5370g = false;
        s2.e eVar = this.f5365a;
        synchronized (eVar) {
            if (eVar.f11430a) {
                eVar.b(0);
            }
        }
    }

    @Override // c2.t0
    public final boolean c() {
        return !this.f5370g;
    }

    @Override // c2.t0
    public final void d(d2.l lVar) {
        this.f = 0;
        this.f5370g = false;
    }

    @Override // c2.t0
    public final boolean e(s0 s0Var) {
        long jA = b0.A(s0Var.f1957b, s0Var.f1958c);
        long j8 = s0Var.f1959d ? this.f5369e : this.f5368d;
        return j8 <= 0 || jA >= j8;
    }

    @Override // c2.t0
    public final s2.e f() {
        return this.f5365a;
    }

    @Override // c2.t0
    public final boolean g(s0 s0Var) {
        long jA = b0.A(s0Var.f1957b, s0Var.f1958c);
        boolean z2 = false;
        char c10 = jA > this.f5367c ? (char) 0 : jA < this.f5366b ? (char) 2 : (char) 1;
        boolean z10 = this.f5365a.a() >= this.f;
        if (c10 == 2 || (c10 == 1 && !z10)) {
            z2 = true;
        }
        this.f5370g = z2;
        return z2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b A[SYNTHETIC] */
    @Override // c2.t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(c2.s0 r8, r2.s[] r9) {
        /*
            r7 = this;
            r8 = 0
            r7.f = r8
            int r0 = r9.length
            r1 = r8
        L5:
            if (r1 >= r0) goto L3e
            r2 = r9[r1]
            if (r2 == 0) goto L3b
            int r3 = r7.f
            t1.t0 r4 = r2.j()
            int r4 = r4.f12113c
            r5 = 13107200(0xc80000, float:1.8367099E-38)
            r6 = 131072(0x20000, float:1.83671E-40)
            switch(r4) {
                case -2: goto L28;
                case -1: goto L29;
                case 0: goto L25;
                case 1: goto L29;
                case 2: goto L22;
                case 3: goto L20;
                case 4: goto L20;
                case 5: goto L20;
                case 6: goto L20;
                default: goto L1a;
            }
        L1a:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>()
            throw r8
        L20:
            r5 = r6
            goto L29
        L22:
            r5 = 131072000(0x7d00000, float:3.1296362E-34)
            goto L29
        L25:
            r5 = 144310272(0x89a0000, float:9.268538E-34)
            goto L29
        L28:
            r5 = r8
        L29:
            int r3 = r3 + r5
            r7.f = r3
            t1.t0 r2 = r2.j()
            int r2 = r2.f12113c
            r3 = 2
            if (r2 != r3) goto L3b
            int r2 = r7.f
            int r2 = r2 * 4
            r7.f = r2
        L3b:
            int r1 = r1 + 1
            goto L5
        L3e:
            int r8 = r7.f
            s2.e r9 = r7.f5365a
            r9.b(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fc.e.h(c2.s0, r2.s[]):void");
    }

    @Override // c2.t0
    public final long i() {
        return 0L;
    }

    @Override // c2.t0
    public final void j(d2.l lVar) {
        this.f = 0;
        this.f5370g = false;
        s2.e eVar = this.f5365a;
        synchronized (eVar) {
            if (eVar.f11430a) {
                eVar.b(0);
            }
        }
    }
}
