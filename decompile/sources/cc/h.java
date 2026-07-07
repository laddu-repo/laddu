package cc;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h implements j {

    /* renamed from: a, reason: collision with root package name */
    public final s9.h f2040a;

    public h(s9.h hVar) {
        this.f2040a = hVar;
    }

    @Override // cc.j
    public final boolean a(dc.b bVar) {
        int i6 = bVar.f4074b;
        if (i6 == 3 || i6 == 4 || i6 == 5) {
            this.f2040a.c(bVar.f4073a);
            return true;
        }
        return false;
    }

    @Override // cc.j
    public final boolean b(Exception exc) {
        return false;
    }
}
