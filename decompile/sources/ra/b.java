package ra;

import android.graphics.Typeface;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends k0.b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.media.session.b f11903h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d f11904i;

    public b(d dVar, android.support.v4.media.session.b bVar) {
        this.f11904i = dVar;
        this.f11903h = bVar;
    }

    @Override // k0.b
    public final void h(int i6) {
        this.f11904i.f11921n = true;
        this.f11903h.n(i6);
    }

    @Override // k0.b
    public final void i(Typeface typeface) {
        d dVar = this.f11904i;
        dVar.f11923p = Typeface.create(typeface, dVar.f11912d);
        dVar.f11921n = true;
        this.f11903h.o(dVar.f11923p, false);
    }
}
