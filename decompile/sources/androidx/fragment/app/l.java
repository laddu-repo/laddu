package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.media3.decoder.DecoderInputBuffer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.WeakHashMap;
import k8.k2;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f1044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f1046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1048e;

    public l(ViewGroup viewGroup) {
        de.i.e(viewGroup, "container");
        this.f1044a = viewGroup;
        this.f1045b = new ArrayList();
        this.f1046c = new ArrayList();
    }

    public static final l f(ViewGroup viewGroup, q0 q0Var) {
        de.i.e(viewGroup, "container");
        de.i.e(q0Var, "fragmentManager");
        de.i.d(q0Var.G(), "fragmentManager.specialEffectsControllerFactory");
        Object tag = viewGroup.getTag(m1.b.special_effects_controller_view_tag);
        if (tag instanceof l) {
            return (l) tag;
        }
        l lVar = new l(viewGroup);
        viewGroup.setTag(m1.b.special_effects_controller_view_tag, lVar);
        return lVar;
    }

    public final void a(int i, int i10, x0 x0Var) {
        synchronized (this.f1045b) {
            p0.c cVar = new p0.c();
            y yVar = x0Var.f1130c;
            de.i.d(yVar, "fragmentStateManager.fragment");
            c1 c1VarD = d(yVar);
            if (c1VarD != null) {
                c1VarD.c(i, i10);
                return;
            }
            final c1 c1Var = new c1(i, i10, x0Var, cVar);
            this.f1045b.add(c1Var);
            final int i11 = 0;
            c1Var.f993d.add(new Runnable(this) { // from class: androidx.fragment.app.b1

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public final /* synthetic */ l f983w;

                {
                    this.f983w = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                            ArrayList arrayList = this.f983w.f1045b;
                            c1 c1Var2 = c1Var;
                            if (arrayList.contains(c1Var2)) {
                                int i12 = c1Var2.f990a;
                                View view = c1Var2.f992c.f1135b0;
                                de.i.d(view, "operation.fragment.mView");
                                j4.a.a(view, i12);
                            }
                            break;
                        default:
                            l lVar = this.f983w;
                            ArrayList arrayList2 = lVar.f1045b;
                            c1 c1Var3 = c1Var;
                            arrayList2.remove(c1Var3);
                            lVar.f1046c.remove(c1Var3);
                            break;
                    }
                }
            });
            final int i12 = 1;
            c1Var.f993d.add(new Runnable(this) { // from class: androidx.fragment.app.b1

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public final /* synthetic */ l f983w;

                {
                    this.f983w = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                            ArrayList arrayList = this.f983w.f1045b;
                            c1 c1Var2 = c1Var;
                            if (arrayList.contains(c1Var2)) {
                                int i122 = c1Var2.f990a;
                                View view = c1Var2.f992c.f1135b0;
                                de.i.d(view, "operation.fragment.mView");
                                j4.a.a(view, i122);
                            }
                            break;
                        default:
                            l lVar = this.f983w;
                            ArrayList arrayList2 = lVar.f1045b;
                            c1 c1Var3 = c1Var;
                            arrayList2.remove(c1Var3);
                            lVar.f1046c.remove(c1Var3);
                            break;
                    }
                }
            });
        }
    }

    public final void b(ArrayList arrayList, boolean z2) {
        Object obj;
        Object obj2;
        String str;
        ArrayList arrayList2;
        int i;
        boolean z10;
        ArrayList arrayList3 = arrayList;
        int size = arrayList3.size();
        int i10 = 0;
        while (true) {
            obj = null;
            if (i10 >= size) {
                obj2 = null;
                break;
            }
            obj2 = arrayList3.get(i10);
            i10++;
            c1 c1Var = (c1) obj2;
            View view = c1Var.f992c.f1135b0;
            de.i.d(view, "operation.fragment.mView");
            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility != 0) {
                    if (visibility != 4 && visibility != 8) {
                        throw new IllegalArgumentException(d0.d.h(visibility, "Unknown visibility "));
                    }
                } else if (c1Var.f990a != 2) {
                    break;
                }
            }
        }
        c1 c1Var2 = (c1) obj2;
        ListIterator listIterator = arrayList3.listIterator(arrayList3.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object objPrevious = listIterator.previous();
            c1 c1Var3 = (c1) objPrevious;
            View view2 = c1Var3.f992c.f1135b0;
            de.i.d(view2, "operation.fragment.mView");
            if (view2.getAlpha() != 0.0f || view2.getVisibility() != 0) {
                int visibility2 = view2.getVisibility();
                if (visibility2 == 0) {
                    continue;
                } else if (visibility2 != 4 && visibility2 != 8) {
                    throw new IllegalArgumentException(d0.d.h(visibility2, "Unknown visibility "));
                }
            }
            if (c1Var3.f990a == 2) {
                obj = objPrevious;
                break;
            }
        }
        c1 c1Var4 = (c1) obj;
        if (q0.I(2)) {
            Log.v("FragmentManager", "Executing operations from " + c1Var2 + " to " + c1Var4);
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayListP = pd.j.P(arrayList3);
        y yVar = ((c1) pd.j.J(arrayList3)).f992c;
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj3 = arrayList3.get(i11);
            i11++;
            w wVar = ((c1) obj3).f992c.f1138e0;
            w wVar2 = yVar.f1138e0;
            wVar.f1118b = wVar2.f1118b;
            wVar.f1119c = wVar2.f1119c;
            wVar.f1120d = wVar2.f1120d;
            wVar.f1121e = wVar2.f1121e;
        }
        int size3 = arrayList3.size();
        int i12 = 0;
        while (i12 < size3) {
            Object obj4 = arrayList3.get(i12);
            i12++;
            c1 c1Var5 = (c1) obj4;
            p0.c cVar = new p0.c();
            c1Var5.d();
            LinkedHashSet linkedHashSet = c1Var5.f994e;
            linkedHashSet.add(cVar);
            arrayList4.add(new g(c1Var5, cVar, z2));
            p0.c cVar2 = new p0.c();
            c1Var5.d();
            linkedHashSet.add(cVar2);
            boolean z11 = !z2 ? c1Var5 != c1Var4 : c1Var5 != c1Var2;
            y yVar2 = c1Var5.f992c;
            i iVar = new i(c1Var5, cVar2);
            if (c1Var5.f990a == 2) {
                if (z2) {
                    w wVar3 = yVar2.f1138e0;
                } else {
                    yVar2.getClass();
                }
            } else if (z2) {
                w wVar4 = yVar2.f1138e0;
            } else {
                yVar2.getClass();
            }
            if (c1Var5.f990a == 2) {
                if (z2) {
                    w wVar5 = yVar2.f1138e0;
                } else {
                    w wVar6 = yVar2.f1138e0;
                }
            }
            if (z11) {
                if (z2) {
                    w wVar7 = yVar2.f1138e0;
                } else {
                    yVar2.getClass();
                }
            }
            arrayList5.add(iVar);
            c1Var5.f993d.add(new d(arrayListP, c1Var5, this));
            arrayList3 = arrayList;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList6 = new ArrayList();
        int size4 = arrayList5.size();
        int i13 = 0;
        while (i13 < size4) {
            Object obj5 = arrayList5.get(i13);
            i13++;
            if (!((i) obj5).l()) {
                arrayList6.add(obj5);
            }
        }
        ArrayList arrayList7 = new ArrayList();
        int size5 = arrayList6.size();
        int i14 = 0;
        while (i14 < size5) {
            Object obj6 = arrayList6.get(i14);
            i14++;
            ((i) obj6).getClass();
        }
        int size6 = arrayList7.size();
        int i15 = 0;
        while (i15 < size6) {
            Object obj7 = arrayList7.get(i15);
            i15++;
            ((i) obj7).getClass();
        }
        int size7 = arrayList5.size();
        int i16 = 0;
        while (i16 < size7) {
            Object obj8 = arrayList5.get(i16);
            i16++;
            i iVar2 = (i) obj8;
            linkedHashMap.put((c1) iVar2.f1023a, Boolean.FALSE);
            iVar2.d();
        }
        boolean zContainsValue = linkedHashMap.containsValue(Boolean.TRUE);
        ViewGroup viewGroup = this.f1044a;
        Context context = viewGroup.getContext();
        ArrayList arrayList8 = new ArrayList();
        int size8 = arrayList4.size();
        boolean z12 = false;
        int i17 = 0;
        while (true) {
            str = "context";
            if (i17 >= size8) {
                break;
            }
            int i18 = i17 + 1;
            g gVar = (g) arrayList4.get(i17);
            if (gVar.l()) {
                gVar.d();
            } else {
                de.i.d(context, "context");
                k2 k2VarO = gVar.o(context);
                if (k2VarO == null) {
                    gVar.d();
                } else {
                    Animator animator = (Animator) k2VarO.f7603x;
                    if (animator == null) {
                        arrayList8.add(gVar);
                    } else {
                        arrayList2 = arrayList8;
                        c1 c1Var6 = (c1) gVar.f1023a;
                        y yVar3 = c1Var6.f992c;
                        i = size8;
                        z10 = z12;
                        if (de.i.a(linkedHashMap.get(c1Var6), Boolean.TRUE)) {
                            if (q0.I(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + yVar3 + " as this Fragment was involved in a Transition.");
                            }
                            gVar.d();
                            arrayList8 = arrayList2;
                            size8 = i;
                            i17 = i18;
                            z12 = z10;
                        } else {
                            boolean z13 = c1Var6.f990a == 3;
                            if (z13) {
                                arrayListP.remove(c1Var6);
                            }
                            View view3 = yVar3.f1135b0;
                            viewGroup.startViewTransition(view3);
                            LinkedHashMap linkedHashMap2 = linkedHashMap;
                            ArrayList arrayList9 = arrayList4;
                            animator.addListener(new j(this, view3, z13, c1Var6, gVar));
                            animator.setTarget(view3);
                            animator.start();
                            if (q0.I(2)) {
                                Log.v("FragmentManager", "Animator from operation " + c1Var6 + " has started.");
                            }
                            ((p0.c) gVar.f1024b).a(new e(0, animator, c1Var6));
                            linkedHashMap = linkedHashMap2;
                            size8 = i;
                            i17 = i18;
                            arrayList8 = arrayList2;
                            arrayList4 = arrayList9;
                            z12 = true;
                        }
                    }
                }
            }
            arrayList2 = arrayList8;
            i = size8;
            z10 = z12;
            arrayList8 = arrayList2;
            size8 = i;
            i17 = i18;
            z12 = z10;
        }
        ArrayList arrayList10 = arrayList8;
        boolean z14 = z12;
        int size9 = arrayList10.size();
        int i19 = 0;
        while (i19 < size9) {
            ArrayList arrayList11 = arrayList10;
            Object obj9 = arrayList11.get(i19);
            int i20 = i19 + 1;
            g gVar2 = (g) obj9;
            c1 c1Var7 = (c1) gVar2.f1023a;
            int i21 = size9;
            y yVar4 = c1Var7.f992c;
            if (zContainsValue) {
                if (q0.I(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + yVar4 + " as Animations cannot run alongside Transitions.");
                }
                gVar2.d();
            } else if (z14) {
                if (q0.I(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + yVar4 + " as Animations cannot run alongside Animators.");
                }
                gVar2.d();
            } else {
                View view4 = yVar4.f1135b0;
                de.i.d(context, str);
                k2 k2VarO2 = gVar2.o(context);
                String str2 = str;
                if (k2VarO2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                Animation animation = (Animation) k2VarO2.f7602w;
                if (animation == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                arrayList10 = arrayList11;
                if (c1Var7.f990a != 1) {
                    view4.startAnimation(animation);
                    gVar2.d();
                } else {
                    viewGroup.startViewTransition(view4);
                    d0 d0Var = new d0(animation, viewGroup, view4);
                    d0Var.setAnimationListener(new k(c1Var7, this, view4, gVar2));
                    view4.startAnimation(d0Var);
                    if (q0.I(2)) {
                        Log.v("FragmentManager", "Animation from operation " + c1Var7 + " has started.");
                    }
                }
                ((p0.c) gVar2.f1024b).a(new f(view4, this, gVar2, c1Var7));
                size9 = i21;
                i19 = i20;
                str = str2;
            }
            size9 = i21;
            i19 = i20;
            arrayList10 = arrayList11;
        }
        int size10 = arrayListP.size();
        int i22 = 0;
        while (i22 < size10) {
            Object obj10 = arrayListP.get(i22);
            i22++;
            c1 c1Var8 = (c1) obj10;
            View view5 = c1Var8.f992c.f1135b0;
            int i23 = c1Var8.f990a;
            de.i.d(view5, "view");
            j4.a.a(view5, i23);
        }
        arrayListP.clear();
        if (q0.I(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + c1Var2 + " to " + c1Var4);
        }
    }

    public final void c() {
        if (this.f1048e) {
            return;
        }
        ViewGroup viewGroup = this.f1044a;
        WeakHashMap weakHashMap = t0.m0.f11853a;
        if (!viewGroup.isAttachedToWindow()) {
            e();
            this.f1047d = false;
            return;
        }
        synchronized (this.f1045b) {
            try {
                if (!this.f1045b.isEmpty()) {
                    ArrayList arrayListP = pd.j.P(this.f1046c);
                    this.f1046c.clear();
                    int size = arrayListP.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayListP.get(i);
                        i++;
                        c1 c1Var = (c1) obj;
                        if (q0.I(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + c1Var);
                        }
                        c1Var.a();
                        if (!c1Var.f995g) {
                            this.f1046c.add(c1Var);
                        }
                    }
                    g();
                    ArrayList arrayListP2 = pd.j.P(this.f1045b);
                    this.f1045b.clear();
                    this.f1046c.addAll(arrayListP2);
                    if (q0.I(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    int size2 = arrayListP2.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj2 = arrayListP2.get(i10);
                        i10++;
                        ((c1) obj2).d();
                    }
                    b(arrayListP2, this.f1047d);
                    this.f1047d = false;
                    if (q0.I(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final c1 d(y yVar) {
        Object obj;
        ArrayList arrayList = this.f1045b;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            c1 c1Var = (c1) obj;
            if (de.i.a(c1Var.f992c, yVar) && !c1Var.f) {
                break;
            }
        }
        return (c1) obj;
    }

    public final void e() {
        String str;
        String str2;
        if (q0.I(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f1044a;
        WeakHashMap weakHashMap = t0.m0.f11853a;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f1045b) {
            try {
                g();
                ArrayList arrayList = this.f1045b;
                int size = arrayList.size();
                int i = 0;
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((c1) obj).d();
                }
                ArrayList arrayListP = pd.j.P(this.f1046c);
                int size2 = arrayListP.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = arrayListP.get(i11);
                    i11++;
                    c1 c1Var = (c1) obj2;
                    if (q0.I(2)) {
                        if (zIsAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f1044a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + c1Var);
                    }
                    c1Var.a();
                }
                ArrayList arrayListP2 = pd.j.P(this.f1045b);
                int size3 = arrayListP2.size();
                while (i < size3) {
                    Object obj3 = arrayListP2.get(i);
                    i++;
                    c1 c1Var2 = (c1) obj3;
                    if (q0.I(2)) {
                        if (zIsAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f1044a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + c1Var2);
                    }
                    c1Var2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        ArrayList arrayList = this.f1045b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            c1 c1Var = (c1) obj;
            int i10 = 2;
            if (c1Var.f991b == 2) {
                int visibility = c1Var.f992c.J().getVisibility();
                if (visibility != 0) {
                    i10 = 4;
                    if (visibility != 4) {
                        if (visibility != 8) {
                            throw new IllegalArgumentException(d0.d.h(visibility, "Unknown visibility "));
                        }
                        i10 = 3;
                    }
                }
                c1Var.c(i10, 1);
            }
        }
    }
}
