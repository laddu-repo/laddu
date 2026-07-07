package ta;

import android.util.Log;
import b8.h;
import de.i;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f12520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f12521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f12522c;

    public c(ExecutorService executorService, ExecutorService executorService2) {
        i.e(executorService, "backgroundExecutorService");
        i.e(executorService2, "blockingExecutorService");
        this.f12520a = new b(executorService);
        this.f12521b = new b(executorService);
        h.o(null);
        this.f12522c = new b(executorService2);
    }

    public static final void a() {
        String name = Thread.currentThread().getName();
        i.d(name, "<get-threadName>(...)");
        if (ke.h.E(name, "Firebase Background Thread #", false)) {
            return;
        }
        String str = "Must be called on a background thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public static final void b() {
        String name = Thread.currentThread().getName();
        i.d(name, "<get-threadName>(...)");
        if (ke.h.E(name, "Firebase Blocking Thread #", false)) {
            return;
        }
        String str = "Must be called on a blocking thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }
}
