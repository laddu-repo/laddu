package f4;

import a2.t0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q implements i {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f4895a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4896b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4897c;

    /* renamed from: g, reason: collision with root package name */
    public long f4901g;

    /* renamed from: i, reason: collision with root package name */
    public String f4903i;
    public y2.f0 j;

    /* renamed from: k, reason: collision with root package name */
    public p f4904k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4905l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4907n;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f4902h = new boolean[3];

    /* renamed from: d, reason: collision with root package name */
    public final t0 f4898d = new t0(7);

    /* renamed from: e, reason: collision with root package name */
    public final t0 f4899e = new t0(8);

    /* renamed from: f, reason: collision with root package name */
    public final t0 f4900f = new t0(6);

    /* renamed from: m, reason: collision with root package name */
    public long f4906m = -9223372036854775807L;

    /* renamed from: o, reason: collision with root package name */
    public final u1.t f4908o = new u1.t();

    public q(d0 d0Var, boolean z10, boolean z11) {
        this.f4895a = d0Var;
        this.f4896b = z10;
        this.f4897c = z11;
    }

    @Override // f4.i
    public final void a(u1.t tVar) {
        int i6;
        int i10;
        u1.c.h(this.j);
        String str = u1.a0.f12750a;
        int i11 = tVar.f12812b;
        int i12 = tVar.f12813c;
        byte[] bArr = tVar.f12811a;
        this.f4901g += tVar.a();
        this.j.a(tVar.a(), tVar);
        while (true) {
            int b10 = v1.o.b(bArr, i11, i12, this.f4902h);
            if (b10 == i12) {
                g(bArr, i11, i12);
                return;
            }
            int i13 = bArr[b10 + 3] & 31;
            if (b10 > 0 && bArr[b10 - 1] == 0) {
                b10--;
                i6 = 4;
            } else {
                i6 = 3;
            }
            int i14 = b10 - i11;
            if (i14 > 0) {
                g(bArr, i11, b10);
            }
            int i15 = i12 - b10;
            long j = this.f4901g - i15;
            if (i14 < 0) {
                i10 = -i14;
            } else {
                i10 = 0;
            }
            b(i15, i10, j, this.f4906m);
            h(i13, j, this.f4906m);
            i11 = b10 + i6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x01a2, code lost:
    
        if (r3.j == r4.j) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01ac, code lost:
    
        if (r9 != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01be, code lost:
    
        if (r3.f4875n == r4.f4875n) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01cf, code lost:
    
        if (r3.f4877p == r4.f4877p) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01dd, code lost:
    
        if (r3.f4873l == r4.f4873l) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0238, code lost:
    
        if (r3 == 1) goto L96;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x022c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(int r23, int r24, long r25, long r27) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.q.b(int, int, long, long):void");
    }

    @Override // f4.i
    public final void c() {
        this.f4901g = 0L;
        this.f4907n = false;
        this.f4906m = -9223372036854775807L;
        v1.o.a(this.f4902h);
        this.f4898d.g();
        this.f4899e.g();
        this.f4900f.g();
        this.f4895a.f4740d.i(0);
        p pVar = this.f4904k;
        if (pVar != null) {
            pVar.f4887k = false;
            pVar.f4891o = false;
            o oVar = pVar.f4890n;
            oVar.f4864b = false;
            oVar.f4863a = false;
        }
    }

    @Override // f4.i
    public final void d(boolean z10) {
        u1.c.h(this.j);
        String str = u1.a0.f12750a;
        if (z10) {
            this.f4895a.f4740d.i(0);
            b(0, 0, this.f4901g, this.f4906m);
            h(9, this.f4901g, this.f4906m);
            b(0, 0, this.f4901g, this.f4906m);
        }
    }

    @Override // f4.i
    public final void e(int i6, long j) {
        boolean z10;
        this.f4906m = j;
        boolean z11 = this.f4907n;
        if ((i6 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f4907n = z10 | z11;
    }

    @Override // f4.i
    public final void f(y2.q qVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.f4903i = h0Var.f4815e;
        h0Var.b();
        y2.f0 A = qVar.A(h0Var.f4814d, 2);
        this.j = A;
        this.f4904k = new p(A, this.f4896b, this.f4897c);
        this.f4895a.b(qVar, h0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(byte[] r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.q.g(byte[], int, int):void");
    }

    public final void h(int i6, long j, long j10) {
        if (!this.f4905l || this.f4904k.f4880c) {
            this.f4898d.h(i6);
            this.f4899e.h(i6);
        }
        this.f4900f.h(i6);
        p pVar = this.f4904k;
        boolean z10 = this.f4907n;
        pVar.f4886i = i6;
        pVar.f4888l = j10;
        pVar.j = j;
        pVar.s = z10;
        if (!pVar.f4879b || i6 != 1) {
            if (pVar.f4880c) {
                if (i6 != 5 && i6 != 1 && i6 != 2) {
                    return;
                }
            } else {
                return;
            }
        }
        o oVar = pVar.f4889m;
        pVar.f4889m = pVar.f4890n;
        pVar.f4890n = oVar;
        oVar.f4864b = false;
        oVar.f4863a = false;
        pVar.f4885h = 0;
        pVar.f4887k = true;
    }
}
