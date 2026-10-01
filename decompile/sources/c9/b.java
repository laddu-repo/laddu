package c9;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import w8.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1989a;

    public b(Context context, int i6) {
        switch (i6) {
            case 1:
                x.g(context);
                Context applicationContext = context.getApplicationContext();
                x.g(applicationContext);
                this.f1989a = applicationContext;
                return;
            default:
                this.f1989a = context;
                return;
        }
    }

    public ApplicationInfo a(int i6, String str) {
        return this.f1989a.getPackageManager().getApplicationInfo(str, i6);
    }

    public PackageInfo b(int i6, String str) {
        return this.f1989a.getPackageManager().getPackageInfo(str, i6);
    }

    public boolean c() {
        String nameForUid;
        boolean isInstantApp;
        int callingUid = Binder.getCallingUid();
        int myUid = Process.myUid();
        Context context = this.f1989a;
        if (callingUid == myUid) {
            return a.j(context);
        }
        if (a9.b.d() && (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) != null) {
            isInstantApp = context.getPackageManager().isInstantApp(nameForUid);
            return isInstantApp;
        }
        return false;
    }
}
