package j1;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.d1;
import androidx.lifecycle.g1;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import androidx.lifecycle.p1;
import androidx.lifecycle.q1;
import com.google.android.gms.internal.measurement.k4;
import com.playfy.tv.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class y implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.f0, q1, androidx.lifecycle.s, e5.g {

    /* renamed from: y0, reason: collision with root package name */
    public static final Object f7017y0 = new Object();
    public Bundle A;
    public Boolean B;
    public String C;
    public Bundle D;
    public y E;
    public String F;
    public int G;
    public Boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public int R;
    public p0 S;
    public a0 T;
    public p0 U;
    public y V;
    public int W;
    public int X;
    public String Y;
    public boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f7018a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f7019b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f7020c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f7021d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f7022e0;

    /* renamed from: f0, reason: collision with root package name */
    public ViewGroup f7023f0;

    /* renamed from: g0, reason: collision with root package name */
    public View f7024g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f7025h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f7026i0;

    /* renamed from: j0, reason: collision with root package name */
    public w f7027j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f7028k0;

    /* renamed from: l0, reason: collision with root package name */
    public LayoutInflater f7029l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f7030m0;

    /* renamed from: n0, reason: collision with root package name */
    public String f7031n0;
    public androidx.lifecycle.x o0;

    /* renamed from: p0, reason: collision with root package name */
    public androidx.lifecycle.h0 f7032p0;

    /* renamed from: q0, reason: collision with root package name */
    public x0 f7033q0;

    /* renamed from: r0, reason: collision with root package name */
    public final androidx.lifecycle.q0 f7034r0;

    /* renamed from: s0, reason: collision with root package name */
    public g1 f7035s0;

    /* renamed from: t0, reason: collision with root package name */
    public e5.f f7036t0;

    /* renamed from: u0, reason: collision with root package name */
    public final int f7037u0;

    /* renamed from: v0, reason: collision with root package name */
    public final AtomicInteger f7038v0;

    /* renamed from: w0, reason: collision with root package name */
    public final ArrayList f7039w0;

    /* renamed from: x, reason: collision with root package name */
    public int f7040x;

    /* renamed from: x0, reason: collision with root package name */
    public final t f7041x0;

    /* renamed from: y, reason: collision with root package name */
    public Bundle f7042y;

    /* renamed from: z, reason: collision with root package name */
    public SparseArray f7043z;

    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.o0, androidx.lifecycle.q0] */
    public y() {
        this.f7040x = -1;
        this.C = UUID.randomUUID().toString();
        this.F = null;
        this.H = null;
        this.U = new p0();
        this.f7021d0 = true;
        this.f7026i0 = true;
        new a1.e(this, 6);
        this.o0 = androidx.lifecycle.x.B;
        this.f7034r0 = new androidx.lifecycle.o0();
        this.f7038v0 = new AtomicInteger();
        this.f7039w0 = new ArrayList();
        this.f7041x0 = new t(this);
        k();
    }

    public void A() {
        this.f7022e0 = true;
    }

    public void C(Bundle bundle) {
        this.f7022e0 = true;
    }

    public void D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.U.S();
        this.Q = true;
        this.f7033q0 = new x0(this, getViewModelStore(), new a2.a(this, 28));
        View t10 = t(layoutInflater, viewGroup);
        this.f7024g0 = t10;
        if (t10 != null) {
            this.f7033q0.b();
            if (p0.L(3)) {
                Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.f7024g0 + " for Fragment " + this);
            }
            View view = this.f7024g0;
            x0 x0Var = this.f7033q0;
            kotlin.jvm.internal.k.e(view, "<this>");
            view.setTag(R.id.view_tree_lifecycle_owner, x0Var);
            View view2 = this.f7024g0;
            x0 x0Var2 = this.f7033q0;
            kotlin.jvm.internal.k.e(view2, "<this>");
            view2.setTag(R.id.view_tree_view_model_store_owner, x0Var2);
            View view3 = this.f7024g0;
            x0 x0Var3 = this.f7033q0;
            kotlin.jvm.internal.k.e(view3, "<this>");
            view3.setTag(R.id.view_tree_saved_state_registry_owner, x0Var3);
            this.f7034r0.h(this.f7033q0);
            return;
        }
        if (this.f7033q0.B == null) {
            this.f7033q0 = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    public final i.j E() {
        i.j jVar;
        a0 a0Var = this.T;
        if (a0Var == null) {
            jVar = null;
        } else {
            jVar = a0Var.A;
        }
        if (jVar != null) {
            return jVar;
        }
        throw new IllegalStateException(h8.c.k("Fragment ", this, " not attached to an activity."));
    }

    public final Context F() {
        Context d10 = d();
        if (d10 != null) {
            return d10;
        }
        throw new IllegalStateException(h8.c.k("Fragment ", this, " not attached to a context."));
    }

    public final View G() {
        View view = this.f7024g0;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(h8.c.k("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public final void H() {
        Bundle bundle;
        Bundle bundle2 = this.f7042y;
        if (bundle2 != null && (bundle = bundle2.getBundle("childFragmentManager")) != null) {
            this.U.Y(bundle);
            p0 p0Var = this.U;
            p0Var.H = false;
            p0Var.I = false;
            p0Var.O.f6977g = false;
            p0Var.u(1);
        }
    }

    public final void I(int i6, int i10, int i11, int i12) {
        if (this.f7027j0 == null && i6 == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
            return;
        }
        b().f6996b = i6;
        b().f6997c = i10;
        b().f6998d = i11;
        b().f6999e = i12;
    }

    public final void J(Bundle bundle) {
        boolean Q;
        p0 p0Var = this.S;
        if (p0Var != null) {
            if (p0Var == null) {
                Q = false;
            } else {
                Q = p0Var.Q();
            }
            if (Q) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.D = bundle;
    }

    public final void K() {
        k1.b bVar = k1.c.f7583a;
        k1.c.b(new k1.a(this, "Attempting to set retain instance for fragment " + this));
        k1.c.a(this).getClass();
        this.f7019b0 = true;
        p0 p0Var = this.S;
        if (p0Var != null) {
            p0Var.O.f(this);
        } else {
            this.f7020c0 = true;
        }
    }

    public final void L(boolean z10) {
        k1.b bVar = k1.c.f7583a;
        k1.c.b(new k1.a(this, "Attempting to set user visible hint to " + z10 + " for fragment " + this));
        k1.c.a(this).getClass();
        boolean z11 = false;
        if (!this.f7026i0 && z10 && this.f7040x < 5 && this.S != null && m() && this.f7030m0) {
            p0 p0Var = this.S;
            v0 g10 = p0Var.g(this);
            y yVar = g10.f6992c;
            if (yVar.f7025h0) {
                if (p0Var.f6944b) {
                    p0Var.K = true;
                } else {
                    yVar.f7025h0 = false;
                    g10.k();
                }
            }
        }
        this.f7026i0 = z10;
        if (this.f7040x < 5 && !z10) {
            z11 = true;
        }
        this.f7025h0 = z11;
        if (this.f7042y != null) {
            this.B = Boolean.valueOf(z10);
        }
    }

    public final void M(Intent intent) {
        a0 a0Var = this.T;
        if (a0Var != null) {
            kotlin.jvm.internal.k.e(intent, "intent");
            a0Var.B.startActivity(intent, null);
            return;
        }
        throw new IllegalStateException(h8.c.k("Fragment ", this, " not attached to Activity"));
    }

    public k4 a() {
        return new u(this);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [j1.w, java.lang.Object] */
    public final w b() {
        if (this.f7027j0 == null) {
            ?? obj = new Object();
            Object obj2 = f7017y0;
            obj.f7001g = obj2;
            obj.f7002h = obj2;
            obj.f7003i = obj2;
            obj.j = 1.0f;
            obj.f7004k = null;
            this.f7027j0 = obj;
        }
        return this.f7027j0;
    }

    public final p0 c() {
        if (this.T != null) {
            return this.U;
        }
        throw new IllegalStateException(h8.c.k("Fragment ", this, " has not been attached yet."));
    }

    public final Context d() {
        a0 a0Var = this.T;
        if (a0Var == null) {
            return null;
        }
        return a0Var.B;
    }

    public final LayoutInflater e() {
        LayoutInflater layoutInflater = this.f7029l0;
        if (layoutInflater == null) {
            LayoutInflater w10 = w(null);
            this.f7029l0 = w10;
            return w10;
        }
        return layoutInflater;
    }

    public final int f() {
        androidx.lifecycle.x xVar = this.o0;
        if (xVar != androidx.lifecycle.x.f992y && this.V != null) {
            return Math.min(xVar.ordinal(), this.V.f());
        }
        return xVar.ordinal();
    }

    public final p0 g() {
        p0 p0Var = this.S;
        if (p0Var != null) {
            return p0Var;
        }
        throw new IllegalStateException(h8.c.k("Fragment ", this, " not associated with a fragment manager."));
    }

    @Override // androidx.lifecycle.s
    public final o1.c getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = F().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        if (application == null && p0.L(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + F().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        o1.e eVar = new o1.e(0);
        LinkedHashMap linkedHashMap = eVar.f9848a;
        if (application != null) {
            linkedHashMap.put(m1.f960e, application);
        }
        linkedHashMap.put(d1.f902a, this);
        linkedHashMap.put(d1.f903b, this);
        Bundle bundle = this.D;
        if (bundle != null) {
            linkedHashMap.put(d1.f904c, bundle);
        }
        return eVar;
    }

    @Override // androidx.lifecycle.s
    public final n1 getDefaultViewModelProviderFactory() {
        Application application;
        if (this.S != null) {
            if (this.f7035s0 == null) {
                Context applicationContext = F().getApplicationContext();
                while (true) {
                    if (applicationContext instanceof ContextWrapper) {
                        if (applicationContext instanceof Application) {
                            application = (Application) applicationContext;
                            break;
                        }
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    } else {
                        application = null;
                        break;
                    }
                }
                if (application == null && p0.L(3)) {
                    Log.d("FragmentManager", "Could not find Application instance from Context " + F().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                this.f7035s0 = new g1(application, this, this.D);
            }
            return this.f7035s0;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // androidx.lifecycle.f0
    public final androidx.lifecycle.y getLifecycle() {
        return this.f7032p0;
    }

    @Override // e5.g
    public final e5.e getSavedStateRegistry() {
        return this.f7036t0.f4357b;
    }

    @Override // androidx.lifecycle.q1
    public final p1 getViewModelStore() {
        if (this.S != null) {
            if (f() != 1) {
                HashMap hashMap = this.S.O.f6974d;
                p1 p1Var = (p1) hashMap.get(this.C);
                if (p1Var == null) {
                    p1 p1Var2 = new p1();
                    hashMap.put(this.C, p1Var2);
                    return p1Var2;
                }
                return p1Var;
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final Resources h() {
        return F().getResources();
    }

    public final String i(int i6) {
        return h().getString(i6);
    }

    public final x0 j() {
        x0 x0Var = this.f7033q0;
        if (x0Var != null) {
            return x0Var;
        }
        throw new IllegalStateException(h8.c.k("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    public final void k() {
        this.f7032p0 = new androidx.lifecycle.h0(this);
        this.f7036t0 = new e5.f(new f5.b(this, new androidx.lifecycle.i(this, 3)));
        this.f7035s0 = null;
        ArrayList arrayList = this.f7039w0;
        t tVar = this.f7041x0;
        if (!arrayList.contains(tVar)) {
            if (this.f7040x >= 0) {
                tVar.a();
            } else {
                arrayList.add(tVar);
            }
        }
    }

    public final void l() {
        k();
        this.f7031n0 = this.C;
        this.C = UUID.randomUUID().toString();
        this.I = false;
        this.J = false;
        this.M = false;
        this.N = false;
        this.P = false;
        this.R = 0;
        this.S = null;
        this.U = new p0();
        this.T = null;
        this.W = 0;
        this.X = 0;
        this.Y = null;
        this.Z = false;
        this.f7018a0 = false;
    }

    public final boolean m() {
        if (this.T != null && this.I) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        boolean n10;
        if (!this.Z) {
            p0 p0Var = this.S;
            if (p0Var != null) {
                y yVar = this.V;
                p0Var.getClass();
                if (yVar == null) {
                    n10 = false;
                } else {
                    n10 = yVar.n();
                }
                if (n10) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean o() {
        if (this.R > 0) {
            return true;
        }
        return false;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f7022e0 = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        E().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f7022e0 = true;
    }

    public void p() {
        this.f7022e0 = true;
    }

    public void q(int i6, int i10, Intent intent) {
        if (p0.L(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i6 + " resultCode: " + i10 + " data: " + intent);
        }
    }

    public void r(Context context) {
        i.j jVar;
        this.f7022e0 = true;
        a0 a0Var = this.T;
        if (a0Var == null) {
            jVar = null;
        } else {
            jVar = a0Var.A;
        }
        if (jVar != null) {
            this.f7022e0 = true;
        }
    }

    public void s(Bundle bundle) {
        this.f7022e0 = true;
        H();
        p0 p0Var = this.U;
        if (p0Var.f6962v >= 1) {
            return;
        }
        p0Var.H = false;
        p0Var.I = false;
        p0Var.O.f6977g = false;
        p0Var.u(1);
    }

    public View t(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i6 = this.f7037u0;
        if (i6 != 0) {
            return layoutInflater.inflate(i6, viewGroup, false);
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} (");
        sb2.append(this.C);
        if (this.W != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.W));
        }
        if (this.Y != null) {
            sb2.append(" tag=");
            sb2.append(this.Y);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public void u() {
        this.f7022e0 = true;
    }

    public void v() {
        this.f7022e0 = true;
    }

    public LayoutInflater w(Bundle bundle) {
        a0 a0Var = this.T;
        if (a0Var != null) {
            i.j jVar = a0Var.E;
            LayoutInflater cloneInContext = jVar.getLayoutInflater().cloneInContext(jVar);
            cloneInContext.setFactory2(this.U.f6948f);
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void x(Context context, AttributeSet attributeSet, Bundle bundle) {
        i.j jVar;
        this.f7022e0 = true;
        a0 a0Var = this.T;
        if (a0Var == null) {
            jVar = null;
        } else {
            jVar = a0Var.A;
        }
        if (jVar != null) {
            this.f7022e0 = true;
        }
    }

    public void z() {
        this.f7022e0 = true;
    }

    public y(int i6) {
        this();
        this.f7037u0 = i6;
    }

    public void y(Bundle bundle) {
    }

    public void B(View view, Bundle bundle) {
    }
}
