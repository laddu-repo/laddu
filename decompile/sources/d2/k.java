package d2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k extends r2.b {
    public final /* synthetic */ int A = 0;
    public final Object B;

    public k(p2.b bVar, int i6) {
        super(i6, bVar.f10468k - 1);
        this.B = bVar;
    }

    @Override // r2.m
    public final long a() {
        switch (this.A) {
            case 0:
                b();
                return ((j) this.B).f(this.f11775z);
            default:
                b();
                p2.b bVar = (p2.b) this.B;
                return bVar.f10472o[(int) this.f11775z];
        }
    }

    @Override // r2.m
    public final long c() {
        switch (this.A) {
            case 0:
                b();
                return ((j) this.B).e(this.f11775z);
            default:
                return ((p2.b) this.B).b((int) this.f11775z) + a();
        }
    }

    public k(j jVar, long j, long j10) {
        super(j, j10);
        this.B = jVar;
    }
}
