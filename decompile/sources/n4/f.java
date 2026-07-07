package n4;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.k1;
import androidx.lifecycle.p1;
import cf.n;
import cf.o;
import ic.s;
import ie.p;
import j1.m0;
import j1.o0;
import j1.p0;
import j1.s0;
import j1.y;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import kf.f1;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.x;
import l4.i0;
import l4.j0;
import l4.u;
import l4.z;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@i0("fragment")
/* loaded from: classes.dex */
public class f extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public final Context f9047c;

    /* renamed from: d, reason: collision with root package name */
    public final p0 f9048d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9049e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f9050f = new LinkedHashSet();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f9051g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final f5.a f9052h = new f5.a(this, 1);

    /* renamed from: i, reason: collision with root package name */
    public final n f9053i = new n(this, 8);

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class a extends k1 {

        /* renamed from: b, reason: collision with root package name */
        public WeakReference f9054b;

        @Override // androidx.lifecycle.k1
        public final void e() {
            WeakReference weakReference = this.f9054b;
            if (weakReference != null) {
                ve.a aVar = (ve.a) weakReference.get();
                if (aVar != null) {
                    aVar.invoke();
                    return;
                }
                return;
            }
            k.k("completeTransition");
            throw null;
        }
    }

    public f(Context context, p0 p0Var, int i6) {
        this.f9047c = context;
        this.f9048d = p0Var;
        this.f9049e = i6;
    }

    public static void k(f fVar, String str, int i6) {
        boolean z10;
        boolean z11;
        int s;
        int i10 = 0;
        if ((i6 & 2) != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if ((i6 & 4) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        ArrayList arrayList = fVar.f9051g;
        if (z11) {
            k.e(arrayList, "<this>");
            int s7 = ie.k.s(arrayList);
            if (s7 >= 0) {
                int i11 = 0;
                while (true) {
                    Object obj = arrayList.get(i10);
                    he.i it = (he.i) obj;
                    k.e(it, "it");
                    if (!k.a(it.f6076x, str)) {
                        if (i11 != i10) {
                            arrayList.set(i11, obj);
                        }
                        i11++;
                    }
                    if (i10 == s7) {
                        break;
                    } else {
                        i10++;
                    }
                }
                i10 = i11;
            }
            if (i10 < arrayList.size() && i10 <= (s = ie.k.s(arrayList))) {
                while (true) {
                    arrayList.remove(s);
                    if (s == i10) {
                        break;
                    } else {
                        s--;
                    }
                }
            }
        }
        arrayList.add(new he.i(str, Boolean.valueOf(z10)));
    }

    public static boolean n() {
        if (!Log.isLoggable("FragmentManager", 2) && !Log.isLoggable("FragmentNavigator", 2)) {
            return false;
        }
        return true;
    }

    @Override // l4.j0
    public final u a() {
        return new u(this);
    }

    @Override // l4.j0
    public final void d(List list, z zVar) {
        p0 p0Var = this.f9048d;
        if (p0Var.Q()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l4.h hVar = (l4.h) it.next();
            boolean isEmpty = ((List) ((f1) b().f8152e.f8014x).getValue()).isEmpty();
            if (zVar != null && !isEmpty && zVar.f8210b && this.f9050f.remove(hVar.C)) {
                p0Var.x(new o0(p0Var, hVar.C, 0), false);
                b().h(hVar);
            } else {
                j1.a m9 = m(hVar, zVar);
                String str = hVar.C;
                if (!isEmpty) {
                    l4.h hVar2 = (l4.h) ie.j.N((List) ((f1) b().f8152e.f8014x).getValue());
                    if (hVar2 != null) {
                        k(this, hVar2.C, 6);
                    }
                    k(this, str, 6);
                    if (m9.f6862h) {
                        m9.f6861g = true;
                        m9.f6863i = str;
                    } else {
                        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
                    }
                }
                m9.e();
                if (n()) {
                    Log.v("FragmentNavigator", "Calling pushWithTransition via navigate() on entry " + hVar);
                }
                b().h(hVar);
            }
        }
    }

    @Override // l4.j0
    public final void e(final l4.k kVar) {
        this.f8146a = kVar;
        this.f8147b = true;
        if (n()) {
            Log.v("FragmentNavigator", "onAttach");
        }
        s0 s0Var = new s0() { // from class: n4.e
            @Override // j1.s0
            public final void a(p0 p0Var, y fragment) {
                Object obj;
                k.e(p0Var, "<unused var>");
                k.e(fragment, "fragment");
                l4.k kVar2 = l4.k.this;
                List list = (List) ((f1) kVar2.f8152e.f8014x).getValue();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj = listIterator.previous();
                        if (k.a(((l4.h) obj).C, fragment.Y)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                l4.h hVar = (l4.h) obj;
                boolean n10 = f.n();
                f fVar = this;
                if (n10) {
                    Log.v("FragmentNavigator", "Attaching fragment " + fragment + " associated with entry " + hVar + " to FragmentManager " + fVar.f9048d);
                }
                if (hVar != null) {
                    fragment.f7034r0.d(fragment, new i(new fd.f(fVar, fragment, hVar, 2), 0));
                    fragment.f7032p0.a(fVar.f9052h);
                    fVar.l(fragment, hVar, kVar2);
                }
            }
        };
        p0 p0Var = this.f9048d;
        p0Var.f6957p.add(s0Var);
        p0Var.f6955n.add(new h(kVar, this));
    }

    @Override // l4.j0
    public final void f(l4.h hVar) {
        String str = hVar.C;
        p0 p0Var = this.f9048d;
        if (p0Var.Q()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        j1.a m9 = m(hVar, null);
        List list = (List) ((f1) b().f8152e.f8014x).getValue();
        if (list.size() > 1) {
            l4.h hVar2 = (l4.h) ie.j.I(ie.k.s(list) - 1, list);
            if (hVar2 != null) {
                k(this, hVar2.C, 6);
            }
            k(this, str, 4);
            p0Var.x(new m0(p0Var, str, -1), false);
            k(this, str, 2);
            if (m9.f6862h) {
                m9.f6861g = true;
                m9.f6863i = str;
            } else {
                throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
            }
        }
        m9.e();
        b().d(hVar);
    }

    @Override // l4.j0
    public final void g(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            LinkedHashSet linkedHashSet = this.f9050f;
            linkedHashSet.clear();
            p.z(stringArrayList, linkedHashSet);
        }
    }

    @Override // l4.j0
    public final Bundle h() {
        LinkedHashSet linkedHashSet = this.f9050f;
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return k6.e.b(new he.i("androidx-nav-fragment:navigator:savedIds", new ArrayList(linkedHashSet)));
    }

    @Override // l4.j0
    public final void i(l4.h hVar, boolean z10) {
        int i6;
        boolean z11;
        p0 p0Var = this.f9048d;
        if (p0Var.Q()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) ((f1) b().f8152e.f8014x).getValue();
        int indexOf = list.indexOf(hVar);
        List subList = list.subList(indexOf, list.size());
        l4.h hVar2 = (l4.h) ie.j.G(list);
        l4.h hVar3 = (l4.h) ie.j.I(indexOf - 1, list);
        if (hVar3 != null) {
            k(this, hVar3.C, 6);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = subList.iterator();
        while (true) {
            boolean z12 = false;
            if (it.hasNext()) {
                Object next = it.next();
                l4.h hVar4 = (l4.h) next;
                o C = ie.j.C(this.f9051g);
                String str = hVar4.C;
                Iterator it2 = C.iterator();
                int i10 = 0;
                while (true) {
                    if (it2.hasNext()) {
                        he.i it3 = (he.i) it2.next();
                        k.e(it3, "it");
                        String str2 = (String) it3.f6076x;
                        if (i10 >= 0) {
                            if (k.a(str, str2)) {
                                i6 = i10;
                                break;
                            }
                            i10++;
                        } else {
                            ie.k.w();
                            throw null;
                        }
                    } else {
                        i6 = -1;
                        break;
                    }
                }
                if (i6 >= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11 || !k.a(hVar4.C, hVar2.C)) {
                    z12 = true;
                }
                if (z12) {
                    arrayList.add(next);
                }
            } else {
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    k(this, ((l4.h) obj).C, 4);
                }
                if (z10) {
                    for (l4.h hVar5 : ie.j.R(subList)) {
                        if (k.a(hVar5, hVar2)) {
                            Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination " + hVar5);
                        } else {
                            p0Var.x(new o0(p0Var, hVar5.C, 1), false);
                            this.f9050f.add(hVar5.C);
                        }
                    }
                } else {
                    p0Var.x(new m0(p0Var, hVar.C, -1), false);
                }
                if (n()) {
                    Log.v("FragmentNavigator", "Calling popWithTransition via popBackStack() on entry " + hVar + " with savedState " + z10);
                }
                b().f(hVar, z10);
                return;
            }
        }
    }

    public final void l(y fragment, l4.h hVar, l4.k kVar) {
        k.e(fragment, "fragment");
        p1 viewModelStore = fragment.getViewModelStore();
        lc.c cVar = new lc.c(18);
        cVar.E(x.a(a.class), new cf.p(22));
        o1.d F = cVar.F();
        o1.a defaultCreationExtras = o1.a.f9847b;
        k.e(defaultCreationExtras, "defaultCreationExtras");
        s sVar = new s(viewModelStore, F, defaultCreationExtras);
        kotlin.jvm.internal.e a10 = x.a(a.class);
        String b10 = a10.b();
        if (b10 != null) {
            ((a) sVar.p("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b10), a10)).f9054b = new WeakReference(new fd.j(hVar, kVar, this, fragment));
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final j1.a m(l4.h hVar, z zVar) {
        int i6;
        int i10;
        int i11;
        int i12;
        u uVar = hVar.f8141y;
        k.c(uVar, "null cannot be cast to non-null type androidx.navigation.fragment.FragmentNavigator.Destination");
        Bundle a10 = hVar.E.a();
        String str = ((g) uVar).D;
        if (str != null) {
            int i13 = 0;
            char charAt = str.charAt(0);
            Context context = this.f9047c;
            if (charAt == '.') {
                str = context.getPackageName() + str;
            }
            p0 p0Var = this.f9048d;
            j1.i0 I = p0Var.I();
            context.getClassLoader();
            y a11 = I.a(str);
            k.d(a11, "instantiate(...)");
            a11.J(a10);
            j1.a aVar = new j1.a(p0Var);
            if (zVar != null) {
                i6 = zVar.f8214f;
            } else {
                i6 = -1;
            }
            if (zVar != null) {
                i10 = zVar.f8215g;
            } else {
                i10 = -1;
            }
            if (zVar != null) {
                i11 = zVar.f8216h;
            } else {
                i11 = -1;
            }
            if (zVar != null) {
                i12 = zVar.f8217i;
            } else {
                i12 = -1;
            }
            if (i6 != -1 || i10 != -1 || i11 != -1 || i12 != -1) {
                if (i6 == -1) {
                    i6 = 0;
                }
                if (i10 == -1) {
                    i10 = 0;
                }
                if (i11 == -1) {
                    i11 = 0;
                }
                if (i12 != -1) {
                    i13 = i12;
                }
                aVar.f6856b = i6;
                aVar.f6857c = i10;
                aVar.f6858d = i11;
                aVar.f6859e = i13;
            }
            String str2 = hVar.C;
            int i14 = this.f9049e;
            if (i14 != 0) {
                aVar.g(i14, a11, str2, 2);
                aVar.j(a11);
                aVar.f6869p = true;
                return aVar;
            }
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        throw new IllegalStateException("Fragment class was not set");
    }
}
