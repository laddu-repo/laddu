package q3;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;
import t1.d0;
import t1.e0;
import t1.f0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f10765a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static x1.a b(e0 e0Var, String str) {
        int i = 0;
        while (true) {
            d0[] d0VarArr = e0Var.f11984a;
            if (i >= d0VarArr.length) {
                return null;
            }
            d0 d0Var = d0VarArr[i];
            if (d0Var instanceof x1.a) {
                x1.a aVar = (x1.a) d0Var;
                if (aVar.f14085a.equals(str)) {
                    return aVar;
                }
            }
            i++;
        }
    }

    public static String c(ArrayList arrayList) {
        int size = arrayList.size();
        boolean z2 = false;
        String str = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str2 = ((t) obj).f10796a.f10771g.f12061n;
            if (f0.o(str2)) {
                return "video/mp4";
            }
            if (f0.k(str2)) {
                z2 = true;
            } else if (f0.m(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        return z2 ? "audio/mp4" : str != null ? str : "application/mp4";
    }

    public static boolean d(int i, boolean z2) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z2) {
            return true;
        }
        for (int i10 = 0; i10 < 29; i10++) {
            if (f10765a[i10] == i) {
                return true;
            }
        }
        return false;
    }

    public static k3.e e(int i, w1.t tVar) {
        int iJ = tVar.j();
        if (tVar.j() == 1684108385) {
            tVar.K(8);
            String strT = tVar.t(iJ - 16);
            return new k3.e("und", strT, strT);
        }
        w1.a.C("MetadataUtil", "Failed to parse comment attribute: " + w4.b.b(i));
        return null;
    }

    public static k3.a f(w1.t tVar) {
        int iJ = tVar.j();
        if (tVar.j() != 1684108385) {
            w1.a.C("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iJ2 = tVar.j();
        byte[] bArr = e.f10682a;
        int i = iJ2 & 16777215;
        String str = i == 13 ? "image/jpeg" : i == 14 ? "image/png" : null;
        if (str == null) {
            u5.a.d(i, "Unrecognized cover art flags: ", "MetadataUtil");
            return null;
        }
        tVar.K(4);
        int i10 = iJ - 16;
        byte[] bArr2 = new byte[i10];
        tVar.h(bArr2, 0, i10);
        return new k3.a(str, null, 3, bArr2);
    }

    public static k3.o g(int i, String str, w1.t tVar) {
        int iJ = tVar.j();
        if (tVar.j() == 1684108385 && iJ >= 22) {
            tVar.K(10);
            int iD = tVar.D();
            if (iD > 0) {
                String strH = d0.d.h(iD, "");
                int iD2 = tVar.D();
                if (iD2 > 0) {
                    strH = strH + "/" + iD2;
                }
                return new k3.o(str, null, y9.f0.q(strH));
            }
        }
        w1.a.C("MetadataUtil", "Failed to parse index/count attribute: " + w4.b.b(i));
        return null;
    }

    public static int h(w1.t tVar) {
        int iJ = tVar.j();
        if (tVar.j() == 1684108385) {
            tVar.K(8);
            int i = iJ - 16;
            if (i == 1) {
                return tVar.x();
            }
            if (i == 2) {
                return tVar.D();
            }
            if (i == 3) {
                return tVar.A();
            }
            if (i == 4 && (tVar.f13738a[tVar.f13739b] & 128) == 0) {
                return tVar.B();
            }
        }
        w1.a.C("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static k3.j i(int i, String str, w1.t tVar, boolean z2, boolean z10) {
        int iH = h(tVar);
        if (z10) {
            iH = Math.min(1, iH);
        }
        if (iH >= 0) {
            return z2 ? new k3.o(str, null, y9.f0.q(Integer.toString(iH))) : new k3.e("und", str, Integer.toString(iH));
        }
        w1.a.C("MetadataUtil", "Failed to parse uint8 attribute: " + w4.b.b(i));
        return null;
    }

    public static p7.m j(byte[] bArr) {
        UUID[] uuidArr;
        w1.t tVar = new w1.t(bArr);
        if (tVar.f13740c < 32) {
            return null;
        }
        tVar.J(0);
        int iA = tVar.a();
        int iJ = tVar.j();
        if (iJ != iA) {
            w1.a.C("PsshAtomUtil", "Advertised atom size (" + iJ + ") does not match buffer size: " + iA);
            return null;
        }
        int iJ2 = tVar.j();
        if (iJ2 != 1886614376) {
            u5.a.d(iJ2, "Atom type is not pssh: ", "PsshAtomUtil");
            return null;
        }
        int iE = e.e(tVar.j());
        if (iE > 1) {
            u5.a.d(iE, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(tVar.r(), tVar.r());
        if (iE == 1) {
            int iB = tVar.B();
            uuidArr = new UUID[iB];
            for (int i = 0; i < iB; i++) {
                uuidArr[i] = new UUID(tVar.r(), tVar.r());
            }
        } else {
            uuidArr = null;
        }
        int iB2 = tVar.B();
        int iA2 = tVar.a();
        if (iB2 == iA2) {
            byte[] bArr2 = new byte[iB2];
            tVar.h(bArr2, 0, iB2);
            return new p7.m(uuid, iE, bArr2, uuidArr);
        }
        w1.a.C("PsshAtomUtil", "Atom data size (" + iB2 + ") does not match the bytes left: " + iA2);
        return null;
    }

    public static byte[] k(UUID uuid, byte[] bArr) {
        p7.m mVarJ = j(bArr);
        if (mVarJ == null) {
            return null;
        }
        UUID uuid2 = (UUID) mVarJ.f10430w;
        if (uuid.equals(uuid2)) {
            return (byte[]) mVarJ.f10431x;
        }
        w1.a.C("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
        return null;
    }

    public static k3.o l(int i, String str, w1.t tVar) {
        int iJ = tVar.j();
        if (tVar.j() == 1684108385) {
            tVar.K(8);
            return new k3.o(str, null, y9.f0.q(tVar.t(iJ - 16)));
        }
        w1.a.C("MetadataUtil", "Failed to parse text attribute: " + w4.b.b(i));
        return null;
    }

    public static void m(int i, e0 e0Var, t1.n nVar, e0 e0Var2, e0... e0VarArr) {
        if (e0Var2 == null) {
            e0Var2 = new e0(new d0[0]);
        }
        if (e0Var != null) {
            int i10 = 0;
            while (true) {
                d0[] d0VarArr = e0Var.f11984a;
                if (i10 >= d0VarArr.length) {
                    break;
                }
                d0 d0Var = d0VarArr[i10];
                if (d0Var instanceof x1.a) {
                    x1.a aVar = (x1.a) d0Var;
                    if (!aVar.f14085a.equals("com.android.capture.fps")) {
                        e0Var2 = e0Var2.a(aVar);
                    } else if (i == 2) {
                        e0Var2 = e0Var2.a(aVar);
                    }
                }
                i10++;
            }
        }
        for (e0 e0Var3 : e0VarArr) {
            e0Var2 = e0Var2.b(e0Var3);
        }
        if (e0Var2.f11984a.length > 0) {
            nVar.f12034k = e0Var2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static w2.e0 n(w2.p r25, boolean r26, boolean r27) {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.p.n(w2.p, boolean, boolean):w2.e0");
    }
}
