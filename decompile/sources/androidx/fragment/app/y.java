package androidx.fragment.app;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class y implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.s, androidx.lifecycle.u0, androidx.lifecycle.i, u4.d {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final Object f1133s0 = new Object();
    public Bundle B;
    public y C;
    public int E;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;
    public q0 N;
    public c0 O;
    public y Q;
    public int R;
    public int S;
    public String T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public ViewGroup f1134a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public View f1135b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f1136c0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public w f1138e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f1139f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public LayoutInflater f1140g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f1141h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public String f1142i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public androidx.lifecycle.n f1143j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public androidx.lifecycle.u f1144k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public z0 f1145l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final androidx.lifecycle.y f1146m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public androidx.lifecycle.m0 f1147n0;
    public com.bumptech.glide.manager.t o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AtomicInteger f1148p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ArrayList f1149q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final s f1150r0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Bundle f1152w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public SparseArray f1153x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Bundle f1154y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Boolean f1155z;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1151v = -1;
    public String A = UUID.randomUUID().toString();
    public String D = null;
    public Boolean F = null;
    public q0 P = new q0();
    public boolean Y = true;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f1137d0 = true;

    public y() {
        new m(1, this);
        this.f1143j0 = androidx.lifecycle.n.f1221z;
        this.f1146m0 = new androidx.lifecycle.y();
        this.f1148p0 = new AtomicInteger();
        this.f1149q0 = new ArrayList();
        this.f1150r0 = new s(this);
        n();
    }

    public void A() {
        this.Z = true;
    }

    public void C() {
        this.Z = true;
    }

    public void D() {
        this.Z = true;
    }

    public void F(Bundle bundle) {
        this.Z = true;
    }

    public void G(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.P.P();
        this.L = true;
        this.f1145l0 = new z0(this, e(), new androidx.emoji2.text.v(1, this));
        View viewW = w(layoutInflater, viewGroup);
        this.f1135b0 = viewW;
        if (viewW == null) {
            if (this.f1145l0.f1169z != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f1145l0 = null;
            return;
        }
        this.f1145l0.g();
        if (q0.I(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.f1135b0 + " for Fragment " + this);
        }
        View view = this.f1135b0;
        z0 z0Var = this.f1145l0;
        de.i.e(view, "<this>");
        view.setTag(q1.a.view_tree_lifecycle_owner, z0Var);
        View view2 = this.f1135b0;
        z0 z0Var2 = this.f1145l0;
        de.i.e(view2, "<this>");
        view2.setTag(r1.d.view_tree_view_model_store_owner, z0Var2);
        View view3 = this.f1135b0;
        z0 z0Var3 = this.f1145l0;
        de.i.e(view3, "<this>");
        view3.setTag(u4.a.view_tree_saved_state_registry_owner, z0Var3);
        this.f1146m0.e(this.f1145l0);
    }

    public final h.j H() {
        h.j jVarH = h();
        if (jVarH != null) {
            return jVarH;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Context I() {
        Context contextJ = j();
        if (contextJ != null) {
            return contextJ;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View J() {
        View view = this.f1135b0;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void K(int i, int i10, int i11, int i12) {
        if (this.f1138e0 == null && i == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
            return;
        }
        g().f1118b = i;
        g().f1119c = i10;
        g().f1120d = i11;
        g().f1121e = i12;
    }

    public final void L(Bundle bundle) {
        q0 q0Var = this.N;
        if (q0Var != null) {
            if (q0Var == null ? false : q0Var.N()) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.B = bundle;
    }

    public final void M() {
        n1.b bVar = n1.c.f8966a;
        n1.c.b(new n1.a(this, "Attempting to set retain instance for fragment " + this));
        n1.c.a(this).getClass();
        this.W = true;
        q0 q0Var = this.N;
        if (q0Var != null) {
            q0Var.L.c(this);
        } else {
            this.X = true;
        }
    }

    public final void N(boolean z2) {
        n1.b bVar = n1.c.f8966a;
        n1.c.b(new n1.a(this, "Attempting to set user visible hint to " + z2 + " for fragment " + this));
        n1.c.a(this).getClass();
        boolean z10 = false;
        if (!this.f1137d0 && z2 && this.f1151v < 5 && this.N != null && p() && this.f1141h0) {
            q0 q0Var = this.N;
            x0 x0VarF = q0Var.f(this);
            y yVar = x0VarF.f1130c;
            if (yVar.f1136c0) {
                if (q0Var.f1069b) {
                    q0Var.H = true;
                } else {
                    yVar.f1136c0 = false;
                    x0VarF.k();
                }
            }
        }
        this.f1137d0 = z2;
        if (this.f1151v < 5 && !z2) {
            z10 = true;
        }
        this.f1136c0 = z10;
        if (this.f1152w != null) {
            this.f1155z = Boolean.valueOf(z2);
        }
    }

    public final void O(Intent intent) {
        c0 c0Var = this.O;
        if (c0Var != null) {
            c0Var.f988y.startActivity(intent, null);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Override // u4.d
    public final o.r a() {
        return (o.r) this.o0.f2439y;
    }

    public z7.b b() {
        return new t(this);
    }

    @Override // androidx.lifecycle.i
    public final androidx.lifecycle.r0 c() {
        Application application;
        if (this.N == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.f1147n0 == null) {
            Context applicationContext = I().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && q0.I(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + I().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.f1147n0 = new androidx.lifecycle.m0(application, this, this.B);
        }
        return this.f1147n0;
    }

    @Override // androidx.lifecycle.i
    public final r1.c d() {
        Application application;
        Context applicationContext = I().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && q0.I(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + I().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        r1.c cVar = new r1.c(0);
        LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.f2053w;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.p0.f1228a, application);
        }
        linkedHashMap.put(androidx.lifecycle.i0.f1201a, this);
        linkedHashMap.put(androidx.lifecycle.i0.f1202b, this);
        Bundle bundle = this.B;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.i0.f1203c, bundle);
        }
        return cVar;
    }

    @Override // androidx.lifecycle.u0
    public final androidx.lifecycle.t0 e() {
        if (this.N == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (k() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.N.L.f;
        androidx.lifecycle.t0 t0Var = (androidx.lifecycle.t0) map.get(this.A);
        if (t0Var != null) {
            return t0Var;
        }
        androidx.lifecycle.t0 t0Var2 = new androidx.lifecycle.t0();
        map.put(this.A, t0Var2);
        return t0Var2;
    }

    @Override // androidx.lifecycle.s
    public final androidx.lifecycle.u f() {
        return this.f1144k0;
    }

    public final w g() {
        if (this.f1138e0 == null) {
            w wVar = new w();
            Object obj = f1133s0;
            wVar.f1122g = obj;
            wVar.f1123h = obj;
            wVar.i = obj;
            wVar.f1124j = 1.0f;
            wVar.f1125k = null;
            this.f1138e0 = wVar;
        }
        return this.f1138e0;
    }

    public final h.j h() {
        c0 c0Var = this.O;
        if (c0Var == null) {
            return null;
        }
        return c0Var.f987x;
    }

    public final q0 i() {
        if (this.O != null) {
            return this.P;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context j() {
        c0 c0Var = this.O;
        if (c0Var == null) {
            return null;
        }
        return c0Var.f988y;
    }

    public final int k() {
        androidx.lifecycle.n nVar = this.f1143j0;
        return (nVar == androidx.lifecycle.n.f1218w || this.Q == null) ? nVar.ordinal() : Math.min(nVar.ordinal(), this.Q.k());
    }

    public final q0 l() {
        q0 q0Var = this.N;
        if (q0Var != null) {
            return q0Var;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final Resources m() {
        return I().getResources();
    }

    public final void n() {
        this.f1144k0 = new androidx.lifecycle.u(this);
        this.o0 = new com.bumptech.glide.manager.t(this);
        this.f1147n0 = null;
        ArrayList arrayList = this.f1149q0;
        s sVar = this.f1150r0;
        if (arrayList.contains(sVar)) {
            return;
        }
        if (this.f1151v >= 0) {
            sVar.a();
        } else {
            arrayList.add(sVar);
        }
    }

    public final void o() {
        n();
        this.f1142i0 = this.A;
        this.A = UUID.randomUUID().toString();
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = false;
        this.M = 0;
        this.N = null;
        this.P = new q0();
        this.O = null;
        this.R = 0;
        this.S = 0;
        this.T = null;
        this.U = false;
        this.V = false;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.Z = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        H().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.Z = true;
    }

    public final boolean p() {
        return this.O != null && this.G;
    }

    public final boolean q() {
        if (this.U) {
            return true;
        }
        q0 q0Var = this.N;
        if (q0Var != null) {
            y yVar = this.Q;
            q0Var.getClass();
            if (yVar == null ? false : yVar.q()) {
                return true;
            }
        }
        return false;
    }

    public final boolean r() {
        return this.M > 0;
    }

    public void s() {
        this.Z = true;
    }

    public void t(int i, int i10, Intent intent) {
        if (q0.I(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i10 + " data: " + intent);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} (");
        sb2.append(this.A);
        if (this.R != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.R));
        }
        if (this.T != null) {
            sb2.append(" tag=");
            sb2.append(this.T);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public void u(Context context) {
        this.Z = true;
        c0 c0Var = this.O;
        if ((c0Var == null ? null : c0Var.f987x) != null) {
            this.Z = true;
        }
    }

    public void v(Bundle bundle) {
        Bundle bundle2;
        this.Z = true;
        Bundle bundle3 = this.f1152w;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.P.V(bundle2);
            q0 q0Var = this.P;
            q0Var.E = false;
            q0Var.F = false;
            q0Var.L.i = false;
            q0Var.t(1);
        }
        q0 q0Var2 = this.P;
        if (q0Var2.f1084s >= 1) {
            return;
        }
        q0Var2.E = false;
        q0Var2.F = false;
        q0Var2.L.i = false;
        q0Var2.t(1);
    }

    public View w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void x() {
        this.Z = true;
    }

    public void y() {
        this.Z = true;
    }

    public LayoutInflater z(Bundle bundle) {
        c0 c0Var = this.O;
        if (c0Var == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        h.j jVar = c0Var.B;
        LayoutInflater layoutInflaterCloneInContext = jVar.getLayoutInflater().cloneInContext(jVar);
        layoutInflaterCloneInContext.setFactory2(this.P.f);
        return layoutInflaterCloneInContext;
    }

    public void E() {
    }

    public void B(Bundle bundle) {
    }
}
