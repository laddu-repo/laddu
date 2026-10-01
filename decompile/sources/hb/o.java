package hb;

import com.google.android.gms.internal.measurement.k4;
import java.util.Objects;
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
public abstract class o extends ib.a implements x {
    public static final boolean A;
    public static final w B;
    public static final k4 C;
    public static final Object D;

    /* renamed from: x, reason: collision with root package name */
    public volatile Object f6026x;

    /* renamed from: y, reason: collision with root package name */
    public volatile c f6027y;

    /* renamed from: z, reason: collision with root package name */
    public volatile n f6028z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.google.android.gms.internal.measurement.k4] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    static {
        boolean z10;
        Throwable th;
        ?? dVar;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        A = z10;
        B = new w(o.class);
        Throwable th2 = null;
        try {
            th = null;
            dVar = new Object();
        } catch (Error | Exception e10) {
            th = e10;
            try {
                dVar = new d(AtomicReferenceFieldUpdater.newUpdater(n.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(n.class, n.class, "b"), AtomicReferenceFieldUpdater.newUpdater(o.class, n.class, "z"), AtomicReferenceFieldUpdater.newUpdater(o.class, c.class, "y"), AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "x"));
            } catch (Error | Exception e11) {
                th2 = e11;
                dVar = new Object();
            }
        }
        C = dVar;
        if (th2 != null) {
            w wVar = B;
            Logger a10 = wVar.a();
            Level level = Level.SEVERE;
            a10.log(level, "UnsafeAtomicHelper is broken!", th);
            wVar.a().log(level, "SafeAtomicHelper is broken!", th2);
        }
        D = new Object();
    }

    public static void e(o oVar, boolean z10) {
        c cVar = null;
        while (true) {
            for (n h4 = C.h(oVar); h4 != null; h4 = h4.f6025b) {
                Thread thread = h4.f6024a;
                if (thread != null) {
                    h4.f6024a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z10) {
                z10 = false;
            }
            oVar.c();
            c cVar2 = cVar;
            c g10 = C.g(oVar);
            c cVar3 = cVar2;
            while (g10 != null) {
                c cVar4 = g10.f6016c;
                g10.f6016c = cVar3;
                cVar3 = g10;
                g10 = cVar4;
            }
            while (cVar3 != null) {
                cVar = cVar3.f6016c;
                Runnable runnable = cVar3.f6014a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof e) {
                    e eVar = (e) runnable;
                    oVar = eVar.f6018x;
                    if (oVar.f6026x == eVar) {
                        if (C.d(oVar, eVar, h(eVar.f6019y))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = cVar3.f6015b;
                    Objects.requireNonNull(executor);
                    f(runnable, executor);
                }
                cVar3 = cVar;
            }
            return;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            B.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object g(Object obj) {
        if (!(obj instanceof a)) {
            if (!(obj instanceof b)) {
                if (obj == D) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((b) obj).f6012a);
        }
        Throwable th = ((a) obj).f6008b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object h(hb.x r6) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hb.o.h(hb.x):java.lang.Object");
    }

    @Override // hb.x
    public void a(Runnable runnable, Executor executor) {
        c cVar;
        c cVar2 = c.f6013d;
        jb.b.f(executor, "Executor was null.");
        if (!isDone() && (cVar = this.f6027y) != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f6016c = cVar;
                if (C.c(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.f6027y;
                }
            } while (cVar != cVar2);
        }
        f(runnable, executor);
    }

    public final void b(StringBuilder sb2) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (CancellationException unused) {
                    sb2.append("CANCELLED");
                    return;
                } catch (ExecutionException e10) {
                    sb2.append("FAILURE, cause=[");
                    sb2.append(e10.getCause());
                    sb2.append("]");
                    return;
                } catch (Exception e11) {
                    sb2.append("UNKNOWN, cause=[");
                    sb2.append(e11.getClass());
                    sb2.append(" thrown from get()]");
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
        d(sb2, obj);
        sb2.append("]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f6026x
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = 0
        L9:
            boolean r4 = r0 instanceof hb.e
            r3 = r3 | r4
            if (r3 == 0) goto L5e
            boolean r3 = hb.o.A
            if (r3 == 0) goto L1f
            hb.a r3 = new hb.a
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r4, r8)
            goto L29
        L1f:
            if (r8 == 0) goto L24
            hb.a r3 = hb.a.f6005c
            goto L26
        L24:
            hb.a r3 = hb.a.f6006d
        L26:
            java.util.Objects.requireNonNull(r3)
        L29:
            r5 = 0
            r4 = r7
        L2b:
            com.google.android.gms.internal.measurement.k4 r6 = hb.o.C
            boolean r6 = r6.d(r4, r0, r3)
            if (r6 == 0) goto L57
            e(r4, r8)
            boolean r4 = r0 instanceof hb.e
            if (r4 == 0) goto L56
            hb.e r0 = (hb.e) r0
            hb.x r0 = r0.f6019y
            boolean r4 = r0 instanceof hb.g
            if (r4 == 0) goto L53
            r4 = r0
            hb.o r4 = (hb.o) r4
            java.lang.Object r0 = r4.f6026x
            if (r0 != 0) goto L4b
            r5 = 1
            goto L4c
        L4b:
            r5 = 0
        L4c:
            boolean r6 = r0 instanceof hb.e
            r5 = r5 | r6
            if (r5 == 0) goto L56
            r5 = 1
            goto L2b
        L53:
            r0.cancel(r8)
        L56:
            return r1
        L57:
            java.lang.Object r0 = r4.f6026x
            boolean r6 = r0 instanceof hb.e
            if (r6 != 0) goto L2b
            return r5
        L5e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: hb.o.cancel(boolean):boolean");
    }

    public final void d(StringBuilder sb2, Object obj) {
        if (obj == null) {
            sb2.append("null");
        } else {
            if (obj == this) {
                sb2.append("this future");
                return;
            }
            sb2.append(obj.getClass().getName());
            sb2.append("@");
            sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00c4 -> B:34:0x0082). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object get(long r21, java.util.concurrent.TimeUnit r23) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hb.o.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String i() {
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    public boolean isCancelled() {
        return this.f6026x instanceof a;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        boolean z10;
        if (this.f6026x != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return (!(r0 instanceof e)) & z10;
    }

    public final void j(n nVar) {
        nVar.f6024a = null;
        while (true) {
            n nVar2 = this.f6028z;
            if (nVar2 != n.f6023c) {
                n nVar3 = null;
                while (nVar2 != null) {
                    n nVar4 = nVar2.f6025b;
                    if (nVar2.f6024a != null) {
                        nVar3 = nVar2;
                    } else if (nVar3 != null) {
                        nVar3.f6025b = nVar4;
                        if (nVar3.f6024a == null) {
                            break;
                        }
                    } else if (!C.e(this, nVar2, nVar4)) {
                        break;
                    }
                    nVar2 = nVar4;
                }
                return;
            }
            return;
        }
    }

    public boolean k(Object obj) {
        if (obj == null) {
            obj = D;
        }
        if (!C.d(this, null, obj)) {
            return false;
        }
        e(this, false);
        return true;
    }

    public boolean l(Throwable th) {
        th.getClass();
        if (!C.d(this, null, new b(th))) {
            return false;
        }
        e(this, false);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009d, code lost:
    
        if (r3.isEmpty() != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "com.google.common.util.concurrent."
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L21
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            goto L2c
        L21:
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
        L2c:
            r1 = 64
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r6)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "[status="
            r0.append(r1)
            boolean r1 = r6.isCancelled()
            java.lang.String r2 = "]"
            if (r1 == 0) goto L50
            java.lang.String r1 = "CANCELLED"
            r0.append(r1)
            goto Ld3
        L50:
            boolean r1 = r6.isDone()
            if (r1 == 0) goto L5b
            r6.b(r0)
            goto Ld3
        L5b:
            int r1 = r0.length()
            java.lang.String r3 = "PENDING"
            r0.append(r3)
            java.lang.Object r3 = r6.f6026x
            boolean r4 = r3 instanceof hb.e
            java.lang.String r5 = "Exception thrown from implementation: "
            if (r4 == 0) goto L93
            java.lang.String r4 = ", setFuture=["
            r0.append(r4)
            hb.e r3 = (hb.e) r3
            hb.x r3 = r3.f6019y
            if (r3 != r6) goto L81
            java.lang.String r3 = "this future"
            r0.append(r3)     // Catch: java.lang.StackOverflowError -> L7d java.lang.Exception -> L7f
            goto L8f
        L7d:
            r3 = move-exception
            goto L85
        L7f:
            r3 = move-exception
            goto L85
        L81:
            r0.append(r3)     // Catch: java.lang.StackOverflowError -> L7d java.lang.Exception -> L7f
            goto L8f
        L85:
            r0.append(r5)
            java.lang.Class r3 = r3.getClass()
            r0.append(r3)
        L8f:
            r0.append(r2)
            goto Lc3
        L93:
            java.lang.String r3 = r6.i()     // Catch: java.lang.StackOverflowError -> La0 java.lang.Exception -> La2
            if (r3 == 0) goto La4
            boolean r4 = r3.isEmpty()     // Catch: java.lang.StackOverflowError -> La0 java.lang.Exception -> La2
            if (r4 == 0) goto Lb6
            goto La4
        La0:
            r3 = move-exception
            goto La6
        La2:
            r3 = move-exception
            goto La6
        La4:
            r3 = 0
            goto Lb6
        La6:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            java.lang.Class r3 = r3.getClass()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
        Lb6:
            if (r3 == 0) goto Lc3
            java.lang.String r4 = ", info=["
            r0.append(r4)
            r0.append(r3)
            r0.append(r2)
        Lc3:
            boolean r3 = r6.isDone()
            if (r3 == 0) goto Ld3
            int r3 = r0.length()
            r0.delete(r1, r3)
            r6.b(r0)
        Ld3:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hb.o.toString():java.lang.String");
    }

    public void c() {
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        Object obj;
        n nVar = n.f6023c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f6026x;
            if ((obj2 != null) & (!(obj2 instanceof e))) {
                return g(obj2);
            }
            n nVar2 = this.f6028z;
            if (nVar2 != nVar) {
                n nVar3 = new n();
                do {
                    k4 k4Var = C;
                    k4Var.o(nVar3, nVar2);
                    if (k4Var.e(this, nVar2, nVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f6026x;
                            } else {
                                j(nVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof e))));
                        return g(obj);
                    }
                    nVar2 = this.f6028z;
                } while (nVar2 != nVar);
            }
            Object obj3 = this.f6026x;
            Objects.requireNonNull(obj3);
            return g(obj3);
        }
        throw new InterruptedException();
    }
}
