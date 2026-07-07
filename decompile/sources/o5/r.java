package o5;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import com.google.android.gms.internal.measurement.a4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import okhttp3.HttpUrl;
import t0.q0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class r implements Cloneable {
    public static final Animator[] V = new Animator[0];
    public static final int[] W = {2, 1, 3, 4};
    public static final n9.a0 X = new n9.a0(29);
    public static final ThreadLocal Y = new ThreadLocal();
    public ArrayList H;
    public ArrayList I;
    public o[] J;
    public long T;
    public long U;

    /* renamed from: x, reason: collision with root package name */
    public final String f9987x = getClass().getName();

    /* renamed from: y, reason: collision with root package name */
    public long f9988y = -1;

    /* renamed from: z, reason: collision with root package name */
    public long f9989z = -1;
    public TimeInterpolator A = null;
    public final ArrayList B = new ArrayList();
    public final ArrayList C = new ArrayList();
    public c6.h D = new c6.h(11);
    public c6.h E = new c6.h(11);
    public a F = null;
    public final int[] G = W;
    public final ArrayList K = new ArrayList();
    public Animator[] L = V;
    public int M = 0;
    public boolean N = false;
    public boolean O = false;
    public r P = null;
    public ArrayList Q = null;
    public ArrayList R = new ArrayList();
    public n9.a0 S = X;

    public static void b(c6.h hVar, View view, z zVar) {
        v.e eVar = (v.e) hVar.f1981x;
        v.e eVar2 = (v.e) hVar.A;
        SparseArray sparseArray = (SparseArray) hVar.f1982y;
        v.i iVar = (v.i) hVar.f1983z;
        eVar.put(view, zVar);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (sparseArray.indexOfKey(id2) >= 0) {
                sparseArray.put(id2, null);
            } else {
                sparseArray.put(id2, view);
            }
        }
        WeakHashMap weakHashMap = q0.f12397a;
        String f3 = t0.h0.f(view);
        if (f3 != null) {
            if (eVar2.containsKey(f3)) {
                eVar2.put(f3, null);
            } else {
                eVar2.put(f3, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (iVar.f(itemIdAtPosition) >= 0) {
                    View view2 = (View) iVar.d(itemIdAtPosition);
                    if (view2 != null) {
                        view2.setHasTransientState(false);
                        iVar.h(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                iVar.h(itemIdAtPosition, view);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [v.l, java.lang.Object, v.e] */
    public static v.e o() {
        ThreadLocal threadLocal = Y;
        v.e eVar = (v.e) threadLocal.get();
        if (eVar == null) {
            ?? lVar = new v.l(0);
            threadLocal.set(lVar);
            return lVar;
        }
        return eVar;
    }

    public static boolean u(z zVar, z zVar2, String str) {
        Object obj = zVar.f10000a.get(str);
        Object obj2 = zVar2.f10000a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A() {
        I();
        v.e o10 = o();
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            Animator animator = (Animator) obj;
            if (o10.containsKey(animator)) {
                I();
                if (animator != null) {
                    animator.addListener(new j(this, o10));
                    long j = this.f9989z;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j10 = this.f9988y;
                    if (j10 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j10);
                    }
                    TimeInterpolator timeInterpolator = this.A;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new bb.b(this, 3));
                    animator.start();
                }
            }
        }
        this.R.clear();
        l();
    }

    public void B(long j, long j10) {
        boolean z10;
        long j11 = this.T;
        int i6 = 0;
        if (j < j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((j10 < 0 && j >= 0) || (j10 > j11 && j <= j11)) {
            this.O = false;
            v(this, q.f9982l, z10);
        }
        ArrayList arrayList = this.K;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.L);
        this.L = V;
        while (i6 < size) {
            Animator animator = animatorArr[i6];
            animatorArr[i6] = null;
            l.b(animator, Math.min(Math.max(0L, j), l.a(animator)));
            i6++;
            z10 = z10;
        }
        boolean z11 = z10;
        this.L = animatorArr;
        if ((j > j11 && j10 <= j11) || (j < 0 && j10 >= 0)) {
            if (j > j11) {
                this.O = true;
            }
            v(this, q.f9983m, z11);
        }
    }

    public void C(long j) {
        this.f9989z = j;
    }

    public void E(TimeInterpolator timeInterpolator) {
        this.A = timeInterpolator;
    }

    public void F(n9.a0 a0Var) {
        if (a0Var == null) {
            this.S = X;
        } else {
            this.S = a0Var;
        }
    }

    public void H(long j) {
        this.f9988y = j;
    }

    public final void I() {
        if (this.M == 0) {
            v(this, q.f9982l, false);
            this.O = false;
        }
        this.M++;
    }

    public String J(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(": ");
        if (this.f9989z != -1) {
            sb2.append("dur(");
            sb2.append(this.f9989z);
            sb2.append(") ");
        }
        if (this.f9988y != -1) {
            sb2.append("dly(");
            sb2.append(this.f9988y);
            sb2.append(") ");
        }
        if (this.A != null) {
            sb2.append("interp(");
            sb2.append(this.A);
            sb2.append(") ");
        }
        ArrayList arrayList = this.B;
        int size = arrayList.size();
        ArrayList arrayList2 = this.C;
        if (size > 0 || arrayList2.size() > 0) {
            sb2.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                    if (i6 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(arrayList.get(i6));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(arrayList2.get(i10));
                }
            }
            sb2.append(")");
        }
        return sb2.toString();
    }

    public void a(o oVar) {
        if (this.Q == null) {
            this.Q = new ArrayList();
        }
        this.Q.add(oVar);
    }

    public abstract void c(z zVar);

    public void cancel() {
        ArrayList arrayList = this.K;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.L);
        this.L = V;
        for (int i6 = size - 1; i6 >= 0; i6--) {
            Animator animator = animatorArr[i6];
            animatorArr[i6] = null;
            animator.cancel();
        }
        this.L = animatorArr;
        v(this, q.f9984n, false);
    }

    public final void d(View view, boolean z10) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                z zVar = new z(view);
                if (z10) {
                    f(zVar);
                } else {
                    c(zVar);
                }
                zVar.f10002c.add(this);
                e(zVar);
                if (z10) {
                    b(this.D, view, zVar);
                } else {
                    b(this.E, view, zVar);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                    d(viewGroup.getChildAt(i6), z10);
                }
            }
        }
    }

    public abstract void f(z zVar);

    public final void g(ViewGroup viewGroup, boolean z10) {
        h(z10);
        ArrayList arrayList = this.B;
        int size = arrayList.size();
        ArrayList arrayList2 = this.C;
        if (size <= 0 && arrayList2.size() <= 0) {
            d(viewGroup, z10);
            return;
        }
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i6)).intValue());
            if (findViewById != null) {
                z zVar = new z(findViewById);
                if (z10) {
                    f(zVar);
                } else {
                    c(zVar);
                }
                zVar.f10002c.add(this);
                e(zVar);
                if (z10) {
                    b(this.D, findViewById, zVar);
                } else {
                    b(this.E, findViewById, zVar);
                }
            }
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            View view = (View) arrayList2.get(i10);
            z zVar2 = new z(view);
            if (z10) {
                f(zVar2);
            } else {
                c(zVar2);
            }
            zVar2.f10002c.add(this);
            e(zVar2);
            if (z10) {
                b(this.D, view, zVar2);
            } else {
                b(this.E, view, zVar2);
            }
        }
    }

    public final void h(boolean z10) {
        if (z10) {
            ((v.e) this.D.f1981x).clear();
            ((SparseArray) this.D.f1982y).clear();
            ((v.i) this.D.f1983z).b();
        } else {
            ((v.e) this.E.f1981x).clear();
            ((SparseArray) this.E.f1982y).clear();
            ((v.i) this.E.f1983z).b();
        }
    }

    @Override // 
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public r clone() {
        try {
            r rVar = (r) super.clone();
            rVar.R = new ArrayList();
            rVar.D = new c6.h(11);
            rVar.E = new c6.h(11);
            rVar.H = null;
            rVar.I = null;
            rVar.P = this;
            rVar.Q = null;
            return rVar;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public Animator j(ViewGroup viewGroup, z zVar, z zVar2) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [o5.k, java.lang.Object] */
    public void k(ViewGroup viewGroup, c6.h hVar, c6.h hVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i6;
        int i10;
        View view;
        z zVar;
        Animator animator;
        z zVar2;
        v.e o10 = o();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        n().getClass();
        int i11 = 0;
        while (i11 < size) {
            z zVar3 = (z) arrayList.get(i11);
            z zVar4 = (z) arrayList2.get(i11);
            if (zVar3 != null && !zVar3.f10002c.contains(this)) {
                zVar3 = null;
            }
            if (zVar4 != null && !zVar4.f10002c.contains(this)) {
                zVar4 = null;
            }
            if ((zVar3 != null || zVar4 != null) && (zVar3 == null || zVar4 == null || s(zVar3, zVar4))) {
                Animator j = j(viewGroup, zVar3, zVar4);
                if (j != null) {
                    String str = this.f9987x;
                    if (zVar4 != null) {
                        view = zVar4.f10001b;
                        String[] p10 = p();
                        if (p10 != null && p10.length > 0) {
                            zVar2 = new z(view);
                            z zVar5 = (z) ((v.e) hVar2.f1981x).get(view);
                            i6 = size;
                            if (zVar5 != null) {
                                int i12 = 0;
                                while (i12 < p10.length) {
                                    String str2 = p10[i12];
                                    zVar2.f10000a.put(str2, zVar5.f10000a.get(str2));
                                    i12++;
                                    i11 = i11;
                                    zVar5 = zVar5;
                                }
                            }
                            i10 = i11;
                            int i13 = o10.f13174z;
                            int i14 = 0;
                            while (true) {
                                if (i14 < i13) {
                                    k kVar = (k) o10.get((Animator) o10.f(i14));
                                    if (kVar.f9965c != null && kVar.f9963a == view && kVar.f9964b.equals(str) && kVar.f9965c.equals(zVar2)) {
                                        animator = null;
                                        break;
                                    }
                                    i14++;
                                } else {
                                    animator = j;
                                    break;
                                }
                            }
                        } else {
                            i6 = size;
                            i10 = i11;
                            animator = j;
                            zVar2 = null;
                        }
                        j = animator;
                        zVar = zVar2;
                    } else {
                        i6 = size;
                        i10 = i11;
                        view = zVar3.f10001b;
                        zVar = null;
                    }
                    if (j != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        ?? obj = new Object();
                        obj.f9963a = view;
                        obj.f9964b = str;
                        obj.f9965c = zVar;
                        obj.f9966d = windowId;
                        obj.f9967e = this;
                        obj.f9968f = j;
                        o10.put(j, obj);
                        this.R.add(j);
                    }
                    i11 = i10 + 1;
                    size = i6;
                }
            }
            i6 = size;
            i10 = i11;
            i11 = i10 + 1;
            size = i6;
        }
        if (sparseIntArray.size() != 0) {
            for (int i15 = 0; i15 < sparseIntArray.size(); i15++) {
                k kVar2 = (k) o10.get((Animator) this.R.get(sparseIntArray.keyAt(i15)));
                kVar2.f9968f.setStartDelay(kVar2.f9968f.getStartDelay() + (sparseIntArray.valueAt(i15) - Long.MAX_VALUE));
            }
        }
    }

    public final void l() {
        int i6 = this.M - 1;
        this.M = i6;
        if (i6 == 0) {
            v(this, q.f9983m, false);
            for (int i10 = 0; i10 < ((v.i) this.D.f1983z).i(); i10++) {
                View view = (View) ((v.i) this.D.f1983z).j(i10);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i11 = 0; i11 < ((v.i) this.E.f1983z).i(); i11++) {
                View view2 = (View) ((v.i) this.E.f1983z).j(i11);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.O = true;
        }
    }

    public final z m(View view, boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        a aVar = this.F;
        if (aVar != null) {
            return aVar.m(view, z10);
        }
        if (z10) {
            arrayList = this.H;
        } else {
            arrayList = this.I;
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i6 = 0;
            while (true) {
                if (i6 < size) {
                    z zVar = (z) arrayList.get(i6);
                    if (zVar != null) {
                        if (zVar.f10001b == view) {
                            break;
                        }
                        i6++;
                    } else {
                        return null;
                    }
                } else {
                    i6 = -1;
                    break;
                }
            }
            if (i6 >= 0) {
                if (z10) {
                    arrayList2 = this.I;
                } else {
                    arrayList2 = this.H;
                }
                return (z) arrayList2.get(i6);
            }
            return null;
        }
        return null;
    }

    public final r n() {
        a aVar = this.F;
        if (aVar != null) {
            return aVar.n();
        }
        return this;
    }

    public String[] p() {
        return null;
    }

    public final z q(View view, boolean z10) {
        c6.h hVar;
        a aVar = this.F;
        if (aVar != null) {
            return aVar.q(view, z10);
        }
        if (z10) {
            hVar = this.D;
        } else {
            hVar = this.E;
        }
        return (z) ((v.e) hVar.f1981x).get(view);
    }

    public boolean r() {
        return !this.K.isEmpty();
    }

    public boolean s(z zVar, z zVar2) {
        if (zVar != null && zVar2 != null) {
            String[] p10 = p();
            if (p10 != null) {
                for (String str : p10) {
                    if (u(zVar, zVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = zVar.f10000a.keySet().iterator();
                while (it.hasNext()) {
                    if (u(zVar, zVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean t(View view) {
        int id2 = view.getId();
        ArrayList arrayList = this.B;
        int size = arrayList.size();
        ArrayList arrayList2 = this.C;
        if ((size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id2)) || arrayList2.contains(view)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return J(HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public final void v(r rVar, q qVar, boolean z10) {
        r rVar2 = this.P;
        if (rVar2 != null) {
            rVar2.v(rVar, qVar, z10);
        }
        ArrayList arrayList = this.Q;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = this.Q.size();
            o[] oVarArr = this.J;
            if (oVarArr == null) {
                oVarArr = new o[size];
            }
            this.J = null;
            o[] oVarArr2 = (o[]) this.Q.toArray(oVarArr);
            for (int i6 = 0; i6 < size; i6++) {
                qVar.a(oVarArr2[i6], rVar, z10);
                oVarArr2[i6] = null;
            }
            this.J = oVarArr2;
        }
    }

    public void w(View view) {
        if (!this.O) {
            ArrayList arrayList = this.K;
            int size = arrayList.size();
            Animator[] animatorArr = (Animator[]) arrayList.toArray(this.L);
            this.L = V;
            for (int i6 = size - 1; i6 >= 0; i6--) {
                Animator animator = animatorArr[i6];
                animatorArr[i6] = null;
                animator.pause();
            }
            this.L = animatorArr;
            v(this, q.f9985o, false);
            this.N = true;
        }
    }

    public void x() {
        v.e o10 = o();
        this.T = 0L;
        for (int i6 = 0; i6 < this.R.size(); i6++) {
            Animator animator = (Animator) this.R.get(i6);
            k kVar = (k) o10.get(animator);
            if (animator != null && kVar != null) {
                Animator animator2 = kVar.f9968f;
                long j = this.f9989z;
                if (j >= 0) {
                    animator2.setDuration(j);
                }
                long j10 = this.f9988y;
                if (j10 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j10);
                }
                TimeInterpolator timeInterpolator = this.A;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.K.add(animator);
                this.T = Math.max(this.T, l.a(animator));
            }
        }
        this.R.clear();
    }

    public r y(o oVar) {
        r rVar;
        ArrayList arrayList = this.Q;
        if (arrayList != null) {
            if (!arrayList.remove(oVar) && (rVar = this.P) != null) {
                rVar.y(oVar);
            }
            if (this.Q.size() == 0) {
                this.Q = null;
            }
        }
        return this;
    }

    public void z(View view) {
        if (this.N) {
            if (!this.O) {
                ArrayList arrayList = this.K;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.L);
                this.L = V;
                for (int i6 = size - 1; i6 >= 0; i6--) {
                    Animator animator = animatorArr[i6];
                    animatorArr[i6] = null;
                    animator.resume();
                }
                this.L = animatorArr;
                v(this, q.f9986p, false);
            }
            this.N = false;
        }
    }

    public void G() {
    }

    public void D(a4 a4Var) {
    }

    public void e(z zVar) {
    }
}
