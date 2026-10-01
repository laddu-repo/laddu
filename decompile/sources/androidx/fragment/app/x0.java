package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.decoder.DecoderInputBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sc.b f1128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sb.p f1129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f1130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1131d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1132e = -1;

    public x0(sc.b bVar, sb.p pVar, y yVar) {
        this.f1128a = bVar;
        this.f1129b = pVar;
        this.f1130c = yVar;
    }

    public final void a() {
        boolean zI = q0.I(3);
        y yVar = this.f1130c;
        if (zI) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + yVar);
        }
        Bundle bundle = yVar.f1152w;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        yVar.P.P();
        yVar.f1151v = 3;
        yVar.Z = false;
        yVar.s();
        if (!yVar.Z) {
            throw new f1("Fragment " + yVar + " did not call through to super.onActivityCreated()");
        }
        if (q0.I(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + yVar);
        }
        if (yVar.f1135b0 != null) {
            Bundle bundle2 = yVar.f1152w;
            Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
            SparseArray<Parcelable> sparseArray = yVar.f1153x;
            if (sparseArray != null) {
                yVar.f1135b0.restoreHierarchyState(sparseArray);
                yVar.f1153x = null;
            }
            yVar.Z = false;
            yVar.F(bundle3);
            if (!yVar.Z) {
                throw new f1("Fragment " + yVar + " did not call through to super.onViewStateRestored()");
            }
            if (yVar.f1135b0 != null) {
                yVar.f1145l0.b(androidx.lifecycle.m.ON_CREATE);
            }
        }
        yVar.f1152w = null;
        q0 q0Var = yVar.P;
        q0Var.E = false;
        q0Var.F = false;
        q0Var.L.i = false;
        q0Var.t(4);
        this.f1128a.H(false);
    }

    public final void b() {
        y yVar;
        View view;
        View view2;
        y yVar2 = this.f1130c;
        View view3 = yVar2.f1134a0;
        while (true) {
            yVar = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(m1.b.fragment_container_view_tag);
            y yVar3 = tag instanceof y ? (y) tag : null;
            if (yVar3 != null) {
                yVar = yVar3;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        y yVar4 = yVar2.Q;
        if (yVar != null && !yVar.equals(yVar4)) {
            int i = yVar2.S;
            n1.b bVar = n1.c.f8966a;
            StringBuilder sb2 = new StringBuilder("Attempting to nest fragment ");
            sb2.append(yVar2);
            sb2.append(" within the view of parent fragment ");
            sb2.append(yVar);
            sb2.append(" via container with ID ");
            n1.c.b(new n1.a(yVar2, j4.a.l(i, " without using parent's childFragmentManager", sb2)));
            n1.c.a(yVar2).getClass();
        }
        ArrayList arrayList = (ArrayList) this.f1129b.f11742w;
        ViewGroup viewGroup = yVar2.f1134a0;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = arrayList.indexOf(yVar2);
            int i10 = iIndexOf - 1;
            while (true) {
                if (i10 < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        y yVar5 = (y) arrayList.get(iIndexOf);
                        if (yVar5.f1134a0 == viewGroup && (view = yVar5.f1135b0) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    y yVar6 = (y) arrayList.get(i10);
                    if (yVar6.f1134a0 == viewGroup && (view2 = yVar6.f1135b0) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i10--;
                }
            }
        }
        yVar2.f1134a0.addView(yVar2.f1135b0, iIndexOfChild);
    }

    public final void c() {
        boolean zI = q0.I(3);
        y yVar = this.f1130c;
        if (zI) {
            Log.d("FragmentManager", "moveto ATTACHED: " + yVar);
        }
        y yVar2 = yVar.C;
        x0 x0Var = null;
        sb.p pVar = this.f1129b;
        if (yVar2 != null) {
            x0 x0Var2 = (x0) ((HashMap) pVar.f11743x).get(yVar2.A);
            if (x0Var2 == null) {
                throw new IllegalStateException("Fragment " + yVar + " declared target fragment " + yVar.C + " that does not belong to this FragmentManager!");
            }
            yVar.D = yVar.C.A;
            yVar.C = null;
            x0Var = x0Var2;
        } else {
            String str = yVar.D;
            if (str != null && (x0Var = (x0) ((HashMap) pVar.f11743x).get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(yVar);
                sb2.append(" declared target fragment ");
                throw new IllegalStateException(j4.a.n(sb2, yVar.D, " that does not belong to this FragmentManager!"));
            }
        }
        if (x0Var != null) {
            x0Var.k();
        }
        q0 q0Var = yVar.N;
        yVar.O = q0Var.f1085t;
        yVar.Q = q0Var.f1087v;
        sc.b bVar = this.f1128a;
        bVar.N(false);
        ArrayList arrayList = yVar.f1149q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((x) obj).a();
        }
        arrayList.clear();
        yVar.P.b(yVar.O, yVar.b(), yVar);
        yVar.f1151v = 0;
        yVar.Z = false;
        yVar.u(yVar.O.f988y);
        if (!yVar.Z) {
            throw new f1("Fragment " + yVar + " did not call through to super.onAttach()");
        }
        Iterator it = yVar.N.f1078m.iterator();
        while (it.hasNext()) {
            ((u0) it.next()).b();
        }
        q0 q0Var2 = yVar.P;
        q0Var2.E = false;
        q0Var2.F = false;
        q0Var2.L.i = false;
        q0Var2.t(0);
        bVar.I(false);
    }

    public final int d() {
        int i;
        Object obj;
        y yVar = this.f1130c;
        if (yVar.N == null) {
            return yVar.f1151v;
        }
        int iMin = this.f1132e;
        int iOrdinal = yVar.f1143j0.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (yVar.I) {
            if (yVar.J) {
                iMin = Math.max(this.f1132e, 2);
                View view = yVar.f1135b0;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f1132e < 4 ? Math.min(iMin, yVar.f1151v) : Math.min(iMin, 1);
            }
        }
        if (!yVar.G) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = yVar.f1134a0;
        if (viewGroup != null) {
            l lVarF = l.f(viewGroup, yVar.l());
            c1 c1VarD = lVarF.d(yVar);
            int i10 = c1VarD != null ? c1VarD.f991b : 0;
            ArrayList arrayList = lVarF.f1046c;
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    obj = null;
                    break;
                }
                obj = arrayList.get(i11);
                i11++;
                c1 c1Var = (c1) obj;
                if (de.i.a(c1Var.f992c, yVar) && !c1Var.f) {
                    break;
                }
            }
            c1 c1Var2 = (c1) obj;
            i = c1Var2 != null ? c1Var2.f991b : 0;
            int i12 = i10 == 0 ? -1 : e1.f1012a[y.e.c(i10)];
            if (i12 != -1 && i12 != 1) {
                i = i10;
            }
        } else {
            i = 0;
        }
        if (i == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i == 3) {
            iMin = Math.max(iMin, 3);
        } else if (yVar.H) {
            iMin = yVar.r() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (yVar.f1136c0 && yVar.f1151v < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (q0.I(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + yVar);
        }
        return iMin;
    }

    public final void e() {
        Bundle bundle;
        boolean zI = q0.I(3);
        final y yVar = this.f1130c;
        if (zI) {
            Log.d("FragmentManager", "moveto CREATED: " + yVar);
        }
        Bundle bundle2 = yVar.f1152w;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (yVar.f1141h0) {
            yVar.f1151v = 1;
            Bundle bundle4 = yVar.f1152w;
            if (bundle4 == null || (bundle = bundle4.getBundle("childFragmentManager")) == null) {
                return;
            }
            yVar.P.V(bundle);
            q0 q0Var = yVar.P;
            q0Var.E = false;
            q0Var.F = false;
            q0Var.L.i = false;
            q0Var.t(1);
            return;
        }
        sc.b bVar = this.f1128a;
        bVar.O(false);
        yVar.P.P();
        yVar.f1151v = 1;
        yVar.Z = false;
        yVar.f1144k0.a(new androidx.lifecycle.q() { // from class: androidx.fragment.app.Fragment$6
            @Override // androidx.lifecycle.q
            public final void a(androidx.lifecycle.s sVar, androidx.lifecycle.m mVar) {
                View view;
                if (mVar != androidx.lifecycle.m.ON_STOP || (view = yVar.f1135b0) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        yVar.v(bundle3);
        yVar.f1141h0 = true;
        if (yVar.Z) {
            yVar.f1144k0.d(androidx.lifecycle.m.ON_CREATE);
            bVar.J(false);
        } else {
            throw new f1("Fragment " + yVar + " did not call through to super.onCreate()");
        }
    }

    public final void f() {
        String resourceName;
        y yVar = this.f1130c;
        if (yVar.I) {
            return;
        }
        if (q0.I(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + yVar);
        }
        Bundle bundle = yVar.f1152w;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterZ = yVar.z(bundle2);
        yVar.f1140g0 = layoutInflaterZ;
        ViewGroup viewGroup2 = yVar.f1134a0;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = yVar.S;
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + yVar + " for a container view with no id");
                }
                viewGroup = (ViewGroup) yVar.N.f1086u.H(i);
                if (viewGroup == null) {
                    if (!yVar.K) {
                        try {
                            resourceName = yVar.m().getResourceName(yVar.S);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(yVar.S) + " (" + resourceName + ") for fragment " + yVar);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    n1.b bVar = n1.c.f8966a;
                    n1.c.b(new n1.a(yVar, "Attempting to add fragment " + yVar + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    n1.c.a(yVar).getClass();
                }
            }
        }
        yVar.f1134a0 = viewGroup;
        yVar.G(layoutInflaterZ, viewGroup, bundle2);
        if (yVar.f1135b0 != null) {
            if (q0.I(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + yVar);
            }
            yVar.f1135b0.setSaveFromParentEnabled(false);
            yVar.f1135b0.setTag(m1.b.fragment_container_view_tag, yVar);
            if (viewGroup != null) {
                b();
            }
            if (yVar.U) {
                yVar.f1135b0.setVisibility(8);
            }
            View view = yVar.f1135b0;
            WeakHashMap weakHashMap = t0.m0.f11853a;
            if (view.isAttachedToWindow()) {
                t0.b0.c(yVar.f1135b0);
            } else {
                View view2 = yVar.f1135b0;
                view2.addOnAttachStateChangeListener(new w0(0, view2));
            }
            Bundle bundle3 = yVar.f1152w;
            if (bundle3 != null) {
                bundle3.getBundle("savedInstanceState");
            }
            yVar.E();
            yVar.P.t(2);
            this.f1128a.T(false);
            int visibility = yVar.f1135b0.getVisibility();
            yVar.g().f1124j = yVar.f1135b0.getAlpha();
            if (yVar.f1134a0 != null && visibility == 0) {
                View viewFindFocus = yVar.f1135b0.findFocus();
                if (viewFindFocus != null) {
                    yVar.g().f1125k = viewFindFocus;
                    if (q0.I(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + yVar);
                    }
                }
                yVar.f1135b0.setAlpha(0.0f);
            }
        }
        yVar.f1151v = 2;
    }

    public final void g() {
        y yVarK;
        boolean zI = q0.I(3);
        y yVar = this.f1130c;
        if (zI) {
            Log.d("FragmentManager", "movefrom CREATED: " + yVar);
        }
        boolean zIsChangingConfigurations = true;
        int i = 0;
        boolean z2 = yVar.H && !yVar.r();
        sb.p pVar = this.f1129b;
        if (z2) {
            pVar.H(yVar.A, null);
        }
        if (!z2) {
            t0 t0Var = (t0) pVar.f11745z;
            if (!((t0Var.f1102d.containsKey(yVar.A) && t0Var.f1104g) ? t0Var.f1105h : true)) {
                String str = yVar.D;
                if (str != null && (yVarK = pVar.k(str)) != null && yVarK.W) {
                    yVar.C = yVarK;
                }
                yVar.f1151v = 0;
                return;
            }
        }
        c0 c0Var = yVar.O;
        if (c0Var != null) {
            zIsChangingConfigurations = ((t0) pVar.f11745z).f1105h;
        } else {
            h.j jVar = c0Var.f988y;
            if (d0.d.s(jVar)) {
                zIsChangingConfigurations = true ^ jVar.isChangingConfigurations();
            }
        }
        if (z2 || zIsChangingConfigurations) {
            ((t0) pVar.f11745z).d(yVar);
        }
        yVar.P.k();
        yVar.f1144k0.d(androidx.lifecycle.m.ON_DESTROY);
        yVar.f1151v = 0;
        yVar.Z = false;
        yVar.f1141h0 = false;
        yVar.Z = true;
        if (!yVar.Z) {
            throw new f1("Fragment " + yVar + " did not call through to super.onDestroy()");
        }
        this.f1128a.K(false);
        ArrayList arrayListP = pVar.p();
        int size = arrayListP.size();
        while (i < size) {
            Object obj = arrayListP.get(i);
            i++;
            x0 x0Var = (x0) obj;
            if (x0Var != null) {
                y yVar2 = x0Var.f1130c;
                if (yVar.A.equals(yVar2.D)) {
                    yVar2.C = yVar;
                    yVar2.D = null;
                }
            }
        }
        String str2 = yVar.D;
        if (str2 != null) {
            yVar.C = pVar.k(str2);
        }
        pVar.y(this);
    }

    public final void h() {
        View view;
        boolean zI = q0.I(3);
        y yVar = this.f1130c;
        if (zI) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + yVar);
        }
        ViewGroup viewGroup = yVar.f1134a0;
        if (viewGroup != null && (view = yVar.f1135b0) != null) {
            viewGroup.removeView(view);
        }
        yVar.P.t(1);
        if (yVar.f1135b0 != null) {
            z0 z0Var = yVar.f1145l0;
            z0Var.g();
            if (z0Var.f1169z.f1238c.compareTo(androidx.lifecycle.n.f1219x) >= 0) {
                yVar.f1145l0.b(androidx.lifecycle.m.ON_DESTROY);
            }
        }
        yVar.f1151v = 1;
        yVar.Z = false;
        yVar.x();
        if (!yVar.Z) {
            throw new f1("Fragment " + yVar + " did not call through to super.onDestroyView()");
        }
        v.j jVar = ((s1.a) new a7.j(yVar.e(), s1.a.f11419e).p(s1.a.class)).f11420d;
        if (jVar.f13024x > 0) {
            jVar.e(0).getClass();
            throw new ClassCastException();
        }
        yVar.L = false;
        this.f1128a.U(false);
        yVar.f1134a0 = null;
        yVar.f1135b0 = null;
        yVar.f1145l0 = null;
        yVar.f1146m0.e(null);
        yVar.J = false;
    }

    public final void i() {
        boolean zI = q0.I(3);
        y yVar = this.f1130c;
        if (zI) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + yVar);
        }
        yVar.f1151v = -1;
        yVar.Z = false;
        yVar.y();
        yVar.f1140g0 = null;
        if (!yVar.Z) {
            throw new f1("Fragment " + yVar + " did not call through to super.onDetach()");
        }
        q0 q0Var = yVar.P;
        if (!q0Var.G) {
            q0Var.k();
            yVar.P = new q0();
        }
        this.f1128a.L(false);
        yVar.f1151v = -1;
        yVar.O = null;
        yVar.Q = null;
        yVar.N = null;
        if (!yVar.H || yVar.r()) {
            t0 t0Var = (t0) this.f1129b.f11745z;
            if (!((t0Var.f1102d.containsKey(yVar.A) && t0Var.f1104g) ? t0Var.f1105h : true)) {
                return;
            }
        }
        if (q0.I(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + yVar);
        }
        yVar.o();
    }

    public final void j() {
        y yVar = this.f1130c;
        if (yVar.I && yVar.J && !yVar.L) {
            if (q0.I(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + yVar);
            }
            Bundle bundle = yVar.f1152w;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            LayoutInflater layoutInflaterZ = yVar.z(bundle2);
            yVar.f1140g0 = layoutInflaterZ;
            yVar.G(layoutInflaterZ, null, bundle2);
            View view = yVar.f1135b0;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                yVar.f1135b0.setTag(m1.b.fragment_container_view_tag, yVar);
                if (yVar.U) {
                    yVar.f1135b0.setVisibility(8);
                }
                Bundle bundle3 = yVar.f1152w;
                if (bundle3 != null) {
                    bundle3.getBundle("savedInstanceState");
                }
                yVar.E();
                yVar.P.t(2);
                this.f1128a.T(false);
                yVar.f1151v = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        sb.p pVar = this.f1129b;
        boolean z2 = this.f1131d;
        y yVar = this.f1130c;
        if (z2) {
            if (q0.I(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + yVar);
                return;
            }
            return;
        }
        try {
            this.f1131d = true;
            boolean z10 = false;
            while (true) {
                int iD = d();
                int i = yVar.f1151v;
                int i10 = 3;
                if (iD == i) {
                    if (!z10 && i == -1 && yVar.H && !yVar.r()) {
                        if (q0.I(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + yVar);
                        }
                        ((t0) pVar.f11745z).d(yVar);
                        pVar.y(this);
                        if (q0.I(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + yVar);
                        }
                        yVar.o();
                    }
                    if (yVar.f1139f0) {
                        if (yVar.f1135b0 != null && (viewGroup = yVar.f1134a0) != null) {
                            l lVarF = l.f(viewGroup, yVar.l());
                            if (yVar.U) {
                                if (q0.I(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + yVar);
                                }
                                lVarF.a(3, 1, this);
                            } else {
                                if (q0.I(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + yVar);
                                }
                                lVarF.a(2, 1, this);
                            }
                        }
                        q0 q0Var = yVar.N;
                        if (q0Var != null && yVar.G && q0.J(yVar)) {
                            q0Var.D = true;
                        }
                        yVar.f1139f0 = false;
                        yVar.P.n();
                    }
                    this.f1131d = false;
                    return;
                }
                if (iD <= i) {
                    switch (i - 1) {
                        case -1:
                            i();
                            break;
                        case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                            g();
                            break;
                        case 1:
                            h();
                            yVar.f1151v = 1;
                            break;
                        case 2:
                            yVar.J = false;
                            yVar.f1151v = 2;
                            break;
                        case 3:
                            if (q0.I(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + yVar);
                            }
                            if (yVar.f1135b0 != null && yVar.f1153x == null) {
                                o();
                            }
                            if (yVar.f1135b0 != null && (viewGroup2 = yVar.f1134a0) != null) {
                                l lVarF2 = l.f(viewGroup2, yVar.l());
                                if (q0.I(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + yVar);
                                }
                                lVarF2.a(1, 3, this);
                            }
                            yVar.f1151v = 3;
                            break;
                        case g1.g.LONG_FIELD_NUMBER /* 4 */:
                            q();
                            break;
                        case g1.g.STRING_FIELD_NUMBER /* 5 */:
                            yVar.f1151v = 5;
                            break;
                        case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                            l();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case g1.g.LONG_FIELD_NUMBER /* 4 */:
                            if (yVar.f1135b0 != null && (viewGroup3 = yVar.f1134a0) != null) {
                                l lVarF3 = l.f(viewGroup3, yVar.l());
                                int visibility = yVar.f1135b0.getVisibility();
                                if (visibility == 0) {
                                    i10 = 2;
                                } else if (visibility == 4) {
                                    i10 = 4;
                                } else if (visibility != 8) {
                                    throw new IllegalArgumentException("Unknown visibility " + visibility);
                                }
                                d0.d.q(i10, "finalState");
                                if (q0.I(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + yVar);
                                }
                                lVarF3.a(i10, 2, this);
                            }
                            yVar.f1151v = 4;
                            break;
                        case g1.g.STRING_FIELD_NUMBER /* 5 */:
                            p();
                            break;
                        case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                            yVar.f1151v = 6;
                            break;
                        case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                            n();
                            break;
                    }
                }
                z10 = true;
            }
        } catch (Throwable th) {
            this.f1131d = false;
            throw th;
        }
    }

    public final void l() {
        boolean zI = q0.I(3);
        y yVar = this.f1130c;
        if (zI) {
            Log.d("FragmentManager", "movefrom RESUMED: " + yVar);
        }
        yVar.P.t(5);
        if (yVar.f1135b0 != null) {
            yVar.f1145l0.b(androidx.lifecycle.m.ON_PAUSE);
        }
        yVar.f1144k0.d(androidx.lifecycle.m.ON_PAUSE);
        yVar.f1151v = 6;
        yVar.Z = true;
        this.f1128a.M(false);
    }

    public final void m(ClassLoader classLoader) {
        y yVar = this.f1130c;
        Bundle bundle = yVar.f1152w;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (yVar.f1152w.getBundle("savedInstanceState") == null) {
            yVar.f1152w.putBundle("savedInstanceState", new Bundle());
        }
        yVar.f1153x = yVar.f1152w.getSparseParcelableArray("viewState");
        yVar.f1154y = yVar.f1152w.getBundle("viewRegistryState");
        v0 v0Var = (v0) yVar.f1152w.getParcelable("state");
        if (v0Var != null) {
            yVar.D = v0Var.G;
            yVar.E = v0Var.H;
            Boolean bool = yVar.f1155z;
            if (bool != null) {
                yVar.f1137d0 = bool.booleanValue();
                yVar.f1155z = null;
            } else {
                yVar.f1137d0 = v0Var.I;
            }
        }
        if (yVar.f1137d0) {
            return;
        }
        yVar.f1136c0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n() {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.x0.n():void");
    }

    public final void o() {
        y yVar = this.f1130c;
        if (yVar.f1135b0 == null) {
            return;
        }
        if (q0.I(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + yVar + " with view " + yVar.f1135b0);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        yVar.f1135b0.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            yVar.f1153x = sparseArray;
        }
        Bundle bundle = new Bundle();
        yVar.f1145l0.A.g(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        yVar.f1154y = bundle;
    }

    public final void p() {
        boolean zI = q0.I(3);
        y yVar = this.f1130c;
        if (zI) {
            Log.d("FragmentManager", "moveto STARTED: " + yVar);
        }
        yVar.P.P();
        yVar.P.y(true);
        yVar.f1151v = 5;
        yVar.Z = false;
        yVar.C();
        if (!yVar.Z) {
            throw new f1("Fragment " + yVar + " did not call through to super.onStart()");
        }
        androidx.lifecycle.u uVar = yVar.f1144k0;
        androidx.lifecycle.m mVar = androidx.lifecycle.m.ON_START;
        uVar.d(mVar);
        if (yVar.f1135b0 != null) {
            yVar.f1145l0.f1169z.d(mVar);
        }
        q0 q0Var = yVar.P;
        q0Var.E = false;
        q0Var.F = false;
        q0Var.L.i = false;
        q0Var.t(5);
        this.f1128a.R(false);
    }

    public final void q() {
        boolean zI = q0.I(3);
        y yVar = this.f1130c;
        if (zI) {
            Log.d("FragmentManager", "movefrom STARTED: " + yVar);
        }
        q0 q0Var = yVar.P;
        q0Var.F = true;
        q0Var.L.i = true;
        q0Var.t(4);
        if (yVar.f1135b0 != null) {
            yVar.f1145l0.b(androidx.lifecycle.m.ON_STOP);
        }
        yVar.f1144k0.d(androidx.lifecycle.m.ON_STOP);
        yVar.f1151v = 4;
        yVar.Z = false;
        yVar.D();
        if (yVar.Z) {
            this.f1128a.S(false);
            return;
        }
        throw new f1("Fragment " + yVar + " did not call through to super.onStop()");
    }

    public x0(sc.b bVar, sb.p pVar, ClassLoader classLoader, k0 k0Var, Bundle bundle) {
        this.f1128a = bVar;
        this.f1129b = pVar;
        v0 v0Var = (v0) bundle.getParcelable("state");
        y yVarA = k0Var.a(v0Var.f1112v);
        yVarA.A = v0Var.f1113w;
        yVarA.I = v0Var.f1114x;
        yVarA.K = true;
        yVarA.R = v0Var.f1115y;
        yVarA.S = v0Var.f1116z;
        yVarA.T = v0Var.A;
        yVarA.W = v0Var.B;
        yVarA.H = v0Var.C;
        yVarA.V = v0Var.D;
        yVarA.U = v0Var.E;
        yVarA.f1143j0 = androidx.lifecycle.n.values()[v0Var.F];
        yVarA.D = v0Var.G;
        yVarA.E = v0Var.H;
        yVarA.f1137d0 = v0Var.I;
        this.f1130c = yVarA;
        yVarA.f1152w = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        yVarA.L(bundle2);
        if (q0.I(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + yVarA);
        }
    }

    public x0(sc.b bVar, sb.p pVar, y yVar, Bundle bundle) {
        this.f1128a = bVar;
        this.f1129b = pVar;
        this.f1130c = yVar;
        yVar.f1153x = null;
        yVar.f1154y = null;
        yVar.M = 0;
        yVar.J = false;
        yVar.G = false;
        y yVar2 = yVar.C;
        yVar.D = yVar2 != null ? yVar2.A : null;
        yVar.C = null;
        yVar.f1152w = bundle;
        yVar.B = bundle.getBundle("arguments");
    }
}
