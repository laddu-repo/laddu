package u4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import p.l;
import x.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final k f12898a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f12899b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static l f12900c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return c.a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p.l] */
    public static l b() {
        ?? obj = new Object();
        f12900c = obj;
        f12898a.j(obj);
        return f12900c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:23|(1:92)(1:27)|28|(1:91)(1:32)|33|34|35|(2:76|77)(1:37)|38|(9:45|(1:49)|(1:69)(1:56)|57|(2:65|66)|61|62|63|64)|(1:73)(1:(1:75))|(1:49)|(1:51)|69|57|(1:59)|65|66|61|62|63|64) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00c5, code lost:
    
        r5 = 327680;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(android.content.Context r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.e.c(android.content.Context, boolean):void");
    }
}
