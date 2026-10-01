package z4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g implements g5.a, qf.a {
    public Throwable A;

    /* renamed from: x, reason: collision with root package name */
    public final g5.a f15176x;

    /* renamed from: y, reason: collision with root package name */
    public final qf.a f15177y;

    /* renamed from: z, reason: collision with root package name */
    public le.h f15178z;

    public g(g5.a delegate) {
        qf.d dVar = new qf.d();
        kotlin.jvm.internal.k.e(delegate, "delegate");
        this.f15176x = delegate;
        this.f15177y = dVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f15176x.close();
    }

    @Override // qf.a
    public final Object d(ne.c cVar) {
        return this.f15177y.d(cVar);
    }

    @Override // g5.a
    public final g5.c d0(String sql) {
        kotlin.jvm.internal.k.e(sql, "sql");
        return this.f15176x.d0(sql);
    }

    @Override // qf.a
    public final void f(Object obj) {
        this.f15177y.f(null);
    }

    public final void l(StringBuilder sb2) {
        List list;
        if (this.f15178z == null && this.A == null) {
            sb2.append("\t\tStatus: Free connection");
            sb2.append('\n');
            return;
        }
        sb2.append("\t\tStatus: Acquired connection");
        sb2.append('\n');
        le.h hVar = this.f15178z;
        if (hVar != null) {
            sb2.append("\t\tCoroutine: " + hVar);
            sb2.append('\n');
        }
        Throwable th = this.A;
        if (th != null) {
            sb2.append("\t\tAcquired:");
            sb2.append('\n');
            df.g gVar = new df.g(he.a.e(th));
            if (!gVar.hasNext()) {
                list = ie.r.f6846x;
            } else {
                Object next = gVar.next();
                if (!gVar.hasNext()) {
                    list = a8.g.m(next);
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(next);
                    while (gVar.hasNext()) {
                        arrayList.add(gVar.next());
                    }
                    list = arrayList;
                }
            }
            Iterator it = ie.j.E(list).iterator();
            while (it.hasNext()) {
                sb2.append("\t\t" + ((String) it.next()));
                sb2.append('\n');
            }
        }
    }

    public final String toString() {
        return this.f15176x.toString();
    }
}
