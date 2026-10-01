package he;

import java.io.Serializable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class z implements f, Serializable {

    /* renamed from: x, reason: collision with root package name */
    public ve.a f6102x;

    /* renamed from: y, reason: collision with root package name */
    public Object f6103y;

    @Override // he.f
    public final Object getValue() {
        if (this.f6103y == v.f6098a) {
            ve.a aVar = this.f6102x;
            kotlin.jvm.internal.k.b(aVar);
            this.f6103y = aVar.invoke();
            this.f6102x = null;
        }
        return this.f6103y;
    }

    public final String toString() {
        if (this.f6103y != v.f6098a) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
