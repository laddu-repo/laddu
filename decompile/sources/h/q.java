package h;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final o f5983v = new o(new p(0));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static int f5984w = -100;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static p0.g f5985x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static p0.g f5986y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static Boolean f5987z = null;
    public static boolean A = false;
    public static final v.f B = new v.f(0);
    public static final Object C = new Object();
    public static final Object D = new Object();

    public static boolean c(Context context) {
        if (f5987z == null) {
            try {
                int i = j0.f5935v;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) j0.class), Build.VERSION.SDK_INT >= 24 ? i0.a() | 128 : 640).metaData;
                if (bundle != null) {
                    f5987z = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f5987z = Boolean.FALSE;
            }
        }
        return f5987z.booleanValue();
    }

    public static void f(d0 d0Var) {
        synchronized (C) {
            try {
                v.f fVar = B;
                fVar.getClass();
                v.a aVar = new v.a(fVar);
                while (aVar.hasNext()) {
                    q qVar = (q) ((WeakReference) aVar.next()).get();
                    if (qVar == d0Var || qVar == null) {
                        aVar.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void k() {
        if (f5984w != 2) {
            f5984w = 2;
            synchronized (C) {
                try {
                    v.f fVar = B;
                    fVar.getClass();
                    v.a aVar = new v.a(fVar);
                    while (aVar.hasNext()) {
                        q qVar = (q) ((WeakReference) aVar.next()).get();
                        if (qVar != null) {
                            ((d0) qVar).m(true, true);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public abstract void a();

    public abstract void b();

    public abstract void d();

    public abstract void e();

    public abstract boolean g(int i);

    public abstract void h(int i);

    public abstract void i(View view);

    public abstract void j(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void l(CharSequence charSequence);
}
