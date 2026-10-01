package d4;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import y9.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c implements w2.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f4059a = new b(0, 1, null, "audio/ac4");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1.t f4060b = new w1.t(16384);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4061c;

    @Override // w2.o
    public final void c(w2.q qVar) {
        this.f4059a.e(qVar, new g0(0, 1));
        qVar.e();
        qVar.k(new w2.s(-9223372036854775807L));
    }

    @Override // w2.o
    public final boolean e(w2.p pVar) throws EOFException, InterruptedIOException {
        w2.l lVar;
        int i;
        w1.t tVar = new w1.t(10);
        int i10 = 0;
        while (true) {
            lVar = (w2.l) pVar;
            lVar.v(tVar.f13738a, 0, 10, false);
            tVar.J(0);
            if (tVar.A() != 4801587) {
                break;
            }
            tVar.K(3);
            int iW = tVar.w();
            i10 += iW + 10;
            lVar.b(iW, false);
        }
        lVar.A = 0;
        lVar.b(i10, false);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            int i13 = 7;
            lVar.v(tVar.f13738a, 0, 7, false);
            tVar.J(0);
            int iD = tVar.D();
            if (iD == 44096 || iD == 44097) {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                byte[] bArr = tVar.f13738a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i14 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i14 == 65535) {
                        i14 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i13 = 4;
                    }
                    if (iD == 44097) {
                        i13 += 2;
                    }
                    i = i14 + i13;
                }
                if (i == -1) {
                    break;
                }
                lVar.b(i - 7, false);
            } else {
                lVar.A = 0;
                i12++;
                if (i12 - i10 >= 8192) {
                    break;
                }
                lVar.b(i12, false);
                i11 = 0;
            }
        }
        return false;
    }

    @Override // w2.o
    public final void f(long j8, long j9) {
        this.f4061c = false;
        this.f4059a.a();
    }

    @Override // w2.o
    public final int g(w2.p pVar, t1.r rVar) {
        w1.t tVar = this.f4060b;
        int i = pVar.read(tVar.f13738a, 0, 16384);
        if (i == -1) {
            return -1;
        }
        tVar.J(0);
        tVar.I(i);
        boolean z2 = this.f4061c;
        b bVar = this.f4059a;
        if (!z2) {
            bVar.f4058o = 0L;
            this.f4061c = true;
        }
        bVar.b(tVar);
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
