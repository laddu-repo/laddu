package x4;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q extends ca.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f14630c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, int i6) {
        super(i6, 1);
        this.f14630c = sVar;
    }

    @Override // ca.e
    public final void i(i5.c cVar) {
        this.f14630c.d(new a5.a(cVar));
    }

    @Override // ca.e
    public final void j(i5.c cVar, int i6, int i10) {
        l(cVar, i6, i10);
    }

    @Override // ca.e
    public final void k(i5.c cVar) {
        a5.a aVar = new a5.a(cVar);
        s sVar = this.f14630c;
        sVar.f(aVar);
        sVar.f14640g = cVar;
    }

    @Override // ca.e
    public final void l(i5.c cVar, int i6, int i10) {
        this.f14630c.e(new a5.a(cVar), i6, i10);
    }
}
