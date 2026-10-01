package i;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: x, reason: collision with root package name */
    public static final o f6255x = new o(new p(0));

    /* renamed from: y, reason: collision with root package name */
    public static int f6256y = -100;

    /* renamed from: z, reason: collision with root package name */
    public static p0.e f6257z = null;
    public static p0.e A = null;
    public static Boolean B = null;
    public static boolean C = false;
    public static final v.f D = new v.f(0);
    public static final Object E = new Object();
    public static final Object F = new Object();

    public static boolean b(Context context) {
        int i6;
        if (B == null) {
            try {
                int i10 = h0.f6211x;
                if (Build.VERSION.SDK_INT >= 24) {
                    i6 = g0.a() | 128;
                } else {
                    i6 = 640;
                }
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) h0.class), i6).metaData;
                if (bundle != null) {
                    B = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                B = Boolean.FALSE;
            }
        }
        return B.booleanValue();
    }

    public static void e(b0 b0Var) {
        synchronized (E) {
            try {
                v.f fVar = D;
                fVar.getClass();
                v.a aVar = new v.a(fVar);
                while (aVar.hasNext()) {
                    q qVar = (q) ((WeakReference) aVar.next()).get();
                    if (qVar == b0Var || qVar == null) {
                        aVar.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void a();

    public abstract void c();

    public abstract void d();

    public abstract boolean f(int i6);

    public abstract void g(int i6);

    public abstract void h(View view);

    public abstract void i(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void j(CharSequence charSequence);
}
