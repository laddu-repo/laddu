package k7;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public enum b {
    JSON(".json"),
    ZIP(".zip"),
    GZIP(".gz");


    /* renamed from: x, reason: collision with root package name */
    public final String f7743x;

    b(String str) {
        this.f7743x = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f7743x;
    }
}
