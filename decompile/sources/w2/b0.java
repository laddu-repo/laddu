package w2;

import android.os.SystemClock;
import java.util.NoSuchElementException;
import r1.k0;
import r1.p1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final s8.l f13597a;

    /* renamed from: b, reason: collision with root package name */
    public final w f13598b;

    /* renamed from: c, reason: collision with root package name */
    public final cg.d f13599c = new cg.d();

    /* renamed from: d, reason: collision with root package name */
    public final s3.c f13600d = new s3.c();

    /* renamed from: e, reason: collision with root package name */
    public final s3.c f13601e = new s3.c();

    /* renamed from: f, reason: collision with root package name */
    public final com.google.android.material.datepicker.o f13602f;

    /* renamed from: g, reason: collision with root package name */
    public long f13603g;

    /* renamed from: h, reason: collision with root package name */
    public long f13604h;

    /* renamed from: i, reason: collision with root package name */
    public long f13605i;
    public p1 j;

    /* renamed from: k, reason: collision with root package name */
    public long f13606k;

    /* JADX WARN: Type inference failed for: r4v4, types: [com.google.android.material.datepicker.o, java.lang.Object] */
    public b0(s8.l lVar, w wVar) {
        this.f13597a = lVar;
        this.f13598b = wVar;
        ?? obj = new Object();
        int highestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        obj.f2673x = 0;
        obj.f2674y = -1;
        obj.f2675z = 0;
        obj.B = new long[highestOneBit];
        obj.A = highestOneBit - 1;
        this.f13602f = obj;
        this.f13603g = -9223372036854775807L;
        this.j = p1.f11626d;
        this.f13604h = -9223372036854775807L;
        this.f13605i = -9223372036854775807L;
    }

    public final void a(long j, long j10) {
        boolean z10;
        long j11;
        r1.q qVar;
        final s8.l lVar = this.f13597a;
        d dVar = (d) lVar.f12252z;
        while (true) {
            com.google.android.material.datepicker.o oVar = this.f13602f;
            int i6 = oVar.f2675z;
            if (i6 == 0) {
                return;
            }
            if (i6 != 0) {
                long j12 = ((long[]) oVar.B)[oVar.f2673x];
                Long l10 = (Long) this.f13601e.f(j12);
                w wVar = this.f13598b;
                if (l10 != null && l10.longValue() != this.f13606k) {
                    this.f13606k = l10.longValue();
                    wVar.f(2);
                }
                long j13 = this.f13606k;
                w wVar2 = this.f13598b;
                cg.d dVar2 = this.f13599c;
                int a10 = wVar2.a(j12, j, j10, j13, false, false, dVar2);
                boolean z11 = true;
                if (a10 != 0 && a10 != 1) {
                    if (a10 != 2 && a10 != 3) {
                        if (a10 != 4) {
                            if (a10 == 5) {
                                return;
                            } else {
                                throw new IllegalStateException(String.valueOf(a10));
                            }
                        }
                        this.f13604h = j12;
                    } else {
                        this.f13604h = j12;
                        oVar.c();
                        final int i10 = 1;
                        dVar.f13618h.execute(new Runnable() { // from class: w2.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i10) {
                                    case 0:
                                        ((d) lVar.f12252z).f13617g.a();
                                        return;
                                    default:
                                        ((d) lVar.f12252z).f13617g.l();
                                        return;
                                }
                            }
                        });
                        h hVar = (h) dVar.f13613c.remove();
                        hVar.f13640c.M0(hVar.f13638a, hVar.f13639b);
                    }
                } else {
                    this.f13604h = j12;
                    if (a10 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    long c10 = oVar.c();
                    p1 p1Var = (p1) this.f13600d.f(c10);
                    if (p1Var != null && !p1Var.equals(p1.f11626d) && !p1Var.equals(this.j)) {
                        this.j = p1Var;
                        r1.p pVar = new r1.p();
                        pVar.f11617t = p1Var.f11630a;
                        pVar.f11618u = p1Var.f11631b;
                        pVar.f11611m = k0.p("video/raw");
                        lVar.f12251y = new r1.q(pVar);
                        dVar.f13618h.execute(new m8.c(12, lVar, p1Var));
                    }
                    if (z10) {
                        j11 = System.nanoTime();
                    } else {
                        j11 = dVar2.f2096b;
                    }
                    long j14 = j11;
                    if (wVar.f13709e == 3) {
                        z11 = false;
                    }
                    wVar.f13709e = 3;
                    wVar.f13715l.getClass();
                    wVar.f13711g = u1.a0.Q(SystemClock.elapsedRealtime());
                    if (z11 && dVar.f13614d != null) {
                        final int i11 = 0;
                        dVar.f13618h.execute(new Runnable() { // from class: w2.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        ((d) lVar.f12252z).f13617g.a();
                                        return;
                                    default:
                                        ((d) lVar.f12252z).f13617g.l();
                                        return;
                                }
                            }
                        });
                    }
                    r1.q qVar2 = (r1.q) lVar.f12251y;
                    if (qVar2 == null) {
                        qVar = new r1.q(new r1.p());
                    } else {
                        qVar = qVar2;
                    }
                    dVar.f13619i.c(c10, j14, qVar, null);
                    h hVar2 = (h) dVar.f13613c.remove();
                    hVar2.f13640c.I0(hVar2.f13638a, hVar2.f13639b, j14);
                }
            } else {
                throw new NoSuchElementException();
            }
        }
    }
}
