package da;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f4416d = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f4417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f4418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f4419c;

    public h(Runnable runnable, Executor executor) {
        this.f4417a = runnable;
        this.f4418b = executor;
    }

    public h() {
        this.f4417a = null;
        this.f4418b = null;
    }
}
