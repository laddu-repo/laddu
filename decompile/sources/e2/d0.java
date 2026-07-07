package e2;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.fragment.app.d1;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import y9.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements o {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final Object f4561n0 = new Object();
    public static ScheduledExecutorService o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static int f4562p0;
    public t1.c A;
    public y B;
    public y C;
    public t1.i0 D;
    public boolean E;
    public ByteBuffer F;
    public int G;
    public long H;
    public long I;
    public long J;
    public long K;
    public int L;
    public boolean M;
    public boolean N;
    public long O;
    public float P;
    public ByteBuffer Q;
    public int R;
    public ByteBuffer S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4563a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public t1.d f4564a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a7.j f4565b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public a9.g f4566b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f4567c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f4568c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j0 f4569d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public long f4570d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u1.k f4571e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public long f4572e0;
    public final i0 f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f4573f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z0 f4574g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f4575g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r f4576h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public Looper f4577h0;
    public final ArrayDeque i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public long f4578i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4579j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public long f4580j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a7.j f4581k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public Handler f4582k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a0 f4583l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public Context f4584l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a0 f4585m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final boolean f4586m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e0 f4587n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final sc.b f4588o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e0 f4589p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f4590q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public d2.l f4591r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public m f4592s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public x f4593t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public x f4594u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public u1.d f4595v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AudioTrack f4596w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public b f4597x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public e f4598y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public a7.j f4599z;

    public d0(w wVar) {
        int deviceId;
        Context context = wVar.f4711a;
        Context applicationContext = context == null ? null : context.getApplicationContext();
        this.f4563a = applicationContext;
        this.A = t1.c.f11948b;
        this.f4597x = applicationContext == null ? (b) wVar.f4713c : null;
        this.f4565b = (a7.j) wVar.f4714d;
        int i = Build.VERSION.SDK_INT;
        this.f4579j = 0;
        this.f4587n = (e0) wVar.f4715e;
        sc.b bVar = (sc.b) wVar.f4716g;
        bVar.getClass();
        this.f4588o = bVar;
        this.f4576h = new r(new s5.d(this));
        s sVar = new s();
        this.f4567c = sVar;
        j0 j0Var = new j0();
        j0Var.f4658m = w1.b0.f13688c;
        this.f4569d = j0Var;
        this.f4571e = new u1.k();
        this.f = new i0();
        this.f4574g = y9.f0.r(j0Var, sVar);
        this.P = 1.0f;
        this.Y = 0;
        this.f4564a0 = new t1.d();
        t1.i0 i0Var = t1.i0.f12003d;
        this.C = new y(i0Var, 0L, 0L);
        this.D = i0Var;
        this.E = false;
        this.i = new ArrayDeque();
        this.f4583l = new a0();
        this.f4585m = new a0();
        this.f4589p = (e0) wVar.f;
        int i10 = -1;
        if (i >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i10 = deviceId;
        }
        this.f4590q = i10;
        this.f4586m0 = true;
    }

    public static boolean r(AudioTrack audioTrack) {
        return Build.VERSION.SDK_INT >= 29 && audioTrack.isOffloadedPlayback();
    }

    public final void A(int i) {
        if (this.Z) {
            if (this.Y != i) {
                return;
            } else {
                this.Z = false;
            }
        }
        if (this.Y != i) {
            this.Y = i;
            this.X = i != 0;
            g();
        }
    }

    public final void B() {
        if (q()) {
            try {
                this.f4596w.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.D.f12004a).setPitch(this.D.f12005b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e7) {
                w1.a.D("DefaultAudioSink", "Failed to set playback params", e7);
            }
            t1.i0 i0Var = new t1.i0(this.f4596w.getPlaybackParams().getSpeed(), this.f4596w.getPlaybackParams().getPitch());
            this.D = i0Var;
            float f = i0Var.f12004a;
            r rVar = this.f4576h;
            rVar.f4687h = f;
            q qVar = rVar.f4685e;
            if (qVar != null) {
                qVar.a(0);
            }
            rVar.f();
        }
    }

    public final void C(t1.d dVar) {
        if (this.f4564a0.equals(dVar)) {
            return;
        }
        dVar.getClass();
        if (this.f4596w != null) {
            this.f4564a0.getClass();
        }
        this.f4564a0 = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0057 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(java.nio.ByteBuffer r19) {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.d0.D(java.nio.ByteBuffer):void");
    }

    public final void E(t1.i0 i0Var) {
        this.D = new t1.i0(w1.b0.g(i0Var.f12004a, 0.1f, 8.0f), w1.b0.g(i0Var.f12005b, 0.1f, 8.0f));
        x xVar = this.f4594u;
        if (xVar != null && xVar.f4724j) {
            B();
            return;
        }
        y yVar = new y(i0Var, -9223372036854775807L, -9223372036854775807L);
        if (q()) {
            this.B = yVar;
        } else {
            this.C = yVar;
        }
    }

    public final boolean F(t1.o oVar) {
        return k(oVar) != 0;
    }

    public final void a(long j8) {
        t1.i0 i0Var;
        x xVar = this.f4594u;
        boolean z2 = false;
        a7.j jVar = this.f4565b;
        if (xVar == null || !xVar.f4724j) {
            if (this.f4568c0 || xVar.f4719c != 0) {
                i0Var = t1.i0.f12003d;
            } else {
                int i = xVar.f4717a.H;
                i0Var = this.D;
                u1.j jVar2 = (u1.j) jVar.f204y;
                float f = i0Var.f12004a;
                jVar2.getClass();
                w1.a.d(f > 0.0f);
                if (jVar2.f12658c != f) {
                    jVar2.f12658c = f;
                    jVar2.i = true;
                }
                float f4 = i0Var.f12005b;
                w1.a.d(f4 > 0.0f);
                if (jVar2.f12659d != f4) {
                    jVar2.f12659d = f4;
                    jVar2.i = true;
                }
            }
            this.D = i0Var;
        } else {
            i0Var = t1.i0.f12003d;
        }
        t1.i0 i0Var2 = i0Var;
        if (!this.f4568c0) {
            x xVar2 = this.f4594u;
            if (xVar2.f4719c == 0) {
                int i10 = xVar2.f4717a.H;
                z2 = this.E;
                ((h0) jVar.f203x).f4642o = z2;
            }
        }
        this.E = z2;
        this.i.add(new y(i0Var2, Math.max(0L, j8), w1.b0.S(this.f4594u.f4721e, m())));
        u1.d dVar = this.f4594u.i;
        this.f4595v = dVar;
        dVar.a();
        m mVar = this.f4592s;
        if (mVar != null) {
            mVar.a(this.E);
        }
    }

    public final AudioTrack b(j jVar, t1.c cVar, int i, t1.o oVar, Context context) throws l {
        try {
            AudioTrack audioTrackA = this.f4589p.a(jVar, cVar, i, context);
            int state = audioTrackA.getState();
            if (state == 1) {
                return audioTrackA;
            }
            try {
                audioTrackA.release();
            } catch (Exception unused) {
            }
            throw new l(state, jVar.f4651b, jVar.f4652c, jVar.f4650a, jVar.f, oVar, jVar.f4654e, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e7) {
            throw new l(0, jVar.f4651b, jVar.f4652c, jVar.f4650a, jVar.f, oVar, jVar.f4654e, e7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.media.AudioTrack c(e2.x r9) throws e2.l {
        /*
            r8 = this;
            int r0 = r8.Y     // Catch: e2.l -> L3a
            int r1 = r8.f4590q     // Catch: e2.l -> L3a
            r2 = -1
            if (r1 == r2) goto L26
            android.content.Context r2 = r8.f4563a     // Catch: e2.l -> L1c
            if (r2 == 0) goto L26
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: e2.l -> L1c
            r4 = 34
            if (r3 < r4) goto L26
            android.content.Context r0 = r8.f4584l0     // Catch: e2.l -> L1c
            if (r0 != 0) goto L20
            android.content.Context r0 = e2.u.g(r2, r1)     // Catch: e2.l -> L1c
            r8.f4584l0 = r0     // Catch: e2.l -> L1c
            goto L20
        L1c:
            r0 = move-exception
            r9 = r0
            r2 = r8
            goto L3d
        L20:
            android.content.Context r0 = r8.f4584l0     // Catch: e2.l -> L1c
            r1 = 0
            r7 = r0
            r5 = r1
            goto L29
        L26:
            r1 = 0
            r5 = r0
            r7 = r1
        L29:
            e2.j r3 = r9.a()     // Catch: e2.l -> L3a
            t1.c r4 = r8.A     // Catch: e2.l -> L3a
            t1.o r6 = r9.f4717a     // Catch: e2.l -> L3a
            r2 = r8
            android.media.AudioTrack r9 = r2.b(r3, r4, r5, r6, r7)     // Catch: e2.l -> L37
            return r9
        L37:
            r0 = move-exception
        L38:
            r9 = r0
            goto L3d
        L3a:
            r0 = move-exception
            r2 = r8
            goto L38
        L3d:
            e2.m r0 = r2.f4592s
            if (r0 == 0) goto L44
            r0.l(r9)
        L44:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.d0.c(e2.x):android.media.AudioTrack");
    }

    public final void d(t1.o oVar, int[] iArr) throws k {
        int iIntValue;
        int iIntValue2;
        int i;
        int i10;
        u1.d dVar;
        boolean z2;
        int i11;
        boolean z10;
        int i12;
        int i13;
        int iH;
        int i14;
        s();
        String str = oVar.f12061n;
        int i15 = oVar.G;
        int i16 = oVar.F;
        int i17 = oVar.H;
        boolean zEquals = "audio/raw".equals(str);
        e0 e0Var = this.f4589p;
        if (zEquals) {
            w1.a.d(w1.b0.I(i17));
            int iQ = w1.b0.q(i17) * i16;
            y9.b0 b0Var = new y9.b0(4);
            b0Var.d(this.f4574g);
            b0Var.a(this.f4571e);
            b0Var.b((u1.g[]) this.f4565b.f202w);
            u1.d dVar2 = new u1.d(b0Var.g());
            if (dVar2.equals(this.f4595v)) {
                dVar2 = this.f4595v;
            }
            int i18 = oVar.I;
            int i19 = oVar.J;
            j0 j0Var = this.f4569d;
            j0Var.i = i18;
            j0Var.f4655j = i19;
            this.f4567c.i = iArr;
            u1.e eVar = new u1.e(i15, i16, i17);
            try {
                y9.f0 f0Var = dVar2.f12620a;
                if (eVar.equals(u1.e.f12624e)) {
                    throw new u1.f(eVar);
                }
                for (int i20 = 0; i20 < f0Var.size(); i20++) {
                    u1.g gVar = (u1.g) f0Var.get(i20);
                    u1.e eVarF = gVar.f(eVar);
                    if (gVar.a()) {
                        w1.a.j(!eVarF.equals(u1.e.f12624e));
                        eVar = eVarF;
                    }
                }
                int i21 = eVar.f12626b;
                int i22 = eVar.f12627c;
                int i23 = eVar.f12625a;
                e0Var.getClass();
                int iP = w1.b0.p(i21);
                int iQ2 = w1.b0.q(i22) * i21;
                i15 = i23;
                iIntValue2 = iP;
                i11 = 0;
                z10 = false;
                iIntValue = i22;
                i = iQ;
                i10 = iQ2;
                dVar = dVar2;
                z2 = false;
            } catch (u1.f e7) {
                throw new k(e7, oVar);
            }
        } else {
            u1.d dVar3 = new u1.d(z0.f14637z);
            f fVarJ = this.f4579j != 0 ? j(oVar) : f.f4610d;
            if (this.f4579j == 0 || !fVarJ.f4611a) {
                Pair pairD = this.f4597x.d(oVar, this.A);
                if (pairD == null) {
                    throw new k("Unable to configure passthrough for: " + oVar, oVar);
                }
                iIntValue = ((Integer) pairD.first).intValue();
                iIntValue2 = ((Integer) pairD.second).intValue();
                i = -1;
                i10 = -1;
                dVar = dVar3;
                z2 = false;
                i11 = 2;
                z10 = false;
            } else {
                str.getClass();
                int iD = t1.f0.d(str, oVar.f12058k);
                e0Var.getClass();
                int iP2 = w1.b0.p(i16);
                boolean z11 = fVarJ.f4612b;
                iIntValue2 = iP2;
                i11 = 1;
                z10 = true;
                dVar = dVar3;
                z2 = z11;
                iIntValue = iD;
                i = -1;
                i10 = -1;
            }
        }
        if (iIntValue == 0) {
            throw new k("Invalid output encoding (mode=" + i11 + ") for: " + oVar, oVar);
        }
        if (iIntValue2 == 0) {
            throw new k("Invalid output channel config (mode=" + i11 + ") for: " + oVar, oVar);
        }
        int i24 = oVar.f12057j;
        if ("audio/vnd.dts.hd;profile=lbr".equals(str) && i24 == -1) {
            i24 = 768000;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i15, iIntValue2, iIntValue);
        w1.a.j(minBufferSize != -2);
        int i25 = i10 != -1 ? i10 : 1;
        double d10 = z10 ? 8.0d : 1.0d;
        this.f4587n.getClass();
        if (i11 != 0) {
            if (i11 == 1) {
                i12 = i;
                int i26 = w2.b.i(iIntValue);
                w1.a.j(i26 != -2147483647);
                iH = z7.b.j((((long) 50000000) * ((long) i26)) / 1000000);
            } else {
                if (i11 != 2) {
                    throw new IllegalArgumentException();
                }
                int i27 = iIntValue == 5 ? 500000 : iIntValue == 8 ? 1000000 : 250000;
                if (i24 != -1) {
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    i14 = com.bumptech.glide.e.f(i24, 8);
                } else {
                    i14 = w2.b.i(iIntValue);
                    w1.a.j(i14 != -2147483647);
                }
                i12 = i;
                iH = z7.b.j((((long) i27) * ((long) i14)) / 1000000);
            }
            i13 = iIntValue2;
        } else {
            i12 = i;
            i13 = iIntValue2;
            long j8 = i15;
            long j9 = ((long) 250000) * j8;
            long j10 = i25;
            iH = w1.b0.h(minBufferSize * 4, z7.b.j((j9 * j10) / 1000000), z7.b.j(((((long) 750000) * j8) * j10) / 1000000));
        }
        this.f4573f0 = false;
        x xVar = new x(oVar, i12, i11, i10, i15, i13, iIntValue, (((Math.max(minBufferSize, (int) (((double) iH) * d10)) + i25) - 1) / i25) * i25, dVar, z10, z2, this.f4568c0);
        if (q()) {
            this.f4593t = xVar;
        } else {
            this.f4594u = xVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(long r13) throws e2.n {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.d0.e(long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f() throws e2.n {
        /*
            r6 = this;
            u1.d r0 = r6.f4595v
            boolean r0 = r0.d()
            r1 = -9223372036854775808
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L14
            r6.e(r1)
            java.nio.ByteBuffer r0 = r6.S
            if (r0 != 0) goto L44
            goto L43
        L14:
            u1.d r0 = r6.f4595v
            boolean r5 = r0.d()
            if (r5 == 0) goto L2e
            boolean r5 = r0.f12623d
            if (r5 == 0) goto L21
            goto L2e
        L21:
            r0.f12623d = r4
            java.util.ArrayList r0 = r0.f12621b
            java.lang.Object r0 = r0.get(r3)
            u1.g r0 = (u1.g) r0
            r0.d()
        L2e:
            r6.x(r1)
            u1.d r0 = r6.f4595v
            boolean r0 = r0.c()
            if (r0 == 0) goto L44
            java.nio.ByteBuffer r0 = r6.S
            if (r0 == 0) goto L43
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L44
        L43:
            return r4
        L44:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.d0.f():boolean");
    }

    public final void g() {
        a7.j jVar;
        if (q()) {
            this.H = 0L;
            this.I = 0L;
            this.J = 0L;
            this.K = 0L;
            this.f4575g0 = false;
            this.L = 0;
            this.C = new y(this.D, 0L, 0L);
            this.O = 0L;
            this.B = null;
            this.i.clear();
            this.Q = null;
            this.R = 0;
            this.S = null;
            this.U = false;
            this.T = false;
            this.V = false;
            this.F = null;
            this.G = 0;
            this.f4569d.f4660o = 0L;
            u1.d dVar = this.f4594u.i;
            this.f4595v = dVar;
            dVar.a();
            AudioTrack audioTrack = this.f4576h.f4683c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f4596w.pause();
            }
            if (r(this.f4596w)) {
                a7.j jVar2 = this.f4581k;
                jVar2.getClass();
                this.f4596w.unregisterStreamEventCallback((c0) jVar2.f203x);
                ((Handler) jVar2.f202w).removeCallbacksAndMessages(null);
            }
            j jVarA = this.f4594u.a();
            x xVar = this.f4593t;
            if (xVar != null) {
                this.f4594u = xVar;
                this.f4593t = null;
            }
            r rVar = this.f4576h;
            rVar.f();
            rVar.f4683c = null;
            rVar.f4685e = null;
            if (Build.VERSION.SDK_INT >= 24 && (jVar = this.f4599z) != null) {
                AudioTrack audioTrack2 = (AudioTrack) jVar.f202w;
                z zVar = (z) jVar.f204y;
                zVar.getClass();
                audioTrack2.removeOnRoutingChangedListener(zVar);
                jVar.f204y = null;
                this.f4599z = null;
            }
            AudioTrack audioTrack3 = this.f4596w;
            m mVar = this.f4592s;
            Handler handler = new Handler(Looper.myLooper());
            synchronized (f4561n0) {
                try {
                    if (o0 == null) {
                        int i = w1.b0.f13686a;
                        o0 = Executors.newSingleThreadScheduledExecutor(new w1.a0());
                    }
                    f4562p0++;
                    o0.schedule(new v(audioTrack3, mVar, handler, jVarA, 0), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f4596w = null;
        }
        a0 a0Var = this.f4585m;
        a0Var.f4549c = null;
        a0Var.f4547a = -9223372036854775807L;
        a0Var.f4548b = -9223372036854775807L;
        a0 a0Var2 = this.f4583l;
        a0Var2.f4549c = null;
        a0Var2.f4547a = -9223372036854775807L;
        a0Var2.f4548b = -9223372036854775807L;
        this.f4578i0 = 0L;
        this.f4580j0 = 0L;
        Handler handler2 = this.f4582k0;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    public final long h() {
        if (!q()) {
            return -9223372036854775807L;
        }
        AudioTrack audioTrack = this.f4596w;
        x xVar = this.f4594u;
        if (xVar.f4719c == 0) {
            return w1.b0.S(xVar.f4721e, audioTrack.getBufferSizeInFrames());
        }
        long bufferSizeInFrames = audioTrack.getBufferSizeInFrames();
        int i = w2.b.i(xVar.f4722g);
        w1.a.j(i != -2147483647);
        return w1.b0.U(bufferSizeInFrames, 1000000L, i, RoundingMode.DOWN);
    }

    public final long i() {
        ArrayDeque arrayDeque;
        long j8;
        if (!q() || this.N) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.f4576h.a(), w1.b0.S(this.f4594u.f4721e, m()));
        while (true) {
            arrayDeque = this.i;
            if (arrayDeque.isEmpty() || jMin < ((y) arrayDeque.getFirst()).f4729c) {
                break;
            }
            this.C = (y) arrayDeque.remove();
        }
        y yVar = this.C;
        long jU = jMin - yVar.f4729c;
        long jW = w1.b0.w(jU, yVar.f4727a.f12004a);
        boolean zIsEmpty = arrayDeque.isEmpty();
        a7.j jVar = this.f4565b;
        if (zIsEmpty) {
            u1.j jVar2 = (u1.j) jVar.f204y;
            if (jVar2.a()) {
                if (jVar2.f12668o >= 1024) {
                    long j9 = jVar2.f12667n;
                    u1.i iVar = jVar2.f12663j;
                    iVar.getClass();
                    long j10 = j9 - ((long) ((iVar.f12644k * iVar.f12637b) * 2));
                    int i = jVar2.f12662h.f12625a;
                    int i10 = jVar2.f12661g.f12625a;
                    jU = i == i10 ? w1.b0.U(jU, j10, jVar2.f12668o, RoundingMode.DOWN) : w1.b0.U(jU, j10 * ((long) i), jVar2.f12668o * ((long) i10), RoundingMode.DOWN);
                } else {
                    jU = (long) (((double) jVar2.f12658c) * jU);
                }
            }
            y yVar2 = this.C;
            j8 = yVar2.f4728b + jU;
            yVar2.f4730d = jU - jW;
        } else {
            y yVar3 = this.C;
            j8 = yVar3.f4728b + jW + yVar3.f4730d;
        }
        long j11 = ((h0) jVar.f203x).f4644q;
        long jS = w1.b0.S(this.f4594u.f4721e, j11) + j8;
        long j12 = this.f4578i0;
        if (j11 > j12) {
            long jS2 = w1.b0.S(this.f4594u.f4721e, j11 - j12);
            this.f4578i0 = j11;
            this.f4580j0 += jS2;
            if (this.f4582k0 == null) {
                this.f4582k0 = new Handler(Looper.myLooper());
            }
            this.f4582k0.removeCallbacksAndMessages(null);
            this.f4582k0.postDelayed(new androidx.emoji2.text.v(11, this), 100L);
        }
        return jS;
    }

    public final f j(t1.o oVar) {
        boolean zBooleanValue;
        if (this.f4573f0) {
            return f.f4610d;
        }
        t1.c cVar = this.A;
        sc.b bVar = this.f4588o;
        bVar.getClass();
        oVar.getClass();
        int i = oVar.G;
        cVar.getClass();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 29 || i == -1) {
            return f.f4610d;
        }
        Context context = (Context) bVar.f11786w;
        Boolean bool = (Boolean) bVar.f11787x;
        boolean z2 = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = u1.c.s(context).getParameters("offloadVariableRateSupported");
                bVar.f11787x = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                bVar.f11787x = Boolean.FALSE;
            }
            zBooleanValue = ((Boolean) bVar.f11787x).booleanValue();
        }
        String str = oVar.f12061n;
        str.getClass();
        int iD = t1.f0.d(str, oVar.f12058k);
        if (iD == 0 || i10 < w1.b0.o(iD)) {
            return f.f4610d;
        }
        int iP = w1.b0.p(oVar.F);
        if (iP == 0) {
            return f.f4610d;
        }
        try {
            AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(i).setChannelMask(iP).setEncoding(iD).build();
            if (i10 < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(audioFormatBuild, (AudioAttributes) cVar.a().f7546w)) {
                    return f.f4610d;
                }
                ab.b bVar2 = new ab.b();
                bVar2.f287a = true;
                bVar2.f289c = zBooleanValue;
                return bVar2.a();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatBuild, (AudioAttributes) cVar.a().f7546w);
            if (playbackOffloadSupport == 0) {
                return f.f4610d;
            }
            ab.b bVar3 = new ab.b();
            if (i10 > 32 && playbackOffloadSupport == 2) {
                z2 = true;
            }
            bVar3.f287a = true;
            bVar3.f288b = z2;
            bVar3.f289c = zBooleanValue;
            return bVar3.a();
        } catch (IllegalArgumentException unused) {
            return f.f4610d;
        }
    }

    public final int k(t1.o oVar) {
        s();
        String str = oVar.f12061n;
        int i = oVar.H;
        if ("audio/raw".equals(str)) {
            if (!w1.b0.I(i)) {
                u5.a.d(i, "Invalid PCM encoding: ", "DefaultAudioSink");
                return 0;
            }
            if (i != 2) {
                return 1;
            }
        } else if (this.f4597x.d(oVar, this.A) == null) {
            return 0;
        }
        return 2;
    }

    public final long l() {
        x xVar = this.f4594u;
        return xVar.f4719c == 0 ? this.H / ((long) xVar.f4718b) : this.I;
    }

    public final long m() {
        x xVar = this.f4594u;
        if (xVar.f4719c != 0) {
            return this.K;
        }
        long j8 = this.J;
        long j9 = xVar.f4720d;
        int i = w1.b0.f13686a;
        return ((j8 + j9) - 1) / j9;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x03b9, code lost:
    
        if (r15 == 0) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b3, code lost:
    
        if (p() == false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n(long r28, int r30, java.nio.ByteBuffer r31) throws e2.n, e2.l {
        /*
            Method dump skipped, instruction units count: 1218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.d0.n(long, int, java.nio.ByteBuffer):boolean");
    }

    public final boolean o() {
        if (!q()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && this.f4596w.isOffloadedPlayback() && this.V) {
            return false;
        }
        long jM = m();
        r rVar = this.f4576h;
        long jA = rVar.a();
        int i = rVar.f;
        int i10 = w1.b0.f13686a;
        return jM > w1.b0.U(jA, (long) i, 1000000L, RoundingMode.UP);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean p() throws e2.l {
        /*
            Method dump skipped, instruction units count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.d0.p():boolean");
    }

    public final boolean q() {
        return this.f4596w != null;
    }

    public final void s() {
        Context context;
        b bVar;
        Looper looperMyLooper = Looper.myLooper();
        boolean z2 = this.f4598y == null || this.f4577h0 == looperMyLooper;
        StringBuilder sb2 = new StringBuilder("DefaultAudioSink accessed on multiple threads: ");
        Looper looper = this.f4577h0;
        sb2.append(looper == null ? "null" : looper.getThread().getName());
        sb2.append(" and ");
        sb2.append(looperMyLooper != null ? looperMyLooper.getThread().getName() : "null");
        w1.a.i(sb2.toString(), z2);
        if (this.f4598y == null && (context = this.f4563a) != null) {
            this.f4577h0 = looperMyLooper;
            e eVar = new e(context, new d1(16, this), this.A, this.f4566b0);
            this.f4598y = eVar;
            Handler handler = (Handler) eVar.f4603d;
            Context context2 = (Context) eVar.f4601b;
            if (eVar.f4600a) {
                bVar = (b) eVar.f4606h;
                bVar.getClass();
            } else {
                eVar.f4600a = true;
                d dVar = (d) eVar.f4605g;
                if (dVar != null) {
                    dVar.f4558a.registerContentObserver(dVar.f4559b, false, dVar);
                }
                c cVar = (c) eVar.f4604e;
                if (cVar != null) {
                    u1.c.s(context2).registerAudioDeviceCallback(cVar, handler);
                }
                b bVarB = b.b(context2, context2.registerReceiver((com.bumptech.glide.manager.q) eVar.f, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), (t1.c) eVar.f4607j, (a9.g) eVar.i);
                eVar.f4606h = bVarB;
                bVar = bVarB;
            }
            this.f4597x = bVar;
        }
        this.f4597x.getClass();
    }

    public final void t() {
        this.W = false;
        if (q()) {
            r rVar = this.f4576h;
            rVar.f();
            if (rVar.f4702x == -9223372036854775807L) {
                q qVar = rVar.f4685e;
                qVar.getClass();
                qVar.a(0);
            }
            rVar.f4704z = rVar.b();
            if (!this.U || r(this.f4596w)) {
                this.f4596w.pause();
            }
        }
    }

    public final void u() {
        this.W = true;
        if (q()) {
            r rVar = this.f4576h;
            if (rVar.f4702x != -9223372036854775807L) {
                rVar.G.getClass();
                rVar.f4702x = w1.b0.M(SystemClock.elapsedRealtime());
            }
            rVar.f4688j = w1.b0.S(rVar.f, rVar.b());
            q qVar = rVar.f4685e;
            qVar.getClass();
            qVar.a(0);
            if (!this.U || r(this.f4596w)) {
                this.f4596w.play();
            }
        }
    }

    public final void v() {
        if (this.U) {
            return;
        }
        this.U = true;
        long jM = m();
        r rVar = this.f4576h;
        rVar.f4704z = rVar.b();
        rVar.G.getClass();
        rVar.f4702x = w1.b0.M(SystemClock.elapsedRealtime());
        rVar.A = jM;
        if (r(this.f4596w)) {
            this.V = false;
        }
        this.f4596w.stop();
        this.G = 0;
    }

    public final void w() {
        if (!this.T && q() && f()) {
            v();
            this.T = true;
        }
    }

    public final void x(long j8) throws n {
        ByteBuffer byteBuffer;
        e(j8);
        if (this.S != null) {
            return;
        }
        if (!this.f4595v.d()) {
            ByteBuffer byteBuffer2 = this.Q;
            if (byteBuffer2 != null) {
                D(byteBuffer2);
                e(j8);
                return;
            }
            return;
        }
        while (!this.f4595v.c()) {
            do {
                u1.d dVar = this.f4595v;
                if (dVar.d()) {
                    ByteBuffer byteBuffer3 = dVar.f12622c[dVar.b()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        dVar.e(u1.g.f12629a);
                        byteBuffer = dVar.f12622c[dVar.b()];
                    }
                } else {
                    byteBuffer = u1.g.f12629a;
                }
                if (byteBuffer.hasRemaining()) {
                    D(byteBuffer);
                    e(j8);
                } else {
                    ByteBuffer byteBuffer4 = this.Q;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    u1.d dVar2 = this.f4595v;
                    ByteBuffer byteBuffer5 = this.Q;
                    if (dVar2.d() && !dVar2.f12623d) {
                        dVar2.e(byteBuffer5);
                    }
                }
            } while (this.S == null);
            return;
        }
    }

    public final void y() {
        g();
        y9.c0 c0VarO = this.f4574g.listIterator(0);
        while (c0VarO.hasNext()) {
            ((u1.g) c0VarO.next()).reset();
        }
        this.f4571e.reset();
        this.f.reset();
        u1.d dVar = this.f4595v;
        if (dVar != null) {
            y9.f0 f0Var = dVar.f12620a;
            for (int i = 0; i < f0Var.size(); i++) {
                u1.g gVar = (u1.g) f0Var.get(i);
                gVar.flush();
                gVar.reset();
            }
            dVar.f12622c = new ByteBuffer[0];
            u1.e eVar = u1.e.f12624e;
            dVar.f12623d = false;
        }
        this.W = false;
        this.f4573f0 = false;
    }

    public final void z(t1.c cVar) {
        if (this.A.equals(cVar)) {
            return;
        }
        this.A = cVar;
        if (this.f4568c0) {
            return;
        }
        e eVar = this.f4598y;
        if (eVar != null) {
            eVar.f4607j = cVar;
            eVar.d(b.c((Context) eVar.f4601b, cVar, (a9.g) eVar.i));
        }
        g();
    }
}
