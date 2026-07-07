package kf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g implements h {

    /* renamed from: x, reason: collision with root package name */
    public final h f7950x;

    public g(h hVar) {
        this.f7950x = hVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.internal.w] */
    @Override // kf.h
    public final Object collect(i iVar, le.c cVar) {
        ?? obj = new Object();
        obj.f8055x = lf.c.f8363b;
        Object collect = this.f7950x.collect(new f(this, obj, iVar), cVar);
        if (collect == me.a.f8833x) {
            return collect;
        }
        return he.y.f6101a;
    }
}
