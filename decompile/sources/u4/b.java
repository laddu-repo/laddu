package u4;

import android.content.pm.PackageInfo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import p.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final l f12885a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f12886b = {112, 114, 111, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f12887c = {112, 114, 109, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f12888d = {48, 49, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f12889e = {48, 49, 48, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f12890f = {48, 48, 57, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f12891g = {48, 48, 53, 0};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f12892h = {48, 48, 49, 0};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f12893i = {48, 48, 49, 0};
    public static final byte[] j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static byte[] b(n2.e[] eVarArr, byte[] bArr) {
        int i6 = 0;
        int i10 = 0;
        for (n2.e eVar : eVarArr) {
            i10 += ((((eVar.f8990i * 2) + 7) & (-8)) / 8) + (eVar.f8987f * 2) + d(bArr, (String) eVar.f8983b, (String) eVar.f8984c).getBytes(StandardCharsets.UTF_8).length + 16 + eVar.f8989h;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i10);
        if (Arrays.equals(bArr, f12890f)) {
            int length = eVarArr.length;
            while (i6 < length) {
                n2.e eVar2 = eVarArr[i6];
                q(byteArrayOutputStream, eVar2, d(bArr, (String) eVar2.f8983b, (String) eVar2.f8984c));
                p(byteArrayOutputStream, eVar2);
                i6++;
            }
        } else {
            for (n2.e eVar3 : eVarArr) {
                q(byteArrayOutputStream, eVar3, d(bArr, (String) eVar3.f8983b, (String) eVar3.f8984c));
            }
            int length2 = eVarArr.length;
            while (i6 < length2) {
                p(byteArrayOutputStream, eVarArr[i6]);
                i6++;
            }
        }
        if (byteArrayOutputStream.size() == i10) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i10);
    }

    public static boolean c(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z10 = true;
            for (File file2 : listFiles) {
                if (c(file2) && z10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            return z10;
        }
        file.delete();
        return true;
    }

    public static String d(byte[] bArr, String str, String str2) {
        Object obj;
        byte[] bArr2 = f12892h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f12891g;
        String str3 = "!";
        if (!equals && !Arrays.equals(bArr, bArr3)) {
            obj = "!";
        } else {
            obj = ":";
        }
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (!str2.contains("!") && !str2.contains(":")) {
                if (!str2.endsWith(".apk")) {
                    StringBuilder b10 = y.e.b(str);
                    if (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) {
                        str3 = ":";
                    }
                    return r4.a.o(b10, str3, str2);
                }
            } else {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            }
        }
        return str2;
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] f(InputStream inputStream, int i6) {
        byte[] bArr = new byte[i6];
        int i10 = 0;
        while (i10 < i6) {
            int read = inputStream.read(bArr, i10, i6 - i10);
            if (read >= 0) {
                i10 += read;
            } else {
                throw new IllegalStateException(h8.c.i(i6, "Not enough bytes to read: "));
            }
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i6) {
        int[] iArr = new int[i6];
        int i10 = 0;
        for (int i11 = 0; i11 < i6; i11++) {
            i10 += (int) m(byteArrayInputStream, 2);
            iArr[i11] = i10;
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] h(java.io.FileInputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L2e
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            r4 = 0
            r5 = 0
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            if (r4 >= r9) goto L57
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L2e
            if (r6 < 0) goto L3b
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L2e
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.lang.Throwable -> L2e java.util.zip.DataFormatException -> L30
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            goto L8a
        L30:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L3b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L57:
            if (r4 != r9) goto L6b
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L63
            r0.end()
            return r1
        L63:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L6b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            r8.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L8a:
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.b.h(java.io.FileInputStream, int, int):byte[]");
    }

    public static n2.e[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, n2.e[] eVarArr) {
        byte[] bArr3 = f12893i;
        if (Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(f12888d, bArr2)) {
                if (Arrays.equals(bArr, bArr3)) {
                    int m9 = (int) m(fileInputStream, 1);
                    byte[] h4 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
                    if (fileInputStream.read() <= 0) {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h4);
                        try {
                            n2.e[] j10 = j(byteArrayInputStream, m9, eVarArr);
                            byteArrayInputStream.close();
                            return j10;
                        } catch (Throwable th) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    throw new IllegalStateException("Content found after the end of file");
                }
                throw new IllegalStateException("Unsupported meta version");
            }
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (Arrays.equals(bArr, j)) {
            int m10 = (int) m(fileInputStream, 2);
            byte[] h10 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h10);
                try {
                    n2.e[] k8 = k(byteArrayInputStream2, bArr2, m10, eVarArr);
                    byteArrayInputStream2.close();
                    return k8;
                } catch (Throwable th3) {
                    try {
                        byteArrayInputStream2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported meta version");
    }

    public static n2.e[] j(ByteArrayInputStream byteArrayInputStream, int i6, n2.e[] eVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new n2.e[0];
        }
        if (i6 == eVarArr.length) {
            String[] strArr = new String[i6];
            int[] iArr = new int[i6];
            for (int i10 = 0; i10 < i6; i10++) {
                int m9 = (int) m(byteArrayInputStream, 2);
                iArr[i10] = (int) m(byteArrayInputStream, 2);
                strArr[i10] = new String(f(byteArrayInputStream, m9), StandardCharsets.UTF_8);
            }
            for (int i11 = 0; i11 < i6; i11++) {
                n2.e eVar = eVarArr[i11];
                if (((String) eVar.f8984c).equals(strArr[i11])) {
                    int i12 = iArr[i11];
                    eVar.f8987f = i12;
                    eVar.f8985d = g(byteArrayInputStream, i12);
                } else {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
            }
            return eVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static n2.e[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i6, n2.e[] eVarArr) {
        String str;
        if (byteArrayInputStream.available() == 0) {
            return new n2.e[0];
        }
        if (i6 == eVarArr.length) {
            for (int i10 = 0; i10 < i6; i10++) {
                m(byteArrayInputStream, 2);
                String str2 = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
                long m9 = m(byteArrayInputStream, 4);
                int m10 = (int) m(byteArrayInputStream, 2);
                n2.e eVar = null;
                if (eVarArr.length > 0) {
                    int indexOf = str2.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str2.indexOf(":");
                    }
                    if (indexOf > 0) {
                        str = str2.substring(indexOf + 1);
                    } else {
                        str = str2;
                    }
                    int i11 = 0;
                    while (true) {
                        if (i11 >= eVarArr.length) {
                            break;
                        }
                        if (((String) eVarArr[i11].f8984c).equals(str)) {
                            eVar = eVarArr[i11];
                            break;
                        }
                        i11++;
                    }
                }
                if (eVar != null) {
                    eVar.j = m9;
                    int[] g10 = g(byteArrayInputStream, m10);
                    if (Arrays.equals(bArr, f12892h)) {
                        eVar.f8987f = m10;
                        eVar.f8985d = g10;
                    }
                } else {
                    throw new IllegalStateException("Missing profile key: ".concat(str2));
                }
            }
            return eVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static n2.e[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, f12889e)) {
            int m9 = (int) m(fileInputStream, 1);
            byte[] h4 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h4);
                try {
                    n2.e[] n10 = n(byteArrayInputStream, str, m9);
                    byteArrayInputStream.close();
                    return n10;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported version");
    }

    public static long m(InputStream inputStream, int i6) {
        byte[] f3 = f(inputStream, i6);
        long j10 = 0;
        for (int i10 = 0; i10 < i6; i10++) {
            j10 += (f3[i10] & 255) << (i10 * 8);
        }
        return j10;
    }

    public static n2.e[] n(ByteArrayInputStream byteArrayInputStream, String str, int i6) {
        int i10;
        if (byteArrayInputStream.available() == 0) {
            return new n2.e[0];
        }
        n2.e[] eVarArr = new n2.e[i6];
        for (int i11 = 0; i11 < i6; i11++) {
            int m9 = (int) m(byteArrayInputStream, 2);
            int m10 = (int) m(byteArrayInputStream, 2);
            eVarArr[i11] = new n2.e(str, new String(f(byteArrayInputStream, m9), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), m10, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[m10], new TreeMap());
        }
        int i12 = 0;
        while (i12 < i6) {
            n2.e eVar = eVarArr[i12];
            int available = byteArrayInputStream.available();
            int i13 = eVar.f8989h;
            int i14 = eVar.f8990i;
            TreeMap treeMap = (TreeMap) eVar.f8986e;
            int i15 = available - i13;
            int i16 = 0;
            while (byteArrayInputStream.available() > i15) {
                i16 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i16), 1);
                int m11 = (int) m(byteArrayInputStream, 2);
                while (m11 > 0) {
                    m(byteArrayInputStream, 2);
                    int m12 = (int) m(byteArrayInputStream, 1);
                    if (m12 != 6 && m12 != 7) {
                        while (m12 > 0) {
                            m(byteArrayInputStream, 1);
                            int i17 = i12;
                            for (int m13 = (int) m(byteArrayInputStream, 1); m13 > 0; m13--) {
                                m(byteArrayInputStream, 2);
                            }
                            m12--;
                            i12 = i17;
                        }
                    }
                    m11--;
                    i12 = i12;
                }
            }
            int i18 = i12;
            if (byteArrayInputStream.available() == i15) {
                eVar.f8985d = g(byteArrayInputStream, eVar.f8987f);
                BitSet valueOf = BitSet.valueOf(f(byteArrayInputStream, (((i14 * 2) + 7) & (-8)) / 8));
                for (int i19 = 0; i19 < i14; i19++) {
                    if (valueOf.get(i19)) {
                        i10 = 2;
                    } else {
                        i10 = 0;
                    }
                    if (valueOf.get(i19 + i14)) {
                        i10 |= 4;
                    }
                    if (i10 != 0) {
                        Integer num = (Integer) treeMap.get(Integer.valueOf(i19));
                        if (num == null) {
                            num = 0;
                        }
                        treeMap.put(Integer.valueOf(i19), Integer.valueOf(i10 | num.intValue()));
                    }
                }
                i12 = i18 + 1;
            } else {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
        }
        return eVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, n2.e[] eVarArr) {
        long j10;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f12888d;
        if (Arrays.equals(bArr, bArr2)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                v(byteArrayOutputStream2, eVarArr.length);
                int i6 = 2;
                for (n2.e eVar : eVarArr) {
                    u(byteArrayOutputStream2, eVar.f8988g, 4);
                    u(byteArrayOutputStream2, eVar.j, 4);
                    u(byteArrayOutputStream2, eVar.f8990i, 4);
                    String d10 = d(bArr2, (String) eVar.f8983b, (String) eVar.f8984c);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = d10.getBytes(charset).length;
                    v(byteArrayOutputStream2, length2);
                    i6 = i6 + 14 + length2;
                    byteArrayOutputStream2.write(d10.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i6 == byteArray.length) {
                    f fVar = new f(1, false, byteArray);
                    byteArrayOutputStream2.close();
                    arrayList2.add(fVar);
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    int i10 = 0;
                    for (int i11 = 0; i11 < eVarArr.length; i11++) {
                        try {
                            n2.e eVar2 = eVarArr[i11];
                            v(byteArrayOutputStream3, i11);
                            v(byteArrayOutputStream3, eVar2.f8987f);
                            i10 = i10 + 4 + (eVar2.f8987f * 2);
                            int[] iArr = (int[]) eVar2.f8985d;
                            int length3 = iArr.length;
                            int i12 = 0;
                            int i13 = 0;
                            while (i12 < length3) {
                                int i14 = iArr[i12];
                                v(byteArrayOutputStream3, i14 - i13);
                                i12++;
                                i13 = i14;
                            }
                        } catch (Throwable th) {
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                    if (i10 == byteArray2.length) {
                        f fVar2 = new f(3, true, byteArray2);
                        byteArrayOutputStream3.close();
                        arrayList2.add(fVar2);
                        byteArrayOutputStream3 = new ByteArrayOutputStream();
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < eVarArr.length) {
                            try {
                                n2.e eVar3 = eVarArr[i15];
                                Iterator it = ((TreeMap) eVar3.f8986e).entrySet().iterator();
                                int i17 = 0;
                                while (it.hasNext()) {
                                    i17 |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
                                }
                                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                try {
                                    r(byteArrayOutputStream4, i17, eVar3);
                                    byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                                    byteArrayOutputStream4.close();
                                    byteArrayOutputStream4 = new ByteArrayOutputStream();
                                    try {
                                        s(byteArrayOutputStream4, eVar3);
                                        byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                                        byteArrayOutputStream4.close();
                                        v(byteArrayOutputStream3, i15);
                                        int length4 = byteArray3.length + 2 + byteArray4.length;
                                        int i18 = i16 + 6;
                                        ArrayList arrayList4 = arrayList3;
                                        u(byteArrayOutputStream3, length4, 4);
                                        v(byteArrayOutputStream3, i17);
                                        byteArrayOutputStream3.write(byteArray3);
                                        byteArrayOutputStream3.write(byteArray4);
                                        i16 = i18 + length4;
                                        i15++;
                                        arrayList3 = arrayList4;
                                    } finally {
                                    }
                                } finally {
                                }
                            } finally {
                                try {
                                    byteArrayOutputStream3.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                        }
                        ArrayList arrayList5 = arrayList3;
                        byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
                        if (i16 == byteArray5.length) {
                            f fVar3 = new f(4, true, byteArray5);
                            byteArrayOutputStream3.close();
                            arrayList2.add(fVar3);
                            long j11 = 4;
                            long size = j11 + j11 + 4 + (arrayList2.size() * 16);
                            u(byteArrayOutputStream, arrayList2.size(), 4);
                            int i19 = 0;
                            while (i19 < arrayList2.size()) {
                                f fVar4 = (f) arrayList2.get(i19);
                                int i20 = fVar4.f12901a;
                                byte[] bArr3 = fVar4.f12902b;
                                if (i20 != 1) {
                                    if (i20 != 2) {
                                        if (i20 != 3) {
                                            if (i20 != 4) {
                                                if (i20 == 5) {
                                                    j10 = 4;
                                                } else {
                                                    throw null;
                                                }
                                            } else {
                                                j10 = 3;
                                            }
                                        } else {
                                            j10 = 2;
                                        }
                                    } else {
                                        j10 = 1;
                                    }
                                } else {
                                    j10 = 0;
                                }
                                u(byteArrayOutputStream, j10, 4);
                                u(byteArrayOutputStream, size, 4);
                                if (fVar4.f12903c) {
                                    long length5 = bArr3.length;
                                    byte[] a10 = a(bArr3);
                                    arrayList = arrayList5;
                                    arrayList.add(a10);
                                    u(byteArrayOutputStream, a10.length, 4);
                                    u(byteArrayOutputStream, length5, 4);
                                    length = a10.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(bArr3);
                                    u(byteArrayOutputStream, bArr3.length, 4);
                                    u(byteArrayOutputStream, 0L, 4);
                                    length = bArr3.length;
                                }
                                size += length;
                                i19++;
                                arrayList5 = arrayList;
                            }
                            ArrayList arrayList6 = arrayList5;
                            for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                                byteArrayOutputStream.write((byte[]) arrayList6.get(i21));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i16 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i10 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray.length);
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream2.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        }
        byte[] bArr4 = f12889e;
        if (Arrays.equals(bArr, bArr4)) {
            byte[] b10 = b(eVarArr, bArr4);
            u(byteArrayOutputStream, eVarArr.length, 1);
            u(byteArrayOutputStream, b10.length, 4);
            byte[] a11 = a(b10);
            u(byteArrayOutputStream, a11.length, 4);
            byteArrayOutputStream.write(a11);
            return true;
        }
        byte[] bArr5 = f12891g;
        if (Arrays.equals(bArr, bArr5)) {
            u(byteArrayOutputStream, eVarArr.length, 1);
            for (n2.e eVar4 : eVarArr) {
                int size2 = ((TreeMap) eVar4.f8986e).size() * 4;
                String d11 = d(bArr5, (String) eVar4.f8983b, (String) eVar4.f8984c);
                Charset charset2 = StandardCharsets.UTF_8;
                v(byteArrayOutputStream, d11.getBytes(charset2).length);
                v(byteArrayOutputStream, ((int[]) eVar4.f8985d).length);
                u(byteArrayOutputStream, size2, 4);
                u(byteArrayOutputStream, eVar4.f8988g, 4);
                byteArrayOutputStream.write(d11.getBytes(charset2));
                Iterator it2 = ((TreeMap) eVar4.f8986e).keySet().iterator();
                while (it2.hasNext()) {
                    v(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                    v(byteArrayOutputStream, 0);
                }
                for (int i22 : (int[]) eVar4.f8985d) {
                    v(byteArrayOutputStream, i22);
                }
            }
            return true;
        }
        byte[] bArr6 = f12890f;
        if (Arrays.equals(bArr, bArr6)) {
            byte[] b11 = b(eVarArr, bArr6);
            u(byteArrayOutputStream, eVarArr.length, 1);
            u(byteArrayOutputStream, b11.length, 4);
            byte[] a12 = a(b11);
            u(byteArrayOutputStream, a12.length, 4);
            byteArrayOutputStream.write(a12);
            return true;
        }
        byte[] bArr7 = f12892h;
        if (Arrays.equals(bArr, bArr7)) {
            v(byteArrayOutputStream, eVarArr.length);
            for (n2.e eVar5 : eVarArr) {
                String str = (String) eVar5.f8983b;
                TreeMap treeMap = (TreeMap) eVar5.f8986e;
                String d12 = d(bArr7, str, (String) eVar5.f8984c);
                Charset charset3 = StandardCharsets.UTF_8;
                v(byteArrayOutputStream, d12.getBytes(charset3).length);
                v(byteArrayOutputStream, treeMap.size());
                v(byteArrayOutputStream, ((int[]) eVar5.f8985d).length);
                u(byteArrayOutputStream, eVar5.f8988g, 4);
                byteArrayOutputStream.write(d12.getBytes(charset3));
                Iterator it3 = treeMap.keySet().iterator();
                while (it3.hasNext()) {
                    v(byteArrayOutputStream, ((Integer) it3.next()).intValue());
                }
                for (int i23 : (int[]) eVar5.f8985d) {
                    v(byteArrayOutputStream, i23);
                }
            }
            return true;
        }
        return false;
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, n2.e eVar) {
        s(byteArrayOutputStream, eVar);
        int i6 = eVar.f8990i;
        int[] iArr = (int[]) eVar.f8985d;
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = iArr[i10];
            v(byteArrayOutputStream, i12 - i11);
            i10++;
            i11 = i12;
        }
        byte[] bArr = new byte[(((i6 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : ((TreeMap) eVar.f8986e).entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i13 = intValue / 8;
                bArr[i13] = (byte) (bArr[i13] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i14 = intValue + i6;
                int i15 = i14 / 8;
                bArr[i15] = (byte) ((1 << (i14 % 8)) | bArr[i15]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, n2.e eVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        v(byteArrayOutputStream, str.getBytes(charset).length);
        v(byteArrayOutputStream, eVar.f8987f);
        u(byteArrayOutputStream, eVar.f8989h, 4);
        u(byteArrayOutputStream, eVar.f8988g, 4);
        u(byteArrayOutputStream, eVar.f8990i, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, int i6, n2.e eVar) {
        int i10 = eVar.f8990i;
        byte[] bArr = new byte[(((Integer.bitCount(i6 & (-2)) * i10) + 7) & (-8)) / 8];
        for (Map.Entry entry : ((TreeMap) eVar.f8986e).entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i11 = 0;
            for (int i12 = 1; i12 <= 4; i12 <<= 1) {
                if (i12 != 1 && (i12 & i6) != 0) {
                    if ((i12 & intValue2) == i12) {
                        int i13 = (i11 * i10) + intValue;
                        int i14 = i13 / 8;
                        bArr[i14] = (byte) ((1 << (i13 % 8)) | bArr[i14]);
                    }
                    i11++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void s(ByteArrayOutputStream byteArrayOutputStream, n2.e eVar) {
        int i6 = 0;
        for (Map.Entry entry : ((TreeMap) eVar.f8986e).entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                v(byteArrayOutputStream, intValue - i6);
                v(byteArrayOutputStream, 0);
                i6 = intValue;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0109 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0174 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v62, types: [byte[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void t(android.content.Context r18, java.util.concurrent.Executor r19, u4.a r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 772
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.b.t(android.content.Context, java.util.concurrent.Executor, u4.a, boolean):void");
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, long j10, int i6) {
        byte[] bArr = new byte[i6];
        for (int i10 = 0; i10 < i6; i10++) {
            bArr[i10] = (byte) ((j10 >> (i10 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void v(ByteArrayOutputStream byteArrayOutputStream, int i6) {
        u(byteArrayOutputStream, i6, 2);
    }
}
