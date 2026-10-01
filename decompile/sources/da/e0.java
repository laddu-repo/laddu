package da;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import y9.p1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends z {
    public static final u0 J = new u0(e0.class);
    public y9.a0 G;
    public final boolean H;
    public d0 I;

    public e0(y9.a0 a0Var, boolean z2) {
        int size = a0Var.size();
        this.C = null;
        this.D = size;
        this.G = a0Var;
        this.H = z2;
    }

    @Override // da.k
    public final void d() {
        y9.a0 a0Var = this.G;
        this.G = null;
        this.I = null;
        if ((this.f4450v instanceof d) && (a0Var != null)) {
            boolean zP = p();
            p1 it = a0Var.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zP);
            }
        }
    }

    @Override // da.k
    public final void k() {
        d0 d0Var = this.I;
        if (d0Var != null) {
            d0Var.c();
        }
    }

    @Override // da.k
    public final String l() {
        y9.a0 a0Var = this.G;
        if (a0Var == null) {
            return super.l();
        }
        return "futures=" + a0Var;
    }

    public final void q(y9.a0 a0Var) {
        int iQ = z.E.q(this);
        p4.v.q("Less than 0 remaining futures", iQ >= 0);
        if (iQ == 0) {
            if (a0Var != null) {
                p1 it = a0Var.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        boolean z2 = false;
                        while (true) {
                            try {
                                future.get();
                                break;
                            } catch (InterruptedException unused) {
                                z2 = true;
                            } catch (Throwable th) {
                                if (z2) {
                                    Thread.currentThread().interrupt();
                                }
                                throw th;
                            }
                        }
                        if (z2) {
                            try {
                                Thread.currentThread().interrupt();
                            } catch (ExecutionException e7) {
                                r(e7.getCause());
                            } catch (Throwable th2) {
                                r(th2);
                            }
                        }
                    }
                }
            }
            this.C = null;
            d0 d0Var = this.I;
            if (d0Var != null) {
                try {
                    d0Var.f4402x.execute(d0Var);
                } catch (RejectedExecutionException e10) {
                    d0Var.f4403y.n(e10);
                }
            }
            this.G = null;
        }
    }

    public final void r(Throwable th) {
        th.getClass();
        if (this.H && !n(th)) {
            Set set = this.C;
            if (set == null) {
                Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                setNewSetFromMap.getClass();
                if (!(this.f4450v instanceof d)) {
                    Throwable thA = a();
                    Objects.requireNonNull(thA);
                    while (thA != null && setNewSetFromMap.add(thA)) {
                        thA = thA.getCause();
                    }
                }
                z.E.j(this, setNewSetFromMap);
                set = this.C;
                Objects.requireNonNull(set);
            }
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                if (set.add(cause)) {
                }
            }
            J.a().log(Level.SEVERE, th instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th);
            return;
        }
        boolean z2 = th instanceof Error;
        if (z2) {
            J.a().log(Level.SEVERE, z2 ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th);
        }
    }

    public final void s() {
        Objects.requireNonNull(this.G);
        if (this.G.isEmpty()) {
            d0 d0Var = this.I;
            if (d0Var != null) {
                try {
                    d0Var.f4402x.execute(d0Var);
                    return;
                } catch (RejectedExecutionException e7) {
                    d0Var.f4403y.n(e7);
                    return;
                }
            }
            return;
        }
        boolean z2 = this.H;
        f0 f0Var = f0.f4407v;
        if (!z2) {
            y9.a0 a0Var = this.G;
            androidx.fragment.app.d dVar = new androidx.fragment.app.d(11, this, (Object) null);
            p1 it = a0Var.iterator();
            while (it.hasNext()) {
                ListenableFuture listenableFuture = (ListenableFuture) it.next();
                if (listenableFuture.isDone()) {
                    q(null);
                } else {
                    listenableFuture.f(dVar, f0Var);
                }
            }
            return;
        }
        p1 it2 = this.G.iterator();
        int i = 0;
        while (it2.hasNext()) {
            ListenableFuture listenableFuture2 = (ListenableFuture) it2.next();
            int i10 = i + 1;
            if (listenableFuture2.isDone()) {
                t(listenableFuture2);
            } else {
                listenableFuture2.f(new androidx.fragment.app.d(this, i, listenableFuture2), f0Var);
            }
            i = i10;
        }
    }

    public final void t(ListenableFuture listenableFuture) {
        try {
            boolean z2 = false;
            if (listenableFuture.isCancelled()) {
                this.G = null;
                cancel(false);
            } else {
                while (true) {
                    try {
                        try {
                            listenableFuture.get();
                            break;
                        } catch (ExecutionException e7) {
                            r(e7.getCause());
                        } catch (Throwable th) {
                            r(th);
                        }
                    } catch (InterruptedException unused) {
                        z2 = true;
                    } catch (Throwable th2) {
                        if (z2) {
                            Thread.currentThread().interrupt();
                        }
                        throw th2;
                    }
                }
                if (z2) {
                    Thread.currentThread().interrupt();
                }
            }
        } finally {
            q(null);
        }
    }
}
