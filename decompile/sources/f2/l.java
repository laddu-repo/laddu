package f2;

import a2.e1;
import a2.l1;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import q2.c0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f4675a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f4676b;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f4677c;

    public l(CopyOnWriteArrayList copyOnWriteArrayList, int i6, c0 c0Var) {
        this.f4677c = copyOnWriteArrayList;
        this.f4675a = i6;
        this.f4676b = c0Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [f2.m, java.lang.Object] */
    public final void a() {
        Iterator it = this.f4677c.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            u1.a0.U(kVar.f4673a, new j(this, kVar.f4674b, 2));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [f2.m, java.lang.Object] */
    public final void b() {
        Iterator it = this.f4677c.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            u1.a0.U(kVar.f4673a, new j(this, kVar.f4674b, 1));
        }
    }

    public final void c(int i6) {
        Iterator it = this.f4677c.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            u1.a0.U(kVar.f4673a, new l1(this, kVar.f4674b, i6, 3));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.f4677c.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            u1.a0.U(kVar.f4673a, new e1(this, kVar.f4674b, exc, 7));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [f2.m, java.lang.Object] */
    public final void e() {
        Iterator it = this.f4677c.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            u1.a0.U(kVar.f4673a, new j(this, kVar.f4674b, 0));
        }
    }
}
