package mc;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public long f8812a;

    public i(i iVar) {
        this.f8812a = iVar.f8812a;
    }

    public void a(long j) {
        if (j >= 0) {
            this.f8812a = j;
            return;
        }
        throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j + " is an invalid argument");
    }
}
