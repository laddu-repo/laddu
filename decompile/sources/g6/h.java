package g6;

import hb.x;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class h implements x {
    public static final boolean A = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger B = Logger.getLogger(h.class.getName());
    public static final a8.e C;
    public static final Object D;

    /* renamed from: x, reason: collision with root package name */
    public volatile Object f5476x;

    /* renamed from: y, reason: collision with root package name */
    public volatile c f5477y;

    /* renamed from: z, reason: collision with root package name */
    public volatile g f5478z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [a8.e] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    static {
        ?? r32;
        try {
            th = null;
            r32 = new d(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, "z"), AtomicReferenceFieldUpdater.newUpdater(h.class, c.class, "y"), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "x"));
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

    public static void c(h hVar) {
        c cVar;
        c cVar2;
        c cVar3 = null;
        while (true) {
            g gVar = hVar.f5478z;
            if (C.h(hVar, gVar, g.f5473c)) {
                while (gVar != null) {
                    Thread thread = gVar.f5474a;
                    if (thread != null) {
                        gVar.f5474a = null;
                        LockSupport.unpark(thread);
                    }
                    gVar = gVar.f5475b;
                }
                do {
                    cVar = hVar.f5477y;
                } while (!C.f(hVar, cVar, c.f5462d));
                while (true) {
                    cVar2 = cVar3;
                    cVar3 = cVar;
                    if (cVar3 == null) {
                        break;
                    }
                    cVar = cVar3.f5465c;
                    cVar3.f5465c = cVar2;
                }
                while (cVar2 != null) {
                    cVar3 = cVar2.f5465c;
                    Runnable runnable = cVar2.f5463a;
                    if (runnable instanceof e) {
                        e eVar = (e) runnable;
                        hVar = eVar.f5471x;
                        if (hVar.f5476x == eVar) {
                            if (C.g(hVar, eVar, f(eVar.f5472y))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        d(runnable, cVar2.f5464b);
                    }
                    cVar2 = cVar3;
                }
                return;
            }
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            B.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object e(Object obj) {
        if (!(obj instanceof a)) {
            if (!(obj instanceof b)) {
                if (obj == D) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((b) obj).f5461a);
        }
        Throwable th = ((a) obj).f5459b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    public static Object f(x xVar) {
        Object obj;
        if (xVar instanceof h) {
            Object obj2 = ((h) xVar).f5476x;
            if (obj2 instanceof a) {
                a aVar = (a) obj2;
                if (aVar.f5458a) {
                    if (aVar.f5459b != null) {
                        return new a(aVar.f5459b, false);
                    }
                    return a.f5457d;
                }
                return obj2;
            }
            return obj2;
        }
        boolean isCancelled = xVar.isCancelled();
        if ((!A) & isCancelled) {
            return a.f5457d;
        }
        boolean z10 = false;
        while (true) {
            try {
                try {
                    obj = xVar.get();
                    break;
                } catch (CancellationException e10) {
                    if (!isCancelled) {
                        return new b(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + xVar, e10));
                    }
                    return new a(e10, false);
                } catch (ExecutionException e11) {
                    return new b(e11.getCause());
                } catch (Throwable th) {
                    return new b(th);
                }
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        if (obj == null) {
            return D;
        }
        return obj;
    }

    @Override // hb.x
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        c cVar = this.f5477y;
        c cVar2 = c.f5462d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f5465c = cVar;
                if (C.f(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.f5477y;
                }
            } while (cVar != cVar2);
        }
        d(runnable, executor);
    }

    public final void b(StringBuilder sb2) {
        Object obj;
        String valueOf;
        boolean z10 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (CancellationException unused) {
                    sb2.append("CANCELLED");
                    return;
                } catch (RuntimeException e10) {
                    sb2.append("UNKNOWN, cause=[");
                    sb2.append(e10.getClass());
                    sb2.append(" thrown from get()]");
                    return;
                } catch (ExecutionException e11) {
                    sb2.append("FAILURE, cause=[");
                    sb2.append(e11.getCause());
                    sb2.append("]");
                    return;
                }
            } catch (InterruptedException unused2) {
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
        sb2.append("SUCCESS, result=[");
        if (obj == this) {
            valueOf = "this future";
        } else {
            valueOf = String.valueOf(obj);
        }
        sb2.append(valueOf);
        sb2.append("]");
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        boolean z11;
        a aVar;
        boolean z12;
        Object obj = this.f5476x;
        if (obj == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!(z11 | (obj instanceof e))) {
            return false;
        }
        if (A) {
            aVar = new a(new CancellationException("Future.cancel() was called."), z10);
        } else if (z10) {
            aVar = a.f5456c;
        } else {
            aVar = a.f5457d;
        }
        boolean z13 = false;
        h hVar = this;
        while (true) {
            if (C.g(hVar, obj, aVar)) {
                c(hVar);
                if (!(obj instanceof e)) {
                    break;
                }
                x xVar = ((e) obj).f5472y;
                if (xVar instanceof h) {
                    hVar = (h) xVar;
                    obj = hVar.f5476x;
                    if (obj == null) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12 && !(obj instanceof e)) {
                        break;
                    }
                    z13 = true;
                } else {
                    xVar.cancel(z10);
                    break;
                }
            } else {
                obj = hVar.f5476x;
                if (!(obj instanceof e)) {
                    return z13;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String g() {
        String valueOf;
        Object obj = this.f5476x;
        if (obj instanceof e) {
            StringBuilder sb2 = new StringBuilder("setFuture=[");
            x xVar = ((e) obj).f5472y;
            if (xVar == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(xVar);
            }
            return r4.a.o(sb2, valueOf, "]");
        }
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00ae -> B:33:0x0077). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(long r19, java.util.concurrent.TimeUnit r21) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.h.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public final void h(g gVar) {
        gVar.f5474a = null;
        while (true) {
            g gVar2 = this.f5478z;
            if (gVar2 != g.f5473c) {
                g gVar3 = null;
                while (gVar2 != null) {
                    g gVar4 = gVar2.f5475b;
                    if (gVar2.f5474a != null) {
                        gVar3 = gVar2;
                    } else if (gVar3 != null) {
                        gVar3.f5475b = gVar4;
                        if (gVar3.f5474a == null) {
                            break;
                        }
                    } else if (!C.h(this, gVar2, gVar4)) {
                        break;
                    }
                    gVar2 = gVar4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f5476x instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z10;
        if (this.f5476x != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return (!(r0 instanceof e)) & z10;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f5476x instanceof a) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            b(sb2);
        } else {
            try {
                str = g();
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

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        g gVar = g.f5473c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f5476x;
            if ((obj2 != null) & (!(obj2 instanceof e))) {
                return e(obj2);
            }
            g gVar2 = this.f5478z;
            if (gVar2 != gVar) {
                g gVar3 = new g();
                do {
                    a8.e eVar = C;
                    eVar.x(gVar3, gVar2);
                    if (eVar.h(this, gVar2, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f5476x;
                            } else {
                                h(gVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof e))));
                        return e(obj);
                    }
                    gVar2 = this.f5478z;
                } while (gVar2 != gVar);
            }
            return e(this.f5476x);
        }
        throw new InterruptedException();
    }
}
