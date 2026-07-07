package v3;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g implements Comparable {

    /* renamed from: x, reason: collision with root package name */
    public final long f13269x;

    /* renamed from: y, reason: collision with root package name */
    public final byte[] f13270y;

    public g(long j, byte[] bArr) {
        this.f13269x = j;
        this.f13270y = bArr;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f13269x, ((g) obj).f13269x);
    }
}
