package q;

import android.os.Looper;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends a8.a {

    /* renamed from: g, reason: collision with root package name */
    public static volatile b f10785g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f10786h = new a(0);

    /* renamed from: f, reason: collision with root package name */
    public final d f10787f;

    public b() {
        super(8);
        this.f10787f = new d();
    }

    public static b H() {
        if (f10785g != null) {
            return f10785g;
        }
        synchronized (b.class) {
            try {
                if (f10785g == null) {
                    f10785g = new b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f10785g;
    }

    public final void I(Runnable runnable) {
        d dVar = this.f10787f;
        if (dVar.f10791h == null) {
            synchronized (dVar.f10789f) {
                try {
                    if (dVar.f10791h == null) {
                        dVar.f10791h = d.H(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        dVar.f10791h.post(runnable);
    }
}
