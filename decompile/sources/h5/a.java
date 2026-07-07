package h5;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements f {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f5978x;

    /* renamed from: y, reason: collision with root package name */
    public final String f5979y;

    public /* synthetic */ a(String str, int i6) {
        this.f5978x = i6;
        this.f5979y = str;
    }

    @Override // h5.f
    public String K() {
        return this.f5979y;
    }

    public String toString() {
        switch (this.f5978x) {
            case 1:
                return r4.a.n(new StringBuilder("<"), this.f5979y, '>');
            default:
                return super.toString();
        }
    }

    @Override // h5.f
    public void y(e eVar) {
    }
}
