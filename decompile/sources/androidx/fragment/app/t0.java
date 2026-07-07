package androidx.fragment.app;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends androidx.lifecycle.o0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final s0 f1101j = new s0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f1104g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f1102d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f1103e = new HashMap();
    public final HashMap f = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1105h = false;
    public boolean i = false;

    public t0(boolean z2) {
        this.f1104g = z2;
    }

    @Override // androidx.lifecycle.o0
    public final void b() {
        if (q0.I(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f1105h = true;
    }

    public final void c(y yVar) {
        if (this.i) {
            if (q0.I(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        String str = yVar.A;
        HashMap map = this.f1102d;
        if (map.containsKey(str)) {
            return;
        }
        map.put(yVar.A, yVar);
        if (q0.I(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + yVar);
        }
    }

    public final void d(y yVar) {
        if (q0.I(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + yVar);
        }
        e(yVar.A);
    }

    public final void e(String str) {
        HashMap map = this.f1103e;
        t0 t0Var = (t0) map.get(str);
        if (t0Var != null) {
            t0Var.b();
            map.remove(str);
        }
        HashMap map2 = this.f;
        androidx.lifecycle.t0 t0Var2 = (androidx.lifecycle.t0) map2.get(str);
        if (t0Var2 != null) {
            t0Var2.a();
            map2.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t0.class == obj.getClass()) {
            t0 t0Var = (t0) obj;
            if (this.f1102d.equals(t0Var.f1102d) && this.f1103e.equals(t0Var.f1103e) && this.f.equals(t0Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final void f(y yVar) {
        if (this.i) {
            if (q0.I(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f1102d.remove(yVar.A) == null || !q0.I(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + yVar);
        }
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.f1103e.hashCode() + (this.f1102d.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator it = this.f1102d.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator it2 = this.f1103e.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append((String) it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator it3 = this.f.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append((String) it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
