package of;

import java.util.concurrent.TimeUnit;
import mf.w;
import v5.o;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f10182a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f10183b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f10184c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f10185d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f10186e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f10187f;

    /* renamed from: g, reason: collision with root package name */
    public static final o f10188g;

    /* renamed from: h, reason: collision with root package name */
    public static final o f10189h;

    static {
        String str;
        int i6 = w.f8879a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f10182a = str;
        f10183b = mf.a.j("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i10 = w.f8879a;
        if (i10 < 2) {
            i10 = 2;
        }
        f10184c = mf.a.k("kotlinx.coroutines.scheduler.core.pool.size", i10, 8);
        f10185d = mf.a.k("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 4);
        f10186e = TimeUnit.SECONDS.toNanos(mf.a.j("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f10187f = g.f10177a;
        f10188g = new o(0);
        f10189h = new o(1);
    }
}
