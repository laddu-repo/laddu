package b7;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f1587a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1588b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1589c;

    public /* synthetic */ t(y yVar, int i6, int i10) {
        this.f1587a = yVar;
        this.f1588b = i6;
        this.f1589c = i10;
    }

    @Override // b7.x
    public final void run() {
        y yVar = this.f1587a;
        j jVar = yVar.f1613x;
        int i6 = this.f1588b;
        int i10 = this.f1589c;
        if (jVar == null) {
            yVar.C.add(new t(yVar, i6, i10));
        } else {
            yVar.f1614y.i(i6, i10 + 0.99f);
        }
    }
}
