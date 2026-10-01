package a2;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import com.google.android.gms.internal.measurement.p4;
import com.playfy.tv.activities.PlayerActivity;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n0 extends e3.e implements ExoPlayer {
    public final r1.q0 A;
    public t1.c A0;
    public final u1.f B;
    public final boolean B0;
    public final Context C;
    public boolean C0;
    public final n0 D;
    public final int D0;
    public final g[] E;
    public boolean E0;
    public final g[] F;
    public final r1.j F0;
    public final t2.v G;
    public r1.p1 G0;
    public final u1.x H;
    public r1.h0 H0;
    public final b0 I;
    public s1 I0;
    public final w0 J;
    public int J0;
    public final u1.o K;
    public long K0;
    public final CopyOnWriteArraySet L;
    public final r1.a1 M;
    public final ArrayList N;
    public final boolean O;
    public final q2.b0 P;
    public final b2.f Q;
    public final Looper R;
    public final u2.d S;
    public final long T;
    public final long U;
    public final long V;
    public final k0 W;
    public final l0 X;
    public final c Y;
    public final e2 Z;

    /* renamed from: a0, reason: collision with root package name */
    public final e2 f326a0;

    /* renamed from: b0, reason: collision with root package name */
    public final long f327b0;

    /* renamed from: c0, reason: collision with root package name */
    public final o4.j f328c0;

    /* renamed from: d0, reason: collision with root package name */
    public int f329d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f330e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f331f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f332g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f333h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f334i0;

    /* renamed from: j0, reason: collision with root package name */
    public db.p0 f335j0;

    /* renamed from: k0, reason: collision with root package name */
    public final b2 f336k0;

    /* renamed from: l0, reason: collision with root package name */
    public q2.c1 f337l0;

    /* renamed from: m0, reason: collision with root package name */
    public r1.q0 f338m0;

    /* renamed from: n0, reason: collision with root package name */
    public r1.h0 f339n0;
    public r1.h0 o0;

    /* renamed from: p0, reason: collision with root package name */
    public Object f340p0;

    /* renamed from: q0, reason: collision with root package name */
    public Surface f341q0;

    /* renamed from: r0, reason: collision with root package name */
    public SurfaceHolder f342r0;

    /* renamed from: s0, reason: collision with root package name */
    public x2.k f343s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f344t0;

    /* renamed from: u0, reason: collision with root package name */
    public TextureView f345u0;

    /* renamed from: v0, reason: collision with root package name */
    public final int f346v0;

    /* renamed from: w0, reason: collision with root package name */
    public u1.u f347w0;

    /* renamed from: x0, reason: collision with root package name */
    public r1.d f348x0;

    /* renamed from: y0, reason: collision with root package name */
    public float f349y0;

    /* renamed from: z, reason: collision with root package name */
    public final t2.w f350z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f351z0;

    static {
        r1.f0.a("media3.exoplayer");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, a2.l0] */
    public n0(u uVar) {
        super(5);
        n0 n0Var;
        u1.v vVar;
        boolean z10;
        Looper looper;
        u1.x xVar;
        Looper looper2;
        n0 n0Var2;
        int i6;
        PlayerActivity playerActivity = uVar.f419a;
        this.B = new u1.f();
        try {
            u1.a.k("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + u1.a0.f12750a + "]");
            vVar = uVar.f420b;
            this.C = playerActivity.getApplicationContext();
            this.Q = new b2.f(vVar);
            this.D0 = uVar.f426h;
            this.f348x0 = uVar.f427i;
            this.f346v0 = uVar.j;
            this.f351z0 = false;
            this.f327b0 = uVar.s;
            k0 k0Var = new k0(this);
            this.W = k0Var;
            this.X = new Object();
            g[] a10 = ((n) uVar.f421c.get()).a(new Handler(uVar.f425g), k0Var, k0Var, k0Var, k0Var);
            this.E = a10;
            if (a10.length > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            u1.c.g(z10);
            this.F = new g[a10.length];
            int i10 = 0;
            while (true) {
                g[] gVarArr = this.F;
                if (i10 >= gVarArr.length) {
                    break;
                }
                int i11 = this.E[i10].f245y;
                gVarArr[i10] = null;
                i10++;
            }
            t2.v vVar2 = (t2.v) uVar.f423e.get();
            this.G = vVar2;
            this.P = (q2.b0) uVar.f422d.get();
            u2.d dVar = (u2.d) uVar.f424f.get();
            this.S = dVar;
            this.O = uVar.f428k;
            c2 c2Var = uVar.f429l;
            this.T = uVar.f431n;
            this.U = uVar.f432o;
            this.V = uVar.f433p;
            this.f336k0 = uVar.f430m;
            looper = uVar.f425g;
            this.R = looper;
            this.D = this;
            this.K = new u1.o(looper, vVar, new t(this));
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.L = copyOnWriteArraySet;
            this.N = new ArrayList();
            this.f337l0 = new q2.c1();
            g[] gVarArr2 = this.E;
            t2.w wVar = new t2.w(new y1[gVarArr2.length], new t2.s[gVarArr2.length], r1.l1.f11580b, null);
            this.f350z = wVar;
            this.M = new r1.a1();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            int length = iArr.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = iArr[i12];
                u1.c.g(!false);
                sparseBooleanArray.append(i13, true);
                i12++;
                dVar = dVar;
            }
            u2.d dVar2 = dVar;
            vVar2.getClass();
            u1.c.g(!false);
            sparseBooleanArray.append(29, true);
            u1.c.g(!false);
            r1.o oVar = new r1.o(sparseBooleanArray);
            this.A = new r1.q0(oVar);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i14 = 0; i14 < oVar.f11592a.size(); i14++) {
                int b10 = oVar.b(i14);
                u1.c.g(!false);
                sparseBooleanArray2.append(b10, true);
            }
            u1.c.g(!false);
            sparseBooleanArray2.append(4, true);
            u1.c.g(!false);
            sparseBooleanArray2.append(10, true);
            u1.c.g(!false);
            this.f338m0 = new r1.q0(new r1.o(sparseBooleanArray2));
            this.H = vVar.a(looper, null);
            b0 b0Var = new b0(this, 0);
            this.I = b0Var;
            this.I0 = s1.k(wVar);
            this.Q.X(this, looper);
            b2.m mVar = new b2.m(uVar.f438v);
            w0 w0Var = new w0(this.C, this.E, this.F, vVar2, wVar, new l(), dVar2, this.f329d0, this.f330e0, this.Q, c2Var, uVar.f434q, uVar.f435r, looper, vVar, b0Var, mVar, this.X);
            xVar = w0Var.E;
            this.J = w0Var;
            looper2 = w0Var.G;
            this.f349y0 = 1.0f;
            this.f329d0 = 0;
            r1.h0 h0Var = r1.h0.K;
            this.f339n0 = h0Var;
            this.o0 = h0Var;
            this.H0 = h0Var;
            this.J0 = -1;
            this.A0 = t1.c.f12476d;
            this.B0 = true;
            U(this.Q);
            Handler handler = new Handler(looper);
            b2.f fVar = this.Q;
            u2.g gVar = (u2.g) dVar2;
            gVar.getClass();
            fVar.getClass();
            k7.c cVar = gVar.f12848c;
            cVar.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) cVar.f7745y;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                u2.c cVar2 = (u2.c) it.next();
                if (cVar2.f12831b == fVar) {
                    cVar2.f12832c = true;
                    copyOnWriteArrayList.remove(cVar2);
                }
            }
            copyOnWriteArrayList.add(new u2.c(handler, fVar));
            copyOnWriteArraySet.add(this.W);
            if (Build.VERSION.SDK_INT >= 31) {
                try {
                    i6 = 1;
                    n0Var2 = this;
                    try {
                        vVar.a(w0Var.G, null).c(new h0(0, this.C, this, mVar, uVar.f436t));
                    } catch (Throwable th) {
                        th = th;
                        n0Var = n0Var2;
                        n0Var.B.e();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    n0Var2 = this;
                    n0Var = n0Var2;
                    n0Var.B.e();
                    throw th;
                }
            } else {
                n0Var2 = this;
                i6 = 1;
            }
            n0Var = n0Var2;
        } catch (Throwable th3) {
            th = th3;
            n0Var = this;
        }
        try {
            o4.j jVar = new o4.j(0, looper2, looper, vVar, new b0(n0Var2, i6));
            n0Var.f328c0 = jVar;
            jVar.t(new a(n0Var, 2));
            c cVar3 = new c(playerActivity, looper2, uVar.f425g, n0Var.W, vVar);
            n0Var.Y = cVar3;
            cVar3.k();
            n0Var.Z = new e2(playerActivity, looper2, vVar, 0);
            n0Var.f326a0 = new e2(playerActivity, looper2, vVar, i6);
            n0Var.F0 = r1.j.f11518c;
            n0Var.G0 = r1.p1.f11626d;
            n0Var.f347w0 = u1.u.f12814c;
            xVar.a(38, n0Var.f336k0).b();
            r1.d dVar3 = n0Var.f348x0;
            u1.w b11 = u1.x.b();
            b11.f12818a = xVar.f12820a.obtainMessage(31, 0, 0, dVar3);
            b11.b();
            n0Var.w1(i6, 3, n0Var.f348x0);
            n0Var.w1(2, 4, Integer.valueOf(n0Var.f346v0));
            n0Var.w1(2, 5, 0);
            n0Var.w1(i6, 9, Boolean.valueOf(n0Var.f351z0));
            n0Var.w1(6, 8, n0Var.X);
            n0Var.w1(-1, 16, Integer.valueOf(n0Var.D0));
            n0Var.B.e();
        } catch (Throwable th4) {
            th = th4;
            n0Var.B.e();
            throw th;
        }
    }

    public static long o1(s1 s1Var) {
        r1.c1 c1Var = new r1.c1();
        r1.a1 a1Var = new r1.a1();
        s1Var.f394a.g(s1Var.f395b.f10834a, a1Var);
        long j = s1Var.f396c;
        if (j == -9223372036854775807L) {
            return s1Var.f394a.m(a1Var.f11297c, c1Var, 0L).f11337l;
        }
        return a1Var.f11299e + j;
    }

    public static s1 p1(s1 s1Var, int i6) {
        s1 h4 = s1Var.h(i6);
        if (i6 != 1 && i6 != 4) {
            return h4;
        }
        return h4.b(false);
    }

    @Override // e3.e, r1.u0
    public final void A0(r1.j1 j1Var) {
        r1.j1 j1Var2;
        F1();
        t2.v vVar = this.G;
        vVar.getClass();
        r1.j1 H0 = H0();
        if (this.f334i0) {
            this.f335j0 = j1Var.E;
            db.p0 p0Var = this.f336k0.f169a;
            r1.i1 a10 = j1Var.a();
            db.q1 it = p0Var.iterator();
            while (it.hasNext()) {
                a10.l(((Integer) it.next()).intValue(), true);
            }
            j1Var2 = a10.b();
        } else {
            j1Var2 = j1Var;
        }
        if (!j1Var2.equals(((t2.q) vVar).e())) {
            vVar.b(j1Var2);
        }
        if (!H0.equals(j1Var)) {
            this.K.e(19, new e0(j1Var, 0));
        }
    }

    public final void A1(q qVar) {
        s1 s1Var = this.I0;
        s1 c10 = s1Var.c(s1Var.f395b);
        c10.f409q = c10.s;
        c10.f410r = 0L;
        s1 p12 = p1(c10, 1);
        if (qVar != null) {
            p12 = p12.f(qVar);
        }
        s1 s1Var2 = p12;
        this.f331f0++;
        u1.x xVar = this.J.E;
        xVar.getClass();
        u1.w b10 = u1.x.b();
        b10.f12818a = xVar.f12820a.obtainMessage(6);
        b10.b();
        D1(s1Var2, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // e3.e, r1.u0
    public final Looper B0() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [r1.p0, java.lang.Object] */
    public final void B1() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        r1.q0 q0Var = this.f338m0;
        String str = u1.a0.f12750a;
        n0 n0Var = this.D;
        boolean h4 = n0Var.h();
        boolean b02 = n0Var.b0();
        boolean X0 = n0Var.X0();
        boolean W0 = n0Var.W0();
        boolean S0 = n0Var.S0();
        boolean u02 = n0Var.u0();
        boolean p10 = n0Var.y0().p();
        ?? obj = new Object();
        obj.f11625a = new p4();
        p4 p4Var = (p4) obj.f11625a;
        p4Var.b(this.A.f11684a);
        boolean z16 = !h4;
        obj.a(4, z16);
        boolean z17 = false;
        if (b02 && !h4) {
            z10 = true;
        } else {
            z10 = false;
        }
        obj.a(5, z10);
        if (X0 && !h4) {
            z11 = true;
        } else {
            z11 = false;
        }
        obj.a(6, z11);
        if (!p10 && ((X0 || !S0 || b02) && !h4)) {
            z12 = true;
        } else {
            z12 = false;
        }
        obj.a(7, z12);
        if (W0 && !h4) {
            z13 = true;
        } else {
            z13 = false;
        }
        obj.a(8, z13);
        if (!p10 && ((W0 || (S0 && u02)) && !h4)) {
            z14 = true;
        } else {
            z14 = false;
        }
        obj.a(9, z14);
        obj.a(10, z16);
        if (b02 && !h4) {
            z15 = true;
        } else {
            z15 = false;
        }
        obj.a(11, z15);
        if (b02 && !h4) {
            z17 = true;
        }
        obj.a(12, z17);
        r1.q0 q0Var2 = new r1.q0(p4Var.c());
        this.f338m0 = q0Var2;
        if (!q0Var2.equals(q0Var)) {
            this.K.c(13, new b0(this, 2));
        }
    }

    @Override // e3.e, r1.u0
    public final r1.d C() {
        F1();
        return this.f348x0;
    }

    @Override // e3.e, r1.u0
    public final void C0(r1.d dVar, boolean z10) {
        F1();
        if (this.E0) {
            return;
        }
        boolean equals = Objects.equals(this.f348x0, dVar);
        u1.o oVar = this.K;
        if (!equals) {
            this.f348x0 = dVar;
            w1(1, 3, dVar);
            oVar.c(20, new e0(dVar, 1));
        }
        r1.d dVar2 = this.f348x0;
        u1.x xVar = this.J.E;
        xVar.getClass();
        u1.w b10 = u1.x.b();
        b10.f12818a = xVar.f12820a.obtainMessage(31, z10 ? 1 : 0, 0, dVar2);
        b10.b();
        oVar.b();
    }

    public final void C1(int i6, boolean z10) {
        int i10;
        if (this.f334i0) {
            i10 = 4;
        } else if (this.I0.f406n == 1 && !z10) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        s1 s1Var = this.I0;
        if (s1Var.f404l == z10 && s1Var.f406n == i10 && s1Var.f405m == i6) {
            return;
        }
        this.f331f0++;
        if (s1Var.f408p) {
            s1Var = s1Var.a();
        }
        s1 e10 = s1Var.e(z10, i6, i10);
        int i11 = i6 | (i10 << 4);
        u1.x xVar = this.J.E;
        xVar.getClass();
        u1.w b10 = u1.x.b();
        b10.f12818a = xVar.f12820a.obtainMessage(1, z10 ? 1 : 0, i11);
        b10.b();
        D1(e10, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void D1(final s1 s1Var, int i6, boolean z10, int i10, long j, int i11, boolean z11) {
        Pair pair;
        int i12;
        r1.e0 e0Var;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i13;
        Object obj;
        r1.e0 e0Var2;
        Object obj2;
        int i14;
        long j10;
        long j11;
        long j12;
        long o12;
        Object obj3;
        r1.e0 e0Var3;
        Object obj4;
        int i15;
        long j13;
        s1 s1Var2 = this.I0;
        this.I0 = s1Var;
        boolean equals = s1Var2.f394a.equals(s1Var.f394a);
        r1.c1 c1Var = (r1.c1) this.f4301y;
        r1.a1 a1Var = this.M;
        r1.d1 d1Var = s1Var2.f394a;
        q2.c0 c0Var = s1Var2.f395b;
        r1.d1 d1Var2 = s1Var.f394a;
        q2.c0 c0Var2 = s1Var.f395b;
        if (d1Var2.p() && d1Var.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (d1Var2.p() != d1Var.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (!d1Var.m(d1Var.g(c0Var.f10834a, a1Var).f11297c, c1Var, 0L).f11327a.equals(d1Var2.m(d1Var2.g(c0Var2.f10834a, a1Var).f11297c, c1Var, 0L).f11327a)) {
            if (z10 && i10 == 0) {
                i12 = 1;
            } else if (z10 && i10 == 1) {
                i12 = 2;
            } else if (!equals) {
                i12 = 3;
            } else {
                throw new IllegalStateException();
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i12));
        } else if (z10 && i10 == 0 && c0Var.f10837d < c0Var2.f10837d) {
            pair = new Pair(Boolean.TRUE, 0);
        } else if (z10 && i10 == 1 && z11) {
            pair = new Pair(Boolean.TRUE, 2);
        } else {
            pair = new Pair(Boolean.FALSE, -1);
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        int intValue = ((Integer) pair.second).intValue();
        if (booleanValue) {
            if (!s1Var.f394a.p()) {
                e0Var = s1Var.f394a.m(s1Var.f394a.g(s1Var.f395b.f10834a, this.M).f11297c, (r1.c1) this.f4301y, 0L).f11329c;
            } else {
                e0Var = null;
            }
            this.H0 = r1.h0.K;
        } else {
            e0Var = null;
        }
        if (booleanValue || !s1Var2.j.equals(s1Var.j)) {
            r1.g0 a10 = this.H0.a();
            List list = s1Var.j;
            for (int i16 = 0; i16 < list.size(); i16++) {
                r1.j0 j0Var = (r1.j0) list.get(i16);
                int i17 = 0;
                while (true) {
                    r1.i0[] i0VarArr = j0Var.f11523a;
                    if (i17 < i0VarArr.length) {
                        i0VarArr[i17].b(a10);
                        i17++;
                    }
                }
            }
            this.H0 = new r1.h0(a10);
        }
        r1.h0 g12 = g1();
        boolean equals2 = g12.equals(this.f339n0);
        this.f339n0 = g12;
        if (s1Var2.f404l != s1Var.f404l) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (s1Var2.f398e != s1Var.f398e) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13 || z12) {
            E1();
        }
        if (s1Var2.f400g != s1Var.f400g) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (!equals) {
            this.K.c(0, new w(i6, 0, s1Var));
        }
        if (z10) {
            r1.a1 a1Var2 = new r1.a1();
            if (!s1Var2.f394a.p()) {
                Object obj5 = s1Var2.f395b.f10834a;
                s1Var2.f394a.g(obj5, a1Var2);
                int i18 = a1Var2.f11297c;
                int b10 = s1Var2.f394a.b(obj5);
                z15 = booleanValue;
                z16 = equals2;
                z17 = z13;
                obj = s1Var2.f394a.m(i18, (r1.c1) this.f4301y, 0L).f11327a;
                e0Var2 = ((r1.c1) this.f4301y).f11329c;
                obj2 = obj5;
                i13 = i18;
                i14 = b10;
            } else {
                z15 = booleanValue;
                z16 = equals2;
                z17 = z13;
                i13 = i11;
                obj = null;
                e0Var2 = null;
                obj2 = null;
                i14 = -1;
            }
            if (i10 == 0) {
                if (s1Var2.f395b.b()) {
                    q2.c0 c0Var3 = s1Var2.f395b;
                    j12 = a1Var2.a(c0Var3.f10835b, c0Var3.f10836c);
                    o12 = o1(s1Var2);
                } else if (s1Var2.f395b.f10838e != -1) {
                    j12 = o1(this.I0);
                    o12 = j12;
                } else {
                    j10 = a1Var2.f11299e;
                    j11 = a1Var2.f11298d;
                    j12 = j10 + j11;
                    o12 = j12;
                }
            } else if (s1Var2.f395b.b()) {
                j12 = s1Var2.s;
                o12 = o1(s1Var2);
            } else {
                j10 = a1Var2.f11299e;
                j11 = s1Var2.s;
                j12 = j10 + j11;
                o12 = j12;
            }
            long e02 = u1.a0.e0(j12);
            long e03 = u1.a0.e0(o12);
            q2.c0 c0Var4 = s1Var2.f395b;
            r1.t0 t0Var = new r1.t0(obj, i13, e0Var2, obj2, i14, e02, e03, c0Var4.f10835b, c0Var4.f10836c);
            r1.c1 c1Var2 = (r1.c1) this.f4301y;
            int m02 = m0();
            if (!this.I0.f394a.p()) {
                s1 s1Var3 = this.I0;
                Object obj6 = s1Var3.f395b.f10834a;
                s1Var3.f394a.g(obj6, this.M);
                int b11 = this.I0.f394a.b(obj6);
                Object obj7 = this.I0.f394a.m(m02, c1Var2, 0L).f11327a;
                e0Var3 = c1Var2.f11329c;
                i15 = b11;
                obj4 = obj6;
                obj3 = obj7;
            } else {
                obj3 = null;
                e0Var3 = null;
                obj4 = null;
                i15 = -1;
            }
            long e04 = u1.a0.e0(j);
            if (this.I0.f395b.b()) {
                j13 = u1.a0.e0(o1(this.I0));
            } else {
                j13 = e04;
            }
            q2.c0 c0Var5 = this.I0.f395b;
            this.K.c(11, new g0(i10, t0Var, new r1.t0(obj3, m02, e0Var3, obj4, i15, e04, j13, c0Var5.f10835b, c0Var5.f10836c)));
        } else {
            z15 = booleanValue;
            z16 = equals2;
            z17 = z13;
        }
        if (z15) {
            this.K.c(1, new w(intValue, 1, e0Var));
        }
        if (s1Var2.f399f != s1Var.f399f) {
            final int i19 = 7;
            this.K.c(10, new u1.l() { // from class: a2.y
                @Override // u1.l
                public final void invoke(Object obj8) {
                    r1.s0 s0Var = (r1.s0) obj8;
                    switch (i19) {
                        case 0:
                            s1 s1Var4 = s1Var;
                            s0Var.f(s1Var4.f400g);
                            s0Var.m(s1Var4.f400g);
                            return;
                        case 1:
                            s1 s1Var5 = s1Var;
                            s0Var.H(s1Var5.f398e, s1Var5.f404l);
                            return;
                        case 2:
                            s0Var.r(s1Var.f398e);
                            return;
                        case 3:
                            s1 s1Var6 = s1Var;
                            s0Var.o(s1Var6.f405m, s1Var6.f404l);
                            return;
                        case 4:
                            s0Var.e(s1Var.f406n);
                            return;
                        case 5:
                            s0Var.Q(s1Var.m());
                            return;
                        case 6:
                            s0Var.J(s1Var.f407o);
                            return;
                        case 7:
                            s0Var.O(s1Var.f399f);
                            return;
                        case 8:
                            s0Var.D(s1Var.f399f);
                            return;
                        default:
                            s0Var.i(s1Var.f402i.f12565d);
                            return;
                    }
                }
            });
            if (s1Var.f399f != null) {
                final int i20 = 8;
                this.K.c(10, new u1.l() { // from class: a2.y
                    @Override // u1.l
                    public final void invoke(Object obj8) {
                        r1.s0 s0Var = (r1.s0) obj8;
                        switch (i20) {
                            case 0:
                                s1 s1Var4 = s1Var;
                                s0Var.f(s1Var4.f400g);
                                s0Var.m(s1Var4.f400g);
                                return;
                            case 1:
                                s1 s1Var5 = s1Var;
                                s0Var.H(s1Var5.f398e, s1Var5.f404l);
                                return;
                            case 2:
                                s0Var.r(s1Var.f398e);
                                return;
                            case 3:
                                s1 s1Var6 = s1Var;
                                s0Var.o(s1Var6.f405m, s1Var6.f404l);
                                return;
                            case 4:
                                s0Var.e(s1Var.f406n);
                                return;
                            case 5:
                                s0Var.Q(s1Var.m());
                                return;
                            case 6:
                                s0Var.J(s1Var.f407o);
                                return;
                            case 7:
                                s0Var.O(s1Var.f399f);
                                return;
                            case 8:
                                s0Var.D(s1Var.f399f);
                                return;
                            default:
                                s0Var.i(s1Var.f402i.f12565d);
                                return;
                        }
                    }
                });
            }
        }
        t2.w wVar = s1Var2.f402i;
        t2.w wVar2 = s1Var.f402i;
        if (wVar != wVar2) {
            t2.v vVar = this.G;
            Object obj8 = wVar2.f12566e;
            vVar.getClass();
            final int i21 = 9;
            this.K.c(2, new u1.l() { // from class: a2.y
                @Override // u1.l
                public final void invoke(Object obj82) {
                    r1.s0 s0Var = (r1.s0) obj82;
                    switch (i21) {
                        case 0:
                            s1 s1Var4 = s1Var;
                            s0Var.f(s1Var4.f400g);
                            s0Var.m(s1Var4.f400g);
                            return;
                        case 1:
                            s1 s1Var5 = s1Var;
                            s0Var.H(s1Var5.f398e, s1Var5.f404l);
                            return;
                        case 2:
                            s0Var.r(s1Var.f398e);
                            return;
                        case 3:
                            s1 s1Var6 = s1Var;
                            s0Var.o(s1Var6.f405m, s1Var6.f404l);
                            return;
                        case 4:
                            s0Var.e(s1Var.f406n);
                            return;
                        case 5:
                            s0Var.Q(s1Var.m());
                            return;
                        case 6:
                            s0Var.J(s1Var.f407o);
                            return;
                        case 7:
                            s0Var.O(s1Var.f399f);
                            return;
                        case 8:
                            s0Var.D(s1Var.f399f);
                            return;
                        default:
                            s0Var.i(s1Var.f402i.f12565d);
                            return;
                    }
                }
            });
        }
        if (!z16) {
            this.K.c(14, new x(this.f339n0));
        }
        if (z14) {
            final int i22 = 0;
            this.K.c(3, new u1.l() { // from class: a2.y
                @Override // u1.l
                public final void invoke(Object obj82) {
                    r1.s0 s0Var = (r1.s0) obj82;
                    switch (i22) {
                        case 0:
                            s1 s1Var4 = s1Var;
                            s0Var.f(s1Var4.f400g);
                            s0Var.m(s1Var4.f400g);
                            return;
                        case 1:
                            s1 s1Var5 = s1Var;
                            s0Var.H(s1Var5.f398e, s1Var5.f404l);
                            return;
                        case 2:
                            s0Var.r(s1Var.f398e);
                            return;
                        case 3:
                            s1 s1Var6 = s1Var;
                            s0Var.o(s1Var6.f405m, s1Var6.f404l);
                            return;
                        case 4:
                            s0Var.e(s1Var.f406n);
                            return;
                        case 5:
                            s0Var.Q(s1Var.m());
                            return;
                        case 6:
                            s0Var.J(s1Var.f407o);
                            return;
                        case 7:
                            s0Var.O(s1Var.f399f);
                            return;
                        case 8:
                            s0Var.D(s1Var.f399f);
                            return;
                        default:
                            s0Var.i(s1Var.f402i.f12565d);
                            return;
                    }
                }
            });
        }
        if (z17 || z12) {
            final int i23 = 1;
            this.K.c(-1, new u1.l() { // from class: a2.y
                @Override // u1.l
                public final void invoke(Object obj82) {
                    r1.s0 s0Var = (r1.s0) obj82;
                    switch (i23) {
                        case 0:
                            s1 s1Var4 = s1Var;
                            s0Var.f(s1Var4.f400g);
                            s0Var.m(s1Var4.f400g);
                            return;
                        case 1:
                            s1 s1Var5 = s1Var;
                            s0Var.H(s1Var5.f398e, s1Var5.f404l);
                            return;
                        case 2:
                            s0Var.r(s1Var.f398e);
                            return;
                        case 3:
                            s1 s1Var6 = s1Var;
                            s0Var.o(s1Var6.f405m, s1Var6.f404l);
                            return;
                        case 4:
                            s0Var.e(s1Var.f406n);
                            return;
                        case 5:
                            s0Var.Q(s1Var.m());
                            return;
                        case 6:
                            s0Var.J(s1Var.f407o);
                            return;
                        case 7:
                            s0Var.O(s1Var.f399f);
                            return;
                        case 8:
                            s0Var.D(s1Var.f399f);
                            return;
                        default:
                            s0Var.i(s1Var.f402i.f12565d);
                            return;
                    }
                }
            });
        }
        if (z17) {
            final int i24 = 2;
            this.K.c(4, new u1.l() { // from class: a2.y
                @Override // u1.l
                public final void invoke(Object obj82) {
                    r1.s0 s0Var = (r1.s0) obj82;
                    switch (i24) {
                        case 0:
                            s1 s1Var4 = s1Var;
                            s0Var.f(s1Var4.f400g);
                            s0Var.m(s1Var4.f400g);
                            return;
                        case 1:
                            s1 s1Var5 = s1Var;
                            s0Var.H(s1Var5.f398e, s1Var5.f404l);
                            return;
                        case 2:
                            s0Var.r(s1Var.f398e);
                            return;
                        case 3:
                            s1 s1Var6 = s1Var;
                            s0Var.o(s1Var6.f405m, s1Var6.f404l);
                            return;
                        case 4:
                            s0Var.e(s1Var.f406n);
                            return;
                        case 5:
                            s0Var.Q(s1Var.m());
                            return;
                        case 6:
                            s0Var.J(s1Var.f407o);
                            return;
                        case 7:
                            s0Var.O(s1Var.f399f);
                            return;
                        case 8:
                            s0Var.D(s1Var.f399f);
                            return;
                        default:
                            s0Var.i(s1Var.f402i.f12565d);
                            return;
                    }
                }
            });
        }
        if (z12 || s1Var2.f405m != s1Var.f405m) {
            final int i25 = 3;
            this.K.c(5, new u1.l() { // from class: a2.y
                @Override // u1.l
                public final void invoke(Object obj82) {
                    r1.s0 s0Var = (r1.s0) obj82;
                    switch (i25) {
                        case 0:
                            s1 s1Var4 = s1Var;
                            s0Var.f(s1Var4.f400g);
                            s0Var.m(s1Var4.f400g);
                            return;
                        case 1:
                            s1 s1Var5 = s1Var;
                            s0Var.H(s1Var5.f398e, s1Var5.f404l);
                            return;
                        case 2:
                            s0Var.r(s1Var.f398e);
                            return;
                        case 3:
                            s1 s1Var6 = s1Var;
                            s0Var.o(s1Var6.f405m, s1Var6.f404l);
                            return;
                        case 4:
                            s0Var.e(s1Var.f406n);
                            return;
                        case 5:
                            s0Var.Q(s1Var.m());
                            return;
                        case 6:
                            s0Var.J(s1Var.f407o);
                            return;
                        case 7:
                            s0Var.O(s1Var.f399f);
                            return;
                        case 8:
                            s0Var.D(s1Var.f399f);
                            return;
                        default:
                            s0Var.i(s1Var.f402i.f12565d);
                            return;
                    }
                }
            });
        }
        if (s1Var2.f406n != s1Var.f406n) {
            final int i26 = 4;
            this.K.c(6, new u1.l() { // from class: a2.y
                @Override // u1.l
                public final void invoke(Object obj82) {
                    r1.s0 s0Var = (r1.s0) obj82;
                    switch (i26) {
                        case 0:
                            s1 s1Var4 = s1Var;
                            s0Var.f(s1Var4.f400g);
                            s0Var.m(s1Var4.f400g);
                            return;
                        case 1:
                            s1 s1Var5 = s1Var;
                            s0Var.H(s1Var5.f398e, s1Var5.f404l);
                            return;
                        case 2:
                            s0Var.r(s1Var.f398e);
                            return;
                        case 3:
                            s1 s1Var6 = s1Var;
                            s0Var.o(s1Var6.f405m, s1Var6.f404l);
                            return;
                        case 4:
                            s0Var.e(s1Var.f406n);
                            return;
                        case 5:
                            s0Var.Q(s1Var.m());
                            return;
                        case 6:
                            s0Var.J(s1Var.f407o);
                            return;
                        case 7:
                            s0Var.O(s1Var.f399f);
                            return;
                        case 8:
                            s0Var.D(s1Var.f399f);
                            return;
                        default:
                            s0Var.i(s1Var.f402i.f12565d);
                            return;
                    }
                }
            });
        }
        if (s1Var2.m() != s1Var.m()) {
            final int i27 = 5;
            this.K.c(7, new u1.l() { // from class: a2.y
                @Override // u1.l
                public final void invoke(Object obj82) {
                    r1.s0 s0Var = (r1.s0) obj82;
                    switch (i27) {
                        case 0:
                            s1 s1Var4 = s1Var;
                            s0Var.f(s1Var4.f400g);
                            s0Var.m(s1Var4.f400g);
                            return;
                        case 1:
                            s1 s1Var5 = s1Var;
                            s0Var.H(s1Var5.f398e, s1Var5.f404l);
                            return;
                        case 2:
                            s0Var.r(s1Var.f398e);
                            return;
                        case 3:
                            s1 s1Var6 = s1Var;
                            s0Var.o(s1Var6.f405m, s1Var6.f404l);
                            return;
                        case 4:
                            s0Var.e(s1Var.f406n);
                            return;
                        case 5:
                            s0Var.Q(s1Var.m());
                            return;
                        case 6:
                            s0Var.J(s1Var.f407o);
                            return;
                        case 7:
                            s0Var.O(s1Var.f399f);
                            return;
                        case 8:
                            s0Var.D(s1Var.f399f);
                            return;
                        default:
                            s0Var.i(s1Var.f402i.f12565d);
                            return;
                    }
                }
            });
        }
        if (!s1Var2.f407o.equals(s1Var.f407o)) {
            final int i28 = 6;
            this.K.c(12, new u1.l() { // from class: a2.y
                @Override // u1.l
                public final void invoke(Object obj82) {
                    r1.s0 s0Var = (r1.s0) obj82;
                    switch (i28) {
                        case 0:
                            s1 s1Var4 = s1Var;
                            s0Var.f(s1Var4.f400g);
                            s0Var.m(s1Var4.f400g);
                            return;
                        case 1:
                            s1 s1Var5 = s1Var;
                            s0Var.H(s1Var5.f398e, s1Var5.f404l);
                            return;
                        case 2:
                            s0Var.r(s1Var.f398e);
                            return;
                        case 3:
                            s1 s1Var6 = s1Var;
                            s0Var.o(s1Var6.f405m, s1Var6.f404l);
                            return;
                        case 4:
                            s0Var.e(s1Var.f406n);
                            return;
                        case 5:
                            s0Var.Q(s1Var.m());
                            return;
                        case 6:
                            s0Var.J(s1Var.f407o);
                            return;
                        case 7:
                            s0Var.O(s1Var.f399f);
                            return;
                        case 8:
                            s0Var.D(s1Var.f399f);
                            return;
                        default:
                            s0Var.i(s1Var.f402i.f12565d);
                            return;
                    }
                }
            });
        }
        B1();
        this.K.b();
        if (s1Var2.f408p != s1Var.f408p) {
            Iterator it = this.L.iterator();
            while (it.hasNext()) {
                ((k0) it.next()).f295x.E1();
            }
        }
    }

    @Override // e3.e, r1.u0
    public final void E(int i6, boolean z10) {
        F1();
    }

    @Override // e3.e, r1.u0
    public final void E0() {
        F1();
    }

    public final void E1() {
        int e02 = e0();
        e2 e2Var = this.f326a0;
        e2 e2Var2 = this.Z;
        boolean z10 = false;
        if (e02 != 1) {
            if (e02 != 2 && e02 != 3) {
                if (e02 != 4) {
                    throw new IllegalStateException();
                }
            } else {
                F1();
                boolean z11 = this.I0.f408p;
                if (m() && !z11) {
                    z10 = true;
                }
                e2Var2.c(z10);
                e2Var.c(m());
                return;
            }
        }
        e2Var2.c(false);
        e2Var.c(false);
    }

    @Override // e3.e, r1.u0
    public final void F() {
        F1();
    }

    @Override // e3.e, r1.u0
    public final boolean F0() {
        F1();
        return this.f330e0;
    }

    public final void F1() {
        IllegalStateException illegalStateException;
        this.B.b();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.R;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = u1.a0.f12750a;
            Locale locale = Locale.US;
            String str2 = "Player is accessed on the wrong thread.\nCurrent thread: '" + name + "'\nExpected thread: '" + name2 + "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread";
            if (!this.B0) {
                if (this.C0) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                u1.a.q("ExoPlayerImpl", str2, illegalStateException);
                this.C0 = true;
                return;
            }
            throw new IllegalStateException(str2);
        }
    }

    @Override // e3.e, r1.u0
    public final void G(int i6, int i10) {
        F1();
    }

    @Override // e3.e, r1.u0
    public final void H(int i6) {
        F1();
    }

    @Override // e3.e, r1.u0
    public final r1.j1 H0() {
        F1();
        t2.k e10 = ((t2.q) this.G).e();
        if (this.f334i0) {
            e10.getClass();
            t2.j jVar = new t2.j(e10);
            jVar.m(this.f335j0);
            return new t2.k(jVar);
        }
        return e10;
    }

    @Override // e3.e, r1.u0
    public final int I() {
        F1();
        if (h()) {
            return this.I0.f395b.f10836c;
        }
        return -1;
    }

    @Override // e3.e, r1.u0
    public final long I0() {
        F1();
        if (this.I0.f394a.p()) {
            return this.K0;
        }
        s1 s1Var = this.I0;
        long j = 0;
        if (s1Var.f403k.f10837d != s1Var.f395b.f10837d) {
            return u1.a0.e0(s1Var.f394a.m(m0(), (r1.c1) this.f4301y, 0L).f11338m);
        }
        long j10 = s1Var.f409q;
        if (this.I0.f403k.b()) {
            s1 s1Var2 = this.I0;
            s1Var2.f394a.g(s1Var2.f403k.f10834a, this.M).d(this.I0.f403k.f10835b);
        } else {
            j = j10;
        }
        s1 s1Var3 = this.I0;
        r1.d1 d1Var = s1Var3.f394a;
        Object obj = s1Var3.f403k.f10834a;
        r1.a1 a1Var = this.M;
        d1Var.g(obj, a1Var);
        return u1.a0.e0(j + a1Var.f11299e);
    }

    @Override // e3.e, r1.u0
    public final void J(SurfaceView surfaceView) {
        SurfaceHolder holder;
        F1();
        if (surfaceView instanceof w2.u) {
            v1();
            z1(surfaceView);
            y1(surfaceView.getHolder());
            return;
        }
        boolean z10 = surfaceView instanceof x2.k;
        k0 k0Var = this.W;
        if (z10) {
            v1();
            this.f343s0 = (x2.k) surfaceView;
            v1 j12 = j1(this.X);
            u1.c.g(!j12.f454f);
            j12.f451c = UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS;
            x2.k kVar = this.f343s0;
            u1.c.g(true ^ j12.f454f);
            j12.f452d = kVar;
            j12.b();
            this.f343s0.f14489x.add(k0Var);
            z1(this.f343s0.getVideoSurface());
            y1(surfaceView.getHolder());
            return;
        }
        if (surfaceView == null) {
            holder = null;
        } else {
            holder = surfaceView.getHolder();
        }
        F1();
        if (holder == null) {
            h1();
            return;
        }
        v1();
        this.f344t0 = true;
        this.f342r0 = holder;
        holder.addCallback(k0Var);
        Surface surface = holder.getSurface();
        if (surface != null && surface.isValid()) {
            z1(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            s1(surfaceFrame.width(), surfaceFrame.height());
        } else {
            z1(null);
            s1(0, 0);
        }
    }

    @Override // e3.e, r1.u0
    public final void J0(int i6) {
        F1();
    }

    @Override // e3.e, r1.u0
    public final void K(int i6, int i10, List list) {
        boolean z10;
        F1();
        boolean z11 = true;
        if (i6 >= 0 && i10 >= i6) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.b(z10);
        ArrayList arrayList = this.N;
        int size = arrayList.size();
        if (i6 > size) {
            return;
        }
        int min = Math.min(i10, size);
        if (min - i6 == list.size()) {
            for (int i11 = i6; i11 < min; i11++) {
                if (((m0) arrayList.get(i11)).f318b.H.a((r1.e0) list.get(i11 - i6))) {
                }
            }
            this.f331f0++;
            u1.x xVar = this.J.E;
            xVar.getClass();
            u1.w b10 = u1.x.b();
            b10.f12818a = xVar.f12820a.obtainMessage(27, i6, min, list);
            b10.b();
            for (int i12 = i6; i12 < min; i12++) {
                m0 m0Var = (m0) arrayList.get(i12);
                m0Var.f319c = new w1(m0Var.f319c, (r1.e0) list.get(i12 - i6));
            }
            D1(this.I0.j(new x1(arrayList, this.f337l0)), 0, false, 4, -9223372036854775807L, -1, false);
            return;
        }
        ArrayList i13 = i1(list);
        if (arrayList.isEmpty()) {
            if (this.J0 != -1) {
                z11 = false;
            }
            F1();
            x1(i13, -1, -9223372036854775807L, z11);
            return;
        }
        s1 t12 = t1(f1(this.I0, min, i13), i6, min);
        D1(t12, 0, !t12.f395b.f10834a.equals(this.I0.f395b.f10834a), 4, l1(t12), -1, false);
    }

    @Override // e3.e, r1.u0
    public final void M0(TextureView textureView) {
        SurfaceTexture surfaceTexture;
        F1();
        if (textureView == null) {
            h1();
            return;
        }
        v1();
        this.f345u0 = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            u1.a.p("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.W);
        if (textureView.isAvailable()) {
            surfaceTexture = textureView.getSurfaceTexture();
        } else {
            surfaceTexture = null;
        }
        if (surfaceTexture == null) {
            z1(null);
            s1(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            z1(surface);
            this.f341q0 = surface;
            s1(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // e3.e, r1.u0
    public final void N(int i6, int i10) {
        boolean z10;
        F1();
        if (i6 >= 0 && i10 >= i6) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.b(z10);
        int size = this.N.size();
        int min = Math.min(i10, size);
        if (i6 < size && i6 != min) {
            s1 t12 = t1(this.I0, i6, min);
            D1(t12, 0, !t12.f395b.f10834a.equals(this.I0.f395b.f10834a), 4, l1(t12), -1, false);
        }
    }

    @Override // e3.e, r1.u0
    public final void O(float f3) {
        F1();
        float h4 = u1.a0.h(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        if (this.f349y0 == h4) {
            return;
        }
        this.f349y0 = h4;
        this.J.E.a(32, Float.valueOf(h4)).b();
        this.K.e(22, new f0(0, h4));
    }

    @Override // e3.e, r1.u0
    public final r1.h0 O0() {
        F1();
        return this.f339n0;
    }

    @Override // e3.e, r1.u0
    public final void P0(List list) {
        F1();
        ArrayList i12 = i1(list);
        F1();
        x1(i12, -1, -9223372036854775807L, true);
    }

    @Override // e3.e, r1.u0
    public final void R(List list, int i6, long j) {
        F1();
        ArrayList i12 = i1(list);
        F1();
        x1(i12, i6, j, false);
    }

    @Override // e3.e, r1.u0
    public final long R0() {
        F1();
        return this.T;
    }

    @Override // e3.e, r1.u0
    public final r1.n0 S() {
        F1();
        return this.I0.f399f;
    }

    @Override // e3.e, r1.u0
    public final void T(boolean z10) {
        F1();
        C1(1, z10);
    }

    @Override // e3.e, r1.u0
    public final void U(r1.s0 s0Var) {
        s0Var.getClass();
        this.K.a(s0Var);
    }

    @Override // e3.e, r1.u0
    public final void V(r1.h0 h0Var) {
        F1();
        if (h0Var.equals(this.o0)) {
            return;
        }
        this.o0 = h0Var;
        this.K.e(15, new b0(this, 3));
    }

    @Override // e3.e, r1.u0
    public final long X() {
        F1();
        return this.U;
    }

    @Override // e3.e, r1.u0
    public final long Y() {
        F1();
        return k1(this.I0);
    }

    @Override // e3.e, r1.u0
    public final void Z(int i6, List list) {
        boolean z10;
        boolean z11;
        F1();
        ArrayList i12 = i1(list);
        F1();
        if (i6 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.b(z10);
        ArrayList arrayList = this.N;
        int min = Math.min(i6, arrayList.size());
        if (arrayList.isEmpty()) {
            if (this.J0 == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            F1();
            x1(i12, -1, -9223372036854775807L, z11);
            return;
        }
        D1(f1(this.I0, min, i12), 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // e3.e, r1.u0
    public final boolean a() {
        F1();
        return this.I0.f400g;
    }

    @Override // e3.e, r1.u0
    public final long a0() {
        F1();
        if (h()) {
            s1 s1Var = this.I0;
            if (s1Var.f403k.equals(s1Var.f395b)) {
                return u1.a0.e0(this.I0.f409q);
            }
            return getDuration();
        }
        return I0();
    }

    @Override // e3.e
    public final void a1(int i6, long j, boolean z10) {
        boolean z11;
        F1();
        if (i6 != -1) {
            if (i6 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            u1.c.b(z11);
            r1.d1 d1Var = this.I0.f394a;
            if (!d1Var.p() && i6 >= d1Var.o()) {
                return;
            }
            b2.f fVar = this.Q;
            if (!fVar.F) {
                b2.a R = fVar.R();
                fVar.F = true;
                fVar.W(R, -1, new t(17));
            }
            this.f331f0++;
            if (h()) {
                u1.a.p("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                t0 t0Var = new t0(this.I0);
                t0Var.f(1);
                n0 n0Var = this.I.f167y;
                n0Var.H.c(new c0(0, n0Var, t0Var));
                return;
            }
            s1 s1Var = this.I0;
            int i10 = s1Var.f398e;
            if (i10 == 3 || (i10 == 4 && !d1Var.p())) {
                s1Var = this.I0.h(2);
            }
            int m02 = m0();
            s1 q12 = q1(s1Var, d1Var, r1(d1Var, i6, j));
            this.J.E.a(3, new v0(d1Var, i6, u1.a0.Q(j))).b();
            D1(q12, 0, true, 1, l1(q12), m02, z10);
        }
    }

    @Override // e3.e, r1.u0
    public final void c() {
        int i6;
        F1();
        s1 s1Var = this.I0;
        if (s1Var.f398e != 1) {
            return;
        }
        s1 f3 = s1Var.f(null);
        if (f3.f394a.p()) {
            i6 = 4;
        } else {
            i6 = 2;
        }
        s1 p12 = p1(f3, i6);
        this.f331f0++;
        u1.x xVar = this.J.E;
        xVar.getClass();
        u1.w b10 = u1.x.b();
        b10.f12818a = xVar.f12820a.obtainMessage(29);
        b10.b();
        D1(p12, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // e3.e, r1.u0
    public final r1.o0 d() {
        F1();
        return this.I0.f407o;
    }

    @Override // e3.e, r1.u0
    public final void e(r1.o0 o0Var) {
        F1();
        if (this.I0.f407o.equals(o0Var)) {
            return;
        }
        s1 g10 = this.I0.g(o0Var);
        this.f331f0++;
        this.J.E.a(4, o0Var).b();
        D1(g10, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // e3.e, r1.u0
    public final int e0() {
        F1();
        return this.I0.f398e;
    }

    public final ArrayList e1(int i6, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            q1 q1Var = new q1((q2.a) list.get(i10), this.O);
            arrayList.add(q1Var);
            m0 m0Var = new m0(q1Var.f367b, q1Var.f366a);
            this.N.add(i10 + i6, m0Var);
        }
        this.f337l0 = this.f337l0.a(i6, arrayList.size());
        return arrayList;
    }

    @Override // e3.e, r1.u0
    public final int f() {
        F1();
        return 0;
    }

    @Override // e3.e, r1.u0
    public final void f0(int i6) {
        F1();
    }

    public final s1 f1(s1 s1Var, int i6, ArrayList arrayList) {
        r1.d1 d1Var = s1Var.f394a;
        this.f331f0++;
        ArrayList e12 = e1(i6, arrayList);
        x1 x1Var = new x1(this.N, this.f337l0);
        s1 q12 = q1(s1Var, x1Var, n1(d1Var, x1Var, m1(s1Var), k1(s1Var)));
        q2.c1 c1Var = this.f337l0;
        u1.x xVar = this.J.E;
        r0 r0Var = new r0(e12, c1Var, -1, -9223372036854775807L);
        xVar.getClass();
        u1.w b10 = u1.x.b();
        b10.f12818a = xVar.f12820a.obtainMessage(18, i6, 0, r0Var);
        b10.b();
        return q12;
    }

    @Override // e3.e, r1.u0
    public final void g(Surface surface) {
        int i6;
        F1();
        v1();
        z1(surface);
        if (surface == null) {
            i6 = 0;
        } else {
            i6 = -1;
        }
        s1(i6, i6);
    }

    @Override // e3.e, r1.u0
    public final r1.l1 g0() {
        F1();
        return this.I0.f402i.f12565d;
    }

    public final r1.h0 g1() {
        byte[] bArr;
        boolean z10;
        r1.d1 y02 = y0();
        if (y02.p()) {
            return this.H0;
        }
        r1.e0 e0Var = y02.m(m0(), (r1.c1) this.f4301y, 0L).f11329c;
        r1.g0 a10 = this.H0.a();
        r1.h0 h0Var = e0Var.f11381d;
        if (h0Var != null) {
            db.k0 k0Var = h0Var.J;
            byte[] bArr2 = h0Var.f11472k;
            CharSequence charSequence = h0Var.f11463a;
            if (charSequence != null) {
                a10.f11404a = charSequence;
            }
            CharSequence charSequence2 = h0Var.f11464b;
            if (charSequence2 != null) {
                a10.f11405b = charSequence2;
            }
            CharSequence charSequence3 = h0Var.f11465c;
            if (charSequence3 != null) {
                a10.f11406c = charSequence3;
            }
            CharSequence charSequence4 = h0Var.f11466d;
            if (charSequence4 != null) {
                a10.f11407d = charSequence4;
            }
            CharSequence charSequence5 = h0Var.f11467e;
            if (charSequence5 != null) {
                a10.f11408e = charSequence5;
            }
            CharSequence charSequence6 = h0Var.f11468f;
            if (charSequence6 != null) {
                a10.f11409f = charSequence6;
            }
            CharSequence charSequence7 = h0Var.f11469g;
            if (charSequence7 != null) {
                a10.f11410g = charSequence7;
            }
            Long l10 = h0Var.f11470h;
            if (l10 != null) {
                if (l10.longValue() >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u1.c.b(z10);
                a10.f11411h = l10;
            }
            r1.v0 v0Var = h0Var.f11471i;
            if (v0Var != null) {
                a10.f11412i = v0Var;
            }
            r1.v0 v0Var2 = h0Var.j;
            if (v0Var2 != null) {
                a10.j = v0Var2;
            }
            Uri uri = h0Var.f11474m;
            if (uri != null || bArr2 != null) {
                a10.f11415m = uri;
                Integer num = h0Var.f11473l;
                if (bArr2 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) bArr2.clone();
                }
                a10.f11413k = bArr;
                a10.f11414l = num;
            }
            Integer num2 = h0Var.f11475n;
            if (num2 != null) {
                a10.f11416n = num2;
            }
            Integer num3 = h0Var.f11476o;
            if (num3 != null) {
                a10.f11417o = num3;
            }
            Integer num4 = h0Var.f11477p;
            if (num4 != null) {
                a10.f11418p = num4;
            }
            Boolean bool = h0Var.f11478q;
            if (bool != null) {
                a10.f11419q = bool;
            }
            Boolean bool2 = h0Var.f11479r;
            if (bool2 != null) {
                a10.f11420r = bool2;
            }
            Integer num5 = h0Var.s;
            if (num5 != null) {
                a10.s = num5;
            }
            Integer num6 = h0Var.f11480t;
            if (num6 != null) {
                a10.s = num6;
            }
            Integer num7 = h0Var.f11481u;
            if (num7 != null) {
                a10.f11421t = num7;
            }
            Integer num8 = h0Var.f11482v;
            if (num8 != null) {
                a10.f11422u = num8;
            }
            Integer num9 = h0Var.f11483w;
            if (num9 != null) {
                a10.f11423v = num9;
            }
            Integer num10 = h0Var.f11484x;
            if (num10 != null) {
                a10.f11424w = num10;
            }
            Integer num11 = h0Var.f11485y;
            if (num11 != null) {
                a10.f11425x = num11;
            }
            CharSequence charSequence8 = h0Var.f11486z;
            if (charSequence8 != null) {
                a10.f11426y = charSequence8;
            }
            CharSequence charSequence9 = h0Var.A;
            if (charSequence9 != null) {
                a10.f11427z = charSequence9;
            }
            CharSequence charSequence10 = h0Var.B;
            if (charSequence10 != null) {
                a10.A = charSequence10;
            }
            Integer num12 = h0Var.C;
            if (num12 != null) {
                a10.B = num12;
            }
            Integer num13 = h0Var.D;
            if (num13 != null) {
                a10.C = num13;
            }
            CharSequence charSequence11 = h0Var.E;
            if (charSequence11 != null) {
                a10.D = charSequence11;
            }
            CharSequence charSequence12 = h0Var.F;
            if (charSequence12 != null) {
                a10.E = charSequence12;
            }
            CharSequence charSequence13 = h0Var.G;
            if (charSequence13 != null) {
                a10.F = charSequence13;
            }
            Integer num14 = h0Var.H;
            if (num14 != null) {
                a10.G = num14;
            }
            Bundle bundle = h0Var.I;
            if (bundle != null) {
                a10.H = bundle;
            }
            if (!k0Var.isEmpty()) {
                a10.I = db.k0.k(k0Var);
            }
        }
        return new r1.h0(a10);
    }

    @Override // e3.e, r1.u0
    public final long getCurrentPosition() {
        F1();
        return u1.a0.e0(l1(this.I0));
    }

    @Override // e3.e, r1.u0
    public final r1.j getDeviceInfo() {
        F1();
        return this.F0;
    }

    @Override // e3.e, r1.u0
    public final long getDuration() {
        F1();
        if (h()) {
            s1 s1Var = this.I0;
            q2.c0 c0Var = s1Var.f395b;
            r1.d1 d1Var = s1Var.f394a;
            Object obj = c0Var.f10834a;
            r1.a1 a1Var = this.M;
            d1Var.g(obj, a1Var);
            return u1.a0.e0(a1Var.a(c0Var.f10835b, c0Var.f10836c));
        }
        return v();
    }

    @Override // e3.e, r1.u0
    public final float getVolume() {
        F1();
        return this.f349y0;
    }

    @Override // e3.e, r1.u0
    public final boolean h() {
        F1();
        return this.I0.f395b.b();
    }

    @Override // e3.e, r1.u0
    public final r1.h0 h0() {
        F1();
        return this.o0;
    }

    public final void h1() {
        F1();
        v1();
        z1(null);
        s1(0, 0);
    }

    @Override // e3.e, r1.u0
    public final t1.c i0() {
        F1();
        return this.A0;
    }

    public final ArrayList i1(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < list.size(); i6++) {
            arrayList.add(this.P.b((r1.e0) list.get(i6)));
        }
        return arrayList;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final boolean isScrubbingModeEnabled() {
        F1();
        return this.f334i0;
    }

    @Override // e3.e, r1.u0
    public final long j() {
        F1();
        return u1.a0.e0(this.I0.f410r);
    }

    public final v1 j1(u1 u1Var) {
        int i6;
        int m12 = m1(this.I0);
        r1.d1 d1Var = this.I0.f394a;
        if (m12 == -1) {
            i6 = 0;
        } else {
            i6 = m12;
        }
        w0 w0Var = this.J;
        return new v1(w0Var, u1Var, d1Var, i6, w0Var.G);
    }

    @Override // e3.e, r1.u0
    public final int k0() {
        F1();
        if (h()) {
            return this.I0.f395b.f10835b;
        }
        return -1;
    }

    public final long k1(s1 s1Var) {
        q2.c0 c0Var = s1Var.f395b;
        long j = s1Var.f396c;
        r1.d1 d1Var = s1Var.f394a;
        if (c0Var.b()) {
            Object obj = s1Var.f395b.f10834a;
            r1.a1 a1Var = this.M;
            d1Var.g(obj, a1Var);
            if (j == -9223372036854775807L) {
                return u1.a0.e0(d1Var.m(m1(s1Var), (r1.c1) this.f4301y, 0L).f11337l);
            }
            return u1.a0.e0(j) + u1.a0.e0(a1Var.f11299e);
        }
        return u1.a0.e0(l1(s1Var));
    }

    @Override // e3.e, r1.u0
    public final r1.q0 l() {
        F1();
        return this.f338m0;
    }

    public final long l1(s1 s1Var) {
        long j;
        if (s1Var.f394a.p()) {
            return u1.a0.Q(this.K0);
        }
        if (s1Var.f408p) {
            j = s1Var.l();
        } else {
            j = s1Var.s;
        }
        if (s1Var.f395b.b()) {
            return j;
        }
        r1.d1 d1Var = s1Var.f394a;
        Object obj = s1Var.f395b.f10834a;
        r1.a1 a1Var = this.M;
        d1Var.g(obj, a1Var);
        return j + a1Var.f11299e;
    }

    @Override // e3.e, r1.u0
    public final boolean m() {
        F1();
        return this.I0.f404l;
    }

    @Override // e3.e, r1.u0
    public final int m0() {
        F1();
        int m12 = m1(this.I0);
        if (m12 == -1) {
            return 0;
        }
        return m12;
    }

    public final int m1(s1 s1Var) {
        if (s1Var.f394a.p()) {
            return this.J0;
        }
        return s1Var.f394a.g(s1Var.f395b.f10834a, this.M).f11297c;
    }

    public final Pair n1(r1.d1 d1Var, x1 x1Var, int i6, long j) {
        boolean z10;
        long j10 = -9223372036854775807L;
        int i10 = -1;
        if (!d1Var.p() && !x1Var.p()) {
            Pair i11 = d1Var.i((r1.c1) this.f4301y, this.M, i6, u1.a0.Q(j));
            Object obj = i11.first;
            if (x1Var.b(obj) != -1) {
                return i11;
            }
            int T = w0.T((r1.c1) this.f4301y, this.M, this.f329d0, this.f330e0, obj, d1Var, x1Var);
            if (T != -1) {
                r1.c1 c1Var = (r1.c1) this.f4301y;
                x1Var.m(T, c1Var, 0L);
                return r1(x1Var, T, u1.a0.e0(c1Var.f11337l));
            }
            return r1(x1Var, -1, -9223372036854775807L);
        }
        if (!d1Var.p() && x1Var.p()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            i10 = i6;
        }
        if (!z10) {
            j10 = j;
        }
        return r1(x1Var, i10, j10);
    }

    @Override // e3.e, r1.u0
    public final void p0(int i6) {
        F1();
        if (this.f329d0 != i6) {
            this.f329d0 = i6;
            u1.x xVar = this.J.E;
            xVar.getClass();
            u1.w b10 = u1.x.b();
            b10.f12818a = xVar.f12820a.obtainMessage(11, i6, 0);
            b10.b();
            a0 a0Var = new a0(i6, 0);
            u1.o oVar = this.K;
            oVar.c(8, a0Var);
            B1();
            oVar.b();
        }
    }

    @Override // e3.e, r1.u0
    public final void q(boolean z10) {
        F1();
        if (this.f330e0 != z10) {
            this.f330e0 = z10;
            u1.x xVar = this.J.E;
            xVar.getClass();
            u1.w b10 = u1.x.b();
            b10.f12818a = xVar.f12820a.obtainMessage(12, z10 ? 1 : 0, 0);
            b10.b();
            d0 d0Var = new d0(0, z10);
            u1.o oVar = this.K;
            oVar.c(9, d0Var);
            B1();
            oVar.b();
        }
    }

    @Override // e3.e, r1.u0
    public final void q0(boolean z10) {
        F1();
    }

    public final s1 q1(s1 s1Var, r1.d1 d1Var, Pair pair) {
        boolean z10;
        q2.c0 c0Var;
        q2.k1 k1Var;
        t2.w wVar;
        List list;
        long j;
        if (!d1Var.p() && pair == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        u1.c.b(z10);
        r1.d1 d1Var2 = s1Var.f394a;
        long k12 = k1(s1Var);
        s1 j10 = s1Var.j(d1Var);
        if (d1Var.p()) {
            q2.c0 c0Var2 = s1.f393u;
            long Q = u1.a0.Q(this.K0);
            s1 c10 = j10.d(c0Var2, Q, Q, Q, 0L, q2.k1.f10907d, this.f350z, db.c1.B).c(c0Var2);
            c10.f409q = c10.s;
            return c10;
        }
        Object obj = j10.f395b.f10834a;
        String str = u1.a0.f12750a;
        boolean equals = obj.equals(pair.first);
        if (!equals) {
            c0Var = new q2.c0(pair.first);
        } else {
            c0Var = j10.f395b;
        }
        long longValue = ((Long) pair.second).longValue();
        long Q2 = u1.a0.Q(k12);
        if (!d1Var2.p()) {
            Q2 -= d1Var2.g(obj, this.M).f11299e;
        }
        if (!equals || longValue < Q2) {
            q2.c0 c0Var3 = c0Var;
            u1.c.g(!c0Var3.b());
            if (!equals) {
                k1Var = q2.k1.f10907d;
            } else {
                k1Var = j10.f401h;
            }
            q2.k1 k1Var2 = k1Var;
            if (!equals) {
                wVar = this.f350z;
            } else {
                wVar = j10.f402i;
            }
            t2.w wVar2 = wVar;
            if (!equals) {
                db.i0 i0Var = db.k0.f4008y;
                list = db.c1.B;
            } else {
                list = j10.j;
            }
            s1 c11 = j10.d(c0Var3, longValue, longValue, longValue, 0L, k1Var2, wVar2, list).c(c0Var3);
            c11.f409q = longValue;
            return c11;
        }
        if (longValue == Q2) {
            int b10 = d1Var.b(j10.f403k.f10834a);
            if (b10 != -1 && d1Var.f(b10, this.M, false).f11297c == d1Var.g(c0Var.f10834a, this.M).f11297c) {
                return j10;
            }
            d1Var.g(c0Var.f10834a, this.M);
            if (c0Var.b()) {
                j = this.M.a(c0Var.f10835b, c0Var.f10836c);
            } else {
                j = this.M.f11298d;
            }
            q2.c0 c0Var4 = c0Var;
            s1 c12 = j10.d(c0Var4, j10.s, j10.s, j10.f397d, j - j10.s, j10.f401h, j10.f402i, j10.j).c(c0Var4);
            c12.f409q = j;
            return c12;
        }
        q2.c0 c0Var5 = c0Var;
        u1.c.g(!c0Var5.b());
        long max = Math.max(0L, j10.f410r - (longValue - Q2));
        long j11 = j10.f409q;
        if (j10.f403k.equals(j10.f395b)) {
            j11 = longValue + max;
        }
        s1 d10 = j10.d(c0Var5, longValue, longValue, longValue, max, j10.f401h, j10.f402i, j10.j);
        d10.f409q = j11;
        return d10;
    }

    @Override // e3.e, r1.u0
    public final void r0(SurfaceView surfaceView) {
        SurfaceHolder holder;
        F1();
        if (surfaceView == null) {
            holder = null;
        } else {
            holder = surfaceView.getHolder();
        }
        F1();
        if (holder != null && holder == this.f342r0) {
            h1();
        }
    }

    public final Pair r1(r1.d1 d1Var, int i6, long j) {
        if (d1Var.p()) {
            this.J0 = i6;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.K0 = j;
            return null;
        }
        if (i6 == -1 || i6 >= d1Var.o()) {
            i6 = d1Var.a(this.f330e0);
            j = u1.a0.e0(d1Var.m(i6, (r1.c1) this.f4301y, 0L).f11337l);
        }
        return d1Var.i((r1.c1) this.f4301y, this.M, i6, u1.a0.Q(j));
    }

    public final void s1(int i6, int i10) {
        u1.u uVar = this.f347w0;
        if (i6 == uVar.f12815a && i10 == uVar.f12816b) {
            return;
        }
        this.f347w0 = new u1.u(i6, i10);
        this.K.e(24, new z(i6, i10, 0));
        w1(2, 14, new u1.u(i6, i10));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        F1();
        w1(4, 15, imageOutput);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setScrubbingModeEnabled(boolean z10) {
        r1.j1 j1Var;
        F1();
        if (z10 == this.f334i0) {
            return;
        }
        this.f334i0 = z10;
        b2 b2Var = this.f336k0;
        if (!b2Var.f169a.isEmpty()) {
            t2.v vVar = this.G;
            vVar.getClass();
            t2.k e10 = ((t2.q) vVar).e();
            if (z10) {
                this.f335j0 = e10.E;
                db.p0 p0Var = b2Var.f169a;
                r1.i1 a10 = e10.a();
                db.q1 it = p0Var.iterator();
                while (it.hasNext()) {
                    a10.l(((Integer) it.next()).intValue(), true);
                }
                j1Var = a10.b();
            } else {
                e10.getClass();
                t2.j jVar = new t2.j(e10);
                jVar.m(this.f335j0);
                t2.k kVar = new t2.k(jVar);
                this.f335j0 = null;
                j1Var = kVar;
            }
            if (!j1Var.equals(e10)) {
                vVar.b(j1Var);
            }
        }
        this.J.E.a(36, Boolean.valueOf(z10)).b();
        s1 s1Var = this.I0;
        C1(s1Var.f405m, s1Var.f404l);
    }

    @Override // e3.e, r1.u0
    public final void stop() {
        F1();
        A1(null);
        this.A0 = new t1.c(this.I0.s, db.c1.B);
    }

    @Override // e3.e, r1.u0
    public final void t(r1.s0 s0Var) {
        F1();
        s0Var.getClass();
        u1.o oVar = this.K;
        oVar.f();
        CopyOnWriteArraySet copyOnWriteArraySet = oVar.f12787d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            u1.n nVar = (u1.n) it.next();
            if (nVar.f12780a.equals(s0Var)) {
                u1.m mVar = oVar.f12786c;
                nVar.f12783d = true;
                if (nVar.f12782c) {
                    nVar.f12782c = false;
                    mVar.g(nVar.f12780a, nVar.f12781b.c());
                }
                copyOnWriteArraySet.remove(nVar);
            }
        }
    }

    @Override // e3.e, r1.u0
    public final void t0(int i6, int i10, int i11) {
        boolean z10;
        F1();
        if (i6 >= 0 && i6 <= i10 && i11 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.b(z10);
        ArrayList arrayList = this.N;
        int size = arrayList.size();
        int min = Math.min(i10, size);
        int min2 = Math.min(i11, size - (min - i6));
        if (i6 < size && i6 != min && i6 != min2) {
            r1.d1 y02 = y0();
            this.f331f0++;
            u1.a0.P(arrayList, i6, min, min2);
            q2.c1 c1Var = this.f337l0;
            c1Var.getClass();
            this.f337l0 = c1Var;
            x1 x1Var = new x1(arrayList, this.f337l0);
            s1 s1Var = this.I0;
            s1 q12 = q1(s1Var, x1Var, n1(y02, x1Var, m1(s1Var), k1(this.I0)));
            q2.c1 c1Var2 = this.f337l0;
            w0 w0Var = this.J;
            w0Var.getClass();
            w0Var.E.a(19, new s0(i6, min, min2, c1Var2)).b();
            D1(q12, 0, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public final s1 t1(s1 s1Var, int i6, int i10) {
        int m12 = m1(s1Var);
        long k12 = k1(s1Var);
        r1.d1 d1Var = s1Var.f394a;
        ArrayList arrayList = this.N;
        int size = arrayList.size();
        this.f331f0++;
        u1(i6, i10);
        x1 x1Var = new x1(arrayList, this.f337l0);
        s1 q12 = q1(s1Var, x1Var, n1(d1Var, x1Var, m12, k12));
        int i11 = q12.f398e;
        if (i11 != 1 && i11 != 4 && i6 < i10 && i10 == size && m12 >= q12.f394a.o()) {
            q12 = p1(q12, 4);
        }
        q2.c1 c1Var = this.f337l0;
        u1.x xVar = this.J.E;
        xVar.getClass();
        u1.w b10 = u1.x.b();
        b10.f12818a = xVar.f12820a.obtainMessage(20, i6, i10, c1Var);
        b10.b();
        return q12;
    }

    @Override // e3.e, r1.u0
    public final long u() {
        F1();
        return this.V;
    }

    public final void u1(int i6, int i10) {
        for (int i11 = i10 - 1; i11 >= i6; i11--) {
            this.N.remove(i11);
        }
        q2.c1 c1Var = this.f337l0;
        int i12 = i10 - i6;
        int[] iArr = c1Var.f10840b;
        int[] iArr2 = new int[iArr.length - i12];
        int i13 = 0;
        for (int i14 = 0; i14 < iArr.length; i14++) {
            int i15 = iArr[i14];
            if (i15 >= i6 && i15 < i10) {
                i13++;
            } else {
                int i16 = i14 - i13;
                if (i15 >= i6) {
                    i15 -= i12;
                }
                iArr2[i16] = i15;
            }
        }
        this.f337l0 = new q2.c1(iArr2, new Random(c1Var.f10839a.nextLong()));
    }

    @Override // e3.e, r1.u0
    public final int v0() {
        F1();
        return this.I0.f406n;
    }

    public final void v1() {
        x2.k kVar = this.f343s0;
        k0 k0Var = this.W;
        if (kVar != null) {
            v1 j12 = j1(this.X);
            u1.c.g(!j12.f454f);
            j12.f451c = UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS;
            u1.c.g(!j12.f454f);
            j12.f452d = null;
            j12.b();
            this.f343s0.f14489x.remove(k0Var);
            this.f343s0 = null;
        }
        TextureView textureView = this.f345u0;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != k0Var) {
                u1.a.p("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f345u0.setSurfaceTextureListener(null);
            }
            this.f345u0 = null;
        }
        SurfaceHolder surfaceHolder = this.f342r0;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(k0Var);
            this.f342r0 = null;
        }
    }

    @Override // e3.e, r1.u0
    public final int w() {
        F1();
        if (this.I0.f394a.p()) {
            return 0;
        }
        s1 s1Var = this.I0;
        return s1Var.f394a.b(s1Var.f395b.f10834a);
    }

    public final void w1(int i6, int i10, Object obj) {
        for (g gVar : this.E) {
            if (i6 == -1 || gVar.f245y == i6) {
                v1 j12 = j1(gVar);
                u1.c.g(!j12.f454f);
                j12.f451c = i10;
                u1.c.g(!j12.f454f);
                j12.f452d = obj;
                j12.b();
            }
        }
        for (g gVar2 : this.F) {
            if (gVar2 != null && (i6 == -1 || gVar2.f245y == i6)) {
                v1 j13 = j1(gVar2);
                u1.c.g(!j13.f454f);
                j13.f451c = i10;
                u1.c.g(!j13.f454f);
                j13.f452d = obj;
                j13.b();
            }
        }
    }

    @Override // e3.e, r1.u0
    public final void x(TextureView textureView) {
        F1();
        if (textureView != null && textureView == this.f345u0) {
            h1();
        }
    }

    @Override // e3.e, r1.u0
    public final int x0() {
        F1();
        return this.f329d0;
    }

    public final void x1(List list, int i6, long j, boolean z10) {
        long j10;
        int i10;
        int i11;
        s1 p12;
        boolean z11;
        int i12 = i6;
        int m12 = m1(this.I0);
        long currentPosition = getCurrentPosition();
        this.f331f0++;
        ArrayList arrayList = this.N;
        if (!arrayList.isEmpty()) {
            u1(0, arrayList.size());
        }
        ArrayList e12 = e1(0, list);
        x1 x1Var = new x1(arrayList, this.f337l0);
        boolean p10 = x1Var.p();
        int i13 = x1Var.f492g;
        if (!p10 && i12 >= i13) {
            throw new IllegalStateException();
        }
        if (z10) {
            i12 = x1Var.a(this.f330e0);
            j10 = -9223372036854775807L;
        } else {
            if (i12 == -1) {
                i10 = m12;
                j10 = currentPosition;
                s1 q12 = q1(this.I0, x1Var, r1(x1Var, i10, j10));
                i11 = q12.f398e;
                if (i10 != -1 && i11 != 1) {
                    i11 = (!x1Var.p() || i10 >= i13) ? 4 : 2;
                }
                p12 = p1(q12, i11);
                this.J.E.a(17, new r0(e12, this.f337l0, i10, u1.a0.Q(j10))).b();
                if (this.I0.f395b.f10834a.equals(p12.f395b.f10834a) && !this.I0.f394a.p()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                D1(p12, 0, z11, 4, l1(p12), -1, false);
            }
            j10 = j;
        }
        i10 = i12;
        s1 q122 = q1(this.I0, x1Var, r1(x1Var, i10, j10));
        i11 = q122.f398e;
        if (i10 != -1) {
            if (x1Var.p()) {
            }
        }
        p12 = p1(q122, i11);
        this.J.E.a(17, new r0(e12, this.f337l0, i10, u1.a0.Q(j10))).b();
        if (this.I0.f395b.f10834a.equals(p12.f395b.f10834a)) {
        }
        z11 = false;
        D1(p12, 0, z11, 4, l1(p12), -1, false);
    }

    @Override // e3.e, r1.u0
    public final r1.p1 y() {
        F1();
        return this.G0;
    }

    @Override // e3.e, r1.u0
    public final r1.d1 y0() {
        F1();
        return this.I0.f394a;
    }

    public final void y1(SurfaceHolder surfaceHolder) {
        this.f344t0 = false;
        this.f342r0 = surfaceHolder;
        surfaceHolder.addCallback(this.W);
        Surface surface = this.f342r0.getSurface();
        if (surface != null && surface.isValid()) {
            Rect surfaceFrame = this.f342r0.getSurfaceFrame();
            s1(surfaceFrame.width(), surfaceFrame.height());
        } else {
            s1(0, 0);
        }
    }

    @Override // e3.e, r1.u0
    public final boolean z0() {
        F1();
        return false;
    }

    public final void z1(Object obj) {
        boolean z10;
        long j;
        Object obj2 = this.f340p0;
        boolean z11 = true;
        if (obj2 != null && obj2 != obj) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            j = this.f327b0;
        } else {
            j = -9223372036854775807L;
        }
        w0 w0Var = this.J;
        if (!w0Var.f462e0 && w0Var.G.getThread().isAlive()) {
            u1.f fVar = new u1.f(w0Var.M);
            w0Var.E.a(30, new Pair(obj, fVar)).b();
            if (j != -9223372036854775807L) {
                z11 = fVar.c(j);
            }
        }
        if (z10) {
            Object obj3 = this.f340p0;
            Surface surface = this.f341q0;
            if (obj3 == surface) {
                surface.release();
                this.f341q0 = null;
            }
        }
        this.f340p0 = obj;
        if (!z11) {
            A1(new q(2, new RuntimeException("Detaching surface timed out."), 1003));
        }
    }
}
