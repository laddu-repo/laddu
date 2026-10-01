package i4;

import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class z implements r1.s0 {

    /* renamed from: x, reason: collision with root package name */
    public final WeakReference f6600x;

    /* renamed from: y, reason: collision with root package name */
    public final WeakReference f6601y;

    public z(b0 b0Var, l1 l1Var) {
        this.f6600x = new WeakReference(b0Var);
        this.f6601y = new WeakReference(l1Var);
    }

    @Override // r1.s0
    public final void A(int i6, r1.e0 e0Var) {
        r1.j1 j1Var;
        boolean z10;
        b0 j = j();
        if (j != null) {
            j.u();
            if (((l1) this.f6601y.get()) == null) {
                return;
            }
            j1 j1Var2 = j.s;
            r1.n0 n0Var = j1Var2.f6417a;
            r1 r1Var = j1Var2.f6419c;
            r1.t0 t0Var = j1Var2.f6420d;
            r1.t0 t0Var2 = j1Var2.f6421e;
            int i10 = j1Var2.f6422f;
            r1.o0 o0Var = j1Var2.f6423g;
            int i11 = j1Var2.f6424h;
            boolean z11 = j1Var2.f6425i;
            r1.d1 d1Var = j1Var2.j;
            int i12 = j1Var2.f6426k;
            r1.p1 p1Var = j1Var2.f6427l;
            r1.h0 h0Var = j1Var2.f6428m;
            float f3 = j1Var2.f6429n;
            r1.d dVar = j1Var2.f6430o;
            t1.c cVar = j1Var2.f6431p;
            r1.j jVar = j1Var2.f6432q;
            int i13 = j1Var2.f6433r;
            boolean z12 = j1Var2.s;
            boolean z13 = j1Var2.f6434t;
            int i14 = j1Var2.f6435u;
            boolean z14 = j1Var2.f6436v;
            boolean z15 = j1Var2.f6437w;
            int i15 = j1Var2.f6438x;
            int i16 = j1Var2.f6439y;
            r1.h0 h0Var2 = j1Var2.f6440z;
            long j10 = j1Var2.A;
            long j11 = j1Var2.B;
            long j12 = j1Var2.C;
            r1.l1 l1Var = j1Var2.D;
            r1.j1 j1Var3 = j1Var2.E;
            try {
                if (!d1Var.p()) {
                    j1Var = j1Var3;
                    if (r1Var.f6530a.f11703b >= d1Var.o()) {
                        z10 = false;
                        u1.c.g(z10);
                        j.s = new j1(n0Var, i6, r1Var, t0Var, t0Var2, i10, o0Var, i11, z11, p1Var, d1Var, i12, h0Var, f3, dVar, cVar, jVar, i13, z12, z13, i14, i15, i16, z14, z15, h0Var2, j10, j11, j12, l1Var, j1Var);
                        j.f6303c.a(true, true);
                        j.f6308h.f6475i.j(e0Var);
                        return;
                    }
                } else {
                    j1Var = j1Var3;
                }
                j.f6308h.f6475i.j(e0Var);
                return;
            } catch (RemoteException e10) {
                u1.a.h("MediaSessionImpl", "Exception in using media1 API", e10);
                return;
            }
            z10 = true;
            u1.c.g(z10);
            j.s = new j1(n0Var, i6, r1Var, t0Var, t0Var2, i10, o0Var, i11, z11, p1Var, d1Var, i12, h0Var, f3, dVar, cVar, jVar, i13, z12, z13, i14, i15, i16, z14, z15, h0Var2, j10, j11, j12, l1Var, j1Var);
            j.f6303c.a(true, true);
        }
    }

    @Override // r1.s0
    public final void C(r1.d dVar) {
        r1.j1 j1Var;
        boolean z10;
        b0 j = j();
        if (j != null) {
            j.u();
            if (((l1) this.f6601y.get()) == null) {
                return;
            }
            j1 j1Var2 = j.s;
            r1.n0 n0Var = j1Var2.f6417a;
            int i6 = j1Var2.f6418b;
            r1 r1Var = j1Var2.f6419c;
            r1.t0 t0Var = j1Var2.f6420d;
            r1.t0 t0Var2 = j1Var2.f6421e;
            int i10 = j1Var2.f6422f;
            r1.o0 o0Var = j1Var2.f6423g;
            int i11 = j1Var2.f6424h;
            boolean z11 = j1Var2.f6425i;
            r1.d1 d1Var = j1Var2.j;
            int i12 = j1Var2.f6426k;
            r1.p1 p1Var = j1Var2.f6427l;
            r1.h0 h0Var = j1Var2.f6428m;
            float f3 = j1Var2.f6429n;
            t1.c cVar = j1Var2.f6431p;
            r1.j jVar = j1Var2.f6432q;
            int i13 = j1Var2.f6433r;
            boolean z12 = j1Var2.s;
            boolean z13 = j1Var2.f6434t;
            int i14 = j1Var2.f6435u;
            boolean z14 = j1Var2.f6436v;
            boolean z15 = j1Var2.f6437w;
            int i15 = j1Var2.f6438x;
            int i16 = j1Var2.f6439y;
            r1.h0 h0Var2 = j1Var2.f6440z;
            long j10 = j1Var2.A;
            long j11 = j1Var2.B;
            long j12 = j1Var2.C;
            r1.l1 l1Var = j1Var2.D;
            r1.j1 j1Var3 = j1Var2.E;
            try {
                if (!d1Var.p()) {
                    j1Var = j1Var3;
                    if (r1Var.f6530a.f11703b >= d1Var.o()) {
                        z10 = false;
                        u1.c.g(z10);
                        j.s = new j1(n0Var, i6, r1Var, t0Var, t0Var2, i10, o0Var, i11, z11, p1Var, d1Var, i12, h0Var, f3, dVar, cVar, jVar, i13, z12, z13, i14, i15, i16, z14, z15, h0Var2, j10, j11, j12, l1Var, j1Var);
                        j.f6303c.a(true, true);
                        j.f6308h.f6475i.h(dVar);
                        return;
                    }
                } else {
                    j1Var = j1Var3;
                }
                j.f6308h.f6475i.h(dVar);
                return;
            } catch (RemoteException e10) {
                u1.a.h("MediaSessionImpl", "Exception in using media1 API", e10);
                return;
            }
            z10 = true;
            u1.c.g(z10);
            j.s = new j1(n0Var, i6, r1Var, t0Var, t0Var2, i10, o0Var, i11, z11, p1Var, d1Var, i12, h0Var, f3, dVar, cVar, jVar, i13, z12, z13, i14, i15, i16, z14, z15, h0Var2, j10, j11, j12, l1Var, j1Var);
            j.f6303c.a(true, true);
        }
    }

    @Override // r1.s0
    public final void D(r1.n0 n0Var) {
        r1.j1 j1Var;
        boolean z10;
        b0 j = j();
        if (j != null) {
            j.u();
            if (((l1) this.f6601y.get()) == null) {
                return;
            }
            j1 j1Var2 = j.s;
            int i6 = j1Var2.f6418b;
            r1 r1Var = j1Var2.f6419c;
            r1.t0 t0Var = j1Var2.f6420d;
            r1.t0 t0Var2 = j1Var2.f6421e;
            int i10 = j1Var2.f6422f;
            r1.o0 o0Var = j1Var2.f6423g;
            int i11 = j1Var2.f6424h;
            boolean z11 = j1Var2.f6425i;
            r1.d1 d1Var = j1Var2.j;
            int i12 = j1Var2.f6426k;
            r1.p1 p1Var = j1Var2.f6427l;
            r1.h0 h0Var = j1Var2.f6428m;
            float f3 = j1Var2.f6429n;
            r1.d dVar = j1Var2.f6430o;
            t1.c cVar = j1Var2.f6431p;
            r1.j jVar = j1Var2.f6432q;
            int i13 = j1Var2.f6433r;
            boolean z12 = j1Var2.s;
            boolean z13 = j1Var2.f6434t;
            int i14 = j1Var2.f6435u;
            boolean z14 = j1Var2.f6436v;
            boolean z15 = j1Var2.f6437w;
            int i15 = j1Var2.f6438x;
            int i16 = j1Var2.f6439y;
            r1.h0 h0Var2 = j1Var2.f6440z;
            long j10 = j1Var2.A;
            long j11 = j1Var2.B;
            long j12 = j1Var2.C;
            r1.l1 l1Var = j1Var2.D;
            r1.j1 j1Var3 = j1Var2.E;
            try {
                if (!d1Var.p()) {
                    j1Var = j1Var3;
                    if (r1Var.f6530a.f11703b >= d1Var.o()) {
                        z10 = false;
                        u1.c.g(z10);
                        j.s = new j1(n0Var, i6, r1Var, t0Var, t0Var2, i10, o0Var, i11, z11, p1Var, d1Var, i12, h0Var, f3, dVar, cVar, jVar, i13, z12, z13, i14, i15, i16, z14, z15, h0Var2, j10, j11, j12, l1Var, j1Var);
                        j.f6303c.a(true, true);
                        o0 o0Var2 = (o0) j.f6308h.f6475i.B;
                        o0Var2.N(o0Var2.f6473g.f6318t);
                        return;
                    }
                } else {
                    j1Var = j1Var3;
                }
                o0 o0Var22 = (o0) j.f6308h.f6475i.B;
                o0Var22.N(o0Var22.f6473g.f6318t);
                return;
            } catch (RemoteException e10) {
                u1.a.h("MediaSessionImpl", "Exception in using media1 API", e10);
                return;
            }
            z10 = true;
            u1.c.g(z10);
            j.s = new j1(n0Var, i6, r1Var, t0Var, t0Var2, i10, o0Var, i11, z11, p1Var, d1Var, i12, h0Var, f3, dVar, cVar, jVar, i13, z12, z13, i14, i15, i16, z14, z15, h0Var2, j10, j11, j12, l1Var, j1Var);
            j.f6303c.a(true, true);
        }
    }

    @Override // r1.s0
    public final void F() {
        b0 j = j();
        if (j != null) {
            j.u();
            ic.s sVar = j.f6307g.f6393f;
            db.k0 i6 = sVar.i();
            for (int i10 = 0; i10 < i6.size(); i10++) {
                s sVar2 = (s) i6.get(i10);
                sVar.l(sVar2);
                j.c(sVar2, new com.unity3d.ads.adplayer.b(13));
            }
        }
    }

    @Override // r1.s0
    public final void I(int i6, r1.t0 t0Var, r1.t0 t0Var2) {
        r1.j1 j1Var;
        boolean z10;
        b0 j = j();
        if (j != null) {
            j.u();
            if (((l1) this.f6601y.get()) == null) {
                return;
            }
            j1 j1Var2 = j.s;
            r1.n0 n0Var = j1Var2.f6417a;
            int i10 = j1Var2.f6418b;
            r1 r1Var = j1Var2.f6419c;
            r1.o0 o0Var = j1Var2.f6423g;
            int i11 = j1Var2.f6424h;
            boolean z11 = j1Var2.f6425i;
            r1.d1 d1Var = j1Var2.j;
            int i12 = j1Var2.f6426k;
            r1.p1 p1Var = j1Var2.f6427l;
            r1.h0 h0Var = j1Var2.f6428m;
            float f3 = j1Var2.f6429n;
            r1.d dVar = j1Var2.f6430o;
            t1.c cVar = j1Var2.f6431p;
            r1.j jVar = j1Var2.f6432q;
            int i13 = j1Var2.f6433r;
            boolean z12 = j1Var2.s;
            boolean z13 = j1Var2.f6434t;
            int i14 = j1Var2.f6435u;
            boolean z14 = j1Var2.f6436v;
            boolean z15 = j1Var2.f6437w;
            int i15 = j1Var2.f6438x;
            int i16 = j1Var2.f6439y;
            r1.h0 h0Var2 = j1Var2.f6440z;
            long j10 = j1Var2.A;
            long j11 = j1Var2.B;
            long j12 = j1Var2.C;
            r1.l1 l1Var = j1Var2.D;
            r1.j1 j1Var3 = j1Var2.E;
            try {
                if (!d1Var.p()) {
                    j1Var = j1Var3;
                    if (r1Var.f6530a.f11703b >= d1Var.o()) {
                        z10 = false;
                        u1.c.g(z10);
                        j.s = new j1(n0Var, i10, r1Var, t0Var, t0Var2, i6, o0Var, i11, z11, p1Var, d1Var, i12, h0Var, f3, dVar, cVar, jVar, i13, z12, z13, i14, i15, i16, z14, z15, h0Var2, j10, j11, j12, l1Var, j1Var);
                        j.f6303c.a(true, true);
                        o0 o0Var2 = (o0) j.f6308h.f6475i.B;
                        o0Var2.N(o0Var2.f6473g.f6318t);
                        return;
                    }
                } else {
                    j1Var = j1Var3;
                }
                o0 o0Var22 = (o0) j.f6308h.f6475i.B;
                o0Var22.N(o0Var22.f6473g.f6318t);
                return;
            } catch (RemoteException e10) {
                u1.a.h("MediaSessionImpl", "Exception in using media1 API", e10);
                return;
            }
            z10 = true;
            u1.c.g(z10);
            j.s = new j1(n0Var, i10, r1Var, t0Var, t0Var2, i6, o0Var, i11, z11, p1Var, d1Var, i12, h0Var, f3, dVar, cVar, jVar, i13, z12, z13, i14, i15, i16, z14, z15, h0Var2, j10, j11, j12, l1Var, j1Var);
            j.f6303c.a(true, true);
        }
    }

    @Override // r1.s0
    public final void J(r1.o0 o0Var) {
        r1.j1 j1Var;
        boolean z10;
        b0 j = j();
        if (j != null) {
            j.u();
            if (((l1) this.f6601y.get()) == null) {
                return;
            }
            j1 j1Var2 = j.s;
            r1.n0 n0Var = j1Var2.f6417a;
            int i6 = j1Var2.f6418b;
            r1 r1Var = j1Var2.f6419c;
            r1.t0 t0Var = j1Var2.f6420d;
            r1.t0 t0Var2 = j1Var2.f6421e;
            int i10 = j1Var2.f6422f;
            int i11 = j1Var2.f6424h;
            boolean z11 = j1Var2.f6425i;
            r1.d1 d1Var = j1Var2.j;
            int i12 = j1Var2.f6426k;
            r1.p1 p1Var = j1Var2.f6427l;
            r1.h0 h0Var = j1Var2.f6428m;
            float f3 = j1Var2.f6429n;
            r1.d dVar = j1Var2.f6430o;
            t1.c cVar = j1Var2.f6431p;
            r1.j jVar = j1Var2.f6432q;
            int i13 = j1Var2.f6433r;
            boolean z12 = j1Var2.s;
            boolean z13 = j1Var2.f6434t;
            int i14 = j1Var2.f6435u;
            boolean z14 = j1Var2.f6436v;
            boolean z15 = j1Var2.f6437w;
            int i15 = j1Var2.f6438x;
            int i16 = j1Var2.f6439y;
            r1.h0 h0Var2 = j1Var2.f6440z;
            long j10 = j1Var2.A;
            long j11 = j1Var2.B;
            long j12 = j1Var2.C;
            r1.l1 l1Var = j1Var2.D;
            r1.j1 j1Var3 = j1Var2.E;
            try {
                if (!d1Var.p()) {
                    j1Var = j1Var3;
                    if (r1Var.f6530a.f11703b >= d1Var.o()) {
                        z10 = false;
                        u1.c.g(z10);
                        j.s = new j1(n0Var, i6, r1Var, t0Var, t0Var2, i10, o0Var, i11, z11, p1Var, d1Var, i12, h0Var, f3, dVar, cVar, jVar, i13, z12, z13, i14, i15, i16, z14, z15, h0Var2, j10, j11, j12, l1Var, j1Var);
                        j.f6303c.a(true, true);
                        o0 o0Var2 = (o0) j.f6308h.f6475i.B;
                        o0Var2.N(o0Var2.f6473g.f6318t);
                        return;
                    }
                } else {
                    j1Var = j1Var3;
                }
                o0 o0Var22 = (o0) j.f6308h.f6475i.B;
                o0Var22.N(o0Var22.f6473g.f6318t);
                return;
            } catch (RemoteException e10) {
                u1.a.h("MediaSessionImpl", "Exception in using media1 API", e10);
                return;
            }
            z10 = true;
            u1.c.g(z10);
            j.s = new j1(n0Var, i6, r1Var, t0Var, t0Var2, i10, o0Var, i11, z11, p1Var, d1Var, i12, h0Var, f3, dVar, cVar, jVar, i13, z12, z13, i14, i15, i16, z14, z15, h0Var2, j10, j11, j12, l1Var, j1Var);
            j.f6303c.a(true, true);
        }
    }

    @Override // r1.s0
    public final void P(r1.h0 h0Var) {
        boolean z10;
        b0 j = j();
        if (j == null) {
            return;
        }
        j.u();
        j1 j1Var = j.s;
        r1.n0 n0Var = j1Var.f6417a;
        int i6 = j1Var.f6418b;
        r1 r1Var = j1Var.f6419c;
        r1.t0 t0Var = j1Var.f6420d;
        r1.t0 t0Var2 = j1Var.f6421e;
        int i10 = j1Var.f6422f;
        r1.o0 o0Var = j1Var.f6423g;
        int i11 = j1Var.f6424h;
        boolean z11 = j1Var.f6425i;
        r1.d1 d1Var = j1Var.j;
        int i12 = j1Var.f6426k;
        r1.p1 p1Var = j1Var.f6427l;
        float f3 = j1Var.f6429n;
        r1.d dVar = j1Var.f6430o;
        t1.c cVar = j1Var.f6431p;
        r1.j jVar = j1Var.f6432q;
        int i13 = j1Var.f6433r;
        boolean z12 = j1Var.s;
        boolean z13 = j1Var.f6434t;
        int i14 = j1Var.f6435u;
        boolean z14 = j1Var.f6436v;
        boolean z15 = j1Var.f6437w;
        int i15 = j1Var.f6438x;
        int i16 = j1Var.f6439y;
        r1.h0 h0Var2 = j1Var.f6440z;
        long j10 = j1Var.A;
        long j11 = j1Var.B;
        long j12 = j1Var.C;
        r1.l1 l1Var = j1Var.D;
        r1.j1 j1Var2 = j1Var.E;
        if (!d1Var.p() && r1Var.f6530a.f11703b >= d1Var.o()) {
            z10 = false;
        } else {
            z10 = true;
        }
        u1.c.g(z10);
        j.s = new j1(n0Var, i6, r1Var, t0Var, t0Var2, i10, o0Var, i11, z11, p1Var, d1Var, i12, h0Var, f3, dVar, cVar, jVar, i13, z12, z13, i14, i15, i16, z14, z15, h0Var2, j10, j11, j12, l1Var, j1Var2);
        j.f6303c.a(true, true);
        try {
            j.f6308h.f6475i.l(h0Var);
        } catch (RemoteException e10) {
            u1.a.h("MediaSessionImpl", "Exception in using media1 API", e10);
        }
    }

    @Override // r1.s0
    public final void Q(boolean z10) {
        boolean z11;
        b0 j = j();
        if (j != null) {
            j.u();
            if (((l1) this.f6601y.get()) == null) {
                return;
            }
            j1 j1Var = j.s;
            r1.n0 n0Var = j1Var.f6417a;
            int i6 = j1Var.f6418b;
            r1 r1Var = j1Var.f6419c;
            r1.t0 t0Var = j1Var.f6420d;
            r1.t0 t0Var2 = j1Var.f6421e;
            int i10 = j1Var.f6422f;
            r1.o0 o0Var = j1Var.f6423g;
            int i11 = j1Var.f6424h;
            boolean z12 = j1Var.f6425i;
            r1.d1 d1Var = j1Var.j;
            int i12 = j1Var.f6426k;
            r1.p1 p1Var = j1Var.f6427l;
            r1.h0 h0Var = j1Var.f6428m;
            float f3 = j1Var.f6429n;
            r1.d dVar = j1Var.f6430o;
            t1.c cVar = j1Var.f6431p;
            r1.j jVar = j1Var.f6432q;
            int i13 = j1Var.f6433r;
            boolean z13 = j1Var.s;
            boolean z14 = j1Var.f6434t;
            int i14 = j1Var.f6435u;
            boolean z15 = j1Var.f6437w;
            int i15 = j1Var.f6438x;
            int i16 = j1Var.f6439y;
            r1.h0 h0Var2 = j1Var.f6440z;
            long j10 = j1Var.A;
            long j11 = j1Var.B;
            long j12 = j1Var.C;
            r1.l1 l1Var = j1Var.D;
            r1.j1 j1Var2 = j1Var.E;
            if (!d1Var.p() && r1Var.f6530a.f11703b >= d1Var.o()) {
                z11 = false;
            } else {
                z11 = true;
            }
            u1.c.g(z11);
            j.s = new j1(n0Var, i6, r1Var, t0Var, t0Var2, i10, o0Var, i11, z12, p1Var, d1Var, i12, h0Var, f3, dVar, cVar, jVar, i13, z13, z14, i14, i15, i16, z10, z15, h0Var2, j10, j11, j12, l1Var, j1Var2);
            j.f6303c.a(true, true);
            try {
                o0 o0Var2 = (o0) j.f6308h.f6475i.B;
                o0Var2.N(o0Var2.f6473g.f6318t);
            } catch (RemoteException e10) {
                u1.a.h("MediaSessionImpl", "Exception in using media1 API", e10);
            }
            j.t();
        }
    }

    @Override // r1.s0
    public final void b(r1.p1 p1Var) {
        boolean z10;
        b0 j = j();
        if (j == null) {
            return;
        }
        j.u();
        j1 j1Var = j.s;
        r1.n0 n0Var = j1Var.f6417a;
        int i6 = j1Var.f6418b;
        r1 r1Var = j1Var.f6419c;
        r1.t0 t0Var = j1Var.f6420d;
        r1.t0 t0Var2 = j1Var.f6421e;
        int i10 = j1Var.f6422f;
        r1.o0 o0Var = j1Var.f6423g;
        int i11 = j1Var.f6424h;
        boolean z11 = j1Var.f6425i;
        r1.d1 d1Var = j1Var.j;
        int i12 = j1Var.f6426k;
        r1.h0 h0Var = j1Var.f6428m;
        float f3 = j1Var.f6429n;
        r1.d dVar = j1Var.f6430o;
        t1.c cVar = j1Var.f6431p;
        r1.j jVar = j1Var.f6432q;
        int i13 = j1Var.f6433r;
        boolean z12 = j1Var.s;
        boolean z13 = j1Var.f6434t;
        int i14 = j1Var.f6435u;
        boolean z14 = j1Var.f6436v;
        boolean z15 = j1Var.f6437w;
        int i15 = j1Var.f6438x;
        int i16 = j1Var.f6439y;
        r1.h0 h0Var2 = j1Var.f6440z;
        long j10 = j1Var.A;
        long j11 = j1Var.B;
        long j12 = j1Var.C;
        r1.l1 l1Var = j1Var.D;
        r1.j1 j1Var2 = j1Var.E;
        if (!d1Var.p() && r1Var.f6530a.f11703b >= d1Var.o()) {
            z10 = false;
        } else {
            z10 = true;
        }
        u1.c.g(z10);
        j.s = new j1(n0Var, i6, r1Var, t0Var, t0Var2, i10, o0Var, i11, z11, p1Var, d1Var, i12, h0Var, f3, dVar, cVar, jVar, i13, z12, z13, i14, i15, i16, z14, z15, h0Var2, j10, j11, j12, l1Var, j1Var2);
        j.f6303c.a(true, true);
        try {
            j.f6308h.f6475i.getClass();
        } catch (RemoteException e10) {
            u1.a.h("MediaSessionImpl", "Exception in using media1 API", e10);
        }
    }

    @Override // r1.s0
    public final void c(int i6) {
        r1.j1 j1Var;
        boolean z10;
        b0 j = j();
        if (j != null) {
            j.u();
            if (((l1) this.f6601y.get()) == null) {
                return;
            }
            j1 j1Var2 = j.s;
            r1.n0 n0Var = j1Var2.f6417a;
            int i10 = j1Var2.f6418b;
            r1 r1Var = j1Var2.f6419c;
            r1.t0 t0Var = j1Var2.f6420d;
            r1.t0 t0Var2 = j1Var2.f6421e;
            int i11 = j1Var2.f6422f;
            r1.o0 o0Var = j1Var2.f6423g;
            boolean z11 = j1Var2.f6425i;
            r1.d1 d1Var = j1Var2.j;
            int i12 = j1Var2.f6426k;
            r1.p1 p1Var = j1Var2.f6427l;
            r1.h0 h0Var = j1Var2.f6428m;
            float f3 = j1Var2.f6429n;
            r1.d dVar = j1Var2.f6430o;
            t1.c cVar = j1Var2.f6431p;
            r1.j jVar = j1Var2.f6432q;
            int i13 = j1Var2.f6433r;
            boolean z12 = j1Var2.s;
            boolean z13 = j1Var2.f6434t;
            int i14 = j1Var2.f6435u;
            boolean z14 = j1Var2.f6436v;
            boolean z15 = j1Var2.f6437w;
            int i15 = j1Var2.f6438x;
            int i16 = j1Var2.f6439y;
            r1.h0 h0Var2 = j1Var2.f6440z;
            long j10 = j1Var2.A;
            long j11 = j1Var2.B;
            long j12 = j1Var2.C;
            r1.l1 l1Var = j1Var2.D;
            r1.j1 j1Var3 = j1Var2.E;
            try {
                if (!d1Var.p()) {
                    j1Var = j1Var3;
                    if (r1Var.f6530a.f11703b >= d1Var.o()) {
                        z10 = false;
                        u1.c.g(z10);
                        j.s = new j1(n0Var, i10, r1Var, t0Var, t0Var2, i11, o0Var, i6, z11, p1Var, d1Var, i12, h0Var, f3, dVar, cVar, jVar, i13, z12, z13, i14, i15, i16, z14, z15, h0Var2, j10, j11, j12, l1Var, j1Var);
                        j.f6303c.a(true, true);
                        j.f6308h.f6475i.m(i6);
                        return;
                    }
                } else {
                    j1Var = j1Var3;
                }
                j.f6308h.f6475i.m(i6);
                return;
            } catch (RemoteException e10) {
                u1.a.h("MediaSessionImpl", "Exception in using media1 API", e10);
                return;
            }
            z10 = true;
            u1.c.g(z10);
            j.s = new j1(n0Var, i10, r1Var, t0Var, t0Var2, i11, o0Var, i6, z11, p1Var, d1Var, i12, h0Var, f3, dVar, cVar, jVar, i13, z12, z13, i14, i15, i16, z14, z15, h0Var2, j10, j11, j12, l1Var, j1Var);
            j.f6303c.a(true, true);
        }
    }

    @Override // r1.s0
    public final void e(int i6) {
        b0 j = j();
        if (j != null) {
            j.u();
            if (((l1) this.f6601y.get()) == null) {
                return;
            }
            j1 j1Var = j.s;
            j.s = j1Var.b(j1Var.f6434t, j1Var.f6435u, i6);
            j.f6303c.a(true, true);
            try {
                o0 o0Var = (o0) j.f6308h.f6475i.B;
                o0Var.N(o0Var.f6473g.f6318t);
            } catch (RemoteException e10) {
                u1.a.h("MediaSessionImpl", "Exception in using media1 API", e10);
            }
        }
    }

    @Override // r1.s0
    public final void h(r1.d1 d1Var, int i6) {
        b0 j = j();
        if (j != null) {
            j.u();
            l1 l1Var = (l1) this.f6601y.get();
            if (l1Var == null) {
                return;
            }
            j.s = j.s.c(d1Var, l1Var.f1(), i6);
            j.f6303c.a(false, true);
            try {
                j.f6308h.f6475i.o(d1Var);
            } catch (RemoteException e10) {
                u1.a.h("MediaSessionImpl", "Exception in using media1 API", e10);
            }
        }
    }

    @Override // r1.s0
    public final void i(r1.l1 l1Var) {
        b0 j = j();
        if (j != null) {
            j.u();
            if (((l1) this.f6601y.get()) == null) {
                return;
            }
            j.s = j.s.a(l1Var);
            j.f6303c.a(true, false);
            j.d(new com.unity3d.ads.adplayer.b(l1Var, 11));
        }
    }

    public final b0 j() {
        return (b0) this.f6600x.get();
    }

    @Override // r1.s0
    public final void k(r1.j1 j1Var) {
        b0 j = j();
        if (j != null) {
            j.u();
            if (((l1) this.f6601y.get()) == null) {
                return;
            }
            j.s = j.s.d(j1Var);
            j.f6303c.a(true, true);
            j.d(new com.unity3d.ads.adplayer.b(j1Var, 12));
        }
    }

    @Override // r1.s0
    public final void m(boolean z10) {
        boolean z11;
        b0 j = j();
        if (j != null) {
            j.u();
            if (((l1) this.f6601y.get()) == null) {
                return;
            }
            j1 j1Var = j.s;
            r1.n0 n0Var = j1Var.f6417a;
            int i6 = j1Var.f6418b;
            r1 r1Var = j1Var.f6419c;
            r1.t0 t0Var = j1Var.f6420d;
            r1.t0 t0Var2 = j1Var.f6421e;
            int i10 = j1Var.f6422f;
            r1.o0 o0Var = j1Var.f6423g;
            int i11 = j1Var.f6424h;
            boolean z12 = j1Var.f6425i;
            r1.d1 d1Var = j1Var.j;
            int i12 = j1Var.f6426k;
            r1.p1 p1Var = j1Var.f6427l;
            r1.h0 h0Var = j1Var.f6428m;
            float f3 = j1Var.f6429n;
            r1.d dVar = j1Var.f6430o;
            t1.c cVar = j1Var.f6431p;
            r1.j jVar = j1Var.f6432q;
            int i13 = j1Var.f6433r;
            boolean z13 = j1Var.s;
            boolean z14 = j1Var.f6434t;
            int i14 = j1Var.f6435u;
            boolean z15 = j1Var.f6436v;
            int i15 = j1Var.f6438x;
            int i16 = j1Var.f6439y;
            r1.h0 h0Var2 = j1Var.f6440z;
            long j10 = j1Var.A;
            long j11 = j1Var.B;
            long j12 = j1Var.C;
            r1.l1 l1Var = j1Var.D;
            r1.j1 j1Var2 = j1Var.E;
            if (!d1Var.p() && r1Var.f6530a.f11703b >= d1Var.o()) {
                z11 = false;
            } else {
                z11 = true;
            }
            u1.c.g(z11);
            j.s = new j1(n0Var, i6, r1Var, t0Var, t0Var2, i10, o0Var, i11, z12, p1Var, d1Var, i12, h0Var, f3, dVar, cVar, jVar, i13, z13, z14, i14, i15, i16, z15, z10, h0Var2, j10, j11, j12, l1Var, j1Var2);
            j.f6303c.a(true, true);
            try {
                j.f6308h.f6475i.getClass();
            } catch (RemoteException e10) {
                u1.a.h("MediaSessionImpl", "Exception in using media1 API", e10);
            }
            j.t();
        }
    }

    @Override // r1.s0
    public final void o(int i6, boolean z10) {
        b0 j = j();
        if (j != null) {
            j.u();
            if (((l1) this.f6601y.get()) == null) {
                return;
            }
            j1 j1Var = j.s;
            j.s = j1Var.b(z10, i6, j1Var.f6438x);
            j.f6303c.a(true, true);
            try {
                o0 o0Var = (o0) j.f6308h.f6475i.B;
                o0Var.N(o0Var.f6473g.f6318t);
            } catch (RemoteException e10) {
                u1.a.h("MediaSessionImpl", "Exception in using media1 API", e10);
            }
        }
    }

    @Override // r1.s0
    public final void p(r1.q0 q0Var) {
        b0 j = j();
        if (j != null) {
            j.u();
            if (((l1) this.f6601y.get()) == null) {
                return;
            }
            j.f(q0Var);
        }
    }

    @Override // r1.s0
    public final void q(float f3) {
        boolean z10;
        b0 j = j();
        if (j == null) {
            return;
        }
        j.u();
        j1 j1Var = j.s;
        r1.n0 n0Var = j1Var.f6417a;
        int i6 = j1Var.f6418b;
        r1 r1Var = j1Var.f6419c;
        r1.t0 t0Var = j1Var.f6420d;
        r1.t0 t0Var2 = j1Var.f6421e;
        int i10 = j1Var.f6422f;
        r1.o0 o0Var = j1Var.f6423g;
        int i11 = j1Var.f6424h;
        boolean z11 = j1Var.f6425i;
        r1.d1 d1Var = j1Var.j;
        int i12 = j1Var.f6426k;
        r1.p1 p1Var = j1Var.f6427l;
        r1.h0 h0Var = j1Var.f6428m;
        r1.d dVar = j1Var.f6430o;
        t1.c cVar = j1Var.f6431p;
        r1.j jVar = j1Var.f6432q;
        int i13 = j1Var.f6433r;
        boolean z12 = j1Var.s;
        boolean z13 = j1Var.f6434t;
        int i14 = j1Var.f6435u;
        boolean z14 = j1Var.f6436v;
        boolean z15 = j1Var.f6437w;
        int i15 = j1Var.f6438x;
        int i16 = j1Var.f6439y;
        r1.h0 h0Var2 = j1Var.f6440z;
        long j10 = j1Var.A;
        long j11 = j1Var.B;
        long j12 = j1Var.C;
        r1.l1 l1Var = j1Var.D;
        r1.j1 j1Var2 = j1Var.E;
        if (!d1Var.p() && r1Var.f6530a.f11703b >= d1Var.o()) {
            z10 = false;
        } else {
            z10 = true;
        }
        u1.c.g(z10);
        j.s = new j1(n0Var, i6, r1Var, t0Var, t0Var2, i10, o0Var, i11, z11, p1Var, d1Var, i12, h0Var, f3, dVar, cVar, jVar, i13, z12, z13, i14, i15, i16, z14, z15, h0Var2, j10, j11, j12, l1Var, j1Var2);
        j.f6303c.a(true, true);
        try {
            j.f6308h.f6475i.getClass();
        } catch (RemoteException e10) {
            u1.a.h("MediaSessionImpl", "Exception in using media1 API", e10);
        }
    }

    @Override // r1.s0
    public final void r(int i6) {
        boolean z10;
        b0 j = j();
        if (j != null) {
            j.u();
            l1 l1Var = (l1) this.f6601y.get();
            if (l1Var == null) {
                return;
            }
            j1 j1Var = j.s;
            r1.n0 S = l1Var.S();
            int i10 = j1Var.f6418b;
            r1 r1Var = j1Var.f6419c;
            r1.t0 t0Var = j1Var.f6420d;
            r1.t0 t0Var2 = j1Var.f6421e;
            int i11 = j1Var.f6422f;
            r1.o0 o0Var = j1Var.f6423g;
            int i12 = j1Var.f6424h;
            boolean z11 = j1Var.f6425i;
            r1.d1 d1Var = j1Var.j;
            int i13 = j1Var.f6426k;
            r1.p1 p1Var = j1Var.f6427l;
            r1.h0 h0Var = j1Var.f6428m;
            float f3 = j1Var.f6429n;
            r1.d dVar = j1Var.f6430o;
            t1.c cVar = j1Var.f6431p;
            r1.j jVar = j1Var.f6432q;
            int i14 = j1Var.f6433r;
            boolean z12 = j1Var.s;
            boolean z13 = j1Var.f6434t;
            int i15 = j1Var.f6435u;
            boolean z14 = j1Var.f6437w;
            int i16 = j1Var.f6438x;
            r1.h0 h0Var2 = j1Var.f6440z;
            long j10 = j1Var.A;
            long j11 = j1Var.B;
            long j12 = j1Var.C;
            r1.l1 l1Var2 = j1Var.D;
            r1.j1 j1Var2 = j1Var.E;
            boolean z15 = false;
            if (i6 == 3 && z13 && i16 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (d1Var.p() || r1Var.f6530a.f11703b < d1Var.o()) {
                z15 = true;
            }
            u1.c.g(z15);
            j.s = new j1(S, i10, r1Var, t0Var, t0Var2, i11, o0Var, i12, z11, p1Var, d1Var, i13, h0Var, f3, dVar, cVar, jVar, i14, z12, z13, i15, i16, i6, z10, z14, h0Var2, j10, j11, j12, l1Var2, j1Var2);
            j.f6303c.a(true, true);
            try {
                m0 m0Var = j.f6308h.f6475i;
                l1Var.S();
                o0 o0Var2 = (o0) m0Var.B;
                o0Var2.N(o0Var2.f6473g.f6318t);
            } catch (RemoteException e10) {
                u1.a.h("MediaSessionImpl", "Exception in using media1 API", e10);
            }
        }
    }

    @Override // r1.s0
    public final void s(r1.h0 h0Var) {
        r1.j1 j1Var;
        boolean z10;
        b0 j = j();
        if (j != null) {
            j.u();
            if (((l1) this.f6601y.get()) == null) {
                return;
            }
            j1 j1Var2 = j.s;
            r1.n0 n0Var = j1Var2.f6417a;
            int i6 = j1Var2.f6418b;
            r1 r1Var = j1Var2.f6419c;
            r1.t0 t0Var = j1Var2.f6420d;
            r1.t0 t0Var2 = j1Var2.f6421e;
            int i10 = j1Var2.f6422f;
            r1.o0 o0Var = j1Var2.f6423g;
            int i11 = j1Var2.f6424h;
            boolean z11 = j1Var2.f6425i;
            r1.d1 d1Var = j1Var2.j;
            int i12 = j1Var2.f6426k;
            r1.p1 p1Var = j1Var2.f6427l;
            r1.h0 h0Var2 = j1Var2.f6428m;
            float f3 = j1Var2.f6429n;
            r1.d dVar = j1Var2.f6430o;
            t1.c cVar = j1Var2.f6431p;
            r1.j jVar = j1Var2.f6432q;
            int i13 = j1Var2.f6433r;
            boolean z12 = j1Var2.s;
            boolean z13 = j1Var2.f6434t;
            int i14 = j1Var2.f6435u;
            boolean z14 = j1Var2.f6436v;
            boolean z15 = j1Var2.f6437w;
            int i15 = j1Var2.f6438x;
            int i16 = j1Var2.f6439y;
            long j10 = j1Var2.A;
            long j11 = j1Var2.B;
            long j12 = j1Var2.C;
            r1.l1 l1Var = j1Var2.D;
            r1.j1 j1Var3 = j1Var2.E;
            try {
                if (!d1Var.p()) {
                    j1Var = j1Var3;
                    if (r1Var.f6530a.f11703b >= d1Var.o()) {
                        z10 = false;
                        u1.c.g(z10);
                        j.s = new j1(n0Var, i6, r1Var, t0Var, t0Var2, i10, o0Var, i11, z11, p1Var, d1Var, i12, h0Var2, f3, dVar, cVar, jVar, i13, z12, z13, i14, i15, i16, z14, z15, h0Var, j10, j11, j12, l1Var, j1Var);
                        j.f6303c.a(true, true);
                        j.f6308h.f6475i.p();
                        return;
                    }
                } else {
                    j1Var = j1Var3;
                }
                j.f6308h.f6475i.p();
                return;
            } catch (RemoteException e10) {
                u1.a.h("MediaSessionImpl", "Exception in using media1 API", e10);
                return;
            }
            z10 = true;
            u1.c.g(z10);
            j.s = new j1(n0Var, i6, r1Var, t0Var, t0Var2, i10, o0Var, i11, z11, p1Var, d1Var, i12, h0Var2, f3, dVar, cVar, jVar, i13, z12, z13, i14, i15, i16, z14, z15, h0Var, j10, j11, j12, l1Var, j1Var);
            j.f6303c.a(true, true);
        }
    }

    @Override // r1.s0
    public final void x(boolean z10) {
        r1.j1 j1Var;
        boolean z11;
        b0 j = j();
        if (j != null) {
            j.u();
            if (((l1) this.f6601y.get()) == null) {
                return;
            }
            j1 j1Var2 = j.s;
            r1.n0 n0Var = j1Var2.f6417a;
            int i6 = j1Var2.f6418b;
            r1 r1Var = j1Var2.f6419c;
            r1.t0 t0Var = j1Var2.f6420d;
            r1.t0 t0Var2 = j1Var2.f6421e;
            int i10 = j1Var2.f6422f;
            r1.o0 o0Var = j1Var2.f6423g;
            int i11 = j1Var2.f6424h;
            r1.d1 d1Var = j1Var2.j;
            int i12 = j1Var2.f6426k;
            r1.p1 p1Var = j1Var2.f6427l;
            r1.h0 h0Var = j1Var2.f6428m;
            float f3 = j1Var2.f6429n;
            r1.d dVar = j1Var2.f6430o;
            t1.c cVar = j1Var2.f6431p;
            r1.j jVar = j1Var2.f6432q;
            int i13 = j1Var2.f6433r;
            boolean z12 = j1Var2.s;
            boolean z13 = j1Var2.f6434t;
            int i14 = j1Var2.f6435u;
            boolean z14 = j1Var2.f6436v;
            boolean z15 = j1Var2.f6437w;
            int i15 = j1Var2.f6438x;
            int i16 = j1Var2.f6439y;
            r1.h0 h0Var2 = j1Var2.f6440z;
            long j10 = j1Var2.A;
            long j11 = j1Var2.B;
            long j12 = j1Var2.C;
            r1.l1 l1Var = j1Var2.D;
            r1.j1 j1Var3 = j1Var2.E;
            try {
                if (!d1Var.p()) {
                    j1Var = j1Var3;
                    if (r1Var.f6530a.f11703b >= d1Var.o()) {
                        z11 = false;
                        u1.c.g(z11);
                        j.s = new j1(n0Var, i6, r1Var, t0Var, t0Var2, i10, o0Var, i11, z10, p1Var, d1Var, i12, h0Var, f3, dVar, cVar, jVar, i13, z12, z13, i14, i15, i16, z14, z15, h0Var2, j10, j11, j12, l1Var, j1Var);
                        j.f6303c.a(true, true);
                        j.f6308h.f6475i.n(z10);
                        return;
                    }
                } else {
                    j1Var = j1Var3;
                }
                j.f6308h.f6475i.n(z10);
                return;
            } catch (RemoteException e10) {
                u1.a.h("MediaSessionImpl", "Exception in using media1 API", e10);
                return;
            }
            z11 = true;
            u1.c.g(z11);
            j.s = new j1(n0Var, i6, r1Var, t0Var, t0Var2, i10, o0Var, i11, z10, p1Var, d1Var, i12, h0Var, f3, dVar, cVar, jVar, i13, z12, z13, i14, i15, i16, z14, z15, h0Var2, j10, j11, j12, l1Var, j1Var);
            j.f6303c.a(true, true);
        }
    }

    @Override // r1.s0
    public final void y(t1.c cVar) {
        r1.j1 j1Var;
        boolean z10;
        b0 j = j();
        if (j != null) {
            j.u();
            if (((l1) this.f6601y.get()) == null) {
                return;
            }
            j1 j1Var2 = j.s;
            r1.n0 n0Var = j1Var2.f6417a;
            int i6 = j1Var2.f6418b;
            r1 r1Var = j1Var2.f6419c;
            r1.t0 t0Var = j1Var2.f6420d;
            r1.t0 t0Var2 = j1Var2.f6421e;
            int i10 = j1Var2.f6422f;
            r1.o0 o0Var = j1Var2.f6423g;
            int i11 = j1Var2.f6424h;
            boolean z11 = j1Var2.f6425i;
            r1.d1 d1Var = j1Var2.j;
            int i12 = j1Var2.f6426k;
            r1.p1 p1Var = j1Var2.f6427l;
            r1.h0 h0Var = j1Var2.f6428m;
            float f3 = j1Var2.f6429n;
            r1.d dVar = j1Var2.f6430o;
            r1.j jVar = j1Var2.f6432q;
            int i13 = j1Var2.f6433r;
            boolean z12 = j1Var2.s;
            boolean z13 = j1Var2.f6434t;
            int i14 = j1Var2.f6435u;
            boolean z14 = j1Var2.f6436v;
            boolean z15 = j1Var2.f6437w;
            int i15 = j1Var2.f6438x;
            int i16 = j1Var2.f6439y;
            r1.h0 h0Var2 = j1Var2.f6440z;
            long j10 = j1Var2.A;
            long j11 = j1Var2.B;
            long j12 = j1Var2.C;
            r1.l1 l1Var = j1Var2.D;
            r1.j1 j1Var3 = j1Var2.E;
            if (!d1Var.p()) {
                j1Var = j1Var3;
                if (r1Var.f6530a.f11703b >= d1Var.o()) {
                    z10 = false;
                    u1.c.g(z10);
                    j.s = new j1(n0Var, i6, r1Var, t0Var, t0Var2, i10, o0Var, i11, z11, p1Var, d1Var, i12, h0Var, f3, dVar, cVar, jVar, i13, z12, z13, i14, i15, i16, z14, z15, h0Var2, j10, j11, j12, l1Var, j1Var);
                    j.f6303c.a(true, true);
                }
            } else {
                j1Var = j1Var3;
            }
            z10 = true;
            u1.c.g(z10);
            j.s = new j1(n0Var, i6, r1Var, t0Var, t0Var2, i10, o0Var, i11, z11, p1Var, d1Var, i12, h0Var, f3, dVar, cVar, jVar, i13, z12, z13, i14, i15, i16, z14, z15, h0Var2, j10, j11, j12, l1Var, j1Var);
            j.f6303c.a(true, true);
        }
    }

    @Override // r1.s0
    public final /* synthetic */ void E(r1.j0 j0Var) {
    }

    @Override // r1.s0
    public final /* synthetic */ void G(List list) {
    }

    @Override // r1.s0
    public final /* synthetic */ void O(r1.n0 n0Var) {
    }

    @Override // r1.s0
    public final /* synthetic */ void a(int i6) {
    }

    @Override // r1.s0
    public final /* synthetic */ void d(boolean z10) {
    }

    @Override // r1.s0
    public final /* synthetic */ void f(boolean z10) {
    }

    @Override // r1.s0
    public final /* synthetic */ void g(int i6) {
    }

    @Override // r1.s0
    public final /* synthetic */ void t(r1.r0 r0Var) {
    }

    @Override // r1.s0
    public final /* synthetic */ void H(int i6, boolean z10) {
    }

    @Override // r1.s0
    public final /* synthetic */ void N(int i6, int i10) {
    }
}
