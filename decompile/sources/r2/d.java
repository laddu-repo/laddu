package r2;

import android.util.SparseArray;
import j1.f0;
import y2.o;
import y2.q;
import y2.z;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d implements q {
    public static final mc.i G = new Object();
    public final SparseArray A = new SparseArray();
    public boolean B;
    public f0 C;
    public long D;
    public z E;
    public r1.q[] F;

    /* renamed from: x, reason: collision with root package name */
    public final o f11782x;

    /* renamed from: y, reason: collision with root package name */
    public final int f11783y;

    /* renamed from: z, reason: collision with root package name */
    public final r1.q f11784z;

    public d(o oVar, int i6, r1.q qVar) {
        this.f11782x = oVar;
        this.f11783y = i6;
        this.f11784z = qVar;
    }

    @Override // y2.q
    public final y2.f0 A(int i6, int i10) {
        boolean z10;
        r1.q qVar;
        SparseArray sparseArray = this.A;
        c cVar = (c) sparseArray.get(i6);
        if (cVar == null) {
            if (this.F == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            u1.c.g(z10);
            if (i10 == this.f11783y) {
                qVar = this.f11784z;
            } else {
                qVar = null;
            }
            cVar = new c(i6, i10, qVar);
            f0 f0Var = this.C;
            long j = this.D;
            if (f0Var == null) {
                cVar.f11780e = cVar.f11778c;
            } else {
                cVar.f11781f = j;
                y2.f0 Z = f0Var.Z(i10);
                cVar.f11780e = Z;
                r1.q qVar2 = cVar.f11779d;
                if (qVar2 != null) {
                    Z.f(qVar2);
                }
            }
            sparseArray.put(i6, cVar);
        }
        return cVar;
    }

    public final void a(f0 f0Var, long j, long j10) {
        this.C = f0Var;
        this.D = j10;
        boolean z10 = this.B;
        o oVar = this.f11782x;
        if (!z10) {
            oVar.l(this);
            if (j != -9223372036854775807L) {
                oVar.c(0L, j);
            }
            this.B = true;
            return;
        }
        if (j == -9223372036854775807L) {
            j = 0;
        }
        oVar.c(0L, j);
        int i6 = 0;
        while (true) {
            SparseArray sparseArray = this.A;
            if (i6 < sparseArray.size()) {
                c cVar = (c) sparseArray.valueAt(i6);
                if (f0Var == null) {
                    cVar.f11780e = cVar.f11778c;
                } else {
                    cVar.f11781f = j10;
                    y2.f0 Z = f0Var.Z(cVar.f11776a);
                    cVar.f11780e = Z;
                    r1.q qVar = cVar.f11779d;
                    if (qVar != null) {
                        Z.f(qVar);
                    }
                }
                i6++;
            } else {
                return;
            }
        }
    }

    @Override // y2.q
    public final void n(z zVar) {
        this.E = zVar;
    }

    @Override // y2.q
    public final void t() {
        SparseArray sparseArray = this.A;
        r1.q[] qVarArr = new r1.q[sparseArray.size()];
        for (int i6 = 0; i6 < sparseArray.size(); i6++) {
            r1.q qVar = ((c) sparseArray.valueAt(i6)).f11779d;
            u1.c.h(qVar);
            qVarArr[i6] = qVar;
        }
        this.F = qVarArr;
    }
}
