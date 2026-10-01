package vf;

import com.google.android.gms.internal.measurement.kc;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import va.t1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c implements e, d, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public o f13602v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f13603w;

    public final long A(byte b9, long j8, long j9) {
        o oVar;
        long j10 = 0;
        if (0 > j8 || j8 > j9) {
            throw new IllegalArgumentException(("size=" + this.f13603w + " fromIndex=" + j8 + " toIndex=" + j9).toString());
        }
        long j11 = this.f13603w;
        if (j9 > j11) {
            j9 = j11;
        }
        if (j8 == j9 || (oVar = this.f13602v) == null) {
            return -1L;
        }
        if (j11 - j8 < j8) {
            while (j11 > j8) {
                oVar = oVar.f13638g;
                de.i.b(oVar);
                j11 -= (long) (oVar.f13635c - oVar.f13634b);
            }
            while (j11 < j9) {
                byte[] bArr = oVar.f13633a;
                int iMin = (int) Math.min(oVar.f13635c, (((long) oVar.f13634b) + j9) - j11);
                for (int i = (int) ((((long) oVar.f13634b) + j8) - j11); i < iMin; i++) {
                    if (bArr[i] == b9) {
                        return ((long) (i - oVar.f13634b)) + j11;
                    }
                }
                j11 += (long) (oVar.f13635c - oVar.f13634b);
                oVar = oVar.f;
                de.i.b(oVar);
                j8 = j11;
            }
            return -1L;
        }
        while (true) {
            long j12 = ((long) (oVar.f13635c - oVar.f13634b)) + j10;
            if (j12 > j8) {
                break;
            }
            oVar = oVar.f;
            de.i.b(oVar);
            j10 = j12;
        }
        while (j10 < j9) {
            byte[] bArr2 = oVar.f13633a;
            int iMin2 = (int) Math.min(oVar.f13635c, (((long) oVar.f13634b) + j9) - j10);
            for (int i10 = (int) ((((long) oVar.f13634b) + j8) - j10); i10 < iMin2; i10++) {
                if (bArr2[i10] == b9) {
                    return ((long) (i10 - oVar.f13634b)) + j10;
                }
            }
            j10 += (long) (oVar.f13635c - oVar.f13634b);
            oVar = oVar.f;
            de.i.b(oVar);
            j8 = j10;
        }
        return -1L;
    }

    public final byte[] B(long j8) throws EOFException {
        if (j8 < 0 || j8 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j8).toString());
        }
        if (this.f13603w < j8) {
            throw new EOFException();
        }
        int i = (int) j8;
        byte[] bArr = new byte[i];
        int i10 = 0;
        while (i10 < i) {
            int i11 = read(bArr, i10, i - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
        return bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2 A[EDGE_INSN: B:44:0x00a2->B:38:0x00a2 BREAK  A[LOOP:0: B:5:0x000c->B:46:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long D() throws java.io.EOFException {
        /*
            r15 = this;
            long r0 = r15.f13603w
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto La9
            r0 = 0
            r1 = r0
            r6 = r1
            r4 = r2
        Lc:
            vf.o r7 = r15.f13602v
            de.i.b(r7)
            byte[] r8 = r7.f13633a
            int r9 = r7.f13634b
            int r10 = r7.f13635c
        L17:
            if (r9 >= r10) goto L8e
            r11 = r8[r9]
            r12 = 48
            if (r11 < r12) goto L26
            r12 = 57
            if (r11 > r12) goto L26
            int r12 = r11 + (-48)
            goto L3b
        L26:
            r12 = 97
            if (r11 < r12) goto L31
            r12 = 102(0x66, float:1.43E-43)
            if (r11 > r12) goto L31
            int r12 = r11 + (-87)
            goto L3b
        L31:
            r12 = 65
            if (r11 < r12) goto L66
            r12 = 70
            if (r11 > r12) goto L66
            int r12 = r11 + (-55)
        L3b:
            r13 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r13 = r13 & r4
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 != 0) goto L4b
            r11 = 4
            long r4 = r4 << r11
            long r11 = (long) r12
            long r4 = r4 | r11
            int r9 = r9 + 1
            int r1 = r1 + 1
            goto L17
        L4b:
            vf.c r0 = new vf.c
            r0.<init>()
            r0.r0(r4)
            r0.p0(r11)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.H()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L66:
            r6 = 1
            if (r1 == 0) goto L6a
            goto L8e
        L6a:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            int r2 = r11 >> 4
            r2 = r2 & 15
            char[] r3 = wf.b.f14030a
            char r2 = r3[r2]
            r4 = r11 & 15
            char r3 = r3[r4]
            r4 = 2
            char[] r4 = new char[r4]
            r4[r0] = r2
            r4[r6] = r3
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L8e:
            if (r9 != r10) goto L9a
            vf.o r8 = r7.a()
            r15.f13602v = r8
            vf.p.a(r7)
            goto L9c
        L9a:
            r7.f13634b = r9
        L9c:
            if (r6 != 0) goto La2
            vf.o r7 = r15.f13602v
            if (r7 != 0) goto Lc
        La2:
            long r2 = r15.f13603w
            long r0 = (long) r1
            long r2 = r2 - r0
            r15.f13603w = r2
            return r4
        La9:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vf.c.D():long");
    }

    public final String G(long j8, Charset charset) throws EOFException {
        de.i.e(charset, "charset");
        if (j8 < 0 || j8 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j8).toString());
        }
        if (this.f13603w < j8) {
            throw new EOFException();
        }
        if (j8 == 0) {
            return "";
        }
        o oVar = this.f13602v;
        de.i.b(oVar);
        int i = oVar.f13634b;
        if (((long) i) + j8 > oVar.f13635c) {
            return new String(B(j8), charset);
        }
        int i10 = (int) j8;
        String str = new String(oVar.f13633a, i, i10, charset);
        int i11 = oVar.f13634b + i10;
        oVar.f13634b = i11;
        this.f13603w -= j8;
        if (i11 == oVar.f13635c) {
            this.f13602v = oVar.a();
            p.a(oVar);
        }
        return str;
    }

    public final String H() {
        return G(this.f13603w, ke.a.f7954a);
    }

    public final f I(int i) {
        if (i == 0) {
            return f.f13604y;
        }
        t1.c(this.f13603w, 0L, i);
        o oVar = this.f13602v;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i) {
            de.i.b(oVar);
            int i13 = oVar.f13635c;
            int i14 = oVar.f13634b;
            if (i13 == i14) {
                throw new AssertionError("s.limit == s.pos");
            }
            i11 += i13 - i14;
            i12++;
            oVar = oVar.f;
        }
        byte[][] bArr = new byte[i12][];
        int[] iArr = new int[i12 * 2];
        o oVar2 = this.f13602v;
        int i15 = 0;
        while (i10 < i) {
            de.i.b(oVar2);
            bArr[i15] = oVar2.f13633a;
            i10 += oVar2.f13635c - oVar2.f13634b;
            iArr[i15] = Math.min(i10, i);
            iArr[i15 + i12] = oVar2.f13634b;
            oVar2.f13636d = true;
            i15++;
            oVar2 = oVar2.f;
        }
        return new q(bArr, iArr);
    }

    @Override // vf.e
    public final String M(long j8) throws EOFException {
        if (j8 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j8).toString());
        }
        long j9 = j8 != Long.MAX_VALUE ? j8 + 1 : Long.MAX_VALUE;
        long jA = A((byte) 10, 0L, j9);
        if (jA != -1) {
            return wf.a.a(jA, this);
        }
        if (j9 < this.f13603w && m(j9 - 1) == 13 && m(j9) == 10) {
            return wf.a.a(j9, this);
        }
        c cVar = new c();
        i(cVar, 0L, Math.min(32, this.f13603w));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f13603w, j8) + " content=" + cVar.q(cVar.f13603w).b() + (char) 8230);
    }

    @Override // vf.t
    public final long V(long j8, c cVar) {
        de.i.e(cVar, "sink");
        if (j8 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j8).toString());
        }
        long j9 = this.f13603w;
        if (j9 == 0) {
            return -1L;
        }
        if (j8 > j9) {
            j8 = j9;
        }
        cVar.y(j8, this);
        return j8;
    }

    public final void a() throws EOFException {
        skip(this.f13603w);
    }

    @Override // vf.e
    public final void a0(long j8) throws EOFException {
        if (this.f13603w < j8) {
            throw new EOFException();
        }
    }

    @Override // vf.d
    public final /* bridge */ /* synthetic */ d b0(String str) {
        v0(str);
        return this;
    }

    public final o c0(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        o oVar = this.f13602v;
        if (oVar == null) {
            o oVarB = p.b();
            this.f13602v = oVarB;
            oVarB.f13638g = oVarB;
            oVarB.f = oVarB;
            return oVarB;
        }
        o oVar2 = oVar.f13638g;
        de.i.b(oVar2);
        if (oVar2.f13635c + i <= 8192 && oVar2.f13637e) {
            return oVar2;
        }
        o oVarB2 = p.b();
        oVar2.b(oVarB2);
        return oVarB2;
    }

    public final Object clone() {
        c cVar = new c();
        if (this.f13603w == 0) {
            return cVar;
        }
        o oVar = this.f13602v;
        de.i.b(oVar);
        o oVarC = oVar.c();
        cVar.f13602v = oVarC;
        oVarC.f13638g = oVarC;
        oVarC.f = oVarC;
        for (o oVar2 = oVar.f; oVar2 != oVar; oVar2 = oVar2.f) {
            o oVar3 = oVarC.f13638g;
            de.i.b(oVar3);
            de.i.b(oVar2);
            oVar3.b(oVar2.c());
        }
        cVar.f13603w = this.f13603w;
        return cVar;
    }

    @Override // vf.e
    public final int d0(k kVar) throws EOFException {
        de.i.e(kVar, "options");
        int iB = wf.a.b(this, kVar, false);
        if (iB == -1) {
            return -1;
        }
        skip(kVar.f13620v[iB].a());
        return iB;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        long j8 = this.f13603w;
        c cVar = (c) obj;
        if (j8 != cVar.f13603w) {
            return false;
        }
        if (j8 == 0) {
            return true;
        }
        o oVar = this.f13602v;
        de.i.b(oVar);
        o oVar2 = cVar.f13602v;
        de.i.b(oVar2);
        int i = oVar.f13634b;
        int i10 = oVar2.f13634b;
        long j9 = 0;
        while (j9 < this.f13603w) {
            long jMin = Math.min(oVar.f13635c - i, oVar2.f13635c - i10);
            long j10 = 0;
            while (j10 < jMin) {
                int i11 = i + 1;
                int i12 = i10 + 1;
                if (oVar.f13633a[i] != oVar2.f13633a[i10]) {
                    return false;
                }
                j10++;
                i = i11;
                i10 = i12;
            }
            if (i == oVar.f13635c) {
                oVar = oVar.f;
                de.i.b(oVar);
                i = oVar.f13634b;
            }
            if (i10 == oVar2.f13635c) {
                oVar2 = oVar2.f;
                de.i.b(oVar2);
                i10 = oVar2.f13634b;
            }
            j9 += jMin;
        }
        return true;
    }

    @Override // vf.t
    public final v g() {
        return v.f13643d;
    }

    @Override // vf.d
    public final /* bridge */ /* synthetic */ d h0(f fVar) {
        n0(fVar);
        return this;
    }

    public final int hashCode() {
        o oVar = this.f13602v;
        if (oVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i10 = oVar.f13635c;
            for (int i11 = oVar.f13634b; i11 < i10; i11++) {
                i = (i * 31) + oVar.f13633a[i11];
            }
            oVar = oVar.f;
            de.i.b(oVar);
        } while (oVar != this.f13602v);
        return i;
    }

    public final void i(c cVar, long j8, long j9) {
        de.i.e(cVar, "out");
        long j10 = j8;
        t1.c(this.f13603w, j10, j9);
        if (j9 == 0) {
            return;
        }
        cVar.f13603w += j9;
        o oVar = this.f13602v;
        while (true) {
            de.i.b(oVar);
            long j11 = oVar.f13635c - oVar.f13634b;
            if (j10 < j11) {
                break;
            }
            j10 -= j11;
            oVar = oVar.f;
        }
        o oVar2 = oVar;
        long j12 = j9;
        while (j12 > 0) {
            de.i.b(oVar2);
            o oVarC = oVar2.c();
            int i = oVarC.f13634b + ((int) j10);
            oVarC.f13634b = i;
            oVarC.f13635c = Math.min(i + ((int) j12), oVarC.f13635c);
            o oVar3 = cVar.f13602v;
            if (oVar3 == null) {
                oVarC.f13638g = oVarC;
                oVarC.f = oVarC;
                cVar.f13602v = oVarC;
            } else {
                o oVar4 = oVar3.f13638g;
                de.i.b(oVar4);
                oVar4.b(oVarC);
            }
            j12 -= (long) (oVarC.f13635c - oVarC.f13634b);
            oVar2 = oVar2.f;
            j10 = 0;
        }
    }

    @Override // vf.e
    public final String i0(Charset charset) {
        de.i.e(charset, "charset");
        return G(this.f13603w, charset);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // vf.e
    public final InputStream k0() {
        return new kc(this, 2);
    }

    public final boolean l() {
        return this.f13603w == 0;
    }

    public final byte m(long j8) {
        t1.c(this.f13603w, j8, 1L);
        o oVar = this.f13602v;
        if (oVar == null) {
            de.i.b(null);
            throw null;
        }
        long j9 = this.f13603w;
        if (j9 - j8 < j8) {
            while (j9 > j8) {
                oVar = oVar.f13638g;
                de.i.b(oVar);
                j9 -= (long) (oVar.f13635c - oVar.f13634b);
            }
            return oVar.f13633a[(int) ((((long) oVar.f13634b) + j8) - j9)];
        }
        long j10 = 0;
        while (true) {
            int i = oVar.f13635c;
            int i10 = oVar.f13634b;
            long j11 = ((long) (i - i10)) + j10;
            if (j11 > j8) {
                return oVar.f13633a[(int) ((((long) i10) + j8) - j10)];
            }
            oVar = oVar.f;
            de.i.b(oVar);
            j10 = j11;
        }
    }

    public final void m0(int i, byte[] bArr) {
        de.i.e(bArr, "source");
        int i10 = 0;
        long j8 = i;
        t1.c(bArr.length, 0, j8);
        while (i10 < i) {
            o oVarC0 = c0(1);
            int iMin = Math.min(i - i10, 8192 - oVarC0.f13635c);
            int i11 = i10 + iMin;
            pd.i.X(oVarC0.f13635c, i10, i11, bArr, oVarC0.f13633a);
            oVarC0.f13635c += iMin;
            i10 = i11;
        }
        this.f13603w += j8;
    }

    public final void n0(f fVar) {
        de.i.e(fVar, "byteString");
        fVar.k(this, fVar.a());
    }

    public final void o0(t tVar) {
        de.i.e(tVar, "source");
        while (tVar.V(8192L, this) != -1) {
        }
    }

    public final void p0(int i) {
        o oVarC0 = c0(1);
        byte[] bArr = oVarC0.f13633a;
        int i10 = oVarC0.f13635c;
        oVarC0.f13635c = i10 + 1;
        bArr[i10] = (byte) i;
        this.f13603w++;
    }

    @Override // vf.e
    public final f q(long j8) throws EOFException {
        if (j8 < 0 || j8 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j8).toString());
        }
        if (this.f13603w < j8) {
            throw new EOFException();
        }
        if (j8 < 4096) {
            return new f(B(j8));
        }
        f fVarI = I((int) j8);
        skip(j8);
        return fVarI;
    }

    public final void q0(long j8) {
        boolean z2;
        if (j8 == 0) {
            p0(48);
            return;
        }
        if (j8 < 0) {
            j8 = -j8;
            if (j8 < 0) {
                v0("-9223372036854775808");
                return;
            }
            z2 = true;
        } else {
            z2 = false;
        }
        byte[] bArr = wf.a.f14028a;
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j8)) * 10) >>> 5;
        int i = iNumberOfLeadingZeros + (j8 > wf.a.f14029b[iNumberOfLeadingZeros] ? 1 : 0);
        if (z2) {
            i++;
        }
        o oVarC0 = c0(i);
        byte[] bArr2 = oVarC0.f13633a;
        int i10 = oVarC0.f13635c + i;
        while (j8 != 0) {
            long j9 = 10;
            i10--;
            bArr2[i10] = wf.a.f14028a[(int) (j8 % j9)];
            j8 /= j9;
        }
        if (z2) {
            bArr2[i10 - 1] = 45;
        }
        oVarC0.f13635c += i;
        this.f13603w += (long) i;
    }

    public final void r0(long j8) {
        if (j8 == 0) {
            p0(48);
            return;
        }
        long j9 = (j8 >>> 1) | j8;
        long j10 = j9 | (j9 >>> 2);
        long j11 = j10 | (j10 >>> 4);
        long j12 = j11 | (j11 >>> 8);
        long j13 = j12 | (j12 >>> 16);
        long j14 = j13 | (j13 >>> 32);
        long j15 = j14 - ((j14 >>> 1) & 6148914691236517205L);
        long j16 = ((j15 >>> 2) & 3689348814741910323L) + (j15 & 3689348814741910323L);
        long j17 = ((j16 >>> 4) + j16) & 1085102592571150095L;
        long j18 = j17 + (j17 >>> 8);
        long j19 = j18 + (j18 >>> 16);
        int i = (int) ((((j19 & 63) + ((j19 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        o oVarC0 = c0(i);
        byte[] bArr = oVarC0.f13633a;
        int i10 = oVarC0.f13635c;
        for (int i11 = (i10 + i) - 1; i11 >= i10; i11--) {
            bArr[i11] = wf.a.f14028a[(int) (15 & j8)];
            j8 >>>= 4;
        }
        oVarC0.f13635c += i;
        this.f13603w += (long) i;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        de.i.e(byteBuffer, "sink");
        o oVar = this.f13602v;
        if (oVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), oVar.f13635c - oVar.f13634b);
        byteBuffer.put(oVar.f13633a, oVar.f13634b, iMin);
        int i = oVar.f13634b + iMin;
        oVar.f13634b = i;
        this.f13603w -= (long) iMin;
        if (i == oVar.f13635c) {
            this.f13602v = oVar.a();
            p.a(oVar);
        }
        return iMin;
    }

    @Override // vf.e
    public final byte readByte() {
        if (this.f13603w == 0) {
            throw new EOFException();
        }
        o oVar = this.f13602v;
        de.i.b(oVar);
        int i = oVar.f13634b;
        int i10 = oVar.f13635c;
        int i11 = i + 1;
        byte b9 = oVar.f13633a[i];
        this.f13603w--;
        if (i11 != i10) {
            oVar.f13634b = i11;
            return b9;
        }
        this.f13602v = oVar.a();
        p.a(oVar);
        return b9;
    }

    @Override // vf.e
    public final int readInt() throws EOFException {
        if (this.f13603w < 4) {
            throw new EOFException();
        }
        o oVar = this.f13602v;
        de.i.b(oVar);
        int i = oVar.f13634b;
        int i10 = oVar.f13635c;
        if (i10 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = oVar.f13633a;
        int i11 = i + 3;
        int i12 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i13 = i + 4;
        int i14 = (bArr[i11] & 255) | i12;
        this.f13603w -= 4;
        if (i13 != i10) {
            oVar.f13634b = i13;
            return i14;
        }
        this.f13602v = oVar.a();
        p.a(oVar);
        return i14;
    }

    @Override // vf.e
    public final short readShort() throws EOFException {
        if (this.f13603w < 2) {
            throw new EOFException();
        }
        o oVar = this.f13602v;
        de.i.b(oVar);
        int i = oVar.f13634b;
        int i10 = oVar.f13635c;
        if (i10 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = oVar.f13633a;
        int i11 = i + 1;
        int i12 = (bArr[i] & 255) << 8;
        int i13 = i + 2;
        int i14 = (bArr[i11] & 255) | i12;
        this.f13603w -= 2;
        if (i13 == i10) {
            this.f13602v = oVar.a();
            p.a(oVar);
        } else {
            oVar.f13634b = i13;
        }
        return (short) i14;
    }

    public final void s0(int i) {
        o oVarC0 = c0(4);
        byte[] bArr = oVarC0.f13633a;
        int i10 = oVarC0.f13635c;
        bArr[i10] = (byte) ((i >>> 24) & 255);
        bArr[i10 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i10 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i10 + 3] = (byte) (i & 255);
        oVarC0.f13635c = i10 + 4;
        this.f13603w += 4;
    }

    @Override // vf.e
    public final void skip(long j8) throws EOFException {
        while (j8 > 0) {
            o oVar = this.f13602v;
            if (oVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j8, oVar.f13635c - oVar.f13634b);
            long j9 = iMin;
            this.f13603w -= j9;
            j8 -= j9;
            int i = oVar.f13634b + iMin;
            oVar.f13634b = i;
            if (i == oVar.f13635c) {
                this.f13602v = oVar.a();
                p.a(oVar);
            }
        }
    }

    public final void t0(int i) {
        o oVarC0 = c0(2);
        byte[] bArr = oVarC0.f13633a;
        int i10 = oVarC0.f13635c;
        bArr[i10] = (byte) ((i >>> 8) & 255);
        bArr[i10 + 1] = (byte) (i & 255);
        oVarC0.f13635c = i10 + 2;
        this.f13603w += 2;
    }

    public final String toString() {
        long j8 = this.f13603w;
        if (j8 <= 2147483647L) {
            return I((int) j8).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f13603w).toString());
    }

    @Override // vf.e
    public final boolean u(long j8) {
        return this.f13603w >= j8;
    }

    public final void u0(int i, int i10, String str) {
        char cCharAt;
        de.i.e(str, "string");
        if (i < 0) {
            throw new IllegalArgumentException(d0.d.h(i, "beginIndex < 0: ").toString());
        }
        if (i10 < i) {
            throw new IllegalArgumentException(j4.a.k(i10, i, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i10 > str.length()) {
            StringBuilder sbO = d0.d.o(i10, "endIndex > string.length: ", " > ");
            sbO.append(str.length());
            throw new IllegalArgumentException(sbO.toString().toString());
        }
        while (i < i10) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                o oVarC0 = c0(1);
                byte[] bArr = oVarC0.f13633a;
                int i11 = oVarC0.f13635c - i;
                int iMin = Math.min(i10, 8192 - i11);
                int i12 = i + 1;
                bArr[i + i11] = (byte) cCharAt2;
                while (true) {
                    i = i12;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i12 = i + 1;
                    bArr[i + i11] = (byte) cCharAt;
                }
                int i13 = oVarC0.f13635c;
                int i14 = (i11 + i) - i13;
                oVarC0.f13635c = i13 + i14;
                this.f13603w += (long) i14;
            } else {
                if (cCharAt2 < 2048) {
                    o oVarC02 = c0(2);
                    byte[] bArr2 = oVarC02.f13633a;
                    int i15 = oVarC02.f13635c;
                    bArr2[i15] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i15 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    oVarC02.f13635c = i15 + 2;
                    this.f13603w += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    o oVarC03 = c0(3);
                    byte[] bArr3 = oVarC03.f13633a;
                    int i16 = oVarC03.f13635c;
                    bArr3[i16] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i16 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i16 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    oVarC03.f13635c = i16 + 3;
                    this.f13603w += 3;
                } else {
                    int i17 = i + 1;
                    char cCharAt3 = i17 < i10 ? str.charAt(i17) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        p0(63);
                        i = i17;
                    } else {
                        int i18 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        o oVarC04 = c0(4);
                        byte[] bArr4 = oVarC04.f13633a;
                        int i19 = oVarC04.f13635c;
                        bArr4[i19] = (byte) ((i18 >> 18) | 240);
                        bArr4[i19 + 1] = (byte) (((i18 >> 12) & 63) | 128);
                        bArr4[i19 + 2] = (byte) (((i18 >> 6) & 63) | 128);
                        bArr4[i19 + 3] = (byte) ((i18 & 63) | 128);
                        oVarC04.f13635c = i19 + 4;
                        this.f13603w += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    public final void v0(String str) {
        de.i.e(str, "string");
        u0(0, str.length(), str);
    }

    public final void w0(int i) {
        if (i < 128) {
            p0(i);
            return;
        }
        if (i < 2048) {
            o oVarC0 = c0(2);
            byte[] bArr = oVarC0.f13633a;
            int i10 = oVarC0.f13635c;
            bArr[i10] = (byte) ((i >> 6) | 192);
            bArr[i10 + 1] = (byte) ((i & 63) | 128);
            oVarC0.f13635c = i10 + 2;
            this.f13603w += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            p0(63);
            return;
        }
        if (i < 65536) {
            o oVarC02 = c0(3);
            byte[] bArr2 = oVarC02.f13633a;
            int i11 = oVarC02.f13635c;
            bArr2[i11] = (byte) ((i >> 12) | 224);
            bArr2[i11 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i11 + 2] = (byte) ((i & 63) | 128);
            oVarC02.f13635c = i11 + 3;
            this.f13603w += 3;
            return;
        }
        if (i > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(t1.s(i)));
        }
        o oVarC03 = c0(4);
        byte[] bArr3 = oVarC03.f13633a;
        int i12 = oVarC03.f13635c;
        bArr3[i12] = (byte) ((i >> 18) | 240);
        bArr3[i12 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i12 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i12 + 3] = (byte) ((i & 63) | 128);
        oVarC03.f13635c = i12 + 4;
        this.f13603w += 4;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        de.i.e(byteBuffer, "source");
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            o oVarC0 = c0(1);
            int iMin = Math.min(i, 8192 - oVarC0.f13635c);
            byteBuffer.get(oVarC0.f13633a, oVarC0.f13635c, iMin);
            i -= iMin;
            oVarC0.f13635c += iMin;
        }
        this.f13603w += (long) iRemaining;
        return iRemaining;
    }

    @Override // vf.d
    public final /* bridge */ /* synthetic */ d writeByte(int i) {
        p0(i);
        return this;
    }

    @Override // vf.d
    public final /* bridge */ /* synthetic */ d writeInt(int i) {
        s0(i);
        return this;
    }

    @Override // vf.d
    public final /* bridge */ /* synthetic */ d writeShort(int i) {
        t0(i);
        return this;
    }

    @Override // vf.r
    public final void y(long j8, c cVar) {
        o oVarB;
        de.i.e(cVar, "source");
        if (cVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        t1.c(cVar.f13603w, 0L, j8);
        while (j8 > 0) {
            o oVar = cVar.f13602v;
            de.i.b(oVar);
            int i = oVar.f13635c;
            o oVar2 = cVar.f13602v;
            de.i.b(oVar2);
            long j9 = i - oVar2.f13634b;
            int i10 = 0;
            if (j8 < j9) {
                o oVar3 = this.f13602v;
                o oVar4 = oVar3 != null ? oVar3.f13638g : null;
                if (oVar4 != null && oVar4.f13637e) {
                    if ((((long) oVar4.f13635c) + j8) - ((long) (oVar4.f13636d ? 0 : oVar4.f13634b)) <= 8192) {
                        o oVar5 = cVar.f13602v;
                        de.i.b(oVar5);
                        oVar5.d(oVar4, (int) j8);
                        cVar.f13603w -= j8;
                        this.f13603w += j8;
                        return;
                    }
                }
                o oVar6 = cVar.f13602v;
                de.i.b(oVar6);
                int i11 = (int) j8;
                if (i11 <= 0 || i11 > oVar6.f13635c - oVar6.f13634b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i11 >= 1024) {
                    oVarB = oVar6.c();
                } else {
                    oVarB = p.b();
                    byte[] bArr = oVar6.f13633a;
                    byte[] bArr2 = oVarB.f13633a;
                    int i12 = oVar6.f13634b;
                    pd.i.X(0, i12, i12 + i11, bArr, bArr2);
                }
                oVarB.f13635c = oVarB.f13634b + i11;
                oVar6.f13634b += i11;
                o oVar7 = oVar6.f13638g;
                de.i.b(oVar7);
                oVar7.b(oVarB);
                cVar.f13602v = oVarB;
            }
            o oVar8 = cVar.f13602v;
            de.i.b(oVar8);
            long j10 = oVar8.f13635c - oVar8.f13634b;
            cVar.f13602v = oVar8.a();
            o oVar9 = this.f13602v;
            if (oVar9 == null) {
                this.f13602v = oVar8;
                oVar8.f13638g = oVar8;
                oVar8.f = oVar8;
            } else {
                o oVar10 = oVar9.f13638g;
                de.i.b(oVar10);
                oVar10.b(oVar8);
                o oVar11 = oVar8.f13638g;
                if (oVar11 == oVar8) {
                    throw new IllegalStateException("cannot compact");
                }
                de.i.b(oVar11);
                if (oVar11.f13637e) {
                    int i13 = oVar8.f13635c - oVar8.f13634b;
                    o oVar12 = oVar8.f13638g;
                    de.i.b(oVar12);
                    int i14 = 8192 - oVar12.f13635c;
                    o oVar13 = oVar8.f13638g;
                    de.i.b(oVar13);
                    if (!oVar13.f13636d) {
                        o oVar14 = oVar8.f13638g;
                        de.i.b(oVar14);
                        i10 = oVar14.f13634b;
                    }
                    if (i13 <= i14 + i10) {
                        o oVar15 = oVar8.f13638g;
                        de.i.b(oVar15);
                        oVar8.d(oVar15, i13);
                        oVar8.a();
                        p.a(oVar8);
                    }
                }
            }
            cVar.f13603w -= j10;
            this.f13603w += j10;
            j8 -= j10;
        }
    }

    @Override // vf.d
    public final d write(byte[] bArr) {
        m0(bArr.length, bArr);
        return this;
    }

    public final int read(byte[] bArr, int i, int i10) {
        t1.c(bArr.length, i, i10);
        o oVar = this.f13602v;
        if (oVar == null) {
            return -1;
        }
        int iMin = Math.min(i10, oVar.f13635c - oVar.f13634b);
        byte[] bArr2 = oVar.f13633a;
        int i11 = oVar.f13634b;
        pd.i.X(i, i11, i11 + iMin, bArr2, bArr);
        int i12 = oVar.f13634b + iMin;
        oVar.f13634b = i12;
        this.f13603w -= (long) iMin;
        if (i12 == oVar.f13635c) {
            this.f13602v = oVar.a();
            p.a(oVar);
        }
        return iMin;
    }

    @Override // vf.e
    public final c F() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, vf.r
    public final void close() {
    }

    @Override // vf.d, vf.r, java.io.Flushable
    public final void flush() {
    }
}
