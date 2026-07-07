package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.z0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class w0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, w event) {
        kotlin.jvm.internal.k.e(event, "event");
        if (activity instanceof f0) {
            y lifecycle = ((f0) activity).getLifecycle();
            if (lifecycle instanceof h0) {
                ((h0) lifecycle).f(event);
            }
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            z0.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new z0.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new z0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
