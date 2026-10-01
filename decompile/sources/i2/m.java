package i2;

import androidx.media3.decoder.DecoderInputBuffer;
import java.io.IOException;
import java.util.ArrayList;
import o2.c1;
import w1.b0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m implements c1 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f6410v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final q f6411w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f6412x = -1;

    public m(q qVar, int i) {
        this.f6411w = qVar;
        this.f6410v = i;
    }

    @Override // o2.c1
    public final boolean a() {
        if (this.f6412x == -3) {
            return true;
        }
        if (!d()) {
            return false;
        }
        int i = this.f6412x;
        q qVar = this.f6411w;
        return !qVar.E() && qVar.Q[i].x(qVar.o0);
    }

    @Override // o2.c1
    public final void b() throws IOException {
        int i = this.f6412x;
        q qVar = this.f6411w;
        if (i == -2) {
            qVar.b();
            throw new a6.c(d0.d.l("Unable to bind a sample queue to TrackGroup with MIME type ", qVar.f6425d0.a(this.f6410v).f12114d[0].f12061n, "."));
        }
        if (i == -1) {
            qVar.G();
        } else if (i != -3) {
            qVar.G();
            qVar.Q[i].z();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            r6 = this;
            int r0 = r6.f6412x
            r1 = 1
            r2 = -1
            if (r0 != r2) goto L8
            r0 = r1
            goto L9
        L8:
            r0 = 0
        L9:
            w1.a.d(r0)
            i2.q r0 = r6.f6411w
            r0.b()
            int[] r3 = r0.f6427f0
            r3.getClass()
            int[] r3 = r0.f6427f0
            int r4 = r6.f6410v
            r3 = r3[r4]
            r5 = -2
            if (r3 != r2) goto L31
            java.util.Set r1 = r0.f6426e0
            o2.j1 r0 = r0.f6425d0
            t1.t0 r0 = r0.a(r4)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L2f
            r3 = -3
            goto L3a
        L2f:
            r3 = r5
            goto L3a
        L31:
            boolean[] r0 = r0.f6430i0
            boolean r2 = r0[r3]
            if (r2 == 0) goto L38
            goto L2f
        L38:
            r0[r3] = r1
        L3a:
            r6.f6412x = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.m.c():void");
    }

    public final boolean d() {
        int i = this.f6412x;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    @Override // o2.c1
    public final int e(sc.b bVar, DecoderInputBuffer decoderInputBuffer, int i) {
        t1.o oVar;
        if (this.f6412x == -3) {
            decoderInputBuffer.addFlag(4);
            return -4;
        }
        if (d()) {
            int i10 = this.f6412x;
            q qVar = this.f6411w;
            ArrayList arrayList = qVar.I;
            if (!qVar.E()) {
                int i11 = 0;
                if (!arrayList.isEmpty()) {
                    int i12 = 0;
                    loop0: while (i12 < arrayList.size() - 1) {
                        int i13 = ((j) arrayList.get(i12)).F;
                        int length = qVar.Q.length;
                        for (int i14 = 0; i14 < length; i14++) {
                            if (qVar.f6430i0[i14] && qVar.Q[i14].B() == i13) {
                                break loop0;
                            }
                        }
                        i12++;
                    }
                    b0.R(arrayList, 0, i12);
                    j jVar = (j) arrayList.get(0);
                    t1.o oVar2 = jVar.f10211y;
                    if (!oVar2.equals(qVar.f6423b0)) {
                        qVar.F.e(qVar.f6441w, oVar2, jVar.f10212z, jVar.A, jVar.B);
                    }
                    qVar.f6423b0 = oVar2;
                }
                if (arrayList.isEmpty() || ((j) arrayList.get(0)).g()) {
                    int iC = qVar.Q[i10].C(bVar, decoderInputBuffer, i, qVar.o0);
                    if (iC == -5) {
                        t1.o oVarD = (t1.o) bVar.f11787x;
                        oVarD.getClass();
                        if (i10 == qVar.W) {
                            int iJ = z7.b.j(qVar.Q[i10].B());
                            while (i11 < arrayList.size() && ((j) arrayList.get(i11)).F != iJ) {
                                i11++;
                            }
                            if (i11 < arrayList.size()) {
                                oVar = ((j) arrayList.get(i11)).f10211y;
                            } else {
                                oVar = qVar.f6422a0;
                                oVar.getClass();
                            }
                            oVarD = oVarD.d(oVar);
                        }
                        bVar.f11787x = oVarD;
                    }
                    return iC;
                }
            }
        }
        return -3;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    @Override // o2.c1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int k(long r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r4.d()
            if (r0 == 0) goto L63
            int r0 = r4.f6412x
            i2.q r1 = r4.f6411w
            boolean r2 = r1.E()
            if (r2 == 0) goto L11
            goto L63
        L11:
            i2.p[] r2 = r1.Q
            r2 = r2[r0]
            boolean r3 = r1.o0
            int r5 = r2.v(r3, r5)
            java.util.ArrayList r6 = r1.I
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
            i2.j r6 = (i2.j) r6
            if (r6 == 0) goto L5f
            boolean r1 = r6.g()
            if (r1 != 0) goto L5f
            int r1 = r2.t()
            int r6 = r6.f(r0)
            int r6 = r6 - r1
            int r5 = java.lang.Math.min(r5, r6)
        L5f:
            r2.H(r5)
            return r5
        L63:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.m.k(long):int");
    }
}
