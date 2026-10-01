package s3;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2Connection;
import r1.i0;
import r1.j0;
import r1.k0;
import y2.d0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f12144a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int i6;
        int i10;
        if (bArr != null) {
            i6 = bArr.length;
        } else {
            i6 = 0;
        }
        int i11 = i6 + 32;
        if (uuidArr != null) {
            i11 += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i11);
        allocate.putInt(i11);
        allocate.putInt(1886614376);
        if (uuidArr != null) {
            i10 = Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        } else {
            i10 = 0;
        }
        allocate.putInt(i10);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        } else {
            allocate.putInt(0);
        }
        return allocate.array();
    }

    public static v1.a b(j0 j0Var, String str) {
        int i6 = 0;
        while (true) {
            i0[] i0VarArr = j0Var.f11523a;
            if (i6 < i0VarArr.length) {
                i0 i0Var = i0VarArr[i6];
                if (i0Var instanceof v1.a) {
                    v1.a aVar = (v1.a) i0Var;
                    if (aVar.f13184a.equals(str)) {
                        return aVar;
                    }
                }
                i6++;
            } else {
                return null;
            }
        }
    }

    public static String c(ArrayList arrayList) {
        int size = arrayList.size();
        boolean z10 = false;
        String str = null;
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            String str2 = ((t) obj).f12177a.f12151g.f11670n;
            if (k0.o(str2)) {
                return "video/mp4";
            }
            if (k0.k(str2)) {
                z10 = true;
            } else if (k0.m(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        if (z10) {
            return "audio/mp4";
        }
        if (str != null) {
            return str;
        }
        return "application/mp4";
    }

    public static boolean d(int i6, boolean z10) {
        if ((i6 >>> 8) == 3368816) {
            return true;
        }
        if (i6 == 1751476579 && z10) {
            return true;
        }
        for (int i10 = 0; i10 < 29; i10++) {
            if (f12144a[i10] == i6) {
                return true;
            }
        }
        return false;
    }

    public static m3.e e(int i6, u1.t tVar) {
        int k8 = tVar.k();
        if (tVar.k() == 1684108385) {
            tVar.L(8);
            String u3 = tVar.u(k8 - 16);
            return new m3.e("und", u3, u3);
        }
        u1.a.p("MetadataUtil", "Failed to parse comment attribute: " + ca.e.b(i6));
        return null;
    }

    public static m3.a f(u1.t tVar) {
        String str;
        int k8 = tVar.k();
        if (tVar.k() == 1684108385) {
            int k9 = tVar.k();
            byte[] bArr = e.f12060a;
            int i6 = k9 & 16777215;
            if (i6 == 13) {
                str = "image/jpeg";
            } else if (i6 == 14) {
                str = "image/png";
            } else {
                str = null;
            }
            if (str == null) {
                h8.c.p(i6, "Unrecognized cover art flags: ", "MetadataUtil");
                return null;
            }
            tVar.L(4);
            int i10 = k8 - 16;
            byte[] bArr2 = new byte[i10];
            tVar.i(bArr2, 0, i10);
            return new m3.a(str, null, 3, bArr2);
        }
        u1.a.p("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    public static m3.o g(int i6, String str, u1.t tVar) {
        int k8 = tVar.k();
        if (tVar.k() == 1684108385 && k8 >= 22) {
            tVar.L(10);
            int E = tVar.E();
            if (E > 0) {
                String i10 = h8.c.i(E, HttpUrl.FRAGMENT_ENCODE_SET);
                int E2 = tVar.E();
                if (E2 > 0) {
                    i10 = i10 + "/" + E2;
                }
                return new m3.o(str, null, db.k0.o(i10));
            }
        }
        u1.a.p("MetadataUtil", "Failed to parse index/count attribute: " + ca.e.b(i6));
        return null;
    }

    public static int h(u1.t tVar) {
        int k8 = tVar.k();
        if (tVar.k() == 1684108385) {
            tVar.L(8);
            int i6 = k8 - 16;
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 == 4 && (tVar.h() & 128) == 0) {
                            return tVar.C();
                        }
                    } else {
                        return tVar.B();
                    }
                } else {
                    return tVar.E();
                }
            } else {
                return tVar.y();
            }
        }
        u1.a.p("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static m3.j i(int i6, String str, u1.t tVar, boolean z10, boolean z11) {
        int h4 = h(tVar);
        if (z11) {
            h4 = Math.min(1, h4);
        }
        if (h4 >= 0) {
            if (z10) {
                return new m3.o(str, null, db.k0.o(Integer.toString(h4)));
            }
            return new m3.e("und", str, Integer.toString(h4));
        }
        u1.a.p("MetadataUtil", "Failed to parse uint8 attribute: " + ca.e.b(i6));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [byte[], java.io.Serializable] */
    public static s8.n j(byte[] bArr) {
        UUID[] uuidArr;
        u1.t tVar = new u1.t(bArr);
        if (tVar.f12813c < 32) {
            return null;
        }
        tVar.K(0);
        int a10 = tVar.a();
        int k8 = tVar.k();
        if (k8 != a10) {
            u1.a.p("PsshAtomUtil", "Advertised atom size (" + k8 + ") does not match buffer size: " + a10);
            return null;
        }
        int k9 = tVar.k();
        if (k9 != 1886614376) {
            h8.c.p(k9, "Atom type is not pssh: ", "PsshAtomUtil");
            return null;
        }
        int e10 = e.e(tVar.k());
        if (e10 > 1) {
            h8.c.p(e10, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(tVar.s(), tVar.s());
        if (e10 == 1) {
            int C = tVar.C();
            uuidArr = new UUID[C];
            for (int i6 = 0; i6 < C; i6++) {
                uuidArr[i6] = new UUID(tVar.s(), tVar.s());
            }
        } else {
            uuidArr = null;
        }
        int C2 = tVar.C();
        int a11 = tVar.a();
        if (C2 != a11) {
            u1.a.p("PsshAtomUtil", "Atom data size (" + C2 + ") does not match the bytes left: " + a11);
            return null;
        }
        ?? r22 = new byte[C2];
        tVar.i(r22, 0, C2);
        return new s8.n(uuid, e10, (Serializable) r22, uuidArr);
    }

    public static byte[] k(UUID uuid, byte[] bArr) {
        s8.n j = j(bArr);
        if (j == null) {
            return null;
        }
        UUID uuid2 = (UUID) j.f12260b;
        if (!uuid.equals(uuid2)) {
            u1.a.p("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
            return null;
        }
        return (byte[]) j.f12261c;
    }

    public static m3.o l(int i6, String str, u1.t tVar) {
        int k8 = tVar.k();
        if (tVar.k() == 1684108385) {
            tVar.L(8);
            return new m3.o(str, null, db.k0.o(tVar.u(k8 - 16)));
        }
        u1.a.p("MetadataUtil", "Failed to parse text attribute: " + ca.e.b(i6));
        return null;
    }

    public static void m(int i6, j0 j0Var, r1.p pVar, j0 j0Var2, j0... j0VarArr) {
        if (j0Var2 == null) {
            j0Var2 = new j0(new i0[0]);
        }
        if (j0Var != null) {
            int i10 = 0;
            while (true) {
                i0[] i0VarArr = j0Var.f11523a;
                if (i10 >= i0VarArr.length) {
                    break;
                }
                i0 i0Var = i0VarArr[i10];
                if (i0Var instanceof v1.a) {
                    v1.a aVar = (v1.a) i0Var;
                    if (aVar.f13184a.equals("com.android.capture.fps")) {
                        if (i6 == 2) {
                            j0Var2 = j0Var2.a(aVar);
                        }
                    } else {
                        j0Var2 = j0Var2.a(aVar);
                    }
                }
                i10++;
            }
        }
        for (j0 j0Var3 : j0VarArr) {
            j0Var2 = j0Var2.b(j0Var3);
        }
        if (j0Var2.f11523a.length > 0) {
            pVar.f11609k = j0Var2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [y2.d0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [y2.d0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [y2.d0, java.lang.Object] */
    public static d0 n(y2.p pVar, boolean z10, boolean z11) {
        d0 d0Var;
        boolean z12;
        long j;
        int i6;
        long j10;
        int i10;
        int[] iArr;
        long length = pVar.getLength();
        long j11 = 4096;
        long j12 = -1;
        if (length != -1 && length <= 4096) {
            j11 = length;
        }
        int i11 = (int) j11;
        u1.t tVar = new u1.t(64);
        int i12 = 0;
        int i13 = 0;
        boolean z13 = false;
        while (i13 < i11) {
            tVar.H(8);
            boolean z14 = true;
            if (!pVar.k(tVar.f12811a, i12, 8, true)) {
                break;
            }
            long A = tVar.A();
            int k8 = tVar.k();
            if (A == 1) {
                j = j12;
                pVar.C(tVar.f12811a, 8, 8);
                i10 = 16;
                tVar.J(16);
                i6 = i13;
                j10 = tVar.s();
            } else {
                j = j12;
                if (A == 0) {
                    long length2 = pVar.getLength();
                    if (length2 != j) {
                        i6 = i13;
                        A = (length2 - pVar.l()) + 8;
                        j10 = A;
                        i10 = 8;
                    }
                }
                i6 = i13;
                j10 = A;
                i10 = 8;
            }
            long j13 = i10;
            if (j10 < j13) {
                return new Object();
            }
            int i14 = i6 + i10;
            d0Var = null;
            if (k8 == 1836019574) {
                i11 += (int) j10;
                if (length != -1 && i11 > length) {
                    i11 = (int) length;
                }
                i13 = i14;
                j12 = j;
            } else if (k8 != 1836019558 && k8 != 1836475768) {
                if (k8 == 1835295092) {
                    z13 = true;
                }
                long j14 = length;
                if ((i14 + j10) - j13 >= i11) {
                    break;
                }
                int i15 = (int) (j10 - j13);
                i13 = i14 + i15;
                if (k8 == 1718909296) {
                    if (i15 < 8) {
                        return new Object();
                    }
                    tVar.H(i15);
                    pVar.C(tVar.f12811a, 0, i15);
                    if (d(tVar.k(), z11)) {
                        z13 = true;
                    }
                    tVar.L(4);
                    int a10 = tVar.a() / 4;
                    if (!z13 && a10 > 0) {
                        iArr = new int[a10];
                        int i16 = 0;
                        while (true) {
                            if (i16 < a10) {
                                int k9 = tVar.k();
                                iArr[i16] = k9;
                                if (d(k9, z11)) {
                                    break;
                                }
                                i16++;
                            } else {
                                z14 = z13;
                                break;
                            }
                        }
                    } else {
                        z14 = z13;
                        iArr = null;
                    }
                    if (!z14) {
                        ?? obj = new Object();
                        if (iArr != null) {
                            int i17 = gb.a.f5598z;
                            if (iArr.length == 0) {
                                return obj;
                            }
                            new gb.a(Arrays.copyOf(iArr, iArr.length));
                            return obj;
                        }
                        int i18 = gb.a.f5598z;
                        return obj;
                    }
                    z13 = z14;
                } else if (i15 != 0) {
                    pVar.o(i15);
                }
                j12 = j;
                length = j14;
            } else {
                z12 = true;
                break;
            }
            i12 = 0;
        }
        d0Var = null;
        z12 = false;
        if (!z13) {
            return k.f12107c;
        }
        if (z10 != z12) {
            if (z12) {
                return k.f12105a;
            }
            return k.f12106b;
        }
        return d0Var;
    }
}
