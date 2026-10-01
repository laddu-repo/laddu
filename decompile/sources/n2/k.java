package n2;

import java.util.Locale;
import m2.l;
import r1.p;
import u1.a0;
import u1.t;
import y2.f0;
import y2.q;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k implements i {

    /* renamed from: a, reason: collision with root package name */
    public final l f9018a;

    /* renamed from: b, reason: collision with root package name */
    public f0 f9019b;

    /* renamed from: c, reason: collision with root package name */
    public long f9020c = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    public int f9021d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f9022e = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f9023f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    public long f9024g = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9025h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9026i;
    public boolean j;

    public k(l lVar) {
        this.f9018a = lVar;
    }

    @Override // n2.i
    public final void c(long j, long j10) {
        this.f9020c = j;
        this.f9022e = -1;
        this.f9024g = j10;
    }

    @Override // n2.i
    public final void d(long j) {
        boolean z10;
        if (this.f9020c == -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.g(z10);
        this.f9020c = j;
    }

    @Override // n2.i
    public final void e(q qVar, int i6) {
        f0 A = qVar.A(i6, 2);
        this.f9019b = A;
        A.f(this.f9018a.f8518c);
    }

    @Override // n2.i
    public final void f(t tVar, long j, int i6, boolean z10) {
        boolean z11;
        u1.c.h(this.f9019b);
        int y9 = tVar.y();
        if ((y9 & 16) == 16 && (y9 & 7) == 0) {
            if (this.f9025h && this.f9022e > 0) {
                f0 f0Var = this.f9019b;
                f0Var.getClass();
                f0Var.c(this.f9023f, this.f9026i ? 1 : 0, this.f9022e, 0, null);
                this.f9022e = -1;
                this.f9023f = -9223372036854775807L;
                this.f9025h = false;
            }
            this.f9025h = true;
        } else if (this.f9025h) {
            int a10 = m2.i.a(this.f9021d);
            if (i6 < a10) {
                String str = a0.f12750a;
                Locale locale = Locale.US;
                u1.a.p("RtpVP8Reader", "Received RTP packet with unexpected sequence number. Expected: " + a10 + "; received: " + i6 + ". Dropping packet.");
                return;
            }
        } else {
            u1.a.p("RtpVP8Reader", "RTP packet is not the start of a new VP8 partition, skipping.");
            return;
        }
        if ((y9 & 128) != 0) {
            int y10 = tVar.y();
            if ((y10 & 128) != 0 && (tVar.y() & 128) != 0) {
                tVar.L(1);
            }
            if ((y10 & 64) != 0) {
                tVar.L(1);
            }
            if ((y10 & 32) != 0 || (y10 & 16) != 0) {
                tVar.L(1);
            }
        }
        if (this.f9022e == -1 && this.f9025h) {
            if ((tVar.h() & 1) == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f9026i = z11;
        }
        if (!this.j) {
            int i10 = tVar.f12812b;
            tVar.K(i10 + 6);
            int r10 = tVar.r() & 16383;
            int r11 = tVar.r() & 16383;
            tVar.K(i10);
            r1.q qVar = this.f9018a.f8518c;
            if (r10 != qVar.f11676u || r11 != qVar.f11677v) {
                f0 f0Var2 = this.f9019b;
                p a11 = qVar.a();
                a11.f11617t = r10;
                a11.f11618u = r11;
                r4.a.v(a11, f0Var2);
            }
            this.j = true;
        }
        int a12 = tVar.a();
        this.f9019b.a(a12, tVar);
        int i11 = this.f9022e;
        if (i11 == -1) {
            this.f9022e = a12;
        } else {
            this.f9022e = i11 + a12;
        }
        this.f9023f = a8.d.o(this.f9024g, j, this.f9020c, 90000);
        if (z10) {
            f0 f0Var3 = this.f9019b;
            f0Var3.getClass();
            f0Var3.c(this.f9023f, this.f9026i ? 1 : 0, this.f9022e, 0, null);
            this.f9022e = -1;
            this.f9023f = -9223372036854775807L;
            this.f9025h = false;
        }
        this.f9021d = i6;
    }
}
