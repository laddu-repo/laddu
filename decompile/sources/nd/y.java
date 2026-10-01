package nd;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class y implements ve.a {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9724x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ he.m f9725y;

    public /* synthetic */ y(he.m mVar, int i6) {
        this.f9724x = i6;
        this.f9725y = mVar;
    }

    @Override // ve.a
    public final Object invoke() {
        switch (this.f9724x) {
            case 0:
                return (l4.h) this.f9725y.getValue();
            default:
                return ((l4.h) this.f9725y.getValue()).getDefaultViewModelCreationExtras();
        }
    }
}
