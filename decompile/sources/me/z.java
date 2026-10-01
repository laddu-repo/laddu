package me;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f8751a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [ne.c] */
    /* JADX WARN: Type inference failed for: r0v7, types: [me.y] */
    /* JADX WARN: Type inference failed for: r0v8, types: [me.b0] */
    /* JADX WARN: Type inference failed for: r0v9, types: [me.y] */
    static {
        String property;
        ?? r02;
        int i = re.u.f11404a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            te.e eVar = f0.f8691a;
            r02 = re.n.f11396a;
            ne.c cVar = r02.f9112z;
            if (!(r02 != 0)) {
                r02 = y.E;
            }
        } else {
            r02 = y.E;
        }
        f8751a = r02;
    }
}
