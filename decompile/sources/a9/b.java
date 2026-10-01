package a9;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import t8.i;
import t8.j;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f630a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f631b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f632c;

    /* renamed from: d, reason: collision with root package name */
    public static Boolean f633d;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f634e;

    /* renamed from: f, reason: collision with root package name */
    public static Boolean f635f;

    /* renamed from: g, reason: collision with root package name */
    public static String f636g;

    /* renamed from: h, reason: collision with root package name */
    public static int f637h;

    /* renamed from: i, reason: collision with root package name */
    public static Boolean f638i;

    public static String a(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (int i6 = 0; i6 < length; i6++) {
            int i10 = (bArr[i6] & 240) >>> 4;
            char[] cArr = f630a;
            sb2.append(cArr[i10]);
            sb2.append(cArr[bArr[i6] & 15]);
        }
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        if (r3 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b() {
        /*
            java.lang.String r0 = "/proc/"
            java.lang.String r1 = a9.b.f636g
            if (r1 != 0) goto L6d
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L13
            java.lang.String r0 = a9.c.m()
            a9.b.f636g = r0
            goto L6d
        L13:
            int r1 = a9.b.f637h
            if (r1 != 0) goto L1d
            int r1 = android.os.Process.myPid()
            a9.b.f637h = r1
        L1d:
            r2 = 0
            if (r1 > 0) goto L21
            goto L6b
        L21:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            r3.append(r1)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            java.lang.String r0 = "/cmdline"
            r3.append(r0)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            android.os.StrictMode$ThreadPolicy r1 = android.os.StrictMode.allowThreadDiskReads()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L5c
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L5c
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L5c
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L5c
            android.os.StrictMode.setThreadPolicy(r1)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            java.lang.String r0 = r3.readLine()     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L54
            w8.x.g(r0)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L54
            java.lang.String r2 = r0.trim()     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L54
        L4e:
            r3.close()     // Catch: java.io.IOException -> L6b
            goto L6b
        L52:
            r0 = move-exception
            goto L56
        L54:
            goto L68
        L56:
            r2 = r3
            goto L61
        L58:
            r0 = move-exception
            goto L61
        L5a:
            goto L67
        L5c:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r1)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            throw r0     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
        L61:
            if (r2 == 0) goto L66
            r2.close()     // Catch: java.io.IOException -> L66
        L66:
            throw r0
        L67:
            r3 = r2
        L68:
            if (r3 == 0) goto L6b
            goto L4e
        L6b:
            a9.b.f636g = r2
        L6d:
            java.lang.String r0 = a9.b.f636g
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.b.b():java.lang.String");
    }

    public static byte[] c(Context context, String str) {
        MessageDigest messageDigest;
        PackageInfo b10 = c9.c.a(context).b(64, str);
        Signature[] signatureArr = b10.signatures;
        if (signatureArr != null && signatureArr.length == 1) {
            int i6 = 0;
            while (true) {
                if (i6 < 2) {
                    try {
                        messageDigest = MessageDigest.getInstance("SHA1");
                    } catch (NoSuchAlgorithmException unused) {
                    }
                    if (messageDigest != null) {
                        break;
                    }
                    i6++;
                } else {
                    messageDigest = null;
                    break;
                }
            }
            if (messageDigest != null) {
                return messageDigest.digest(b10.signatures[0].toByteArray());
            }
        }
        return null;
    }

    public static boolean d() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    public static boolean e(Context context, int i6) {
        if (g(i6, context, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                j a10 = j.a(context);
                a10.getClass();
                if (packageInfo != null) {
                    if (!j.d(packageInfo, false)) {
                        if (j.d(packageInfo, true)) {
                            if (!i.a(a10.f12647a)) {
                                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                            }
                        }
                    }
                    return true;
                }
                return false;
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        return false;
    }

    public static boolean f(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f632c == null) {
            f632c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (!f632c.booleanValue() || Build.VERSION.SDK_INT >= 24) {
            if (f633d == null) {
                f633d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
            }
            if (f633d.booleanValue()) {
                if (!d() || Build.VERSION.SDK_INT >= 30) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static boolean g(int i6, Context context, String str) {
        c9.b a10 = c9.c.a(context);
        a10.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) a10.f1989a.getSystemService("appops");
            if (appOpsManager != null) {
                appOpsManager.checkPackage(i6, str);
                return true;
            }
            throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
        } catch (SecurityException unused) {
            return false;
        }
    }
}
