package r6;

import android.graphics.drawable.Drawable;
import android.os.Looper;
import c6.w;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import v6.m;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Future, s6.d, f {
    public w A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f11306v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c f11307w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f11308x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f11309y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f11310z;

    @Override // s6.d
    public final synchronized void a(Object obj) {
    }

    @Override // s6.d
    public final synchronized void b(Drawable drawable) {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        synchronized (this) {
            try {
                if (isDone()) {
                    return false;
                }
                this.f11308x = true;
                notifyAll();
                c cVar = null;
                if (z2) {
                    c cVar2 = this.f11307w;
                    this.f11307w = null;
                    cVar = cVar2;
                }
                if (cVar != null) {
                    cVar.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // s6.d
    public final synchronized void d(c cVar) {
        this.f11307w = cVar;
    }

    @Override // s6.d
    public final synchronized c g() {
        return this.f11307w;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        try {
            return n(null);
        } catch (TimeoutException e7) {
            throw new AssertionError(e7);
        }
    }

    @Override // r6.f
    public final synchronized void i(w wVar) {
        this.f11310z = true;
        this.A = wVar;
        notifyAll();
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        return this.f11308x;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0012  */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean isDone() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f11308x     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L12
            boolean r0 = r1.f11309y     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L12
            boolean r0 = r1.f11310z     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Le
            goto L12
        Le:
            r0 = 0
            goto L13
        L10:
            r0 = move-exception
            goto L15
        L12:
            r0 = 1
        L13:
            monitor-exit(r1)
            return r0
        L15:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.e.isDone():boolean");
    }

    @Override // s6.d
    public final void m(h hVar) throws Throwable {
        hVar.m(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public final synchronized Object n(Long l10) {
        if (!isDone()) {
            char[] cArr = m.f13232a;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new IllegalArgumentException("You must call this method on a background thread");
            }
        }
        if (this.f11308x) {
            throw new CancellationException();
        }
        if (this.f11310z) {
            throw new ExecutionException(this.A);
        }
        if (this.f11309y) {
            return this.f11306v;
        }
        if (l10 == null) {
            wait(0L);
        } else if (l10.longValue() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jLongValue = l10.longValue() + jCurrentTimeMillis;
            while (!isDone() && jCurrentTimeMillis < jLongValue) {
                wait(jLongValue - jCurrentTimeMillis);
                jCurrentTimeMillis = System.currentTimeMillis();
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        if (this.f11310z) {
            throw new ExecutionException(this.A);
        }
        if (this.f11308x) {
            throw new CancellationException();
        }
        if (this.f11309y) {
            return this.f11306v;
        }
        throw new TimeoutException();
    }

    public final String toString() {
        c cVar;
        String str;
        String strN = j4.a.n(new StringBuilder(), super.toString(), "[status=");
        synchronized (this) {
            try {
                cVar = null;
                if (this.f11308x) {
                    str = "CANCELLED";
                } else if (this.f11310z) {
                    str = "FAILURE";
                } else if (this.f11309y) {
                    str = "SUCCESS";
                } else {
                    str = "PENDING";
                    cVar = this.f11307w;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (cVar == null) {
            return strN + str + "]";
        }
        return strN + str + ", request=[" + cVar + "]]";
    }

    @Override // r6.f
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final synchronized boolean mo0a(Object obj) {
        this.f11309y = true;
        this.f11306v = obj;
        notifyAll();
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j8, TimeUnit timeUnit) {
        return n(Long.valueOf(timeUnit.toMillis(j8)));
    }

    @Override // com.bumptech.glide.manager.h
    public final void c() {
    }

    @Override // com.bumptech.glide.manager.h
    public final void k() {
    }

    @Override // com.bumptech.glide.manager.h
    public final void l() {
    }

    @Override // s6.d
    public final void e(Drawable drawable) {
    }

    @Override // s6.d
    public final void h(Drawable drawable) {
    }

    @Override // s6.d
    public final void j(h hVar) {
    }
}
