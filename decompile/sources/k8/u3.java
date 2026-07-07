package k8;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class u3 implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f7786v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f7787w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ sc.b f7788x;

    public u3(sc.b bVar, long j8, long j9) {
        Objects.requireNonNull(bVar);
        this.f7788x = bVar;
        this.f7786v = j8;
        this.f7787w = j9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n1 n1Var = ((p1) ((x3) this.f7788x.f11787x).f2053w).B;
        p1.l(n1Var);
        n1Var.M(new androidx.fragment.app.m(14, this));
    }
}
