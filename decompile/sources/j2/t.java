package j2;

import a2.q0;
import a2.y1;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import c2.l0;
import j4.b0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class t extends a2.g {

    /* renamed from: d1, reason: collision with root package name */
    public static final byte[] f7110d1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public int A0;
    public ByteBuffer B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public int I0;
    public int J0;
    public int K0;
    public boolean L0;
    public boolean M0;
    public boolean N0;
    public long O0;
    public final m P;
    public long P0;
    public final l Q;
    public boolean Q0;
    public final float R;
    public boolean R0;
    public final y1.h S;
    public boolean S0;
    public final y1.h T;
    public boolean T0;
    public final y1.h U;
    public a2.q U0;
    public final j V;
    public a2.h V0;
    public final MediaCodec.BufferInfo W;
    public s W0;
    public final ArrayDeque X;
    public long X0;
    public final l0 Y;
    public boolean Y0;
    public r1.q Z;
    public boolean Z0;

    /* renamed from: a0, reason: collision with root package name */
    public r1.q f7111a0;

    /* renamed from: a1, reason: collision with root package name */
    public boolean f7112a1;

    /* renamed from: b0, reason: collision with root package name */
    public f2.i f7113b0;

    /* renamed from: b1, reason: collision with root package name */
    public long f7114b1;

    /* renamed from: c0, reason: collision with root package name */
    public f2.i f7115c0;
    public long c1;

    /* renamed from: d0, reason: collision with root package name */
    public q0 f7116d0;

    /* renamed from: e0, reason: collision with root package name */
    public MediaCrypto f7117e0;

    /* renamed from: f0, reason: collision with root package name */
    public final long f7118f0;

    /* renamed from: g0, reason: collision with root package name */
    public float f7119g0;

    /* renamed from: h0, reason: collision with root package name */
    public float f7120h0;

    /* renamed from: i0, reason: collision with root package name */
    public n f7121i0;

    /* renamed from: j0, reason: collision with root package name */
    public r1.q f7122j0;

    /* renamed from: k0, reason: collision with root package name */
    public MediaFormat f7123k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f7124l0;

    /* renamed from: m0, reason: collision with root package name */
    public float f7125m0;

    /* renamed from: n0, reason: collision with root package name */
    public ArrayDeque f7126n0;
    public r o0;

    /* renamed from: p0, reason: collision with root package name */
    public q f7127p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f7128q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f7129r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f7130s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f7131t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f7132u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f7133v0;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f7134w0;

    /* renamed from: x0, reason: collision with root package name */
    public long f7135x0;

    /* renamed from: y0, reason: collision with root package name */
    public long f7136y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f7137z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v4, types: [j2.j, y1.h] */
    /* JADX WARN: Type inference failed for: r4v6, types: [c2.l0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [a2.h, java.lang.Object] */
    public t(int i6, m mVar, float f3) {
        super(i6);
        l lVar = l.f7089y;
        this.P = mVar;
        this.Q = lVar;
        this.R = f3;
        this.S = new y1.h(0, 0);
        this.T = new y1.h(0, 0);
        this.U = new y1.h(2, 0);
        ?? hVar = new y1.h(2, 0);
        hVar.H = 32;
        this.V = hVar;
        this.W = new MediaCodec.BufferInfo();
        this.f7119g0 = 1.0f;
        this.f7120h0 = 1.0f;
        this.f7118f0 = -9223372036854775807L;
        this.X = new ArrayDeque();
        this.W0 = s.f7105e;
        hVar.b(0);
        hVar.f14812z.order(ByteOrder.nativeOrder());
        ?? obj = new Object();
        obj.f1884a = s1.g.f11986a;
        obj.f1886c = 0;
        obj.f1885b = 2;
        this.Y = obj;
        this.f7125m0 = -1.0f;
        this.f7128q0 = 0;
        this.I0 = 0;
        this.f7137z0 = -1;
        this.A0 = -1;
        this.f7136y0 = -9223372036854775807L;
        this.O0 = -9223372036854775807L;
        this.P0 = -9223372036854775807L;
        this.X0 = -9223372036854775807L;
        this.f7135x0 = -9223372036854775807L;
        this.J0 = 0;
        this.K0 = 0;
        this.V0 = new Object();
        this.f7114b1 = -9223372036854775807L;
        this.c1 = -9223372036854775807L;
    }

    @Override // a2.g
    public final int A(r1.q qVar) {
        try {
            return v0(this.Q, qVar);
        } catch (w e10) {
            throw a(e10, qVar, false, 4002);
        }
    }

    @Override // a2.g
    public final int B() {
        return 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int, boolean] */
    public final boolean C(long j, long j10) {
        j jVar;
        int i6;
        int i10;
        int i11;
        byte b10;
        u1.c.g(!this.R0);
        j jVar2 = this.V;
        if (jVar2.g()) {
            ByteBuffer byteBuffer = jVar2.f14812z;
            int i12 = this.A0;
            int i13 = jVar2.G;
            long j11 = jVar2.B;
            boolean T = T(this.I, jVar2.F);
            boolean isEndOfStream = jVar2.isEndOfStream();
            r1.q qVar = this.f7111a0;
            qVar.getClass();
            jVar = jVar2;
            if (h0(j, j10, null, byteBuffer, i12, 0, i13, j11, T, isEndOfStream, qVar)) {
                d0(jVar.F);
                jVar.clear();
            } else {
                return false;
            }
        } else {
            jVar = jVar2;
        }
        if (this.Q0) {
            this.R0 = true;
            return false;
        }
        ?? r12 = 0;
        boolean z10 = this.F0;
        y1.h hVar = this.U;
        if (z10) {
            u1.c.g(jVar.f(hVar));
            this.F0 = false;
        }
        if (this.G0) {
            if (jVar.g()) {
                return true;
            }
            this.E0 = false;
            l0();
            this.G0 = false;
            U();
            if (!this.E0) {
                return false;
            }
        }
        u1.c.g(!this.Q0);
        b0 b0Var = this.f246z;
        b0Var.i();
        hVar.clear();
        while (true) {
            hVar.clear();
            int w10 = w(b0Var, hVar, r12);
            if (w10 != -5) {
                if (w10 != -4) {
                    if (w10 == -3) {
                        if (k()) {
                            this.P0 = this.O0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    if (hVar.isEndOfStream()) {
                        this.Q0 = true;
                        this.P0 = this.O0;
                        break;
                    }
                    this.O0 = Math.max(this.O0, hVar.B);
                    if (k() || this.T.isLastSample()) {
                        this.P0 = this.O0;
                    }
                    byte[] bArr = null;
                    if (this.S0) {
                        r1.q qVar2 = this.Z;
                        qVar2.getClass();
                        this.f7111a0 = qVar2;
                        if (Objects.equals(qVar2.f11670n, "audio/opus") && !this.f7111a0.f11673q.isEmpty()) {
                            byte[] bArr2 = (byte[]) this.f7111a0.f11673q.get(r12);
                            int i14 = (bArr2[10] & 255) | ((bArr2[11] & 255) << 8);
                            r1.p a10 = this.f7111a0.a();
                            a10.H = i14;
                            this.f7111a0 = new r1.q(a10);
                        }
                        b0(this.f7111a0, null);
                        this.S0 = r12;
                    }
                    hVar.d();
                    r1.q qVar3 = this.f7111a0;
                    if (qVar3 != null && Objects.equals(qVar3.f11670n, "audio/opus")) {
                        if (hVar.hasSupplementalData()) {
                            hVar.f14810x = this.f7111a0;
                            R(hVar);
                        }
                        if (this.I - hVar.B <= 80000) {
                            List list = this.f7111a0.f11673q;
                            l0 l0Var = this.Y;
                            l0Var.getClass();
                            hVar.f14812z.getClass();
                            if (hVar.f14812z.limit() - hVar.f14812z.position() != 0) {
                                if (l0Var.f1885b == 2 && (list.size() == 1 || list.size() == 3)) {
                                    bArr = (byte[]) list.get(r12);
                                }
                                ByteBuffer byteBuffer2 = hVar.f14812z;
                                int position = byteBuffer2.position();
                                int limit = byteBuffer2.limit();
                                int i15 = limit - position;
                                int i16 = (i15 + 255) / 255;
                                int i17 = i16 + 27 + i15;
                                if (l0Var.f1885b == 2) {
                                    if (bArr != null) {
                                        i6 = bArr.length + 28;
                                    } else {
                                        i6 = 47;
                                    }
                                    i17 = i6 + 44 + i17;
                                } else {
                                    i6 = 0;
                                }
                                if (l0Var.f1884a.capacity() < i17) {
                                    l0Var.f1884a = ByteBuffer.allocate(i17).order(ByteOrder.LITTLE_ENDIAN);
                                } else {
                                    l0Var.f1884a.clear();
                                }
                                ByteBuffer byteBuffer3 = l0Var.f1884a;
                                if (l0Var.f1885b == 2) {
                                    if (bArr != null) {
                                        l0.a(byteBuffer3, 0L, 0, 1, true);
                                        i11 = limit;
                                        byteBuffer3.put(a8.i.b(bArr.length));
                                        byteBuffer3.put(bArr);
                                        i10 = position;
                                        byteBuffer3.putInt(22, u1.a0.m(byteBuffer3.arrayOffset(), byteBuffer3.array(), bArr.length + 28, 0));
                                        byteBuffer3.position(bArr.length + 28);
                                    } else {
                                        i10 = position;
                                        i11 = limit;
                                        byteBuffer3.put(l0.f1882d);
                                    }
                                    byteBuffer3.put(l0.f1883e);
                                } else {
                                    i10 = position;
                                    i11 = limit;
                                }
                                byte b11 = byteBuffer2.get(0);
                                if (byteBuffer2.limit() > 1) {
                                    b10 = byteBuffer2.get(1);
                                } else {
                                    b10 = 0;
                                }
                                int n10 = l0Var.f1886c + ((int) ((y2.a.n(b11, b10) * 48000) / 1000000));
                                l0Var.f1886c = n10;
                                l0.a(byteBuffer3, n10, l0Var.f1885b, i16, false);
                                for (int i18 = 0; i18 < i16; i18++) {
                                    if (i15 >= 255) {
                                        byteBuffer3.put((byte) -1);
                                        i15 -= 255;
                                    } else {
                                        byteBuffer3.put((byte) i15);
                                        i15 = 0;
                                    }
                                }
                                int i19 = i11;
                                for (int i20 = i10; i20 < i19; i20++) {
                                    byteBuffer3.put(byteBuffer2.get(i20));
                                }
                                byteBuffer2.position(byteBuffer2.limit());
                                byteBuffer3.flip();
                                if (l0Var.f1885b == 2) {
                                    byteBuffer3.putInt(i6 + 66, u1.a0.m(byteBuffer3.arrayOffset() + i6 + 44, byteBuffer3.array(), byteBuffer3.limit() - byteBuffer3.position(), 0));
                                } else {
                                    byteBuffer3.putInt(22, u1.a0.m(byteBuffer3.arrayOffset(), byteBuffer3.array(), byteBuffer3.limit() - byteBuffer3.position(), 0));
                                }
                                l0Var.f1885b++;
                                l0Var.f1884a = byteBuffer3;
                                hVar.clear();
                                hVar.b(l0Var.f1884a.remaining());
                                hVar.f14812z.put(l0Var.f1884a);
                                hVar.d();
                            }
                        }
                    }
                    if (jVar.g()) {
                        long j12 = this.I;
                        if (T(j12, jVar.F) != T(j12, hVar.B)) {
                            break;
                        }
                    }
                    if (!jVar.f(hVar)) {
                        break;
                    }
                    r12 = 0;
                }
            } else {
                a0(b0Var);
                break;
            }
        }
        this.F0 = true;
        if (jVar.g()) {
            jVar.d();
        }
        if (!jVar.g() && !this.Q0 && !this.G0) {
            return false;
        }
        return true;
    }

    public abstract a2.i D(q qVar, r1.q qVar2, r1.q qVar3);

    public p E(IllegalStateException illegalStateException, q qVar) {
        return new p(illegalStateException, qVar);
    }

    public final boolean F() {
        if (this.L0) {
            this.J0 = 1;
            if (this.f7130s0) {
                this.K0 = 3;
                return false;
            }
            this.K0 = 2;
            return true;
        }
        x0();
        return true;
    }

    public final boolean G(long j, long j10) {
        boolean z10;
        boolean z11;
        MediaCodec.BufferInfo bufferInfo;
        boolean z12;
        boolean z13;
        boolean h02;
        boolean z14;
        ByteBuffer byteBuffer;
        int i6;
        int i10;
        boolean z15;
        boolean z16;
        r1.q qVar;
        int s;
        n nVar = this.f7121i0;
        nVar.getClass();
        int i11 = this.A0;
        MediaCodec.BufferInfo bufferInfo2 = this.W;
        if (i11 < 0) {
            if (this.f7131t0 && this.M0) {
                try {
                    s = nVar.s(bufferInfo2);
                } catch (IllegalStateException unused) {
                    g0();
                    if (this.R0) {
                        j0();
                    }
                }
            } else {
                s = nVar.s(bufferInfo2);
            }
            if (s < 0) {
                if (s == -2) {
                    this.N0 = true;
                    n nVar2 = this.f7121i0;
                    nVar2.getClass();
                    MediaFormat g10 = nVar2.g();
                    if (this.f7128q0 != 0 && g10.getInteger("width") == 32 && g10.getInteger("height") == 32) {
                        this.f7133v0 = true;
                        return true;
                    }
                    this.f7123k0 = g10;
                    this.f7124l0 = true;
                    return true;
                }
                if (this.f7134w0 && (this.Q0 || this.J0 == 2)) {
                    g0();
                }
                long j11 = this.f7135x0;
                if (j11 != -9223372036854775807L) {
                    long j12 = j11 + 100;
                    this.D.getClass();
                    if (j12 < System.currentTimeMillis()) {
                        g0();
                        return false;
                    }
                }
                return false;
            }
            if (this.f7133v0) {
                this.f7133v0 = false;
                nVar.f(s);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                g0();
                return false;
            }
            this.A0 = s;
            ByteBuffer z17 = nVar.z(s);
            this.B0 = z17;
            if (z17 != null) {
                z17.position(bufferInfo2.offset);
                this.B0.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            y0(bufferInfo2.presentationTimeUs);
        }
        long j13 = bufferInfo2.presentationTimeUs;
        if (j13 < this.I) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.C0 = z10;
        long j14 = this.P0;
        if (j14 != -9223372036854775807L && j14 <= j13) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.D0 = z11;
        if (this.f7112a1) {
            long j15 = this.f7114b1;
            if (j15 != -9223372036854775807L && j13 <= j15) {
                this.f7112a1 = false;
                this.f7114b1 = -9223372036854775807L;
            } else {
                this.f7114b1 = j13;
                this.C0 = true;
                this.D0 = false;
            }
        }
        if (this.f7131t0 && this.M0) {
            try {
                byteBuffer = this.B0;
                i6 = this.A0;
                i10 = bufferInfo2.flags;
                z15 = this.C0;
                z16 = this.D0;
                qVar = this.f7111a0;
                qVar.getClass();
                bufferInfo = bufferInfo2;
                z12 = false;
                z13 = true;
            } catch (IllegalStateException unused2) {
                z12 = false;
            }
            try {
                h02 = h0(j, j10, nVar, byteBuffer, i6, i10, 1, j13, z15, z16, qVar);
            } catch (IllegalStateException unused3) {
                g0();
                if (this.R0) {
                    j0();
                    return z12;
                }
                return z12;
            }
        } else {
            bufferInfo = bufferInfo2;
            z12 = false;
            z13 = true;
            ByteBuffer byteBuffer2 = this.B0;
            int i12 = this.A0;
            int i13 = bufferInfo.flags;
            boolean z18 = this.C0;
            boolean z19 = this.D0;
            r1.q qVar2 = this.f7111a0;
            qVar2.getClass();
            h02 = h0(j, j10, nVar, byteBuffer2, i12, i13, 1, j13, z18, z19, qVar2);
        }
        if (h02) {
            d0(bufferInfo.presentationTimeUs);
            if ((bufferInfo.flags & 4) != 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (!z14 && this.M0 && this.D0) {
                this.D.getClass();
                this.f7135x0 = System.currentTimeMillis();
            }
            this.A0 = -1;
            this.B0 = null;
            if (!z14) {
                return z13;
            }
            g0();
            return z12;
        }
        return z12;
    }

    public final boolean H() {
        n nVar = this.f7121i0;
        if (nVar == null || this.J0 == 2 || this.Q0) {
            return false;
        }
        int i6 = this.f7137z0;
        y1.h hVar = this.T;
        if (i6 < 0) {
            int o10 = nVar.o();
            this.f7137z0 = o10;
            if (o10 < 0) {
                return false;
            }
            hVar.f14812z = nVar.x(o10);
            hVar.clear();
        }
        if (this.J0 == 1) {
            if (!this.f7134w0) {
                this.M0 = true;
                nVar.d(this.f7137z0, 0, 0L, 4);
                this.f7137z0 = -1;
                hVar.f14812z = null;
            }
            this.J0 = 2;
            return false;
        }
        if (this.f7132u0) {
            this.f7132u0 = false;
            ByteBuffer byteBuffer = hVar.f14812z;
            byteBuffer.getClass();
            byteBuffer.put(f7110d1);
            nVar.d(this.f7137z0, 38, 0L, 0);
            this.f7137z0 = -1;
            hVar.f14812z = null;
            this.L0 = true;
            return true;
        }
        if (this.I0 == 1) {
            int i10 = 0;
            while (true) {
                r1.q qVar = this.f7122j0;
                qVar.getClass();
                if (i10 >= qVar.f11673q.size()) {
                    break;
                }
                byte[] bArr = (byte[]) this.f7122j0.f11673q.get(i10);
                ByteBuffer byteBuffer2 = hVar.f14812z;
                byteBuffer2.getClass();
                byteBuffer2.put(bArr);
                i10++;
            }
            this.I0 = 2;
        }
        ByteBuffer byteBuffer3 = hVar.f14812z;
        byteBuffer3.getClass();
        int position = byteBuffer3.position();
        b0 b0Var = this.f246z;
        b0Var.i();
        try {
            int w10 = w(b0Var, hVar, 0);
            if (w10 == -3) {
                if (!k()) {
                    return false;
                }
                this.P0 = this.O0;
                return false;
            }
            if (w10 == -5) {
                if (this.I0 == 2) {
                    hVar.clear();
                    this.I0 = 1;
                }
                a0(b0Var);
                return true;
            }
            if (hVar.isEndOfStream()) {
                this.P0 = this.O0;
                if (this.I0 == 2) {
                    hVar.clear();
                    this.I0 = 1;
                }
                this.Q0 = true;
                if (!this.L0) {
                    g0();
                    return false;
                }
                if (this.f7134w0) {
                    return false;
                }
                this.M0 = true;
                nVar.d(this.f7137z0, 0, 0L, 4);
                this.f7137z0 = -1;
                hVar.f14812z = null;
                return false;
            }
            if (!this.L0 && !hVar.isKeyFrame()) {
                hVar.clear();
                if (this.I0 == 2) {
                    this.I0 = 1;
                    return true;
                }
            } else if (!q0(hVar)) {
                boolean flag = hVar.getFlag(1073741824);
                if (flag) {
                    y1.d dVar = hVar.f14811y;
                    if (position == 0) {
                        dVar.getClass();
                    } else {
                        if (dVar.f14804d == null) {
                            int[] iArr = new int[1];
                            dVar.f14804d = iArr;
                            dVar.f14809i.numBytesOfClearData = iArr;
                        }
                        int[] iArr2 = dVar.f14804d;
                        iArr2[0] = iArr2[0] + position;
                    }
                }
                long j = hVar.B;
                if (this.S0) {
                    ArrayDeque arrayDeque = this.X;
                    if (!arrayDeque.isEmpty()) {
                        s3.c cVar = ((s) arrayDeque.peekLast()).f7109d;
                        r1.q qVar2 = this.Z;
                        qVar2.getClass();
                        cVar.a(j, qVar2);
                    } else {
                        s3.c cVar2 = this.W0.f7109d;
                        r1.q qVar3 = this.Z;
                        qVar3.getClass();
                        cVar2.a(j, qVar3);
                    }
                    this.S0 = false;
                }
                this.O0 = Math.max(this.O0, j);
                if (k() || hVar.isLastSample()) {
                    this.P0 = this.O0;
                }
                hVar.d();
                if (hVar.hasSupplementalData()) {
                    R(hVar);
                }
                f0(hVar);
                int L = L(hVar);
                if (Build.VERSION.SDK_INT < 34 || (L & 32) == 0) {
                    y1 y1Var = this.A;
                    y1Var.getClass();
                    if (!y1Var.f505b) {
                        this.c1 = Math.max(this.c1, hVar.B);
                    }
                }
                if (flag) {
                    nVar.c(this.f7137z0, hVar.f14811y, j, L);
                } else {
                    int i11 = this.f7137z0;
                    ByteBuffer byteBuffer4 = hVar.f14812z;
                    byteBuffer4.getClass();
                    nVar.d(i11, byteBuffer4.limit(), j, L);
                }
                this.f7137z0 = -1;
                hVar.f14812z = null;
                this.L0 = true;
                this.I0 = 0;
                this.V0.f252c++;
                return true;
            }
            return true;
        } catch (y1.g e10) {
            X(e10);
            i0(0);
            I();
            return true;
        }
    }

    public final void I() {
        try {
            n nVar = this.f7121i0;
            u1.c.h(nVar);
            nVar.flush();
        } finally {
            m0();
        }
    }

    public final boolean J() {
        if (this.f7121i0 != null) {
            if (t0()) {
                j0();
                return true;
            }
            if (r0()) {
                I();
                return false;
            }
            long j = this.c1;
            if (j != -9223372036854775807L && this.I <= j && this.X0 < j) {
                this.f7112a1 = true;
                this.c1 = -9223372036854775807L;
            }
        }
        return false;
    }

    public final List K(boolean z10) {
        r1.q qVar = this.Z;
        qVar.getClass();
        l lVar = this.Q;
        ArrayList O = O(lVar, qVar, z10);
        if (O.isEmpty() && z10) {
            ArrayList O2 = O(lVar, qVar, false);
            if (!O2.isEmpty()) {
                u1.a.p("MediaCodecRenderer", "Drm session requires secure decoder for " + qVar.f11670n + ", but no secure decoder available. Trying to proceed with " + O2 + ".");
            }
            return O2;
        }
        return O;
    }

    public int L(y1.h hVar) {
        return 0;
    }

    public boolean M() {
        return false;
    }

    public abstract float N(float f3, r1.q qVar, r1.q[] qVarArr);

    public abstract ArrayList O(l lVar, r1.q qVar, boolean z10);

    public long P(long j, long j10) {
        return super.c(j, j10);
    }

    public abstract androidx.lifecycle.d Q(q qVar, r1.q qVar2, MediaCrypto mediaCrypto, float f3);

    public abstract void R(y1.h hVar);

    /* JADX WARN: Removed duplicated region for block: B:32:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S(j2.q r13, android.media.MediaCrypto r14) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.t.S(j2.q, android.media.MediaCrypto):void");
    }

    public final boolean T(long j, long j10) {
        if (j10 < j) {
            r1.q qVar = this.f7111a0;
            if (qVar == null || !Objects.equals(qVar.f11670n, "audio/opus") || j - j10 > 80000) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0073, code lost:
    
        if (r7 != 4) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008c, code lost:
    
        if (r2.getError() != null) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U() {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.t.U():void");
    }

    public final void V(MediaCrypto mediaCrypto, boolean z10) {
        String str;
        r1.q qVar = this.Z;
        qVar.getClass();
        if (this.f7126n0 == null) {
            try {
                List K = K(z10);
                this.f7126n0 = new ArrayDeque();
                ArrayList arrayList = (ArrayList) K;
                if (!arrayList.isEmpty()) {
                    this.f7126n0.add((q) arrayList.get(0));
                }
                this.o0 = null;
            } catch (w e10) {
                throw new r(qVar, e10, z10, -49998);
            }
        }
        if (!this.f7126n0.isEmpty()) {
            ArrayDeque arrayDeque = this.f7126n0;
            arrayDeque.getClass();
            while (this.f7121i0 == null) {
                q qVar2 = (q) arrayDeque.peekFirst();
                qVar2.getClass();
                if (!W(qVar) || !s0(qVar2)) {
                    return;
                }
                try {
                    S(qVar2, mediaCrypto);
                } catch (Exception e11) {
                    u1.a.q("MediaCodecRenderer", "Failed to initialize decoder: " + qVar2, e11);
                    arrayDeque.removeFirst();
                    String str2 = "Decoder init failed: " + qVar2.f7091a + ", " + qVar;
                    String str3 = qVar.f11670n;
                    if (e11 instanceof MediaCodec.CodecException) {
                        str = ((MediaCodec.CodecException) e11).getDiagnosticInfo();
                    } else {
                        str = null;
                    }
                    r rVar = new r(str2, e11, str3, z10, qVar2, str);
                    X(rVar);
                    r rVar2 = this.o0;
                    if (rVar2 == null) {
                        this.o0 = rVar;
                    } else {
                        this.o0 = new r(rVar2.getMessage(), rVar2.getCause(), rVar2.f7102x, rVar2.f7103y, rVar2.f7104z, rVar2.A);
                    }
                    if (arrayDeque.isEmpty()) {
                        throw this.o0;
                    }
                }
            }
            this.f7126n0 = null;
            return;
        }
        throw new r(qVar, null, z10, -49999);
    }

    public boolean W(r1.q qVar) {
        return true;
    }

    public abstract void X(Exception exc);

    public abstract void Y(String str, long j, long j10);

    public abstract void Z(String str);

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0163, code lost:
    
        if (F() == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e1, code lost:
    
        if (r4.e(r2) != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x011d, code lost:
    
        if (F() == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0151, code lost:
    
        if (F() == false) goto L82;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a2.i a0(j4.b0 r14) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.t.a0(j4.b0):a2.i");
    }

    public abstract void b0(r1.q qVar, MediaFormat mediaFormat);

    @Override // a2.g
    public final long c(long j, long j10) {
        return P(j, j10);
    }

    public void d0(long j) {
        this.X0 = j;
        while (true) {
            ArrayDeque arrayDeque = this.X;
            if (!arrayDeque.isEmpty() && j >= ((s) arrayDeque.peek()).f7106a) {
                s sVar = (s) arrayDeque.poll();
                sVar.getClass();
                p0(sVar);
                e0();
            } else {
                return;
            }
        }
    }

    public abstract void e0();

    public final void g0() {
        int i6 = this.K0;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    this.R0 = true;
                    k0();
                    return;
                } else {
                    j0();
                    U();
                    return;
                }
            }
            I();
            x0();
            return;
        }
        I();
    }

    public abstract boolean h0(long j, long j10, n nVar, ByteBuffer byteBuffer, int i6, int i10, int i11, long j11, boolean z10, boolean z11, r1.q qVar);

    public final boolean i0(int i6) {
        b0 b0Var = this.f246z;
        b0Var.i();
        y1.h hVar = this.S;
        hVar.clear();
        int w10 = w(b0Var, hVar, i6 | 4);
        if (w10 == -5) {
            a0(b0Var);
            return true;
        }
        if (w10 == -4 && hVar.isEndOfStream()) {
            this.Q0 = true;
            g0();
            return false;
        }
        return false;
    }

    public final void j0() {
        try {
            n nVar = this.f7121i0;
            if (nVar != null) {
                nVar.a();
                this.V0.f251b++;
                q qVar = this.f7127p0;
                qVar.getClass();
                Z(qVar.f7091a);
            }
            this.f7121i0 = null;
            try {
                MediaCrypto mediaCrypto = this.f7117e0;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.f7121i0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.f7117e0;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public abstract void k0();

    public final void l0() {
        this.O0 = -9223372036854775807L;
        this.P0 = -9223372036854775807L;
        this.X0 = -9223372036854775807L;
        this.G0 = false;
        this.V.clear();
        this.U.clear();
        this.F0 = false;
        l0 l0Var = this.Y;
        l0Var.getClass();
        l0Var.f1884a = s1.g.f11986a;
        l0Var.f1886c = 0;
        l0Var.f1885b = 2;
    }

    @Override // a2.g
    public boolean m() {
        if (this.Z != null) {
            if (!n() && this.A0 < 0) {
                if (this.f7136y0 != -9223372036854775807L) {
                    this.D.getClass();
                    if (SystemClock.elapsedRealtime() < this.f7136y0) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public void m0() {
        this.f7137z0 = -1;
        this.T.f14812z = null;
        this.A0 = -1;
        this.B0 = null;
        this.O0 = -9223372036854775807L;
        this.P0 = -9223372036854775807L;
        this.X0 = -9223372036854775807L;
        this.f7136y0 = -9223372036854775807L;
        this.M0 = false;
        this.f7135x0 = -9223372036854775807L;
        this.L0 = false;
        this.f7132u0 = false;
        this.f7133v0 = false;
        this.C0 = false;
        this.D0 = false;
        this.J0 = 0;
        this.K0 = 0;
        this.I0 = this.H0 ? 1 : 0;
        this.f7112a1 = false;
        this.f7114b1 = -9223372036854775807L;
        this.c1 = -9223372036854775807L;
    }

    public final void n0() {
        m0();
        this.U0 = null;
        this.f7126n0 = null;
        this.f7127p0 = null;
        this.f7122j0 = null;
        this.f7123k0 = null;
        this.f7124l0 = false;
        this.N0 = false;
        this.f7125m0 = -1.0f;
        this.f7128q0 = 0;
        this.f7129r0 = false;
        this.f7130s0 = false;
        this.f7131t0 = false;
        this.f7134w0 = false;
        this.H0 = false;
        this.I0 = 0;
    }

    @Override // a2.g
    public void o() {
        this.Z = null;
        p0(s.f7105e);
        this.X.clear();
        if (this.E0) {
            this.E0 = false;
            l0();
        } else {
            J();
        }
    }

    public final void o0(f2.i iVar) {
        r4.a.z(this.f7113b0, iVar);
        this.f7113b0 = iVar;
    }

    public final void p0(s sVar) {
        this.W0 = sVar;
        if (sVar.f7108c != -9223372036854775807L) {
            this.Y0 = true;
            c0();
        }
    }

    @Override // a2.g
    public void q(boolean z10, long j) {
        this.Q0 = false;
        this.R0 = false;
        this.T0 = false;
        if (this.E0) {
            l0();
        } else if (J()) {
            U();
        }
        if (this.W0.f7109d.h() > 0) {
            this.S0 = true;
        }
        this.W0.f7109d.b();
        this.X.clear();
    }

    public boolean q0(y1.h hVar) {
        return false;
    }

    public boolean r0() {
        return true;
    }

    public boolean s0(q qVar) {
        return true;
    }

    public boolean t0() {
        boolean z10;
        int i6 = this.K0;
        if (i6 == 3 || ((this.f7129r0 && !this.N0) || (this.f7130s0 && this.M0))) {
            return true;
        }
        if (i6 == 2) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 23) {
                z10 = true;
            } else {
                z10 = false;
            }
            u1.c.g(z10);
            if (i10 >= 23) {
                try {
                    x0();
                    return false;
                } catch (a2.q e10) {
                    u1.a.q("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean u0(r1.q qVar) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // a2.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void v(r1.q[] r12, long r13, long r15, q2.c0 r17) {
        /*
            r11 = this;
            j2.s r12 = r11.W0
            long r0 = r12.f7108c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            j2.s r4 = new j2.s
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.p0(r4)
            boolean r12 = r11.Z0
            if (r12 == 0) goto L56
            r11.e0()
            return
        L24:
            java.util.ArrayDeque r12 = r11.X
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L57
            long r0 = r11.O0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3c
            long r4 = r11.X0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L57
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 < 0) goto L57
        L3c:
            j2.s r4 = new j2.s
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.p0(r4)
            j2.s r12 = r11.W0
            long r12 = r12.f7108c
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 == 0) goto L56
            r11.e0()
        L56:
            return
        L57:
            j2.s r0 = new j2.s
            long r1 = r11.O0
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.t.v(r1.q[], long, long, q2.c0):void");
    }

    public abstract int v0(l lVar, r1.q qVar);

    public final boolean w0(r1.q qVar) {
        if (Build.VERSION.SDK_INT >= 23 && this.f7121i0 != null && this.K0 != 3 && this.E != 0) {
            float f3 = this.f7120h0;
            qVar.getClass();
            r1.q[] qVarArr = this.G;
            qVarArr.getClass();
            float N = N(f3, qVar, qVarArr);
            float f10 = this.f7125m0;
            if (f10 != N) {
                if (N == -1.0f) {
                    if (this.L0) {
                        this.J0 = 1;
                        this.K0 = 3;
                        return false;
                    }
                    j0();
                    U();
                    return false;
                }
                if (f10 != -1.0f || N > this.R) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", N);
                    n nVar = this.f7121i0;
                    nVar.getClass();
                    nVar.b(bundle);
                    this.f7125m0 = N;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0078 A[LOOP:1: B:33:0x0053->B:42:0x0078, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0079 A[EDGE_INSN: B:43:0x0079->B:44:0x0079 BREAK  A[LOOP:1: B:33:0x0053->B:42:0x0078], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099 A[LOOP:2: B:45:0x0079->B:54:0x0099, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a A[EDGE_INSN: B:55:0x009a->B:56:0x009a BREAK  A[LOOP:2: B:45:0x0079->B:54:0x0099], SYNTHETIC] */
    @Override // a2.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void x(long r12, long r14) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.t.x(long, long):void");
    }

    public final void x0() {
        f2.i iVar = this.f7115c0;
        iVar.getClass();
        y1.b f3 = iVar.f();
        if (f3 instanceof f2.u) {
            try {
                MediaCrypto mediaCrypto = this.f7117e0;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((f2.u) f3).f4686b);
            } catch (MediaCryptoException e10) {
                throw a(e10, this.Z, false, 6006);
            }
        }
        o0(this.f7115c0);
        this.J0 = 0;
        this.K0 = 0;
    }

    public final void y0(long j) {
        r1.q qVar = (r1.q) this.W0.f7109d.f(j);
        if (qVar == null && this.Y0 && this.f7123k0 != null) {
            qVar = (r1.q) this.W0.f7109d.e();
        }
        if (qVar != null) {
            this.f7111a0 = qVar;
        } else if (!this.f7124l0 || this.f7111a0 == null) {
            return;
        }
        r1.q qVar2 = this.f7111a0;
        qVar2.getClass();
        b0(qVar2, this.f7123k0);
        this.f7124l0 = false;
        this.Y0 = false;
    }

    @Override // a2.g
    public void z(float f3, float f10) {
        this.f7119g0 = f3;
        this.f7120h0 = f10;
        w0(this.f7122j0);
    }

    public void c0() {
    }

    public void f0(y1.h hVar) {
    }
}
