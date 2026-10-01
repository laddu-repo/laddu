package vf;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import va.t1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h implements t {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte f13609v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final n f13610w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Inflater f13611x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final i f13612y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final CRC32 f13613z;

    public h(e eVar) {
        de.i.e(eVar, "source");
        n nVar = new n(eVar);
        this.f13610w = nVar;
        Inflater inflater = new Inflater(true);
        this.f13611x = inflater;
        this.f13612y = new i(nVar, inflater);
        this.f13613z = new CRC32();
    }

    public static void a(int i, int i10, String str) throws IOException {
        if (i10 == i) {
            return;
        }
        throw new IOException(str + ": actual 0x" + ke.h.O(8, t1.s(i10)) + " != expected 0x" + ke.h.O(8, t1.s(i)));
    }

    @Override // vf.t
    public final long V(long j8, c cVar) throws IOException {
        long j9;
        h hVar = this;
        de.i.e(cVar, "sink");
        byte b9 = hVar.f13609v;
        CRC32 crc32 = hVar.f13613z;
        n nVar = hVar.f13610w;
        if (b9 == 0) {
            nVar.a0(10L);
            c cVar2 = nVar.f13631w;
            byte bM = cVar2.m(3L);
            boolean z2 = ((bM >> 1) & 1) == 1;
            if (z2) {
                hVar.i(cVar2, 0L, 10L);
            }
            a(8075, nVar.readShort(), "ID1ID2");
            nVar.skip(8L);
            if (((bM >> 2) & 1) == 1) {
                nVar.a0(2L);
                if (z2) {
                    i(cVar2, 0L, 2L);
                }
                short s3 = cVar2.readShort();
                long j10 = ((short) (((s3 & 255) << 8) | ((s3 & 65280) >>> 8))) & 65535;
                nVar.a0(j10);
                if (z2) {
                    i(cVar2, 0L, j10);
                }
                nVar.skip(j10);
            }
            if (((bM >> 3) & 1) == 1) {
                long jI = nVar.i((byte) 0, 0L, Long.MAX_VALUE);
                if (jI == -1) {
                    throw new EOFException();
                }
                if (z2) {
                    j9 = 2;
                    i(cVar2, 0L, jI + 1);
                } else {
                    j9 = 2;
                }
                nVar.skip(jI + 1);
            } else {
                j9 = 2;
            }
            if (((bM >> 4) & 1) == 1) {
                long j11 = j9;
                long jI2 = nVar.i((byte) 0, 0L, Long.MAX_VALUE);
                if (jI2 == -1) {
                    throw new EOFException();
                }
                if (z2) {
                    j9 = j11;
                    hVar = this;
                    hVar.i(cVar2, 0L, jI2 + 1);
                } else {
                    hVar = this;
                    j9 = j11;
                }
                nVar.skip(jI2 + 1);
            } else {
                hVar = this;
            }
            if (z2) {
                nVar.a0(j9);
                short s10 = cVar2.readShort();
                a((short) (((s10 & 255) << 8) | ((s10 & 65280) >>> 8)), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            hVar.f13609v = (byte) 1;
        }
        if (hVar.f13609v == 1) {
            long j12 = cVar.f13603w;
            long jV = hVar.f13612y.V(8192L, cVar);
            if (jV != -1) {
                hVar.i(cVar, j12, jV);
                return jV;
            }
            hVar.f13609v = (byte) 2;
        }
        if (hVar.f13609v == 2) {
            a(nVar.m(), (int) crc32.getValue(), "CRC");
            a(nVar.m(), (int) hVar.f13611x.getBytesWritten(), "ISIZE");
            hVar.f13609v = (byte) 3;
            if (!nVar.a()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f13612y.close();
    }

    @Override // vf.t
    public final v g() {
        return this.f13610w.f13630v.g();
    }

    public final void i(c cVar, long j8, long j9) {
        o oVar = cVar.f13602v;
        de.i.b(oVar);
        while (true) {
            int i = oVar.f13635c;
            int i10 = oVar.f13634b;
            if (j8 < i - i10) {
                break;
            }
            j8 -= (long) (i - i10);
            oVar = oVar.f;
            de.i.b(oVar);
        }
        while (j9 > 0) {
            int i11 = (int) (((long) oVar.f13634b) + j8);
            int iMin = (int) Math.min(oVar.f13635c - i11, j9);
            this.f13613z.update(oVar.f13633a, i11, iMin);
            j9 -= (long) iMin;
            oVar = oVar.f;
            de.i.b(oVar);
            j8 = 0;
        }
    }
}
