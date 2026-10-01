package me;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f8703a = new ThreadLocal();

    public static o0 a() {
        ThreadLocal threadLocal = f8703a;
        o0 o0Var = (o0) threadLocal.get();
        if (o0Var != null) {
            return o0Var;
        }
        d dVar = new d(Thread.currentThread());
        threadLocal.set(dVar);
        return dVar;
    }
}
