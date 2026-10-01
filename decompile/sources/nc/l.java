package nc;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l implements mc.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f9643a;

    public l(m mVar) {
        this.f9643a = mVar;
    }

    @Override // mc.b
    public final void b(mc.f fVar) {
        m mVar = this.f9643a;
        synchronized (mVar) {
            mVar.f9648d = true;
        }
        this.f9643a.g(fVar);
    }

    @Override // mc.b
    public final void a(mc.a aVar) {
    }
}
