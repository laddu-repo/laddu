package e5;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import t0.m0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class p implements Cloneable {
    public static final Animator[] R = new Animator[0];
    public static final int[] S = {2, 1, 3, 4};
    public static final kb.e T = new kb.e(11);
    public static final ThreadLocal U = new ThreadLocal();
    public ArrayList F;
    public ArrayList G;
    public n[] H;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f4824v = getClass().getName();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f4825w = -1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f4826x = -1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TimeInterpolator f4827y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ArrayList f4828z = new ArrayList();
    public final ArrayList A = new ArrayList();
    public sb.p B = new sb.p(9);
    public sb.p C = new sb.p(9);
    public a D = null;
    public final int[] E = S;
    public final ArrayList I = new ArrayList();
    public Animator[] J = R;
    public int K = 0;
    public boolean L = false;
    public boolean M = false;
    public p N = null;
    public ArrayList O = null;
    public ArrayList P = new ArrayList();
    public kb.e Q = T;

    public static void b(sb.p pVar, View view, x xVar) {
        v.e eVar = (v.e) pVar.f11742w;
        v.e eVar2 = (v.e) pVar.f11745z;
        SparseArray sparseArray = (SparseArray) pVar.f11743x;
        v.g gVar = (v.g) pVar.f11744y;
        eVar.put(view, xVar);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (sparseArray.indexOfKey(id2) >= 0) {
                sparseArray.put(id2, null);
            } else {
                sparseArray.put(id2, view);
            }
        }
        WeakHashMap weakHashMap = m0.f11853a;
        String strE = t0.d0.e(view);
        if (strE != null) {
            if (eVar2.containsKey(strE)) {
                eVar2.put(strE, null);
            } else {
                eVar2.put(strE, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (gVar.f(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    gVar.h(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) gVar.d(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    gVar.h(itemIdAtPosition, null);
                }
            }
        }
    }

    public static v.e p() {
        ThreadLocal threadLocal = U;
        v.e eVar = (v.e) threadLocal.get();
        if (eVar != null) {
            return eVar;
        }
        v.e eVar2 = new v.e(0);
        threadLocal.set(eVar2);
        return eVar2;
    }

    public static boolean u(x xVar, x xVar2, String str) {
        Object obj = xVar.f4839a.get(str);
        Object obj2 = xVar2.f4839a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(long j8) {
        this.f4826x = j8;
    }

    public void C(TimeInterpolator timeInterpolator) {
        this.f4827y = timeInterpolator;
    }

    public void D(kb.e eVar) {
        if (eVar == null) {
            this.Q = T;
        } else {
            this.Q = eVar;
        }
    }

    public void F(long j8) {
        this.f4825w = j8;
    }

    public final void G() {
        if (this.K == 0) {
            v(this, o.i);
            this.M = false;
        }
        this.K++;
    }

    public String H(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(": ");
        if (this.f4826x != -1) {
            sb2.append("dur(");
            sb2.append(this.f4826x);
            sb2.append(") ");
        }
        if (this.f4825w != -1) {
            sb2.append("dly(");
            sb2.append(this.f4825w);
            sb2.append(") ");
        }
        if (this.f4827y != null) {
            sb2.append("interp(");
            sb2.append(this.f4827y);
            sb2.append(") ");
        }
        ArrayList arrayList = this.f4828z;
        int size = arrayList.size();
        ArrayList arrayList2 = this.A;
        if (size > 0 || arrayList2.size() > 0) {
            sb2.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(arrayList.get(i));
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

    public void a(n nVar) {
        if (this.O == null) {
            this.O = new ArrayList();
        }
        this.O.add(nVar);
    }

    public void c() {
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.J);
        this.J = R;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.J = animatorArr;
        v(this, o.f4821k);
    }

    public abstract void d(x xVar);

    public final void e(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            x xVar = new x(view);
            if (z2) {
                g(xVar);
            } else {
                d(xVar);
            }
            xVar.f4841c.add(this);
            f(xVar);
            if (z2) {
                b(this.B, view, xVar);
            } else {
                b(this.C, view, xVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), z2);
            }
        }
    }

    public abstract void g(x xVar);

    public final void h(ViewGroup viewGroup, boolean z2) {
        i(z2);
        ArrayList arrayList = this.f4828z;
        int size = arrayList.size();
        ArrayList arrayList2 = this.A;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z2);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                x xVar = new x(viewFindViewById);
                if (z2) {
                    g(xVar);
                } else {
                    d(xVar);
                }
                xVar.f4841c.add(this);
                f(xVar);
                if (z2) {
                    b(this.B, viewFindViewById, xVar);
                } else {
                    b(this.C, viewFindViewById, xVar);
                }
            }
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            View view = (View) arrayList2.get(i10);
            x xVar2 = new x(view);
            if (z2) {
                g(xVar2);
            } else {
                d(xVar2);
            }
            xVar2.f4841c.add(this);
            f(xVar2);
            if (z2) {
                b(this.B, view, xVar2);
            } else {
                b(this.C, view, xVar2);
            }
        }
    }

    public final void i(boolean z2) {
        if (z2) {
            ((v.e) this.B.f11742w).clear();
            ((SparseArray) this.B.f11743x).clear();
            ((v.g) this.B.f11744y).b();
        } else {
            ((v.e) this.C.f11742w).clear();
            ((SparseArray) this.C.f11743x).clear();
            ((v.g) this.C.f11744y).b();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public p clone() {
        try {
            p pVar = (p) super.clone();
            pVar.P = new ArrayList();
            pVar.B = new sb.p(9);
            pVar.C = new sb.p(9);
            pVar.F = null;
            pVar.G = null;
            pVar.N = this;
            pVar.O = null;
            return pVar;
        } catch (CloneNotSupportedException e7) {
            throw new RuntimeException(e7);
        }
    }

    public Animator k(ViewGroup viewGroup, x xVar, x xVar2) {
        return null;
    }

    public void l(ViewGroup viewGroup, sb.p pVar, sb.p pVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int i10;
        View view;
        x xVar;
        Animator animator;
        x xVar2;
        v.e eVarP = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        o().getClass();
        int i11 = 0;
        while (i11 < size) {
            x xVar3 = (x) arrayList.get(i11);
            x xVar4 = (x) arrayList2.get(i11);
            if (xVar3 != null && !xVar3.f4841c.contains(this)) {
                xVar3 = null;
            }
            if (xVar4 != null && !xVar4.f4841c.contains(this)) {
                xVar4 = null;
            }
            if ((xVar3 != null || xVar4 != null) && (xVar3 == null || xVar4 == null || s(xVar3, xVar4))) {
                Animator animatorK = k(viewGroup, xVar3, xVar4);
                if (animatorK != null) {
                    String str = this.f4824v;
                    if (xVar4 != null) {
                        view = xVar4.f4840b;
                        String[] strArrQ = q();
                        if (strArrQ != null && strArrQ.length > 0) {
                            xVar2 = new x(view);
                            x xVar5 = (x) ((v.e) pVar2.f11742w).get(view);
                            i = size;
                            if (xVar5 != null) {
                                int i12 = 0;
                                while (i12 < strArrQ.length) {
                                    String str2 = strArrQ[i12];
                                    int i13 = i11;
                                    xVar2.f4839a.put(str2, xVar5.f4839a.get(str2));
                                    i12++;
                                    i11 = i13;
                                    xVar5 = xVar5;
                                }
                            }
                            i10 = i11;
                            int i14 = eVarP.f13021x;
                            int i15 = 0;
                            while (true) {
                                if (i15 >= i14) {
                                    animator = animatorK;
                                    break;
                                }
                                m mVar = (m) eVarP.get((Animator) eVarP.f(i15));
                                if (mVar.f4817c != null && mVar.f4815a == view && mVar.f4816b.equals(str) && mVar.f4817c.equals(xVar2)) {
                                    animator = null;
                                    break;
                                }
                                i15++;
                            }
                        } else {
                            i = size;
                            i10 = i11;
                            animator = animatorK;
                            xVar2 = null;
                        }
                        animatorK = animator;
                        xVar = xVar2;
                    } else {
                        i = size;
                        i10 = i11;
                        view = xVar3.f4840b;
                        xVar = null;
                    }
                    if (animatorK != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        m mVar2 = new m();
                        mVar2.f4815a = view;
                        mVar2.f4816b = str;
                        mVar2.f4817c = xVar;
                        mVar2.f4818d = windowId;
                        mVar2.f4819e = this;
                        mVar2.f = animatorK;
                        eVarP.put(animatorK, mVar2);
                        this.P.add(animatorK);
                    }
                }
                i11 = i10 + 1;
                size = i;
            }
            i = size;
            i10 = i11;
            i11 = i10 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i16 = 0; i16 < sparseIntArray.size(); i16++) {
                m mVar3 = (m) eVarP.get((Animator) this.P.get(sparseIntArray.keyAt(i16)));
                mVar3.f.setStartDelay(mVar3.f.getStartDelay() + (((long) sparseIntArray.valueAt(i16)) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i = this.K - 1;
        this.K = i;
        if (i == 0) {
            v(this, o.f4820j);
            for (int i10 = 0; i10 < ((v.g) this.B.f11744y).i(); i10++) {
                View view = (View) ((v.g) this.B.f11744y).j(i10);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i11 = 0; i11 < ((v.g) this.C.f11744y).i(); i11++) {
                View view2 = (View) ((v.g) this.C.f11744y).j(i11);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.M = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (r2 < 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        if (r6 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        r5 = r4.G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0033, code lost:
    
        r5 = r4.F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        return (e5.x) r5.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final e5.x n(android.view.View r5, boolean r6) {
        /*
            r4 = this;
            e5.a r0 = r4.D
            if (r0 == 0) goto L9
            e5.x r5 = r0.n(r5, r6)
            return r5
        L9:
            if (r6 == 0) goto Le
            java.util.ArrayList r0 = r4.F
            goto L10
        Le:
            java.util.ArrayList r0 = r4.G
        L10:
            if (r0 != 0) goto L13
            goto L3c
        L13:
            int r1 = r0.size()
            r2 = 0
        L18:
            if (r2 >= r1) goto L2b
            java.lang.Object r3 = r0.get(r2)
            e5.x r3 = (e5.x) r3
            if (r3 != 0) goto L23
            goto L3c
        L23:
            android.view.View r3 = r3.f4840b
            if (r3 != r5) goto L28
            goto L2c
        L28:
            int r2 = r2 + 1
            goto L18
        L2b:
            r2 = -1
        L2c:
            if (r2 < 0) goto L3c
            if (r6 == 0) goto L33
            java.util.ArrayList r5 = r4.G
            goto L35
        L33:
            java.util.ArrayList r5 = r4.F
        L35:
            java.lang.Object r5 = r5.get(r2)
            e5.x r5 = (e5.x) r5
            return r5
        L3c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.p.n(android.view.View, boolean):e5.x");
    }

    public final p o() {
        a aVar = this.D;
        return aVar != null ? aVar.o() : this;
    }

    public String[] q() {
        return null;
    }

    public final x r(View view, boolean z2) {
        a aVar = this.D;
        if (aVar != null) {
            return aVar.r(view, z2);
        }
        return (x) ((v.e) (z2 ? this.B : this.C).f11742w).get(view);
    }

    public boolean s(x xVar, x xVar2) {
        if (xVar != null && xVar2 != null) {
            String[] strArrQ = q();
            if (strArrQ != null) {
                for (String str : strArrQ) {
                    if (u(xVar, xVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = xVar.f4839a.keySet().iterator();
                while (it.hasNext()) {
                    if (u(xVar, xVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean t(View view) {
        int id2 = view.getId();
        ArrayList arrayList = this.f4828z;
        int size = arrayList.size();
        ArrayList arrayList2 = this.A;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id2)) || arrayList2.contains(view);
    }

    public final String toString() {
        return H("");
    }

    public final void v(p pVar, o oVar) {
        p pVar2 = this.N;
        if (pVar2 != null) {
            pVar2.v(pVar, oVar);
        }
        ArrayList arrayList = this.O;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.O.size();
        n[] nVarArr = this.H;
        if (nVarArr == null) {
            nVarArr = new n[size];
        }
        this.H = null;
        n[] nVarArr2 = (n[]) this.O.toArray(nVarArr);
        for (int i = 0; i < size; i++) {
            oVar.d(nVarArr2[i], pVar);
            nVarArr2[i] = null;
        }
        this.H = nVarArr2;
    }

    public void w(View view) {
        if (this.M) {
            return;
        }
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.J);
        this.J = R;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.J = animatorArr;
        v(this, o.f4822l);
        this.L = true;
    }

    public p x(n nVar) {
        p pVar;
        ArrayList arrayList = this.O;
        if (arrayList != null) {
            if (!arrayList.remove(nVar) && (pVar = this.N) != null) {
                pVar.x(nVar);
            }
            if (this.O.size() == 0) {
                this.O = null;
            }
        }
        return this;
    }

    public void y(View view) {
        if (this.L) {
            if (!this.M) {
                ArrayList arrayList = this.I;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.J);
                this.J = R;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.J = animatorArr;
                v(this, o.f4823m);
            }
            this.L = false;
        }
    }

    public void z() {
        G();
        v.e eVarP = p();
        ArrayList arrayList = this.P;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Animator animator = (Animator) obj;
            if (eVarP.containsKey(animator)) {
                G();
                if (animator != null) {
                    animator.addListener(new k(this, eVarP));
                    long j8 = this.f4826x;
                    if (j8 >= 0) {
                        animator.setDuration(j8);
                    }
                    long j9 = this.f4825w;
                    if (j9 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j9);
                    }
                    TimeInterpolator timeInterpolator = this.f4827y;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new l(0, this));
                    animator.start();
                }
            }
        }
        this.P.clear();
        m();
    }

    public void E() {
    }

    public void B(z7.b bVar) {
    }

    public void f(x xVar) {
    }
}
