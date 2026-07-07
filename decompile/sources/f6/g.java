package f6;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5037a = v5.o.h("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z10) {
        int i6;
        String str;
        String str2 = "disabled";
        String str3 = f5037a;
        try {
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, cls.getName());
            if (z10) {
                i6 = 1;
            } else {
                i6 = 2;
            }
            packageManager.setComponentEnabledSetting(componentName, i6, 1);
            v5.o f3 = v5.o.f();
            String name = cls.getName();
            if (!z10) {
                str = "disabled";
            } else {
                str = "enabled";
            }
            f3.b(str3, name + " " + str, new Throwable[0]);
        } catch (Exception e10) {
            v5.o f10 = v5.o.f();
            String name2 = cls.getName();
            if (z10) {
                str2 = "enabled";
            }
            f10.b(str3, name2 + " could not be " + str2, e10);
        }
    }
}
