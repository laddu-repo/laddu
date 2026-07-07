package b7;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1577a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f1578b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1579c;

    public /* synthetic */ q(y yVar, int i6, int i10) {
        this.f1577a = i10;
        this.f1578b = yVar;
        this.f1579c = i6;
    }

    @Override // b7.x
    public final void run() {
        switch (this.f1577a) {
            case 0:
                this.f1578b.p(this.f1579c);
                return;
            case 1:
                this.f1578b.s(this.f1579c);
                return;
            default:
                this.f1578b.o(this.f1579c);
                return;
        }
    }
}
