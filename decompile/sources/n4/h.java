package n4;

import android.util.Log;
import androidx.lifecycle.x;
import j1.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kf.f1;
import l4.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f9055a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f9056b;

    public h(k kVar, f fVar) {
        this.f9055a = kVar;
        this.f9056b = fVar;
    }

    public final void a(y fragment, boolean z10) {
        Object obj;
        Object obj2;
        boolean z11;
        f fVar = this.f9056b;
        ArrayList arrayList = fVar.f9051g;
        kotlin.jvm.internal.k.e(fragment, "fragment");
        k kVar = this.f9055a;
        ArrayList P = ie.j.P((Iterable) ((f1) kVar.f8153f.f8014x).getValue(), (Collection) ((f1) kVar.f8152e.f8014x).getValue());
        ListIterator listIterator = P.listIterator(P.size());
        while (true) {
            obj = null;
            if (listIterator.hasPrevious()) {
                obj2 = listIterator.previous();
                if (kotlin.jvm.internal.k.a(((l4.h) obj2).C, fragment.Y)) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        l4.h hVar = (l4.h) obj2;
        boolean z12 = true;
        if (z10 && arrayList.isEmpty() && fragment.J) {
            z11 = true;
        } else {
            z11 = false;
        }
        int size = arrayList.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                break;
            }
            Object obj3 = arrayList.get(i6);
            i6++;
            if (kotlin.jvm.internal.k.a(((he.i) obj3).f6076x, fragment.Y)) {
                obj = obj3;
                break;
            }
        }
        he.i iVar = (he.i) obj;
        if (iVar != null) {
            arrayList.remove(iVar);
        }
        if (!z11 && f.n()) {
            Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + fragment + " associated with entry " + hVar);
        }
        if (iVar == null || !((Boolean) iVar.f6077y).booleanValue()) {
            z12 = false;
        }
        if (!z10 && !z12 && hVar == null) {
            throw new IllegalArgumentException(h8.c.k("The fragment ", fragment, " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager.").toString());
        }
        if (hVar != null) {
            fVar.l(fragment, hVar, kVar);
            if (z11) {
                if (f.n()) {
                    Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + fragment + " popping associated entry " + hVar + " via system back");
                }
                kVar.f(hVar, false);
            }
        }
    }

    public final void b(y fragment, boolean z10) {
        Object obj;
        kotlin.jvm.internal.k.e(fragment, "fragment");
        if (z10) {
            k kVar = this.f9055a;
            List list = (List) ((f1) kVar.f8152e.f8014x).getValue();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    obj = listIterator.previous();
                    if (kotlin.jvm.internal.k.a(((l4.h) obj).C, fragment.Y)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            l4.h hVar = (l4.h) obj;
            if (f.n()) {
                Log.v("FragmentNavigator", "OnBackStackChangedStarted for fragment " + fragment + " associated with entry " + hVar);
            }
            if (hVar != null) {
                f1 f1Var = kVar.f8150c;
                f1Var.h(null, ie.y.z((Set) f1Var.getValue(), hVar));
                o4.h hVar2 = kVar.f8155h.f8199b;
                hVar2.getClass();
                if (hVar2.f9904f.contains(hVar)) {
                    hVar.a(x.A);
                    return;
                }
                throw new IllegalStateException("Cannot transition entry that is not in the back stack");
            }
        }
    }
}
