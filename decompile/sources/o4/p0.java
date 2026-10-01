package o4;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f9830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f9831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f9832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f9833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9834e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o0 f9835g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f9836h;

    public p0(RecyclerView recyclerView) {
        this.f9836h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f9830a = arrayList;
        this.f9831b = null;
        this.f9832c = new ArrayList();
        this.f9833d = Collections.unmodifiableList(arrayList);
        this.f9834e = 2;
        this.f = 2;
    }

    public final void a(z0 z0Var, boolean z2) {
        RecyclerView.l(z0Var);
        View view = z0Var.f9910a;
        RecyclerView recyclerView = this.f9836h;
        b1 b1Var = recyclerView.I0;
        if (b1Var != null) {
            a1 a1Var = b1Var.f9684e;
            t0.m0.n(view, a1Var != null ? (t0.b) a1Var.f9676e.remove(view) : null);
        }
        if (z2) {
            ArrayList arrayList = recyclerView.J;
            if (arrayList.size() > 0) {
                throw d0.d.f(0, arrayList);
            }
            b0 b0Var = recyclerView.H;
            if (b0Var != null) {
                b0Var.f(z0Var);
            }
            if (recyclerView.B0 != null) {
                recyclerView.B.I(z0Var);
            }
            if (RecyclerView.X0) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + z0Var);
            }
        }
        z0Var.f9926s = null;
        z0Var.f9925r = null;
        o0 o0VarC = c();
        o0VarC.getClass();
        int i = z0Var.f;
        ArrayList arrayList2 = o0VarC.a(i).f9822a;
        if (((n0) o0VarC.f9826a.get(i)).f9823b <= arrayList2.size()) {
            z0.a.a(view);
        } else {
            if (RecyclerView.W0 && arrayList2.contains(z0Var)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            z0Var.m();
            arrayList2.add(z0Var);
        }
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.f9836h;
        if (i >= 0 && i < recyclerView.B0.b()) {
            return !recyclerView.B0.f9889g ? i : recyclerView.f1400z.u(i, 0);
        }
        StringBuilder sbO = d0.d.o(i, "invalid position ", ". State item count is ");
        sbO.append(recyclerView.B0.b());
        sbO.append(recyclerView.B());
        throw new IndexOutOfBoundsException(sbO.toString());
    }

    public final o0 c() {
        if (this.f9835g == null) {
            o0 o0Var = new o0();
            o0Var.f9826a = new SparseArray();
            o0Var.f9827b = 0;
            o0Var.f9828c = Collections.newSetFromMap(new IdentityHashMap());
            this.f9835g = o0Var;
            e();
        }
        return this.f9835g;
    }

    public final View d(int i) {
        return l(i, Long.MAX_VALUE).f9910a;
    }

    public final void e() {
        RecyclerView recyclerView;
        b0 b0Var;
        o0 o0Var = this.f9835g;
        if (o0Var == null || (b0Var = (recyclerView = this.f9836h).H) == null || !recyclerView.N) {
            return;
        }
        o0Var.f9828c.add(b0Var);
    }

    public final void f(b0 b0Var, boolean z2) {
        o0 o0Var = this.f9835g;
        if (o0Var != null) {
            SparseArray sparseArray = o0Var.f9826a;
            Set set = o0Var.f9828c;
            set.remove(b0Var);
            if (set.size() != 0 || z2) {
                return;
            }
            for (int i = 0; i < sparseArray.size(); i++) {
                ArrayList arrayList = ((n0) sparseArray.get(sparseArray.keyAt(i))).f9822a;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    z0.a.a(((z0) arrayList.get(i10)).f9910a);
                }
            }
        }
    }

    public final void g() {
        ArrayList arrayList = this.f9832c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h(size);
        }
        arrayList.clear();
        if (RecyclerView.f1370b1) {
            l lVar = this.f9836h.A0;
            int[] iArr = lVar.f9808a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            lVar.f9811d = 0;
        }
    }

    public final void h(int i) {
        if (RecyclerView.X0) {
            Log.d("RecyclerView", "Recycling cached view at index " + i);
        }
        ArrayList arrayList = this.f9832c;
        z0 z0Var = (z0) arrayList.get(i);
        if (RecyclerView.X0) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + z0Var);
        }
        a(z0Var, true);
        arrayList.remove(i);
    }

    public final void i(View view) {
        z0 z0VarM = RecyclerView.M(view);
        boolean zJ = z0VarM.j();
        RecyclerView recyclerView = this.f9836h;
        if (zJ) {
            recyclerView.removeDetachedView(view, false);
        }
        if (z0VarM.i()) {
            z0VarM.f9921n.m(z0VarM);
        } else if (z0VarM.p()) {
            z0VarM.f9917j &= -33;
        }
        j(z0VarM);
        if (recyclerView.f1381j0 == null || z0VarM.g()) {
            return;
        }
        recyclerView.f1381j0.d(z0VarM);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ae, code lost:
    
        r6 = r6 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(o4.z0 r13) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.p0.j(o4.z0):void");
    }

    public final void k(View view) {
        g0 g0Var;
        z0 z0VarM = RecyclerView.M(view);
        int i = z0VarM.f9917j & 12;
        RecyclerView recyclerView = this.f9836h;
        if (i == 0 && z0VarM.k() && (g0Var = recyclerView.f1381j0) != null) {
            h hVar = (h) g0Var;
            if (z0VarM.c().isEmpty() && hVar.f9734g && !z0VarM.f()) {
                if (this.f9831b == null) {
                    this.f9831b = new ArrayList();
                }
                z0VarM.f9921n = this;
                z0VarM.f9922o = true;
                this.f9831b.add(z0VarM);
                return;
            }
        }
        if (z0VarM.f() && !z0VarM.h() && !recyclerView.H.f9681b) {
            throw new IllegalArgumentException(d0.d.j(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        z0VarM.f9921n = this;
        z0VarM.f9922o = false;
        this.f9830a.add(z0VarM);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v72 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o4.z0 l(int r29, long r30) {
        /*
            Method dump skipped, instruction units count: 1672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.p0.l(int, long):o4.z0");
    }

    public final void m(z0 z0Var) {
        if (z0Var.f9922o) {
            this.f9831b.remove(z0Var);
        } else {
            this.f9830a.remove(z0Var);
        }
        z0Var.f9921n = null;
        z0Var.f9922o = false;
        z0Var.f9917j &= -33;
    }

    public final void n() {
        j0 j0Var = this.f9836h.I;
        this.f = this.f9834e + (j0Var != null ? j0Var.f9770j : 0);
        ArrayList arrayList = this.f9832c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f; size--) {
            h(size);
        }
    }
}
