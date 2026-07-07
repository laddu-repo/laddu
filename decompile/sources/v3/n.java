package v3;

import java.io.EOFException;
import r1.k0;
import r1.p;
import r1.q;
import u1.a0;
import u1.t;
import y2.e0;
import y2.f0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f13285a;

    /* renamed from: b, reason: collision with root package name */
    public final k f13286b;

    /* renamed from: g, reason: collision with root package name */
    public m f13291g;

    /* renamed from: h, reason: collision with root package name */
    public q f13292h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f13293i;

    /* renamed from: d, reason: collision with root package name */
    public int f13288d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f13289e = 0;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f13290f = a0.f12751b;

    /* renamed from: c, reason: collision with root package name */
    public final t f13287c = new t();

    public n(f0 f0Var, k kVar) {
        this.f13285a = f0Var;
        this.f13286b = kVar;
    }

    @Override // y2.f0
    public final /* synthetic */ void a(int i6, t tVar) {
        w8.k.a(this, tVar, i6);
    }

    @Override // y2.f0
    public final void b(t tVar, int i6, int i10) {
        if (this.f13291g == null) {
            this.f13285a.b(tVar, i6, i10);
            return;
        }
        g(i6);
        tVar.i(this.f13290f, this.f13289e, i6);
        this.f13289e += i6;
    }

    @Override // y2.f0
    public final void c(long j, int i6, int i10, int i11, e0 e0Var) {
        boolean z10;
        if (this.f13291g == null) {
            this.f13285a.c(j, i6, i10, i11, e0Var);
            return;
        }
        if (e0Var == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.a("DRM on subtitles is not supported", z10);
        int i12 = (this.f13289e - i11) - i10;
        try {
            this.f13291g.o(this.f13290f, i12, i10, l.f13282c, new b2.e(this, j, i6));
        } catch (RuntimeException e10) {
            if (this.f13293i) {
                u1.a.q("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e10);
            } else {
                throw e10;
            }
        }
        int i13 = i12 + i10;
        this.f13288d = i13;
        if (i13 == this.f13289e) {
            this.f13288d = 0;
            this.f13289e = 0;
        }
    }

    @Override // y2.f0
    public final int d(r1.i iVar, int i6, boolean z10) {
        if (this.f13291g == null) {
            return this.f13285a.d(iVar, i6, z10);
        }
        g(i6);
        int read = iVar.read(this.f13290f, this.f13289e, i6);
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        this.f13289e += read;
        return read;
    }

    @Override // y2.f0
    public final int e(r1.i iVar, int i6, boolean z10) {
        return d(iVar, i6, z10);
    }

    @Override // y2.f0
    public final void f(q qVar) {
        boolean z10;
        m mVar;
        qVar.f11670n.getClass();
        String str = qVar.f11670n;
        if (k0.i(str) == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.b(z10);
        boolean equals = qVar.equals(this.f13292h);
        k kVar = this.f13286b;
        if (!equals) {
            this.f13292h = qVar;
            if (kVar.g(qVar)) {
                mVar = kVar.c(qVar);
            } else {
                mVar = null;
            }
            this.f13291g = mVar;
        }
        m mVar2 = this.f13291g;
        f0 f0Var = this.f13285a;
        if (mVar2 == null) {
            f0Var.f(qVar);
            return;
        }
        p a10 = qVar.a();
        a10.f11611m = k0.p("application/x-media3-cues");
        a10.j = str;
        a10.f11616r = Long.MAX_VALUE;
        a10.K = kVar.o(qVar);
        r4.a.v(a10, f0Var);
    }

    public final void g(int i6) {
        byte[] bArr;
        int length = this.f13290f.length;
        int i10 = this.f13289e;
        if (length - i10 >= i6) {
            return;
        }
        int i11 = i10 - this.f13288d;
        int max = Math.max(i11 * 2, i6 + i11);
        byte[] bArr2 = this.f13290f;
        if (max <= bArr2.length) {
            bArr = bArr2;
        } else {
            bArr = new byte[max];
        }
        System.arraycopy(bArr2, this.f13288d, bArr, 0, i11);
        this.f13288d = 0;
        this.f13289e = i11;
        this.f13290f = bArr;
    }
}
