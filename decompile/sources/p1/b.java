package p1;

import h8.c;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import o5.e0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f10452a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f10453b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f10454c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f10455d;

    public static void b(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                c.r(autoCloseable);
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final void a(AutoCloseable autoCloseable) {
        if (this.f10455d) {
            b(autoCloseable);
            return;
        }
        synchronized (this.f10452a) {
            this.f10454c.add(autoCloseable);
        }
    }
}
