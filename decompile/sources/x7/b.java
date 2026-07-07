package x7;

import android.app.AppOpsManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import androidx.emoji2.text.p;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import q7.g;
import q7.h;
import t7.y;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f14253a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f14254b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Boolean f14255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Boolean f14256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Boolean f14257e;
    public static Boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f14258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f14259h;
    public static Boolean i;

    public static String a(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = (bArr[i10] & 240) >>> 4;
            char[] cArr = f14253a;
            sb2.append(cArr[i11]);
            sb2.append(cArr[bArr[i10] & 15]);
        }
        return sb2.toString();
    }

    public static String b() throws Throwable {
        BufferedReader bufferedReader;
        String string;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads;
        if (f14258g == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f14258g = Application.getProcessName();
            } else {
                int iMyPid = f14259h;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    f14259h = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                if (iMyPid > 0) {
                    try {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iMyPid).length() + 14);
                        sb2.append("/proc/");
                        sb2.append(iMyPid);
                        sb2.append("/cmdline");
                        string = sb2.toString();
                        threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    } catch (IOException unused) {
                        bufferedReader = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        bufferedReader = new BufferedReader(new FileReader(string));
                        try {
                            String line = bufferedReader.readLine();
                            y.g(line);
                            strTrim = line.trim();
                        } catch (IOException unused2) {
                            if (bufferedReader != null) {
                            }
                            f14258g = strTrim;
                            return f14258g;
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader2 = bufferedReader;
                            if (bufferedReader2 != null) {
                                try {
                                    bufferedReader2.close();
                                } catch (IOException unused3) {
                                }
                            }
                            throw th;
                        }
                        try {
                            bufferedReader.close();
                        } catch (IOException unused4) {
                        }
                    } finally {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    }
                }
                f14258g = strTrim;
            }
        }
        return f14258g;
    }

    public static byte[] c(Context context, String str) {
        MessageDigest messageDigest;
        PackageInfo packageInfoC = z7.c.a(context).c(64, str);
        Signature[] signatureArr = packageInfoC.signatures;
        if (signatureArr != null && signatureArr.length == 1) {
            int i10 = 0;
            while (true) {
                if (i10 >= 2) {
                    messageDigest = null;
                    break;
                }
                try {
                    messageDigest = MessageDigest.getInstance("SHA1");
                } catch (NoSuchAlgorithmException unused) {
                }
                if (messageDigest != null) {
                    break;
                }
                i10++;
            }
            if (messageDigest != null) {
                return messageDigest.digest(packageInfoC.signatures[0].toByteArray());
            }
        }
        return null;
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean e(Context context, int i10) {
        if (h(i10, context, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                h hVarB = h.b(context);
                hVarB.getClass();
                if (packageInfo != null) {
                    if (!h.e(packageInfo, false)) {
                        if (h.e(packageInfo, true)) {
                            if (!g.a((Context) hVarB.f10916v)) {
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
        if (f14255c == null) {
            f14255c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (f14255c.booleanValue() && Build.VERSION.SDK_INT < 24) {
            return true;
        }
        if (f14256d == null) {
            f14256d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (f14256d.booleanValue()) {
            return !d() || Build.VERSION.SDK_INT >= 30;
        }
        return false;
    }

    public static List g(Object... objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? Collections.unmodifiableList(Arrays.asList(objArr)) : Collections.singletonList(objArr[0]) : Collections.EMPTY_LIST;
    }

    public static boolean h(int i10, Context context, String str) {
        p pVarA = z7.c.a(context);
        pVarA.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) pVarA.f926a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i10, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
