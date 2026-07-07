package i;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class v {
    public static OnBackInvokedDispatcher a(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    public static OnBackInvokedCallback b(Object obj, b0 b0Var) {
        Objects.requireNonNull(b0Var);
        d.i0 i0Var = new d.i0(b0Var, 1);
        c2.b.j(obj).registerOnBackInvokedCallback(1000000, i0Var);
        return i0Var;
    }

    public static void c(Object obj, Object obj2) {
        c2.b.j(obj).unregisterOnBackInvokedCallback(c2.b.g(obj2));
    }
}
