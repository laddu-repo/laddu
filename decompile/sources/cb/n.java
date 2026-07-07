package cb;

import a2.s;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n implements l {
    public static final s A = new s(2);

    /* renamed from: x, reason: collision with root package name */
    public final Object f2015x = new Object();

    /* renamed from: y, reason: collision with root package name */
    public volatile l f2016y;

    /* renamed from: z, reason: collision with root package name */
    public Object f2017z;

    public n(l lVar) {
        this.f2016y = lVar;
    }

    @Override // cb.l
    public final Object get() {
        l lVar = this.f2016y;
        s sVar = A;
        if (lVar != sVar) {
            synchronized (this.f2015x) {
                try {
                    if (this.f2016y != sVar) {
                        Object obj = this.f2016y.get();
                        this.f2017z = obj;
                        this.f2016y = sVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f2017z;
    }

    public final String toString() {
        Object obj = this.f2016y;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == A) {
            obj = "<supplier that returned " + this.f2017z + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
