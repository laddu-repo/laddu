package w2;

import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import r1.p1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a extends a2.g {
    public final long P;
    public final int Q;
    public final s8.l R;
    public final s3.c S;
    public final y1.h T;
    public r1.q U;
    public r1.q V;
    public y1.e W;
    public y1.h X;
    public VideoDecoderOutputBuffer Y;
    public int Z;

    /* renamed from: a0, reason: collision with root package name */
    public Object f13561a0;

    /* renamed from: b0, reason: collision with root package name */
    public Surface f13562b0;

    /* renamed from: c0, reason: collision with root package name */
    public u f13563c0;

    /* renamed from: d0, reason: collision with root package name */
    public v f13564d0;

    /* renamed from: e0, reason: collision with root package name */
    public f2.i f13565e0;

    /* renamed from: f0, reason: collision with root package name */
    public f2.i f13566f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f13567g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f13568h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f13569i0;

    /* renamed from: j0, reason: collision with root package name */
    public long f13570j0;

    /* renamed from: k0, reason: collision with root package name */
    public long f13571k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f13572l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f13573m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f13574n0;
    public p1 o0;

    /* renamed from: p0, reason: collision with root package name */
    public long f13575p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f13576q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f13577r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f13578s0;

    /* renamed from: t0, reason: collision with root package name */
    public long f13579t0;

    /* renamed from: u0, reason: collision with root package name */
    public a2.h f13580u0;

    /* JADX WARN: Type inference failed for: r2v6, types: [a2.h, java.lang.Object] */
    public a(long j, Handler handler, e0 e0Var, int i6) {
        super(2);
        this.P = j;
        this.Q = i6;
        this.f13571k0 = -9223372036854775807L;
        this.S = new s3.c();
        this.T = new y1.h(0, 0);
        this.R = new s8.l(handler, e0Var);
        this.f13567g0 = 0;
        this.Z = -1;
        this.f13569i0 = 0;
        this.f13580u0 = new Object();
    }

    public abstract a2.i C(String str, r1.q qVar, r1.q qVar2);

    public abstract y1.e D(r1.q qVar);

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0101, code lost:
    
        if (r1 != false) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean E(long r19) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.a.E(long):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r0 == null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean F() {
        /*
            r8 = this;
            y1.e r0 = r8.W
            r1 = 0
            if (r0 == 0) goto L9e
            int r2 = r8.f13567g0
            r3 = 2
            if (r2 == r3) goto L9e
            boolean r2 = r8.f13573m0
            if (r2 == 0) goto L10
            goto L9e
        L10:
            y1.h r2 = r8.X
            if (r2 != 0) goto L20
            java.lang.Object r0 = r0.e()
            y1.h r0 = (y1.h) r0
            r8.X = r0
            if (r0 != 0) goto L20
            goto L9e
        L20:
            y1.h r0 = r8.X
            r0.getClass()
            int r2 = r8.f13567g0
            r4 = 0
            r5 = 1
            if (r2 != r5) goto L3c
            r2 = 4
            r0.setFlags(r2)
            y1.e r2 = r8.W
            r2.getClass()
            r2.f(r0)
            r8.X = r4
            r8.f13567g0 = r3
            return r1
        L3c:
            j4.b0 r2 = r8.f246z
            r2.i()
            int r3 = r8.w(r2, r0, r1)
            r6 = -5
            if (r3 == r6) goto L9a
            r2 = -4
            if (r3 == r2) goto L55
            r0 = -3
            if (r3 != r0) goto L4f
            goto L9e
        L4f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L55:
            boolean r2 = r0.isEndOfStream()
            if (r2 == 0) goto L68
            r8.f13573m0 = r5
            y1.e r2 = r8.W
            r2.getClass()
            r2.f(r0)
            r8.X = r4
            return r1
        L68:
            boolean r2 = r8.f13572l0
            if (r2 == 0) goto L7a
            long r2 = r0.B
            r1.q r6 = r8.U
            r6.getClass()
            s3.c r7 = r8.S
            r7.a(r2, r6)
            r8.f13572l0 = r1
        L7a:
            r0.d()
            r1.q r1 = r8.U
            r0.f14810x = r1
            y1.e r1 = r8.W
            r1.getClass()
            r1.f(r0)
            int r0 = r8.f13578s0
            int r0 = r0 + r5
            r8.f13578s0 = r0
            r8.f13568h0 = r5
            a2.h r0 = r8.f13580u0
            int r1 = r0.f252c
            int r1 = r1 + r5
            r0.f252c = r1
            r8.X = r4
            return r5
        L9a:
            r8.I(r2)
            return r5
        L9e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.a.F():boolean");
    }

    public final void G() {
        this.f13578s0 = 0;
        if (this.f13567g0 != 0) {
            J();
            H();
            return;
        }
        this.X = null;
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = this.Y;
        if (videoDecoderOutputBuffer != null) {
            videoDecoderOutputBuffer.release();
            this.Y = null;
        }
        y1.e eVar = this.W;
        eVar.getClass();
        eVar.flush();
        eVar.b(this.I);
        this.f13568h0 = false;
    }

    public final void H() {
        s8.l lVar = this.R;
        if (this.W == null) {
            f2.i iVar = this.f13566f0;
            r4.a.z(this.f13565e0, iVar);
            this.f13565e0 = iVar;
            if (iVar != null && iVar.f() == null && this.f13565e0.getError() == null) {
                return;
            }
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                r1.q qVar = this.U;
                qVar.getClass();
                y1.e D = D(qVar);
                this.W = D;
                ((y1.k) D).b(this.I);
                M(this.Z);
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                y1.e eVar = this.W;
                eVar.getClass();
                String name = eVar.getName();
                long j = elapsedRealtime2 - elapsedRealtime;
                Handler handler = (Handler) lVar.f12251y;
                if (handler != null) {
                    handler.post(new c0(lVar, name, elapsedRealtime2, j));
                }
                this.f13580u0.f250a++;
            } catch (OutOfMemoryError e10) {
                throw a(e10, this.U, false, 4001);
            } catch (y1.f e11) {
                u1.a.h("DecoderVideoRenderer", "Video codec error", e11);
                Handler handler2 = (Handler) lVar.f12251y;
                if (handler2 != null) {
                    handler2.post(new c0(lVar, e11, 1));
                }
                throw a(e11, this.U, false, 4001);
            }
        }
    }

    public final void I(j4.b0 b0Var) {
        a2.i C;
        this.f13572l0 = true;
        r1.q qVar = (r1.q) b0Var.f7159y;
        qVar.getClass();
        f2.i iVar = (f2.i) b0Var.f7158x;
        r4.a.z(this.f13566f0, iVar);
        this.f13566f0 = iVar;
        r1.q qVar2 = this.U;
        this.U = qVar;
        y1.e eVar = this.W;
        s8.l lVar = this.R;
        if (eVar == null) {
            H();
            r1.q qVar3 = this.U;
            qVar3.getClass();
            Handler handler = (Handler) lVar.f12251y;
            if (handler != null) {
                handler.post(new c0(lVar, qVar3, (a2.i) null));
                return;
            }
            return;
        }
        if (iVar != this.f13565e0) {
            String name = eVar.getName();
            qVar2.getClass();
            C = new a2.i(name, qVar2, qVar, 0, 128);
        } else {
            String name2 = eVar.getName();
            qVar2.getClass();
            C = C(name2, qVar2, qVar);
        }
        if (C.f268d == 0) {
            if (this.f13568h0) {
                this.f13567g0 = 1;
            } else {
                J();
                H();
            }
        }
        r1.q qVar4 = this.U;
        qVar4.getClass();
        Handler handler2 = (Handler) lVar.f12251y;
        if (handler2 != null) {
            handler2.post(new c0(lVar, qVar4, C));
        }
    }

    public final void J() {
        this.X = null;
        this.Y = null;
        this.f13567g0 = 0;
        this.f13568h0 = false;
        this.f13578s0 = 0;
        y1.e eVar = this.W;
        if (eVar != null) {
            this.f13580u0.f251b++;
            eVar.a();
            String name = this.W.getName();
            s8.l lVar = this.R;
            Handler handler = (Handler) lVar.f12251y;
            if (handler != null) {
                handler.post(new c0(lVar, name, 2));
            }
            this.W = null;
        }
        r4.a.z(this.f13565e0, null);
        this.f13565e0 = null;
    }

    public final void K(VideoDecoderOutputBuffer videoDecoderOutputBuffer, long j, r1.q qVar) {
        boolean z10;
        boolean z11;
        v vVar = this.f13564d0;
        if (vVar != null) {
            this.D.getClass();
            vVar.c(j, System.nanoTime(), qVar, null);
        }
        this.f13579t0 = u1.a0.Q(SystemClock.elapsedRealtime());
        int i6 = videoDecoderOutputBuffer.mode;
        if (i6 == 1 && this.f13562b0 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i6 == 0 && this.f13563c0 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 && !z10) {
            N(0, 1);
            videoDecoderOutputBuffer.release();
            return;
        }
        int i10 = videoDecoderOutputBuffer.width;
        int i11 = videoDecoderOutputBuffer.height;
        p1 p1Var = this.o0;
        s8.l lVar = this.R;
        if (p1Var == null || p1Var.f11630a != i10 || p1Var.f11631b != i11) {
            p1 p1Var2 = new p1(i10, i11);
            this.o0 = p1Var2;
            lVar.A(p1Var2);
        }
        if (z11) {
            u uVar = this.f13563c0;
            uVar.getClass();
            uVar.setOutputBuffer(videoDecoderOutputBuffer);
        } else {
            Surface surface = this.f13562b0;
            surface.getClass();
            L(videoDecoderOutputBuffer, surface);
        }
        this.f13577r0 = 0;
        this.f13580u0.f254e++;
        if (this.f13569i0 != 3) {
            this.f13569i0 = 3;
            Object obj = this.f13561a0;
            if (obj != null) {
                lVar.w(obj);
            }
        }
    }

    public abstract void L(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface);

    public abstract void M(int i6);

    public final void N(int i6, int i10) {
        int i11;
        a2.h hVar = this.f13580u0;
        hVar.f257h += i6;
        int i12 = i6 + i10;
        hVar.f256g += i12;
        this.f13576q0 += i12;
        int i13 = this.f13577r0 + i12;
        this.f13577r0 = i13;
        hVar.f258i = Math.max(i13, hVar.f258i);
        int i14 = this.Q;
        if (i14 > 0 && (i11 = this.f13576q0) >= i14 && i11 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.f13575p0;
            int i15 = this.f13576q0;
            s8.l lVar = this.R;
            Handler handler = (Handler) lVar.f12251y;
            if (handler != null) {
                handler.post(new c0(lVar, i15, j));
            }
            this.f13576q0 = 0;
            this.f13575p0 = elapsedRealtime;
        }
    }

    @Override // a2.g
    public final void b() {
        if (this.f13569i0 == 0) {
            this.f13569i0 = 1;
        }
    }

    @Override // a2.g, a2.u1
    public final void h(int i6, Object obj) {
        Object obj2;
        long j;
        if (i6 == 1) {
            if (obj instanceof Surface) {
                this.f13562b0 = (Surface) obj;
                this.f13563c0 = null;
                this.Z = 1;
            } else if (obj instanceof u) {
                this.f13562b0 = null;
                this.f13563c0 = (u) obj;
                this.Z = 0;
            } else {
                this.f13562b0 = null;
                this.f13563c0 = null;
                this.Z = -1;
                obj = null;
            }
            Object obj3 = this.f13561a0;
            s8.l lVar = this.R;
            if (obj3 != obj) {
                this.f13561a0 = obj;
                if (obj != null) {
                    if (this.W != null) {
                        M(this.Z);
                    }
                    p1 p1Var = this.o0;
                    if (p1Var != null) {
                        lVar.A(p1Var);
                    }
                    this.f13569i0 = Math.min(this.f13569i0, 1);
                    if (this.E == 2) {
                        long j10 = this.P;
                        if (j10 > 0) {
                            j = SystemClock.elapsedRealtime() + j10;
                        } else {
                            j = -9223372036854775807L;
                        }
                        this.f13571k0 = j;
                        return;
                    }
                    return;
                }
                this.o0 = null;
                this.f13569i0 = Math.min(this.f13569i0, 1);
                return;
            }
            if (obj != null) {
                p1 p1Var2 = this.o0;
                if (p1Var2 != null) {
                    lVar.A(p1Var2);
                }
                if (this.f13569i0 == 3 && (obj2 = this.f13561a0) != null) {
                    lVar.w(obj2);
                    return;
                }
                return;
            }
            return;
        }
        if (i6 == 7) {
            this.f13564d0 = (v) obj;
        }
    }

    @Override // a2.g
    public final boolean l() {
        return this.f13574n0;
    }

    @Override // a2.g
    public final boolean m() {
        if (this.U != null && ((n() || this.Y != null) && (this.f13569i0 == 3 || this.Z == -1))) {
            this.f13571k0 = -9223372036854775807L;
            return true;
        }
        if (this.f13571k0 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f13571k0) {
            return true;
        }
        this.f13571k0 = -9223372036854775807L;
        return false;
    }

    @Override // a2.g
    public final void o() {
        s8.l lVar = this.R;
        this.U = null;
        this.o0 = null;
        this.f13569i0 = Math.min(this.f13569i0, 0);
        try {
            r4.a.z(this.f13566f0, null);
            this.f13566f0 = null;
            J();
        } finally {
            lVar.g(this.f13580u0);
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [a2.h, java.lang.Object] */
    @Override // a2.g
    public final void p(boolean z10, boolean z11) {
        ?? obj = new Object();
        this.f13580u0 = obj;
        s8.l lVar = this.R;
        Handler handler = (Handler) lVar.f12251y;
        if (handler != null) {
            handler.post(new c0(lVar, (Object) obj, 5));
        }
        this.f13569i0 = z11 ? 1 : 0;
    }

    @Override // a2.g
    public final void q(boolean z10, long j) {
        this.f13573m0 = false;
        this.f13574n0 = false;
        this.f13569i0 = Math.min(this.f13569i0, 1);
        long j10 = -9223372036854775807L;
        this.f13570j0 = -9223372036854775807L;
        this.f13577r0 = 0;
        if (this.W != null) {
            G();
        }
        if (z10) {
            long j11 = this.P;
            if (j11 > 0) {
                j10 = SystemClock.elapsedRealtime() + j11;
            }
            this.f13571k0 = j10;
        } else {
            this.f13571k0 = -9223372036854775807L;
        }
        this.S.b();
    }

    @Override // a2.g
    public final void t() {
        this.f13576q0 = 0;
        this.f13575p0 = SystemClock.elapsedRealtime();
        this.f13579t0 = u1.a0.Q(SystemClock.elapsedRealtime());
    }

    @Override // a2.g
    public final void u() {
        this.f13571k0 = -9223372036854775807L;
        if (this.f13576q0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.f13575p0;
            int i6 = this.f13576q0;
            s8.l lVar = this.R;
            Handler handler = (Handler) lVar.f12251y;
            if (handler != null) {
                handler.post(new c0(lVar, i6, j));
            }
            this.f13576q0 = 0;
            this.f13575p0 = elapsedRealtime;
        }
    }

    @Override // a2.g
    public final void x(long j, long j10) {
        if (!this.f13574n0) {
            if (this.U == null) {
                j4.b0 b0Var = this.f246z;
                b0Var.i();
                this.T.clear();
                int w10 = w(b0Var, this.T, 2);
                if (w10 == -5) {
                    I(b0Var);
                } else {
                    if (w10 == -4) {
                        u1.c.g(this.T.isEndOfStream());
                        this.f13573m0 = true;
                        this.f13574n0 = true;
                        return;
                    }
                    return;
                }
            }
            H();
            if (this.W != null) {
                try {
                    Trace.beginSection("drainAndFeed");
                    do {
                    } while (E(j));
                    do {
                    } while (F());
                    Trace.endSection();
                    synchronized (this.f13580u0) {
                    }
                } catch (y1.f e10) {
                    u1.a.h("DecoderVideoRenderer", "Video codec error", e10);
                    s8.l lVar = this.R;
                    Handler handler = (Handler) lVar.f12251y;
                    if (handler != null) {
                        handler.post(new c0(lVar, e10, 1));
                    }
                    throw a(e10, this.U, false, 4003);
                }
            }
        }
    }

    @Override // a2.g
    public final void v(r1.q[] qVarArr, long j, long j10, q2.c0 c0Var) {
    }
}
