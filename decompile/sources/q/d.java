package q;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d extends a8.a {

    /* renamed from: f, reason: collision with root package name */
    public final Object f10789f;

    /* renamed from: g, reason: collision with root package name */
    public final ExecutorService f10790g;

    /* renamed from: h, reason: collision with root package name */
    public volatile Handler f10791h;

    public d() {
        super(8);
        this.f10789f = new Object();
        this.f10790g = Executors.newFixedThreadPool(4, new c());
    }

    public static Handler H(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return j0.a.b(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    public final boolean I() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }
}
