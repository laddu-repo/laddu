package b7;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: e, reason: collision with root package name */
    public static final Executor f1522e;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f1523a = new LinkedHashSet(1);

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f1524b = new LinkedHashSet(1);

    /* renamed from: c, reason: collision with root package name */
    public final Handler f1525c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public volatile d0 f1526d = null;

    static {
        if ("true".equals(System.getProperty("lottie.testing.directExecutor"))) {
            f1522e = new q.a(1);
        } else {
            f1522e = Executors.newCachedThreadPool(new n7.d());
        }
    }

    public f0(j jVar) {
        f(new d0(jVar));
    }

    public final synchronized void a(b0 b0Var) {
        Throwable th;
        try {
            d0 d0Var = this.f1526d;
            if (d0Var != null && (th = d0Var.f1518b) != null) {
                b0Var.onResult(th);
            }
            this.f1524b.add(b0Var);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(b0 b0Var) {
        j jVar;
        try {
            d0 d0Var = this.f1526d;
            if (d0Var != null && (jVar = d0Var.f1517a) != null) {
                b0Var.onResult(jVar);
            }
            this.f1523a.add(b0Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(Throwable th) {
        ArrayList arrayList = new ArrayList(this.f1524b);
        if (arrayList.isEmpty()) {
            n7.c.c("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            ((b0) obj).onResult(th);
        }
    }

    public final void d() {
        d0 d0Var = this.f1526d;
        if (d0Var == null) {
            return;
        }
        j jVar = d0Var.f1517a;
        if (jVar != null) {
            synchronized (this) {
                ArrayList arrayList = new ArrayList(this.f1523a);
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    ((b0) obj).onResult(jVar);
                }
            }
            return;
        }
        c(d0Var.f1518b);
    }

    public final synchronized void e(i iVar) {
        this.f1524b.remove(iVar);
    }

    public final void f(d0 d0Var) {
        if (this.f1526d == null) {
            this.f1526d = d0Var;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                d();
                return;
            } else {
                this.f1525c.post(new a2.a(this, 8));
                return;
            }
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.concurrent.FutureTask, b7.e0, java.lang.Runnable] */
    public f0(Callable callable, boolean z10) {
        if (z10) {
            try {
                f((d0) callable.call());
                return;
            } catch (Throwable th) {
                f(new d0(th));
                return;
            }
        }
        Executor executor = f1522e;
        ?? futureTask = new FutureTask(callable);
        futureTask.f1519x = this;
        executor.execute(futureTask);
    }
}
