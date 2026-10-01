package bg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Logger;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final i f1689a = new i();

    public static final e a(File file) {
        Logger logger = a0.f1688a;
        kotlin.jvm.internal.k.e(file, "<this>");
        return new e(1, new FileOutputStream(file, true), new Object());
    }

    public static final boolean b(int i6, int i10, int i11, byte[] a10, byte[] b10) {
        kotlin.jvm.internal.k.e(a10, "a");
        kotlin.jvm.internal.k.e(b10, "b");
        for (int i12 = 0; i12 < i11; i12++) {
            if (a10[i12 + i6] != b10[i12 + i10]) {
                return false;
            }
        }
        return true;
    }

    public static final e0 c(j0 j0Var) {
        kotlin.jvm.internal.k.e(j0Var, "<this>");
        return new e0(j0Var);
    }

    public static final f0 d(l0 l0Var) {
        kotlin.jvm.internal.k.e(l0Var, "<this>");
        return new f0(l0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [bg.l0, java.lang.Object, bg.k] */
    /* JADX WARN: Type inference failed for: r4v9, types: [bg.l0, java.lang.Object, bg.k] */
    public static void e(long j, k kVar, int i6, ArrayList arrayList, int i10, int i11, ArrayList arrayList2) {
        int i12;
        int i13;
        ArrayList arrayList3;
        long j10;
        int i14;
        int i15 = i6;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i10 < i11) {
            for (int i16 = i10; i16 < i11; i16++) {
                if (((n) arrayList4.get(i16)).d() < i15) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            n nVar = (n) arrayList.get(i10);
            n nVar2 = (n) arrayList4.get(i11 - 1);
            if (i15 == nVar.d()) {
                int intValue = ((Number) arrayList5.get(i10)).intValue();
                int i17 = i10 + 1;
                n nVar3 = (n) arrayList4.get(i17);
                i12 = i17;
                i13 = intValue;
                nVar = nVar3;
            } else {
                i12 = i10;
                i13 = -1;
            }
            if (nVar.i(i15) != nVar2.i(i15)) {
                int i18 = 1;
                for (int i19 = i12 + 1; i19 < i11; i19++) {
                    if (((n) arrayList4.get(i19 - 1)).i(i15) != ((n) arrayList4.get(i19)).i(i15)) {
                        i18++;
                    }
                }
                long j11 = 4;
                long j12 = (kVar.f1726y / j11) + j + 2 + (i18 * 2);
                kVar.o0(i18);
                kVar.o0(i13);
                for (int i20 = i12; i20 < i11; i20++) {
                    byte i21 = ((n) arrayList4.get(i20)).i(i15);
                    if (i20 == i12 || i21 != ((n) arrayList4.get(i20 - 1)).i(i15)) {
                        kVar.o0(i21 & 255);
                    }
                }
                ?? obj = new Object();
                int i22 = i12;
                while (i22 < i11) {
                    byte i23 = ((n) arrayList4.get(i22)).i(i15);
                    int i24 = i22 + 1;
                    int i25 = i24;
                    while (true) {
                        if (i25 < i11) {
                            if (i23 != ((n) arrayList4.get(i25)).i(i15)) {
                                break;
                            } else {
                                i25++;
                            }
                        } else {
                            i25 = i11;
                            break;
                        }
                    }
                    if (i24 == i25 && i15 + 1 == ((n) arrayList4.get(i22)).d()) {
                        kVar.o0(((Number) arrayList5.get(i22)).intValue());
                        arrayList3 = arrayList5;
                        j10 = j12;
                        i14 = i25;
                    } else {
                        kVar.o0(((int) ((obj.f1726y / j11) + j12)) * (-1));
                        arrayList3 = arrayList5;
                        j10 = j12;
                        i14 = i25;
                        e(j10, obj, i15 + 1, arrayList, i22, i14, arrayList3);
                        arrayList4 = arrayList;
                    }
                    j12 = j10;
                    i22 = i14;
                    arrayList5 = arrayList3;
                }
                kVar.T(obj);
                return;
            }
            int min = Math.min(nVar.d(), nVar2.d());
            int i26 = 0;
            for (int i27 = i15; i27 < min && nVar.i(i27) == nVar2.i(i27); i27++) {
                i26++;
            }
            long j13 = 4;
            long j14 = (kVar.f1726y / j13) + j + 2 + i26 + 1;
            kVar.o0(-i26);
            kVar.o0(i13);
            int i28 = i15 + i26;
            while (i15 < i28) {
                kVar.o0(nVar.i(i15) & 255);
                i15++;
            }
            if (i12 + 1 == i11) {
                if (i28 == ((n) arrayList4.get(i12)).d()) {
                    kVar.o0(((Number) arrayList5.get(i12)).intValue());
                    return;
                }
                throw new IllegalStateException("Check failed.");
            }
            ?? obj2 = new Object();
            kVar.o0(((int) ((obj2.f1726y / j13) + j14)) * (-1));
            e(j14, obj2, i28, arrayList4, i12, i11, arrayList5);
            kVar.T(obj2);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final void f(long j, long j10, long j11) {
        if ((j10 | j11) >= 0 && j10 <= j && j - j10 >= j11) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j10 + " byteCount=" + j11);
    }

    public static final boolean g(AssertionError assertionError) {
        boolean z10;
        Logger logger = a0.f1688a;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null) {
                z10 = df.m.I(message, "getsockname failed", false);
            } else {
                z10 = false;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x011d, code lost:
    
        continue;
     */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, bg.k] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static bg.b0 h(bg.n... r12) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bg.b.h(bg.n[]):bg.b0");
    }

    public static final j0 i(Socket socket) {
        Logger logger = a0.f1688a;
        kotlin.jvm.internal.k.e(socket, "<this>");
        k0 k0Var = new k0(socket);
        OutputStream outputStream = socket.getOutputStream();
        kotlin.jvm.internal.k.d(outputStream, "getOutputStream(...)");
        return k0Var.sink(new e(1, outputStream, k0Var));
    }

    public static e j(File file) {
        Logger logger = a0.f1688a;
        return new e(1, new FileOutputStream(file, false), new Object());
    }

    public static final f k(File file) {
        Logger logger = a0.f1688a;
        kotlin.jvm.internal.k.e(file, "<this>");
        return new f(new FileInputStream(file), o0.NONE);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, bg.o0] */
    public static final f l(InputStream inputStream) {
        Logger logger = a0.f1688a;
        kotlin.jvm.internal.k.e(inputStream, "<this>");
        return new f(inputStream, (o0) new Object());
    }

    public static final l0 m(Socket socket) {
        Logger logger = a0.f1688a;
        kotlin.jvm.internal.k.e(socket, "<this>");
        k0 k0Var = new k0(socket);
        InputStream inputStream = socket.getInputStream();
        kotlin.jvm.internal.k.d(inputStream, "getInputStream(...)");
        return k0Var.source(new f(inputStream, k0Var));
    }

    public static final String n(int i6) {
        if (i6 == 0) {
            return "0";
        }
        char[] cArr = cg.b.f2089a;
        int i10 = 0;
        char[] cArr2 = {cArr[(i6 >> 28) & 15], cArr[(i6 >> 24) & 15], cArr[(i6 >> 20) & 15], cArr[(i6 >> 16) & 15], cArr[(i6 >> 12) & 15], cArr[(i6 >> 8) & 15], cArr[(i6 >> 4) & 15], cArr[i6 & 15]};
        while (i10 < 8 && cArr2[i10] == '0') {
            i10++;
        }
        return df.u.y(cArr2, i10, 8);
    }
}
