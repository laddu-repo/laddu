package w4;

import a2.a2;
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
import com.google.protobuf.CodedOutputStream;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class s0 {

    /* renamed from: a, reason: collision with root package name */
    public n9.j f14004a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f14005b;

    /* renamed from: c, reason: collision with root package name */
    public final s8.l f14006c;

    /* renamed from: d, reason: collision with root package name */
    public final s8.l f14007d;

    /* renamed from: e, reason: collision with root package name */
    public c0 f14008e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14009f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f14010g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f14011h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f14012i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f14013k;

    /* renamed from: l, reason: collision with root package name */
    public int f14014l;

    /* renamed from: m, reason: collision with root package name */
    public int f14015m;

    /* renamed from: n, reason: collision with root package name */
    public int f14016n;

    /* renamed from: o, reason: collision with root package name */
    public int f14017o;

    public s0() {
        lc.c cVar = new lc.c(this);
        q0 q0Var = new q0(this);
        this.f14006c = new s8.l((q1) cVar);
        this.f14007d = new s8.l((q1) q0Var);
        this.f14009f = false;
        this.f14010g = false;
        this.f14011h = true;
        this.f14012i = true;
    }

    public static int A(View view) {
        Rect rect = ((t0) view.getLayoutParams()).f14021b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int H(View view) {
        return ((t0) view.getLayoutParams()).f14020a.c();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w4.r0] */
    public static r0 I(Context context, AttributeSet attributeSet, int i6, int i10) {
        ?? obj = new Object();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v4.a.f13294a, i6, i10);
        obj.f13995a = obtainStyledAttributes.getInt(0, 1);
        obj.f13996b = obtainStyledAttributes.getInt(10, 1);
        obj.f13997c = obtainStyledAttributes.getBoolean(9, false);
        obj.f13998d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return obj;
    }

    public static boolean M(int i6, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (i11 > 0 && i6 != i11) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode != 1073741824 || size != i6) {
                return false;
            }
            return true;
        }
        if (size < i6) {
            return false;
        }
        return true;
    }

    public static void N(View view, int i6, int i10, int i11, int i12) {
        t0 t0Var = (t0) view.getLayoutParams();
        Rect rect = t0Var.f14021b;
        view.layout(i6 + rect.left + ((ViewGroup.MarginLayoutParams) t0Var).leftMargin, i10 + rect.top + ((ViewGroup.MarginLayoutParams) t0Var).topMargin, (i11 - rect.right) - ((ViewGroup.MarginLayoutParams) t0Var).rightMargin, (i12 - rect.bottom) - ((ViewGroup.MarginLayoutParams) t0Var).bottomMargin);
    }

    public static int g(int i6, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i6);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                return Math.max(i10, i11);
            }
            return size;
        }
        return Math.min(size, Math.max(i10, i11));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
    
        if (r5 == 1073741824) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int w(int r4, int r5, int r6, int r7, boolean r8) {
        /*
            int r4 = r4 - r6
            r6 = 0
            int r4 = java.lang.Math.max(r6, r4)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L1e
            if (r7 < 0) goto L13
        L10:
            r5 = 1073741824(0x40000000, float:2.0)
            goto L31
        L13:
            if (r7 != r1) goto L1b
            if (r5 == r2) goto L23
            if (r5 == 0) goto L1b
            if (r5 == r3) goto L23
        L1b:
            r5 = 0
            r7 = 0
            goto L31
        L1e:
            if (r7 < 0) goto L21
            goto L10
        L21:
            if (r7 != r1) goto L25
        L23:
            r7 = r4
            goto L31
        L25:
            if (r7 != r0) goto L1b
            if (r5 == r2) goto L2e
            if (r5 != r3) goto L2c
            goto L2e
        L2c:
            r5 = 0
            goto L23
        L2e:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L23
        L31:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.s0.w(int, int, int, int, boolean):int");
    }

    public static int z(View view) {
        Rect rect = ((t0) view.getLayoutParams()).f14021b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public final void A0(c0 c0Var) {
        c0 c0Var2 = this.f14008e;
        if (c0Var2 != null && c0Var != c0Var2 && c0Var2.f13827e) {
            c0Var2.i();
        }
        this.f14008e = c0Var;
        RecyclerView recyclerView = this.f14005b;
        h1 h1Var = recyclerView.A0;
        h1Var.D.removeCallbacks(h1Var);
        h1Var.f13885z.abortAnimation();
        if (c0Var.f13830h) {
            Log.w("RecyclerView", "An instance of " + c0Var.getClass().getSimpleName() + " was started more than once. Each instance of" + c0Var.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        c0Var.f13824b = recyclerView;
        c0Var.f13825c = this;
        int i6 = c0Var.f13823a;
        if (i6 != -1) {
            recyclerView.D0.f13857a = i6;
            c0Var.f13827e = true;
            c0Var.f13826d = true;
            c0Var.f13828f = recyclerView.K.q(i6);
            c0Var.f13824b.A0.b();
            c0Var.f13830h = true;
            return;
        }
        throw new IllegalArgumentException("Invalid target position");
    }

    public final int B() {
        k0 k0Var;
        RecyclerView recyclerView = this.f14005b;
        if (recyclerView != null) {
            k0Var = recyclerView.getAdapter();
        } else {
            k0Var = null;
        }
        if (k0Var != null) {
            return k0Var.a();
        }
        return 0;
    }

    public boolean B0() {
        return false;
    }

    public final int C() {
        RecyclerView recyclerView = this.f14005b;
        WeakHashMap weakHashMap = t0.q0.f12397a;
        return recyclerView.getLayoutDirection();
    }

    public final int D() {
        RecyclerView recyclerView = this.f14005b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f14005b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.f14005b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int G() {
        RecyclerView recyclerView = this.f14005b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int J(y0 y0Var, e1 e1Var) {
        return -1;
    }

    public final void K(Rect rect, View view) {
        Matrix matrix;
        Rect rect2 = ((t0) view.getLayoutParams()).f14021b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f14005b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f14005b.I;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean L();

    public void O(int i6) {
        RecyclerView recyclerView = this.f14005b;
        if (recyclerView != null) {
            int s = recyclerView.C.s();
            for (int i10 = 0; i10 < s; i10++) {
                recyclerView.C.q(i10).offsetLeftAndRight(i6);
            }
        }
    }

    public void P(int i6) {
        RecyclerView recyclerView = this.f14005b;
        if (recyclerView != null) {
            int s = recyclerView.C.s();
            for (int i10 = 0; i10 < s; i10++) {
                recyclerView.C.q(i10).offsetTopAndBottom(i6);
            }
        }
    }

    public abstract void S(RecyclerView recyclerView);

    public abstract View T(View view, int i6, y0 y0Var, e1 e1Var);

    public void U(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f14005b;
        y0 y0Var = recyclerView.f1148z;
        if (accessibilityEvent != null) {
            boolean z10 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f14005b.canScrollVertically(-1) && !this.f14005b.canScrollHorizontally(-1) && !this.f14005b.canScrollHorizontally(1)) {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            k0 k0Var = this.f14005b.J;
            if (k0Var != null) {
                accessibilityEvent.setItemCount(k0Var.a());
            }
        }
    }

    public void V(y0 y0Var, e1 e1Var, u0.c cVar) {
        if (this.f14005b.canScrollVertically(-1) || this.f14005b.canScrollHorizontally(-1)) {
            cVar.a(8192);
            cVar.k(true);
        }
        if (this.f14005b.canScrollVertically(1) || this.f14005b.canScrollHorizontally(1)) {
            cVar.a(CodedOutputStream.DEFAULT_BUFFER_SIZE);
            cVar.k(true);
        }
        cVar.f12745a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(J(y0Var, e1Var), x(y0Var, e1Var), false, 0));
    }

    public final void W(View view, u0.c cVar) {
        i1 J = RecyclerView.J(view);
        if (J != null && !J.i()) {
            n9.j jVar = this.f14004a;
            if (!((ArrayList) jVar.A).contains(J.f13897a)) {
                RecyclerView recyclerView = this.f14005b;
                X(recyclerView.f1148z, recyclerView.D0, view, cVar);
            }
        }
    }

    public final void b(View view, int i6, boolean z10) {
        int G;
        i1 J = RecyclerView.J(view);
        if (!z10 && !J.i()) {
            this.f14005b.D.u(J);
        } else {
            v.l lVar = (v.l) this.f14005b.D.f12251y;
            r1 r1Var = (r1) lVar.get(J);
            if (r1Var == null) {
                r1Var = r1.a();
                lVar.put(J, r1Var);
            }
            r1Var.f14000a |= 1;
        }
        t0 t0Var = (t0) view.getLayoutParams();
        if (!J.q() && !J.j()) {
            int i10 = -1;
            if (view.getParent() == this.f14005b) {
                n9.j jVar = this.f14004a;
                d2.i iVar = (d2.i) jVar.f9356z;
                int indexOfChild = ((RecyclerView) ((a2) jVar.f9355y).f162y).indexOfChild(view);
                if (indexOfChild == -1 || iVar.I(indexOfChild)) {
                    G = -1;
                } else {
                    G = indexOfChild - iVar.G(indexOfChild);
                }
                if (i6 == -1) {
                    i6 = this.f14004a.s();
                }
                if (G != -1) {
                    if (G != i6) {
                        s0 s0Var = this.f14005b.K;
                        View u3 = s0Var.u(G);
                        if (u3 != null) {
                            s0Var.u(G);
                            s0Var.f14004a.n(G);
                            t0 t0Var2 = (t0) u3.getLayoutParams();
                            i1 J2 = RecyclerView.J(u3);
                            if (J2.i()) {
                                v.l lVar2 = (v.l) s0Var.f14005b.D.f12251y;
                                r1 r1Var2 = (r1) lVar2.get(J2);
                                if (r1Var2 == null) {
                                    r1Var2 = r1.a();
                                    lVar2.put(J2, r1Var2);
                                }
                                r1Var2.f14000a = 1 | r1Var2.f14000a;
                            } else {
                                s0Var.f14005b.D.u(J2);
                            }
                            s0Var.f14004a.i(u3, i6, t0Var2, J2.i());
                        } else {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + G + s0Var.f14005b.toString());
                        }
                    }
                } else {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f14005b.indexOfChild(view) + this.f14005b.z());
                }
            } else {
                this.f14004a.g(view, i6, false);
                t0Var.f14022c = true;
                c0 c0Var = this.f14008e;
                if (c0Var != null && c0Var.f13827e) {
                    c0Var.f13824b.getClass();
                    i1 J3 = RecyclerView.J(view);
                    if (J3 != null) {
                        i10 = J3.c();
                    }
                    if (i10 == c0Var.f13823a) {
                        c0Var.f13828f = view;
                    }
                }
            }
        } else {
            if (J.j()) {
                J.f13909n.m(J);
            } else {
                J.j &= -33;
            }
            this.f14004a.i(view, i6, view.getLayoutParams(), false);
        }
        if (t0Var.f14023d) {
            J.f13897a.invalidate();
            t0Var.f14023d = false;
        }
    }

    public void c(String str) {
        RecyclerView recyclerView = this.f14005b;
        if (recyclerView != null) {
            recyclerView.i(str);
        }
    }

    public abstract boolean d();

    public abstract void d0(y0 y0Var, e1 e1Var);

    public abstract boolean e();

    public abstract void e0(e1 e1Var);

    public boolean f(t0 t0Var) {
        if (t0Var != null) {
            return true;
        }
        return false;
    }

    public Parcelable g0() {
        return null;
    }

    public final void i0(y0 y0Var) {
        for (int v10 = v() - 1; v10 >= 0; v10--) {
            if (!RecyclerView.J(u(v10)).p()) {
                View u3 = u(v10);
                l0(v10);
                y0Var.i(u3);
            }
        }
    }

    public abstract int j(e1 e1Var);

    public final void j0(y0 y0Var) {
        ArrayList arrayList = y0Var.f14074a;
        int size = arrayList.size();
        for (int i6 = size - 1; i6 >= 0; i6--) {
            View view = ((i1) arrayList.get(i6)).f13897a;
            i1 J = RecyclerView.J(view);
            if (!J.p()) {
                J.o(false);
                if (J.k()) {
                    this.f14005b.removeDetachedView(view, false);
                }
                o0 o0Var = this.f14005b.f1133l0;
                if (o0Var != null) {
                    o0Var.d(J);
                }
                J.o(true);
                i1 J2 = RecyclerView.J(view);
                J2.f13909n = null;
                J2.f13910o = false;
                J2.j &= -33;
                y0Var.j(J2);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = y0Var.f14075b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f14005b.invalidate();
        }
    }

    public abstract int k(e1 e1Var);

    public final void k0(View view, y0 y0Var) {
        n9.j jVar = this.f14004a;
        a2 a2Var = (a2) jVar.f9355y;
        int indexOfChild = ((RecyclerView) a2Var.f162y).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((d2.i) jVar.f9356z).K(indexOfChild)) {
                jVar.I(view);
            }
            a2Var.Q(indexOfChild);
        }
        y0Var.i(view);
    }

    public abstract int l(e1 e1Var);

    public final void l0(int i6) {
        if (u(i6) != null) {
            n9.j jVar = this.f14004a;
            int y9 = jVar.y(i6);
            a2 a2Var = (a2) jVar.f9355y;
            View childAt = ((RecyclerView) a2Var.f162y).getChildAt(y9);
            if (childAt != null) {
                if (((d2.i) jVar.f9356z).K(y9)) {
                    jVar.I(childAt);
                }
                a2Var.Q(y9);
            }
        }
    }

    public abstract int m(e1 e1Var);

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if ((r5.bottom - r10) > r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.E()
            int r1 = r8.G()
            int r2 = r8.f14016n
            int r3 = r8.F()
            int r2 = r2 - r3
            int r3 = r8.f14017o
            int r4 = r8.D()
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
            int r3 = r8.C()
            r7 = 1
            if (r3 != r7) goto L5c
            if (r2 == 0) goto L57
            goto L64
        L57:
            int r2 = java.lang.Math.max(r6, r10)
            goto L64
        L5c:
            if (r6 == 0) goto L5f
            goto L63
        L5f:
            int r6 = java.lang.Math.min(r4, r2)
        L63:
            r2 = r6
        L64:
            if (r1 == 0) goto L67
            goto L6b
        L67:
            int r1 = java.lang.Math.min(r5, r11)
        L6b:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lae
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L7c
            goto Lb3
        L7c:
            int r1 = r8.E()
            int r2 = r8.G()
            int r3 = r8.f14016n
            int r4 = r8.F()
            int r3 = r3 - r4
            int r4 = r8.f14017o
            int r5 = r8.D()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.f14005b
            android.graphics.Rect r5 = r5.G
            r8.y(r5, r13)
            int r13 = r5.left
            int r13 = r13 - r11
            if (r13 >= r3) goto Lb3
            int r13 = r5.right
            int r13 = r13 - r11
            if (r13 <= r1) goto Lb3
            int r13 = r5.top
            int r13 = r13 - r10
            if (r13 >= r4) goto Lb3
            int r13 = r5.bottom
            int r13 = r13 - r10
            if (r13 > r2) goto Lae
            goto Lb3
        Lae:
            if (r11 != 0) goto Lb4
            if (r10 == 0) goto Lb3
            goto Lb4
        Lb3:
            return r0
        Lb4:
            if (r12 == 0) goto Lba
            r9.scrollBy(r11, r10)
            return r7
        Lba:
            r9.h0(r0, r11, r10)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.s0.m0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public abstract int n(e1 e1Var);

    public final void n0() {
        RecyclerView recyclerView = this.f14005b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int o(e1 e1Var);

    public abstract int o0(int i6, y0 y0Var, e1 e1Var);

    public final void p(y0 y0Var) {
        for (int v10 = v() - 1; v10 >= 0; v10--) {
            View u3 = u(v10);
            i1 J = RecyclerView.J(u3);
            if (!J.p()) {
                if (J.g() && !J.i() && !this.f14005b.J.f13930y) {
                    l0(v10);
                    y0Var.j(J);
                } else {
                    u(v10);
                    this.f14004a.n(v10);
                    y0Var.k(u3);
                    this.f14005b.D.u(J);
                }
            }
        }
    }

    public abstract void p0(int i6);

    public View q(int i6) {
        int v10 = v();
        for (int i10 = 0; i10 < v10; i10++) {
            View u3 = u(i10);
            i1 J = RecyclerView.J(u3);
            if (J != null && J.c() == i6 && !J.p() && (this.f14005b.D0.f13863g || !J.i())) {
                return u3;
            }
        }
        return null;
    }

    public abstract int q0(int i6, y0 y0Var, e1 e1Var);

    public abstract t0 r();

    public final void r0(RecyclerView recyclerView) {
        s0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public t0 s(Context context, AttributeSet attributeSet) {
        return new t0(context, attributeSet);
    }

    public final void s0(int i6, int i10) {
        this.f14016n = View.MeasureSpec.getSize(i6);
        int mode = View.MeasureSpec.getMode(i6);
        this.f14014l = mode;
        if (mode == 0 && !RecyclerView.Y0) {
            this.f14016n = 0;
        }
        this.f14017o = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i10);
        this.f14015m = mode2;
        if (mode2 == 0 && !RecyclerView.Y0) {
            this.f14017o = 0;
        }
    }

    public t0 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof t0) {
            return new t0((t0) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new t0((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new t0(layoutParams);
    }

    public void t0(Rect rect, int i6, int i10) {
        int F = F() + E() + rect.width();
        int D = D() + G() + rect.height();
        RecyclerView recyclerView = this.f14005b;
        WeakHashMap weakHashMap = t0.q0.f12397a;
        this.f14005b.setMeasuredDimension(g(i6, F, recyclerView.getMinimumWidth()), g(i10, D, this.f14005b.getMinimumHeight()));
    }

    public final View u(int i6) {
        n9.j jVar = this.f14004a;
        if (jVar != null) {
            return jVar.q(i6);
        }
        return null;
    }

    public final void u0(int i6, int i10) {
        int v10 = v();
        if (v10 == 0) {
            this.f14005b.o(i6, i10);
            return;
        }
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MIN_VALUE;
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MAX_VALUE;
        for (int i15 = 0; i15 < v10; i15++) {
            View u3 = u(i15);
            Rect rect = this.f14005b.G;
            y(rect, u3);
            int i16 = rect.left;
            if (i16 < i13) {
                i13 = i16;
            }
            int i17 = rect.right;
            if (i17 > i11) {
                i11 = i17;
            }
            int i18 = rect.top;
            if (i18 < i14) {
                i14 = i18;
            }
            int i19 = rect.bottom;
            if (i19 > i12) {
                i12 = i19;
            }
        }
        this.f14005b.G.set(i13, i14, i11, i12);
        t0(this.f14005b.G, i6, i10);
    }

    public final int v() {
        n9.j jVar = this.f14004a;
        if (jVar != null) {
            return jVar.s();
        }
        return 0;
    }

    public final void v0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f14005b = null;
            this.f14004a = null;
            this.f14016n = 0;
            this.f14017o = 0;
        } else {
            this.f14005b = recyclerView;
            this.f14004a = recyclerView.C;
            this.f14016n = recyclerView.getWidth();
            this.f14017o = recyclerView.getHeight();
        }
        this.f14014l = 1073741824;
        this.f14015m = 1073741824;
    }

    public final boolean w0(View view, int i6, int i10, t0 t0Var) {
        if (!view.isLayoutRequested() && this.f14011h && M(view.getWidth(), i6, ((ViewGroup.MarginLayoutParams) t0Var).width) && M(view.getHeight(), i10, ((ViewGroup.MarginLayoutParams) t0Var).height)) {
            return false;
        }
        return true;
    }

    public int x(y0 y0Var, e1 e1Var) {
        return -1;
    }

    public boolean x0() {
        return false;
    }

    public void y(Rect rect, View view) {
        int[] iArr = RecyclerView.W0;
        t0 t0Var = (t0) view.getLayoutParams();
        Rect rect2 = t0Var.f14021b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) t0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) t0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) t0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) t0Var).bottomMargin);
    }

    public final boolean y0(View view, int i6, int i10, t0 t0Var) {
        if (this.f14011h && M(view.getMeasuredWidth(), i6, ((ViewGroup.MarginLayoutParams) t0Var).width) && M(view.getMeasuredHeight(), i10, ((ViewGroup.MarginLayoutParams) t0Var).height)) {
            return false;
        }
        return true;
    }

    public abstract void z0(RecyclerView recyclerView, int i6);

    public void Q() {
    }

    public void Z() {
    }

    public void R(RecyclerView recyclerView) {
    }

    public void f0(Parcelable parcelable) {
    }

    public void h0(int i6) {
    }

    public void Y(int i6, int i10) {
    }

    public void a0(int i6, int i10) {
    }

    public void b0(int i6, int i10) {
    }

    public void c0(int i6, int i10) {
    }

    public void i(int i6, v.h hVar) {
    }

    public void X(y0 y0Var, e1 e1Var, View view, u0.c cVar) {
    }

    public void h(int i6, int i10, e1 e1Var, v.h hVar) {
    }
}
