package vf;

import com.google.android.gms.internal.measurement.kc;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class n implements e {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f13630v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c f13631w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f13632x;

    public n(t tVar) {
        de.i.e(tVar, "source");
        this.f13630v = tVar;
        this.f13631w = new c();
    }

    @Override // vf.e
    public final c F() {
        return this.f13631w;
    }

    @Override // vf.e
    public final String M(long j8) throws EOFException {
        if (j8 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j8).toString());
        }
        long j9 = j8 == Long.MAX_VALUE ? Long.MAX_VALUE : j8 + 1;
        long jI = i((byte) 10, 0L, j9);
        c cVar = this.f13631w;
        if (jI != -1) {
            return wf.a.a(jI, cVar);
        }
        if (j9 < Long.MAX_VALUE && u(j9) && cVar.m(j9 - 1) == 13 && u(j9 + 1) && cVar.m(j9) == 10) {
            return wf.a.a(j9, cVar);
        }
        c cVar2 = new c();
        cVar.i(cVar2, 0L, Math.min(32, cVar.f13603w));
        throw new EOFException("\\n not found: limit=" + Math.min(cVar.f13603w, j8) + " content=" + cVar2.q(cVar2.f13603w).b() + (char) 8230);
    }

    @Override // vf.t
    public final long V(long j8, c cVar) {
        de.i.e(cVar, "sink");
        if (j8 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j8).toString());
        }
        if (this.f13632x) {
            throw new IllegalStateException("closed");
        }
        c cVar2 = this.f13631w;
        if (cVar2.f13603w == 0) {
            if (j8 == 0) {
                return 0L;
            }
            if (this.f13630v.V(8192L, cVar2) == -1) {
                return -1L;
            }
        }
        return cVar2.V(Math.min(j8, cVar2.f13603w), cVar);
    }

    public final boolean a() {
        if (this.f13632x) {
            throw new IllegalStateException("closed");
        }
        c cVar = this.f13631w;
        return cVar.l() && this.f13630v.V(8192L, cVar) == -1;
    }

    @Override // vf.e
    public final void a0(long j8) throws EOFException {
        if (!u(j8)) {
            throw new EOFException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f13632x) {
            return;
        }
        this.f13632x = true;
        this.f13630v.close();
        this.f13631w.a();
    }

    @Override // vf.e
    public final int d0(k kVar) throws EOFException {
        de.i.e(kVar, "options");
        if (this.f13632x) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            c cVar = this.f13631w;
            int iB = wf.a.b(cVar, kVar, true);
            if (iB != -2) {
                if (iB != -1) {
                    cVar.skip(kVar.f13620v[iB].a());
                    return iB;
                }
            } else if (this.f13630v.V(8192L, cVar) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // vf.t
    public final v g() {
        return this.f13630v.g();
    }

    public final long i(byte b9, long j8, long j9) {
        if (this.f13632x) {
            throw new IllegalStateException("closed");
        }
        if (0 > j9) {
            throw new IllegalArgumentException(("fromIndex=0 toIndex=" + j9).toString());
        }
        long jMax = 0;
        while (jMax < j9) {
            c cVar = this.f13631w;
            byte b10 = b9;
            long j10 = j9;
            long jA = cVar.A(b10, jMax, j10);
            if (jA != -1) {
                return jA;
            }
            long j11 = cVar.f13603w;
            if (j11 >= j10 || this.f13630v.V(8192L, cVar) == -1) {
                break;
            }
            jMax = Math.max(jMax, j11);
            b9 = b10;
            j9 = j10;
        }
        return -1L;
    }

    @Override // vf.e
    public final String i0(Charset charset) {
        de.i.e(charset, "charset");
        t tVar = this.f13630v;
        c cVar = this.f13631w;
        cVar.o0(tVar);
        return cVar.i0(charset);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f13632x;
    }

    @Override // vf.e
    public final InputStream k0() {
        return new kc(this, 3);
    }

    public final long l(f fVar) {
        int i;
        int i10;
        long j8;
        int i11;
        int i12;
        de.i.e(fVar, "targetBytes");
        if (this.f13632x) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        while (true) {
            c cVar = this.f13631w;
            cVar.getClass();
            de.i.e(fVar, "targetBytes");
            long j9 = 0;
            if (jMax < 0) {
                throw new IllegalArgumentException(("fromIndex < 0: " + jMax).toString());
            }
            o oVar = cVar.f13602v;
            if (oVar == null) {
                j8 = -1;
            } else {
                long j10 = cVar.f13603w;
                int i13 = 0;
                if (j10 - jMax < jMax) {
                    while (j10 > jMax) {
                        oVar = oVar.f13638g;
                        de.i.b(oVar);
                        j10 -= (long) (oVar.f13635c - oVar.f13634b);
                    }
                    if (fVar.a() == 2) {
                        byte bD = fVar.d(0);
                        byte bD2 = fVar.d(1);
                        long j11 = jMax;
                        while (j10 < cVar.f13603w) {
                            byte[] bArr = oVar.f13633a;
                            i11 = (int) ((((long) oVar.f13634b) + j11) - j10);
                            int i14 = oVar.f13635c;
                            while (i11 < i14) {
                                byte b9 = bArr[i11];
                                if (b9 == bD || b9 == bD2) {
                                    i12 = oVar.f13634b;
                                    j8 = ((long) (i11 - i12)) + j10;
                                    break;
                                }
                                i11++;
                            }
                            j11 = j10 + ((long) (oVar.f13635c - oVar.f13634b));
                            oVar = oVar.f;
                            de.i.b(oVar);
                            j10 = j11;
                        }
                        j8 = -1;
                    } else {
                        byte[] bArrC = fVar.c();
                        long j12 = jMax;
                        while (j10 < cVar.f13603w) {
                            byte[] bArr2 = oVar.f13633a;
                            i11 = (int) ((((long) oVar.f13634b) + j12) - j10);
                            int i15 = oVar.f13635c;
                            while (i11 < i15) {
                                byte b10 = bArr2[i11];
                                int length = bArrC.length;
                                for (int i16 = i13; i16 < length; i16++) {
                                    if (b10 == bArrC[i16]) {
                                        i12 = oVar.f13634b;
                                        j8 = ((long) (i11 - i12)) + j10;
                                        break;
                                    }
                                }
                                i11++;
                                i13 = 0;
                            }
                            j12 = ((long) (oVar.f13635c - oVar.f13634b)) + j10;
                            oVar = oVar.f;
                            de.i.b(oVar);
                            j10 = j12;
                            i13 = 0;
                        }
                        j8 = -1;
                    }
                } else {
                    while (true) {
                        long j13 = ((long) (oVar.f13635c - oVar.f13634b)) + j9;
                        if (j13 > jMax) {
                            break;
                        }
                        oVar = oVar.f;
                        de.i.b(oVar);
                        j9 = j13;
                    }
                    if (fVar.a() == 2) {
                        byte bD3 = fVar.d(0);
                        byte bD4 = fVar.d(1);
                        long j14 = jMax;
                        while (j9 < cVar.f13603w) {
                            byte[] bArr3 = oVar.f13633a;
                            i = (int) ((((long) oVar.f13634b) + j14) - j9);
                            int i17 = oVar.f13635c;
                            while (i < i17) {
                                byte b11 = bArr3[i];
                                if (b11 == bD3 || b11 == bD4) {
                                    i10 = oVar.f13634b;
                                    j8 = j9 + ((long) (i - i10));
                                    break;
                                }
                                i++;
                            }
                            j14 = ((long) (oVar.f13635c - oVar.f13634b)) + j9;
                            oVar = oVar.f;
                            de.i.b(oVar);
                            j9 = j14;
                        }
                        j8 = -1;
                    } else {
                        int i18 = 0;
                        byte[] bArrC2 = fVar.c();
                        long j15 = jMax;
                        while (j9 < cVar.f13603w) {
                            byte[] bArr4 = oVar.f13633a;
                            i = (int) ((((long) oVar.f13634b) + j15) - j9);
                            int i19 = oVar.f13635c;
                            while (i < i19) {
                                byte b12 = bArr4[i];
                                int length2 = bArrC2.length;
                                for (int i20 = i18; i20 < length2; i20++) {
                                    if (b12 == bArrC2[i20]) {
                                        i10 = oVar.f13634b;
                                        j8 = j9 + ((long) (i - i10));
                                        break;
                                    }
                                }
                                i++;
                                i18 = 0;
                            }
                            j15 = ((long) (oVar.f13635c - oVar.f13634b)) + j9;
                            oVar = oVar.f;
                            de.i.b(oVar);
                            j9 = j15;
                            i18 = 0;
                        }
                        j8 = -1;
                    }
                }
            }
            if (j8 != -1) {
                return j8;
            }
            long j16 = cVar.f13603w;
            if (this.f13630v.V(8192L, cVar) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j16);
        }
    }

    public final int m() throws EOFException {
        a0(4L);
        int i = this.f13631w.readInt();
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    @Override // vf.e
    public final f q(long j8) throws EOFException {
        a0(j8);
        return this.f13631w.q(j8);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        de.i.e(byteBuffer, "sink");
        c cVar = this.f13631w;
        if (cVar.f13603w == 0 && this.f13630v.V(8192L, cVar) == -1) {
            return -1;
        }
        return cVar.read(byteBuffer);
    }

    @Override // vf.e
    public final byte readByte() throws EOFException {
        a0(1L);
        return this.f13631w.readByte();
    }

    @Override // vf.e
    public final int readInt() throws EOFException {
        a0(4L);
        return this.f13631w.readInt();
    }

    @Override // vf.e
    public final short readShort() throws EOFException {
        a0(2L);
        return this.f13631w.readShort();
    }

    @Override // vf.e
    public final void skip(long j8) throws EOFException {
        if (this.f13632x) {
            throw new IllegalStateException("closed");
        }
        while (j8 > 0) {
            c cVar = this.f13631w;
            if (cVar.f13603w == 0 && this.f13630v.V(8192L, cVar) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j8, cVar.f13603w);
            cVar.skip(jMin);
            j8 -= jMin;
        }
    }

    public final String toString() {
        return "buffer(" + this.f13630v + ')';
    }

    @Override // vf.e
    public final boolean u(long j8) {
        c cVar;
        if (j8 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j8).toString());
        }
        if (this.f13632x) {
            throw new IllegalStateException("closed");
        }
        do {
            cVar = this.f13631w;
            if (cVar.f13603w >= j8) {
                return true;
            }
        } while (this.f13630v.V(8192L, cVar) != -1);
        return false;
    }
}
