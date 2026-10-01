package e7;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4437a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4438b;

    public /* synthetic */ q(Object obj, int i6) {
        this.f4437a = i6;
        this.f4438b = obj;
    }

    @Override // e7.a
    public final void a() {
        boolean z10;
        switch (this.f4437a) {
            case 0:
                ((r) this.f4438b).f4448k = true;
                return;
            case 1:
                ((r) this.f4438b).f4448k = true;
                return;
            case 2:
                ((r) this.f4438b).f4448k = true;
                return;
            default:
                j7.a aVar = (j7.a) this.f4438b;
                if (aVar.f7258r.l() == 1.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 != aVar.f7263x) {
                    aVar.f7263x = z10;
                    aVar.f7255o.invalidateSelf();
                    return;
                }
                return;
        }
    }
}
