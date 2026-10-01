package n4;

import android.content.Context;
import android.util.Log;
import androidx.lifecycle.h0;
import j1.p0;
import j1.r;
import j1.s0;
import j1.y;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kf.f1;
import l4.i0;
import l4.j0;
import l4.k;
import l4.u;
import l4.z;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@i0("dialog")
/* loaded from: classes.dex */
public final class d extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public final Context f9040c;

    /* renamed from: d, reason: collision with root package name */
    public final p0 f9041d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f9042e = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public final e5.b f9043f = new e5.b(this, 3);

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f9044g = new LinkedHashMap();

    public d(Context context, p0 p0Var) {
        this.f9040c = context;
        this.f9041d = p0Var;
    }

    @Override // l4.j0
    public final u a() {
        return new u(this);
    }

    @Override // l4.j0
    public final void d(List list, z zVar) {
        p0 p0Var = this.f9041d;
        if (p0Var.Q()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l4.h hVar = (l4.h) it.next();
            k(hVar).Q(p0Var, hVar.C);
            l4.h hVar2 = (l4.h) ie.j.N((List) ((f1) b().f8152e.f8014x).getValue());
            boolean D = ie.j.D((Iterable) ((f1) b().f8153f.f8014x).getValue(), hVar2);
            b().h(hVar);
            if (hVar2 != null && !D) {
                b().c(hVar2);
            }
        }
    }

    @Override // l4.j0
    public final void e(k kVar) {
        h0 h0Var;
        this.f8146a = kVar;
        this.f8147b = true;
        Iterator it = ((List) ((f1) kVar.f8152e.f8014x).getValue()).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            p0 p0Var = this.f9041d;
            if (hasNext) {
                l4.h hVar = (l4.h) it.next();
                r rVar = (r) p0Var.E(hVar.C);
                if (rVar != null && (h0Var = rVar.f7032p0) != null) {
                    h0Var.a(this.f9043f);
                } else {
                    this.f9042e.add(hVar.C);
                }
            } else {
                p0Var.f6957p.add(new s0() { // from class: n4.a
                    @Override // j1.s0
                    public final void a(p0 p0Var2, y childFragment) {
                        kotlin.jvm.internal.k.e(p0Var2, "<unused var>");
                        kotlin.jvm.internal.k.e(childFragment, "childFragment");
                        d dVar = d.this;
                        LinkedHashSet linkedHashSet = dVar.f9042e;
                        String str = childFragment.Y;
                        if ((linkedHashSet instanceof we.a) && !(linkedHashSet instanceof we.b)) {
                            kotlin.jvm.internal.z.f(linkedHashSet, "kotlin.collections.MutableCollection");
                            throw null;
                        }
                        if (linkedHashSet.remove(str)) {
                            childFragment.f7032p0.a(dVar.f9043f);
                        }
                        LinkedHashMap linkedHashMap = dVar.f9044g;
                        String str2 = childFragment.Y;
                        kotlin.jvm.internal.z.b(linkedHashMap);
                        linkedHashMap.remove(str2);
                    }
                });
                return;
            }
        }
    }

    @Override // l4.j0
    public final void f(l4.h hVar) {
        String str = hVar.C;
        p0 p0Var = this.f9041d;
        if (p0Var.Q()) {
            Log.i("DialogFragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        r rVar = (r) this.f9044g.get(str);
        if (rVar == null) {
            y E = p0Var.E(str);
            if (E instanceof r) {
                rVar = (r) E;
            } else {
                rVar = null;
            }
        }
        if (rVar != null) {
            rVar.f7032p0.c(this.f9043f);
            rVar.N(false, false);
        }
        k(hVar).Q(p0Var, str);
        k b10 = b();
        List list = (List) ((f1) b10.f8152e.f8014x).getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            l4.h hVar2 = (l4.h) listIterator.previous();
            if (kotlin.jvm.internal.k.a(hVar2.C, str)) {
                f1 f1Var = b10.f8150c;
                f1Var.h(null, ie.y.z(ie.y.z((Set) f1Var.getValue(), hVar2), hVar));
                b10.d(hVar);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    @Override // l4.j0
    public final void i(l4.h hVar, boolean z10) {
        p0 p0Var = this.f9041d;
        if (p0Var.Q()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) ((f1) b().f8152e.f8014x).getValue();
        int indexOf = list.indexOf(hVar);
        Iterator it = ie.j.R(list.subList(indexOf, list.size())).iterator();
        while (it.hasNext()) {
            y E = p0Var.E(((l4.h) it.next()).C);
            if (E != null) {
                ((r) E).N(false, false);
            }
        }
        l(indexOf, hVar, z10);
    }

    public final r k(l4.h hVar) {
        u uVar = hVar.f8141y;
        kotlin.jvm.internal.k.c(uVar, "null cannot be cast to non-null type androidx.navigation.fragment.DialogFragmentNavigator.Destination");
        b bVar = (b) uVar;
        String str = bVar.D;
        if (str != null) {
            char charAt = str.charAt(0);
            Context context = this.f9040c;
            if (charAt == '.') {
                str = context.getPackageName() + str;
            }
            j1.i0 I = this.f9041d.I();
            context.getClassLoader();
            y a10 = I.a(str);
            kotlin.jvm.internal.k.d(a10, "instantiate(...)");
            if (r.class.isAssignableFrom(a10.getClass())) {
                r rVar = (r) a10;
                rVar.J(hVar.E.a());
                rVar.f7032p0.a(this.f9043f);
                this.f9044g.put(hVar.C, rVar);
                return rVar;
            }
            StringBuilder sb2 = new StringBuilder("Dialog destination ");
            String str2 = bVar.D;
            if (str2 != null) {
                throw new IllegalArgumentException(r4.a.o(sb2, str2, " is not an instance of DialogFragment").toString());
            }
            throw new IllegalStateException("DialogFragment class was not set");
        }
        throw new IllegalStateException("DialogFragment class was not set");
    }

    public final void l(int i6, l4.h hVar, boolean z10) {
        l4.h hVar2 = (l4.h) ie.j.I(i6 - 1, (List) ((f1) b().f8152e.f8014x).getValue());
        boolean D = ie.j.D((Iterable) ((f1) b().f8153f.f8014x).getValue(), hVar2);
        b().f(hVar, z10);
        if (hVar2 != null && !D) {
            b().c(hVar2);
        }
    }
}
