package qb;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l implements bc.a {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f11174c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f11175a = f11174c;

    /* renamed from: b, reason: collision with root package name */
    public volatile bc.a f11176b;

    public l(bc.a aVar) {
        this.f11176b = aVar;
    }

    @Override // bc.a
    public final Object get() {
        Object obj;
        Object obj2 = this.f11175a;
        Object obj3 = f11174c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f11175a;
                    if (obj == obj3) {
                        obj = this.f11176b.get();
                        this.f11175a = obj;
                        this.f11176b = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return obj;
        }
        return obj2;
    }
}
