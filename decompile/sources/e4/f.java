package e4;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f implements Comparable {

    /* renamed from: x, reason: collision with root package name */
    public final int f4333x;

    /* renamed from: y, reason: collision with root package name */
    public final b f4334y;

    public f(int i6, b bVar) {
        this.f4333x = i6;
        this.f4334y = bVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f4333x, ((f) obj).f4333x);
    }
}
