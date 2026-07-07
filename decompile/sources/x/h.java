package x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public Object f14448a;

    /* renamed from: b, reason: collision with root package name */
    public j f14449b;

    /* renamed from: c, reason: collision with root package name */
    public k f14450c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14451d;

    public final void finalize() {
        k kVar;
        j jVar = this.f14449b;
        if (jVar != null) {
            i iVar = jVar.f14453y;
            if (!iVar.isDone()) {
                iVar.k(new eg.a("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f14448a, 4));
            }
        }
        if (!this.f14451d && (kVar = this.f14450c) != null) {
            kVar.j(null);
        }
    }
}
