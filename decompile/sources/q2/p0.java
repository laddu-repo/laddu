package q2;

import android.net.Uri;
import com.google.android.gms.internal.measurement.k4;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p0 implements u2.l {
    public final s0 A;
    public final u1.f B;
    public volatile boolean D;
    public long F;
    public w1.l G;
    public y2.f0 H;
    public boolean I;
    public final /* synthetic */ s0 J;

    /* renamed from: x, reason: collision with root package name */
    public final Uri f10927x;

    /* renamed from: y, reason: collision with root package name */
    public final w1.z f10928y;

    /* renamed from: z, reason: collision with root package name */
    public final n9.j f10929z;
    public final mc.i C = new Object();
    public boolean E = true;

    /* JADX WARN: Type inference failed for: r1v2, types: [mc.i, java.lang.Object] */
    public p0(s0 s0Var, Uri uri, w1.h hVar, n9.j jVar, s0 s0Var2, u1.f fVar) {
        this.J = s0Var;
        this.f10927x = uri;
        this.f10928y = new w1.z(hVar);
        this.f10929z = jVar;
        this.A = s0Var2;
        this.B = fVar;
        u.f10969b.getAndIncrement();
        this.G = a(0L);
    }

    public final w1.l a(long j) {
        Map map = Collections.EMPTY_MAP;
        String str = this.J.F;
        Map map2 = s0.f10944n0;
        Uri uri = this.f10927x;
        u1.c.i(uri, "The uri must be set.");
        return new w1.l(uri, 1, null, map2, j, -1L, str, 6);
    }

    @Override // u2.l
    public final void h() {
        w1.h hVar;
        y2.o oVar;
        int i6;
        int i10 = 0;
        while (i10 == 0 && !this.D) {
            try {
                long j = this.C.f8812a;
                w1.l a10 = a(j);
                this.G = a10;
                long y9 = this.f10928y.y(a10);
                if (this.D) {
                    if (i10 != 1 && this.f10929z.u() != -1) {
                        this.C.f8812a = this.f10929z.u();
                    }
                    k4.f(this.f10928y);
                    return;
                }
                if (y9 != -1) {
                    y9 += j;
                    s0 s0Var = this.J;
                    s0Var.O.post(new n0(s0Var, 0));
                }
                long j10 = y9;
                this.J.Q = l3.b.d(this.f10928y.f13558x.u());
                w1.z zVar = this.f10928y;
                l3.b bVar = this.J.Q;
                if (bVar != null && (i6 = bVar.f8100f) != -1) {
                    hVar = new t(zVar, i6, this);
                    y2.f0 B = this.J.B(new r0(0, true));
                    this.H = B;
                    B.f(s0.o0);
                } else {
                    hVar = zVar;
                }
                this.f10929z.C(hVar, this.f10927x, this.f10928y.f13558x.u(), j, j10, this.A);
                if (this.J.Q != null && (oVar = (y2.o) this.f10929z.f9356z) != null) {
                    y2.o d10 = oVar.d();
                    if (d10 instanceof r3.d) {
                        ((r3.d) d10).f11825r = true;
                    }
                }
                if (this.E) {
                    n9.j jVar = this.f10929z;
                    long j11 = this.F;
                    y2.o oVar2 = (y2.o) jVar.f9356z;
                    oVar2.getClass();
                    oVar2.c(j, j11);
                    this.E = false;
                }
                while (i10 == 0 && !this.D) {
                    try {
                        u1.f fVar = this.B;
                        synchronized (fVar) {
                            while (!fVar.f12772b) {
                                fVar.f12771a.getClass();
                                fVar.wait();
                            }
                        }
                        n9.j jVar2 = this.f10929z;
                        mc.i iVar = this.C;
                        y2.o oVar3 = (y2.o) jVar2.f9356z;
                        oVar3.getClass();
                        y2.l lVar = (y2.l) jVar2.A;
                        lVar.getClass();
                        i10 = oVar3.i(lVar, iVar);
                        long u3 = this.f10929z.u();
                        if (u3 > this.J.G + j) {
                            this.B.d();
                            s0 s0Var2 = this.J;
                            s0Var2.O.post(s0Var2.N);
                            j = u3;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i10 == 1) {
                    i10 = 0;
                } else if (this.f10929z.u() != -1) {
                    this.C.f8812a = this.f10929z.u();
                }
                k4.f(this.f10928y);
            } catch (Throwable th) {
                if (i10 != 1 && this.f10929z.u() != -1) {
                    this.C.f8812a = this.f10929z.u();
                }
                k4.f(this.f10928y);
                throw th;
            }
        }
    }

    @Override // u2.l
    public final void p() {
        this.D = true;
    }
}
