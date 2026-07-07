package b7;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1584a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f1585b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f1586c;

    public /* synthetic */ s(y yVar, float f3, int i6) {
        this.f1584a = i6;
        this.f1585b = yVar;
        this.f1586c = f3;
    }

    @Override // b7.x
    public final void run() {
        switch (this.f1584a) {
            case 0:
                y yVar = this.f1585b;
                j jVar = yVar.f1613x;
                float f3 = this.f1586c;
                if (jVar == null) {
                    yVar.C.add(new s(yVar, f3, 0));
                    return;
                }
                n7.e eVar = yVar.f1614y;
                eVar.i(eVar.G, n7.g.f(jVar.f1552l, jVar.f1553m, f3));
                return;
            case 1:
                y yVar2 = this.f1585b;
                j jVar2 = yVar2.f1613x;
                float f10 = this.f1586c;
                if (jVar2 == null) {
                    yVar2.C.add(new s(yVar2, f10, 1));
                    return;
                } else {
                    yVar2.s((int) n7.g.f(jVar2.f1552l, jVar2.f1553m, f10));
                    return;
                }
            default:
                this.f1585b.u(this.f1586c);
                return;
        }
    }
}
