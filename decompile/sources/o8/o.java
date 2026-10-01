package o8;

import com.bumptech.glide.manager.t;
import com.google.android.gms.internal.measurement.ig;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import t7.y;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9982a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f9983b = new t(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f9985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f9986e;
    public Exception f;

    public final void a(Executor executor, b bVar) {
        this.f9983b.h(new l(executor, bVar));
        q();
    }

    public final void b(Executor executor, c cVar) {
        this.f9983b.h(new l(executor, cVar));
        q();
    }

    public final void c(Executor executor, d dVar) {
        this.f9983b.h(new l(executor, dVar));
        q();
    }

    public final void d(Executor executor, e eVar) {
        this.f9983b.h(new l(executor, eVar));
        q();
    }

    public final o e(Executor executor, a aVar) {
        o oVar = new o();
        this.f9983b.h(new k(executor, aVar, oVar, 0));
        q();
        return oVar;
    }

    public final o f(Executor executor, a aVar) {
        o oVar = new o();
        this.f9983b.h(new k(executor, aVar, oVar, 1));
        q();
        return oVar;
    }

    public final Exception g() {
        Exception exc;
        synchronized (this.f9982a) {
            exc = this.f;
        }
        return exc;
    }

    public final Object h() {
        Object obj;
        synchronized (this.f9982a) {
            try {
                y.i("Task is not yet complete", this.f9984c);
                if (this.f9985d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f;
                if (exc != null) {
                    throw new f(exc);
                }
                obj = this.f9986e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final boolean i() {
        boolean z2;
        synchronized (this.f9982a) {
            z2 = this.f9984c;
        }
        return z2;
    }

    public final boolean j() {
        boolean z2;
        synchronized (this.f9982a) {
            try {
                z2 = false;
                if (this.f9984c && !this.f9985d && this.f == null) {
                    z2 = true;
                }
            } finally {
            }
        }
        return z2;
    }

    public final o k(Executor executor, g gVar) {
        o oVar = new o();
        this.f9983b.h(new l(executor, gVar, oVar));
        q();
        return oVar;
    }

    public final void l(Object obj) {
        synchronized (this.f9982a) {
            p();
            this.f9984c = true;
            this.f9986e = obj;
        }
        this.f9983b.i(this);
    }

    public final boolean m(Object obj) {
        synchronized (this.f9982a) {
            try {
                if (this.f9984c) {
                    return false;
                }
                this.f9984c = true;
                this.f9986e = obj;
                this.f9983b.i(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n(Exception exc) {
        y.h(exc, "Exception must not be null");
        synchronized (this.f9982a) {
            p();
            this.f9984c = true;
            this.f = exc;
        }
        this.f9983b.i(this);
    }

    public final void o() {
        synchronized (this.f9982a) {
            try {
                if (this.f9984c) {
                    return;
                }
                this.f9984c = true;
                this.f9985d = true;
                this.f9983b.i(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void p() {
        if (this.f9984c) {
            int i = ig.f2762v;
            if (!i()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excG = g();
        }
    }

    public final void q() {
        synchronized (this.f9982a) {
            try {
                if (this.f9984c) {
                    this.f9983b.i(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
