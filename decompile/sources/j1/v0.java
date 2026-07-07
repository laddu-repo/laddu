package j1;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.p1;
import com.playfy.tv.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f6990a;

    /* renamed from: b, reason: collision with root package name */
    public final c6.h f6991b;

    /* renamed from: c, reason: collision with root package name */
    public final y f6992c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6993d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f6994e = -1;

    public v0(f0 f0Var, c6.h hVar, y yVar) {
        this.f6990a = f0Var;
        this.f6991b = hVar;
        this.f6992c = yVar;
    }

    public final void a() {
        Bundle bundle;
        boolean L = p0.L(3);
        y yVar = this.f6992c;
        if (L) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + yVar);
        }
        Bundle bundle2 = yVar.f7042y;
        if (bundle2 != null) {
            bundle2.getBundle("savedInstanceState");
        }
        yVar.U.S();
        yVar.f7040x = 3;
        yVar.f7022e0 = false;
        yVar.p();
        if (yVar.f7022e0) {
            if (p0.L(3)) {
                Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + yVar);
            }
            if (yVar.f7024g0 != null) {
                Bundle bundle3 = yVar.f7042y;
                if (bundle3 != null) {
                    bundle = bundle3.getBundle("savedInstanceState");
                } else {
                    bundle = null;
                }
                SparseArray<Parcelable> sparseArray = yVar.f7043z;
                if (sparseArray != null) {
                    yVar.f7024g0.restoreHierarchyState(sparseArray);
                    yVar.f7043z = null;
                }
                yVar.f7022e0 = false;
                yVar.C(bundle);
                if (yVar.f7022e0) {
                    if (yVar.f7024g0 != null) {
                        yVar.f7033q0.a(androidx.lifecycle.w.ON_CREATE);
                    }
                } else {
                    throw new AndroidRuntimeException(h8.c.k("Fragment ", yVar, " did not call through to super.onViewStateRestored()"));
                }
            }
            yVar.f7042y = null;
            p0 p0Var = yVar.U;
            p0Var.H = false;
            p0Var.I = false;
            p0Var.O.f6977g = false;
            p0Var.u(4);
            this.f6990a.D(yVar, false);
            return;
        }
        throw new AndroidRuntimeException(h8.c.k("Fragment ", yVar, " did not call through to super.onActivityCreated()"));
    }

    public final void b() {
        y yVar;
        View view;
        View view2;
        y yVar2;
        y yVar3 = this.f6992c;
        View view3 = yVar3.f7023f0;
        while (true) {
            yVar = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            if (tag instanceof y) {
                yVar2 = (y) tag;
            } else {
                yVar2 = null;
            }
            if (yVar2 != null) {
                yVar = yVar2;
                break;
            }
            Object parent = view3.getParent();
            if (parent instanceof View) {
                view3 = (View) parent;
            } else {
                view3 = null;
            }
        }
        y yVar4 = yVar3.V;
        if (yVar != null && !yVar.equals(yVar4)) {
            int i6 = yVar3.X;
            k1.b bVar = k1.c.f7583a;
            StringBuilder sb2 = new StringBuilder("Attempting to nest fragment ");
            sb2.append(yVar3);
            sb2.append(" within the view of parent fragment ");
            sb2.append(yVar);
            sb2.append(" via container with ID ");
            k1.c.b(new k1.a(yVar3, r4.a.l(sb2, i6, " without using parent's childFragmentManager")));
            k1.c.a(yVar3).getClass();
        }
        ArrayList arrayList = (ArrayList) this.f6991b.f1981x;
        ViewGroup viewGroup = yVar3.f7023f0;
        int i10 = -1;
        if (viewGroup != null) {
            int indexOf = arrayList.indexOf(yVar3);
            int i11 = indexOf - 1;
            while (true) {
                if (i11 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        y yVar5 = (y) arrayList.get(indexOf);
                        if (yVar5.f7023f0 == viewGroup && (view = yVar5.f7024g0) != null) {
                            i10 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    y yVar6 = (y) arrayList.get(i11);
                    if (yVar6.f7023f0 == viewGroup && (view2 = yVar6.f7024g0) != null) {
                        i10 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i11--;
                }
            }
        }
        yVar3.f7023f0.addView(yVar3.f7024g0, i10);
    }

    public final void c() {
        boolean L = p0.L(3);
        y yVar = this.f6992c;
        if (L) {
            Log.d("FragmentManager", "moveto ATTACHED: " + yVar);
        }
        y yVar2 = yVar.E;
        v0 v0Var = null;
        c6.h hVar = this.f6991b;
        if (yVar2 != null) {
            v0 v0Var2 = (v0) ((HashMap) hVar.f1982y).get(yVar2.C);
            if (v0Var2 != null) {
                yVar.F = yVar.E.C;
                yVar.E = null;
                v0Var = v0Var2;
            } else {
                throw new IllegalStateException("Fragment " + yVar + " declared target fragment " + yVar.E + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = yVar.F;
            if (str != null && (v0Var = (v0) ((HashMap) hVar.f1982y).get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(yVar);
                sb2.append(" declared target fragment ");
                throw new IllegalStateException(r4.a.o(sb2, yVar.F, " that does not belong to this FragmentManager!"));
            }
        }
        if (v0Var != null) {
            v0Var.k();
        }
        p0 p0Var = yVar.S;
        yVar.T = p0Var.f6963w;
        yVar.V = p0Var.f6965y;
        f0 f0Var = this.f6990a;
        f0Var.J(yVar, false);
        ArrayList arrayList = yVar.f7039w0;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            ((x) obj).a();
        }
        arrayList.clear();
        yVar.U.b(yVar.T, yVar.a(), yVar);
        yVar.f7040x = 0;
        yVar.f7022e0 = false;
        yVar.r(yVar.T.B);
        if (yVar.f7022e0) {
            p0 p0Var2 = yVar.S;
            Iterator it = p0Var2.f6957p.iterator();
            while (it.hasNext()) {
                ((s0) it.next()).a(p0Var2, yVar);
            }
            p0 p0Var3 = yVar.U;
            p0Var3.H = false;
            p0Var3.I = false;
            p0Var3.O.f6977g = false;
            p0Var3.u(0);
            f0Var.E(yVar, false);
            return;
        }
        throw new AndroidRuntimeException(h8.c.k("Fragment ", yVar, " did not call through to super.onAttach()"));
    }

    public final int d() {
        int i6;
        int i10;
        y yVar = this.f6992c;
        if (yVar.S == null) {
            return yVar.f7040x;
        }
        int i11 = this.f6994e;
        int ordinal = yVar.o0.ordinal();
        int i12 = 0;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        i11 = Math.min(i11, -1);
                    }
                } else {
                    i11 = Math.min(i11, 5);
                }
            } else {
                i11 = Math.min(i11, 1);
            }
        } else {
            i11 = Math.min(i11, 0);
        }
        if (yVar.M) {
            if (yVar.N) {
                i11 = Math.max(this.f6994e, 2);
                View view = yVar.f7024g0;
                if (view != null && view.getParent() == null) {
                    i11 = Math.min(i11, 2);
                }
            } else {
                i11 = this.f6994e < 4 ? Math.min(i11, yVar.f7040x) : Math.min(i11, 1);
            }
        }
        if (yVar.O && yVar.f7023f0 == null) {
            i11 = Math.min(i11, 4);
        }
        if (!yVar.I) {
            i11 = Math.min(i11, 1);
        }
        ViewGroup viewGroup = yVar.f7023f0;
        if (viewGroup != null) {
            m i13 = m.i(viewGroup, yVar.g());
            a1 f3 = i13.f(yVar);
            if (f3 != null) {
                i6 = f3.f6875b;
            } else {
                i6 = 0;
            }
            a1 g10 = i13.g(yVar);
            if (g10 != null) {
                i12 = g10.f6875b;
            }
            if (i6 == 0) {
                i10 = -1;
            } else {
                i10 = b1.f6891a[y.e.c(i6)];
            }
            if (i10 != -1 && i10 != 1) {
                i12 = i6;
            }
        }
        if (i12 == 2) {
            i11 = Math.min(i11, 6);
        } else if (i12 == 3) {
            i11 = Math.max(i11, 3);
        } else if (yVar.J) {
            if (yVar.o()) {
                i11 = Math.min(i11, 1);
            } else {
                i11 = Math.min(i11, -1);
            }
        }
        if (yVar.f7025h0 && yVar.f7040x < 5) {
            i11 = Math.min(i11, 4);
        }
        if (yVar.K) {
            i11 = Math.max(i11, 3);
        }
        if (p0.L(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i11 + " for " + yVar);
        }
        return i11;
    }

    public final void e() {
        Bundle bundle;
        boolean L = p0.L(3);
        y yVar = this.f6992c;
        if (L) {
            Log.d("FragmentManager", "moveto CREATED: " + yVar);
        }
        Bundle bundle2 = yVar.f7042y;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        if (!yVar.f7030m0) {
            f0 f0Var = this.f6990a;
            f0Var.K(yVar, false);
            yVar.U.S();
            yVar.f7040x = 1;
            yVar.f7022e0 = false;
            yVar.f7032p0.a(new e5.b(yVar, 2));
            yVar.s(bundle);
            yVar.f7030m0 = true;
            if (yVar.f7022e0) {
                yVar.f7032p0.f(androidx.lifecycle.w.ON_CREATE);
                f0Var.F(yVar, false);
                return;
            }
            throw new AndroidRuntimeException(h8.c.k("Fragment ", yVar, " did not call through to super.onCreate()"));
        }
        yVar.f7040x = 1;
        yVar.H();
    }

    public final void f() {
        Bundle bundle;
        String str;
        y yVar = this.f6992c;
        if (yVar.M) {
            return;
        }
        if (p0.L(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + yVar);
        }
        Bundle bundle2 = yVar.f7042y;
        Bundle bundle3 = null;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        LayoutInflater w10 = yVar.w(bundle);
        yVar.f7029l0 = w10;
        ViewGroup viewGroup = yVar.f7023f0;
        if (viewGroup == null) {
            int i6 = yVar.X;
            if (i6 != 0) {
                if (i6 != -1) {
                    viewGroup = (ViewGroup) yVar.S.f6964x.m(i6);
                    if (viewGroup == null) {
                        if (!yVar.P && !yVar.O) {
                            try {
                                str = yVar.h().getResourceName(yVar.X);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(yVar.X) + " (" + str + ") for fragment " + yVar);
                        }
                    } else if (!(viewGroup instanceof FragmentContainerView)) {
                        k1.b bVar = k1.c.f7583a;
                        k1.c.b(new k1.a(yVar, "Attempting to add fragment " + yVar + " to container " + viewGroup + " which is not a FragmentContainerView"));
                        k1.c.a(yVar).getClass();
                    }
                } else {
                    throw new IllegalArgumentException(h8.c.k("Cannot create fragment ", yVar, " for a container view with no id"));
                }
            } else {
                viewGroup = null;
            }
        }
        yVar.f7023f0 = viewGroup;
        yVar.D(w10, viewGroup, bundle);
        if (yVar.f7024g0 != null) {
            if (p0.L(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + yVar);
            }
            yVar.f7024g0.setSaveFromParentEnabled(false);
            yVar.f7024g0.setTag(R.id.fragment_container_view_tag, yVar);
            if (viewGroup != null) {
                b();
            }
            if (yVar.Z) {
                yVar.f7024g0.setVisibility(8);
            }
            if (yVar.f7024g0.isAttachedToWindow()) {
                View view = yVar.f7024g0;
                WeakHashMap weakHashMap = t0.q0.f12397a;
                t0.f0.c(view);
            } else {
                View view2 = yVar.f7024g0;
                view2.addOnAttachStateChangeListener(new u0(view2, 0));
            }
            Bundle bundle4 = yVar.f7042y;
            if (bundle4 != null) {
                bundle3 = bundle4.getBundle("savedInstanceState");
            }
            yVar.B(yVar.f7024g0, bundle3);
            yVar.U.u(2);
            this.f6990a.P(yVar, yVar.f7024g0, false);
            int visibility = yVar.f7024g0.getVisibility();
            yVar.b().j = yVar.f7024g0.getAlpha();
            if (yVar.f7023f0 != null && visibility == 0) {
                View findFocus = yVar.f7024g0.findFocus();
                if (findFocus != null) {
                    yVar.b().f7004k = findFocus;
                    if (p0.L(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + yVar);
                    }
                }
                yVar.f7024g0.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }
        yVar.f7040x = 2;
    }

    public final void g() {
        boolean z10;
        boolean z11;
        boolean z12;
        y i6;
        boolean L = p0.L(3);
        y yVar = this.f6992c;
        if (L) {
            Log.d("FragmentManager", "movefrom CREATED: " + yVar);
        }
        boolean z13 = true;
        int i10 = 0;
        if (yVar.J && !yVar.o()) {
            z10 = true;
        } else {
            z10 = false;
        }
        c6.h hVar = this.f6991b;
        if (z10 && !yVar.L) {
            hVar.A(yVar.C, null);
        }
        if (!z10) {
            r0 r0Var = (r0) hVar.A;
            if (r0Var.f6972b.containsKey(yVar.C) && r0Var.f6975e) {
                z12 = r0Var.f6976f;
            } else {
                z12 = true;
            }
            if (!z12) {
                String str = yVar.F;
                if (str != null && (i6 = hVar.i(str)) != null && i6.f7019b0) {
                    yVar.E = i6;
                }
                yVar.f7040x = 0;
                return;
            }
        }
        a0 a0Var = yVar.T;
        if (a0Var != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            z13 = ((r0) hVar.A).f6976f;
        } else {
            i.j jVar = a0Var.B;
            if (r4.a.w(jVar)) {
                z13 = true ^ jVar.isChangingConfigurations();
            }
        }
        if ((z10 && !yVar.L) || z13) {
            ((r0) hVar.A).g(yVar, false);
        }
        yVar.U.l();
        yVar.f7032p0.f(androidx.lifecycle.w.ON_DESTROY);
        yVar.f7040x = 0;
        yVar.f7022e0 = false;
        yVar.f7030m0 = false;
        yVar.f7022e0 = true;
        if (yVar.f7022e0) {
            this.f6990a.G(yVar, false);
            ArrayList k8 = hVar.k();
            int size = k8.size();
            while (i10 < size) {
                Object obj = k8.get(i10);
                i10++;
                v0 v0Var = (v0) obj;
                if (v0Var != null) {
                    y yVar2 = v0Var.f6992c;
                    if (yVar.C.equals(yVar2.F)) {
                        yVar2.E = yVar;
                        yVar2.F = null;
                    }
                }
            }
            String str2 = yVar.F;
            if (str2 != null) {
                yVar.E = hVar.i(str2);
            }
            hVar.s(this);
            return;
        }
        throw new AndroidRuntimeException(h8.c.k("Fragment ", yVar, " did not call through to super.onDestroy()"));
    }

    public final void h() {
        View view;
        boolean L = p0.L(3);
        y yVar = this.f6992c;
        if (L) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + yVar);
        }
        ViewGroup viewGroup = yVar.f7023f0;
        if (viewGroup != null && (view = yVar.f7024g0) != null) {
            viewGroup.removeView(view);
        }
        yVar.U.u(1);
        if (yVar.f7024g0 != null) {
            x0 x0Var = yVar.f7033q0;
            x0Var.b();
            if (x0Var.B.f929d.compareTo(androidx.lifecycle.x.f993z) >= 0) {
                yVar.f7033q0.a(androidx.lifecycle.w.ON_DESTROY);
            }
        }
        yVar.f7040x = 1;
        yVar.f7022e0 = false;
        yVar.u();
        if (yVar.f7022e0) {
            p1 store = yVar.getViewModelStore();
            kotlin.jvm.internal.k.e(store, "store");
            o1.a defaultCreationExtras = o1.a.f9847b;
            kotlin.jvm.internal.k.e(defaultCreationExtras, "defaultCreationExtras");
            ic.s sVar = new ic.s(store, q1.a.f10826c, defaultCreationExtras);
            kotlin.jvm.internal.e a10 = kotlin.jvm.internal.x.a(q1.a.class);
            String b10 = a10.b();
            if (b10 != null) {
                v.m mVar = ((q1.a) sVar.p("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b10), a10)).f10827b;
                if (mVar.f() <= 0) {
                    yVar.Q = false;
                    this.f6990a.Q(yVar, false);
                    yVar.f7023f0 = null;
                    yVar.f7024g0 = null;
                    yVar.f7033q0 = null;
                    yVar.f7034r0.h(null);
                    yVar.N = false;
                    return;
                }
                mVar.g(0).getClass();
                throw new ClassCastException();
            }
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        throw new AndroidRuntimeException(h8.c.k("Fragment ", yVar, " did not call through to super.onDestroyView()"));
    }

    public final void i() {
        boolean z10;
        boolean L = p0.L(3);
        y yVar = this.f6992c;
        if (L) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + yVar);
        }
        yVar.f7040x = -1;
        yVar.f7022e0 = false;
        yVar.v();
        yVar.f7029l0 = null;
        if (yVar.f7022e0) {
            p0 p0Var = yVar.U;
            if (!p0Var.J) {
                p0Var.l();
                yVar.U = new p0();
            }
            this.f6990a.H(yVar, false);
            yVar.f7040x = -1;
            yVar.T = null;
            yVar.V = null;
            yVar.S = null;
            if (!yVar.J || yVar.o()) {
                r0 r0Var = (r0) this.f6991b.A;
                if (r0Var.f6972b.containsKey(yVar.C) && r0Var.f6975e) {
                    z10 = r0Var.f6976f;
                } else {
                    z10 = true;
                }
                if (!z10) {
                    return;
                }
            }
            if (p0.L(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + yVar);
            }
            yVar.l();
            return;
        }
        throw new AndroidRuntimeException(h8.c.k("Fragment ", yVar, " did not call through to super.onDetach()"));
    }

    public final void j() {
        Bundle bundle;
        y yVar = this.f6992c;
        if (yVar.M && yVar.N && !yVar.Q) {
            if (p0.L(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + yVar);
            }
            Bundle bundle2 = yVar.f7042y;
            Bundle bundle3 = null;
            if (bundle2 != null) {
                bundle = bundle2.getBundle("savedInstanceState");
            } else {
                bundle = null;
            }
            LayoutInflater w10 = yVar.w(bundle);
            yVar.f7029l0 = w10;
            yVar.D(w10, null, bundle);
            View view = yVar.f7024g0;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                yVar.f7024g0.setTag(R.id.fragment_container_view_tag, yVar);
                if (yVar.Z) {
                    yVar.f7024g0.setVisibility(8);
                }
                Bundle bundle4 = yVar.f7042y;
                if (bundle4 != null) {
                    bundle3 = bundle4.getBundle("savedInstanceState");
                }
                yVar.B(yVar.f7024g0, bundle3);
                yVar.U.u(2);
                this.f6990a.P(yVar, yVar.f7024g0, false);
                yVar.f7040x = 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0160, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k() {
        /*
            Method dump skipped, instructions count: 586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.v0.k():void");
    }

    public final void l() {
        boolean L = p0.L(3);
        y yVar = this.f6992c;
        if (L) {
            Log.d("FragmentManager", "movefrom RESUMED: " + yVar);
        }
        yVar.U.u(5);
        if (yVar.f7024g0 != null) {
            yVar.f7033q0.a(androidx.lifecycle.w.ON_PAUSE);
        }
        yVar.f7032p0.f(androidx.lifecycle.w.ON_PAUSE);
        yVar.f7040x = 6;
        yVar.f7022e0 = true;
        this.f6990a.I(yVar, false);
    }

    public final void m(ClassLoader classLoader) {
        y yVar = this.f6992c;
        Bundle bundle = yVar.f7042y;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            if (yVar.f7042y.getBundle("savedInstanceState") == null) {
                yVar.f7042y.putBundle("savedInstanceState", new Bundle());
            }
            try {
                yVar.f7043z = yVar.f7042y.getSparseParcelableArray("viewState");
                yVar.A = yVar.f7042y.getBundle("viewRegistryState");
                t0 t0Var = (t0) yVar.f7042y.getParcelable("state");
                if (t0Var != null) {
                    yVar.F = t0Var.J;
                    yVar.G = t0Var.K;
                    Boolean bool = yVar.B;
                    if (bool != null) {
                        yVar.f7026i0 = bool.booleanValue();
                        yVar.B = null;
                    } else {
                        yVar.f7026i0 = t0Var.L;
                    }
                }
                if (!yVar.f7026i0) {
                    yVar.f7025h0 = true;
                }
            } catch (BadParcelableException e10) {
                throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + yVar, e10);
            }
        }
    }

    public final void n() {
        View view;
        String str;
        boolean L = p0.L(3);
        y yVar = this.f6992c;
        if (L) {
            Log.d("FragmentManager", "moveto RESUMED: " + yVar);
        }
        w wVar = yVar.f7027j0;
        if (wVar == null) {
            view = null;
        } else {
            view = wVar.f7004k;
        }
        if (view != null) {
            if (view != yVar.f7024g0) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != yVar.f7024g0) {
                    }
                }
            }
            boolean requestFocus = view.requestFocus();
            if (p0.L(2)) {
                StringBuilder sb2 = new StringBuilder("requestFocus: Restoring focused view ");
                sb2.append(view);
                sb2.append(" ");
                if (requestFocus) {
                    str = "succeeded";
                } else {
                    str = "failed";
                }
                sb2.append(str);
                sb2.append(" on Fragment ");
                sb2.append(yVar);
                sb2.append(" resulting in focused view ");
                sb2.append(yVar.f7024g0.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        yVar.b().f7004k = null;
        yVar.U.S();
        yVar.U.z(true);
        yVar.f7040x = 7;
        yVar.f7022e0 = false;
        yVar.f7022e0 = true;
        if (yVar.f7022e0) {
            androidx.lifecycle.h0 h0Var = yVar.f7032p0;
            androidx.lifecycle.w wVar2 = androidx.lifecycle.w.ON_RESUME;
            h0Var.f(wVar2);
            if (yVar.f7024g0 != null) {
                yVar.f7033q0.B.f(wVar2);
            }
            p0 p0Var = yVar.U;
            p0Var.H = false;
            p0Var.I = false;
            p0Var.O.f6977g = false;
            p0Var.u(7);
            this.f6990a.L(yVar, false);
            this.f6991b.A(yVar.C, null);
            yVar.f7042y = null;
            yVar.f7043z = null;
            yVar.A = null;
            return;
        }
        throw new AndroidRuntimeException(h8.c.k("Fragment ", yVar, " did not call through to super.onResume()"));
    }

    public final Bundle o() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        y yVar = this.f6992c;
        if (yVar.f7040x == -1 && (bundle = yVar.f7042y) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new t0(yVar));
        if (yVar.f7040x > 0) {
            Bundle bundle3 = new Bundle();
            yVar.y(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f6990a.M(yVar, bundle3, false);
            Bundle bundle4 = new Bundle();
            yVar.f7036t0.c(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle Z = yVar.U.Z();
            if (!Z.isEmpty()) {
                bundle2.putBundle("childFragmentManager", Z);
            }
            if (yVar.f7024g0 != null) {
                p();
            }
            SparseArray<? extends Parcelable> sparseArray = yVar.f7043z;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = yVar.A;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = yVar.D;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void p() {
        y yVar = this.f6992c;
        if (yVar.f7024g0 != null) {
            if (p0.L(2)) {
                Log.v("FragmentManager", "Saving view state for fragment " + yVar + " with view " + yVar.f7024g0);
            }
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            yVar.f7024g0.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                yVar.f7043z = sparseArray;
            }
            Bundle bundle = new Bundle();
            yVar.f7033q0.C.c(bundle);
            if (!bundle.isEmpty()) {
                yVar.A = bundle;
            }
        }
    }

    public final void q() {
        boolean L = p0.L(3);
        y yVar = this.f6992c;
        if (L) {
            Log.d("FragmentManager", "moveto STARTED: " + yVar);
        }
        yVar.U.S();
        yVar.U.z(true);
        yVar.f7040x = 5;
        yVar.f7022e0 = false;
        yVar.z();
        if (yVar.f7022e0) {
            androidx.lifecycle.h0 h0Var = yVar.f7032p0;
            androidx.lifecycle.w wVar = androidx.lifecycle.w.ON_START;
            h0Var.f(wVar);
            if (yVar.f7024g0 != null) {
                yVar.f7033q0.B.f(wVar);
            }
            p0 p0Var = yVar.U;
            p0Var.H = false;
            p0Var.I = false;
            p0Var.O.f6977g = false;
            p0Var.u(5);
            this.f6990a.N(yVar, false);
            return;
        }
        throw new AndroidRuntimeException(h8.c.k("Fragment ", yVar, " did not call through to super.onStart()"));
    }

    public final void r() {
        boolean L = p0.L(3);
        y yVar = this.f6992c;
        if (L) {
            Log.d("FragmentManager", "movefrom STARTED: " + yVar);
        }
        p0 p0Var = yVar.U;
        p0Var.I = true;
        p0Var.O.f6977g = true;
        p0Var.u(4);
        if (yVar.f7024g0 != null) {
            yVar.f7033q0.a(androidx.lifecycle.w.ON_STOP);
        }
        yVar.f7032p0.f(androidx.lifecycle.w.ON_STOP);
        yVar.f7040x = 4;
        yVar.f7022e0 = false;
        yVar.A();
        if (yVar.f7022e0) {
            this.f6990a.O(yVar, false);
            return;
        }
        throw new AndroidRuntimeException(h8.c.k("Fragment ", yVar, " did not call through to super.onStop()"));
    }

    public v0(f0 f0Var, c6.h hVar, ClassLoader classLoader, i0 i0Var, Bundle bundle) {
        this.f6990a = f0Var;
        this.f6991b = hVar;
        y a10 = ((t0) bundle.getParcelable("state")).a(i0Var);
        this.f6992c = a10;
        a10.f7042y = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a10.J(bundle2);
        if (p0.L(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a10);
        }
    }

    public v0(f0 f0Var, c6.h hVar, y yVar, Bundle bundle) {
        this.f6990a = f0Var;
        this.f6991b = hVar;
        this.f6992c = yVar;
        yVar.f7043z = null;
        yVar.A = null;
        yVar.R = 0;
        yVar.N = false;
        yVar.I = false;
        y yVar2 = yVar.E;
        yVar.F = yVar2 != null ? yVar2.C : null;
        yVar.E = null;
        yVar.f7042y = bundle;
        yVar.D = bundle.getBundle("arguments");
    }
}
