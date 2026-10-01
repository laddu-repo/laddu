package p3;

import java.io.EOFException;
import java.util.List;
import k3.i;
import k8.g2;
import t1.e0;
import w1.t;
import w2.g0;
import w2.n;
import w2.o;
import w2.p;
import w2.q;
import w2.v;
import w2.y;
import y9.c0;
import y9.f0;
import y9.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f10238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f10239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f10240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g2 f10241e;
    public final n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q f10242g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g0 f10243h;
    public g0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f10244j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e0 f10245k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f10246l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f10247m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f10248n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f10249o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10250p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public f f10251q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f10252r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f10253s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f10254t;

    public d(int i) {
        this(-9223372036854775807L);
    }

    public final void b() {
        f fVar = this.f10251q;
        if ((fVar instanceof a) && ((a) fVar).i()) {
            long j8 = this.f10249o;
            if (j8 == -1 || j8 == this.f10251q.d()) {
                return;
            }
            a aVar = (a) this.f10251q;
            this.f10251q = new a(this.f10249o, aVar.f10230h, aVar.i, aVar.f10231j, aVar.f10232k);
            q qVar = this.f10242g;
            qVar.getClass();
            qVar.k(this.f10251q);
            this.f10243h.getClass();
            this.f10251q.l();
        }
    }

    @Override // w2.o
    public final void c(q qVar) {
        this.f10242g = qVar;
        g0 g0VarR = qVar.r(0, 1);
        this.f10243h = g0VarR;
        this.i = g0VarR;
        this.f10242g.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(w2.p r9) {
        /*
            r8 = this;
            p3.f r0 = r8.f10251q
            r1 = 1
            if (r0 == 0) goto L1b
            long r2 = r0.d()
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L1b
            long r4 = r9.w()
            r6 = 4
            long r2 = r2 - r6
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1b
            goto L27
        L1b:
            w1.t r0 = r8.f10238b     // Catch: java.io.EOFException -> L27
            byte[] r0 = r0.f13738a     // Catch: java.io.EOFException -> L27
            r2 = 0
            r3 = 4
            boolean r9 = r9.v(r0, r2, r3, r1)     // Catch: java.io.EOFException -> L27
            r9 = r9 ^ r1
            return r9
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.d.d(w2.p):boolean");
    }

    @Override // w2.o
    public final boolean e(p pVar) {
        return i(pVar, true);
    }

    @Override // w2.o
    public final void f(long j8, long j9) {
        this.f10244j = 0;
        this.f10246l = -9223372036854775807L;
        this.f10247m = 0L;
        this.f10250p = 0;
        this.f10254t = j9;
        if (this.f10251q instanceof b) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x034b A[LOOP:2: B:158:0x0349->B:159:0x034b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // w2.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(w2.p r54, t1.r r55) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.d.g(w2.p, t1.r):int");
    }

    @Override // w2.o
    public final List h() {
        c0 c0Var = f0.f14553w;
        return z0.f14637z;
    }

    public final boolean i(p pVar, boolean z2) throws Throwable {
        int iW;
        int i;
        int iH;
        int i10 = z2 ? 32768 : 131072;
        pVar.l();
        if (pVar.getPosition() == 0) {
            t tVar = (t) this.f10241e.f7546w;
            int i11 = 0;
            e0 e0VarH = null;
            while (true) {
                try {
                    pVar.A(tVar.f13738a, 0, 10);
                    tVar.J(0);
                    if (tVar.A() != 4801587) {
                        break;
                    }
                    tVar.K(3);
                    int iW2 = tVar.w();
                    int i12 = iW2 + 10;
                    if (e0VarH == null) {
                        byte[] bArr = new byte[i12];
                        System.arraycopy(tVar.f13738a, 0, bArr, 0, 10);
                        pVar.A(bArr, 10, iW2);
                        e0VarH = new i(null).H(i12, bArr);
                    } else {
                        pVar.B(iW2);
                    }
                    i11 += i12;
                } catch (EOFException unused) {
                }
            }
            pVar.l();
            pVar.B(i11);
            this.f10245k = e0VarH;
            if (e0VarH != null) {
                this.f10240d.b(e0VarH);
            }
            iW = (int) pVar.w();
            if (!z2) {
                pVar.p(iW);
            }
            i = 0;
        } else {
            iW = 0;
            i = 0;
        }
        int i13 = i;
        int i14 = i13;
        while (true) {
            if (!d(pVar)) {
                t tVar2 = this.f10238b;
                tVar2.J(0);
                int iJ = tVar2.j();
                if ((i == 0 || ((-128000) & iJ) == (((long) i) & (-128000))) && (iH = w2.b.h(iJ)) != -1) {
                    i13++;
                    if (i13 != 1) {
                        if (i13 == 4) {
                            break;
                        }
                    } else {
                        this.f10239c.a(iJ);
                        i = iJ;
                    }
                    pVar.B(iH - 4);
                } else {
                    int i15 = i14 + 1;
                    if (i14 == i10) {
                        if (z2) {
                            return false;
                        }
                        b();
                        throw new EOFException();
                    }
                    if (z2) {
                        pVar.l();
                        pVar.B(iW + i15);
                    } else {
                        pVar.p(1);
                    }
                    i13 = 0;
                    i14 = i15;
                    i = 0;
                }
            } else if (i13 <= 0) {
                b();
                throw new EOFException();
            }
        }
        if (z2) {
            pVar.p(iW + i14);
        } else {
            pVar.l();
        }
        this.f10244j = i;
        return true;
    }

    public d(long j8) {
        this.f10237a = j8;
        this.f10238b = new t(10);
        this.f10239c = new y();
        this.f10240d = new v();
        this.f10246l = -9223372036854775807L;
        this.f10241e = new g2(27);
        n nVar = new n();
        this.f = nVar;
        this.i = nVar;
        this.f10249o = -1L;
    }

    @Override // w2.o
    public final o a() {
        return this;
    }

    @Override // w2.o
    public final void release() {
    }
}
