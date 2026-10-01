package com.google.android.gms.internal.measurement;

import androidx.media3.decoder.DecoderInputBuffer;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DataFormatException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class kc extends InputStream {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f2825v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f2826w;

    public /* synthetic */ kc(Closeable closeable, int i) {
        this.f2825v = i;
        this.f2826w = closeable;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        long jMin;
        switch (this.f2825v) {
            case 2:
                jMin = Math.min(((vf.c) this.f2826w).f13603w, Integer.MAX_VALUE);
                break;
            case 3:
                vf.n nVar = (vf.n) this.f2826w;
                if (nVar.f13632x) {
                    throw new IOException("closed");
                }
                jMin = Math.min(nVar.f13631w.f13603w, Integer.MAX_VALUE);
                break;
            default:
                return super.available();
        }
        return (int) jMin;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        switch (this.f2825v) {
            case 2:
                break;
            case 3:
                ((vf.n) this.f2826w).close();
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        switch (this.f2825v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                byte[] bArr = new byte[1];
                if (read(bArr, 0, 1) == -1) {
                    return -1;
                }
                return bArr[0];
            case 1:
                byte[] bArr2 = new byte[1];
                if (((w0) this.f2826w).k(bArr2, 0, 1) == -1) {
                    return -1;
                }
                return bArr2[0];
            case 2:
                vf.c cVar = (vf.c) this.f2826w;
                if (cVar.f13603w > 0) {
                    return cVar.readByte() & 255;
                }
                return -1;
            default:
                vf.n nVar = (vf.n) this.f2826w;
                vf.c cVar2 = nVar.f13631w;
                if (nVar.f13632x) {
                    throw new IOException("closed");
                }
                if (cVar2.f13603w == 0 && nVar.f13630v.V(8192L, cVar2) == -1) {
                    return -1;
                }
                return cVar2.readByte() & 255;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j8) {
        switch (this.f2825v) {
            case 1:
                if (j8 <= 0) {
                    return 0L;
                }
                int i = j8 > 2147483647L ? Integer.MAX_VALUE : (int) j8;
                ((w0) this.f2826w).l(i);
                return i;
            default:
                return super.skip(j8);
        }
    }

    public String toString() {
        switch (this.f2825v) {
            case 2:
                return ((vf.c) this.f2826w) + ".inputStream()";
            case 3:
                return ((vf.n) this.f2826w) + ".inputStream()";
            default:
                return super.toString();
        }
    }

    @Override // java.io.InputStream
    public long transferTo(OutputStream outputStream) throws IOException {
        switch (this.f2825v) {
            case 3:
                de.i.e(outputStream, "out");
                vf.n nVar = (vf.n) this.f2826w;
                vf.c cVar = nVar.f13631w;
                if (nVar.f13632x) {
                    throw new IOException("closed");
                }
                long j8 = 0;
                long j9 = 0;
                while (true) {
                    if (cVar.f13603w == j8 && nVar.f13630v.V(8192L, cVar) == -1) {
                        return j9;
                    }
                    long j10 = cVar.f13603w;
                    j9 += j10;
                    va.t1.c(j10, 0L, j10);
                    vf.o oVar = cVar.f13602v;
                    while (j10 > j8) {
                        de.i.b(oVar);
                        int iMin = (int) Math.min(j10, oVar.f13635c - oVar.f13634b);
                        outputStream.write(oVar.f13633a, oVar.f13634b, iMin);
                        int i = oVar.f13634b + iMin;
                        oVar.f13634b = i;
                        long j11 = iMin;
                        cVar.f13603w -= j11;
                        j10 -= j11;
                        if (i == oVar.f13635c) {
                            vf.o oVarA = oVar.a();
                            cVar.f13602v = oVarA;
                            vf.p.a(oVar);
                            oVar = oVarA;
                        }
                        j8 = 0;
                    }
                }
                break;
            default:
                return super.transferTo(outputStream);
        }
    }

    public kc(lc lcVar, w0 w0Var) {
        this.f2825v = 1;
        this.f2826w = w0Var;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i10) throws IOException {
        switch (this.f2825v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                lc lcVar = (lc) this.f2826w;
                try {
                    int iInflate = lcVar.f2857v.inflate(bArr, i, i10);
                    if (iInflate > 0) {
                        return iInflate;
                    }
                    if (i10 == 0) {
                        return 0;
                    }
                    if (lcVar.f2857v.getRemaining() == 0) {
                        return -1;
                    }
                    int remaining = lcVar.f2857v.getRemaining();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 70 + String.valueOf(remaining).length());
                    sb2.append("Read no bytes (requested up to ");
                    sb2.append(i10);
                    sb2.append(") but did not reach end of stream, had ");
                    sb2.append(remaining);
                    throw new IOException(sb2.toString());
                } catch (DataFormatException e7) {
                    throw new IOException(e7);
                }
            case 1:
                return ((w0) this.f2826w).k(bArr, i, i10);
            case 2:
                de.i.e(bArr, "sink");
                return ((vf.c) this.f2826w).read(bArr, i, i10);
            default:
                de.i.e(bArr, "data");
                vf.n nVar = (vf.n) this.f2826w;
                vf.c cVar = nVar.f13631w;
                if (!nVar.f13632x) {
                    va.t1.c(bArr.length, i, i10);
                    if (cVar.f13603w == 0 && nVar.f13630v.V(8192L, cVar) == -1) {
                        return -1;
                    }
                    return cVar.read(bArr, i, i10);
                }
                throw new IOException("closed");
        }
    }

    private final void a() {
    }
}
