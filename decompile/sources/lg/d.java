package lg;

import b4.h;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: b, reason: collision with root package name */
    public Object f8402b;

    @Override // lg.b
    public final Object a(h hVar) {
        Object obj = this.f8402b;
        if (obj == null) {
            return super.a(hVar);
        }
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Single instance created couldn't return value");
    }

    @Override // lg.b
    public final Object b(h hVar) {
        synchronized (this) {
            if (this.f8402b == null) {
                this.f8402b = a(hVar);
            }
        }
        Object obj = this.f8402b;
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Single instance created couldn't return value");
    }
}
