package db;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4016a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4017b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4018c;

    public m0(Object obj, Object obj2, Object obj3) {
        this.f4016a = obj;
        this.f4017b = obj2;
        this.f4018c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f4016a;
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f4017b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f4018c);
        return new IllegalArgumentException(sb2.toString());
    }
}
