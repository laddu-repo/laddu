package cf;

import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g implements j {

    /* renamed from: a, reason: collision with root package name */
    public final j f2058a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2059b;

    /* renamed from: c, reason: collision with root package name */
    public final ve.l f2060c;

    public g(j jVar, boolean z10, ve.l predicate) {
        kotlin.jvm.internal.k.e(predicate, "predicate");
        this.f2058a = jVar;
        this.f2059b = z10;
        this.f2060c = predicate;
    }

    @Override // cf.j
    public final Iterator iterator() {
        return new f(this);
    }
}
