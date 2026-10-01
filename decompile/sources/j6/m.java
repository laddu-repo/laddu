package j6;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m implements a6.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f6948a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f6949b = "MPF".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f6950c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static int g(l lVar, d6.f fVar) {
        try {
            int iM = lVar.m();
            if ((iM & 65496) == 65496 || iM == 19789 || iM == 18761) {
                int iK = k(lVar, 225);
                if (iK != -1) {
                    byte[] bArr = (byte[]) fVar.d(iK, byte[].class);
                    try {
                        return l(lVar, bArr, iK);
                    } finally {
                        fVar.h(bArr);
                    }
                }
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + iM);
                return -1;
            }
        } catch (k unused) {
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType h(l lVar) {
        try {
            int iM = lVar.m();
            if (iM == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int iC = (iM << 8) | lVar.c();
            if (iC == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int iC2 = (iC << 8) | lVar.c();
            if (iC2 == -1991225785) {
                lVar.skip(21L);
                try {
                    return lVar.c() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (k unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (iC2 == 1380533830) {
                lVar.skip(4L);
                if (((lVar.m() << 16) | lVar.m()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int iM2 = (lVar.m() << 16) | lVar.m();
                if ((iM2 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i = iM2 & 255;
                if (i == 88) {
                    lVar.skip(4L);
                    short sC = lVar.c();
                    return (sC & 2) != 0 ? ImageHeaderParser$ImageType.ANIMATED_WEBP : (sC & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                }
                if (i != 76) {
                    return ImageHeaderParser$ImageType.WEBP;
                }
                lVar.skip(4L);
                return (lVar.c() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (((lVar.m() << 16) | lVar.m()) != 1718909296) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int iM3 = (lVar.m() << 16) | lVar.m();
            if (iM3 == 1635150195) {
                return ImageHeaderParser$ImageType.ANIMATED_AVIF;
            }
            int i10 = 0;
            boolean z2 = iM3 == 1635150182;
            lVar.skip(4L);
            int i11 = iC2 - 16;
            if (i11 % 4 == 0) {
                while (i10 < 5 && i11 > 0) {
                    int iM4 = (lVar.m() << 16) | lVar.m();
                    if (iM4 == 1635150195) {
                        return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                    }
                    if (iM4 == 1635150182) {
                        z2 = true;
                    }
                    i10++;
                    i11 -= 4;
                }
            }
            return z2 ? ImageHeaderParser$ImageType.AVIF : ImageHeaderParser$ImageType.UNKNOWN;
        } catch (k unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public static boolean i(l lVar, d6.f fVar) {
        boolean zJ;
        if (h(lVar) == ImageHeaderParser$ImageType.JPEG) {
            int iK = k(lVar, 226);
            while (iK > 0) {
                byte[] bArr = (byte[]) fVar.d(iK, byte[].class);
                try {
                    int iP = lVar.p(iK, bArr);
                    if (iP != iK) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Unable to read APP2 segment data, length: " + iK + ", actually read: " + iP);
                        }
                        zJ = false;
                    } else {
                        zJ = j(bArr, iK, f6949b);
                    }
                    if (zJ) {
                        fVar.h(bArr);
                        return true;
                    }
                    fVar.h(bArr);
                    iK = k(lVar, 226);
                } catch (Throwable th) {
                    fVar.h(bArr);
                    throw th;
                }
            }
            if (Log.isLoggable("DfltImageHeaderParser", 2)) {
                Log.v("DfltImageHeaderParser", "hasMpf: Failed to parse APP2 segment length, or no APP2 segment with MPF metadata not found");
            }
        }
        return false;
    }

    public static boolean j(byte[] bArr, int i, byte[] bArr2) {
        boolean z2 = (bArr == null || bArr2 == null || i <= bArr2.length) ? false : true;
        if (z2) {
            for (int i10 = 0; i10 < bArr2.length; i10++) {
                if (bArr[i10] != bArr2[i10]) {
                    return false;
                }
            }
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int k(j6.l r9, int r10) {
        /*
        L0:
            short r0 = r9.c()
            r1 = 255(0xff, float:3.57E-43)
            r2 = 3
            r3 = -1
            java.lang.String r4 = "DfltImageHeaderParser"
            if (r0 == r1) goto L24
            boolean r9 = android.util.Log.isLoggable(r4, r2)
            if (r9 == 0) goto L79
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Unknown segmentId="
            r9.<init>(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r4, r9)
            return r3
        L24:
            short r0 = r9.c()
            r1 = 218(0xda, float:3.05E-43)
            if (r0 != r1) goto L2d
            goto L79
        L2d:
            r1 = 217(0xd9, float:3.04E-43)
            if (r0 != r1) goto L4e
            boolean r9 = android.util.Log.isLoggable(r4, r2)
            if (r9 == 0) goto L79
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Found MARKER_EOI in "
            r9.<init>(r0)
            r9.append(r10)
            java.lang.String r10 = " segment"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r4, r9)
            return r3
        L4e:
            int r1 = r9.m()
            int r1 = r1 + (-2)
            if (r0 == r10) goto L7a
            long r5 = (long) r1
            long r7 = r9.skip(r5)
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 == 0) goto L0
            boolean r9 = android.util.Log.isLoggable(r4, r2)
            if (r9 == 0) goto L79
            java.lang.String r9 = ", wanted to skip: "
            java.lang.String r10 = ", but actually skipped: "
            java.lang.String r2 = "Unable to skip enough data, type: "
            java.lang.StringBuilder r9 = j4.a.o(r0, r1, r2, r9, r10)
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r4, r9)
        L79:
            return r3
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.m.k(j6.l, int):int");
    }

    public static int l(l lVar, byte[] bArr, int i) {
        ByteOrder byteOrder;
        int iP = lVar.p(i, bArr);
        if (iP != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + iP);
                return -1;
            }
        } else if (j(bArr, i, f6948a)) {
            ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
            short s3 = byteBuffer.remaining() - 6 >= 2 ? byteBuffer.getShort(6) : (short) -1;
            if (s3 != 18761) {
                if (s3 != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) s3));
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            byteBuffer.order(byteOrder);
            int i10 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
            int i11 = i10 + 6;
            short s10 = byteBuffer.remaining() - i11 >= 2 ? byteBuffer.getShort(i11) : (short) -1;
            for (int i12 = 0; i12 < s10; i12++) {
                int i13 = (i12 * 12) + i10 + 8;
                short s11 = byteBuffer.remaining() - i13 >= 2 ? byteBuffer.getShort(i13) : (short) -1;
                if (s11 == 274) {
                    int i14 = i13 + 2;
                    short s12 = byteBuffer.remaining() - i14 >= 2 ? byteBuffer.getShort(i14) : (short) -1;
                    if (s12 >= 1 && s12 <= 12) {
                        int i15 = i13 + 4;
                        int i16 = byteBuffer.remaining() - i15 >= 4 ? byteBuffer.getInt(i15) : -1;
                        if (i16 >= 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                StringBuilder sbO = j4.a.o(i12, s11, "Got tagIndex=", " tagType=", " formatCode=");
                                sbO.append((int) s12);
                                sbO.append(" componentCount=");
                                sbO.append(i16);
                                Log.d("DfltImageHeaderParser", sbO.toString());
                            }
                            int i17 = i16 + f6950c[s12];
                            if (i17 <= 4) {
                                int i18 = i13 + 8;
                                if (i18 >= 0 && i18 <= byteBuffer.remaining()) {
                                    if (i17 >= 0 && i17 + i18 <= byteBuffer.remaining()) {
                                        if (byteBuffer.remaining() - i18 >= 2) {
                                            return byteBuffer.getShort(i18);
                                        }
                                        return -1;
                                    }
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) s11));
                                    }
                                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i18 + " tagType=" + ((int) s11));
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) s12));
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Negative tiff component count");
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) s12));
                    }
                }
            }
        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
        }
        return -1;
    }

    @Override // a6.e
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        v6.f.c(byteBuffer, "Argument must not be null");
        return h(new j(byteBuffer));
    }

    @Override // a6.e
    public final boolean b(ByteBuffer byteBuffer, d6.f fVar) {
        j jVar = new j(byteBuffer);
        v6.f.c(fVar, "Argument must not be null");
        return i(jVar, fVar);
    }

    @Override // a6.e
    public final int c(InputStream inputStream, d6.f fVar) {
        s5.d dVar = new s5.d(inputStream);
        v6.f.c(fVar, "Argument must not be null");
        return g(dVar, fVar);
    }

    @Override // a6.e
    public final boolean d(InputStream inputStream, d6.f fVar) {
        v6.f.c(inputStream, "Argument must not be null");
        s5.d dVar = new s5.d(inputStream);
        v6.f.c(fVar, "Argument must not be null");
        return i(dVar, fVar);
    }

    @Override // a6.e
    public final ImageHeaderParser$ImageType e(InputStream inputStream) {
        return h(new s5.d(inputStream));
    }

    @Override // a6.e
    public final int f(ByteBuffer byteBuffer, d6.f fVar) {
        j jVar = new j(byteBuffer);
        v6.f.c(fVar, "Argument must not be null");
        return g(jVar, fVar);
    }
}
