package p2;

import android.net.Uri;
import androidx.media3.decoder.DecoderInputBuffer;
import c6.f0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k8.c0;
import o2.b1;
import o2.c1;
import o2.e1;
import o2.u;
import t1.o;
import w1.b0;
import w2.a0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i implements c1, e1, s2.i, s2.l {
    public final f2.b A;
    public final b3.a B;
    public final c0 C;
    public final s2.n D = new s2.n("ChunkSampleStream");
    public final f0 E = new f0();
    public final ArrayList F;
    public final List G;
    public final b1 H;
    public final b1[] I;
    public final c J;
    public f K;
    public o L;
    public h M;
    public long N;
    public long O;
    public int P;
    public a Q;
    public boolean R;
    public boolean S;
    public boolean T;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f10218v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int[] f10219w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final o[] f10220x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean[] f10221y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final f2.l f10222z;

    public i(int i, int[] iArr, o[] oVarArr, f2.l lVar, f2.b bVar, s2.e eVar, long j8, h2.n nVar, h2.k kVar, c0 c0Var, b3.a aVar, boolean z2) {
        this.f10218v = i;
        this.f10219w = iArr;
        this.f10220x = oVarArr;
        this.f10222z = lVar;
        this.A = bVar;
        this.B = aVar;
        this.C = c0Var;
        this.R = z2;
        ArrayList arrayList = new ArrayList();
        this.F = arrayList;
        this.G = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.I = new b1[length];
        this.f10221y = new boolean[length];
        int i10 = length + 1;
        int[] iArr2 = new int[i10];
        b1[] b1VarArr = new b1[i10];
        nVar.getClass();
        b1 b1Var = new b1(eVar, nVar, kVar);
        this.H = b1Var;
        int i11 = 0;
        iArr2[0] = i;
        b1VarArr[0] = b1Var;
        while (i11 < length) {
            b1 b1Var2 = new b1(eVar, null, null);
            this.I[i11] = b1Var2;
            int i12 = i11 + 1;
            b1VarArr[i12] = b1Var2;
            iArr2[i12] = this.f10219w[i11];
            i11 = i12;
        }
        this.J = new c(0, iArr2, b1VarArr);
        this.N = j8;
        this.O = j8;
    }

    public final void A() {
        int iB = B(this.H.t(), this.P - 1);
        while (true) {
            int i = this.P;
            if (i > iB) {
                return;
            }
            this.P = i + 1;
            a aVar = (a) this.F.get(i);
            o oVar = aVar.f10211y;
            if (!oVar.equals(this.L)) {
                this.B.e(this.f10218v, oVar, aVar.f10212z, aVar.A, aVar.B);
            }
            this.L = oVar;
        }
    }

    public final int B(int i, int i10) {
        ArrayList arrayList;
        do {
            i10++;
            arrayList = this.F;
            if (i10 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((a) arrayList.get(i10)).d(0) <= i);
        return i10 - 1;
    }

    public final void C(f2.b bVar) {
        this.M = bVar;
        b1 b1Var = this.H;
        b1Var.k();
        h2.h hVar = b1Var.f9378h;
        if (hVar != null) {
            hVar.d(b1Var.f9376e);
            b1Var.f9378h = null;
            b1Var.f9377g = null;
        }
        for (b1 b1Var2 : this.I) {
            b1Var2.k();
            h2.h hVar2 = b1Var2.f9378h;
            if (hVar2 != null) {
                hVar2.d(b1Var2.f9376e);
                b1Var2.f9378h = null;
                b1Var2.f9377g = null;
            }
        }
        this.D.e(this);
    }

    @Override // o2.c1
    public final boolean a() {
        return !z() && this.H.x(this.T);
    }

    @Override // o2.c1
    public final void b() throws IOException {
        s2.n nVar = this.D;
        nVar.b();
        this.H.z();
        if (nVar.d()) {
            return;
        }
        f2.l lVar = this.f10222z;
        o2.b bVar = lVar.f5195m;
        if (bVar != null) {
            throw bVar;
        }
        lVar.f5185a.b();
    }

    @Override // o2.e1
    public final boolean c() {
        return this.D.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x040d  */
    @Override // o2.e1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(c2.v0 r59) {
        /*
            Method dump skipped, instruction units count: 1170
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.i.d(c2.v0):boolean");
    }

    @Override // o2.c1
    public final int e(sc.b bVar, DecoderInputBuffer decoderInputBuffer, int i) {
        if (z()) {
            return -3;
        }
        a aVar = this.Q;
        b1 b1Var = this.H;
        if (aVar != null && aVar.d(0) <= b1Var.t()) {
            return -3;
        }
        A();
        return b1Var.C(bVar, decoderInputBuffer, i, this.T);
    }

    @Override // s2.i
    public final void f(s2.k kVar, long j8, long j9) {
        f fVar = (f) kVar;
        this.K = null;
        f2.l lVar = this.f10222z;
        f2.j[] jVarArr = lVar.i;
        if (fVar instanceof k) {
            int iN = lVar.f5192j.n(((k) fVar).f10211y);
            f2.j jVar = jVarArr[iN];
            if (((f2.i) jVar.A) == null) {
                e eVar = (e) jVar.f5181x;
                w1.a.k(eVar);
                a0 a0Var = eVar.C;
                w2.k kVar2 = a0Var instanceof w2.k ? (w2.k) a0Var : null;
                if (kVar2 != null) {
                    g2.m mVar = (g2.m) jVar.f5182y;
                    jVarArr[iN] = new f2.j(jVar.f5179v, mVar, (g2.b) jVar.f5183z, (e) jVar.f5181x, jVar.f5180w, new e3.c(kVar2, mVar.f5458x, 3));
                }
            }
        }
        f2.o oVar = lVar.f5191h;
        if (oVar != null) {
            long j10 = oVar.f5207d;
            if (j10 == -9223372036854775807L || fVar.C > j10) {
                oVar.f5207d = fVar.C;
            }
            oVar.f5208e.B = true;
        }
        long j11 = fVar.f10208v;
        Uri uri = fVar.D.f14401x;
        u uVar = new u(j9);
        this.C.getClass();
        this.B.k(uVar, fVar.f10210x, this.f10218v, fVar.f10211y, fVar.f10212z, fVar.A, fVar.B, fVar.C);
        this.A.a(this);
    }

    @Override // s2.l
    public final void g() {
        b1 b1Var = this.H;
        b1Var.D(true);
        h2.h hVar = b1Var.f9378h;
        if (hVar != null) {
            hVar.d(b1Var.f9376e);
            b1Var.f9378h = null;
            b1Var.f9377g = null;
        }
        for (b1 b1Var2 : this.I) {
            b1Var2.D(true);
            h2.h hVar2 = b1Var2.f9378h;
            if (hVar2 != null) {
                hVar2.d(b1Var2.f9376e);
                b1Var2.f9378h = null;
                b1Var2.f9377g = null;
            }
        }
        for (f2.j jVar : this.f10222z.i) {
            e eVar = (e) jVar.f5181x;
            if (eVar != null) {
                eVar.f10203v.release();
            }
        }
        h hVar3 = this.M;
        if (hVar3 != null) {
            f2.b bVar = (f2.b) hVar3;
            synchronized (bVar) {
                f2.o oVar = (f2.o) bVar.I.remove(this);
                if (oVar != null) {
                    b1 b1Var3 = oVar.f5204a;
                    b1Var3.D(true);
                    h2.h hVar4 = b1Var3.f9378h;
                    if (hVar4 != null) {
                        hVar4.d(b1Var3.f9376e);
                        b1Var3.f9378h = null;
                        b1Var3.f9377g = null;
                    }
                }
            }
        }
    }

    @Override // o2.e1
    public final long h() {
        if (z()) {
            return this.N;
        }
        if (this.T) {
            return Long.MIN_VALUE;
        }
        return s().C;
    }

    @Override // o2.c1
    public final int k(long j8) throws Throwable {
        if (z()) {
            return 0;
        }
        boolean z2 = this.T;
        b1 b1Var = this.H;
        int iV = b1Var.v(z2, j8);
        a aVar = this.Q;
        if (aVar != null) {
            iV = Math.min(iV, aVar.d(0) - b1Var.t());
        }
        b1Var.H(iV);
        A();
        return iV;
    }

    @Override // s2.i
    public final void o(s2.k kVar, long j8, long j9, int i) {
        u uVar;
        f fVar = (f) kVar;
        if (i == 0) {
            long j10 = fVar.f10208v;
            uVar = new u(fVar.f10209w);
        } else {
            long j11 = fVar.f10208v;
            Uri uri = fVar.D.f14401x;
            uVar = new u(j9);
        }
        u uVar2 = uVar;
        this.B.o(uVar2, fVar.f10210x, this.f10218v, fVar.f10211y, fVar.f10212z, fVar.A, fVar.B, fVar.C, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x022c  */
    @Override // s2.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final e4.e p(s2.k r23, long r24, long r26, java.io.IOException r28, int r29) {
        /*
            Method dump skipped, instruction units count: 661
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.i.p(s2.k, long, long, java.io.IOException, int):e4.e");
    }

    public final a r(int i) {
        ArrayList arrayList = this.F;
        a aVar = (a) arrayList.get(i);
        b0.R(arrayList, i, arrayList.size());
        this.P = Math.max(this.P, arrayList.size());
        int i10 = 0;
        this.H.n(aVar.d(0));
        while (true) {
            b1[] b1VarArr = this.I;
            if (i10 >= b1VarArr.length) {
                return aVar;
            }
            b1 b1Var = b1VarArr[i10];
            i10++;
            b1Var.n(aVar.d(i10));
        }
    }

    public final a s() {
        return (a) this.F.get(r0.size() - 1);
    }

    @Override // s2.i
    public final void t(s2.k kVar, long j8, long j9, boolean z2) {
        f fVar = (f) kVar;
        this.K = null;
        this.Q = null;
        long j10 = fVar.f10208v;
        Uri uri = fVar.D.f14401x;
        u uVar = new u(j9);
        this.C.getClass();
        this.B.j(uVar, fVar.f10210x, this.f10218v, fVar.f10211y, fVar.f10212z, fVar.A, fVar.B, fVar.C);
        if (z2) {
            return;
        }
        if (z()) {
            this.H.D(false);
            for (b1 b1Var : this.I) {
                b1Var.D(false);
            }
        } else if (fVar instanceof a) {
            ArrayList arrayList = this.F;
            r(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.N = this.O;
            }
        }
        this.A.a(this);
    }

    @Override // o2.e1
    public final long u() {
        if (this.T) {
            return Long.MIN_VALUE;
        }
        if (z()) {
            return this.N;
        }
        long jMax = this.O;
        a aVarS = s();
        if (!aVarS.b()) {
            ArrayList arrayList = this.F;
            aVarS = arrayList.size() > 1 ? (a) arrayList.get(arrayList.size() - 2) : null;
        }
        if (aVarS != null) {
            jMax = Math.max(jMax, aVarS.C);
        }
        return Math.max(jMax, this.H.q());
    }

    @Override // o2.e1
    public final void x(long j8) {
        s2.n nVar = this.D;
        if (nVar.c() || z()) {
            return;
        }
        boolean zD = nVar.d();
        List list = this.G;
        f2.l lVar = this.f10222z;
        ArrayList arrayList = this.F;
        if (zD) {
            f fVar = this.K;
            fVar.getClass();
            boolean z2 = fVar instanceof a;
            if (z2 && y(arrayList.size() - 1)) {
                return;
            }
            if (lVar.f5195m == null ? lVar.f5192j.h(j8, fVar, list) : false) {
                nVar.a();
                if (z2) {
                    this.Q = (a) fVar;
                    return;
                }
                return;
            }
            return;
        }
        int size = (lVar.f5195m != null || lVar.f5192j.length() < 2) ? list.size() : lVar.f5192j.f(j8, list);
        if (size < arrayList.size()) {
            w1.a.j(!nVar.d());
            int size2 = arrayList.size();
            while (true) {
                if (size >= size2) {
                    size = -1;
                    break;
                } else if (!y(size)) {
                    break;
                } else {
                    size++;
                }
            }
            if (size == -1) {
                return;
            }
            long j9 = s().C;
            a aVarR = r(size);
            if (arrayList.isEmpty()) {
                this.N = this.O;
            }
            this.T = false;
            this.B.u(this.f10218v, aVarR.B, j9);
        }
    }

    public final boolean y(int i) {
        int iT;
        a aVar = (a) this.F.get(i);
        if (this.H.t() > aVar.d(0)) {
            return true;
        }
        int i10 = 0;
        do {
            b1[] b1VarArr = this.I;
            if (i10 >= b1VarArr.length) {
                return false;
            }
            iT = b1VarArr[i10].t();
            i10++;
        } while (iT <= aVar.d(i10));
        return true;
    }

    public final boolean z() {
        return this.N != -9223372036854775807L;
    }
}
