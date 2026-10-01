package cf;

import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2082a;

    /* renamed from: b, reason: collision with root package name */
    public final j f2083b;

    /* renamed from: c, reason: collision with root package name */
    public final ve.l f2084c;

    public /* synthetic */ t(j jVar, ve.l lVar, int i6) {
        this.f2082a = i6;
        this.f2083b = jVar;
        this.f2084c = lVar;
    }

    @Override // cf.j
    public final Iterator iterator() {
        switch (this.f2082a) {
            case 0:
                return new f(this);
            default:
                return new u(this);
        }
    }
}
