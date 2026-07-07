package wf;

import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class n extends a {

    /* renamed from: a, reason: collision with root package name */
    public final sf.a f14361a;

    public n(sf.a aVar) {
        this.f14361a = aVar;
    }

    @Override // sf.a
    public void c(yf.t tVar, Object obj) {
        int h4 = h(obj);
        uf.g descriptor = d();
        kotlin.jvm.internal.k.e(descriptor, "descriptor");
        yf.t a10 = tVar.a(descriptor);
        Iterator g10 = g(obj);
        for (int i6 = 0; i6 < h4; i6++) {
            a10.p(d(), i6, this.f14361a, g10.next());
        }
        a10.u(descriptor);
    }

    @Override // wf.a
    public void j(vf.a aVar, int i6, Object obj) {
        m(i6, obj, aVar.f(d(), i6, this.f14361a, null));
    }

    public abstract void m(int i6, Object obj, Object obj2);
}
