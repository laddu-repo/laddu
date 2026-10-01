package ic;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import android.view.View;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import t0.d1;
import t0.w1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public int f6770a;

    /* renamed from: b, reason: collision with root package name */
    public int f6771b;

    /* renamed from: c, reason: collision with root package name */
    public Object f6772c;

    /* renamed from: d, reason: collision with root package name */
    public Object f6773d;

    /* renamed from: e, reason: collision with root package name */
    public Serializable f6774e;

    public static String c(jb.g gVar) {
        gVar.a();
        jb.j jVar = gVar.f7333c;
        String str = jVar.f7347e;
        if (str != null) {
            return str;
        }
        gVar.a();
        String str2 = jVar.f7344b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public synchronized String a() {
        try {
            if (((String) this.f6773d) == null) {
                g();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.f6773d;
    }

    public synchronized String b() {
        try {
            if (((String) this.f6774e) == null) {
                g();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.f6774e;
    }

    public PackageInfo d(String str) {
        try {
            return ((Context) this.f6772c).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Failed to find package " + e10);
            return null;
        }
    }

    public boolean e() {
        int i6;
        synchronized (this) {
            i6 = this.f6771b;
            if (i6 == 0) {
                PackageManager packageManager = ((Context) this.f6772c).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i6 = 0;
                } else {
                    if (!a9.b.d()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.f6771b = 1;
                            i6 = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
                        this.f6771b = 2;
                        i6 = 2;
                    } else {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (a9.b.d()) {
                            this.f6771b = 2;
                        } else {
                            this.f6771b = 1;
                        }
                        i6 = this.f6771b;
                    }
                }
            }
        }
        if (i6 != 0) {
            return true;
        }
        return false;
    }

    public void f(w1 w1Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((d1) it.next()).f12338a.c() & 8) != 0) {
                ((View) this.f6773d).setTranslationY(u9.a.c(r3.f12338a.b(), this.f6771b, 0));
                return;
            }
        }
    }

    public synchronized void g() {
        PackageInfo d10 = d(((Context) this.f6772c).getPackageName());
        if (d10 != null) {
            this.f6773d = Integer.toString(d10.versionCode);
            this.f6774e = d10.versionName;
        }
    }
}
