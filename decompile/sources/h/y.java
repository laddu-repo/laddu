package h;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class y {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, d0 d0Var) {
        Objects.requireNonNull(d0Var);
        x xVar = new x(0, d0Var);
        c.a.g(obj).registerOnBackInvokedCallback(1000000, xVar);
        return xVar;
    }

    public static void c(Object obj, Object obj2) {
        c.a.g(obj).unregisterOnBackInvokedCallback(c.a.c(obj2));
    }
}
