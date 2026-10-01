package i2;

import java.io.EOFException;
import java.util.Arrays;
import java.util.Objects;
import t1.f0;
import w2.g0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o implements g0 {
    public static final t1.o f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final t1.o f6415g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f6416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1.o f6417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t1.o f6418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f6419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6420e;

    static {
        t1.n nVar = new t1.n();
        nVar.f12036m = f0.p("application/id3");
        f = new t1.o(nVar);
        t1.n nVar2 = new t1.n();
        nVar2.f12036m = f0.p("application/x-emsg");
        f6415g = new t1.o(nVar2);
    }

    public o(g0 g0Var, int i) {
        this.f6416a = g0Var;
        if (i == 1) {
            this.f6417b = f;
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(d0.d.h(i, "Unknown metadataType: "));
            }
            this.f6417b = f6415g;
        }
        this.f6419d = new byte[0];
        this.f6420e = 0;
    }

    @Override // w2.g0
    public final void a(long j8, int i, int i10, int i11, w2.f0 f0Var) {
        this.f6418c.getClass();
        int i12 = this.f6420e - i11;
        w1.t tVar = new w1.t(Arrays.copyOfRange(this.f6419d, i12 - i10, i12));
        byte[] bArr = this.f6419d;
        System.arraycopy(bArr, i12, bArr, 0, i11);
        this.f6420e = i11;
        String str = this.f6418c.f12061n;
        t1.o oVar = this.f6417b;
        String str2 = oVar.f12061n;
        String str3 = oVar.f12061n;
        if (!Objects.equals(str, str2)) {
            if (!"application/x-emsg".equals(this.f6418c.f12061n)) {
                w1.a.C("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f6418c.f12061n);
                return;
            }
            h3.a aVarH = g3.b.H(tVar);
            t1.o oVarA = aVarH.a();
            if (oVarA == null || !Objects.equals(str3, oVarA.f12061n)) {
                w1.a.C("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + aVarH.a());
                return;
            }
            byte[] bArrC = aVarH.c();
            bArrC.getClass();
            tVar = new w1.t(bArrC);
        }
        int iA = tVar.a();
        g0 g0Var = this.f6416a;
        g0Var.d(iA, tVar);
        g0Var.a(j8, i, iA, 0, f0Var);
    }

    @Override // w2.g0
    public final int b(t1.g gVar, int i, boolean z2) throws EOFException {
        int i10 = this.f6420e + i;
        byte[] bArr = this.f6419d;
        if (bArr.length < i10) {
            this.f6419d = Arrays.copyOf(bArr, (i10 / 2) + i10);
        }
        int i11 = gVar.read(this.f6419d, this.f6420e, i);
        if (i11 != -1) {
            this.f6420e += i11;
            return i11;
        }
        if (z2) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // w2.g0
    public final void c(t1.o oVar) {
        this.f6418c = oVar;
        this.f6416a.c(this.f6417b);
    }

    @Override // w2.g0
    public final /* synthetic */ void d(int i, w1.t tVar) {
        u5.a.a(this, tVar, i);
    }

    @Override // w2.g0
    public final int e(t1.g gVar, int i, boolean z2) {
        return b(gVar, i, z2);
    }

    @Override // w2.g0
    public final void f(w1.t tVar, int i, int i10) {
        int i11 = this.f6420e + i;
        byte[] bArr = this.f6419d;
        if (bArr.length < i11) {
            this.f6419d = Arrays.copyOf(bArr, (i11 / 2) + i11);
        }
        tVar.h(this.f6419d, this.f6420e, i);
        this.f6420e += i;
    }
}
