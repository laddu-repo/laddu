package n2;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Locale;
import m2.l;
import r1.p;
import u1.a0;
import u1.t;
import y2.f0;
import y2.q;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    public final l f9006a;

    /* renamed from: b, reason: collision with root package name */
    public f0 f9007b;

    /* renamed from: d, reason: collision with root package name */
    public long f9009d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9011f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9012g;

    /* renamed from: c, reason: collision with root package name */
    public long f9008c = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f9010e = -1;

    public h(l lVar) {
        this.f9006a = lVar;
    }

    @Override // n2.i
    public final void c(long j, long j10) {
        this.f9008c = j;
        this.f9009d = j10;
    }

    @Override // n2.i
    public final void d(long j) {
        this.f9008c = j;
    }

    @Override // n2.i
    public final void e(q qVar, int i6) {
        f0 A = qVar.A(i6, 1);
        this.f9007b = A;
        A.f(this.f9006a.f8518c);
    }

    @Override // n2.i
    public final void f(t tVar, long j, int i6, boolean z10) {
        boolean z11;
        u1.c.h(this.f9007b);
        boolean z12 = false;
        if (!this.f9011f) {
            int i10 = tVar.f12812b;
            if (tVar.f12813c > 18) {
                z11 = true;
            } else {
                z11 = false;
            }
            u1.c.a("ID Header has insufficient data", z11);
            u1.c.a("ID Header missing", tVar.w(8, StandardCharsets.UTF_8).equals("OpusHead"));
            if (tVar.y() == 1) {
                z12 = true;
            }
            u1.c.a("version number must always be 1", z12);
            tVar.K(i10);
            ArrayList c10 = y2.a.c(tVar.f12811a);
            p a10 = this.f9006a.f8518c.a();
            a10.f11614p = c10;
            r4.a.v(a10, this.f9007b);
            this.f9011f = true;
        } else if (!this.f9012g) {
            if (tVar.f12813c >= 8) {
                z12 = true;
            }
            u1.c.a("Comment Header has insufficient data", z12);
            u1.c.a("Comment Header should follow ID Header", tVar.w(8, StandardCharsets.UTF_8).equals("OpusTags"));
            this.f9012g = true;
        } else {
            int a11 = m2.i.a(this.f9010e);
            if (i6 != a11) {
                String str = a0.f12750a;
                Locale locale = Locale.US;
                u1.a.p("RtpOpusReader", "Received RTP packet with unexpected sequence number. Expected: " + a11 + "; received: " + i6 + ".");
            }
            int a12 = tVar.a();
            this.f9007b.a(a12, tVar);
            this.f9007b.c(a8.d.o(this.f9009d, j, this.f9008c, 48000), 1, a12, 0, null);
        }
        this.f9010e = i6;
    }
}
