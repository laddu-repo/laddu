package o4;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k8.g2;
import k8.k4;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public cf.m f9763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f9764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sc.b f9765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sc.b f9766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u f9767e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9768g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f9769h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9770j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f9771k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9772l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f9773m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f9774n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f9775o;

    public j0() {
        g2 g2Var = new g2(9, this);
        k4 k4Var = new k4(this);
        this.f9765c = new sc.b(g2Var);
        this.f9766d = new sc.b(k4Var);
        this.f = false;
        this.f9768g = false;
        this.f9769h = true;
        this.i = true;
    }

    public static int A(View view) {
        Rect rect = ((k0) view.getLayoutParams()).f9801b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int G(View view) {
        return ((k0) view.getLayoutParams()).f9800a.b();
    }

    public static i0 H(Context context, AttributeSet attributeSet, int i, int i10) {
        i0 i0Var = new i0();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n4.c.RecyclerView, i, i10);
        i0Var.f9752a = typedArrayObtainStyledAttributes.getInt(n4.c.RecyclerView_android_orientation, 1);
        i0Var.f9753b = typedArrayObtainStyledAttributes.getInt(n4.c.RecyclerView_spanCount, 1);
        i0Var.f9754c = typedArrayObtainStyledAttributes.getBoolean(n4.c.RecyclerView_reverseLayout, false);
        i0Var.f9755d = typedArrayObtainStyledAttributes.getBoolean(n4.c.RecyclerView_stackFromEnd, false);
        typedArrayObtainStyledAttributes.recycle();
        return i0Var;
    }

    public static boolean M(int i, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (i11 > 0 && i != i11) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public static void N(View view, int i, int i10, int i11, int i12) {
        k0 k0Var = (k0) view.getLayoutParams();
        Rect rect = k0Var.f9801b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) k0Var).leftMargin, i10 + rect.top + ((ViewGroup.MarginLayoutParams) k0Var).topMargin, (i11 - rect.right) - ((ViewGroup.MarginLayoutParams) k0Var).rightMargin, (i12 - rect.bottom) - ((ViewGroup.MarginLayoutParams) k0Var).bottomMargin);
    }

    public static int g(int i, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i10, i11) : size : Math.min(size, Math.max(i10, i11));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int w(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L1d
            if (r8 < 0) goto L12
        L10:
            r6 = r3
            goto L30
        L12:
            if (r8 != r1) goto L1a
            if (r6 == r2) goto L22
            if (r6 == 0) goto L1a
            if (r6 == r3) goto L22
        L1a:
            r6 = r7
            r8 = r6
            goto L30
        L1d:
            if (r8 < 0) goto L20
            goto L10
        L20:
            if (r8 != r1) goto L24
        L22:
            r8 = r5
            goto L30
        L24:
            if (r8 != r0) goto L1a
            if (r6 == r2) goto L2e
            if (r6 != r3) goto L2b
            goto L2e
        L2b:
            r8 = r5
            r6 = r7
            goto L30
        L2e:
            r8 = r5
            r6 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.j0.w(boolean, int, int, int, int):int");
    }

    public static int z(View view) {
        Rect rect = ((k0) view.getLayoutParams()).f9801b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public final boolean A0(View view, int i, int i10, k0 k0Var) {
        return (this.f9769h && M(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) k0Var).width) && M(view.getMeasuredHeight(), i10, ((ViewGroup.MarginLayoutParams) k0Var).height)) ? false : true;
    }

    public final int B() {
        RecyclerView recyclerView = this.f9764b;
        b0 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public abstract void B0(RecyclerView recyclerView, int i);

    public final int C() {
        RecyclerView recyclerView = this.f9764b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final void C0(u uVar) {
        u uVar2 = this.f9767e;
        if (uVar2 != null && uVar != uVar2 && uVar2.f9873e) {
            uVar2.i();
        }
        this.f9767e = uVar;
        RecyclerView recyclerView = this.f9764b;
        y0 y0Var = recyclerView.f1399y0;
        y0Var.B.removeCallbacks(y0Var);
        y0Var.f9905x.abortAnimation();
        if (uVar.f9875h) {
            Log.w("RecyclerView", "An instance of " + uVar.getClass().getSimpleName() + " was started more than once. Each instance of" + uVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        uVar.f9870b = recyclerView;
        uVar.f9871c = this;
        int i = uVar.f9869a;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.B0.f9884a = i;
        uVar.f9873e = true;
        uVar.f9872d = true;
        uVar.f = recyclerView.I.q(i);
        uVar.f9870b.f1399y0.b();
        uVar.f9875h = true;
    }

    public final int D() {
        RecyclerView recyclerView = this.f9764b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public boolean D0() {
        return false;
    }

    public final int E() {
        RecyclerView recyclerView = this.f9764b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.f9764b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int I(p0 p0Var, v0 v0Var) {
        RecyclerView recyclerView = this.f9764b;
        if (recyclerView == null || recyclerView.H == null || !e()) {
            return 1;
        }
        return this.f9764b.H.a();
    }

    public final void J(Rect rect, View view) {
        Matrix matrix;
        Rect rect2 = ((k0) view.getLayoutParams()).f9801b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f9764b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f9764b.G;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean K();

    public boolean L() {
        return false;
    }

    public void O(int i) {
        RecyclerView recyclerView = this.f9764b;
        if (recyclerView != null) {
            int iV = recyclerView.A.v();
            for (int i10 = 0; i10 < iV; i10++) {
                recyclerView.A.u(i10).offsetLeftAndRight(i);
            }
        }
    }

    public void P(int i) {
        RecyclerView recyclerView = this.f9764b;
        if (recyclerView != null) {
            int iV = recyclerView.A.v();
            for (int i10 = 0; i10 < iV; i10++) {
                recyclerView.A.u(i10).offsetTopAndBottom(i);
            }
        }
    }

    public abstract void S(RecyclerView recyclerView);

    public abstract View T(View view, int i, p0 p0Var, v0 v0Var);

    public void U(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f9764b;
        p0 p0Var = recyclerView.f1396x;
        if (accessibilityEvent == null) {
            return;
        }
        boolean z2 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f9764b.canScrollVertically(-1) && !this.f9764b.canScrollHorizontally(-1) && !this.f9764b.canScrollHorizontally(1)) {
            z2 = false;
        }
        accessibilityEvent.setScrollable(z2);
        b0 b0Var = this.f9764b.H;
        if (b0Var != null) {
            accessibilityEvent.setItemCount(b0Var.a());
        }
    }

    public void V(p0 p0Var, v0 v0Var, u0.c cVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f12609a;
        if (this.f9764b.canScrollVertically(-1) || this.f9764b.canScrollHorizontally(-1)) {
            cVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
            cVar.h(67108864, true);
        }
        if (this.f9764b.canScrollVertically(1) || this.f9764b.canScrollHorizontally(1)) {
            cVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
            cVar.h(67108864, true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(I(p0Var, v0Var), x(p0Var, v0Var), false, 0));
    }

    public final void W(View view, u0.c cVar) {
        z0 z0VarM = RecyclerView.M(view);
        if (z0VarM == null || z0VarM.h()) {
            return;
        }
        cf.m mVar = this.f9763a;
        if (((ArrayList) mVar.f2331z).contains(z0VarM.f9910a)) {
            return;
        }
        RecyclerView recyclerView = this.f9764b;
        X(recyclerView.f1396x, recyclerView.B0, view, cVar);
    }

    public void X(p0 p0Var, v0 v0Var, View view, u0.c cVar) {
        cVar.j(cc.c.b(false, e() ? G(view) : 0, 1, d() ? G(view) : 0, 1));
    }

    public final void b(View view, int i, boolean z2) {
        z0 z0VarM = RecyclerView.M(view);
        if (z2 || z0VarM.h()) {
            v.i iVar = (v.i) this.f9764b.B.f7602w;
            k1 k1VarA = (k1) iVar.get(z0VarM);
            if (k1VarA == null) {
                k1VarA = k1.a();
                iVar.put(z0VarM, k1VarA);
            }
            k1VarA.f9805a |= 1;
        } else {
            this.f9764b.B.H(z0VarM);
        }
        k0 k0Var = (k0) view.getLayoutParams();
        if (z0VarM.p() || z0VarM.i()) {
            if (z0VarM.i()) {
                z0VarM.f9921n.m(z0VarM);
            } else {
                z0VarM.f9917j &= -33;
            }
            this.f9763a.f(view, i, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.f9764b) {
                cf.m mVar = this.f9763a;
                e3.c cVar = (e3.c) mVar.f2330y;
                int iIndexOfChild = ((RecyclerView) ((g2) mVar.f2329x).f7546w).indexOfChild(view);
                int iD = (iIndexOfChild == -1 || cVar.G(iIndexOfChild)) ? -1 : iIndexOfChild - cVar.D(iIndexOfChild);
                if (i == -1) {
                    i = this.f9763a.v();
                }
                if (iD == -1) {
                    StringBuilder sb2 = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb2.append(this.f9764b.indexOfChild(view));
                    throw new IllegalStateException(d0.d.j(this.f9764b, sb2));
                }
                if (iD != i) {
                    j0 j0Var = this.f9764b.I;
                    View viewU = j0Var.u(iD);
                    if (viewU == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iD + j0Var.f9764b.toString());
                    }
                    j0Var.u(iD);
                    j0Var.f9763a.o(iD);
                    k0 k0Var2 = (k0) viewU.getLayoutParams();
                    z0 z0VarM2 = RecyclerView.M(viewU);
                    if (z0VarM2.h()) {
                        v.i iVar2 = (v.i) j0Var.f9764b.B.f7602w;
                        k1 k1VarA2 = (k1) iVar2.get(z0VarM2);
                        if (k1VarA2 == null) {
                            k1VarA2 = k1.a();
                            iVar2.put(z0VarM2, k1VarA2);
                        }
                        k1VarA2.f9805a = 1 | k1VarA2.f9805a;
                    } else {
                        j0Var.f9764b.B.H(z0VarM2);
                    }
                    j0Var.f9763a.f(viewU, i, k0Var2, z0VarM2.h());
                }
            } else {
                this.f9763a.d(view, i, false);
                k0Var.f9802c = true;
                u uVar = this.f9767e;
                if (uVar != null && uVar.f9873e) {
                    uVar.f9870b.getClass();
                    z0 z0VarM3 = RecyclerView.M(view);
                    if ((z0VarM3 != null ? z0VarM3.b() : -1) == uVar.f9869a) {
                        uVar.f = view;
                        if (RecyclerView.X0) {
                            Log.d("RecyclerView", "smooth scroll target view has been attached");
                        }
                    }
                }
            }
        }
        if (k0Var.f9803d) {
            if (RecyclerView.X0) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + k0Var.f9800a);
            }
            z0VarM.f9910a.invalidate();
            k0Var.f9803d = false;
        }
    }

    public void c(String str) {
        RecyclerView recyclerView = this.f9764b;
        if (recyclerView != null) {
            recyclerView.k(str);
        }
    }

    public abstract boolean d();

    public abstract boolean e();

    public abstract void e0(p0 p0Var, v0 v0Var);

    public boolean f(k0 k0Var) {
        return k0Var != null;
    }

    public abstract void f0(v0 v0Var);

    public Parcelable h0() {
        return null;
    }

    public abstract int j(v0 v0Var);

    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[PHI: r0
  0x0060: PHI (r0v8 int) = (r0v5 int), (r0v15 int) binds: [B:24:0x007c, B:16:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean j0(int r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.j0.j0(int, android.os.Bundle):boolean");
    }

    public abstract int k(v0 v0Var);

    public final void k0(p0 p0Var) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            if (!RecyclerView.M(u(iV)).o()) {
                View viewU = u(iV);
                n0(iV);
                p0Var.i(viewU);
            }
        }
    }

    public abstract int l(v0 v0Var);

    public final void l0(p0 p0Var) {
        ArrayList arrayList = p0Var.f9830a;
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((z0) arrayList.get(i)).f9910a;
            z0 z0VarM = RecyclerView.M(view);
            if (!z0VarM.o()) {
                z0VarM.n(false);
                if (z0VarM.j()) {
                    this.f9764b.removeDetachedView(view, false);
                }
                g0 g0Var = this.f9764b.f1381j0;
                if (g0Var != null) {
                    g0Var.d(z0VarM);
                }
                z0VarM.n(true);
                z0 z0VarM2 = RecyclerView.M(view);
                z0VarM2.f9921n = null;
                z0VarM2.f9922o = false;
                z0VarM2.f9917j &= -33;
                p0Var.j(z0VarM2);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = p0Var.f9831b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f9764b.invalidate();
        }
    }

    public abstract int m(v0 v0Var);

    public final void m0(View view, p0 p0Var) {
        cf.m mVar = this.f9763a;
        g2 g2Var = (g2) mVar.f2329x;
        int i = mVar.f2328w;
        if (i == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            mVar.f2328w = 1;
            mVar.A = view;
            int iIndexOfChild = ((RecyclerView) g2Var.f7546w).indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (((e3.c) mVar.f2330y).J(iIndexOfChild)) {
                    mVar.E(view);
                }
                g2Var.M(iIndexOfChild);
            }
            mVar.f2328w = 0;
            mVar.A = null;
            p0Var.i(view);
        } catch (Throwable th) {
            mVar.f2328w = 0;
            mVar.A = null;
            throw th;
        }
    }

    public abstract int n(v0 v0Var);

    public final void n0(int i) {
        if (u(i) != null) {
            cf.m mVar = this.f9763a;
            g2 g2Var = (g2) mVar.f2329x;
            int i10 = mVar.f2328w;
            if (i10 == 1) {
                throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
            }
            if (i10 == 2) {
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            try {
                int iW = mVar.w(i);
                View childAt = ((RecyclerView) g2Var.f7546w).getChildAt(iW);
                if (childAt != null) {
                    mVar.f2328w = 1;
                    mVar.A = childAt;
                    if (((e3.c) mVar.f2330y).J(iW)) {
                        mVar.E(childAt);
                    }
                    g2Var.M(iW);
                }
                mVar.f2328w = 0;
                mVar.A = null;
            } catch (Throwable th) {
                mVar.f2328w = 0;
                mVar.A = null;
                throw th;
            }
        }
    }

    public abstract int o(v0 v0Var);

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean o0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.D()
            int r1 = r8.F()
            int r2 = r8.f9774n
            int r3 = r8.E()
            int r2 = r2 - r3
            int r3 = r8.f9775o
            int r4 = r8.C()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            androidx.recyclerview.widget.RecyclerView r3 = r8.f9764b
            int r3 = r3.getLayoutDirection()
            r7 = 1
            if (r3 != r7) goto L5e
            if (r2 == 0) goto L59
            goto L66
        L59:
            int r2 = java.lang.Math.max(r6, r10)
            goto L66
        L5e:
            if (r6 == 0) goto L61
            goto L65
        L61:
            int r6 = java.lang.Math.min(r4, r2)
        L65:
            r2 = r6
        L66:
            if (r1 == 0) goto L69
            goto L6d
        L69:
            int r1 = java.lang.Math.min(r5, r11)
        L6d:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lb0
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L7e
            goto Lb5
        L7e:
            int r1 = r8.D()
            int r2 = r8.F()
            int r3 = r8.f9774n
            int r4 = r8.E()
            int r3 = r3 - r4
            int r4 = r8.f9775o
            int r5 = r8.C()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.f9764b
            android.graphics.Rect r5 = r5.E
            r8.y(r5, r13)
            int r13 = r5.left
            int r13 = r13 - r11
            if (r13 >= r3) goto Lb5
            int r13 = r5.right
            int r13 = r13 - r11
            if (r13 <= r1) goto Lb5
            int r13 = r5.top
            int r13 = r13 - r10
            if (r13 >= r4) goto Lb5
            int r13 = r5.bottom
            int r13 = r13 - r10
            if (r13 > r2) goto Lb0
            goto Lb5
        Lb0:
            if (r11 != 0) goto Lb6
            if (r10 == 0) goto Lb5
            goto Lb6
        Lb5:
            return r0
        Lb6:
            if (r12 == 0) goto Lbc
            r9.scrollBy(r11, r10)
            return r7
        Lbc:
            r9.i0(r11, r10, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.j0.o0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public final void p(p0 p0Var) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            z0 z0VarM = RecyclerView.M(viewU);
            if (z0VarM.o()) {
                if (RecyclerView.X0) {
                    Log.d("RecyclerView", "ignoring view " + z0VarM);
                }
            } else if (!z0VarM.f() || z0VarM.h() || this.f9764b.H.f9681b) {
                u(iV);
                this.f9763a.o(iV);
                p0Var.k(viewU);
                this.f9764b.B.H(z0VarM);
            } else {
                n0(iV);
                p0Var.j(z0VarM);
            }
        }
    }

    public final void p0() {
        RecyclerView recyclerView = this.f9764b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public View q(int i) {
        int iV = v();
        for (int i10 = 0; i10 < iV; i10++) {
            View viewU = u(i10);
            z0 z0VarM = RecyclerView.M(viewU);
            if (z0VarM != null && z0VarM.b() == i && !z0VarM.o() && (this.f9764b.B0.f9889g || !z0VarM.h())) {
                return viewU;
            }
        }
        return null;
    }

    public abstract int q0(int i, p0 p0Var, v0 v0Var);

    public abstract k0 r();

    public abstract void r0(int i);

    public k0 s(Context context, AttributeSet attributeSet) {
        return new k0(context, attributeSet);
    }

    public abstract int s0(int i, p0 p0Var, v0 v0Var);

    public k0 t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof k0 ? new k0((k0) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new k0((ViewGroup.MarginLayoutParams) layoutParams) : new k0(layoutParams);
    }

    public final void t0(RecyclerView recyclerView) {
        u0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final View u(int i) {
        cf.m mVar = this.f9763a;
        if (mVar != null) {
            return mVar.u(i);
        }
        return null;
    }

    public final void u0(int i, int i10) {
        this.f9774n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.f9772l = mode;
        if (mode == 0 && !RecyclerView.f1369a1) {
            this.f9774n = 0;
        }
        this.f9775o = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i10);
        this.f9773m = mode2;
        if (mode2 != 0 || RecyclerView.f1369a1) {
            return;
        }
        this.f9775o = 0;
    }

    public final int v() {
        cf.m mVar = this.f9763a;
        if (mVar != null) {
            return mVar.v();
        }
        return 0;
    }

    public void v0(Rect rect, int i, int i10) {
        int iE = E() + D() + rect.width();
        int iC = C() + F() + rect.height();
        RecyclerView recyclerView = this.f9764b;
        WeakHashMap weakHashMap = t0.m0.f11853a;
        this.f9764b.setMeasuredDimension(g(i, iE, recyclerView.getMinimumWidth()), g(i10, iC, this.f9764b.getMinimumHeight()));
    }

    public final void w0(int i, int i10) {
        int iV = v();
        if (iV == 0) {
            this.f9764b.q(i, i10);
            return;
        }
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MAX_VALUE;
        for (int i15 = 0; i15 < iV; i15++) {
            View viewU = u(i15);
            Rect rect = this.f9764b.E;
            y(rect, viewU);
            int i16 = rect.left;
            if (i16 < i14) {
                i14 = i16;
            }
            int i17 = rect.right;
            if (i17 > i11) {
                i11 = i17;
            }
            int i18 = rect.top;
            if (i18 < i12) {
                i12 = i18;
            }
            int i19 = rect.bottom;
            if (i19 > i13) {
                i13 = i19;
            }
        }
        this.f9764b.E.set(i14, i12, i11, i13);
        v0(this.f9764b.E, i, i10);
    }

    public int x(p0 p0Var, v0 v0Var) {
        RecyclerView recyclerView = this.f9764b;
        if (recyclerView == null || recyclerView.H == null || !d()) {
            return 1;
        }
        return this.f9764b.H.a();
    }

    public final void x0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f9764b = null;
            this.f9763a = null;
            this.f9774n = 0;
            this.f9775o = 0;
        } else {
            this.f9764b = recyclerView;
            this.f9763a = recyclerView.A;
            this.f9774n = recyclerView.getWidth();
            this.f9775o = recyclerView.getHeight();
        }
        this.f9772l = 1073741824;
        this.f9773m = 1073741824;
    }

    public void y(Rect rect, View view) {
        boolean z2 = RecyclerView.W0;
        k0 k0Var = (k0) view.getLayoutParams();
        Rect rect2 = k0Var.f9801b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) k0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) k0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) k0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) k0Var).bottomMargin);
    }

    public final boolean y0(View view, int i, int i10, k0 k0Var) {
        return (!view.isLayoutRequested() && this.f9769h && M(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) k0Var).width) && M(view.getHeight(), i10, ((ViewGroup.MarginLayoutParams) k0Var).height)) ? false : true;
    }

    public boolean z0() {
        return false;
    }

    public void Q() {
    }

    public void a0() {
    }

    public void R(RecyclerView recyclerView) {
    }

    public void g0(Parcelable parcelable) {
    }

    public void i0(int i) {
    }

    public void Y(View view, int i) {
    }

    public void Z(int i, int i10) {
    }

    public void b0(int i, int i10) {
    }

    public void c0(int i, int i10) {
    }

    public void d0(int i, int i10) {
    }

    public void i(int i, l lVar) {
    }

    public void h(int i, int i10, v0 v0Var, l lVar) {
    }
}
