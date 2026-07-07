package m2;

import a2.a1;
import a2.c2;
import android.net.Uri;
import android.os.Handler;
import com.google.android.gms.internal.measurement.e5;
import db.c1;
import db.h1;
import db.k0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.SocketFactory;
import q2.k1;
import q2.y0;
import q2.z0;
import r1.e1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s implements q2.a0 {
    public final n A;
    public final ArrayList B;
    public final ArrayList C;
    public final lc.c D;
    public final d E;
    public q2.z F;
    public c1 G;
    public IOException H;
    public e5 I;
    public long J;
    public long K;
    public long L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public int R;
    public boolean S;

    /* renamed from: x, reason: collision with root package name */
    public final u2.e f8540x;

    /* renamed from: y, reason: collision with root package name */
    public final Handler f8541y = u1.a0.n(null);

    /* renamed from: z, reason: collision with root package name */
    public final k7.d f8542z;

    public s(u2.e eVar, d dVar, Uri uri, lc.c cVar, String str, SocketFactory socketFactory) {
        this.f8540x = eVar;
        this.E = dVar;
        this.D = cVar;
        k7.d dVar2 = new k7.d(this, 16);
        this.f8542z = dVar2;
        this.A = new n(dVar2, dVar2, str, uri, socketFactory);
        this.B = new ArrayList();
        this.C = new ArrayList();
        this.K = -9223372036854775807L;
        this.J = -9223372036854775807L;
        this.L = -9223372036854775807L;
    }

    public static void b(s sVar) {
        ArrayList arrayList = sVar.B;
        sVar.M = true;
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            sVar.M &= ((r) arrayList.get(i6)).f8537d;
        }
    }

    public static void d(s sVar) {
        ArrayList arrayList = sVar.B;
        if (!sVar.O && !sVar.P) {
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                if (((r) arrayList.get(i6)).f8536c.w() == null) {
                    return;
                }
            }
            sVar.P = true;
            k0 k8 = k0.k(arrayList);
            db.r.e(4, "initialCapacity");
            Object[] objArr = new Object[4];
            int i10 = 0;
            int i11 = 0;
            while (i10 < k8.size()) {
                y0 y0Var = ((r) k8.get(i10)).f8536c;
                String num = Integer.toString(i10);
                r1.q w10 = y0Var.w();
                w10.getClass();
                e1 e1Var = new e1(num, w10);
                int i12 = i11 + 1;
                int f3 = db.e0.f(objArr.length, i12);
                if (f3 > objArr.length) {
                    objArr = Arrays.copyOf(objArr, f3);
                }
                objArr[i11] = e1Var;
                i10++;
                i11 = i12;
            }
            sVar.G = k0.h(i11, objArr);
            q2.z zVar = sVar.F;
            zVar.getClass();
            zVar.k(sVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.gms.internal.measurement.e5, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.android.gms.internal.measurement.e5, java.io.IOException] */
    public static void j(s sVar) {
        ArrayList arrayList = sVar.C;
        ArrayList arrayList2 = sVar.B;
        sVar.S = true;
        n nVar = sVar.A;
        nVar.getClass();
        try {
            nVar.close();
            z zVar = new z(new j1.f0(nVar));
            nVar.F = zVar;
            zVar.d(nVar.l(nVar.E));
            nVar.H = null;
            nVar.N = false;
            nVar.K = null;
        } catch (IOException e10) {
            nVar.f8525y.S(new IOException(e10));
        }
        d f3 = sVar.E.f();
        if (f3 == null) {
            sVar.I = new IOException("No fallback data channel factory for TCP retry");
            return;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        ArrayList arrayList4 = new ArrayList(arrayList.size());
        for (int i6 = 0; i6 < arrayList2.size(); i6++) {
            r rVar = (r) arrayList2.get(i6);
            boolean z10 = rVar.f8537d;
            q qVar = rVar.f8534a;
            if (!z10) {
                r rVar2 = new r(sVar, qVar.f8530a, i6, f3);
                arrayList3.add(rVar2);
                q qVar2 = rVar2.f8534a;
                rVar2.f8535b.f(qVar2.f8531b, sVar.f8542z, 0);
                if (arrayList.contains(qVar)) {
                    arrayList4.add(qVar2);
                }
            } else {
                arrayList3.add(rVar);
            }
        }
        k0 k8 = k0.k(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(arrayList3);
        arrayList.clear();
        arrayList.addAll(arrayList4);
        for (int i10 = 0; i10 < k8.size(); i10++) {
            ((r) k8.get(i10)).a();
        }
    }

    @Override // q2.b1
    public final boolean a() {
        if (!this.M) {
            int i6 = this.A.L;
            if (i6 == 2 || i6 == 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // q2.b1
    public final long e() {
        return r();
    }

    @Override // q2.b1
    public final boolean f(a1 a1Var) {
        return a();
    }

    @Override // q2.a0
    public final void g() {
        IOException iOException = this.H;
        if (iOException == null) {
        } else {
            throw iOException;
        }
    }

    @Override // q2.a0
    public final long h(long j) {
        if (r() == 0 && !this.S) {
            this.L = j;
            return j;
        }
        i(j);
        this.J = j;
        if (k()) {
            n nVar = this.A;
            int i6 = nVar.L;
            if (i6 != 1) {
                if (i6 == 2) {
                    this.K = j;
                    nVar.m(j);
                    return j;
                }
                throw new IllegalStateException();
            }
        } else {
            ArrayList arrayList = this.B;
            int i10 = 0;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (!((r) arrayList.get(i10)).f8536c.H(this.M, j)) {
                    this.K = j;
                    if (this.M) {
                        for (int i11 = 0; i11 < this.B.size(); i11++) {
                            r rVar = (r) this.B.get(i11);
                            u1.c.g(rVar.f8537d);
                            rVar.f8537d = false;
                            b(rVar.f8539f);
                            rVar.f8535b.f(rVar.f8534a.f8531b, rVar.f8539f.f8542z, 0);
                        }
                        if (this.S) {
                            this.A.y(u1.a0.e0(j));
                        } else {
                            this.A.m(j);
                        }
                    } else {
                        this.A.m(j);
                    }
                    for (int i12 = 0; i12 < this.B.size(); i12++) {
                        r rVar2 = (r) this.B.get(i12);
                        if (!rVar2.f8537d) {
                            g gVar = rVar2.f8534a.f8531b.E;
                            gVar.getClass();
                            synchronized (gVar.f8483e) {
                                gVar.f8488k = true;
                            }
                            rVar2.f8536c.E(false);
                            rVar2.f8536c.f11004t = j;
                        }
                    }
                } else {
                    i10++;
                }
            }
        }
        return j;
    }

    @Override // q2.a0
    public final void i(long j) {
        if (!k()) {
            int i6 = 0;
            while (true) {
                ArrayList arrayList = this.B;
                if (i6 < arrayList.size()) {
                    r rVar = (r) arrayList.get(i6);
                    if (!rVar.f8537d) {
                        rVar.f8536c.j(true, j);
                    }
                    i6++;
                } else {
                    return;
                }
            }
        }
    }

    public final boolean k() {
        if (this.K != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override // q2.a0
    public final void l(q2.z zVar, long j) {
        n nVar = this.A;
        this.F = zVar;
        try {
            nVar.getClass();
            try {
                nVar.F.d(nVar.l(nVar.E));
                b2.k kVar = nVar.D;
                kVar.A(kVar.l(4, nVar.H, h1.D, nVar.E));
            } catch (IOException e10) {
                u1.a0.g(nVar.F);
                throw e10;
            }
        } catch (IOException e11) {
            this.H = e11;
            u1.a0.g(nVar);
        }
    }

    @Override // q2.a0
    public final long m() {
        if (this.N) {
            this.N = false;
            return 0L;
        }
        return -9223372036854775807L;
    }

    public final void n() {
        ArrayList arrayList;
        boolean z10;
        int i6 = 0;
        boolean z11 = true;
        while (true) {
            arrayList = this.C;
            if (i6 >= arrayList.size()) {
                break;
            }
            if (((q) arrayList.get(i6)).f8532c != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 &= z10;
            i6++;
        }
        if (z11 && this.Q) {
            n nVar = this.A;
            nVar.B.addAll(arrayList);
            nVar.f();
        }
    }

    @Override // q2.a0
    public final long p(t2.s[] sVarArr, boolean[] zArr, z0[] z0VarArr, boolean[] zArr2, long j) {
        ArrayList arrayList;
        for (int i6 = 0; i6 < sVarArr.length; i6++) {
            if (z0VarArr[i6] != null && (sVarArr[i6] == null || !zArr[i6])) {
                z0VarArr[i6] = null;
            }
        }
        ArrayList arrayList2 = this.C;
        arrayList2.clear();
        int i10 = 0;
        while (true) {
            int length = sVarArr.length;
            arrayList = this.B;
            if (i10 >= length) {
                break;
            }
            t2.s sVar = sVarArr[i10];
            if (sVar != null) {
                e1 c10 = sVar.c();
                c1 c1Var = this.G;
                c1Var.getClass();
                int indexOf = c1Var.indexOf(c10);
                r rVar = (r) arrayList.get(indexOf);
                rVar.getClass();
                arrayList2.add(rVar.f8534a);
                if (this.G.contains(c10) && z0VarArr[i10] == null) {
                    z0VarArr[i10] = new j2.y(indexOf, 1, this);
                    zArr2[i10] = true;
                }
            }
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            r rVar2 = (r) arrayList.get(i11);
            if (!arrayList2.contains(rVar2.f8534a)) {
                rVar2.a();
            }
        }
        this.Q = true;
        if (j != 0) {
            this.J = j;
            this.K = j;
            this.L = j;
        }
        n();
        return j;
    }

    @Override // q2.a0
    public final k1 q() {
        u1.c.g(this.P);
        c1 c1Var = this.G;
        c1Var.getClass();
        return new k1((e1[]) c1Var.toArray(new e1[0]));
    }

    @Override // q2.b1
    public final long r() {
        if (!this.M) {
            ArrayList arrayList = this.B;
            if (!arrayList.isEmpty()) {
                long j = this.J;
                if (j != -9223372036854775807L) {
                    return j;
                }
                boolean z10 = true;
                long j10 = Long.MAX_VALUE;
                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                    r rVar = (r) arrayList.get(i6);
                    if (!rVar.f8537d) {
                        j10 = Math.min(j10, rVar.f8536c.q());
                        z10 = false;
                    }
                }
                if (!z10 && j10 != Long.MIN_VALUE) {
                    return j10;
                }
                return 0L;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // q2.b1
    public final void s(long j) {
    }

    @Override // q2.a0
    public final long c(long j, c2 c2Var) {
        return j;
    }
}
