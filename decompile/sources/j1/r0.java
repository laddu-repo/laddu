package j1;

import android.util.Log;
import androidx.lifecycle.k1;
import androidx.lifecycle.p1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r0 extends k1 {

    /* renamed from: h, reason: collision with root package name */
    public static final androidx.lifecycle.c1 f6971h = new androidx.lifecycle.c1(2);

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6975e;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f6972b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f6973c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f6974d = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public boolean f6976f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6977g = false;

    public r0(boolean z10) {
        this.f6975e = z10;
    }

    @Override // androidx.lifecycle.k1
    public final void e() {
        if (p0.L(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f6976f = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r0.class == obj.getClass()) {
            r0 r0Var = (r0) obj;
            if (this.f6972b.equals(r0Var.f6972b) && this.f6973c.equals(r0Var.f6973c) && this.f6974d.equals(r0Var.f6974d)) {
                return true;
            }
        }
        return false;
    }

    public final void f(y yVar) {
        if (this.f6977g) {
            if (p0.L(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        String str = yVar.C;
        HashMap hashMap = this.f6972b;
        if (!hashMap.containsKey(str)) {
            hashMap.put(yVar.C, yVar);
            if (p0.L(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + yVar);
            }
        }
    }

    public final void g(y yVar, boolean z10) {
        if (p0.L(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + yVar);
        }
        i(yVar.C, z10);
    }

    public final void h(String str, boolean z10) {
        if (p0.L(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        i(str, z10);
    }

    public final int hashCode() {
        return this.f6974d.hashCode() + ((this.f6973c.hashCode() + (this.f6972b.hashCode() * 31)) * 31);
    }

    public final void i(String str, boolean z10) {
        HashMap hashMap = this.f6973c;
        r0 r0Var = (r0) hashMap.get(str);
        if (r0Var != null) {
            if (z10) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r0Var.f6973c.keySet());
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    r0Var.h((String) obj, true);
                }
            }
            r0Var.e();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.f6974d;
        p1 p1Var = (p1) hashMap2.get(str);
        if (p1Var != null) {
            p1Var.a();
            hashMap2.remove(str);
        }
    }

    public final void j(y yVar) {
        if (this.f6977g) {
            if (p0.L(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.f6972b.remove(yVar.C) != null && p0.L(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + yVar);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator it = this.f6972b.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator it2 = this.f6973c.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append((String) it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator it3 = this.f6974d.keySet().iterator();
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
