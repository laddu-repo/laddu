package f6;

import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: e, reason: collision with root package name */
    public static final String f5068e = v5.o.h("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f5069a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f5070b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f5071c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5072d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, f6.r, java.util.concurrent.ThreadFactory] */
    public u() {
        ?? obj = new Object();
        obj.f5065a = 0;
        this.f5070b = new HashMap();
        this.f5071c = new HashMap();
        this.f5072d = new Object();
        this.f5069a = Executors.newSingleThreadScheduledExecutor(obj);
    }

    public final void a(String str, y5.e eVar) {
        synchronized (this.f5072d) {
            v5.o.f().b(f5068e, "Starting timer for " + str, new Throwable[0]);
            b(str);
            t tVar = new t(this, str);
            this.f5070b.put(str, tVar);
            this.f5071c.put(str, eVar);
            this.f5069a.schedule(tVar, 600000L, TimeUnit.MILLISECONDS);
        }
    }

    public final void b(String str) {
        synchronized (this.f5072d) {
            try {
                if (((t) this.f5070b.remove(str)) != null) {
                    v5.o.f().b(f5068e, "Stopping timer for " + str, new Throwable[0]);
                    this.f5071c.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
