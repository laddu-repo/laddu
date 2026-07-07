package l4;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.p1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kf.f1;
import kf.r0;
import kf.t0;
import kf.y0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final n9.z f8148a;

    /* renamed from: b, reason: collision with root package name */
    public final f1 f8149b;

    /* renamed from: c, reason: collision with root package name */
    public final f1 f8150c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8151d;

    /* renamed from: e, reason: collision with root package name */
    public final t0 f8152e;

    /* renamed from: f, reason: collision with root package name */
    public final t0 f8153f;

    /* renamed from: g, reason: collision with root package name */
    public final j0 f8154g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x f8155h;

    public k(x xVar, j0 navigator) {
        kotlin.jvm.internal.k.e(navigator, "navigator");
        this.f8155h = xVar;
        this.f8148a = new n9.z(29);
        f1 c10 = y0.c(ie.r.f6846x);
        this.f8149b = c10;
        f1 c11 = y0.c(ie.t.f6848x);
        this.f8150c = c11;
        this.f8152e = new t0(c10);
        this.f8153f = new t0(c11);
        this.f8154g = navigator;
    }

    public final void a(h backStackEntry) {
        kotlin.jvm.internal.k.e(backStackEntry, "backStackEntry");
        synchronized (this.f8148a) {
            f1 f1Var = this.f8149b;
            ArrayList Q = ie.j.Q((Collection) f1Var.getValue(), backStackEntry);
            f1Var.getClass();
            f1Var.h(null, Q);
        }
    }

    public final h b(u uVar, Bundle bundle) {
        o4.h hVar = this.f8155h.f8199b;
        hVar.getClass();
        return h0.a(hVar.f9899a.f8200c, uVar, bundle, hVar.h(), hVar.f9911n);
    }

    public final void c(h entry) {
        m mVar;
        kotlin.jvm.internal.k.e(entry, "entry");
        o4.h hVar = this.f8155h.f8199b;
        f1 f1Var = hVar.f9906h;
        String backStackEntryId = entry.C;
        LinkedHashMap linkedHashMap = hVar.f9918v;
        boolean a10 = kotlin.jvm.internal.k.a(linkedHashMap.get(entry), Boolean.TRUE);
        f1 f1Var2 = this.f8150c;
        f1Var2.h(null, ie.y.y((Set) f1Var2.getValue(), entry));
        linkedHashMap.remove(entry);
        ie.h hVar2 = hVar.f9904f;
        if (!hVar2.contains(entry)) {
            hVar.s(entry);
            if (entry.E.j.f929d.compareTo(androidx.lifecycle.x.f993z) >= 0) {
                entry.a(androidx.lifecycle.x.f991x);
            }
            if (!hVar2.isEmpty()) {
                Iterator it = hVar2.iterator();
                while (it.hasNext()) {
                    if (kotlin.jvm.internal.k.a(((h) it.next()).C, backStackEntryId)) {
                        break;
                    }
                }
            }
            if (!a10 && (mVar = hVar.f9911n) != null) {
                kotlin.jvm.internal.k.e(backStackEntryId, "backStackEntryId");
                p1 p1Var = (p1) mVar.f8161b.remove(backStackEntryId);
                if (p1Var != null) {
                    p1Var.a();
                }
            }
            hVar.t();
            ArrayList p10 = hVar.p();
            f1Var.getClass();
            f1Var.h(null, p10);
            return;
        }
        if (!this.f8151d) {
            hVar.t();
            f1 f1Var3 = hVar.f9905g;
            ArrayList a02 = ie.j.a0(hVar2);
            f1Var3.getClass();
            f1Var3.h(null, a02);
            ArrayList p11 = hVar.p();
            f1Var.getClass();
            f1Var.h(null, p11);
        }
    }

    public final void d(h hVar) {
        int i6;
        synchronized (this.f8148a) {
            try {
                ArrayList a02 = ie.j.a0((Collection) ((f1) this.f8152e.f8014x).getValue());
                ListIterator listIterator = a02.listIterator(a02.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (kotlin.jvm.internal.k.a(((h) listIterator.previous()).C, hVar.C)) {
                            i6 = listIterator.nextIndex();
                            break;
                        }
                    } else {
                        i6 = -1;
                        break;
                    }
                }
                a02.set(i6, hVar);
                f1 f1Var = this.f8149b;
                f1Var.getClass();
                f1Var.h(null, a02);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(h hVar, boolean z10) {
        o4.h hVar2 = this.f8155h.f8199b;
        fd.j jVar = new fd.j(this, hVar, z10);
        hVar2.getClass();
        j0 b10 = hVar2.f9915r.b(hVar.f8141y.f8194x);
        hVar2.f9918v.put(hVar, Boolean.valueOf(z10));
        if (b10.equals(this.f8154g)) {
            o4.e eVar = hVar2.f9917u;
            if (eVar != null) {
                eVar.invoke(hVar);
                jVar.invoke();
                return;
            }
            ie.h hVar3 = hVar2.f9904f;
            int indexOf = hVar3.indexOf(hVar);
            if (indexOf < 0) {
                String message = "Ignoring pop of " + hVar + " as it was not found on the current back stack";
                kotlin.jvm.internal.k.e(message, "message");
                Log.i("NavController", message);
                return;
            }
            int i6 = indexOf + 1;
            if (i6 != hVar3.f6844z) {
                hVar2.m(((h) hVar3.get(i6)).f8141y.f8195y.f9924a, true, false);
            }
            o4.h.o(hVar2, hVar);
            jVar.invoke();
            hVar2.f9900b.invoke();
            hVar2.b();
            return;
        }
        Object obj = hVar2.s.get(b10);
        kotlin.jvm.internal.k.b(obj);
        ((k) obj).e(hVar, z10);
    }

    public final void f(h hVar, boolean z10) {
        Object obj;
        f1 f1Var = this.f8150c;
        Iterable iterable = (Iterable) f1Var.getValue();
        boolean z11 = iterable instanceof Collection;
        t0 t0Var = this.f8152e;
        if (!z11 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((h) it.next()) == hVar) {
                    Iterable iterable2 = (Iterable) ((f1) t0Var.f8014x).getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((h) it2.next()) == hVar) {
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
        f1Var.h(null, ie.y.z((Set) f1Var.getValue(), hVar));
        r0 r0Var = t0Var.f8014x;
        r0 r0Var2 = t0Var.f8014x;
        List list = (List) ((f1) r0Var).getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                h hVar2 = (h) obj;
                if (!kotlin.jvm.internal.k.a(hVar2, hVar) && ((List) ((f1) r0Var2).getValue()).lastIndexOf(hVar2) < ((List) ((f1) r0Var2).getValue()).lastIndexOf(hVar)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        h hVar3 = (h) obj;
        if (hVar3 != null) {
            f1Var.h(null, ie.y.z((Set) f1Var.getValue(), hVar3));
        }
        e(hVar, z10);
    }

    public final void g(h backStackEntry) {
        kotlin.jvm.internal.k.e(backStackEntry, "backStackEntry");
        o4.h hVar = this.f8155h.f8199b;
        hVar.getClass();
        j0 b10 = hVar.f9915r.b(backStackEntry.f8141y.f8194x);
        if (b10.equals(this.f8154g)) {
            ve.l lVar = hVar.f9916t;
            if (lVar != null) {
                lVar.invoke(backStackEntry);
                a(backStackEntry);
                return;
            }
            String message = "Ignoring add of destination " + backStackEntry.f8141y + " outside of the call to navigate(). ";
            kotlin.jvm.internal.k.e(message, "message");
            Log.i("NavController", message);
            return;
        }
        Object obj = hVar.s.get(b10);
        if (obj != null) {
            ((k) obj).g(backStackEntry);
            return;
        }
        throw new IllegalStateException(r4.a.o(new StringBuilder("NavigatorBackStack for "), backStackEntry.f8141y.f8194x, " should already be created").toString());
    }

    public final void h(h hVar) {
        f1 f1Var = this.f8150c;
        Iterable iterable = (Iterable) f1Var.getValue();
        boolean z10 = iterable instanceof Collection;
        t0 t0Var = this.f8152e;
        if (!z10 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((h) it.next()) == hVar) {
                    Iterable iterable2 = (Iterable) ((f1) t0Var.f8014x).getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((h) it2.next()) == hVar) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        h hVar2 = (h) ie.j.N((List) ((f1) t0Var.f8014x).getValue());
        if (hVar2 != null) {
            LinkedHashSet z11 = ie.y.z((Set) f1Var.getValue(), hVar2);
            f1Var.getClass();
            f1Var.h(null, z11);
        }
        LinkedHashSet z12 = ie.y.z((Set) f1Var.getValue(), hVar);
        f1Var.getClass();
        f1Var.h(null, z12);
        g(hVar);
    }
}
