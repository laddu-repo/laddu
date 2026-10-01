package j5;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Executor f6818e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f6819a = new LinkedHashSet(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f6820b = new LinkedHashSet(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f6821c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile b0 f6822d = null;

    static {
        if ("true".equals(System.getProperty("lottie.testing.directExecutor"))) {
            f6818e = new l4.d(0);
        } else {
            f6818e = Executors.newCachedThreadPool(new v5.d());
        }
    }

    public d0(j jVar) {
        f(new b0(jVar));
    }

    public final synchronized void a(z zVar) {
        Throwable th;
        try {
            b0 b0Var = this.f6822d;
            if (b0Var != null && (th = b0Var.f6813b) != null) {
                zVar.onResult(th);
            }
            this.f6820b.add(zVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(z zVar) {
        j jVar;
        try {
            b0 b0Var = this.f6822d;
            if (b0Var != null && (jVar = b0Var.f6812a) != null) {
                zVar.onResult(jVar);
            }
            this.f6819a.add(zVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(Throwable th) {
        ArrayList arrayList = new ArrayList(this.f6820b);
        if (arrayList.isEmpty()) {
            v5.c.c("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((z) obj).onResult(th);
        }
    }

    public final void d() {
        b0 b0Var = this.f6822d;
        if (b0Var == null) {
            return;
        }
        j jVar = b0Var.f6812a;
        if (jVar == null) {
            c(b0Var.f6813b);
            return;
        }
        synchronized (this) {
            ArrayList arrayList = new ArrayList(this.f6819a);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((z) obj).onResult(jVar);
            }
        }
    }

    public final synchronized void e(i iVar) {
        this.f6820b.remove(iVar);
    }

    public final void f(b0 b0Var) {
        if (this.f6822d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f6822d = b0Var;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            d();
        } else {
            this.f6821c.post(new androidx.emoji2.text.v(29, this));
        }
    }

    public d0(Callable callable, boolean z2) {
        if (z2) {
            try {
                f((b0) callable.call());
                return;
            } catch (Throwable th) {
                f(new b0(th));
                return;
            }
        }
        Executor executor = f6818e;
        c0 c0Var = new c0(callable);
        c0Var.f6814v = this;
        executor.execute(c0Var);
    }
}
