package n9;

import java.lang.Thread;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i1 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final String f9346a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f9347b;

    public i1(l1 l1Var, String str) {
        this.f9347b = l1Var;
        this.f9346a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        u0 u0Var = ((n1) this.f9347b.f4301y).C;
        n1.g(u0Var);
        u0Var.D.b(th, this.f9346a);
    }
}
