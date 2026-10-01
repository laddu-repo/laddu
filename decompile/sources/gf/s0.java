package gf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s0 implements d1 {

    /* renamed from: x, reason: collision with root package name */
    public final boolean f5704x;

    public s0(boolean z10) {
        this.f5704x = z10;
    }

    @Override // gf.d1
    public final v1 c() {
        return null;
    }

    @Override // gf.d1
    public final boolean isActive() {
        return this.f5704x;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Empty{");
        if (this.f5704x) {
            str = "Active";
        } else {
            str = "New";
        }
        return r4.a.n(sb2, str, '}');
    }
}
