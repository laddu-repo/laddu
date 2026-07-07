package g2;

import j4.b0;
import java.io.IOException;
import java.util.ArrayList;
import q2.z0;
import u1.a0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m implements z0 {

    /* renamed from: x, reason: collision with root package name */
    public final int f5348x;

    /* renamed from: y, reason: collision with root package name */
    public final q f5349y;

    /* renamed from: z, reason: collision with root package name */
    public int f5350z = -1;

    public m(q qVar, int i6) {
        this.f5349y = qVar;
        this.f5348x = i6;
    }

    public final void a() {
        boolean z10;
        if (this.f5350z == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.b(z10);
        q qVar = this.f5349y;
        qVar.b();
        qVar.f5368h0.getClass();
        int[] iArr = qVar.f5368h0;
        int i6 = this.f5348x;
        int i10 = iArr[i6];
        if (i10 == -1) {
            if (qVar.f5367g0.contains(qVar.f5366f0.a(i6))) {
                i10 = -3;
            }
            i10 = -2;
        } else {
            boolean[] zArr = qVar.f5371k0;
            if (!zArr[i10]) {
                zArr[i10] = true;
            }
            i10 = -2;
        }
        this.f5350z = i10;
    }

    @Override // q2.z0
    public final void b() {
        int i6 = this.f5350z;
        q qVar = this.f5349y;
        if (i6 != -2) {
            if (i6 == -1) {
                qVar.G();
                return;
            } else {
                if (i6 != -3) {
                    qVar.G();
                    qVar.S[i6].z();
                    return;
                }
                return;
            }
        }
        qVar.b();
        throw new IOException(h8.c.m("Unable to bind a sample queue to TrackGroup with MIME type ", qVar.f5366f0.a(this.f5348x).f11389d[0].f11670n, "."));
    }

    public final boolean c() {
        int i6 = this.f5350z;
        if (i6 != -1 && i6 != -3 && i6 != -2) {
            return true;
        }
        return false;
    }

    @Override // q2.z0
    public final boolean isReady() {
        if (this.f5350z != -3) {
            if (c()) {
                int i6 = this.f5350z;
                q qVar = this.f5349y;
                if (qVar.E() || !qVar.S[i6].x(qVar.f5376q0)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r6.hasNext() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        r1 = r6.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        if (r6.hasNext() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        r6 = r1;
     */
    @Override // q2.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int j(long r5) {
        /*
            r4 = this;
            boolean r0 = r4.c()
            if (r0 == 0) goto L63
            int r0 = r4.f5350z
            g2.q r1 = r4.f5349y
            boolean r2 = r1.E()
            if (r2 == 0) goto L11
            goto L63
        L11:
            g2.p[] r2 = r1.S
            r2 = r2[r0]
            boolean r3 = r1.f5376q0
            int r5 = r2.v(r3, r5)
            java.util.ArrayList r6 = r1.K
            if (r6 == 0) goto L31
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L26
            goto L47
        L26:
            int r1 = r6.size()
            int r1 = r1 + (-1)
            java.lang.Object r6 = r6.get(r1)
            goto L48
        L31:
            java.util.Iterator r6 = r6.iterator()
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L47
        L3b:
            java.lang.Object r1 = r6.next()
            boolean r3 = r6.hasNext()
            if (r3 != 0) goto L3b
            r6 = r1
            goto L48
        L47:
            r6 = 0
        L48:
            g2.j r6 = (g2.j) r6
            if (r6 == 0) goto L5f
            boolean r1 = r6.f()
            if (r1 != 0) goto L5f
            int r1 = r2.t()
            int r6 = r6.e(r0)
            int r6 = r6 - r1
            int r5 = java.lang.Math.min(r5, r6)
        L5f:
            r2.I(r5)
            return r5
        L63:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.m.j(long):int");
    }

    @Override // q2.z0
    public final int n(b0 b0Var, y1.h hVar, int i6) {
        r1.q qVar;
        if (this.f5350z == -3) {
            hVar.addFlag(4);
            return -4;
        }
        if (c()) {
            int i10 = this.f5350z;
            q qVar2 = this.f5349y;
            ArrayList arrayList = qVar2.K;
            if (!qVar2.E()) {
                int i11 = 0;
                if (!arrayList.isEmpty()) {
                    int i12 = 0;
                    loop0: while (i12 < arrayList.size() - 1) {
                        int i13 = ((j) arrayList.get(i12)).H;
                        int length = qVar2.S.length;
                        for (int i14 = 0; i14 < length; i14++) {
                            if (qVar2.f5371k0[i14] && qVar2.S[i14].B() == i13) {
                                break loop0;
                            }
                        }
                        i12++;
                    }
                    a0.V(arrayList, 0, i12);
                    j jVar = (j) arrayList.get(0);
                    r1.q qVar3 = jVar.A;
                    if (!qVar3.equals(qVar2.f5364d0)) {
                        qVar2.H.h(qVar2.f5382y, qVar3, jVar.B, jVar.C, jVar.D);
                    }
                    qVar2.f5364d0 = qVar3;
                }
                if (arrayList.isEmpty() || ((j) arrayList.get(0)).f()) {
                    int C = qVar2.S[i10].C(b0Var, hVar, i6, qVar2.f5376q0);
                    if (C == -5) {
                        r1.q qVar4 = (r1.q) b0Var.f7159y;
                        qVar4.getClass();
                        if (i10 == qVar2.Y) {
                            int G = a8.f.G(qVar2.S[i10].B());
                            while (i11 < arrayList.size() && ((j) arrayList.get(i11)).H != G) {
                                i11++;
                            }
                            if (i11 < arrayList.size()) {
                                qVar = ((j) arrayList.get(i11)).A;
                            } else {
                                qVar = qVar2.f5363c0;
                                qVar.getClass();
                            }
                            qVar4 = qVar4.d(qVar);
                        }
                        b0Var.f7159y = qVar4;
                    }
                    return C;
                }
            }
        }
        return -3;
    }
}
