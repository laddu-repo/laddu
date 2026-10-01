package w2;

import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;
import r1.p1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final w f13611a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f13612b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f13613c;

    /* renamed from: d, reason: collision with root package name */
    public Surface f13614d;

    /* renamed from: e, reason: collision with root package name */
    public r1.q f13615e;

    /* renamed from: f, reason: collision with root package name */
    public long f13616f;

    /* renamed from: g, reason: collision with root package name */
    public f0 f13617g;

    /* renamed from: h, reason: collision with root package name */
    public Executor f13618h;

    /* renamed from: i, reason: collision with root package name */
    public v f13619i;

    /* JADX WARN: Type inference failed for: r3v6, types: [w2.v, java.lang.Object] */
    public d(w wVar, u1.v vVar) {
        this.f13611a = wVar;
        wVar.f13715l = vVar;
        this.f13612b = new b0(new s8.l(this, 15), wVar);
        this.f13613c = new ArrayDeque();
        this.f13615e = new r1.q(new r1.p());
        this.f13616f = -9223372036854775807L;
        this.f13617g = f0.f13636v;
        this.f13618h = new q.a(2);
        this.f13619i = new Object();
    }

    @Override // w2.h0
    public final void b(float f3) {
        this.f13611a.i(f3);
    }

    @Override // w2.h0
    public final boolean c() {
        b0 b0Var = this.f13612b;
        long j = b0Var.f13605i;
        if (j != -9223372036854775807L && b0Var.f13604h == j) {
            return true;
        }
        return false;
    }

    @Override // w2.h0
    public final Surface d() {
        Surface surface = this.f13614d;
        u1.c.h(surface);
        return surface;
    }

    @Override // w2.h0
    public final void e(v vVar) {
        this.f13619i = vVar;
    }

    @Override // w2.h0
    public final void f(u5.r rVar) {
        this.f13617g = rVar;
        this.f13618h = hb.q.f6029x;
    }

    @Override // w2.h0
    public final void g() {
        this.f13611a.e();
    }

    @Override // w2.h0
    public final void h() {
        this.f13611a.d();
    }

    @Override // w2.h0
    public final void i(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // w2.h0
    public final boolean isInitialized() {
        return true;
    }

    @Override // w2.h0
    public final void j() {
        b0 b0Var = this.f13612b;
        if (b0Var.f13603g == -9223372036854775807L) {
            b0Var.f13603g = Long.MIN_VALUE;
            b0Var.f13604h = Long.MIN_VALUE;
        }
        b0Var.f13605i = b0Var.f13603g;
    }

    @Override // w2.h0
    public final void k(int i6) {
        a0 a0Var = this.f13611a.f13706b;
        if (a0Var.j == i6) {
            return;
        }
        a0Var.j = i6;
        a0Var.d(true);
    }

    @Override // w2.h0
    public final boolean l(r1.q qVar) {
        return true;
    }

    @Override // w2.h0
    public final void m() {
        this.f13614d = null;
        this.f13611a.h(null);
    }

    @Override // w2.h0
    public final void n(r1.q qVar, long j, int i6, List list) {
        long j10;
        long j11;
        u1.c.g(list.isEmpty());
        int i10 = qVar.f11676u;
        int i11 = qVar.f11677v;
        r1.q qVar2 = this.f13615e;
        int i12 = qVar2.f11676u;
        b0 b0Var = this.f13612b;
        if (i10 != i12 || i11 != qVar2.f11677v) {
            s3.c cVar = b0Var.f13600d;
            long j12 = b0Var.f13603g;
            if (j12 == -9223372036854775807L) {
                j10 = 0;
            } else {
                j10 = j12 + 1;
            }
            cVar.a(j10, new p1(i10, i11));
        }
        float f3 = qVar.f11680y;
        if (f3 != this.f13615e.f11680y) {
            this.f13611a.g(f3);
        }
        this.f13615e = qVar;
        if (j != this.f13616f) {
            if (b0Var.f13602f.f2675z == 0) {
                b0Var.f13598b.f(i6);
                b0Var.f13606k = j;
            } else {
                s3.c cVar2 = b0Var.f13601e;
                long j13 = b0Var.f13603g;
                if (j13 == -9223372036854775807L) {
                    j11 = -4611686018427387904L;
                } else {
                    j11 = j13 + 1;
                }
                cVar2.a(j11, Long.valueOf(j));
            }
            this.f13616f = j;
        }
    }

    @Override // w2.h0
    public final void o(boolean z10) {
        boolean z11;
        if (z10) {
            w wVar = this.f13611a;
            a0 a0Var = wVar.f13706b;
            a0Var.f13592m = 0L;
            a0Var.f13595p = -1L;
            a0Var.f13593n = -1L;
            wVar.f13712h = -9223372036854775807L;
            wVar.f13710f = -9223372036854775807L;
            wVar.f13709e = Math.min(wVar.f13709e, 1);
            wVar.f13713i = -9223372036854775807L;
        }
        b0 b0Var = this.f13612b;
        s3.c cVar = b0Var.f13600d;
        com.google.android.material.datepicker.o oVar = b0Var.f13602f;
        boolean z12 = false;
        oVar.f2673x = 0;
        oVar.f2674y = -1;
        oVar.f2675z = 0;
        b0Var.f13603g = -9223372036854775807L;
        b0Var.f13604h = -9223372036854775807L;
        b0Var.f13605i = -9223372036854775807L;
        s3.c cVar2 = b0Var.f13601e;
        if (cVar2.h() > 0) {
            if (cVar2.h() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            u1.c.b(z11);
            while (cVar2.h() > 1) {
                cVar2.e();
            }
            Object e10 = cVar2.e();
            e10.getClass();
            b0Var.f13606k = ((Long) e10).longValue();
        }
        if (cVar.h() > 0) {
            if (cVar.h() > 0) {
                z12 = true;
            }
            u1.c.b(z12);
            while (cVar.h() > 1) {
                cVar.e();
            }
            Object e11 = cVar.e();
            e11.getClass();
            cVar.a(0L, (p1) e11);
        }
        this.f13613c.clear();
    }

    @Override // w2.h0
    public final void p(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // w2.h0
    public final void q(long j, long j10) {
        try {
            this.f13612b.a(j, j10);
        } catch (a2.q e10) {
            throw new g0(e10, this.f13615e);
        }
    }

    @Override // w2.h0
    public final void r(boolean z10) {
        this.f13611a.c(z10);
    }

    @Override // w2.h0
    public final boolean s(boolean z10) {
        return this.f13611a.b(z10);
    }

    @Override // w2.h0
    public final void t() {
        throw new UnsupportedOperationException();
    }

    @Override // w2.h0
    public final boolean u(long j, h hVar) {
        this.f13613c.add(hVar);
        b0 b0Var = this.f13612b;
        com.google.android.material.datepicker.o oVar = b0Var.f13602f;
        int i6 = oVar.f2675z;
        long[] jArr = (long[]) oVar.B;
        if (i6 == jArr.length) {
            int length = jArr.length << 1;
            if (length >= 0) {
                long[] jArr2 = new long[length];
                int length2 = jArr.length;
                int i10 = oVar.f2673x;
                int i11 = length2 - i10;
                System.arraycopy(jArr, i10, jArr2, 0, i11);
                System.arraycopy((long[]) oVar.B, 0, jArr2, i11, i10);
                oVar.f2673x = 0;
                oVar.f2674y = oVar.f2675z - 1;
                oVar.B = jArr2;
                oVar.A = length - 1;
            } else {
                throw new IllegalStateException();
            }
        }
        int i12 = (oVar.f2674y + 1) & oVar.A;
        oVar.f2674y = i12;
        ((long[]) oVar.B)[i12] = j;
        oVar.f2675z++;
        b0Var.f13603g = j;
        b0Var.f13605i = -9223372036854775807L;
        this.f13618h.execute(new j2.h(this, 14));
        return true;
    }

    @Override // w2.h0
    public final void v(Surface surface, u1.u uVar) {
        this.f13614d = surface;
        this.f13611a.h(surface);
    }

    @Override // w2.h0
    public final void w() {
        w wVar = this.f13611a;
        if (wVar.f13709e == 0) {
            wVar.f13709e = 1;
        }
    }

    @Override // w2.h0
    public final void a() {
    }
}
