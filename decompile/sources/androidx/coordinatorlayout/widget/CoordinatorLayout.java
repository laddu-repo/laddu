package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.x0;
import b2.j;
import cg.h;
import com.playfy.tv.R;
import com.unity3d.services.UnityAdsConstants;
import e0.a;
import f0.b;
import f0.e;
import f0.f;
import f0.g;
import ic.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import k7.c;
import s0.d;
import t0.f0;
import t0.h0;
import t0.q;
import t0.q0;
import t0.r;
import t0.w1;
import v.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements q, r {
    public static final String Q;
    public static final Class[] R;
    public static final ThreadLocal S;
    public static final h T;
    public static final d U;
    public final ArrayList A;
    public final int[] B;
    public final int[] C;
    public boolean D;
    public boolean E;
    public final int[] F;
    public View G;
    public View H;
    public f I;
    public boolean J;
    public w1 K;
    public boolean L;
    public Drawable M;
    public ViewGroup.OnHierarchyChangeListener N;
    public c O;
    public final j P;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f846x;

    /* renamed from: y, reason: collision with root package name */
    public final s f847y;

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f848z;

    static {
        String str;
        Package r02 = CoordinatorLayout.class.getPackage();
        if (r02 != null) {
            str = r02.getName();
        } else {
            str = null;
        }
        Q = str;
        T = new h(5);
        R = new Class[]{Context.class, AttributeSet.class};
        S = new ThreadLocal();
        U = new d(12);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [b2.j, java.lang.Object] */
    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f846x = new ArrayList();
        this.f847y = new s(5);
        this.f848z = new ArrayList();
        this.A = new ArrayList();
        this.B = new int[2];
        this.C = new int[2];
        this.P = new Object();
        int[] iArr = a.f4147a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            x0.s(this, context, iArr, attributeSet, obtainStyledAttributes);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.F = intArray;
            float f3 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i6 = 0; i6 < length; i6++) {
                this.F[i6] = (int) (r1[i6] * f3);
            }
        }
        this.M = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        y();
        super.setOnHierarchyChangeListener(new f0.d(this));
        WeakHashMap weakHashMap = q0.f12397a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) U.a();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    public static void m(int i6, Rect rect, Rect rect2, e eVar, int i10, int i11) {
        int width;
        int height;
        int i12 = eVar.f4613c;
        if (i12 == 0) {
            i12 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i12, i6);
        int i13 = eVar.f4614d;
        if ((i13 & 7) == 0) {
            i13 |= 8388611;
        }
        if ((i13 & 112) == 0) {
            i13 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i13, i6);
        int i14 = absoluteGravity & 7;
        int i15 = absoluteGravity & 112;
        int i16 = absoluteGravity2 & 7;
        int i17 = absoluteGravity2 & 112;
        if (i16 != 1) {
            if (i16 != 5) {
                width = rect.left;
            } else {
                width = rect.right;
            }
        } else {
            width = rect.left + (rect.width() / 2);
        }
        if (i17 != 16) {
            if (i17 != 80) {
                height = rect.top;
            } else {
                height = rect.bottom;
            }
        } else {
            height = rect.top + (rect.height() / 2);
        }
        if (i14 != 1) {
            if (i14 != 5) {
                width -= i10;
            }
        } else {
            width -= i10 / 2;
        }
        if (i15 != 16) {
            if (i15 != 80) {
                height -= i11;
            }
        } else {
            height -= i11 / 2;
        }
        rect2.set(width, height, i10 + width, i11 + height);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e o(View view) {
        e eVar = (e) view.getLayoutParams();
        if (!eVar.f4612b) {
            if (view instanceof f0.a) {
                b behavior = ((f0.a) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                b bVar = eVar.f4611a;
                if (bVar != behavior) {
                    if (bVar != null) {
                        bVar.f();
                    }
                    eVar.f4611a = behavior;
                    eVar.f4612b = true;
                    if (behavior != null) {
                        behavior.c(eVar);
                    }
                }
                eVar.f4612b = true;
                return eVar;
            }
            f0.c cVar = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                cVar = (f0.c) cls.getAnnotation(f0.c.class);
                if (cVar != null) {
                    break;
                }
            }
            if (cVar != null) {
                try {
                    b bVar2 = (b) cVar.value().getDeclaredConstructor(null).newInstance(null);
                    b bVar3 = eVar.f4611a;
                    if (bVar3 != bVar2) {
                        if (bVar3 != null) {
                            bVar3.f();
                        }
                        eVar.f4611a = bVar2;
                        eVar.f4612b = true;
                        if (bVar2 != null) {
                            bVar2.c(eVar);
                        }
                    }
                } catch (Exception e10) {
                    Log.e("CoordinatorLayout", "Default behavior class " + cVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e10);
                }
            }
            eVar.f4612b = true;
        }
        return eVar;
    }

    public static void w(View view, int i6) {
        e eVar = (e) view.getLayoutParams();
        int i10 = eVar.f4619i;
        if (i10 != i6) {
            q0.k(view, i6 - i10);
            eVar.f4619i = i6;
        }
    }

    public static void x(View view, int i6) {
        e eVar = (e) view.getLayoutParams();
        int i10 = eVar.j;
        if (i10 != i6) {
            q0.l(view, i6 - i10);
            eVar.j = i6;
        }
    }

    @Override // t0.r
    public final void a(View view, int i6, int i10, int i11, int i12, int i13, int[] iArr) {
        b bVar;
        int childCount = getChildCount();
        int i14 = 0;
        int i15 = 0;
        boolean z10 = false;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i13) && (bVar = eVar.f4611a) != null) {
                    int[] iArr2 = this.B;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.l(this, childAt, i10, i11, i12, iArr2);
                    if (i11 > 0) {
                        i14 = Math.max(i14, iArr2[0]);
                    } else {
                        i14 = Math.min(i14, iArr2[0]);
                    }
                    if (i12 > 0) {
                        i15 = Math.max(i15, iArr2[1]);
                    } else {
                        i15 = Math.min(i15, iArr2[1]);
                    }
                    z10 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i14;
        iArr[1] = iArr[1] + i15;
        if (z10) {
            q(1);
        }
    }

    @Override // t0.q
    public final void b(View view, int i6, int i10, int i11, int i12, int i13) {
        a(view, i6, i10, i11, i12, 0, this.C);
    }

    @Override // t0.q
    public final boolean c(View view, View view2, int i6, int i10) {
        View view3;
        int i11;
        int i12;
        int childCount = getChildCount();
        int i13 = 0;
        boolean z10 = false;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() == 8) {
                view3 = view;
                i11 = i6;
                i12 = i10;
            } else {
                e eVar = (e) childAt.getLayoutParams();
                b bVar = eVar.f4611a;
                if (bVar != null) {
                    view3 = view;
                    i11 = i6;
                    i12 = i10;
                    boolean p10 = bVar.p(this, childAt, view3, i11, i12);
                    z10 |= p10;
                    if (i12 != 0) {
                        if (i12 == 1) {
                            eVar.f4623n = p10;
                        }
                    } else {
                        eVar.f4622m = p10;
                    }
                } else {
                    view3 = view;
                    i11 = i6;
                    i12 = i10;
                    if (i12 != 0) {
                        if (i12 == 1) {
                            eVar.f4623n = false;
                        }
                    } else {
                        eVar.f4622m = false;
                    }
                }
            }
            i13++;
            view = view3;
            i6 = i11;
            i10 = i12;
        }
        return z10;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof e) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // t0.q
    public final void d(View view, View view2, int i6, int i10) {
        j jVar = this.P;
        if (i10 == 1) {
            jVar.f1381b = i6;
        } else {
            jVar.f1380a = i6;
        }
        this.H = view2;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ((e) getChildAt(i11).getLayoutParams()).getClass();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        b bVar = ((e) view.getLayoutParams()).f4611a;
        if (bVar != null) {
            bVar.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z10;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.M;
        if (drawable != null && drawable.isStateful()) {
            z10 = drawable.setState(drawableState);
        } else {
            z10 = false;
        }
        if (z10) {
            invalidate();
        }
    }

    @Override // t0.q
    public final void e(View view, int i6) {
        j jVar = this.P;
        if (i6 == 1) {
            jVar.f1381b = 0;
        } else {
            jVar.f1380a = 0;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.a(i6)) {
                b bVar = eVar.f4611a;
                if (bVar != null) {
                    bVar.q(this, childAt, view, i6);
                }
                if (i6 != 0) {
                    if (i6 == 1) {
                        eVar.f4623n = false;
                    }
                } else {
                    eVar.f4622m = false;
                }
                eVar.f4624o = false;
            }
        }
        this.H = null;
    }

    @Override // t0.q
    public final void f(View view, int i6, int i10, int[] iArr, int i11) {
        b bVar;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i11) && (bVar = eVar.f4611a) != null) {
                    int[] iArr2 = this.B;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.k(this, childAt, view, i6, i10, iArr2, i11);
                    if (i6 > 0) {
                        min = Math.max(i12, iArr2[0]);
                    } else {
                        min = Math.min(i12, iArr2[0]);
                    }
                    i12 = min;
                    if (i10 > 0) {
                        min2 = Math.max(i13, iArr2[1]);
                    } else {
                        min2 = Math.min(i13, iArr2[1]);
                    }
                    i13 = min2;
                    z10 = true;
                }
            }
        }
        iArr[0] = i12;
        iArr[1] = i13;
        if (z10) {
            q(1);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        u();
        return Collections.unmodifiableList(this.f846x);
    }

    public final w1 getLastWindowInsets() {
        return this.K;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        j jVar = this.P;
        return jVar.f1381b | jVar.f1380a;
    }

    public Drawable getStatusBarBackground() {
        return this.M;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(e eVar, Rect rect, int i6, int i10) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i6) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i10) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin));
        rect.set(max, max2, i6 + max, i10 + max2);
    }

    public final void i(View view) {
        List list = (List) ((l) this.f847y.f6782y).get(view);
        if (list != null && !list.isEmpty()) {
            for (int i6 = 0; i6 < list.size(); i6++) {
                View view2 = (View) list.get(i6);
                b bVar = ((e) view2.getLayoutParams()).f4611a;
                if (bVar != null) {
                    bVar.d(this, view2, view);
                }
            }
        }
    }

    public final void j(View view, Rect rect, boolean z10) {
        if (!view.isLayoutRequested() && view.getVisibility() != 8) {
            if (z10) {
                l(rect, view);
                return;
            } else {
                rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                return;
            }
        }
        rect.setEmpty();
    }

    public final ArrayList k(View view) {
        l lVar = (l) this.f847y.f6782y;
        int i6 = lVar.f13174z;
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < i6; i10++) {
            ArrayList arrayList2 = (ArrayList) lVar.i(i10);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lVar.f(i10));
            }
        }
        ArrayList arrayList3 = this.A;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void l(Rect rect, View view) {
        ThreadLocal threadLocal = f0.h.f4628a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = f0.h.f4628a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        f0.h.a(this, view, matrix);
        ThreadLocal threadLocal3 = f0.h.f4629b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int n(int i6) {
        int[] iArr = this.F;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i6);
            return 0;
        }
        if (i6 >= 0 && i6 < iArr.length) {
            return iArr[i6];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i6 + " out of range for " + this);
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v(false);
        if (this.J) {
            if (this.I == null) {
                this.I = new f(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.I);
        }
        if (this.K == null) {
            WeakHashMap weakHashMap = q0.f12397a;
            if (getFitsSystemWindows()) {
                f0.c(this);
            }
        }
        this.E = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v(false);
        if (this.J && this.I != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.I);
        }
        View view = this.H;
        if (view != null) {
            e(view, 0);
        }
        this.E = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i6;
        super.onDraw(canvas);
        if (this.L && this.M != null) {
            w1 w1Var = this.K;
            if (w1Var != null) {
                i6 = w1Var.d();
            } else {
                i6 = 0;
            }
            if (i6 > 0) {
                this.M.setBounds(0, 0, getWidth(), i6);
                this.M.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            v(true);
        }
        boolean t10 = t(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return t10;
        }
        v(true);
        return t10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        b bVar;
        WeakHashMap weakHashMap = q0.f12397a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f846x;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            View view = (View) arrayList.get(i13);
            if (view.getVisibility() != 8 && ((bVar = ((e) view.getLayoutParams()).f4611a) == null || !bVar.h(this, view, layoutDirection))) {
                r(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r27, int r28) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f3, float f10, boolean z10) {
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(0)) {
                    b bVar = eVar.f4611a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f3, float f10) {
        b bVar;
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(0) && (bVar = eVar.f4611a) != null) {
                    z10 |= bVar.j(view);
                }
            }
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i6, int i10, int[] iArr) {
        f(view, i6, i10, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i6, int i10, int i11, int i12) {
        b(view, i6, i10, i11, i12, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i6) {
        d(view, view2, i6, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.f15113x);
        SparseArray sparseArray = gVar.f4627z;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            int id2 = childAt.getId();
            b bVar = o(childAt).f4611a;
            if (id2 != -1 && bVar != null && (parcelable2 = (Parcelable) sparseArray.get(id2)) != null) {
                bVar.n(childAt, parcelable2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z0.b, android.os.Parcelable, f0.g] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable o10;
        ?? bVar = new z0.b(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            int id2 = childAt.getId();
            b bVar2 = ((e) childAt.getLayoutParams()).f4611a;
            if (id2 != -1 && bVar2 != null && (o10 = bVar2.o(childAt)) != null) {
                sparseArray.append(id2, o10);
            }
        }
        bVar.f4627z = sparseArray;
        return bVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i6) {
        return c(view, view2, i6, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        e(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r1.getActionMasked()
            android.view.View r3 = r0.G
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.t(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = 0
            goto L2a
        L17:
            r3 = 0
        L18:
            android.view.View r6 = r0.G
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            f0.e r6 = (f0.e) r6
            f0.b r6 = r6.f4611a
            if (r6 == 0) goto L15
            android.view.View r7 = r0.G
            boolean r6 = r6.r(r0, r7, r1)
        L2a:
            android.view.View r7 = r0.G
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r9 = android.os.SystemClock.uptimeMillis()
            r15 = 0
            r16 = 0
            r13 = 3
            r14 = 0
            r11 = r9
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L53
            goto L54
        L53:
            return r6
        L54:
            r0.v(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean p(View view, int i6, int i10) {
        d dVar = U;
        Rect g10 = g();
        l(g10, view);
        try {
            return g10.contains(i6, i10);
        } finally {
            g10.setEmpty();
            dVar.c(g10);
        }
    }

    public final void q(int i6) {
        int i10;
        Rect rect;
        int i11;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        boolean z12;
        int width;
        int i12;
        int i13;
        int i14;
        int height;
        int i15;
        int i16;
        int i17;
        ArrayList arrayList2;
        e eVar;
        int i18;
        int i19;
        Rect rect2;
        int i20;
        View view;
        boolean z13;
        b bVar;
        WeakHashMap weakHashMap = q0.f12397a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList3 = this.f846x;
        int size = arrayList3.size();
        Rect g10 = g();
        Rect g11 = g();
        Rect g12 = g();
        int i21 = 0;
        while (true) {
            d dVar = U;
            if (i21 < size) {
                View view2 = (View) arrayList3.get(i21);
                e eVar2 = (e) view2.getLayoutParams();
                if (i6 == 0 && view2.getVisibility() == 8) {
                    arrayList = arrayList3;
                    i11 = size;
                    rect = g12;
                    i10 = i21;
                } else {
                    int i22 = 0;
                    while (i22 < i21) {
                        if (eVar2.f4621l == ((View) arrayList3.get(i22))) {
                            e eVar3 = (e) view2.getLayoutParams();
                            if (eVar3.f4620k != null) {
                                Rect g13 = g();
                                Rect g14 = g();
                                e eVar4 = eVar2;
                                Rect g15 = g();
                                l(g13, eVar3.f4620k);
                                j(view2, g14, false);
                                int measuredWidth = view2.getMeasuredWidth();
                                View view3 = view2;
                                int measuredHeight = view3.getMeasuredHeight();
                                arrayList2 = arrayList3;
                                eVar = eVar4;
                                i18 = i22;
                                layoutDirection = layoutDirection;
                                i20 = i21;
                                view = view3;
                                m(layoutDirection, g13, g15, eVar3, measuredWidth, measuredHeight);
                                i19 = size;
                                rect2 = g12;
                                if (g15.left == g14.left && g15.top == g14.top) {
                                    z13 = false;
                                } else {
                                    z13 = true;
                                }
                                h(eVar3, g15, measuredWidth, measuredHeight);
                                int i23 = g15.left - g14.left;
                                int i24 = g15.top - g14.top;
                                if (i23 != 0) {
                                    q0.k(view, i23);
                                }
                                if (i24 != 0) {
                                    q0.l(view, i24);
                                }
                                if (z13 && (bVar = eVar3.f4611a) != null) {
                                    bVar.d(this, view, eVar3.f4620k);
                                }
                                g13.setEmpty();
                                dVar.c(g13);
                                g14.setEmpty();
                                dVar.c(g14);
                                g15.setEmpty();
                                dVar.c(g15);
                                i22 = i18 + 1;
                                eVar2 = eVar;
                                view2 = view;
                                arrayList3 = arrayList2;
                                size = i19;
                                i21 = i20;
                                g12 = rect2;
                            }
                        }
                        arrayList2 = arrayList3;
                        eVar = eVar2;
                        i18 = i22;
                        i19 = size;
                        rect2 = g12;
                        i20 = i21;
                        view = view2;
                        i22 = i18 + 1;
                        eVar2 = eVar;
                        view2 = view;
                        arrayList3 = arrayList2;
                        size = i19;
                        i21 = i20;
                        g12 = rect2;
                    }
                    ArrayList arrayList4 = arrayList3;
                    e eVar5 = eVar2;
                    int i25 = size;
                    Rect rect3 = g12;
                    i10 = i21;
                    View view4 = view2;
                    j(view4, g11, true);
                    if (eVar5.f4617g != 0 && !g11.isEmpty()) {
                        int absoluteGravity = Gravity.getAbsoluteGravity(eVar5.f4617g, layoutDirection);
                        int i26 = absoluteGravity & 112;
                        if (i26 != 48) {
                            if (i26 == 80) {
                                g10.bottom = Math.max(g10.bottom, getHeight() - g11.top);
                            }
                        } else {
                            g10.top = Math.max(g10.top, g11.bottom);
                        }
                        int i27 = absoluteGravity & 7;
                        if (i27 != 3) {
                            if (i27 == 5) {
                                g10.right = Math.max(g10.right, getWidth() - g11.left);
                            }
                        } else {
                            g10.left = Math.max(g10.left, g11.right);
                        }
                    }
                    if (eVar5.f4618h != 0 && view4.getVisibility() == 0) {
                        WeakHashMap weakHashMap2 = q0.f12397a;
                        if (view4.isLaidOut() && view4.getWidth() > 0 && view4.getHeight() > 0) {
                            e eVar6 = (e) view4.getLayoutParams();
                            b bVar2 = eVar6.f4611a;
                            Rect g16 = g();
                            Rect g17 = g();
                            g17.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                            if (bVar2 != null && bVar2.a(g16, view4)) {
                                if (!g17.contains(g16)) {
                                    throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + g16.toShortString() + " | Bounds:" + g17.toShortString());
                                }
                            } else {
                                g16.set(g17);
                            }
                            g17.setEmpty();
                            dVar.c(g17);
                            if (g16.isEmpty()) {
                                g16.setEmpty();
                                dVar.c(g16);
                            } else {
                                int absoluteGravity2 = Gravity.getAbsoluteGravity(eVar6.f4618h, layoutDirection);
                                if ((absoluteGravity2 & 48) == 48 && (i16 = (g16.top - ((ViewGroup.MarginLayoutParams) eVar6).topMargin) - eVar6.j) < (i17 = g10.top)) {
                                    x(view4, i17 - i16);
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - g16.bottom) - ((ViewGroup.MarginLayoutParams) eVar6).bottomMargin) + eVar6.j) < (i15 = g10.bottom)) {
                                    x(view4, height - i15);
                                    z11 = true;
                                }
                                if (!z11) {
                                    x(view4, 0);
                                }
                                if ((absoluteGravity2 & 3) == 3 && (i13 = (g16.left - ((ViewGroup.MarginLayoutParams) eVar6).leftMargin) - eVar6.f4619i) < (i14 = g10.left)) {
                                    w(view4, i14 - i13);
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - g16.right) - ((ViewGroup.MarginLayoutParams) eVar6).rightMargin) + eVar6.f4619i) < (i12 = g10.right)) {
                                    w(view4, width - i12);
                                    z12 = true;
                                }
                                if (!z12) {
                                    w(view4, 0);
                                }
                                g16.setEmpty();
                                dVar.c(g16);
                            }
                        }
                    }
                    if (i6 != 2) {
                        rect = rect3;
                        rect.set(((e) view4.getLayoutParams()).f4625p);
                        if (rect.equals(g11)) {
                            arrayList = arrayList4;
                            i11 = i25;
                        } else {
                            ((e) view4.getLayoutParams()).f4625p.set(g11);
                        }
                    } else {
                        rect = rect3;
                    }
                    int i28 = i10 + 1;
                    i11 = i25;
                    while (true) {
                        arrayList = arrayList4;
                        if (i28 >= i11) {
                            break;
                        }
                        View view5 = (View) arrayList.get(i28);
                        e eVar7 = (e) view5.getLayoutParams();
                        b bVar3 = eVar7.f4611a;
                        if (bVar3 != null && bVar3.b(view5, view4)) {
                            if (i6 == 0 && eVar7.f4624o) {
                                eVar7.f4624o = false;
                            } else {
                                if (i6 != 2) {
                                    z10 = bVar3.d(this, view5, view4);
                                } else {
                                    bVar3.e(this, view4);
                                    z10 = true;
                                }
                                if (i6 == 1) {
                                    eVar7.f4624o = z10;
                                }
                            }
                        }
                        i28++;
                        arrayList4 = arrayList;
                    }
                }
                i21 = i10 + 1;
                g12 = rect;
                size = i11;
                arrayList3 = arrayList;
            } else {
                Rect rect4 = g12;
                g10.setEmpty();
                dVar.c(g10);
                g11.setEmpty();
                dVar.c(g11);
                rect4.setEmpty();
                dVar.c(rect4);
                return;
            }
        }
    }

    public final void r(View view, int i6) {
        Rect g10;
        Rect g11;
        int i10;
        e eVar = (e) view.getLayoutParams();
        View view2 = eVar.f4620k;
        if (view2 == null && eVar.f4616f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        d dVar = U;
        if (view2 != null) {
            g10 = g();
            g11 = g();
            try {
                l(g10, view2);
                e eVar2 = (e) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m(i6, g10, g11, eVar2, measuredWidth, measuredHeight);
                h(eVar2, g11, measuredWidth, measuredHeight);
                view.layout(g11.left, g11.top, g11.right, g11.bottom);
                return;
            } finally {
                g10.setEmpty();
                dVar.c(g10);
                g11.setEmpty();
                dVar.c(g11);
            }
        }
        int i11 = eVar.f4615e;
        if (i11 >= 0) {
            e eVar3 = (e) view.getLayoutParams();
            int i12 = eVar3.f4613c;
            if (i12 == 0) {
                i12 = 8388661;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(i12, i6);
            int i13 = absoluteGravity & 7;
            int i14 = absoluteGravity & 112;
            int width = getWidth();
            int height = getHeight();
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight2 = view.getMeasuredHeight();
            if (i6 == 1) {
                i11 = width - i11;
            }
            int n10 = n(i11) - measuredWidth2;
            if (i13 != 1) {
                if (i13 == 5) {
                    n10 += measuredWidth2;
                }
            } else {
                n10 += measuredWidth2 / 2;
            }
            if (i14 != 16) {
                if (i14 != 80) {
                    i10 = 0;
                } else {
                    i10 = measuredHeight2;
                }
            } else {
                i10 = measuredHeight2 / 2;
            }
            int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar3).leftMargin, Math.min(n10, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) eVar3).rightMargin));
            int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar3).topMargin, Math.min(i10, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin));
            view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
            return;
        }
        e eVar4 = (e) view.getLayoutParams();
        g10 = g();
        g10.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar4).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar4).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar4).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar4).bottomMargin);
        if (this.K != null) {
            WeakHashMap weakHashMap = q0.f12397a;
            if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                g10.left = this.K.b() + g10.left;
                g10.top = this.K.d() + g10.top;
                g10.right -= this.K.c();
                g10.bottom -= this.K.a();
            }
        }
        g11 = g();
        int i15 = eVar4.f4613c;
        if ((i15 & 7) == 0) {
            i15 |= 8388611;
        }
        if ((i15 & 112) == 0) {
            i15 |= 48;
        }
        Gravity.apply(i15, view.getMeasuredWidth(), view.getMeasuredHeight(), g10, g11, i6);
        view.layout(g11.left, g11.top, g11.right, g11.bottom);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        b bVar = ((e) view.getLayoutParams()).f4611a;
        if (bVar != null && bVar.m(this, view, rect, z10)) {
            return true;
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10 && !this.D) {
            v(false);
            this.D = true;
        }
    }

    public final void s(View view, int i6, int i10, int i11) {
        measureChildWithMargins(view, i6, i10, i11, 0);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        y();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.N = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z10;
        Drawable drawable2 = this.M;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.M = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.M.setState(getDrawableState());
                }
                Drawable drawable4 = this.M;
                WeakHashMap weakHashMap = q0.f12397a;
                s1.c.w(drawable4, getLayoutDirection());
                Drawable drawable5 = this.M;
                if (getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                drawable5.setVisible(z10, false);
                this.M.setCallback(this);
            }
            WeakHashMap weakHashMap2 = q0.f12397a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i6) {
        setStatusBarBackground(new ColorDrawable(i6));
    }

    public void setStatusBarBackgroundResource(int i6) {
        Drawable drawable;
        if (i6 != 0) {
            drawable = getContext().getDrawable(i6);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    @Override // android.view.View
    public void setVisibility(int i6) {
        boolean z10;
        super.setVisibility(i6);
        if (i6 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable = this.M;
        if (drawable != null && drawable.isVisible() != z10) {
            this.M.setVisible(z10, false);
        }
    }

    public final boolean t(MotionEvent motionEvent, int i6) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f848z;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i11 = childCount - 1; i11 >= 0; i11--) {
            if (isChildrenDrawingOrderEnabled) {
                i10 = getChildDrawingOrder(childCount, i11);
            } else {
                i10 = i11;
            }
            arrayList.add(getChildAt(i10));
        }
        h hVar = T;
        if (hVar != null) {
            Collections.sort(arrayList, hVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z10 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) arrayList.get(i12);
            b bVar = ((e) view.getLayoutParams()).f4611a;
            if (z10 && actionMasked != 0) {
                if (bVar != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
                    }
                    if (i6 != 0) {
                        if (i6 == 1) {
                            bVar.r(this, view, motionEvent2);
                        }
                    } else {
                        bVar.g(this, view, motionEvent2);
                    }
                }
            } else if (!z10 && bVar != null) {
                if (i6 != 0) {
                    if (i6 == 1) {
                        z10 = bVar.r(this, view, motionEvent);
                    }
                } else {
                    z10 = bVar.g(this, view, motionEvent);
                }
                if (z10) {
                    this.G = view;
                }
            }
        }
        arrayList.clear();
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f9, code lost:
    
        if ((android.view.Gravity.getAbsoluteGravity(r8.f4618h, r12) & r13) == r13) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u() {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.u():void");
    }

    public final void v(boolean z10) {
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            b bVar = ((e) childAt.getLayoutParams()).f4611a;
            if (bVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
                if (z10) {
                    bVar.g(this, childAt, obtain);
                } else {
                    bVar.r(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            ((e) getChildAt(i10).getLayoutParams()).getClass();
        }
        this.G = null;
        this.D = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.M) {
            return false;
        }
        return true;
    }

    public final void y() {
        WeakHashMap weakHashMap = q0.f12397a;
        if (getFitsSystemWindows()) {
            if (this.O == null) {
                this.O = new c(this, 6);
            }
            h0.l(this, this.O);
            setSystemUiVisibility(1280);
            return;
        }
        h0.l(this, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            return new e((e) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new e(layoutParams);
    }
}
