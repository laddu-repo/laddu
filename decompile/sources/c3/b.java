package c3;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import w1.t;
import w2.l;
import w2.n;
import w2.o;
import w2.p;
import w2.q;
import y9.c0;
import y9.f0;
import y9.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f2035a = new t(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f2036b = new t(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f2037c = new t(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f2038d = new t();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f2039e;
    public q f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2041h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2042j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2043k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2044l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f2045m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f2046n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f2047o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public f f2048p;

    public b() {
        c cVar = new c(0, new n());
        cVar.f2049x = -9223372036854775807L;
        cVar.f2050y = new long[0];
        cVar.f2051z = new long[0];
        this.f2039e = cVar;
        this.f2040g = 1;
    }

    public final t b(p pVar) {
        int i = this.f2044l;
        t tVar = this.f2038d;
        byte[] bArr = tVar.f13738a;
        if (i > bArr.length) {
            tVar.H(0, new byte[Math.max(bArr.length * 2, i)]);
        } else {
            tVar.J(0);
        }
        tVar.I(this.f2044l);
        pVar.readFully(tVar.f13738a, 0, this.f2044l);
        return tVar;
    }

    @Override // w2.o
    public final void c(q qVar) {
        this.f = qVar;
    }

    @Override // w2.o
    public final boolean e(p pVar) throws EOFException, InterruptedIOException {
        t tVar = this.f2035a;
        l lVar = (l) pVar;
        lVar.v(tVar.f13738a, 0, 3, false);
        tVar.J(0);
        if (tVar.A() == 4607062) {
            lVar.v(tVar.f13738a, 0, 2, false);
            tVar.J(0);
            if ((tVar.D() & 250) == 0) {
                lVar.v(tVar.f13738a, 0, 4, false);
                tVar.J(0);
                int iJ = tVar.j();
                lVar.A = 0;
                lVar.b(iJ, false);
                lVar.v(tVar.f13738a, 0, 4, false);
                tVar.J(0);
                if (tVar.j() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // w2.o
    public final void f(long j8, long j9) {
        if (j8 == 0) {
            this.f2040g = 1;
            this.f2041h = false;
        } else {
            this.f2040g = 3;
        }
        this.f2042j = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017a  */
    @Override // w2.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(w2.p r29, t1.r r30) throws t1.g0 {
        /*
            Method dump skipped, instruction units count: 1120
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.b.g(w2.p, t1.r):int");
    }

    @Override // w2.o
    public final List h() {
        c0 c0Var = f0.f14553w;
        return z0.f14637z;
    }

    @Override // w2.o
    public final o a() {
        return this;
    }

    @Override // w2.o
    public final void release() {
    }
}
