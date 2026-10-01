package kf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j implements h {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f7963x;

    @Override // kf.h
    public Object collect(i iVar, le.c cVar) {
        Object emit = iVar.emit(a1.f7917x, cVar);
        if (emit == me.a.f8833x) {
            return emit;
        }
        return he.y.f6101a;
    }

    public String toString() {
        switch (this.f7963x) {
            case 1:
                return "SharingStarted.Eagerly";
            case 2:
                return "SharingStarted.Lazily";
            default:
                return super.toString();
        }
    }
}
