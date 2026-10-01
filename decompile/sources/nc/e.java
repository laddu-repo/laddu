package nc;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f9605d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final q.a f9606e = new q.a(1);

    /* renamed from: a, reason: collision with root package name */
    public final Executor f9607a;

    /* renamed from: b, reason: collision with root package name */
    public final p f9608b;

    /* renamed from: c, reason: collision with root package name */
    public s9.n f9609c = null;

    public e(Executor executor, p pVar) {
        this.f9607a = executor;
        this.f9608b = pVar;
    }

    public static Object a(Task task) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        d dVar = new d(0);
        Executor executor = f9606e;
        task.c(executor, dVar);
        task.b(executor, dVar);
        task.a(executor, dVar);
        if (dVar.f9604y.await(5L, timeUnit)) {
            if (task.h()) {
                return task.f();
            }
            throw new ExecutionException(task.e());
        }
        throw new TimeoutException("Task await timed out.");
    }

    public static synchronized e d(Executor executor, p pVar) {
        e eVar;
        synchronized (e.class) {
            try {
                String str = pVar.f9672b;
                HashMap hashMap = f9605d;
                if (!hashMap.containsKey(str)) {
                    hashMap.put(str, new e(executor, pVar));
                }
                eVar = (e) hashMap.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public final synchronized Task b() {
        try {
            s9.n nVar = this.f9609c;
            if (nVar != null) {
                if (nVar.g() && !this.f9609c.h()) {
                }
            }
            Executor executor = this.f9607a;
            p pVar = this.f9608b;
            Objects.requireNonNull(pVar);
            this.f9609c = dg.b.c(executor, new b7.l(pVar, 2));
        } catch (Throwable th) {
            throw th;
        }
        return this.f9609c;
    }

    public final g c() {
        synchronized (this) {
            try {
                s9.n nVar = this.f9609c;
                if (nVar != null && nVar.h()) {
                    return (g) this.f9609c.f();
                }
                try {
                    Task b10 = b();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    return (g) a(b10);
                } catch (InterruptedException | ExecutionException | TimeoutException e10) {
                    Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e10);
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final s9.n e(g gVar) {
        b7.d dVar = new b7.d(4, this, gVar);
        Executor executor = this.f9607a;
        return dg.b.c(executor, dVar).k(executor, new b2.b(14, this, gVar));
    }
}
