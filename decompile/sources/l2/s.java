package l2;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.media3.decoder.DecoderInputBuffer;
import c2.m0;
import com.google.android.gms.internal.measurement.mb;
import e2.g0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class s extends c2.f {

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final byte[] f8118b1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public int G0;
    public int H0;
    public int I0;
    public boolean J0;
    public boolean K0;
    public boolean L0;
    public long M0;
    public final k N;
    public long N0;
    public final j O;
    public boolean O0;
    public final boolean P;
    public boolean P0;
    public final float Q;
    public boolean Q0;
    public final DecoderInputBuffer R;
    public boolean R0;
    public final DecoderInputBuffer S;
    public c2.o S0;
    public final DecoderInputBuffer T;
    public c2.g T0;
    public final h U;
    public r U0;
    public final MediaCodec.BufferInfo V;
    public long V0;
    public final ArrayDeque W;
    public boolean W0;
    public final g0 X;
    public boolean X0;
    public t1.o Y;
    public boolean Y0;
    public t1.o Z;
    public long Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public h2.h f8119a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public long f8120a1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public h2.h f8121b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public m0 f8122c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public MediaCrypto f8123d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final long f8124e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public float f8125f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public float f8126g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public l f8127h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public t1.o f8128i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public MediaFormat f8129j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f8130k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public float f8131l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public ArrayDeque f8132m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public q f8133n0;
    public o o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f8134p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f8135q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f8136r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f8137s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f8138t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f8139u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public long f8140v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public long f8141w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f8142x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f8143y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public ByteBuffer f8144z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(int i, k kVar, boolean z2, float f) {
        super(i);
        j jVar = j.f8097w;
        this.N = kVar;
        this.O = jVar;
        this.P = z2;
        this.Q = f;
        this.R = DecoderInputBuffer.newNoDataInstance();
        this.S = new DecoderInputBuffer(0);
        this.T = new DecoderInputBuffer(2);
        h hVar = new h(2);
        hVar.f8094x = 32;
        this.U = hVar;
        this.V = new MediaCodec.BufferInfo();
        this.f8125f0 = 1.0f;
        this.f8126g0 = 1.0f;
        this.f8124e0 = -9223372036854775807L;
        this.W = new ArrayDeque();
        this.U0 = r.f8113e;
        hVar.ensureSpaceForWrite(0);
        hVar.data.order(ByteOrder.nativeOrder());
        g0 g0Var = new g0();
        g0Var.f4632a = u1.g.f12629a;
        g0Var.f4634c = 0;
        g0Var.f4633b = 2;
        this.X = g0Var;
        this.f8131l0 = -1.0f;
        this.f8134p0 = 0;
        this.G0 = 0;
        this.f8142x0 = -1;
        this.f8143y0 = -1;
        this.f8141w0 = -9223372036854775807L;
        this.M0 = -9223372036854775807L;
        this.N0 = -9223372036854775807L;
        this.V0 = -9223372036854775807L;
        this.f8140v0 = -9223372036854775807L;
        this.H0 = 0;
        this.I0 = 0;
        this.T0 = new c2.g();
        this.Z0 = -9223372036854775807L;
        this.f8120a1 = -9223372036854775807L;
    }

    @Override // c2.f
    public final int A(t1.o oVar) throws c2.o {
        try {
            return u0(this.O, oVar);
        } catch (v e7) {
            throw f(e7, oVar, false, 4002);
        }
    }

    @Override // c2.f
    public final int B() {
        return 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02fb  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r24v0, types: [c2.f, l2.s] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v35, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean C(long r25, long r27) throws c2.o {
        /*
            Method dump skipped, instruction units count: 807
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.s.C(long, long):boolean");
    }

    public abstract c2.h D(o oVar, t1.o oVar2, t1.o oVar3);

    public n E(IllegalStateException illegalStateException, o oVar) {
        return new n(illegalStateException, oVar);
    }

    public final boolean F() throws c2.o {
        if (!this.J0) {
            w0();
            return true;
        }
        this.H0 = 1;
        if (this.f8136r0) {
            this.I0 = 3;
            return false;
        }
        this.I0 = 2;
        return true;
    }

    public final boolean G(long j8, long j9) throws c2.o {
        l lVar = this.f8127h0;
        lVar.getClass();
        int i = this.f8143y0;
        MediaCodec.BufferInfo bufferInfo = this.V;
        if (i < 0) {
            int iE = lVar.e(bufferInfo);
            if (iE < 0) {
                if (iE == -2) {
                    this.L0 = true;
                    l lVar2 = this.f8127h0;
                    lVar2.getClass();
                    MediaFormat mediaFormatO = lVar2.o();
                    if (this.f8134p0 != 0 && mediaFormatO.getInteger("width") == 32 && mediaFormatO.getInteger("height") == 32) {
                        this.f8138t0 = true;
                        return true;
                    }
                    this.f8129j0 = mediaFormatO;
                    this.f8130k0 = true;
                    return true;
                }
                if (this.f8139u0 && (this.O0 || this.H0 == 2)) {
                    f0();
                }
                long j10 = this.f8140v0;
                if (j10 != -9223372036854775807L) {
                    long j11 = j10 + 100;
                    this.B.getClass();
                    if (j11 < System.currentTimeMillis()) {
                        f0();
                        return false;
                    }
                }
                return false;
            }
            if (this.f8138t0) {
                this.f8138t0 = false;
                lVar.h(iE);
                return true;
            }
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                f0();
                return false;
            }
            this.f8143y0 = iE;
            ByteBuffer byteBufferU = lVar.u(iE);
            this.f8144z0 = byteBufferU;
            if (byteBufferU != null) {
                byteBufferU.position(bufferInfo.offset);
                this.f8144z0.limit(bufferInfo.offset + bufferInfo.size);
            }
            x0(bufferInfo.presentationTimeUs);
        }
        long j12 = bufferInfo.presentationTimeUs;
        this.A0 = j12 < this.G;
        long j13 = this.N0;
        this.B0 = j13 != -9223372036854775807L && j13 <= j12;
        if (this.Y0) {
            long j14 = this.Z0;
            if (j14 == -9223372036854775807L || j12 > j14) {
                this.Z0 = j12;
                this.A0 = true;
                this.B0 = false;
            } else {
                this.Y0 = false;
                this.Z0 = -9223372036854775807L;
            }
        }
        ByteBuffer byteBuffer = this.f8144z0;
        int i10 = this.f8143y0;
        int i11 = bufferInfo.flags;
        boolean z2 = this.A0;
        boolean z10 = this.B0;
        t1.o oVar = this.Z;
        oVar.getClass();
        if (!g0(j8, j9, lVar, byteBuffer, i10, i11, 1, j12, z2, z10, oVar)) {
            return false;
        }
        c0(bufferInfo.presentationTimeUs);
        boolean z11 = (bufferInfo.flags & 4) != 0;
        if (!z11 && this.K0 && this.B0) {
            this.B.getClass();
            this.f8140v0 = System.currentTimeMillis();
        }
        this.f8143y0 = -1;
        this.f8144z0 = null;
        if (!z11) {
            return true;
        }
        f0();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean H() throws c2.o {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.s.H():boolean");
    }

    public final void I() {
        try {
            l lVar = this.f8127h0;
            w1.a.k(lVar);
            lVar.flush();
        } finally {
            l0();
        }
    }

    public final boolean J() {
        if (this.f8127h0 != null) {
            if (s0()) {
                i0();
                return true;
            }
            if (q0()) {
                I();
                return false;
            }
            long j8 = this.f8120a1;
            if (j8 != -9223372036854775807L && this.G <= j8 && this.V0 < j8) {
                this.Y0 = true;
                this.f8120a1 = -9223372036854775807L;
            }
        }
        return false;
    }

    public final List K(boolean z2) {
        t1.o oVar = this.Y;
        oVar.getClass();
        j jVar = this.O;
        ArrayList arrayListN = N(jVar, oVar, z2);
        if (!arrayListN.isEmpty() || !z2) {
            return arrayListN;
        }
        ArrayList arrayListN2 = N(jVar, oVar, false);
        if (!arrayListN2.isEmpty()) {
            w1.a.C("MediaCodecRenderer", "Drm session requires secure decoder for " + oVar.f12061n + ", but no secure decoder available. Trying to proceed with " + arrayListN2 + ".");
        }
        return arrayListN2;
    }

    public int L(DecoderInputBuffer decoderInputBuffer) {
        return 0;
    }

    public abstract float M(float f, t1.o oVar, t1.o[] oVarArr);

    public abstract ArrayList N(j jVar, t1.o oVar, boolean z2);

    public long O(long j8, long j9) {
        return super.h(j8, j9);
    }

    public abstract mb P(o oVar, t1.o oVar2, MediaCrypto mediaCrypto, float f);

    public abstract void Q(DecoderInputBuffer decoderInputBuffer);

    /* JADX WARN: Removed duplicated region for block: B:27:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void R(l2.o r12, android.media.MediaCrypto r13) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.s.R(l2.o, android.media.MediaCrypto):void");
    }

    public final boolean S(long j8, long j9) {
        if (j9 >= j8) {
            return false;
        }
        t1.o oVar = this.Z;
        return oVar == null || !Objects.equals(oVar.f12061n, "audio/opus") || j8 - j9 > 80000;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void T() throws c2.o {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.s.T():void");
    }

    public final void U(MediaCrypto mediaCrypto, boolean z2) throws q {
        t1.o oVar = this.Y;
        oVar.getClass();
        if (this.f8132m0 == null) {
            try {
                List listK = K(z2);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.f8132m0 = arrayDeque;
                if (this.P) {
                    arrayDeque.addAll(listK);
                } else {
                    ArrayList arrayList = (ArrayList) listK;
                    if (!arrayList.isEmpty()) {
                        this.f8132m0.add((o) arrayList.get(0));
                    }
                }
                this.f8133n0 = null;
            } catch (v e7) {
                throw new q(oVar, e7, z2, -49998);
            }
        }
        if (this.f8132m0.isEmpty()) {
            throw new q(oVar, null, z2, -49999);
        }
        ArrayDeque arrayDeque2 = this.f8132m0;
        arrayDeque2.getClass();
        while (this.f8127h0 == null) {
            o oVar2 = (o) arrayDeque2.peekFirst();
            oVar2.getClass();
            if (!V(oVar) || !r0(oVar2)) {
                return;
            }
            try {
                R(oVar2, mediaCrypto);
            } catch (Exception e10) {
                w1.a.D("MediaCodecRenderer", "Failed to initialize decoder: " + oVar2, e10);
                arrayDeque2.removeFirst();
                q qVar = new q("Decoder init failed: " + oVar2.f8099a + ", " + oVar, e10, oVar.f12061n, z2, oVar2, e10 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e10).getDiagnosticInfo() : null);
                W(qVar);
                q qVar2 = this.f8133n0;
                if (qVar2 == null) {
                    this.f8133n0 = qVar;
                } else {
                    this.f8133n0 = new q(qVar2.getMessage(), qVar2.getCause(), qVar2.f8109v, qVar2.f8110w, qVar2.f8111x, qVar2.f8112y);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.f8133n0;
                }
            }
        }
        this.f8132m0 = null;
    }

    public boolean V(t1.o oVar) {
        return true;
    }

    public abstract void W(Exception exc);

    public abstract void X(long j8, long j9, String str);

    public abstract void Y(String str);

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d9, code lost:
    
        if (r4.e(r2) != false) goto L120;
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c2.h Z(sc.b r13) throws c2.o {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.s.Z(sc.b):c2.h");
    }

    public abstract void a0(t1.o oVar, MediaFormat mediaFormat);

    public void c0(long j8) {
        this.V0 = j8;
        while (true) {
            ArrayDeque arrayDeque = this.W;
            if (arrayDeque.isEmpty() || j8 < ((r) arrayDeque.peek()).f8114a) {
                return;
            }
            r rVar = (r) arrayDeque.poll();
            rVar.getClass();
            o0(rVar);
            d0();
        }
    }

    public abstract void d0();

    public final void f0() throws c2.o {
        int i = this.I0;
        if (i == 1) {
            I();
            return;
        }
        if (i == 2) {
            I();
            w0();
        } else if (i != 3) {
            this.P0 = true;
            j0();
        } else {
            i0();
            T();
        }
    }

    public abstract boolean g0(long j8, long j9, l lVar, ByteBuffer byteBuffer, int i, int i10, int i11, long j10, boolean z2, boolean z10, t1.o oVar);

    @Override // c2.f
    public final long h(long j8, long j9) {
        return O(j8, j9);
    }

    public final boolean h0(int i) throws c2.o {
        sc.b bVar = this.f1724x;
        bVar.G();
        DecoderInputBuffer decoderInputBuffer = this.R;
        decoderInputBuffer.clear();
        int iW = w(bVar, decoderInputBuffer, i | 4);
        if (iW == -5) {
            Z(bVar);
            return true;
        }
        if (iW != -4 || !decoderInputBuffer.isEndOfStream()) {
            return false;
        }
        this.O0 = true;
        f0();
        return false;
    }

    public final void i0() {
        try {
            l lVar = this.f8127h0;
            if (lVar != null) {
                lVar.release();
                this.T0.f1734b++;
                o oVar = this.o0;
                oVar.getClass();
                Y(oVar.f8099a);
            }
            this.f8127h0 = null;
            try {
                MediaCrypto mediaCrypto = this.f8123d0;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.f8127h0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.f8123d0;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public abstract void j0();

    public final void k0() {
        this.M0 = -9223372036854775807L;
        this.N0 = -9223372036854775807L;
        this.V0 = -9223372036854775807L;
        this.E0 = false;
        this.U.clear();
        this.T.clear();
        this.D0 = false;
        g0 g0Var = this.X;
        g0Var.getClass();
        g0Var.f4632a = u1.g.f12629a;
        g0Var.f4634c = 0;
        g0Var.f4633b = 2;
    }

    public void l0() {
        this.f8142x0 = -1;
        this.S.data = null;
        this.f8143y0 = -1;
        this.f8144z0 = null;
        this.M0 = -9223372036854775807L;
        this.N0 = -9223372036854775807L;
        this.V0 = -9223372036854775807L;
        this.f8141w0 = -9223372036854775807L;
        this.K0 = false;
        this.f8140v0 = -9223372036854775807L;
        this.J0 = false;
        this.f8137s0 = false;
        this.f8138t0 = false;
        this.A0 = false;
        this.B0 = false;
        this.H0 = 0;
        this.I0 = 0;
        this.G0 = this.F0 ? 1 : 0;
        this.Y0 = false;
        this.Z0 = -9223372036854775807L;
        this.f8120a1 = -9223372036854775807L;
    }

    @Override // c2.f
    public boolean m() {
        if (this.Y == null) {
            return false;
        }
        if (n() || this.f8143y0 >= 0) {
            return true;
        }
        if (this.f8141w0 == -9223372036854775807L) {
            return false;
        }
        this.B.getClass();
        return SystemClock.elapsedRealtime() < this.f8141w0;
    }

    public final void m0() {
        l0();
        this.S0 = null;
        this.f8132m0 = null;
        this.o0 = null;
        this.f8128i0 = null;
        this.f8129j0 = null;
        this.f8130k0 = false;
        this.L0 = false;
        this.f8131l0 = -1.0f;
        this.f8134p0 = 0;
        this.f8135q0 = false;
        this.f8136r0 = false;
        this.f8139u0 = false;
        this.F0 = false;
        this.G0 = 0;
    }

    public final void n0(h2.h hVar) {
        d0.d.t(this.f8119a0, hVar);
        this.f8119a0 = hVar;
    }

    @Override // c2.f
    public void o() {
        this.Y = null;
        o0(r.f8113e);
        this.W.clear();
        if (!this.C0) {
            J();
        } else {
            this.C0 = false;
            k0();
        }
    }

    public final void o0(r rVar) {
        this.U0 = rVar;
        if (rVar.f8116c != -9223372036854775807L) {
            this.W0 = true;
            b0();
        }
    }

    public boolean p0(DecoderInputBuffer decoderInputBuffer) {
        return false;
    }

    @Override // c2.f
    public void q(boolean z2, long j8) throws c2.o {
        this.O0 = false;
        this.P0 = false;
        this.R0 = false;
        if (this.C0) {
            k0();
        } else if (J()) {
            T();
        }
        if (this.U0.f8117d.h() > 0) {
            this.Q0 = true;
        }
        this.U0.f8117d.b();
        this.W.clear();
    }

    public boolean q0() {
        return true;
    }

    public boolean r0(o oVar) {
        return true;
    }

    public boolean s0() {
        int i = this.I0;
        if (i == 3 || ((this.f8135q0 && !this.L0) || (this.f8136r0 && this.K0))) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        try {
            w0();
            return false;
        } catch (c2.o e7) {
            w1.a.D("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e7);
            return true;
        }
    }

    public boolean t0(t1.o oVar) {
        return false;
    }

    public abstract int u0(j jVar, t1.o oVar);

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // c2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void v(t1.o[] r12, long r13, long r15, o2.d0 r17) {
        /*
            r11 = this;
            l2.r r12 = r11.U0
            long r0 = r12.f8116c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            l2.r r4 = new l2.r
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.o0(r4)
            boolean r12 = r11.X0
            if (r12 == 0) goto L56
            r11.d0()
            return
        L24:
            java.util.ArrayDeque r12 = r11.W
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L57
            long r0 = r11.M0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3c
            long r4 = r11.V0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L57
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L57
        L3c:
            l2.r r4 = new l2.r
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.o0(r4)
            l2.r r12 = r11.U0
            long r12 = r12.f8116c
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L56
            r11.d0()
        L56:
            return
        L57:
            l2.r r0 = new l2.r
            long r1 = r11.M0
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.s.v(t1.o[], long, long, o2.d0):void");
    }

    public final boolean v0(t1.o oVar) throws c2.o {
        if (this.f8127h0 != null && this.I0 != 3 && this.C != 0) {
            float f = this.f8126g0;
            oVar.getClass();
            t1.o[] oVarArr = this.E;
            oVarArr.getClass();
            float fM = M(f, oVar, oVarArr);
            float f4 = this.f8131l0;
            if (f4 != fM) {
                if (fM == -1.0f) {
                    if (this.J0) {
                        this.H0 = 1;
                        this.I0 = 3;
                        return false;
                    }
                    i0();
                    T();
                    return false;
                }
                if (f4 != -1.0f || fM > this.Q) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fM);
                    l lVar = this.f8127h0;
                    lVar.getClass();
                    lVar.b(bundle);
                    this.f8131l0 = fM;
                }
            }
        }
        return true;
    }

    public final void w0() throws c2.o {
        h2.h hVar = this.f8121b0;
        hVar.getClass();
        a2.b bVarG = hVar.g();
        if (bVarG instanceof h2.u) {
            try {
                MediaCrypto mediaCrypto = this.f8123d0;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((h2.u) bVarG).f6107b);
            } catch (MediaCryptoException e7) {
                throw f(e7, this.Y, false, 6006);
            }
        }
        n0(this.f8121b0);
        this.H0 = 0;
        this.I0 = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0078 A[LOOP:1: B:31:0x0053->B:41:0x0078, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099 A[LOOP:2: B:42:0x0079->B:52:0x0099, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0079 A[EDGE_INSN: B:87:0x0079->B:90:? BREAK  A[LOOP:1: B:31:0x0053->B:41:0x0078], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009a A[EDGE_INSN: B:88:0x009a->B:53:0x009a BREAK  A[LOOP:2: B:42:0x0079->B:52:0x0099], SYNTHETIC] */
    @Override // c2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void x(long r12, long r14) throws c2.o {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.s.x(long, long):void");
    }

    public final void x0(long j8) {
        t1.o oVar = (t1.o) this.U0.f8117d.f(j8);
        if (oVar == null && this.W0 && this.f8129j0 != null) {
            oVar = (t1.o) this.U0.f8117d.e();
        }
        if (oVar != null) {
            this.Z = oVar;
        } else if (!this.f8130k0 || this.Z == null) {
            return;
        }
        t1.o oVar2 = this.Z;
        oVar2.getClass();
        a0(oVar2, this.f8129j0);
        this.f8130k0 = false;
        this.W0 = false;
    }

    @Override // c2.f
    public void z(float f, float f4) throws c2.o {
        this.f8125f0 = f;
        this.f8126g0 = f4;
        v0(this.f8128i0);
    }

    public void b0() {
    }

    public void e0(DecoderInputBuffer decoderInputBuffer) {
    }
}
