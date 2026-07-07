package cb;

import java.io.Serializable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m implements l, Serializable {
    public transient Object A;

    /* renamed from: x, reason: collision with root package name */
    public final transient Object f2012x = new Object();

    /* renamed from: y, reason: collision with root package name */
    public final l f2013y;

    /* renamed from: z, reason: collision with root package name */
    public volatile transient boolean f2014z;

    public m(l lVar) {
        this.f2013y = lVar;
    }

    @Override // cb.l
    public final Object get() {
        if (!this.f2014z) {
            synchronized (this.f2012x) {
                try {
                    if (!this.f2014z) {
                        Object obj = this.f2013y.get();
                        this.A = obj;
                        this.f2014z = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.A;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (this.f2014z) {
            obj = "<supplier that returned " + this.A + ">";
        } else {
            obj = this.f2013y;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
