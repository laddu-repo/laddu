package ac;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s0 f446a = new s0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s5.d f447b;

    static {
        hb.d dVar = new hb.d();
        dVar.a(r0.class, g.f361a);
        dVar.a(y0.class, h.f376a);
        dVar.a(k.class, e.f345a);
        dVar.a(b.class, d.f336a);
        dVar.a(a.class, c.f328a);
        dVar.a(i0.class, f.f352a);
        dVar.f6195d = true;
        f447b = new s5.d(dVar);
    }

    public static b a(fa.g gVar) throws PackageManager.NameNotFoundException {
        gVar.a();
        Context context = gVar.f5336a;
        de.i.d(context, "getApplicationContext(...)");
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        gVar.a();
        String str = gVar.f5338c.f5350b;
        de.i.d(str, "getApplicationId(...)");
        de.i.d(Build.MODEL, "MODEL");
        de.i.d(Build.VERSION.RELEASE, "RELEASE");
        de.i.b(packageName);
        String str2 = packageInfo.versionName;
        String str3 = str2 == null ? strValueOf : str2;
        de.i.d(Build.MANUFACTURER, "MANUFACTURER");
        gVar.a();
        i0 i0VarB = x.b(context);
        gVar.a();
        return new b(str, new a(packageName, str3, strValueOf, i0VarB, x.a(context)));
    }
}
