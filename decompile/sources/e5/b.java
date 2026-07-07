package e5;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.d0;
import androidx.lifecycle.d1;
import androidx.lifecycle.f0;
import androidx.lifecycle.k1;
import androidx.lifecycle.p1;
import androidx.lifecycle.q1;
import androidx.lifecycle.w;
import d.q;
import ie.j;
import j1.r;
import j1.y;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import kf.f1;
import kotlin.jvm.internal.k;
import l4.h;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b implements d0 {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f4352x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f4353y;

    public /* synthetic */ b(Object obj, int i6) {
        this.f4352x = i6;
        this.f4353y = obj;
    }

    @Override // androidx.lifecycle.d0
    public final void onStateChanged(f0 f0Var, w wVar) {
        View view;
        int i6;
        switch (this.f4352x) {
            case 0:
                g gVar = (g) this.f4353y;
                if (wVar == w.ON_CREATE) {
                    f0Var.getLifecycle().c(this);
                    Bundle a10 = gVar.getSavedStateRegistry().a("androidx.savedstate.Restarter");
                    if (a10 != null) {
                        ArrayList<String> stringArrayList = a10.getStringArrayList("classes_to_restore");
                        if (stringArrayList != null) {
                            int size = stringArrayList.size();
                            int i10 = 0;
                            while (i10 < size) {
                                String str = stringArrayList.get(i10);
                                i10++;
                                String str2 = str;
                                try {
                                    Class<? extends U> asSubclass = Class.forName(str2, false, b.class.getClassLoader()).asSubclass(c.class);
                                    k.b(asSubclass);
                                    try {
                                        Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                                        declaredConstructor.setAccessible(true);
                                        try {
                                            Object newInstance = declaredConstructor.newInstance(null);
                                            k.b(newInstance);
                                            if (gVar instanceof q1) {
                                                p1 viewModelStore = ((q1) gVar).getViewModelStore();
                                                e savedStateRegistry = gVar.getSavedStateRegistry();
                                                viewModelStore.getClass();
                                                LinkedHashMap linkedHashMap = viewModelStore.f983a;
                                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                                while (it.hasNext()) {
                                                    String key = (String) it.next();
                                                    k.e(key, "key");
                                                    k1 k1Var = (k1) linkedHashMap.get(key);
                                                    if (k1Var != null) {
                                                        d1.b(k1Var, savedStateRegistry, gVar.getLifecycle());
                                                    }
                                                }
                                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                                    savedStateRegistry.d();
                                                }
                                            } else {
                                                throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + gVar).toString());
                                            }
                                        } catch (Exception e10) {
                                            throw new RuntimeException(r4.a.k("Failed to instantiate ", str2), e10);
                                        }
                                    } catch (NoSuchMethodException e11) {
                                        throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
                                    }
                                } catch (ClassNotFoundException e12) {
                                    throw new RuntimeException(h8.c.m("Class ", str2, " wasn't found"), e12);
                                }
                            }
                            return;
                        }
                        throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    }
                    return;
                }
                throw new AssertionError("Next event must be ON_CREATE");
            case 1:
                q qVar = (q) this.f4353y;
                q.access$ensureViewModelStore(qVar);
                qVar.getLifecycle().c(this);
                return;
            case 2:
                if (wVar == w.ON_STOP && (view = ((y) this.f4353y).f7024g0) != null) {
                    view.cancelPendingInputEvents();
                    return;
                }
                return;
            default:
                n4.d dVar = (n4.d) this.f4353y;
                int i11 = n4.c.f9039a[wVar.ordinal()];
                if (i11 != 1) {
                    Object obj = null;
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 4) {
                                r rVar = (r) f0Var;
                                for (Object obj2 : (Iterable) ((f1) dVar.b().f8153f.f8014x).getValue()) {
                                    if (k.a(((h) obj2).C, rVar.Y)) {
                                        obj = obj2;
                                    }
                                }
                                h hVar = (h) obj;
                                if (hVar != null) {
                                    dVar.b().c(hVar);
                                }
                                rVar.f7032p0.c(this);
                                return;
                            }
                            return;
                        }
                        r rVar2 = (r) f0Var;
                        if (!rVar2.P().isShowing()) {
                            List list = (List) ((f1) dVar.b().f8152e.f8014x).getValue();
                            ListIterator listIterator = list.listIterator(list.size());
                            while (true) {
                                if (listIterator.hasPrevious()) {
                                    if (k.a(((h) listIterator.previous()).C, rVar2.Y)) {
                                        i6 = listIterator.nextIndex();
                                    }
                                } else {
                                    i6 = -1;
                                }
                            }
                            h hVar2 = (h) j.I(i6, list);
                            if (!k.a(j.N(list), hVar2)) {
                                Log.i("DialogFragmentNavigator", "Dialog " + rVar2 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
                            }
                            if (hVar2 != null) {
                                dVar.l(i6, hVar2, false);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    r rVar3 = (r) f0Var;
                    for (Object obj3 : (Iterable) ((f1) dVar.b().f8153f.f8014x).getValue()) {
                        if (k.a(((h) obj3).C, rVar3.Y)) {
                            obj = obj3;
                        }
                    }
                    h hVar3 = (h) obj;
                    if (hVar3 != null) {
                        dVar.b().c(hVar3);
                        return;
                    }
                    return;
                }
                r rVar4 = (r) f0Var;
                Iterable iterable = (Iterable) ((f1) dVar.b().f8152e.f8014x).getValue();
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        if (k.a(((h) it2.next()).C, rVar4.Y)) {
                            return;
                        }
                    }
                }
                rVar4.N(false, false);
                return;
        }
    }
}
