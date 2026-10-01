package w4;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f14074a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f14075b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f14076c;

    /* renamed from: d, reason: collision with root package name */
    public final List f14077d;

    /* renamed from: e, reason: collision with root package name */
    public int f14078e;

    /* renamed from: f, reason: collision with root package name */
    public int f14079f;

    /* renamed from: g, reason: collision with root package name */
    public x0 f14080g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f14081h;

    public y0(RecyclerView recyclerView) {
        this.f14081h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f14074a = arrayList;
        this.f14075b = null;
        this.f14076c = new ArrayList();
        this.f14077d = Collections.unmodifiableList(arrayList);
        this.f14078e = 2;
        this.f14079f = 2;
    }

    public final void a(i1 i1Var, boolean z10) {
        t0.b bVar;
        RecyclerView.j(i1Var);
        View view = i1Var.f13897a;
        RecyclerView recyclerView = this.f14081h;
        k1 k1Var = recyclerView.K0;
        if (k1Var != null) {
            j1 j1Var = k1Var.f13933e;
            if (j1Var != null) {
                bVar = (t0.b) j1Var.f13922e.remove(view);
            } else {
                bVar = null;
            }
            t0.q0.r(view, bVar);
        }
        if (z10) {
            ArrayList arrayList = recyclerView.L;
            if (arrayList.size() <= 0) {
                k0 k0Var = recyclerView.J;
                if (k0Var != null) {
                    k0Var.g(i1Var);
                }
                if (recyclerView.D0 != null) {
                    recyclerView.D.v(i1Var);
                }
            } else {
                throw h8.c.h(0, arrayList);
            }
        }
        i1Var.s = null;
        i1Var.f13913r = null;
        x0 c10 = c();
        c10.getClass();
        int i6 = i1Var.f13902f;
        ArrayList arrayList2 = c10.a(i6).f14056a;
        if (((w0) c10.f14062a.get(i6)).f14057b <= arrayList2.size()) {
            a8.e.e(view);
        } else {
            i1Var.n();
            arrayList2.add(i1Var);
        }
    }

    public final int b(int i6) {
        RecyclerView recyclerView = this.f14081h;
        if (i6 >= 0 && i6 < recyclerView.D0.b()) {
            if (!recyclerView.D0.f13863g) {
                return i6;
            }
            return recyclerView.B.h(i6, 0);
        }
        StringBuilder n10 = h8.c.n(i6, "invalid position ", ". State item count is ");
        n10.append(recyclerView.D0.b());
        n10.append(recyclerView.z());
        throw new IndexOutOfBoundsException(n10.toString());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, w4.x0] */
    public final x0 c() {
        if (this.f14080g == null) {
            ?? obj = new Object();
            obj.f14062a = new SparseArray();
            obj.f14063b = 0;
            obj.f14064c = Collections.newSetFromMap(new IdentityHashMap());
            this.f14080g = obj;
            e();
        }
        return this.f14080g;
    }

    public final View d(int i6) {
        return l(i6, Long.MAX_VALUE).f13897a;
    }

    public final void e() {
        RecyclerView recyclerView;
        k0 k0Var;
        x0 x0Var = this.f14080g;
        if (x0Var != null && (k0Var = (recyclerView = this.f14081h).J) != null && recyclerView.P) {
            x0Var.f14064c.add(k0Var);
        }
    }

    public final void f(k0 k0Var, boolean z10) {
        x0 x0Var = this.f14080g;
        if (x0Var != null) {
            SparseArray sparseArray = x0Var.f14062a;
            Set set = x0Var.f14064c;
            set.remove(k0Var);
            if (set.size() == 0 && !z10) {
                for (int i6 = 0; i6 < sparseArray.size(); i6++) {
                    ArrayList arrayList = ((w0) sparseArray.get(sparseArray.keyAt(i6))).f14056a;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        a8.e.e(((i1) arrayList.get(i10)).f13897a);
                    }
                }
            }
        }
    }

    public final void g() {
        ArrayList arrayList = this.f14076c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h(size);
        }
        arrayList.clear();
        if (RecyclerView.f1119a1) {
            v.h hVar = this.f14081h.C0;
            int[] iArr = hVar.f13158c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            hVar.f13159d = 0;
        }
    }

    public final void h(int i6) {
        ArrayList arrayList = this.f14076c;
        a((i1) arrayList.get(i6), true);
        arrayList.remove(i6);
    }

    public final void i(View view) {
        i1 J = RecyclerView.J(view);
        boolean k8 = J.k();
        RecyclerView recyclerView = this.f14081h;
        if (k8) {
            recyclerView.removeDetachedView(view, false);
        }
        if (J.j()) {
            J.f13909n.m(J);
        } else if (J.q()) {
            J.j &= -33;
        }
        j(J);
        if (recyclerView.f1133l0 != null && !J.h()) {
            recyclerView.f1133l0.d(J);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x008f, code lost:
    
        r7 = r7 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(w4.i1 r13) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.y0.j(w4.i1):void");
    }

    public final void k(View view) {
        o0 o0Var;
        i1 J = RecyclerView.J(view);
        int i6 = J.j & 12;
        RecyclerView recyclerView = this.f14081h;
        if (i6 == 0 && J.l() && (o0Var = recyclerView.f1133l0) != null) {
            m mVar = (m) o0Var;
            if (J.d().isEmpty() && mVar.f13941g && !J.g()) {
                if (this.f14075b == null) {
                    this.f14075b = new ArrayList();
                }
                J.f13909n = this;
                J.f13910o = true;
                this.f14075b.add(J);
                return;
            }
        }
        if (J.g() && !J.i() && !recyclerView.J.f13930y) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.z());
        }
        J.f13909n = this;
        J.f13910o = false;
        this.f14074a.add(J);
    }

    /* JADX WARN: Code restructure failed: missing block: B:200:0x0428, code lost:
    
        if (r10.g() == false) goto L244;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0543 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0080  */
    /* JADX WARN: Type inference failed for: r6v39, types: [b2.j, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final w4.i1 l(int r29, long r30) {
        /*
            Method dump skipped, instructions count: 1387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.y0.l(int, long):w4.i1");
    }

    public final void m(i1 i1Var) {
        if (i1Var.f13910o) {
            this.f14075b.remove(i1Var);
        } else {
            this.f14074a.remove(i1Var);
        }
        i1Var.f13909n = null;
        i1Var.f13910o = false;
        i1Var.j &= -33;
    }

    public final void n() {
        int i6;
        s0 s0Var = this.f14081h.K;
        if (s0Var != null) {
            i6 = s0Var.j;
        } else {
            i6 = 0;
        }
        this.f14079f = this.f14078e + i6;
        ArrayList arrayList = this.f14076c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f14079f; size--) {
            h(size);
        }
    }
}
