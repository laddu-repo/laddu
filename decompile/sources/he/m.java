package he;

import java.io.Serializable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m implements f, Serializable {

    /* renamed from: x, reason: collision with root package name */
    public ve.a f6083x;

    /* renamed from: y, reason: collision with root package name */
    public volatile Object f6084y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f6085z;

    public m(ve.a initializer) {
        kotlin.jvm.internal.k.e(initializer, "initializer");
        this.f6083x = initializer;
        this.f6084y = v.f6098a;
        this.f6085z = this;
    }

    @Override // he.f
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f6084y;
        v vVar = v.f6098a;
        if (obj2 != vVar) {
            return obj2;
        }
        synchronized (this.f6085z) {
            obj = this.f6084y;
            if (obj == vVar) {
                ve.a aVar = this.f6083x;
                kotlin.jvm.internal.k.b(aVar);
                obj = aVar.invoke();
                this.f6084y = obj;
                this.f6083x = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f6084y != v.f6098a) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
