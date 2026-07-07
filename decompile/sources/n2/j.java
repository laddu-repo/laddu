package n2;

import android.util.Log;
import java.util.Locale;
import m2.l;
import u1.a0;
import u1.t;
import y2.f0;
import y2.q;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    public final l f9013a;

    /* renamed from: b, reason: collision with root package name */
    public f0 f9014b;

    /* renamed from: c, reason: collision with root package name */
    public long f9015c = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    public long f9016d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f9017e = -1;

    public j(l lVar) {
        this.f9013a = lVar;
    }

    @Override // n2.i
    public final void c(long j, long j10) {
        this.f9015c = j;
        this.f9016d = j10;
    }

    @Override // n2.i
    public final void d(long j) {
        this.f9015c = j;
    }

    @Override // n2.i
    public final void e(q qVar, int i6) {
        f0 A = qVar.A(i6, 1);
        this.f9014b = A;
        A.f(this.f9013a.f8518c);
    }

    @Override // n2.i
    public final void f(t tVar, long j, int i6, boolean z10) {
        int a10;
        this.f9014b.getClass();
        int i10 = this.f9017e;
        if (i10 != -1 && i6 != (a10 = m2.i.a(i10))) {
            String str = a0.f12750a;
            Locale locale = Locale.US;
            Log.w("RtpPcmReader", "Received RTP packet with unexpected sequence number. Expected: " + a10 + "; received: " + i6 + ".");
        }
        long o10 = a8.d.o(this.f9016d, j, this.f9015c, this.f9013a.f8517b);
        int a11 = tVar.a();
        this.f9014b.a(a11, tVar);
        this.f9014b.c(o10, 1, a11, 0, null);
        this.f9017e = i6;
    }
}
