package d2;

import a2.a2;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.e5;
import e2.u;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import o5.e0;
import q2.c0;
import r1.f0;
import r1.z;
import u2.q;
import u5.r;
import w1.a0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g extends q2.a {
    public final boolean E;
    public final w1.g F;
    public final b2.k G;
    public final e0 H;
    public final f2.o I;
    public final e0 J;
    public final c6.h K;
    public final long L;
    public final long M;
    public final b2.k N;
    public final q O;
    public final a2 P;
    public final Object Q;
    public final SparseArray R;
    public final d S;
    public final d T;
    public final r U;
    public final u2.p V;
    public w1.h W;
    public u2.o X;
    public a0 Y;
    public e5 Z;

    /* renamed from: a0, reason: collision with root package name */
    public Handler f3718a0;

    /* renamed from: b0, reason: collision with root package name */
    public z f3719b0;

    /* renamed from: c0, reason: collision with root package name */
    public Uri f3720c0;

    /* renamed from: d0, reason: collision with root package name */
    public final Uri f3721d0;

    /* renamed from: e0, reason: collision with root package name */
    public e2.c f3722e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f3723f0;

    /* renamed from: g0, reason: collision with root package name */
    public long f3724g0;

    /* renamed from: h0, reason: collision with root package name */
    public long f3725h0;

    /* renamed from: i0, reason: collision with root package name */
    public long f3726i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f3727j0;

    /* renamed from: k0, reason: collision with root package name */
    public long f3728k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f3729l0;

    /* renamed from: m0, reason: collision with root package name */
    public r1.e0 f3730m0;

    static {
        f0.a("media3.exoplayer.dash");
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [d2.d] */
    /* JADX WARN: Type inference failed for: r2v12, types: [d2.d] */
    public g(r1.e0 e0Var, w1.g gVar, q qVar, b2.k kVar, e0 e0Var2, f2.o oVar, e0 e0Var3, long j, long j10) {
        this.f3730m0 = e0Var;
        this.f3719b0 = e0Var.f11380c;
        r1.a0 a0Var = e0Var.f11379b;
        a0Var.getClass();
        Uri uri = a0Var.f11283a;
        this.f3720c0 = uri;
        this.f3721d0 = uri;
        this.f3722e0 = null;
        this.F = gVar;
        this.O = qVar;
        this.G = kVar;
        this.I = oVar;
        this.J = e0Var3;
        this.L = j;
        this.M = j10;
        this.H = e0Var2;
        this.K = new c6.h(3);
        this.E = false;
        this.N = b(null);
        this.Q = new Object();
        this.R = new SparseArray();
        this.U = new r(this, 3);
        this.f3728k0 = -9223372036854775807L;
        this.f3726i0 = -9223372036854775807L;
        this.P = new a2(this, 4);
        this.V = new k7.c(this, 5);
        final int i6 = 0;
        this.S = new Runnable(this) { // from class: d2.d

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ g f3707y;

            {
                this.f3707y = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i6) {
                    case 0:
                        this.f3707y.E();
                        return;
                    default:
                        this.f3707y.B(false);
                        return;
                }
            }
        };
        final int i10 = 1;
        this.T = new Runnable(this) { // from class: d2.d

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ g f3707y;

            {
                this.f3707y = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.f3707y.E();
                        return;
                    default:
                        this.f3707y.B(false);
                        return;
                }
            }
        };
    }

    public static boolean w(e2.h hVar) {
        List list = hVar.f4246c;
        for (int i6 = 0; i6 < list.size(); i6++) {
            int i10 = ((e2.a) list.get(i6)).f4205b;
            if (i10 == 1 || i10 == 2) {
                return true;
            }
        }
        return false;
    }

    public final void A(IOException iOException) {
        u1.a.h("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.f3726i0 = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        B(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:186:0x037c, code lost:
    
        if (r15.f4275a == (-9223372036854775807L)) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0172, code lost:
    
        r11 = r19;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:248:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x01d5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(boolean r44) {
        /*
            Method dump skipped, instructions count: 1246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.g.B(boolean):void");
    }

    public final void D(u uVar, q qVar) {
        w1.h hVar = this.W;
        Uri parse = Uri.parse(uVar.f4282c);
        Map map = Collections.EMPTY_MAP;
        u1.c.i(parse, "The uri must be set.");
        this.X.f(new u2.r(hVar, new w1.l(parse, 1, null, map, 0L, -1L, null, 1), 5, qVar), new k7.d(this, 5), 1);
    }

    public final void E() {
        Uri uri;
        this.f3718a0.removeCallbacks(this.S);
        if (this.X.c()) {
            return;
        }
        if (this.X.d()) {
            this.f3723f0 = true;
            return;
        }
        synchronized (this.Q) {
            uri = this.f3720c0;
        }
        this.f3723f0 = false;
        Map map = Collections.EMPTY_MAP;
        u1.c.i(uri, "The uri must be set.");
        u2.r rVar = new u2.r(this.W, new w1.l(uri, 1, null, map, 0L, -1L, null, 1), 4, this.O);
        a2 a2Var = this.P;
        this.J.getClass();
        this.X.f(rVar, a2Var, 3);
    }

    @Override // q2.a
    public final boolean a(r1.e0 e0Var) {
        r1.e0 i6 = i();
        r1.a0 a0Var = i6.f11379b;
        a0Var.getClass();
        r1.a0 a0Var2 = e0Var.f11379b;
        if (a0Var2 != null && a0Var2.f11283a.equals(a0Var.f11283a) && a0Var2.f11287e.equals(a0Var.f11287e) && Objects.equals(a0Var2.f11285c, a0Var.f11285c) && i6.f11380c.equals(e0Var.f11380c)) {
            return true;
        }
        return false;
    }

    @Override // q2.a
    public final q2.a0 c(c0 c0Var, u2.e eVar, long j) {
        int intValue = ((Integer) c0Var.f10834a).intValue() - this.f3729l0;
        b2.k b10 = b(c0Var);
        f2.l lVar = new f2.l(this.A.f4677c, 0, c0Var);
        int i6 = this.f3729l0 + intValue;
        e2.c cVar = this.f3722e0;
        a0 a0Var = this.Y;
        long j10 = this.f3726i0;
        b2.m mVar = this.D;
        u1.c.h(mVar);
        c cVar2 = new c(i6, cVar, this.K, intValue, this.G, a0Var, this.I, lVar, this.J, b10, j10, this.V, eVar, this.H, this.U, mVar);
        this.R.put(i6, cVar2);
        return cVar2;
    }

    @Override // q2.a
    public final synchronized r1.e0 i() {
        return this.f3730m0;
    }

    @Override // q2.a
    public final void l() {
        this.V.b();
    }

    @Override // q2.a
    public final void n(a0 a0Var) {
        this.Y = a0Var;
        Looper myLooper = Looper.myLooper();
        b2.m mVar = this.D;
        u1.c.h(mVar);
        f2.o oVar = this.I;
        oVar.n(myLooper, mVar);
        oVar.c();
        if (this.E) {
            B(false);
            return;
        }
        this.W = this.F.c();
        this.X = new u2.o("DashMediaSource");
        this.f3718a0 = u1.a0.n(null);
        E();
    }

    @Override // q2.a
    public final void q(q2.a0 a0Var) {
        c cVar = (c) a0Var;
        p pVar = cVar.J;
        pVar.F = true;
        pVar.A.removeCallbacksAndMessages(null);
        for (r2.h hVar : cVar.O) {
            hVar.A(cVar);
        }
        cVar.N = null;
        this.R.remove(cVar.f3703x);
    }

    @Override // q2.a
    public final void s() {
        this.f3723f0 = false;
        this.W = null;
        u2.o oVar = this.X;
        if (oVar != null) {
            oVar.e(null);
            this.X = null;
        }
        this.f3724g0 = 0L;
        this.f3725h0 = 0L;
        this.f3720c0 = this.f3721d0;
        this.Z = null;
        Handler handler = this.f3718a0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f3718a0 = null;
        }
        this.f3726i0 = -9223372036854775807L;
        this.f3727j0 = 0;
        this.f3728k0 = -9223372036854775807L;
        this.R.clear();
        c6.h hVar = this.K;
        ((HashMap) hVar.f1981x).clear();
        ((HashMap) hVar.f1982y).clear();
        ((HashMap) hVar.f1983z).clear();
        this.I.a();
    }

    @Override // q2.a
    public final synchronized void v(r1.e0 e0Var) {
        this.f3730m0 = e0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, u2.l] */
    public final void x() {
        boolean z10;
        u2.o oVar;
        u2.o oVar2 = this.X;
        lc.c cVar = new lc.c(this);
        synchronized (v2.b.f13258b) {
            z10 = v2.b.f13259c;
            oVar = oVar2;
        }
        if (z10) {
            cVar.J();
            return;
        }
        if (oVar2 == null) {
            oVar = new u2.o("SntpClient");
        }
        oVar.f(new Object(), new a2(cVar, 26), 1);
    }

    public final void y(u2.r rVar, long j) {
        long j10 = rVar.f12871x;
        Uri uri = rVar.A.f13560z;
        q2.u uVar = new q2.u(j);
        this.J.getClass();
        this.N.n(uVar, rVar.f12873z, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
