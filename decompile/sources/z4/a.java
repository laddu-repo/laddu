package z4;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements le.f {

    /* renamed from: y, reason: collision with root package name */
    public static final ob.a f15163y = new Object();

    /* renamed from: x, reason: collision with root package name */
    public final r f15164x;

    public a(r connectionWrapper) {
        kotlin.jvm.internal.k.e(connectionWrapper, "connectionWrapper");
        this.f15164x = connectionWrapper;
    }

    @Override // le.h
    public final Object fold(Object obj, ve.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // le.h
    public final le.f get(le.g gVar) {
        return cf.m.o(this, gVar);
    }

    @Override // le.f
    public final le.g getKey() {
        return f15163y;
    }

    @Override // le.h
    public final le.h minusKey(le.g gVar) {
        return cf.m.x(this, gVar);
    }

    @Override // le.h
    public final le.h plus(le.h hVar) {
        return cf.m.A(this, hVar);
    }
}
