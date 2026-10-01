package x;

import hb.x;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class g implements x {
    public static final boolean A = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger B = Logger.getLogger(g.class.getName());
    public static final lg.c C;
    public static final Object D;

    /* renamed from: x, reason: collision with root package name */
    public volatile Object f14445x;

    /* renamed from: y, reason: collision with root package name */
    public volatile c f14446y;

    /* renamed from: z, reason: collision with root package name */
    public volatile f f14447z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [lg.c] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    static {
        ?? r32;
        try {
            th = null;
            r32 = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "z"), AtomicReferenceFieldUpdater.newUpdater(g.class, c.class, "y"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "x"));
        } catch (Throwable th) {
            th = th;
            r32 = new Object();
        }
        C = r32;
        if (th != null) {
            B.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        D = new Object();
    }

    public static void d(g gVar) {
        f fVar;
        c cVar;
        c cVar2;
        c cVar3;
        do {
            fVar = gVar.f14447z;
        } while (!C.c(gVar, fVar, f.f14442c));
        while (true) {
            cVar = null;
            if (fVar == null) {
                break;
            }
            Thread thread = fVar.f14443a;
            if (thread != null) {
                fVar.f14443a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f14444b;
        }
        gVar.c();
        do {
            cVar2 = gVar.f14446y;
        } while (!C.a(gVar, cVar2, c.f14433d));
        while (true) {
            cVar3 = cVar;
            cVar = cVar2;
            if (cVar == null) {
                break;
            }
            cVar2 = cVar.f14436c;
            cVar.f14436c = cVar3;
        }
        while (cVar3 != null) {
            c cVar4 = cVar3.f14436c;
            e(cVar3.f14434a, cVar3.f14435b);
            cVar3 = cVar4;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            B.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object f(Object obj) {
        if (!(obj instanceof a)) {
            if (!(obj instanceof b)) {
                if (obj == D) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((b) obj).f14432a);
        }
        Throwable th = ((a) obj).f14431b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    public static Object g(g gVar) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = gVar.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // hb.x
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        c cVar = this.f14446y;
        c cVar2 = c.f14433d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f14436c = cVar;
                if (C.a(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.f14446y;
                }
            } while (cVar != cVar2);
        }
        e(runnable, executor);
    }

    public final void b(StringBuilder sb2) {
        String valueOf;
        try {
            Object g10 = g(this);
            sb2.append("SUCCESS, result=[");
            if (g10 == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(g10);
            }
            sb2.append(valueOf);
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e10.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e11.getCause());
            sb2.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        boolean z11;
        a aVar;
        Object obj = this.f14445x;
        if (obj == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (A) {
                aVar = new a(new CancellationException("Future.cancel() was called."), z10);
            } else if (z10) {
                aVar = a.f14428c;
            } else {
                aVar = a.f14429d;
            }
            if (C.b(this, obj, aVar)) {
                d(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        f fVar = f.f14442c;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.f14445x;
            if (obj != null) {
                return f(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                f fVar2 = this.f14447z;
                if (fVar2 != fVar) {
                    f fVar3 = new f();
                    do {
                        lg.c cVar = C;
                        cVar.n(fVar3, fVar2);
                        if (cVar.c(this, fVar2, fVar3)) {
                            while (true) {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f14445x;
                                    if (obj2 != null) {
                                        return f(obj2);
                                    }
                                    long nanoTime2 = nanoTime - System.nanoTime();
                                    if (nanoTime2 < 1000) {
                                        i(fVar3);
                                        nanos = nanoTime2;
                                        break;
                                    }
                                    nanos = nanoTime2;
                                } else {
                                    i(fVar3);
                                    throw new InterruptedException();
                                }
                            }
                        } else {
                            fVar2 = this.f14447z;
                        }
                    } while (fVar2 != fVar);
                }
                return f(this.f14445x);
            }
            while (nanos > 0) {
                Object obj3 = this.f14445x;
                if (obj3 != null) {
                    return f(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String gVar = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String c10 = w8.k.c(str, " (plus ");
                long j10 = -nanos;
                long convert = timeUnit.convert(j10, TimeUnit.NANOSECONDS);
                long nanos2 = j10 - timeUnit.toNanos(convert);
                boolean z10 = convert == 0 || nanos2 > 1000;
                if (convert > 0) {
                    String str2 = c10 + convert + " " + lowerCase;
                    if (z10) {
                        str2 = w8.k.c(str2, ",");
                    }
                    c10 = w8.k.c(str2, " ");
                }
                if (z10) {
                    c10 = c10 + nanos2 + " nanoseconds ";
                }
                str = w8.k.c(c10, "delay)");
            }
            if (isDone()) {
                throw new TimeoutException(w8.k.c(str, " but future completed as timeout expired"));
            }
            throw new TimeoutException(str + " for " + gVar);
        }
        throw new InterruptedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String h() {
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    public final void i(f fVar) {
        fVar.f14443a = null;
        while (true) {
            f fVar2 = this.f14447z;
            if (fVar2 != f.f14442c) {
                f fVar3 = null;
                while (fVar2 != null) {
                    f fVar4 = fVar2.f14444b;
                    if (fVar2.f14443a != null) {
                        fVar3 = fVar2;
                    } else if (fVar3 != null) {
                        fVar3.f14444b = fVar4;
                        if (fVar3.f14443a == null) {
                            break;
                        }
                    } else if (!C.c(this, fVar2, fVar4)) {
                        break;
                    }
                    fVar2 = fVar4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f14445x instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        if (this.f14445x != null) {
            return true;
        }
        return false;
    }

    public boolean j(Object obj) {
        if (obj == null) {
            obj = D;
        }
        if (C.b(this, null, obj)) {
            d(this);
            return true;
        }
        return false;
    }

    public boolean k(Throwable th) {
        th.getClass();
        if (C.b(this, null, new b(th))) {
            d(this);
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f14445x instanceof a) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            b(sb2);
        } else {
            try {
                str = h();
            } catch (RuntimeException e10) {
                str = "Exception thrown from implementation: " + e10.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                b(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public void c() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        f fVar = f.f14442c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f14445x;
            if (obj2 != null) {
                return f(obj2);
            }
            f fVar2 = this.f14447z;
            if (fVar2 != fVar) {
                f fVar3 = new f();
                do {
                    lg.c cVar = C;
                    cVar.n(fVar3, fVar2);
                    if (cVar.c(this, fVar2, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f14445x;
                            } else {
                                i(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return f(obj);
                    }
                    fVar2 = this.f14447z;
                } while (fVar2 != fVar);
            }
            return f(this.f14445x);
        }
        throw new InterruptedException();
    }
}
