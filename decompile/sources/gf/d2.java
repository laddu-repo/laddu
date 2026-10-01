package gf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class d2 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f5658a = new ThreadLocal();

    public static y0 a() {
        ThreadLocal threadLocal = f5658a;
        y0 y0Var = (y0) threadLocal.get();
        if (y0Var == null) {
            g gVar = new g(Thread.currentThread());
            threadLocal.set(gVar);
            return gVar;
        }
        return y0Var;
    }
}
