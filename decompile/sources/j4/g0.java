package j4;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.util.Log;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f7169b = Log.isLoggable("MediaSessionManager", 3);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f7170c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static volatile g0 f7171d;

    /* renamed from: a, reason: collision with root package name */
    public c0 f7172a;

    /* JADX WARN: Type inference failed for: r1v1, types: [j4.g0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, j4.c0] */
    public static g0 a(Context context) {
        g0 g0Var;
        synchronized (f7170c) {
            try {
                if (f7171d == null) {
                    Context applicationContext = context.getApplicationContext();
                    ?? obj = new Object();
                    ?? obj2 = new Object();
                    obj2.f7161a = applicationContext;
                    obj2.f7162b = applicationContext.getContentResolver();
                    obj.f7172a = obj2;
                    f7171d = obj;
                }
                g0Var = f7171d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return g0Var;
    }

    public final boolean b(d0 d0Var) {
        c0 c0Var = this.f7172a;
        f0 f0Var = d0Var.f7163a;
        Context context = c0Var.f7161a;
        int i6 = f0Var.f7166b;
        String str = f0Var.f7165a;
        int i10 = f0Var.f7167c;
        if (context.checkPermission("android.permission.MEDIA_CONTENT_CONTROL", i6, i10) != 0) {
            try {
                if (context.getPackageManager().getApplicationInfo(str, 0) != null) {
                    if (!c0Var.a(f0Var, "android.permission.STATUS_BAR_SERVICE") && !c0Var.a(f0Var, "android.permission.MEDIA_CONTENT_CONTROL") && i10 != 1000) {
                        String string = Settings.Secure.getString(c0Var.f7162b, "enabled_notification_listeners");
                        if (string != null) {
                            for (String str2 : string.split(":")) {
                                ComponentName unflattenFromString = ComponentName.unflattenFromString(str2);
                                if (unflattenFromString != null && unflattenFromString.getPackageName().equals(str)) {
                                    return true;
                                }
                            }
                        }
                    } else {
                        return true;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
                if (c0.f7160c) {
                    Log.d("MediaSessionManager", "Package " + str + " doesn't exist");
                }
            }
            return false;
        }
        return true;
    }
}
