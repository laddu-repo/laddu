package t3;

import java.io.EOFException;
import t1.o;
import w1.b0;
import w1.t;
import w2.f0;
import w2.g0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class n implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f12216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f12217b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public m f12221g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public o f12222h;
    public boolean i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12219d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12220e = 0;
    public byte[] f = b0.f13688c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f12218c = new t();

    public n(g0 g0Var, k kVar) {
        this.f12216a = g0Var;
        this.f12217b = kVar;
    }

    @Override // w2.g0
    public final void a(long j8, int i, int i10, int i11, f0 f0Var) {
        if (this.f12221g == null) {
            this.f12216a.a(j8, i, i10, i11, f0Var);
            return;
        }
        w1.a.c("DRM on subtitles is not supported", f0Var == null);
        int i12 = (this.f12220e - i11) - i10;
        try {
            this.f12221g.o(this.f, i12, i10, l.f12213c, new d2.c(this, j8, i));
        } catch (RuntimeException e7) {
            if (!this.i) {
                throw e7;
            }
            w1.a.D("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e7);
        }
        int i13 = i12 + i10;
        this.f12219d = i13;
        if (i13 == this.f12220e) {
            this.f12219d = 0;
            this.f12220e = 0;
        }
    }

    @Override // w2.g0
    public final int b(t1.g gVar, int i, boolean z2) throws EOFException {
        if (this.f12221g == null) {
            return this.f12216a.b(gVar, i, z2);
        }
        g(i);
        int i10 = gVar.read(this.f, this.f12220e, i);
        if (i10 != -1) {
            this.f12220e += i10;
            return i10;
        }
        if (z2) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // w2.g0
    public final void c(o oVar) {
        oVar.f12061n.getClass();
        String str = oVar.f12061n;
        w1.a.d(t1.f0.i(str) == 3);
        boolean zEquals = oVar.equals(this.f12222h);
        k kVar = this.f12217b;
        if (!zEquals) {
            this.f12222h = oVar;
            this.f12221g = kVar.i(oVar) ? kVar.f(oVar) : null;
        }
        m mVar = this.f12221g;
        g0 g0Var = this.f12216a;
        if (mVar == null) {
            g0Var.c(oVar);
            return;
        }
        t1.n nVarA = oVar.a();
        nVarA.f12036m = t1.f0.p("application/x-media3-cues");
        nVarA.f12033j = str;
        nVarA.f12041r = Long.MAX_VALUE;
        nVarA.K = kVar.e(oVar);
        d0.d.r(nVarA, g0Var);
    }

    @Override // w2.g0
    public final /* synthetic */ void d(int i, t tVar) {
        u5.a.a(this, tVar, i);
    }

    @Override // w2.g0
    public final int e(t1.g gVar, int i, boolean z2) {
        return b(gVar, i, z2);
    }

    @Override // w2.g0
    public final void f(t tVar, int i, int i10) {
        if (this.f12221g == null) {
            this.f12216a.f(tVar, i, i10);
            return;
        }
        g(i);
        tVar.h(this.f, this.f12220e, i);
        this.f12220e += i;
    }

    public final void g(int i) {
        int length = this.f.length;
        int i10 = this.f12220e;
        if (length - i10 >= i) {
            return;
        }
        int i11 = i10 - this.f12219d;
        int iMax = Math.max(i11 * 2, i + i11);
        byte[] bArr = this.f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f12219d, bArr2, 0, i11);
        this.f12219d = 0;
        this.f12220e = i11;
        this.f = bArr2;
    }
}
