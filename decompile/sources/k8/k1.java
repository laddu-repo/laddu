package k8;

import java.lang.Thread;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k1 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1 f7600b;

    public k1(n1 n1Var, String str) {
        this.f7600b = n1Var;
        this.f7599a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        v0 v0Var = ((p1) this.f7600b.f2053w).A;
        p1.l(v0Var);
        v0Var.B.b(th, this.f7599a);
    }
}
