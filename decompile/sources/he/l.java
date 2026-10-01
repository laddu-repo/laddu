package he;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l implements f, Serializable {

    /* renamed from: z, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f6080z = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "y");

    /* renamed from: x, reason: collision with root package name */
    public volatile ve.a f6081x;

    /* renamed from: y, reason: collision with root package name */
    public volatile Object f6082y;

    @Override // he.f
    public final Object getValue() {
        Object obj = this.f6082y;
        v vVar = v.f6098a;
        if (obj != vVar) {
            return obj;
        }
        ve.a aVar = this.f6081x;
        if (aVar != null) {
            Object invoke = aVar.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6080z;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != vVar) {
                }
            }
            this.f6081x = null;
            return invoke;
        }
        return this.f6082y;
    }

    public final String toString() {
        if (this.f6082y != v.f6098a) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
