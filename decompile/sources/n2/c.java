package n2;

import java.util.Locale;
import m2.l;
import u1.a0;
import u1.t;
import y2.f0;
import y2.q;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements i {

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f8961h = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f8962i = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: a, reason: collision with root package name */
    public final l f8963a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8964b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8965c;

    /* renamed from: d, reason: collision with root package name */
    public f0 f8966d;

    /* renamed from: e, reason: collision with root package name */
    public long f8967e;

    /* renamed from: f, reason: collision with root package name */
    public long f8968f;

    /* renamed from: g, reason: collision with root package name */
    public int f8969g;

    public c(l lVar) {
        this.f8963a = lVar;
        String str = lVar.f8518c.f11670n;
        str.getClass();
        this.f8964b = "audio/amr-wb".equals(str);
        this.f8965c = lVar.f8517b;
        this.f8967e = -9223372036854775807L;
        this.f8969g = -1;
        this.f8968f = 0L;
    }

    @Override // n2.i
    public final void c(long j, long j10) {
        this.f8967e = j;
        this.f8968f = j10;
    }

    @Override // n2.i
    public final void d(long j) {
        this.f8967e = j;
    }

    @Override // n2.i
    public final void e(q qVar, int i6) {
        f0 A = qVar.A(i6, 1);
        this.f8966d = A;
        A.f(this.f8963a.f8518c);
    }

    @Override // n2.i
    public final void f(t tVar, long j, int i6, boolean z10) {
        boolean z11;
        String str;
        int i10;
        int a10;
        u1.c.h(this.f8966d);
        int i11 = this.f8969g;
        if (i11 != -1 && i6 != (a10 = m2.i.a(i11))) {
            String str2 = a0.f12750a;
            Locale locale = Locale.US;
            u1.a.p("RtpAmrReader", "Received RTP packet with unexpected sequence number. Expected: " + a10 + "; received: " + i6 + ".");
        }
        boolean z12 = true;
        tVar.L(1);
        int h4 = (tVar.h() >> 3) & 15;
        if ((h4 >= 0 && h4 <= 8) || h4 == 15) {
            z11 = true;
        } else {
            z11 = false;
        }
        StringBuilder sb2 = new StringBuilder("Illegal AMR ");
        boolean z13 = this.f8964b;
        if (z13) {
            str = "WB";
        } else {
            str = "NB";
        }
        sb2.append(str);
        sb2.append(" frame type ");
        sb2.append(h4);
        u1.c.a(sb2.toString(), z11);
        if (z13) {
            i10 = f8962i[h4];
        } else {
            i10 = f8961h[h4];
        }
        int a11 = tVar.a();
        if (a11 != i10) {
            z12 = false;
        }
        u1.c.a("compound payload not supported currently", z12);
        this.f8966d.a(a11, tVar);
        this.f8966d.c(a8.d.o(this.f8968f, j, this.f8967e, this.f8965c), 1, a11, 0, null);
        this.f8969g = i6;
    }
}
