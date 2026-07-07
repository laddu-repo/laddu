package c2;

import a2.a2;
import a2.b1;
import a2.q0;
import a2.y1;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.LoudnessCodecController;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import androidx.lifecycle.j1;
import com.playfy.tv.activities.PlayerActivity;
import db.c1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k0 extends j2.t implements b1 {

    /* renamed from: e1, reason: collision with root package name */
    public final Context f1864e1;

    /* renamed from: f1, reason: collision with root package name */
    public final j4.b0 f1865f1;

    /* renamed from: g1, reason: collision with root package name */
    public final i0 f1866g1;

    /* renamed from: h1, reason: collision with root package name */
    public final j1 f1867h1;

    /* renamed from: i1, reason: collision with root package name */
    public int f1868i1;

    /* renamed from: j1, reason: collision with root package name */
    public boolean f1869j1;

    /* renamed from: k1, reason: collision with root package name */
    public boolean f1870k1;

    /* renamed from: l1, reason: collision with root package name */
    public r1.q f1871l1;

    /* renamed from: m1, reason: collision with root package name */
    public r1.q f1872m1;

    /* renamed from: n1, reason: collision with root package name */
    public long f1873n1;

    /* renamed from: o1, reason: collision with root package name */
    public boolean f1874o1;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f1875p1;

    /* renamed from: q1, reason: collision with root package name */
    public boolean f1876q1;

    /* renamed from: r1, reason: collision with root package name */
    public int f1877r1;

    /* renamed from: s1, reason: collision with root package name */
    public boolean f1878s1;

    /* renamed from: t1, reason: collision with root package name */
    public long f1879t1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(PlayerActivity playerActivity, j2.m mVar, Handler handler, a2.k0 k0Var, i0 i0Var) {
        super(1, mVar, 44100.0f);
        j1 j1Var;
        if (Build.VERSION.SDK_INT >= 35) {
            j1Var = new j1(25);
        } else {
            j1Var = null;
        }
        this.f1864e1 = playerActivity.getApplicationContext();
        this.f1866g1 = i0Var;
        this.f1867h1 = j1Var;
        this.f1877r1 = -1000;
        this.f1865f1 = new j4.b0(handler, (m) k0Var);
        this.f1879t1 = -9223372036854775807L;
        i0Var.f1849t = new a2(this, 2);
    }

    public final int A0(j2.q qVar, r1.q qVar2) {
        int i6;
        if ("OMX.google.raw.decoder".equals(qVar.f7091a) && (i6 = Build.VERSION.SDK_INT) < 24 && (i6 != 23 || !u1.a0.O(this.f1864e1))) {
            return -1;
        }
        return qVar2.f11671o;
    }

    public final void B0() {
        l();
        long i6 = this.f1866g1.i();
        if (i6 != Long.MIN_VALUE) {
            if (!this.f1874o1) {
                i6 = Math.max(this.f1873n1, i6);
            }
            this.f1873n1 = i6;
            this.f1874o1 = false;
        }
    }

    @Override // j2.t
    public final a2.i D(j2.q qVar, r1.q qVar2, r1.q qVar3) {
        int i6;
        a2.i b10 = qVar.b(qVar2, qVar3);
        int i10 = b10.f269e;
        if (this.f7115c0 == null && u0(qVar3)) {
            i10 |= 32768;
        }
        if (A0(qVar, qVar3) > this.f1868i1) {
            i10 |= 64;
        }
        int i11 = i10;
        String str = qVar.f7091a;
        if (i11 != 0) {
            i6 = 0;
        } else {
            i6 = b10.f268d;
        }
        return new a2.i(str, qVar2, qVar3, i6, i11);
    }

    @Override // j2.t
    public final float N(float f3, r1.q qVar, r1.q[] qVarArr) {
        int i6 = -1;
        for (r1.q qVar2 : qVarArr) {
            int i10 = qVar2.G;
            if (i10 != -1) {
                i6 = Math.max(i6, i10);
            }
        }
        if (i6 == -1) {
            return -1.0f;
        }
        return i6 * f3;
    }

    @Override // j2.t
    public final ArrayList O(j2.l lVar, r1.q qVar, boolean z10) {
        c1 f3;
        j2.q qVar2;
        if (qVar.f11670n == null) {
            f3 = c1.B;
        } else {
            if (this.f1866g1.F(qVar)) {
                List d10 = j2.a0.d("audio/raw", false, false);
                if (d10.isEmpty()) {
                    qVar2 = null;
                } else {
                    qVar2 = (j2.q) d10.get(0);
                }
                if (qVar2 != null) {
                    f3 = db.k0.o(qVar2);
                }
            }
            f3 = j2.a0.f(lVar, qVar, z10, false);
        }
        HashMap hashMap = j2.a0.f7050a;
        ArrayList arrayList = new ArrayList(f3);
        Collections.sort(arrayList, new aa.e(new j2.u(qVar, 0), 1));
        return arrayList;
    }

    @Override // j2.t
    public final long P(long j, long j10) {
        boolean z10;
        float f3;
        if (this.f1879t1 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.f1878s1) {
            if (z10 || this.R0) {
                return 1000000L;
            }
        } else {
            i0 i0Var = this.f1866g1;
            long h4 = i0Var.h();
            if (z10 && h4 != -9223372036854775807L) {
                float min = (float) Math.min(h4, this.f1879t1 - j);
                r1.o0 o0Var = i0Var.E;
                if (o0Var != null) {
                    f3 = o0Var.f11596a;
                } else {
                    f3 = 1.0f;
                }
                this.D.getClass();
                return Math.max(10000L, ((min / f3) / 2.0f) - (u1.a0.Q(SystemClock.elapsedRealtime()) - j10));
            }
        }
        return 10000L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d4, code lost:
    
        if ("AXON 7 mini".equals(r6) == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0133  */
    @Override // j2.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.lifecycle.d Q(j2.q r13, r1.q r14, android.media.MediaCrypto r15, float r16) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.k0.Q(j2.q, r1.q, android.media.MediaCrypto, float):androidx.lifecycle.d");
    }

    @Override // j2.t
    public final void R(y1.h hVar) {
        r1.q qVar;
        c0 c0Var;
        if (Build.VERSION.SDK_INT >= 29 && (qVar = hVar.f14810x) != null && Objects.equals(qVar.f11670n, "audio/opus") && this.E0) {
            ByteBuffer byteBuffer = hVar.C;
            byteBuffer.getClass();
            r1.q qVar2 = hVar.f14810x;
            qVar2.getClass();
            int i6 = qVar2.I;
            if (byteBuffer.remaining() == 8) {
                int i10 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
                i0 i0Var = this.f1866g1;
                AudioTrack audioTrack = i0Var.f1853x;
                if (audioTrack != null && i0.r(audioTrack) && (c0Var = i0Var.f1851v) != null && c0Var.f1780k) {
                    i0Var.f1853x.setOffloadDelayPadding(i6, i10);
                }
            }
        }
    }

    @Override // j2.t
    public final void X(Exception exc) {
        u1.a.h("MediaCodecAudioRenderer", "Audio codec error", exc);
        j4.b0 b0Var = this.f1865f1;
        Handler handler = (Handler) b0Var.f7158x;
        if (handler != null) {
            handler.post(new k(b0Var, exc, 0));
        }
    }

    @Override // j2.t
    public final void Y(String str, long j, long j10) {
        j4.b0 b0Var = this.f1865f1;
        Handler handler = (Handler) b0Var.f7158x;
        if (handler != null) {
            handler.post(new k(b0Var, str, j, j10));
        }
    }

    @Override // j2.t
    public final void Z(String str) {
        j4.b0 b0Var = this.f1865f1;
        Handler handler = (Handler) b0Var.f7158x;
        if (handler != null) {
            handler.post(new k(b0Var, str, 3));
        }
    }

    @Override // j2.t
    public final a2.i a0(j4.b0 b0Var) {
        r1.q qVar = (r1.q) b0Var.f7159y;
        qVar.getClass();
        this.f1871l1 = qVar;
        a2.i a02 = super.a0(b0Var);
        j4.b0 b0Var2 = this.f1865f1;
        Handler handler = (Handler) b0Var2.f7158x;
        if (handler != null) {
            handler.post(new k(b0Var2, qVar, a02));
        }
        return a02;
    }

    @Override // j2.t
    public final void b0(r1.q qVar, MediaFormat mediaFormat) {
        int i6;
        r1.q qVar2 = this.f1872m1;
        boolean z10 = true;
        int[] iArr = null;
        if (qVar2 != null) {
            qVar = qVar2;
        } else if (this.f7121i0 != null) {
            mediaFormat.getClass();
            String str = qVar.f11670n;
            int i10 = qVar.F;
            if ("audio/raw".equals(str)) {
                i6 = qVar.H;
            } else if (Build.VERSION.SDK_INT >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i6 = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i6 = u1.a0.B(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN);
            } else {
                i6 = 2;
            }
            r1.p pVar = new r1.p();
            pVar.f11611m = r1.k0.p("audio/raw");
            pVar.G = i6;
            pVar.H = qVar.I;
            pVar.I = qVar.J;
            pVar.f11609k = qVar.f11668l;
            pVar.f11600a = qVar.f11658a;
            pVar.f11601b = qVar.f11659b;
            pVar.f11602c = db.k0.k(qVar.f11660c);
            pVar.f11603d = qVar.f11661d;
            pVar.f11604e = qVar.f11662e;
            pVar.f11605f = qVar.f11663f;
            pVar.E = mediaFormat.getInteger("channel-count");
            pVar.F = mediaFormat.getInteger("sample-rate");
            qVar = new r1.q(pVar);
            boolean z11 = this.f1869j1;
            int i11 = qVar.F;
            if (z11 && i11 == 6 && i10 < 6) {
                iArr = new int[i10];
                for (int i12 = 0; i12 < i10; i12++) {
                    iArr[i12] = i12;
                }
            } else if (this.f1870k1) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        if (i11 != 6) {
                            if (i11 != 7) {
                                if (i11 == 8) {
                                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                                }
                            } else {
                                iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                            }
                        } else {
                            iArr = new int[]{0, 2, 1, 5, 3, 4};
                        }
                    } else {
                        iArr = new int[]{0, 2, 1, 3, 4};
                    }
                } else {
                    iArr = new int[]{0, 2, 1};
                }
            }
        }
        try {
            int i13 = Build.VERSION.SDK_INT;
            i0 i0Var = this.f1866g1;
            if (i13 >= 29) {
                if (this.E0) {
                    y1 y1Var = this.A;
                    y1Var.getClass();
                    if (y1Var.f504a != 0) {
                        y1 y1Var2 = this.A;
                        y1Var2.getClass();
                        int i14 = y1Var2.f504a;
                        i0Var.getClass();
                        if (i13 < 29) {
                            z10 = false;
                        }
                        u1.c.g(z10);
                        i0Var.f1837k = i14;
                    }
                }
                i0Var.getClass();
                if (i13 < 29) {
                    z10 = false;
                }
                u1.c.g(z10);
                i0Var.f1837k = 0;
            }
            i0Var.d(qVar, iArr);
        } catch (o e10) {
            throw a(e10, e10.f1906x, false, 5001);
        }
    }

    @Override // j2.t
    public final void c0() {
        this.f1866g1.getClass();
    }

    @Override // a2.b1
    public final r1.o0 d() {
        return this.f1866g1.E;
    }

    @Override // a2.b1
    public final void e(r1.o0 o0Var) {
        this.f1866g1.E(o0Var);
    }

    @Override // j2.t
    public final void e0() {
        this.f1866g1.N = true;
    }

    @Override // a2.b1
    public final long f() {
        if (this.E == 2) {
            B0();
        }
        return this.f1873n1;
    }

    @Override // a2.b1
    public final boolean g() {
        boolean z10 = this.f1876q1;
        this.f1876q1 = false;
        return z10;
    }

    @Override // a2.g, a2.u1
    public final void h(int i6, Object obj) {
        k7.d dVar;
        r1.o0 o0Var;
        j1 j1Var;
        i0 i0Var = this.f1866g1;
        if (i6 != 2) {
            if (i6 != 3) {
                if (i6 != 6) {
                    if (i6 != 12) {
                        if (i6 != 16) {
                            if (i6 != 9) {
                                if (i6 != 10) {
                                    if (i6 == 11) {
                                        q0 q0Var = (q0) obj;
                                        q0Var.getClass();
                                        this.f7116d0 = q0Var;
                                        return;
                                    }
                                    return;
                                }
                                obj.getClass();
                                int intValue = ((Integer) obj).intValue();
                                i0Var.A(intValue);
                                if (Build.VERSION.SDK_INT >= 35 && (j1Var = this.f1867h1) != null) {
                                    j1Var.D(intValue);
                                    return;
                                }
                                return;
                            }
                            obj.getClass();
                            i0Var.F = ((Boolean) obj).booleanValue();
                            if (i0Var.G()) {
                                o0Var = r1.o0.f11593d;
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
                        obj.getClass();
                        this.f1877r1 = ((Integer) obj).intValue();
                        j2.n nVar = this.f7121i0;
                        if (nVar != null && Build.VERSION.SDK_INT >= 35) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("importance", Math.max(0, -this.f1877r1));
                            nVar.b(bundle);
                            return;
                        }
                        return;
                    }
                    if (Build.VERSION.SDK_INT >= 23) {
                        AudioDeviceInfo f3 = android.support.v4.media.c.f(obj);
                        AudioDeviceInfo audioDeviceInfo = null;
                        if (f3 == null) {
                            dVar = null;
                        } else {
                            i0Var.getClass();
                            dVar = new k7.d(f3, 2);
                        }
                        i0Var.f1823c0 = dVar;
                        h hVar = i0Var.f1855z;
                        if (hVar != null) {
                            hVar.b(f3);
                        }
                        AudioTrack audioTrack = i0Var.f1853x;
                        if (audioTrack != null) {
                            k7.d dVar2 = i0Var.f1823c0;
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
                r1.e eVar = (r1.e) obj;
                eVar.getClass();
                i0Var.C(eVar);
                return;
            }
            r1.d dVar3 = (r1.d) obj;
            dVar3.getClass();
            i0Var.z(dVar3);
            return;
        }
        obj.getClass();
        float floatValue = ((Float) obj).floatValue();
        if (i0Var.Q != floatValue) {
            i0Var.Q = floatValue;
            if (i0Var.q()) {
                i0Var.f1853x.setVolume(i0Var.Q);
            }
        }
    }

    @Override // j2.t
    public final boolean h0(long j, long j10, j2.n nVar, ByteBuffer byteBuffer, int i6, int i10, int i11, long j11, boolean z10, boolean z11, r1.q qVar) {
        int i12;
        int i13;
        byteBuffer.getClass();
        this.f1879t1 = -9223372036854775807L;
        if (this.f1872m1 != null && (i10 & 2) != 0) {
            nVar.getClass();
            nVar.f(i6);
            return true;
        }
        i0 i0Var = this.f1866g1;
        if (z10) {
            if (nVar != null) {
                nVar.f(i6);
            }
            this.V0.f255f += i11;
            i0Var.N = true;
            return true;
        }
        try {
            if (i0Var.n(j11, i11, byteBuffer)) {
                if (nVar != null) {
                    nVar.f(i6);
                }
                this.V0.f254e += i11;
                return true;
            }
            this.f1879t1 = j11;
            return false;
        } catch (p e10) {
            r1.q qVar2 = this.f1871l1;
            if (this.E0) {
                y1 y1Var = this.A;
                y1Var.getClass();
                if (y1Var.f504a != 0) {
                    i13 = 5004;
                    throw a(e10, qVar2, e10.f1914y, i13);
                }
            }
            i13 = 5001;
            throw a(e10, qVar2, e10.f1914y, i13);
        } catch (s e11) {
            if (this.E0) {
                y1 y1Var2 = this.A;
                y1Var2.getClass();
                if (y1Var2.f504a != 0) {
                    i12 = 5003;
                    throw a(e11, qVar, e11.f1917y, i12);
                }
            }
            i12 = 5002;
            throw a(e11, qVar, e11.f1917y, i12);
        }
    }

    @Override // a2.g
    public final String j() {
        return "MediaCodecAudioRenderer";
    }

    @Override // j2.t
    public final void k0() {
        int i6;
        try {
            this.f1866g1.w();
            long j = this.P0;
            if (j != -9223372036854775807L) {
                this.f1879t1 = j;
            }
        } catch (s e10) {
            if (this.E0) {
                i6 = 5003;
            } else {
                i6 = 5002;
            }
            throw a(e10, e10.f1918z, e10.f1917y, i6);
        }
    }

    @Override // a2.g
    public final boolean l() {
        if (this.R0) {
            i0 i0Var = this.f1866g1;
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

    @Override // j2.t, a2.g
    public final boolean m() {
        if (!this.f1866g1.o() && !super.m()) {
            return false;
        }
        return true;
    }

    @Override // j2.t, a2.g
    public final void o() {
        j4.b0 b0Var = this.f1865f1;
        this.f1875p1 = true;
        this.f1871l1 = null;
        this.f1879t1 = -9223372036854775807L;
        try {
            this.f1866g1.g();
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

    /* JADX WARN: Type inference failed for: r4v1, types: [a2.h, java.lang.Object] */
    @Override // a2.g
    public final void p(boolean z10, boolean z11) {
        ?? obj = new Object();
        this.V0 = obj;
        j4.b0 b0Var = this.f1865f1;
        Handler handler = (Handler) b0Var.f7158x;
        if (handler != null) {
            handler.post(new k(b0Var, (Object) obj, 4));
        }
        y1 y1Var = this.A;
        y1Var.getClass();
        boolean z12 = y1Var.f505b;
        i0 i0Var = this.f1866g1;
        if (z12) {
            u1.c.g(i0Var.Y);
            if (!i0Var.f1825d0) {
                i0Var.f1825d0 = true;
                i0Var.g();
            }
        } else if (i0Var.f1825d0) {
            i0Var.f1825d0 = false;
            i0Var.g();
        }
        b2.m mVar = this.C;
        mVar.getClass();
        i0Var.s = mVar;
        u1.v vVar = this.D;
        vVar.getClass();
        i0Var.f1832h.I = vVar;
    }

    @Override // j2.t, a2.g
    public final void q(boolean z10, long j) {
        super.q(z10, j);
        this.f1866g1.g();
        this.f1873n1 = j;
        this.f1879t1 = -9223372036854775807L;
        this.f1876q1 = false;
        this.f1874o1 = true;
    }

    @Override // a2.g
    public final void r() {
        j1 j1Var;
        e eVar;
        h hVar = this.f1866g1.f1855z;
        if (hVar != null) {
            Context context = hVar.f1803a;
            if (hVar.j) {
                hVar.f1809g = null;
                if (Build.VERSION.SDK_INT >= 23 && (eVar = hVar.f1806d) != null) {
                    s1.c.l(context).unregisterAudioDeviceCallback(eVar);
                }
                context.unregisterReceiver(hVar.f1807e);
                f fVar = hVar.f1808f;
                if (fVar != null) {
                    fVar.f1793a.unregisterContentObserver(fVar);
                }
                hVar.j = false;
            }
        }
        if (Build.VERSION.SDK_INT >= 35 && (j1Var = this.f1867h1) != null) {
            ((HashSet) j1Var.f949y).clear();
            LoudnessCodecController loudnessCodecController = (LoudnessCodecController) j1Var.A;
            if (loudnessCodecController != null) {
                loudnessCodecController.close();
            }
        }
    }

    @Override // a2.g
    public final void s() {
        i0 i0Var = this.f1866g1;
        this.f1876q1 = false;
        this.f1879t1 = -9223372036854775807L;
        try {
            try {
                this.E0 = false;
                l0();
                j0();
            } finally {
                r4.a.z(this.f7115c0, null);
                this.f7115c0 = null;
            }
        } finally {
            if (this.f1875p1) {
                this.f1875p1 = false;
                i0Var.y();
            }
        }
    }

    @Override // a2.g
    public final void t() {
        this.f1866g1.u();
        this.f1878s1 = true;
    }

    @Override // a2.g
    public final void u() {
        B0();
        this.f1878s1 = false;
        this.f1866g1.t();
    }

    @Override // j2.t
    public final boolean u0(r1.q qVar) {
        y1 y1Var = this.A;
        y1Var.getClass();
        if (y1Var.f504a != 0) {
            int z02 = z0(qVar);
            if ((z02 & 512) != 0) {
                y1 y1Var2 = this.A;
                y1Var2.getClass();
                if (y1Var2.f504a != 2 && (z02 & 1024) == 0) {
                    if (qVar.I == 0 && qVar.J == 0) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }
        return this.f1866g1.F(qVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (r7 != null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007c  */
    @Override // j2.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int v0(j2.l r18, r1.q r19) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.k0.v0(j2.l, r1.q):int");
    }

    public final int z0(r1.q qVar) {
        int i6;
        j j = this.f1866g1.j(qVar);
        if (!j.f1857a) {
            return 0;
        }
        if (j.f1858b) {
            i6 = 1536;
        } else {
            i6 = 512;
        }
        if (j.f1859c) {
            return i6 | 2048;
        }
        return i6;
    }

    @Override // a2.g
    public final b1 i() {
        return this;
    }
}
