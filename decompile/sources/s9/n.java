package s9;

import com.google.android.gms.internal.measurement.j4;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import jf.r;
import w8.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n extends Task {

    /* renamed from: a, reason: collision with root package name */
    public final Object f12275a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final j4 f12276b = new j4(5);

    /* renamed from: c, reason: collision with root package name */
    public boolean f12277c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f12278d;

    /* renamed from: e, reason: collision with root package name */
    public Object f12279e;

    /* renamed from: f, reason: collision with root package name */
    public Exception f12280f;

    @Override // com.google.android.gms.tasks.Task
    public final n a(Executor executor, b bVar) {
        this.f12276b.d(new l(executor, bVar));
        p();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final n b(Executor executor, d dVar) {
        this.f12276b.d(new l(executor, dVar));
        p();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final n c(Executor executor, e eVar) {
        this.f12276b.d(new l(executor, eVar));
        p();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final n d(Executor executor, a aVar) {
        n nVar = new n();
        this.f12276b.d(new k(executor, aVar, nVar, 1));
        p();
        return nVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception e() {
        Exception exc;
        synchronized (this.f12275a) {
            exc = this.f12280f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object f() {
        Object obj;
        synchronized (this.f12275a) {
            try {
                x.i("Task is not yet complete", this.f12277c);
                if (!this.f12278d) {
                    Exception exc = this.f12280f;
                    if (exc == null) {
                        obj = this.f12279e;
                    } else {
                        throw new RuntimeException(exc);
                    }
                } else {
                    throw new CancellationException("Task is already canceled.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean g() {
        boolean z10;
        synchronized (this.f12275a) {
            z10 = this.f12277c;
        }
        return z10;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean h() {
        boolean z10;
        synchronized (this.f12275a) {
            try {
                z10 = false;
                if (this.f12277c && !this.f12278d && this.f12280f == null) {
                    z10 = true;
                }
            } finally {
            }
        }
        return z10;
    }

    public final n i(Executor executor, c cVar) {
        this.f12276b.d(new l(executor, cVar));
        p();
        return this;
    }

    public final n j(Executor executor, a aVar) {
        n nVar = new n();
        this.f12276b.d(new k(executor, aVar, nVar, 0));
        p();
        return nVar;
    }

    public final n k(Executor executor, g gVar) {
        n nVar = new n();
        this.f12276b.d(new l(executor, gVar, nVar));
        p();
        return nVar;
    }

    public final void l(Exception exc) {
        x.h(exc, "Exception must not be null");
        synchronized (this.f12275a) {
            o();
            this.f12277c = true;
            this.f12280f = exc;
        }
        this.f12276b.f(this);
    }

    public final void m(Object obj) {
        synchronized (this.f12275a) {
            o();
            this.f12277c = true;
            this.f12279e = obj;
        }
        this.f12276b.f(this);
    }

    public final void n() {
        synchronized (this.f12275a) {
            try {
                if (this.f12277c) {
                    return;
                }
                this.f12277c = true;
                this.f12278d = true;
                this.f12276b.f(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o() {
        String str;
        if (this.f12277c) {
            int i6 = r.f7477x;
            if (g()) {
                Exception e10 = e();
                if (e10 == null) {
                    if (!h()) {
                        if (this.f12278d) {
                            str = "cancellation";
                        } else {
                            str = "unknown issue";
                        }
                    } else {
                        str = "result ".concat(String.valueOf(f()));
                    }
                } else {
                    str = "failure";
                }
                throw new IllegalStateException("Complete with: ".concat(str), e10);
            }
            throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
    }

    public final void p() {
        synchronized (this.f12275a) {
            try {
                if (!this.f12277c) {
                    return;
                }
                this.f12276b.f(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
