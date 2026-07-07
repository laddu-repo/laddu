package n6;

import bg.c0;
import bg.j0;
import bg.l0;
import bg.q;
import bg.w;
import ie.h;
import ie.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c extends q {

    /* renamed from: b, reason: collision with root package name */
    public final q f9074b;

    public c(q delegate) {
        k.e(delegate, "delegate");
        this.f9074b = delegate;
    }

    @Override // bg.q
    public final j0 a(c0 file) {
        k.e(file, "file");
        return this.f9074b.a(file);
    }

    @Override // bg.q
    public final void b(c0 source, c0 target) {
        k.e(source, "source");
        k.e(target, "target");
        this.f9074b.b(source, target);
    }

    @Override // bg.q
    public final void c(c0 c0Var) {
        this.f9074b.c(c0Var);
    }

    @Override // bg.q
    public final void d(c0 path) {
        k.e(path, "path");
        this.f9074b.d(path);
    }

    @Override // bg.q
    public final List g(c0 c0Var) {
        List<c0> g10 = this.f9074b.g(c0Var);
        ArrayList arrayList = new ArrayList();
        for (c0 path : g10) {
            k.e(path, "path");
            arrayList.add(path);
        }
        o.y(arrayList);
        return arrayList;
    }

    @Override // bg.q
    public final b0.e i(c0 path) {
        k.e(path, "path");
        b0.e i6 = this.f9074b.i(path);
        if (i6 == null) {
            return null;
        }
        c0 c0Var = (c0) i6.f1230d;
        if (c0Var == null) {
            return i6;
        }
        boolean z10 = i6.f1228b;
        boolean z11 = i6.f1229c;
        Long l10 = (Long) i6.f1231e;
        Long l11 = (Long) i6.f1232f;
        Long l12 = (Long) i6.f1233g;
        Long l13 = (Long) i6.f1234h;
        Map extras = (Map) i6.f1235i;
        k.e(extras, "extras");
        return new b0.e(z10, z11, c0Var, l10, l11, l12, l13, extras);
    }

    @Override // bg.q
    public final w j(c0 c0Var) {
        return this.f9074b.j(c0Var);
    }

    @Override // bg.q
    public final j0 k(c0 c0Var) {
        c0 b10 = c0Var.b();
        q qVar = this.f9074b;
        if (b10 != null) {
            h hVar = new h();
            while (b10 != null && !f(b10)) {
                hVar.addFirst(b10);
                b10 = b10.b();
            }
            Iterator<E> it = hVar.iterator();
            while (it.hasNext()) {
                c0 dir = (c0) it.next();
                k.e(dir, "dir");
                qVar.c(dir);
            }
        }
        return qVar.k(c0Var);
    }

    @Override // bg.q
    public final l0 l(c0 file) {
        k.e(file, "file");
        return this.f9074b.l(file);
    }

    public final String toString() {
        return x.a(c.class).c() + '(' + this.f9074b + ')';
    }
}
