package n9;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j1 extends FutureTask implements Comparable {
    public final /* synthetic */ l1 A;

    /* renamed from: x, reason: collision with root package name */
    public final long f9357x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f9358y;

    /* renamed from: z, reason: collision with root package name */
    public final String f9359z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(l1 l1Var, Runnable runnable, boolean z10, String str) {
        super(runnable, null);
        this.A = l1Var;
        long andIncrement = l1.I.getAndIncrement();
        this.f9357x = andIncrement;
        this.f9359z = str;
        this.f9358y = z10;
        if (andIncrement == Long.MAX_VALUE) {
            u0 u0Var = ((n1) l1Var.f4301y).C;
            n1.g(u0Var);
            u0Var.D.a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        j1 j1Var = (j1) obj;
        boolean z10 = j1Var.f9358y;
        boolean z11 = this.f9358y;
        if (z11 != z10) {
            if (z11) {
                return -1;
            }
            return 1;
        }
        long j = j1Var.f9357x;
        long j10 = this.f9357x;
        if (j10 < j) {
            return -1;
        }
        if (j10 > j) {
            return 1;
        }
        u0 u0Var = ((n1) this.A.f4301y).C;
        n1.g(u0Var);
        u0Var.E.b(Long.valueOf(j10), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        u0 u0Var = ((n1) this.A.f4301y).C;
        n1.g(u0Var);
        u0Var.D.b(th, this.f9359z);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(l1 l1Var, Callable callable, boolean z10) {
        super(callable);
        this.A = l1Var;
        long andIncrement = l1.I.getAndIncrement();
        this.f9357x = andIncrement;
        this.f9359z = "Task exception on worker thread";
        this.f9358y = z10;
        if (andIncrement == Long.MAX_VALUE) {
            u0 u0Var = ((n1) l1Var.f4301y).C;
            n1.g(u0Var);
            u0Var.D.a("Tasks index overflow");
        }
    }
}
