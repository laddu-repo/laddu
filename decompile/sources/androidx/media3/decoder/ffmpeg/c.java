package androidx.media3.decoder.ffmpeg;

import a2.b1;
import a2.g;
import a2.y1;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import c2.d0;
import c2.i0;
import c2.m;
import c2.o;
import c2.s;
import c2.t;
import f2.i;
import j4.b0;
import q2.c0;
import r1.k0;
import r1.o0;
import r1.p;
import r1.q;
import u1.a0;
import u1.v;
import y1.f;
import y1.h;
import y1.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c extends g implements b1 {
    public final b0 P;
    public final t Q;
    public final h R;
    public a2.h S;
    public q T;
    public int U;
    public int V;
    public boolean W;
    public y1.e X;
    public h Y;
    public SimpleDecoderOutputBuffer Z;

    /* renamed from: a0, reason: collision with root package name */
    public i f1023a0;

    /* renamed from: b0, reason: collision with root package name */
    public i f1024b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f1025c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f1026d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f1027e0;

    /* renamed from: f0, reason: collision with root package name */
    public long f1028f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f1029g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f1030h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f1031i0;

    /* renamed from: j0, reason: collision with root package name */
    public long f1032j0;

    /* renamed from: k0, reason: collision with root package name */
    public final long[] f1033k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f1034l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f1035m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f1036n0;
    public long o0;

    /* renamed from: p0, reason: collision with root package name */
    public long f1037p0;

    /* renamed from: q0, reason: collision with root package name */
    public long f1038q0;

    public c(Handler handler, m mVar, t tVar) {
        super(1);
        this.P = new b0(handler, mVar);
        this.Q = tVar;
        ((i0) tVar).f1849t = new lc.c(this);
        this.R = new h(0, 0);
        this.f1025c0 = 0;
        this.f1027e0 = true;
        I(-9223372036854775807L);
        this.f1033k0 = new long[10];
        this.o0 = -9223372036854775807L;
        this.f1037p0 = -9223372036854775807L;
        this.f1038q0 = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (((c2.i0) r4).F(u1.a0.C(4, r2, r1)) == false) goto L21;
     */
    @Override // a2.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A(r1.q r8) {
        /*
            r7 = this;
            java.lang.String r0 = r8.f11670n
            int r1 = r8.G
            int r2 = r8.F
            boolean r0 = r1.k0.k(r0)
            r3 = 0
            if (r0 != 0) goto L12
            int r8 = r4.a.d(r3, r3, r3, r3)
            return r8
        L12:
            java.lang.String r0 = r8.f11670n
            r0.getClass()
            androidx.media3.decoder.ffmpeg.e r4 = androidx.media3.decoder.ffmpeg.FfmpegLibrary.f1019a
            boolean r4 = r4.a()
            r5 = 2
            if (r4 == 0) goto L52
            boolean r4 = r1.k0.k(r0)
            if (r4 != 0) goto L27
            goto L52
        L27:
            boolean r0 = androidx.media3.decoder.ffmpeg.FfmpegLibrary.d(r0)
            if (r0 == 0) goto L50
            r1.q r0 = u1.a0.C(r5, r2, r1)
            c2.t r4 = r7.Q
            r6 = r4
            c2.i0 r6 = (c2.i0) r6
            boolean r0 = r6.F(r0)
            r6 = 4
            if (r0 != 0) goto L4a
            r1.q r0 = u1.a0.C(r6, r2, r1)
            c2.i0 r4 = (c2.i0) r4
            boolean r0 = r4.F(r0)
            if (r0 != 0) goto L4a
            goto L50
        L4a:
            int r8 = r8.O
            if (r8 == 0) goto L53
            r6 = 2
            goto L53
        L50:
            r6 = 1
            goto L53
        L52:
            r6 = 0
        L53:
            if (r6 > r5) goto L5a
            int r8 = r4.a.d(r6, r3, r3, r3)
            return r8
        L5a:
            r8 = r6 | 168(0xa8, float:2.35E-43)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.decoder.ffmpeg.c.A(r1.q):int");
    }

    @Override // a2.g
    public final int B() {
        return 8;
    }

    public final y1.e C(q qVar) {
        Trace.beginSection("createFfmpegAudioDecoder");
        int i6 = qVar.f11671o;
        int i10 = qVar.G;
        int i11 = qVar.F;
        if (i6 == -1) {
            i6 = 5760;
        }
        q C = a0.C(2, i11, i10);
        t tVar = this.Q;
        boolean z10 = true;
        if (((i0) tVar).F(C)) {
            if (((i0) tVar).k(a0.C(4, i11, i10)) != 2) {
                z10 = false;
            } else {
                z10 = true ^ "audio/ac3".equals(qVar.f11670n);
            }
        }
        FfmpegAudioDecoder ffmpegAudioDecoder = new FfmpegAudioDecoder(i6, qVar, z10);
        Trace.endSection();
        return ffmpegAudioDecoder;
    }

    public final boolean D() {
        if (this.Z == null) {
            SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = (SimpleDecoderOutputBuffer) ((k) this.X).d();
            this.Z = simpleDecoderOutputBuffer;
            if (simpleDecoderOutputBuffer == null) {
                return false;
            }
            int i6 = simpleDecoderOutputBuffer.skippedOutputBufferCount;
            if (i6 > 0) {
                this.S.f255f += i6;
                ((i0) this.Q).N = true;
            }
            if (simpleDecoderOutputBuffer.isFirstSample()) {
                long[] jArr = this.f1033k0;
                ((i0) this.Q).N = true;
                if (this.f1034l0 != 0) {
                    I(jArr[0]);
                    int i10 = this.f1034l0 - 1;
                    this.f1034l0 = i10;
                    System.arraycopy(jArr, 1, jArr, 0, i10);
                }
            }
        }
        if (this.Z.isEndOfStream()) {
            if (this.f1025c0 == 2) {
                H();
                F();
                this.f1027e0 = true;
                return false;
            }
            this.Z.release();
            this.Z = null;
            try {
                this.f1031i0 = true;
                ((i0) this.Q).w();
                this.f1038q0 = this.f1037p0;
                return false;
            } catch (s e10) {
                throw a(e10, e10.f1918z, e10.f1917y, 5002);
            }
        }
        this.f1038q0 = -9223372036854775807L;
        if (this.f1027e0) {
            FfmpegAudioDecoder ffmpegAudioDecoder = (FfmpegAudioDecoder) this.X;
            ffmpegAudioDecoder.getClass();
            p pVar = new p();
            pVar.f11611m = k0.p("audio/raw");
            pVar.E = ffmpegAudioDecoder.f1017u;
            pVar.F = ffmpegAudioDecoder.f1018v;
            pVar.G = ffmpegAudioDecoder.f1014q;
            p a10 = new q(pVar).a();
            a10.H = this.U;
            a10.I = this.V;
            q qVar = this.T;
            a10.f11609k = qVar.f11668l;
            a10.f11600a = qVar.f11658a;
            a10.f11601b = qVar.f11659b;
            a10.f11602c = db.k0.k(qVar.f11660c);
            q qVar2 = this.T;
            a10.f11603d = qVar2.f11661d;
            a10.f11604e = qVar2.f11662e;
            a10.f11605f = qVar2.f11663f;
            ((i0) this.Q).d(new q(a10), null);
            this.f1027e0 = false;
        }
        t tVar = this.Q;
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer2 = this.Z;
        if (((i0) tVar).n(simpleDecoderOutputBuffer2.timeUs, 1, simpleDecoderOutputBuffer2.f1009y)) {
            this.S.f254e++;
            this.Z.release();
            this.Z = null;
            return true;
        }
        this.f1038q0 = this.Z.timeUs;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r0 == null) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean E() {
        /*
            r6 = this;
            y1.e r0 = r6.X
            r1 = 0
            if (r0 == 0) goto Lcb
            int r2 = r6.f1025c0
            r3 = 2
            if (r2 == r3) goto Lcb
            boolean r2 = r6.f1030h0
            if (r2 == 0) goto L10
            goto Lcb
        L10:
            y1.h r2 = r6.Y
            if (r2 != 0) goto L22
            y1.k r0 = (y1.k) r0
            java.lang.Object r0 = r0.e()
            y1.h r0 = (y1.h) r0
            r6.Y = r0
            if (r0 != 0) goto L22
            goto Lcb
        L22:
            int r0 = r6.f1025c0
            r2 = 0
            r4 = 1
            if (r0 != r4) goto L3f
            y1.h r0 = r6.Y
            r4 = 4
            r0.setFlags(r4)
            y1.e r0 = r6.X
            y1.h r4 = r6.Y
            y1.k r0 = (y1.k) r0
            r0.getClass()
            r0.f(r4)
            r6.Y = r2
            r6.f1025c0 = r3
            return r1
        L3f:
            j4.b0 r0 = r6.f246z
            r0.i()
            y1.h r3 = r6.Y
            int r3 = r6.w(r0, r3, r1)
            r5 = -5
            if (r3 == r5) goto Lc7
            r0 = -4
            if (r3 == r0) goto L64
            r0 = -3
            if (r3 != r0) goto L5e
            boolean r0 = r6.k()
            if (r0 == 0) goto Lcb
            long r2 = r6.o0
            r6.f1037p0 = r2
            return r1
        L5e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L64:
            y1.h r0 = r6.Y
            boolean r0 = r0.isEndOfStream()
            if (r0 == 0) goto L81
            r6.f1030h0 = r4
            long r3 = r6.o0
            r6.f1037p0 = r3
            y1.e r0 = r6.X
            y1.h r3 = r6.Y
            y1.k r0 = (y1.k) r0
            r0.getClass()
            r0.f(r3)
            r6.Y = r2
            return r1
        L81:
            boolean r0 = r6.W
            if (r0 != 0) goto L8e
            r6.W = r4
            y1.h r0 = r6.Y
            r1 = 134217728(0x8000000, float:3.85186E-34)
            r0.addFlag(r1)
        L8e:
            y1.h r0 = r6.Y
            long r0 = r0.B
            r6.o0 = r0
            boolean r0 = r6.k()
            if (r0 != 0) goto La2
            y1.h r0 = r6.Y
            boolean r0 = r0.isLastSample()
            if (r0 == 0) goto La6
        La2:
            long r0 = r6.o0
            r6.f1037p0 = r0
        La6:
            y1.h r0 = r6.Y
            r0.d()
            y1.h r0 = r6.Y
            r1.q r1 = r6.T
            r0.f14810x = r1
            y1.e r1 = r6.X
            y1.k r1 = (y1.k) r1
            r1.getClass()
            r1.f(r0)
            r6.f1026d0 = r4
            a2.h r0 = r6.S
            int r1 = r0.f252c
            int r1 = r1 + r4
            r0.f252c = r1
            r6.Y = r2
            return r4
        Lc7:
            r6.G(r0)
            return r4
        Lcb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.decoder.ffmpeg.c.E():boolean");
    }

    public final void F() {
        b0 b0Var = this.P;
        if (this.X == null) {
            i iVar = this.f1024b0;
            r4.a.z(this.f1023a0, iVar);
            this.f1023a0 = iVar;
            if (iVar != null && iVar.f() == null && this.f1023a0.getError() == null) {
                return;
            }
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Trace.beginSection("createAudioDecoder");
                y1.e C = C(this.T);
                this.X = C;
                ((k) C).b(this.I);
                Trace.endSection();
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                String name = ((FfmpegAudioDecoder) this.X).getName();
                long j = elapsedRealtime2 - elapsedRealtime;
                Handler handler = (Handler) b0Var.f7158x;
                if (handler != null) {
                    handler.post(new c2.k(b0Var, name, elapsedRealtime2, j));
                }
                this.S.f250a++;
            } catch (OutOfMemoryError e10) {
                throw a(e10, this.T, false, 4001);
            } catch (f e11) {
                u1.a.h("DecoderAudioRenderer", "Audio codec error", e11);
                Handler handler2 = (Handler) b0Var.f7158x;
                if (handler2 != null) {
                    handler2.post(new c2.k(b0Var, e11, 0));
                }
                throw a(e11, this.T, false, 4001);
            }
        }
    }

    public final void G(b0 b0Var) {
        a2.i iVar;
        q qVar = (q) b0Var.f7159y;
        qVar.getClass();
        i iVar2 = (i) b0Var.f7158x;
        r4.a.z(this.f1024b0, iVar2);
        this.f1024b0 = iVar2;
        q qVar2 = this.T;
        this.T = qVar;
        this.U = qVar.I;
        this.V = qVar.J;
        y1.e eVar = this.X;
        b0 b0Var2 = this.P;
        if (eVar == null) {
            F();
            q qVar3 = this.T;
            Handler handler = (Handler) b0Var2.f7158x;
            if (handler != null) {
                handler.post(new c2.k(b0Var2, qVar3, (a2.i) null));
                return;
            }
            return;
        }
        if (iVar2 != this.f1023a0) {
            iVar = new a2.i(((FfmpegAudioDecoder) eVar).getName(), qVar2, qVar, 0, 128);
        } else {
            iVar = new a2.i(((FfmpegAudioDecoder) eVar).getName(), qVar2, qVar, 0, 1);
        }
        if (iVar.f268d == 0) {
            if (this.f1026d0) {
                this.f1025c0 = 1;
            } else {
                H();
                F();
                this.f1027e0 = true;
            }
        }
        q qVar4 = this.T;
        Handler handler2 = (Handler) b0Var2.f7158x;
        if (handler2 != null) {
            handler2.post(new c2.k(b0Var2, qVar4, iVar));
        }
    }

    public final void H() {
        this.Y = null;
        this.Z = null;
        this.f1025c0 = 0;
        this.f1026d0 = false;
        this.o0 = -9223372036854775807L;
        this.f1037p0 = -9223372036854775807L;
        y1.e eVar = this.X;
        if (eVar != null) {
            this.S.f251b++;
            ((FfmpegAudioDecoder) eVar).a();
            String name = ((FfmpegAudioDecoder) this.X).getName();
            b0 b0Var = this.P;
            Handler handler = (Handler) b0Var.f7158x;
            if (handler != null) {
                handler.post(new c2.k(b0Var, name, 3));
            }
            this.X = null;
        }
        r4.a.z(this.f1023a0, null);
        this.f1023a0 = null;
    }

    public final void I(long j) {
        this.f1032j0 = j;
        if (j != -9223372036854775807L) {
            this.Q.getClass();
        }
    }

    public final void J() {
        l();
        long i6 = ((i0) this.Q).i();
        if (i6 != Long.MIN_VALUE) {
            if (!this.f1029g0) {
                i6 = Math.max(this.f1028f0, i6);
            }
            this.f1028f0 = i6;
            this.f1029g0 = false;
        }
    }

    @Override // a2.g
    public final long c(long j, long j10) {
        boolean z10;
        float f3;
        if (this.f1038q0 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.f1036n0) {
            if (z10 || this.f1031i0) {
                return 1000000L;
            }
        } else {
            long h4 = ((i0) this.Q).h();
            if (z10 && h4 != -9223372036854775807L) {
                float min = (float) Math.min(h4, this.f1038q0 - j);
                if (d() != null) {
                    f3 = d().f11596a;
                } else {
                    f3 = 1.0f;
                }
                this.D.getClass();
                return Math.max(10000L, ((min / f3) / 2.0f) - (a0.Q(SystemClock.elapsedRealtime()) - j10));
            }
        }
        return 10000L;
    }

    @Override // a2.b1
    public final o0 d() {
        return ((i0) this.Q).E;
    }

    @Override // a2.b1
    public final void e(o0 o0Var) {
        ((i0) this.Q).E(o0Var);
    }

    @Override // a2.b1
    public final long f() {
        if (this.E == 2) {
            J();
        }
        return this.f1028f0;
    }

    @Override // a2.b1
    public final boolean g() {
        boolean z10 = this.f1035m0;
        this.f1035m0 = false;
        return z10;
    }

    @Override // a2.g, a2.u1
    public final void h(int i6, Object obj) {
        k7.d dVar;
        o0 o0Var;
        t tVar = this.Q;
        if (i6 != 2) {
            if (i6 != 3) {
                if (i6 != 6) {
                    if (i6 != 12) {
                        if (i6 != 9) {
                            if (i6 == 10) {
                                ((i0) tVar).A(((Integer) obj).intValue());
                                return;
                            }
                            return;
                        }
                        i0 i0Var = (i0) tVar;
                        i0Var.F = ((Boolean) obj).booleanValue();
                        if (i0Var.G()) {
                            o0Var = o0.f11593d;
                        } else {
                            o0Var = i0Var.E;
                        }
                        d0 d0Var = new d0(o0Var, -9223372036854775807L, -9223372036854775807L);
                        if (i0Var.q()) {
                            i0Var.C = d0Var;
                            return;
                        } else {
                            i0Var.D = d0Var;
                            return;
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 23) {
                        AudioDeviceInfo f3 = android.support.v4.media.c.f(obj);
                        i0 i0Var2 = (i0) tVar;
                        AudioDeviceInfo audioDeviceInfo = null;
                        if (f3 == null) {
                            dVar = null;
                        } else {
                            i0Var2.getClass();
                            dVar = new k7.d(f3, 2);
                        }
                        i0Var2.f1823c0 = dVar;
                        c2.h hVar = i0Var2.f1855z;
                        if (hVar != null) {
                            hVar.b(f3);
                        }
                        AudioTrack audioTrack = i0Var2.f1853x;
                        if (audioTrack != null) {
                            k7.d dVar2 = i0Var2.f1823c0;
                            if (dVar2 != null) {
                                audioDeviceInfo = (AudioDeviceInfo) dVar2.f7747y;
                            }
                            audioTrack.setPreferredDevice(audioDeviceInfo);
                            return;
                        }
                        return;
                    }
                    return;
                }
                ((i0) tVar).C((r1.e) obj);
                return;
            }
            ((i0) tVar).z((r1.d) obj);
            return;
        }
        float floatValue = ((Float) obj).floatValue();
        i0 i0Var3 = (i0) tVar;
        if (i0Var3.Q != floatValue) {
            i0Var3.Q = floatValue;
            if (i0Var3.q()) {
                i0Var3.f1853x.setVolume(i0Var3.Q);
            }
        }
    }

    @Override // a2.g
    public final String j() {
        return "FfmpegAudioRenderer";
    }

    @Override // a2.g
    public final boolean l() {
        if (this.f1031i0) {
            i0 i0Var = (i0) this.Q;
            if (i0Var.q()) {
                if (i0Var.U && !i0Var.o()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // a2.g
    public final boolean m() {
        if (!((i0) this.Q).o()) {
            if (this.T != null) {
                if (!n() && this.Z == null) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // a2.g
    public final void o() {
        b0 b0Var = this.P;
        this.T = null;
        this.f1027e0 = true;
        I(-9223372036854775807L);
        this.f1035m0 = false;
        this.f1038q0 = -9223372036854775807L;
        try {
            r4.a.z(this.f1024b0, null);
            this.f1024b0 = null;
            H();
            ((i0) this.Q).y();
        } finally {
            b0Var.k(this.S);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [a2.h, java.lang.Object] */
    @Override // a2.g
    public final void p(boolean z10, boolean z11) {
        ?? obj = new Object();
        this.S = obj;
        b0 b0Var = this.P;
        Handler handler = (Handler) b0Var.f7158x;
        if (handler != null) {
            handler.post(new c2.k(b0Var, (Object) obj, 4));
        }
        y1 y1Var = this.A;
        y1Var.getClass();
        boolean z12 = y1Var.f505b;
        t tVar = this.Q;
        if (z12) {
            i0 i0Var = (i0) tVar;
            u1.c.g(i0Var.Y);
            if (!i0Var.f1825d0) {
                i0Var.f1825d0 = true;
                i0Var.g();
            }
        } else {
            i0 i0Var2 = (i0) tVar;
            if (i0Var2.f1825d0) {
                i0Var2.f1825d0 = false;
                i0Var2.g();
            }
        }
        b2.m mVar = this.C;
        mVar.getClass();
        i0 i0Var3 = (i0) tVar;
        i0Var3.s = mVar;
        v vVar = this.D;
        vVar.getClass();
        i0Var3.f1832h.I = vVar;
    }

    @Override // a2.g
    public final void q(boolean z10, long j) {
        ((i0) this.Q).g();
        this.f1028f0 = j;
        this.f1038q0 = -9223372036854775807L;
        this.f1035m0 = false;
        this.f1029g0 = true;
        this.f1030h0 = false;
        this.f1031i0 = false;
        if (this.X != null) {
            if (this.f1025c0 != 0) {
                H();
                F();
                return;
            }
            this.Y = null;
            SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = this.Z;
            if (simpleDecoderOutputBuffer != null) {
                simpleDecoderOutputBuffer.release();
                this.Z = null;
            }
            y1.e eVar = this.X;
            eVar.getClass();
            k kVar = (k) eVar;
            kVar.flush();
            kVar.b(this.I);
            this.f1026d0 = false;
        }
    }

    @Override // a2.g
    public final void t() {
        ((i0) this.Q).u();
        this.f1036n0 = true;
    }

    @Override // a2.g
    public final void u() {
        J();
        ((i0) this.Q).t();
        this.f1036n0 = false;
    }

    @Override // a2.g
    public final void v(q[] qVarArr, long j, long j10, c0 c0Var) {
        this.W = false;
        if (this.f1032j0 == -9223372036854775807L) {
            I(j10);
            return;
        }
        int i6 = this.f1034l0;
        long[] jArr = this.f1033k0;
        if (i6 == jArr.length) {
            u1.a.p("DecoderAudioRenderer", "Too many stream changes, so dropping offset: " + jArr[this.f1034l0 - 1]);
        } else {
            this.f1034l0 = i6 + 1;
        }
        jArr[this.f1034l0 - 1] = j10;
    }

    @Override // a2.g
    public final void x(long j, long j10) {
        if (this.f1031i0) {
            try {
                ((i0) this.Q).w();
                this.f1038q0 = this.f1037p0;
                return;
            } catch (s e10) {
                throw a(e10, e10.f1918z, e10.f1917y, 5002);
            }
        }
        if (this.T == null) {
            b0 b0Var = this.f246z;
            b0Var.i();
            this.R.clear();
            int w10 = w(b0Var, this.R, 2);
            if (w10 == -5) {
                G(b0Var);
            } else {
                if (w10 == -4) {
                    u1.c.g(this.R.isEndOfStream());
                    this.f1030h0 = true;
                    try {
                        this.f1031i0 = true;
                        ((i0) this.Q).w();
                        this.f1038q0 = this.f1037p0;
                        return;
                    } catch (s e11) {
                        throw a(e11, null, false, 5002);
                    }
                }
                return;
            }
        }
        F();
        if (this.X != null) {
            try {
                Trace.beginSection("drainAndFeed");
                do {
                } while (D());
                do {
                } while (E());
                Trace.endSection();
                synchronized (this.S) {
                }
            } catch (o e12) {
                throw a(e12, e12.f1906x, false, 5001);
            } catch (c2.p e13) {
                throw a(e13, e13.f1915z, e13.f1914y, 5001);
            } catch (s e14) {
                throw a(e14, e14.f1918z, e14.f1917y, 5002);
            } catch (f e15) {
                u1.a.h("DecoderAudioRenderer", "Audio codec error", e15);
                b0 b0Var2 = this.P;
                Handler handler = (Handler) b0Var2.f7158x;
                if (handler != null) {
                    handler.post(new c2.k(b0Var2, e15, 0));
                }
                throw a(e15, this.T, false, 4003);
            }
        }
    }

    @Override // a2.g
    public final b1 i() {
        return this;
    }
}
