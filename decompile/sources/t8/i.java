package t8;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f12642b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f12643c = false;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f12645e = 0;

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f12641a = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f12644d = new AtomicBoolean();

    public static boolean a(Context context) {
        try {
            if (!f12643c) {
                try {
                    PackageInfo b10 = c9.c.a(context).b(64, "com.google.android.gms");
                    j.a(context);
                    if (b10 != null && !j.d(b10, false) && j.d(b10, true)) {
                        f12642b = true;
                    } else {
                        f12642b = false;
                    }
                    f12643c = true;
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
                    f12643c = true;
                }
            }
            if (!f12642b && "user".equals(Build.TYPE)) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            f12643c = true;
            throw th;
        }
    }
}
