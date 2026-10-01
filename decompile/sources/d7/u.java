package d7;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u implements d, e7.a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3963a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3964b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final int f3965c;

    /* renamed from: d, reason: collision with root package name */
    public final e7.i f3966d;

    /* renamed from: e, reason: collision with root package name */
    public final e7.i f3967e;

    /* renamed from: f, reason: collision with root package name */
    public final e7.i f3968f;

    public u(j7.a aVar, i7.p pVar) {
        this.f3963a = pVar.f6704e;
        this.f3965c = pVar.f6700a;
        e7.i G0 = pVar.f6701b.G0();
        this.f3966d = G0;
        e7.i G02 = pVar.f6702c.G0();
        this.f3967e = G02;
        e7.i G03 = pVar.f6703d.G0();
        this.f3968f = G03;
        aVar.f(G0);
        aVar.f(G02);
        aVar.f(G03);
        G0.a(this);
        G02.a(this);
        G03.a(this);
    }

    @Override // e7.a
    public final void a() {
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f3964b;
            if (i6 < arrayList.size()) {
                ((e7.a) arrayList.get(i6)).a();
                i6++;
            } else {
                return;
            }
        }
    }

    public final void d(e7.a aVar) {
        this.f3964b.add(aVar);
    }

    @Override // d7.d
    public final void b(List list, List list2) {
    }
}
