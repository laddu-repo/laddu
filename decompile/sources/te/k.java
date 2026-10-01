package te;

import java.util.concurrent.TimeUnit;
import re.u;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f12569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f12570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f12571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f12572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f12573e;
    public static final g f;

    static {
        String property;
        int i = u.f11404a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f12569a = property;
        f12570b = re.a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i10 = u.f11404a;
        if (i10 < 2) {
            i10 = 2;
        }
        f12571c = re.a.j(i10, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f12572d = re.a.j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f12573e = TimeUnit.SECONDS.toNanos(re.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f = g.f12564a;
    }
}
