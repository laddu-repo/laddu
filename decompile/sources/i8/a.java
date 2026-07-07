package i8;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements ge.a {

    /* renamed from: z, reason: collision with root package name */
    public static final Object f6705z = new Object();

    /* renamed from: x, reason: collision with root package name */
    public volatile b f6706x;

    /* renamed from: y, reason: collision with root package name */
    public volatile Object f6707y;

    /* JADX WARN: Type inference failed for: r0v1, types: [ge.a, i8.a, java.lang.Object] */
    public static ge.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f6707y = f6705z;
        obj.f6706x = bVar;
        return obj;
    }

    @Override // ge.a
    public final Object get() {
        Object obj;
        Object obj2 = this.f6707y;
        Object obj3 = f6705z;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f6707y;
                    if (obj == obj3) {
                        obj = this.f6706x.get();
                        Object obj4 = this.f6707y;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f6707y = obj;
                        this.f6706x = null;
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
