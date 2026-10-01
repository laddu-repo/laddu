package kf;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g1 extends lf.d {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f7952a = new AtomicReference(null);

    @Override // lf.d
    public final boolean a(lf.b bVar) {
        AtomicReference atomicReference = this.f7952a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(y0.f8037b);
        return true;
    }

    @Override // lf.d
    public final le.c[] b(lf.b bVar) {
        this.f7952a.set(null);
        return lf.c.f8362a;
    }
}
