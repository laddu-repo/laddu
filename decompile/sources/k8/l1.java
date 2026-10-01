package k8;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l1 extends FutureTask implements Comparable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f7611v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f7612w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f7613x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ n1 f7614y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(n1 n1Var, Runnable runnable, boolean z2, String str) {
        super(runnable, null);
        this.f7614y = n1Var;
        long andIncrement = n1.G.getAndIncrement();
        this.f7611v = andIncrement;
        this.f7613x = str;
        this.f7612w = z2;
        if (andIncrement == Long.MAX_VALUE) {
            v0 v0Var = ((p1) n1Var.f2053w).A;
            p1.l(v0Var);
            v0Var.B.a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        l1 l1Var = (l1) obj;
        boolean z2 = l1Var.f7612w;
        boolean z10 = this.f7612w;
        if (z10 != z2) {
            return !z10 ? 1 : -1;
        }
        long j8 = l1Var.f7611v;
        long j9 = this.f7611v;
        if (j9 < j8) {
            return -1;
        }
        if (j9 > j8) {
            return 1;
        }
        v0 v0Var = ((p1) this.f7614y.f2053w).A;
        p1.l(v0Var);
        v0Var.C.b(Long.valueOf(j9), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        v0 v0Var = ((p1) this.f7614y.f2053w).A;
        p1.l(v0Var);
        v0Var.B.b(th, this.f7613x);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(n1 n1Var, Callable callable, boolean z2) {
        super(callable);
        this.f7614y = n1Var;
        long andIncrement = n1.G.getAndIncrement();
        this.f7611v = andIncrement;
        this.f7613x = "Task exception on worker thread";
        this.f7612w = z2;
        if (andIncrement == Long.MAX_VALUE) {
            v0 v0Var = ((p1) n1Var.f2053w).A;
            p1.l(v0Var);
            v0Var.B.a("Tasks index overflow");
        }
    }
}
