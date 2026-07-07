package q7;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f10911b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f10912c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f10914e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f10910a = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f10913d = new AtomicBoolean();

    public static boolean a(Context context) {
        try {
            if (!f10912c) {
                try {
                    PackageInfo packageInfoC = z7.c.a(context).c(Build.VERSION.SDK_INT >= 28 ? 134217792 : 64, "com.google.android.gms");
                    h.b(context);
                    if (packageInfoC == null || h.e(packageInfoC, false) || !h.e(packageInfoC, true)) {
                        f10911b = false;
                    } else {
                        f10911b = true;
                    }
                    f10912c = true;
                } catch (PackageManager.NameNotFoundException e7) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e7);
                    f10912c = true;
                }
            }
            return f10911b || !"user".equals(Build.TYPE);
        } catch (Throwable th) {
            f10912c = true;
            throw th;
        }
    }
}
