package d4;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import y9.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d implements w2.o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1.t f4069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u3.f f4070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w2.q f4071e;
    public long f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4073h;
    public boolean i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f4067a = new e(0, null, "audio/mp4a-latm", true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1.t f4068b = new w1.t(2048);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f4072g = -1;

    public d(int i) {
        w1.t tVar = new w1.t(10);
        this.f4069c = tVar;
        byte[] bArr = tVar.f13738a;
        this.f4070d = new u3.f(bArr.length, bArr);
    }

    @Override // w2.o
    public final void c(w2.q qVar) {
        this.f4071e = qVar;
        this.f4067a.e(qVar, new g0(0, 1));
        qVar.e();
    }

    @Override // w2.o
    public final boolean e(w2.p pVar) throws EOFException, InterruptedIOException {
        int i = 0;
        while (true) {
            w1.t tVar = this.f4069c;
            pVar.A(tVar.f13738a, 0, 10);
            tVar.J(0);
            if (tVar.A() != 4801587) {
                break;
            }
            tVar.K(3);
            int iW = tVar.w();
            i += iW + 10;
            pVar.B(iW);
        }
        pVar.l();
        pVar.B(i);
        if (this.f4072g == -1) {
            this.f4072g = i;
        }
        int i10 = i;
        int i11 = 0;
        int i12 = 0;
        do {
            w1.t tVar2 = this.f4069c;
            w2.l lVar = (w2.l) pVar;
            lVar.v(tVar2.f13738a, 0, 2, false);
            tVar2.J(0);
            if ((tVar2.D() & 65526) == 65520) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                lVar.v(tVar2.f13738a, 0, 4, false);
                u3.f fVar = this.f4070d;
                fVar.q(14);
                int i13 = fVar.i(13);
                if (i13 <= 6) {
                    i10++;
                    lVar.A = 0;
                    lVar.b(i10, false);
                } else {
                    lVar.b(i13 - 6, false);
                    i12 += i13;
                }
            } else {
                i10++;
                lVar.A = 0;
                lVar.b(i10, false);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - i < 8192);
        return false;
    }

    @Override // w2.o
    public final void f(long j8, long j9) {
        this.f4073h = false;
        this.f4067a.a();
        this.f = j9;
    }

    @Override // w2.o
    public final int g(w2.p pVar, t1.r rVar) throws t1.g0 {
        w1.a.k(this.f4071e);
        pVar.getLength();
        w1.t tVar = this.f4068b;
        int i = pVar.read(tVar.f13738a, 0, 2048);
        boolean z2 = i == -1;
        if (!this.i) {
            this.f4071e.k(new w2.s(-9223372036854775807L));
            this.i = true;
        }
        if (z2) {
            return -1;
        }
        tVar.J(0);
        tVar.I(i);
        boolean z10 = this.f4073h;
        e eVar = this.f4067a;
        if (!z10) {
            eVar.f4097u = this.f;
            this.f4073h = true;
        }
        eVar.b(tVar);
        return 0;
    }

    @Override // w2.o
    public final List h() {
        y9.c0 c0Var = y9.f0.f14553w;
        return z0.f14637z;
    }

    @Override // w2.o
    public final w2.o a() {
        return this;
    }

    @Override // w2.o
    public final void release() {
    }
}
