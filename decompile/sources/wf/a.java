package wf;

import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a implements sf.a {
    @Override // sf.a
    public Object a(vf.b bVar) {
        return i(bVar);
    }

    public abstract Object e();

    public abstract int f(Object obj);

    public abstract Iterator g(Object obj);

    public abstract int h(Object obj);

    public final Object i(vf.b bVar) {
        Object e10 = e();
        int f3 = f(e10);
        vf.a h4 = bVar.h(d());
        while (true) {
            int b10 = h4.b(d());
            if (b10 != -1) {
                j(h4, b10 + f3, e10);
            } else {
                h4.j(d());
                return l(e10);
            }
        }
    }

    public abstract void j(vf.a aVar, int i6, Object obj);

    public abstract Object k(Object obj);

    public abstract Object l(Object obj);
}
