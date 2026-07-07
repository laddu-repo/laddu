package da;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class k extends t {
    public static void g(k kVar, boolean z2) {
        h hVar = null;
        while (true) {
            for (s sVarS = t.B.s(kVar); sVarS != null; sVarS = sVarS.f4446b) {
                Thread thread = sVarS.f4445a;
                if (thread != null) {
                    sVarS.f4445a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z2) {
                kVar.k();
                z2 = false;
            }
            kVar.d();
            h hVar2 = hVar;
            h hVarR = t.B.r(kVar);
            h hVar3 = hVar2;
            while (hVarR != null) {
                h hVar4 = hVarR.f4419c;
                hVarR.f4419c = hVar3;
                hVar3 = hVarR;
                hVarR = hVar4;
            }
            while (hVar3 != null) {
                hVar = hVar3.f4419c;
                Runnable runnable = hVar3.f4417a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof e) {
                    e eVar = (e) runnable;
                    kVar = eVar.f4405v;
                    if (kVar.f4450v == eVar) {
                        if (t.B.g(kVar, eVar, j(eVar.f4406w))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = hVar3.f4418b;
                    Objects.requireNonNull(executor);
                    h(runnable, executor);
                }
                hVar3 = hVar;
            }
            return;
        }
    }

    public static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e7) {
            t.f4449z.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e7);
        }
    }

    public static Object i(Object obj) throws ExecutionException {
        if (obj instanceof d) {
            Throwable th = ((d) obj).f4401b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof g) {
            throw new ExecutionException(((g) obj).f4410a);
        }
        if (obj == t.f4448y) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object j(ListenableFuture listenableFuture) {
        Object obj;
        Throwable thA;
        if (listenableFuture instanceof i) {
            Object dVar = ((k) listenableFuture).f4450v;
            if (dVar instanceof d) {
                d dVar2 = (d) dVar;
                if (dVar2.f4400a) {
                    dVar = dVar2.f4401b != null ? new d(dVar2.f4401b, false) : d.f4399d;
                }
            }
            Objects.requireNonNull(dVar);
            return dVar;
        }
        if ((listenableFuture instanceof ea.a) && (thA = ((ea.a) listenableFuture).a()) != null) {
            return new g(thA);
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        boolean z2 = true;
        if ((!t.A) && zIsCancelled) {
            d dVar3 = d.f4399d;
            Objects.requireNonNull(dVar3);
            return dVar3;
        }
        boolean z10 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = listenableFuture.get();
                        break;
                    } catch (Error | Exception e7) {
                        e = e7;
                        return new g(e);
                    } catch (CancellationException e10) {
                        if (zIsCancelled) {
                            return new d(e10, false);
                        }
                        return new g(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e10));
                    } catch (ExecutionException e11) {
                        if (!zIsCancelled) {
                            return new g(e11.getCause());
                        }
                        return new d(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture, e11), false);
                    }
                } catch (InterruptedException unused) {
                    z10 = z2;
                } catch (Throwable th) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (Error e12) {
                e = e12;
                return new g(e);
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        if (!zIsCancelled) {
            return obj == null ? t.f4448y : obj;
        }
        return new d(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture), false);
    }

    @Override // ea.a
    public final Throwable a() {
        if (!(this instanceof i)) {
            return null;
        }
        Object obj = this.f4450v;
        if (obj instanceof g) {
            return ((g) obj).f4410a;
        }
        return null;
    }

    public final void c(StringBuilder sb2) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (CancellationException unused) {
                    sb2.append("CANCELLED");
                    return;
                } catch (ExecutionException e7) {
                    sb2.append("FAILURE, cause=[");
                    sb2.append(e7.getCause());
                    sb2.append("]");
                    return;
                } catch (Exception e10) {
                    sb2.append("UNKNOWN, cause=[");
                    sb2.append(e10.getClass());
                    sb2.append(" thrown from get()]");
                    return;
                }
            } catch (InterruptedException unused2) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        sb2.append("SUCCESS, result=[");
        e(sb2, obj);
        sb2.append("]");
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z2) {
        d dVar;
        Object obj = this.f4450v;
        if (!(obj == null) && !(obj instanceof e)) {
            return false;
        }
        if (t.A) {
            dVar = new d(new CancellationException("Future.cancel() was called."), z2);
        } else {
            dVar = z2 ? d.f4398c : d.f4399d;
            Objects.requireNonNull(dVar);
        }
        k kVar = this;
        boolean z10 = false;
        while (true) {
            if (t.B.g(kVar, obj, dVar)) {
                g(kVar, z2);
                if (!(obj instanceof e)) {
                    break;
                }
                ListenableFuture listenableFuture = ((e) obj).f4406w;
                if (!(listenableFuture instanceof i)) {
                    listenableFuture.cancel(z2);
                    break;
                }
                kVar = (k) listenableFuture;
                obj = kVar.f4450v;
                if (!(obj == null) && !(obj instanceof e)) {
                    break;
                }
                z10 = true;
            } else {
                obj = kVar.f4450v;
                if (!(obj instanceof e)) {
                    return z10;
                }
            }
        }
        return true;
    }

    public final void e(StringBuilder sb2, Object obj) {
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

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void f(Runnable runnable, Executor executor) {
        h hVar;
        h hVar2 = h.f4416d;
        p4.v.n(executor, "Executor was null.");
        if (!isDone() && (hVar = this.f4451w) != hVar2) {
            h hVar3 = new h(runnable, executor);
            do {
                hVar3.f4419c = hVar;
                if (t.B.f(this, hVar, hVar3)) {
                    return;
                } else {
                    hVar = this.f4451w;
                }
            } while (hVar != hVar2);
        }
        h(runnable, executor);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x00c6 -> B:37:0x0083). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object get(long r21, java.util.concurrent.TimeUnit r23) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: da.k.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public boolean isCancelled() {
        return this.f4450v instanceof d;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r0 instanceof e)) & (this.f4450v != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String l() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public boolean m(Object obj) {
        if (obj == null) {
            obj = t.f4448y;
        }
        if (!t.B.g(this, null, obj)) {
            return false;
        }
        g(this, false);
        return true;
    }

    public boolean n(Throwable th) {
        th.getClass();
        if (!t.B.g(this, null, new g(th))) {
            return false;
        }
        g(this, false);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean o(com.google.common.util.concurrent.ListenableFuture r6) {
        /*
            r5 = this;
            r6.getClass()
            java.lang.Object r0 = r5.f4450v
            r1 = 0
            if (r0 != 0) goto L44
            boolean r0 = r6.isDone()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L20
            java.lang.Object r6 = j(r6)
            qf.g r0 = da.t.B
            boolean r6 = r0.g(r5, r3, r6)
            if (r6 == 0) goto L4f
            g(r5, r1)
            return r2
        L20:
            da.e r0 = new da.e
            r0.<init>(r5, r6)
            qf.g r4 = da.t.B
            boolean r3 = r4.g(r5, r3, r0)
            if (r3 == 0) goto L42
            da.f0 r1 = da.f0.f4407v     // Catch: java.lang.Throwable -> L33
            r6.f(r0, r1)     // Catch: java.lang.Throwable -> L33
            return r2
        L33:
            r6 = move-exception
            da.g r1 = new da.g     // Catch: java.lang.Throwable -> L3a
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            goto L3c
        L3a:
            da.g r1 = da.g.f4409b
        L3c:
            qf.g r6 = da.t.B
            r6.g(r5, r0, r1)
            return r2
        L42:
            java.lang.Object r0 = r5.f4450v
        L44:
            boolean r2 = r0 instanceof da.d
            if (r2 == 0) goto L4f
            da.d r0 = (da.d) r0
            boolean r0 = r0.f4400a
            r6.cancel(r0)
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: da.k.o(com.google.common.util.concurrent.ListenableFuture):boolean");
    }

    public final boolean p() {
        Object obj = this.f4450v;
        return (obj instanceof d) && ((d) obj).f4400a;
    }

    public String toString() {
        String strL;
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            c(sb2);
        } else {
            int length = sb2.length();
            sb2.append("PENDING");
            Object obj = this.f4450v;
            if (obj instanceof e) {
                sb2.append(", setFuture=[");
                ListenableFuture listenableFuture = ((e) obj).f4406w;
                try {
                    if (listenableFuture == this) {
                        sb2.append("this future");
                    } else {
                        sb2.append(listenableFuture);
                    }
                } catch (Throwable th) {
                    if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
                        throw th;
                    }
                    sb2.append("Exception thrown from implementation: ");
                    sb2.append(th.getClass());
                }
                sb2.append("]");
            } else {
                try {
                    strL = l();
                    if (fa.b.y(strL)) {
                        strL = null;
                    }
                } catch (Throwable th2) {
                    if ((th2 instanceof Error) && !(th2 instanceof StackOverflowError)) {
                        throw th2;
                    }
                    strL = "Exception thrown from implementation: " + th2.getClass();
                }
                if (strL != null) {
                    sb2.append(", info=[");
                    sb2.append(strL);
                    sb2.append("]");
                }
            }
            if (isDone()) {
                sb2.delete(length, sb2.length());
                c(sb2);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public void d() {
    }

    public void k() {
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        s sVar = s.f4444c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f4450v;
            if ((obj2 != null) & (!(obj2 instanceof e))) {
                return i(obj2);
            }
            s sVar2 = this.f4452x;
            if (sVar2 != sVar) {
                s sVar3 = new s();
                do {
                    qf.g gVar = t.B;
                    gVar.C(sVar3, sVar2);
                    if (gVar.h(this, sVar2, sVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f4450v;
                            } else {
                                b(sVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof e))));
                        return i(obj);
                    }
                    sVar2 = this.f4452x;
                } while (sVar2 != sVar);
            }
            Object obj3 = this.f4450v;
            Objects.requireNonNull(obj3);
            return i(obj3);
        }
        throw new InterruptedException();
    }
}
