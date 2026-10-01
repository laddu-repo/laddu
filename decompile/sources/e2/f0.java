package e2;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.LoudnessCodecController;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.decoder.DecoderInputBuffer;
import c2.m0;
import c2.r1;
import c2.w0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashSet;
import java.util.Objects;
import k8.k2;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends l2.s implements w0 {
    public final Context c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public final k2 f4614d1;
    public final d0 e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public final hd.a f4615f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public int f4616g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public boolean f4617h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public boolean f4618i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public t1.o f4619j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public t1.o f4620k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public long f4621l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public boolean f4622m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public boolean f4623n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public boolean f4624o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public int f4625p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public boolean f4626q1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public long f4627r1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Context context, l2.k kVar, boolean z2, Handler handler, c2.g0 g0Var, d0 d0Var) {
        super(1, kVar, z2, 44100.0f);
        hd.a aVar = Build.VERSION.SDK_INT >= 35 ? new hd.a(16) : null;
        this.c1 = context.getApplicationContext();
        this.e1 = d0Var;
        this.f4615f1 = aVar;
        this.f4625p1 = -1000;
        this.f4614d1 = new k2(handler, g0Var);
        this.f4627r1 = -9223372036854775807L;
        d0Var.f4592s = new a9.g(12, this);
    }

    public final void A0() {
        l();
        long jI = this.e1.i();
        if (jI != Long.MIN_VALUE) {
            if (!this.f4622m1) {
                jI = Math.max(this.f4621l1, jI);
            }
            this.f4621l1 = jI;
            this.f4622m1 = false;
        }
    }

    @Override // l2.s
    public final c2.h D(l2.o oVar, t1.o oVar2, t1.o oVar3) {
        c2.h hVarB = oVar.b(oVar2, oVar3);
        int i = hVarB.f1753e;
        if (this.f8121b0 == null && t0(oVar3)) {
            i |= 32768;
        }
        if (z0(oVar, oVar3) > this.f4616g1) {
            i |= 64;
        }
        int i10 = i;
        return new c2.h(oVar.f8099a, oVar2, oVar3, i10 != 0 ? 0 : hVarB.f1752d, i10);
    }

    @Override // l2.s
    public final float M(float f, t1.o oVar, t1.o[] oVarArr) {
        int iMax = -1;
        for (t1.o oVar2 : oVarArr) {
            int i = oVar2.G;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    @Override // l2.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList N(l2.j r4, t1.o r5, boolean r6) {
        /*
            r3 = this;
            java.lang.String r0 = r5.f12061n
            r1 = 0
            if (r0 != 0) goto L8
            y9.z0 r4 = y9.z0.f14637z
            goto L2f
        L8:
            e2.d0 r0 = r3.e1
            boolean r0 = r0.F(r5)
            if (r0 == 0) goto L2b
            java.lang.String r0 = "audio/raw"
            java.util.List r0 = l2.y.d(r0, r1, r1)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L1e
            r0 = 0
            goto L24
        L1e:
            java.lang.Object r0 = r0.get(r1)
            l2.o r0 = (l2.o) r0
        L24:
            if (r0 == 0) goto L2b
            y9.z0 r4 = y9.f0.q(r0)
            goto L2f
        L2b:
            y9.z0 r4 = l2.y.f(r4, r5, r6, r1)
        L2f:
            java.util.HashMap r6 = l2.y.f8150a
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r4)
            androidx.fragment.app.d1 r4 = new androidx.fragment.app.d1
            r0 = 27
            r4.<init>(r0, r5)
            l2.t r5 = new l2.t
            r5.<init>(r1, r4)
            java.util.Collections.sort(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.f0.N(l2.j, t1.o, boolean):java.util.ArrayList");
    }

    @Override // l2.s
    public final long O(long j8, long j9) {
        boolean z2 = this.f4627r1 != -9223372036854775807L;
        if (this.f4626q1) {
            d0 d0Var = this.e1;
            long jH = d0Var.h();
            if (z2 && jH != -9223372036854775807L) {
                float fMin = Math.min(jH, this.f4627r1 - j8);
                t1.i0 i0Var = d0Var.D;
                float f = i0Var != null ? i0Var.f12004a : 1.0f;
                this.B.getClass();
                return Math.max(10000L, ((long) ((fMin / f) / 2.0f)) - (w1.b0.M(SystemClock.elapsedRealtime()) - j9));
            }
        } else if (z2 || this.P0) {
            return 1000000L;
        }
        return 10000L;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d5  */
    @Override // l2.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.mb P(l2.o r13, t1.o r14, android.media.MediaCrypto r15, float r16) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.f0.P(l2.o, t1.o, android.media.MediaCrypto, float):com.google.android.gms.internal.measurement.mb");
    }

    @Override // l2.s
    public final void Q(DecoderInputBuffer decoderInputBuffer) {
        t1.o oVar;
        x xVar;
        if (Build.VERSION.SDK_INT < 29 || (oVar = decoderInputBuffer.format) == null || !Objects.equals(oVar.f12061n, "audio/opus") || !this.C0) {
            return;
        }
        ByteBuffer byteBuffer = decoderInputBuffer.supplementalData;
        byteBuffer.getClass();
        t1.o oVar2 = decoderInputBuffer.format;
        oVar2.getClass();
        int i = oVar2.I;
        if (byteBuffer.remaining() == 8) {
            int i10 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
            d0 d0Var = this.e1;
            AudioTrack audioTrack = d0Var.f4596w;
            if (audioTrack == null || !d0.r(audioTrack) || (xVar = d0Var.f4594u) == null || !xVar.f4725k) {
                return;
            }
            d0Var.f4596w.setOffloadDelayPadding(i, i10);
        }
    }

    @Override // l2.s
    public final void W(Exception exc) {
        w1.a.p("MediaCodecAudioRenderer", "Audio codec error", exc);
        k2 k2Var = this.f4614d1;
        Handler handler = (Handler) k2Var.f7602w;
        if (handler != null) {
            handler.post(new g(k2Var, exc, 0));
        }
    }

    @Override // l2.s
    public final void X(long j8, long j9, String str) {
        k2 k2Var = this.f4614d1;
        Handler handler = (Handler) k2Var.f7602w;
        if (handler != null) {
            handler.post(new g(k2Var, str, j8, j9));
        }
    }

    @Override // l2.s
    public final void Y(String str) {
        k2 k2Var = this.f4614d1;
        Handler handler = (Handler) k2Var.f7602w;
        if (handler != null) {
            handler.post(new g(k2Var, str, 3));
        }
    }

    @Override // l2.s
    public final c2.h Z(sc.b bVar) throws c2.o {
        t1.o oVar = (t1.o) bVar.f11787x;
        oVar.getClass();
        this.f4619j1 = oVar;
        c2.h hVarZ = super.Z(bVar);
        k2 k2Var = this.f4614d1;
        Handler handler = (Handler) k2Var.f7602w;
        if (handler != null) {
            handler.post(new g(k2Var, oVar, hVarZ));
        }
        return hVarZ;
    }

    @Override // c2.w0
    public final boolean a() {
        boolean z2 = this.f4624o1;
        this.f4624o1 = false;
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0104 A[Catch: k -> 0x0102, TryCatch #0 {k -> 0x0102, blocks: (B:44:0x00d9, B:47:0x00e1, B:49:0x00e5, B:51:0x00ee, B:55:0x00fc, B:58:0x0104, B:62:0x010b, B:63:0x0110), top: B:67:0x00d9 }] */
    @Override // l2.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a0(t1.o r9, android.media.MediaFormat r10) throws c2.o {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.f0.a0(t1.o, android.media.MediaFormat):void");
    }

    @Override // c2.w0
    public final void b(t1.i0 i0Var) {
        this.e1.E(i0Var);
    }

    @Override // l2.s
    public final void b0() {
        this.e1.getClass();
    }

    @Override // c2.f, c2.n1
    public final void c(int i, Object obj) {
        a9.g gVar;
        hd.a aVar;
        d0 d0Var = this.e1;
        if (i == 2) {
            obj.getClass();
            float fFloatValue = ((Float) obj).floatValue();
            if (d0Var.P != fFloatValue) {
                d0Var.P = fFloatValue;
                if (d0Var.q()) {
                    d0Var.f4596w.setVolume(d0Var.P);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 3) {
            t1.c cVar = (t1.c) obj;
            cVar.getClass();
            d0Var.z(cVar);
            return;
        }
        if (i == 6) {
            t1.d dVar = (t1.d) obj;
            dVar.getClass();
            d0Var.C(dVar);
            return;
        }
        if (i == 12) {
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
            if (audioDeviceInfo == null) {
                gVar = null;
            } else {
                d0Var.getClass();
                gVar = new a9.g(11, audioDeviceInfo);
            }
            d0Var.f4566b0 = gVar;
            e eVar = d0Var.f4598y;
            if (eVar != null) {
                eVar.f(audioDeviceInfo);
            }
            AudioTrack audioTrack = d0Var.f4596w;
            if (audioTrack != null) {
                a9.g gVar2 = d0Var.f4566b0;
                audioTrack.setPreferredDevice(gVar2 != null ? (AudioDeviceInfo) gVar2.f273w : null);
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.f4625p1 = ((Integer) obj).intValue();
            l2.l lVar = this.f8127h0;
            if (lVar != null && Build.VERSION.SDK_INT >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.f4625p1));
                lVar.b(bundle);
                return;
            }
            return;
        }
        if (i == 9) {
            obj.getClass();
            d0Var.E = ((Boolean) obj).booleanValue();
            x xVar = d0Var.f4594u;
            y yVar = new y((xVar == null || !xVar.f4724j) ? d0Var.D : t1.i0.f12003d, -9223372036854775807L, -9223372036854775807L);
            if (d0Var.q()) {
                d0Var.B = yVar;
                return;
            } else {
                d0Var.C = yVar;
                return;
            }
        }
        if (i != 10) {
            if (i == 11) {
                m0 m0Var = (m0) obj;
                m0Var.getClass();
                this.f8122c0 = m0Var;
                return;
            }
            return;
        }
        obj.getClass();
        int iIntValue = ((Integer) obj).intValue();
        d0Var.A(iIntValue);
        if (Build.VERSION.SDK_INT < 35 || (aVar = this.f4615f1) == null) {
            return;
        }
        aVar.M(iIntValue);
    }

    @Override // c2.w0
    public final t1.i0 d() {
        return this.e1.D;
    }

    @Override // l2.s
    public final void d0() {
        this.e1.M = true;
    }

    @Override // c2.w0
    public final long e() {
        if (this.C == 2) {
            A0();
        }
        return this.f4621l1;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    @Override // l2.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g0(long r1, long r3, l2.l r5, java.nio.ByteBuffer r6, int r7, int r8, int r9, long r10, boolean r12, boolean r13, t1.o r14) throws c2.o {
        /*
            r0 = this;
            r6.getClass()
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f4627r1 = r1
            t1.o r1 = r0.f4620k1
            r2 = 1
            if (r1 == 0) goto L1a
            r1 = r8 & 2
            if (r1 == 0) goto L1a
            r5.getClass()
            r5.h(r7)
            return r2
        L1a:
            e2.d0 r1 = r0.e1
            if (r12 == 0) goto L2d
            if (r5 == 0) goto L23
            r5.h(r7)
        L23:
            c2.g r3 = r0.T0
            int r4 = r3.f
            int r4 = r4 + r9
            r3.f = r4
            r1.M = r2
            return r2
        L2d:
            boolean r1 = r1.n(r10, r9, r6)     // Catch: e2.n -> L44 e2.l -> L5e
            if (r1 == 0) goto L40
            if (r5 == 0) goto L38
            r5.h(r7)
        L38:
            c2.g r1 = r0.T0
            int r3 = r1.f1737e
            int r3 = r3 + r9
            r1.f1737e = r3
            return r2
        L40:
            r0.f4627r1 = r10
            r1 = 0
            return r1
        L44:
            r1 = move-exception
            boolean r2 = r0.C0
            if (r2 == 0) goto L55
            c2.r1 r2 = r0.f1725y
            r2.getClass()
            int r2 = r2.f1933a
            if (r2 == 0) goto L55
            r2 = 5003(0x138b, float:7.01E-42)
            goto L57
        L55:
            r2 = 5002(0x138a, float:7.009E-42)
        L57:
            boolean r3 = r1.f4666w
            c2.o r1 = r0.f(r1, r14, r3, r2)
            throw r1
        L5e:
            r1 = move-exception
            t1.o r2 = r0.f4619j1
            boolean r3 = r0.C0
            if (r3 == 0) goto L71
            c2.r1 r3 = r0.f1725y
            r3.getClass()
            int r3 = r3.f1933a
            if (r3 == 0) goto L71
            r3 = 5004(0x138c, float:7.012E-42)
            goto L73
        L71:
            r3 = 5001(0x1389, float:7.008E-42)
        L73:
            boolean r4 = r1.f4663w
            c2.o r1 = r0.f(r1, r2, r4, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.f0.g0(long, long, l2.l, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, t1.o):boolean");
    }

    @Override // c2.f
    public final String j() {
        return "MediaCodecAudioRenderer";
    }

    @Override // l2.s
    public final void j0() throws c2.o {
        try {
            this.e1.w();
            long j8 = this.N0;
            if (j8 != -9223372036854775807L) {
                this.f4627r1 = j8;
            }
        } catch (n e7) {
            throw f(e7, e7.f4667x, e7.f4666w, this.C0 ? 5003 : 5002);
        }
    }

    @Override // c2.f
    public final boolean l() {
        if (!this.P0) {
            return false;
        }
        d0 d0Var = this.e1;
        if (d0Var.q()) {
            return d0Var.T && !d0Var.o();
        }
        return true;
    }

    @Override // l2.s, c2.f
    public final boolean m() {
        return this.e1.o() || super.m();
    }

    @Override // l2.s, c2.f
    public final void o() {
        k2 k2Var = this.f4614d1;
        this.f4623n1 = true;
        this.f4619j1 = null;
        this.f4627r1 = -9223372036854775807L;
        try {
            this.e1.g();
            try {
                super.o();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.o();
                throw th;
            } finally {
            }
        }
    }

    @Override // c2.f
    public final void p(boolean z2, boolean z10) {
        c2.g gVar = new c2.g();
        this.T0 = gVar;
        k2 k2Var = this.f4614d1;
        Handler handler = (Handler) k2Var.f7602w;
        if (handler != null) {
            handler.post(new g(k2Var, gVar, 4));
        }
        r1 r1Var = this.f1725y;
        r1Var.getClass();
        boolean z11 = r1Var.f1934b;
        d0 d0Var = this.e1;
        if (z11) {
            w1.a.j(d0Var.X);
            if (!d0Var.f4568c0) {
                d0Var.f4568c0 = true;
                d0Var.g();
            }
        } else if (d0Var.f4568c0) {
            d0Var.f4568c0 = false;
            d0Var.g();
        }
        d2.l lVar = this.A;
        lVar.getClass();
        d0Var.f4591r = lVar;
        w1.v vVar = this.B;
        vVar.getClass();
        d0Var.f4576h.G = vVar;
    }

    @Override // l2.s, c2.f
    public final void q(boolean z2, long j8) throws c2.o {
        super.q(z2, j8);
        this.e1.g();
        this.f4621l1 = j8;
        this.f4627r1 = -9223372036854775807L;
        this.f4624o1 = false;
        this.f4622m1 = true;
    }

    @Override // c2.f
    public final void r() {
        hd.a aVar;
        e eVar = this.e1.f4598y;
        if (eVar != null) {
            Context context = (Context) eVar.f4601b;
            if (eVar.f4600a) {
                eVar.f4606h = null;
                c cVar = (c) eVar.f4604e;
                if (cVar != null) {
                    u1.c.s(context).unregisterAudioDeviceCallback(cVar);
                }
                context.unregisterReceiver((com.bumptech.glide.manager.q) eVar.f);
                d dVar = (d) eVar.f4605g;
                if (dVar != null) {
                    dVar.f4558a.unregisterContentObserver(dVar);
                }
                eVar.f4600a = false;
            }
        }
        if (Build.VERSION.SDK_INT < 35 || (aVar = this.f4615f1) == null) {
            return;
        }
        ((HashSet) aVar.f6279w).clear();
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) aVar.f6281y;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    @Override // c2.f
    public final void s() {
        d0 d0Var = this.e1;
        this.f4624o1 = false;
        this.f4627r1 = -9223372036854775807L;
        try {
            try {
                this.C0 = false;
                k0();
                i0();
            } finally {
                d0.d.t(this.f8121b0, null);
                this.f8121b0 = null;
            }
        } finally {
            if (this.f4623n1) {
                this.f4623n1 = false;
                d0Var.y();
            }
        }
    }

    @Override // c2.f
    public final void t() {
        this.e1.u();
        this.f4626q1 = true;
    }

    @Override // l2.s
    public final boolean t0(t1.o oVar) {
        r1 r1Var = this.f1725y;
        r1Var.getClass();
        if (r1Var.f1933a != 0) {
            int iY0 = y0(oVar);
            if ((iY0 & 512) != 0) {
                r1 r1Var2 = this.f1725y;
                r1Var2.getClass();
                if (r1Var2.f1933a == 2 || (iY0 & 1024) != 0) {
                    return true;
                }
                if (oVar.I == 0 && oVar.J == 0) {
                    return true;
                }
            }
        }
        return this.e1.F(oVar);
    }

    @Override // c2.f
    public final void u() {
        A0();
        this.f4626q1 = false;
        this.e1.t();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009b  */
    @Override // l2.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int u0(l2.j r18, t1.o r19) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.f0.u0(l2.j, t1.o):int");
    }

    public final int y0(t1.o oVar) {
        f fVarJ = this.e1.j(oVar);
        if (!fVarJ.f4611a) {
            return 0;
        }
        int i = fVarJ.f4612b ? 1536 : 512;
        return fVarJ.f4613c ? i | 2048 : i;
    }

    public final int z0(l2.o oVar, t1.o oVar2) {
        int i;
        if (!"OMX.google.raw.decoder".equals(oVar.f8099a) || (i = Build.VERSION.SDK_INT) >= 24 || (i == 23 && w1.b0.L(this.c1))) {
            return oVar2.f12062o;
        }
        return -1;
    }

    @Override // c2.f
    public final w0 i() {
        return this;
    }
}
