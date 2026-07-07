package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.system.Os;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class jb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile x9.h f2794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f2795b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile tb f2796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile tb f2797d;

    public static File b(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            return filesDir;
        }
        SystemClock.sleep(100L);
        File filesDir2 = context.getFilesDir();
        if (filesDir2 != null) {
            return filesDir2;
        }
        throw new IllegalStateException("getFilesDir returned null twice.");
    }

    public static IOException c(ye yeVar, Uri uri, IOException iOException, String str) {
        try {
            mf mfVar = new mf();
            mfVar.f2899v = true;
            File file = (File) yeVar.a(uri, mfVar);
            return file.exists() ? file.isFile() ? file.canRead() ? file.canWrite() ? h(file, iOException, str) : h(file, iOException, str) : file.canWrite() ? h(file, iOException, str) : h(file, iOException, str) : file.canRead() ? file.canWrite() ? h(file, iOException, str) : h(file, iOException, str) : file.canWrite() ? h(file, iOException, str) : h(file, iOException, str) : h(file, iOException, str);
        } catch (IOException unused) {
            return new IOException(iOException);
        }
    }

    public static String d(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length);
        for (byte b9 : bArr) {
            if (b9 == 34) {
                sb2.append("\\\"");
            } else if (b9 == 39) {
                sb2.append("\\'");
            } else if (b9 != 92) {
                switch (b9) {
                    case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                        sb2.append("\\a");
                        break;
                    case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (b9 < 32 || b9 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((b9 >>> 6) & 3) + 48));
                            sb2.append((char) (((b9 >>> 3) & 7) + 48));
                            sb2.append((char) ((b9 & 7) + 48));
                        } else {
                            sb2.append((char) b9);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, all -> 0x007a, blocks: (B:6:0x0007, B:8:0x000b, B:10:0x0019, B:20:0x0036, B:79:0x0185, B:15:0x0025, B:17:0x002d, B:21:0x003a, B:26:0x0049, B:28:0x004f, B:30:0x0057, B:78:0x0181, B:80:0x0188, B:81:0x018b, B:82:0x018c, B:31:0x005b, B:32:0x005e, B:33:0x006b, B:35:0x0071, B:41:0x0087, B:43:0x008d, B:44:0x0099, B:65:0x0165, B:66:0x0168, B:74:0x0178, B:73:0x0175, B:75:0x0179, B:76:0x017e, B:77:0x017f, B:36:0x0077, B:40:0x007e), top: B:87:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static x9.h e(android.content.Context r16) {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.jb.e(android.content.Context):x9.h");
    }

    public static void f(String str, int i, List list) {
        if (list.size() == i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires " + i + " parameters found " + list.size());
    }

    public static IOException h(File file, IOException iOException, String str) {
        File parentFile = file.getParentFile();
        return parentFile == null ? k(file, iOException, str) : parentFile.exists() ? parentFile.isDirectory() ? parentFile.canRead() ? parentFile.canWrite() ? k(file, iOException, str) : k(file, iOException, str) : parentFile.canWrite() ? k(file, iOException, str) : k(file, iOException, str) : parentFile.canRead() ? parentFile.canWrite() ? k(file, iOException, str) : k(file, iOException, str) : parentFile.canWrite() ? k(file, iOException, str) : k(file, iOException, str) : k(file, iOException, str);
    }

    public static void i() {
        synchronized (f2795b) {
        }
    }

    public static void j(String str, int i, List list) {
        if (list.size() >= i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at least " + i + " parameters found " + list.size());
    }

    public static IOException k(File file, IOException iOException, String str) {
        String strConcat;
        try {
            Locale locale = Locale.US;
            String str2 = " canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + "] protoName[" + str + "]";
            StringBuilder sb2 = new StringBuilder(str2.length() + 16);
            sb2.append("Inoperable file:");
            sb2.append(str2);
            strConcat = sb2.toString();
            try {
                String str3 = " mode[" + Os.stat(file.getCanonicalPath()).st_mode + "]";
                StringBuilder sb3 = new StringBuilder(strConcat.length() + str3.length());
                sb3.append(strConcat);
                sb3.append(str3);
                strConcat = sb3.toString();
            } catch (Exception unused) {
            }
        } catch (IOException unused2) {
            strConcat = "Inoperable file:".concat(" failed");
        }
        return new IOException(strConcat, iOException);
    }

    public static void m(String str, int i, ArrayList arrayList) {
        if (arrayList.size() <= i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at most " + i + " parameters found " + arrayList.size());
    }

    public static boolean o(z5 z5Var) {
        if (z5Var == null) {
            return false;
        }
        Double d10 = z5Var.d();
        return !d10.isNaN() && d10.doubleValue() >= 0.0d && d10.equals(Double.valueOf(Math.floor(d10.doubleValue())));
    }

    public static i6 p(String str) {
        i6 i6Var = null;
        if (str != null && !str.isEmpty()) {
            i6Var = (i6) i6.G0.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (i6Var != null) {
            return i6Var;
        }
        throw new IllegalArgumentException(d0.d.k("Unsupported commandId ", str));
    }

    public static boolean q(z5 z5Var, z5 z5Var2) {
        if (!z5Var.getClass().equals(z5Var2.getClass())) {
            return false;
        }
        if ((z5Var instanceof d6) || (z5Var instanceof x5)) {
            return true;
        }
        if (!(z5Var instanceof m3)) {
            return z5Var instanceof c6 ? z5Var.e().equals(z5Var2.e()) : z5Var instanceof b2 ? z5Var.a().equals(z5Var2.a()) : z5Var == z5Var2;
        }
        if (Double.isNaN(z5Var.d().doubleValue()) || Double.isNaN(z5Var2.d().doubleValue())) {
            return false;
        }
        return z5Var.d().equals(z5Var2.d());
    }

    public static int r(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10) || d10 == 0.0d) {
            return 0;
        }
        return (int) ((((double) (d10 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d10))) % 4.294967296E9d);
    }

    public static double s(double d10) {
        if (Double.isNaN(d10)) {
            return 0.0d;
        }
        if (Double.isInfinite(d10) || d10 == 0.0d || d10 == 0.0d) {
            return d10;
        }
        return ((double) (d10 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d10));
    }

    public static Object t(z5 z5Var) {
        if (z5.f3275b.equals(z5Var)) {
            return null;
        }
        if (z5.f3274a.equals(z5Var)) {
            return "";
        }
        if (z5Var instanceof w5) {
            return u((w5) z5Var);
        }
        if (!(z5Var instanceof m1)) {
            return !z5Var.d().isNaN() ? z5Var.d() : z5Var.e();
        }
        ArrayList arrayList = new ArrayList();
        m1 m1Var = (m1) z5Var;
        int i = 0;
        while (i < m1Var.m()) {
            if (i >= m1Var.m()) {
                throw new NoSuchElementException(u5.a.b(i, "Out of bounds index: ", new StringBuilder(String.valueOf(i).length() + 21)));
            }
            int i10 = i + 1;
            Object objT = t(m1Var.n(i));
            if (objT != null) {
                arrayList.add(objT);
            }
            i = i10;
        }
        return arrayList;
    }

    public static HashMap u(w5 w5Var) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList(w5Var.f3192v.keySet());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            Object objT = t(w5Var.c(str));
            if (objT != null) {
                map.put(str, objT);
            }
        }
        return map;
    }

    public static void v(z7 z7Var) {
        int iR = r(z7Var.h("runtime.counter").d().doubleValue() + 1.0d);
        if (iR > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        z7Var.f("runtime.counter", new m3(Double.valueOf(iR)));
    }

    public abstract int a();

    public abstract sh g(int i);

    public abstract Object l(int i);

    public abstract Object n(sh shVar);
}
