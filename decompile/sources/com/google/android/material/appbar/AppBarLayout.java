package com.google.android.material.appbar;

import a8.i;
import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.internal.measurement.a4;
import com.google.android.gms.internal.measurement.j5;
import com.google.android.material.appbar.AppBarLayout;
import com.playfy.tv.R;
import com.unity3d.services.UnityAdsConstants;
import i0.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;
import ma.n;
import s8.l;
import t0.h0;
import t0.o;
import t0.q0;
import t0.w1;
import v9.e;
import v9.g;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements f0.a {

    /* renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ int f2559a0 = 0;
    public int A;
    public boolean B;
    public int C;
    public w1 D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ColorStateList I;
    public int J;
    public WeakReference K;
    public ValueAnimator L;
    public ValueAnimator.AnimatorUpdateListener M;
    public final ArrayList N;
    public final LinkedHashSet O;
    public final long P;
    public final TimeInterpolator Q;
    public int[] R;
    public int S;
    public Drawable T;
    public Integer U;
    public final float V;
    public Behavior W;

    /* renamed from: x, reason: collision with root package name */
    public int f2560x;

    /* renamed from: y, reason: collision with root package name */
    public int f2561y;

    /* renamed from: z, reason: collision with root package name */
    public int f2562z;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static class ScrollingViewBehavior extends e {
        public ScrollingViewBehavior() {
        }

        public static AppBarLayout v(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                View view = (View) arrayList.get(i6);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // f0.b
        public final boolean b(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // f0.b
        public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            f0.b bVar = ((f0.e) view2.getLayoutParams()).f4611a;
            if (bVar instanceof BaseBehavior) {
                q0.l(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) bVar).j) + this.f13492e) - u(view2));
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.H) {
                    appBarLayout.e(appBarLayout.f(view));
                    return false;
                }
                return false;
            }
            return false;
        }

        @Override // f0.b
        public final void e(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                q0.r(coordinatorLayout, null);
            }
        }

        @Override // f0.b
        public final boolean m(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            AppBarLayout v10 = v(coordinatorLayout.k(view));
            if (v10 != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.f13490c;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    v10.d(false, !z10, true);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t9.a.I);
            this.f13493f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(ab.a.a(context, attributeSet, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout), attributeSet, R.attr.appBarLayoutStyle);
        this.f2561y = -1;
        this.f2562z = -1;
        this.A = -1;
        this.C = 0;
        this.N = new ArrayList();
        this.O = new LinkedHashSet();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray f3 = n.f(context3, attributeSet, g.f13496a, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (f3.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, f3.getResourceId(0, 0)));
            }
            f3.recycle();
            TypedArray f10 = n.f(context2, attributeSet, t9.a.f12673a, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
            this.I = i.i(context2, f10, 6);
            this.P = j5.t(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.Q = j5.u(context2, R.attr.motionEasingStandardInterpolator, u9.a.f12953a);
            if (f10.hasValue(4)) {
                d(f10.getBoolean(4, false), false, false);
            }
            if (f10.hasValue(3)) {
                g.a(this, f10.getDimensionPixelSize(3, 0));
            }
            setBackground(f10.getDrawable(0));
            if (Build.VERSION.SDK_INT >= 26) {
                if (f10.hasValue(2)) {
                    setKeyboardNavigationCluster(f10.getBoolean(2, false));
                }
                if (f10.hasValue(1)) {
                    setTouchscreenBlocksFocus(f10.getBoolean(1, false));
                }
            }
            this.V = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.H = f10.getBoolean(5, false);
            this.J = f10.getResourceId(7, -1);
            setStatusBarForeground(f10.getDrawable(8));
            f10.recycle();
            v9.b bVar = new v9.b(this);
            WeakHashMap weakHashMap = q0.f12397a;
            h0.l(this, bVar);
        } catch (Throwable th) {
            f3.recycle();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.LinearLayout$LayoutParams, v9.c] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.LinearLayout$LayoutParams, v9.c] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.widget.LinearLayout$LayoutParams, v9.c] */
    public static v9.c b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            ?? layoutParams2 = new LinearLayout.LayoutParams((LinearLayout.LayoutParams) layoutParams);
            layoutParams2.f13480a = 1;
            return layoutParams2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ?? layoutParams3 = new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams3.f13480a = 1;
            return layoutParams3;
        }
        ?? layoutParams4 = new LinearLayout.LayoutParams(layoutParams);
        layoutParams4.f13480a = 1;
        return layoutParams4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, v9.c] */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final v9.c generateLayoutParams(AttributeSet attributeSet) {
        l lVar;
        Context context = getContext();
        ?? layoutParams = new LinearLayout.LayoutParams(context, attributeSet);
        layoutParams.f13480a = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t9.a.f12674b);
        layoutParams.f13480a = obtainStyledAttributes.getInt(1, 0);
        if (obtainStyledAttributes.getInt(0, 0) != 1) {
            lVar = null;
        } else {
            lVar = new l(12);
        }
        layoutParams.f13481b = lVar;
        if (obtainStyledAttributes.hasValue(2)) {
            layoutParams.f13482c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
        }
        obtainStyledAttributes.recycle();
        return layoutParams;
    }

    public final void c() {
        d dVar;
        Behavior behavior = this.W;
        if (behavior != null && this.f2561y != -1 && this.C == 0) {
            dVar = behavior.B(z0.b.f15112y, this);
        } else {
            dVar = null;
        }
        this.f2561y = -1;
        this.f2562z = -1;
        this.A = -1;
        if (dVar != null) {
            Behavior behavior2 = this.W;
            if (behavior2.f2565m == null) {
                behavior2.f2565m = dVar;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof v9.c;
    }

    public final void d(boolean z10, boolean z11, boolean z12) {
        int i6;
        int i10;
        if (z10) {
            i6 = 1;
        } else {
            i6 = 2;
        }
        int i11 = 0;
        if (z11) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        int i12 = i6 | i10;
        if (z12) {
            i11 = 8;
        }
        this.C = i12 | i11;
        requestLayout();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.T != null && getTopInset() > 0) {
            int save = canvas.save();
            canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -this.f2560x);
            this.T.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.T;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final boolean e(boolean z10) {
        float f3;
        float f10;
        if (!this.E && this.G != z10) {
            this.G = z10;
            refreshDrawableState();
            if (getBackground() instanceof ua.i) {
                ColorStateList colorStateList = this.I;
                float f11 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (colorStateList != null) {
                    if (z10) {
                        f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    } else {
                        f10 = 1.0f;
                    }
                    if (z10) {
                        f11 = 1.0f;
                    }
                    g(f10, f11);
                    return true;
                }
                if (this.H) {
                    float f12 = this.V;
                    if (z10) {
                        f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    } else {
                        f3 = f12;
                    }
                    if (z10) {
                        f11 = f12;
                    }
                    g(f3, f11);
                    return true;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public final boolean f(View view) {
        int i6;
        View view2;
        View view3 = null;
        if (this.K == null && (i6 = this.J) != -1) {
            if (view != null) {
                view2 = view.findViewById(i6);
            } else {
                view2 = null;
            }
            if (view2 == null && (getParent() instanceof ViewGroup)) {
                view2 = ((ViewGroup) getParent()).findViewById(this.J);
            }
            if (view2 != null) {
                this.K = new WeakReference(view2);
            }
        }
        WeakReference weakReference = this.K;
        if (weakReference != null) {
            view3 = (View) weakReference.get();
        }
        if (view3 != null) {
            view = view3;
        }
        if (view != null) {
            if (view.canScrollVertically(-1) || view.getScrollY() > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void g(float f3, float f10) {
        ValueAnimator valueAnimator = this.L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f3, f10);
        this.L = ofFloat;
        ofFloat.setDuration(this.P);
        this.L.setInterpolator(this.Q);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.M;
        if (animatorUpdateListener != null) {
            this.L.addUpdateListener(animatorUpdateListener);
        }
        this.L.start();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.widget.LinearLayout$LayoutParams, v9.c] */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ?? layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.f13480a = 1;
        return layoutParams;
    }

    @Override // f0.a
    public f0.b getBehavior() {
        Behavior behavior = new Behavior();
        this.W = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int i6;
        int minimumHeight;
        int i10 = this.f2562z;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                v9.c cVar = (v9.c) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = cVar.f13480a;
                if ((i12 & 5) == 5) {
                    int i13 = ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin;
                    if ((i12 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else if ((i12 & 2) != 0) {
                        minimumHeight = measuredHeight - childAt.getMinimumHeight();
                    } else {
                        i6 = i13 + measuredHeight;
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            i6 = Math.min(i6, measuredHeight - getTopInset());
                        }
                        i11 += i6;
                    }
                    i6 = minimumHeight + i13;
                    if (childCount == 0) {
                        i6 = Math.min(i6, measuredHeight - getTopInset());
                    }
                    i11 += i6;
                } else if (i11 > 0) {
                    break;
                }
            }
        }
        int max = Math.max(0, i11);
        this.f2562z = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i6 = this.A;
        if (i6 != -1) {
            return i6;
        }
        int childCount = getChildCount();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                v9.c cVar = (v9.c) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + childAt.getMeasuredHeight();
                int i12 = cVar.f13480a;
                if ((i12 & 1) == 0) {
                    break;
                }
                i11 += measuredHeight;
                if ((i12 & 2) != 0) {
                    i11 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i10++;
        }
        int max = Math.max(0, i11);
        this.A = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.J;
    }

    public ua.i getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof ua.i) {
            return (ua.i) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int i6;
        int topInset = getTopInset();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight != 0) {
            int i10 = (minimumHeight * 2) + topInset;
            if (i10 < getHeight()) {
                return i10;
            }
            return minimumHeight + topInset;
        }
        int childCount = getChildCount();
        if (childCount >= 1) {
            i6 = getChildAt(childCount - 1).getMinimumHeight();
        } else {
            i6 = 0;
        }
        if (i6 != 0) {
            int i11 = (i6 * 2) + topInset;
            if (i11 < getHeight()) {
                return i11;
            }
            return i6 + topInset;
        }
        return getHeight() / 3;
    }

    public int getPendingAction() {
        return this.C;
    }

    public Drawable getStatusBarForeground() {
        return this.T;
    }

    @Deprecated
    public float getTargetElevation() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final int getTopInset() {
        w1 w1Var = this.D;
        if (w1Var != null) {
            return w1Var.d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i6 = this.f2561y;
        if (i6 != -1) {
            return i6;
        }
        int childCount = getChildCount();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                v9.c cVar = (v9.c) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = cVar.f13480a;
                if ((i12 & 1) == 0) {
                    break;
                }
                int i13 = measuredHeight + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + i11;
                if (i10 == 0 && childAt.getFitsSystemWindows()) {
                    i13 -= getTopInset();
                }
                i11 = i13;
                if ((i12 & 2) != 0) {
                    i11 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i10++;
        }
        int max = Math.max(0, i11);
        this.f2561y = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof ua.i) {
            lg.c.s(this, (ua.i) background);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i6) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (this.R == null) {
            this.R = new int[4];
        }
        int[] iArr = this.R;
        int[] onCreateDrawableState = super.onCreateDrawableState(i6 + iArr.length);
        boolean z10 = this.F;
        if (z10) {
            i10 = R.attr.state_liftable;
        } else {
            i10 = -2130969814;
        }
        iArr[0] = i10;
        if (z10 && this.G) {
            i11 = R.attr.state_lifted;
        } else {
            i11 = -2130969815;
        }
        iArr[1] = i11;
        if (z10) {
            i12 = R.attr.state_collapsible;
        } else {
            i12 = -2130969810;
        }
        iArr[2] = i12;
        if (z10 && this.G) {
            i13 = R.attr.state_collapsed;
        } else {
            i13 = -2130969809;
        }
        iArr[3] = i13;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.K;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.K = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        super.onLayout(z10, i6, i10, i11, i12);
        boolean z11 = true;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    q0.l(getChildAt(childCount), topInset);
                }
            }
        }
        c();
        this.B = false;
        int childCount2 = getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount2) {
                break;
            }
            if (((v9.c) getChildAt(i13).getLayoutParams()).f13482c != null) {
                this.B = true;
                break;
            }
            i13++;
        }
        Drawable drawable = this.T;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.E) {
            if (!this.H) {
                int childCount3 = getChildCount();
                int i14 = 0;
                while (true) {
                    if (i14 < childCount3) {
                        int i15 = ((v9.c) getChildAt(i14).getLayoutParams()).f13480a;
                        if ((i15 & 1) == 1 && (i15 & 10) != 0) {
                            break;
                        } else {
                            i14++;
                        }
                    } else {
                        z11 = false;
                        break;
                    }
                }
            }
            if (this.F != z11) {
                this.F = z11;
                refreshDrawableState();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i6, int i10) {
        super.onMeasure(i6, i10);
        int mode = View.MeasureSpec.getMode(i10);
        if (mode != 1073741824 && getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int measuredHeight = getMeasuredHeight();
                if (mode != Integer.MIN_VALUE) {
                    if (mode == 0) {
                        measuredHeight += getTopInset();
                    }
                } else {
                    measuredHeight = c9.a.b(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i10));
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        c();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        final ua.i iVar;
        ColorStateList colorStateList;
        int i6;
        Context context = getContext();
        final Integer num = null;
        if (drawable instanceof ua.i) {
            iVar = (ua.i) drawable;
        } else {
            ColorStateList g10 = a4.g(drawable);
            if (g10 == null) {
                iVar = null;
            } else {
                ua.i iVar2 = new ua.i();
                iVar2.q(g10);
                iVar = iVar2;
            }
        }
        if (iVar != null && (colorStateList = iVar.f13000y.f12981d) != null) {
            this.S = colorStateList.getDefaultColor();
            final ColorStateList colorStateList2 = this.I;
            if (colorStateList2 != null) {
                Context context2 = getContext();
                TypedValue o10 = a8.g.o(context2, R.attr.colorSurface);
                if (o10 != null) {
                    int i10 = o10.resourceId;
                    if (i10 != 0) {
                        i6 = f.c(context2, i10);
                    } else {
                        i6 = o10.data;
                    }
                    num = Integer.valueOf(i6);
                }
                this.M = new ValueAnimator.AnimatorUpdateListener() { // from class: v9.a
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Integer num2;
                        AppBarLayout appBarLayout = AppBarLayout.this;
                        LinkedHashSet linkedHashSet = appBarLayout.O;
                        ArrayList arrayList = appBarLayout.N;
                        int u3 = jb.b.u(((Float) valueAnimator.getAnimatedValue()).floatValue(), appBarLayout.S, colorStateList2.getDefaultColor());
                        ColorStateList valueOf = ColorStateList.valueOf(u3);
                        ua.i iVar3 = iVar;
                        iVar3.q(valueOf);
                        if (appBarLayout.T != null && (num2 = appBarLayout.U) != null && num2.equals(num)) {
                            appBarLayout.T.setTint(u3);
                        }
                        if (!arrayList.isEmpty()) {
                            int size = arrayList.size();
                            int i11 = 0;
                            while (i11 < size) {
                                Object obj = arrayList.get(i11);
                                i11++;
                                if (obj == null) {
                                    if (iVar3.f13000y.f12981d != null) {
                                        throw null;
                                    }
                                } else {
                                    throw new ClassCastException();
                                }
                            }
                        }
                        if (!linkedHashSet.isEmpty()) {
                            Iterator it = linkedHashSet.iterator();
                            if (it.hasNext()) {
                                throw r4.a.i(it);
                            }
                        }
                    }
                };
            } else {
                iVar.m(context);
                this.M = new pa.l(2, this, iVar);
            }
            drawable = iVar;
        }
        super.setBackground(drawable);
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        Drawable background = getBackground();
        if (background instanceof ua.i) {
            ((ua.i) background).p(f3);
        }
    }

    public void setExpanded(boolean z10) {
        d(z10, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z10) {
        this.H = z10;
    }

    public void setLiftOnScrollColor(ColorStateList colorStateList) {
        if (this.I != colorStateList) {
            this.I = colorStateList;
            setBackground(getBackground());
        }
    }

    public void setLiftOnScrollTargetView(View view) {
        this.J = -1;
        if (view == null) {
            WeakReference weakReference = this.K;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.K = null;
            return;
        }
        this.K = new WeakReference(view);
    }

    public void setLiftOnScrollTargetViewId(int i6) {
        this.J = i6;
        WeakReference weakReference = this.K;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.K = null;
    }

    public void setLiftableOverrideEnabled(boolean z10) {
        this.E = z10;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i6) {
        if (i6 == 1) {
            super.setOrientation(i6);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setPendingAction(int i6) {
        this.C = i6;
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2;
        boolean z10;
        Drawable drawable3 = this.T;
        if (drawable3 != drawable) {
            Integer num = null;
            if (drawable3 != null) {
                drawable3.setCallback(null);
            }
            if (drawable != null) {
                drawable2 = drawable.mutate();
            } else {
                drawable2 = null;
            }
            this.T = drawable2;
            if (drawable2 instanceof ua.i) {
                num = Integer.valueOf(((ua.i) drawable2).S);
            } else {
                ColorStateList g10 = a4.g(drawable2);
                if (g10 != null) {
                    num = Integer.valueOf(g10.getDefaultColor());
                }
            }
            this.U = num;
            Drawable drawable4 = this.T;
            boolean z11 = false;
            if (drawable4 != null) {
                if (drawable4.isStateful()) {
                    this.T.setState(getDrawableState());
                }
                s1.c.w(this.T, getLayoutDirection());
                Drawable drawable5 = this.T;
                if (getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                drawable5.setVisible(z10, false);
                this.T.setCallback(this);
            }
            if (this.T != null && getTopInset() > 0) {
                z11 = true;
            }
            setWillNotDraw(!z11);
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i6) {
        setStatusBarForeground(new ColorDrawable(i6));
    }

    public void setStatusBarForegroundResource(int i6) {
        setStatusBarForeground(c9.a.f(getContext(), i6));
    }

    @Deprecated
    public void setTargetElevation(float f3) {
        g.a(this, f3);
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
        Drawable drawable = this.T;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.T) {
            return false;
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends v9.d {
        public int j;

        /* renamed from: k, reason: collision with root package name */
        public int f2563k;

        /* renamed from: l, reason: collision with root package name */
        public ValueAnimator f2564l;

        /* renamed from: m, reason: collision with root package name */
        public d f2565m;

        /* renamed from: n, reason: collision with root package name */
        public WeakReference f2566n;

        public BaseBehavior() {
            this.f13486f = -1;
            this.f13488h = -1;
        }

        public static void D(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i6, int i10, boolean z10) {
            View view;
            boolean z11;
            Drawable foreground;
            Drawable foreground2;
            int abs = Math.abs(i6);
            int childCount = appBarLayout.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 < childCount) {
                    view = appBarLayout.getChildAt(i11);
                    if (abs >= view.getTop() && abs <= view.getBottom()) {
                        break;
                    } else {
                        i11++;
                    }
                } else {
                    view = null;
                    break;
                }
            }
            if (view != null) {
                int i12 = ((v9.c) view.getLayoutParams()).f13480a;
                if ((i12 & 1) != 0) {
                    int minimumHeight = view.getMinimumHeight();
                    z11 = true;
                    if (i10 > 0) {
                    }
                }
            }
            z11 = false;
            if (appBarLayout.H) {
                z11 = appBarLayout.f(z(coordinatorLayout));
            }
            boolean e10 = appBarLayout.e(z11);
            if (!z10) {
                if (e10) {
                    List list = (List) ((v.l) coordinatorLayout.f847y.f6782y).get(appBarLayout);
                    ArrayList arrayList = coordinatorLayout.A;
                    arrayList.clear();
                    if (list != null) {
                        arrayList.addAll(list);
                    }
                    int size = arrayList.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        f0.b bVar = ((f0.e) ((View) arrayList.get(i13)).getLayoutParams()).f4611a;
                        if (bVar instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) bVar).f13493f == 0) {
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (appBarLayout.getBackground() != null) {
                appBarLayout.getBackground().jumpToCurrentState();
            }
            if (Build.VERSION.SDK_INT >= 23) {
                foreground = appBarLayout.getForeground();
                if (foreground != null) {
                    foreground2 = appBarLayout.getForeground();
                    foreground2.jumpToCurrentState();
                }
            }
            if (appBarLayout.getStateListAnimator() != null) {
                appBarLayout.getStateListAnimator().jumpToCurrentState();
            }
        }

        public static View x(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = coordinatorLayout.getChildAt(i6);
                if (((f0.e) childAt.getLayoutParams()).f4611a instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        public static View z(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = coordinatorLayout.getChildAt(i6);
                if ((childAt instanceof o) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void A(androidx.coordinatorlayout.widget.CoordinatorLayout r9, com.google.android.material.appbar.AppBarLayout r10, android.view.View r11, int r12, int[] r13) {
            /*
                r8 = this;
                if (r12 == 0) goto L2c
                if (r12 >= 0) goto L11
                int r0 = r10.getTotalScrollRange()
                int r0 = -r0
                int r1 = r10.getDownNestedPreScrollRange()
                int r1 = r1 + r0
                r7 = r1
            Lf:
                r6 = r0
                goto L19
            L11:
                int r0 = r10.getUpNestedPreScrollRange()
                int r0 = -r0
                r1 = 0
                r7 = 0
                goto Lf
            L19:
                if (r6 == r7) goto L2c
                int r0 = r8.u()
                int r5 = r0 - r12
                r2 = r8
                r3 = r9
                r4 = r10
                int r9 = r2.v(r3, r4, r5, r6, r7)
                r10 = 1
                r13[r10] = r9
                goto L2d
            L2c:
                r4 = r10
            L2d:
                boolean r9 = r4.H
                if (r9 == 0) goto L38
                boolean r9 = r4.f(r11)
                r4.e(r9)
            L38:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.A(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, int, int[]):void");
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [z0.b, com.google.android.material.appbar.d] */
        public final d B(Parcelable parcelable, AppBarLayout appBarLayout) {
            boolean z10;
            boolean z11;
            int s = s();
            int childCount = appBarLayout.getChildCount();
            boolean z12 = false;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = appBarLayout.getChildAt(i6);
                int bottom = childAt.getBottom() + s;
                if (childAt.getTop() + s <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = z0.b.f15112y;
                    }
                    ?? bVar = new z0.b(parcelable);
                    if (s == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    bVar.A = z10;
                    if (!z10 && (-s) >= appBarLayout.getTotalScrollRange()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    bVar.f2579z = z11;
                    bVar.B = i6;
                    if (bottom == appBarLayout.getTopInset() + childAt.getMinimumHeight()) {
                        z12 = true;
                    }
                    bVar.D = z12;
                    bVar.C = bottom / childAt.getHeight();
                    return bVar;
                }
            }
            return null;
        }

        public final void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int paddingTop = appBarLayout.getPaddingTop() + appBarLayout.getTopInset();
            int u3 = u() - paddingTop;
            int childCount = appBarLayout.getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 < childCount) {
                    View childAt = appBarLayout.getChildAt(i6);
                    int top = childAt.getTop();
                    int bottom = childAt.getBottom();
                    v9.c cVar = (v9.c) childAt.getLayoutParams();
                    if ((cVar.f13480a & 32) == 32) {
                        top -= ((LinearLayout.LayoutParams) cVar).topMargin;
                        bottom += ((LinearLayout.LayoutParams) cVar).bottomMargin;
                    }
                    int i10 = -u3;
                    if (top <= i10 && bottom >= i10) {
                        break;
                    } else {
                        i6++;
                    }
                } else {
                    i6 = -1;
                    break;
                }
            }
            if (i6 >= 0) {
                View childAt2 = appBarLayout.getChildAt(i6);
                v9.c cVar2 = (v9.c) childAt2.getLayoutParams();
                int i11 = cVar2.f13480a;
                if ((i11 & 17) == 17) {
                    int i12 = -childAt2.getTop();
                    int i13 = -childAt2.getBottom();
                    if (i6 == 0 && appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                        i12 -= appBarLayout.getTopInset();
                    }
                    if ((i11 & 2) == 2) {
                        i13 += childAt2.getMinimumHeight();
                    } else if ((i11 & 5) == 5) {
                        int minimumHeight = childAt2.getMinimumHeight() + i13;
                        if (u3 < minimumHeight) {
                            i12 = minimumHeight;
                        } else {
                            i13 = minimumHeight;
                        }
                    }
                    if ((i11 & 32) == 32) {
                        i12 += ((LinearLayout.LayoutParams) cVar2).topMargin;
                        i13 -= ((LinearLayout.LayoutParams) cVar2).bottomMargin;
                    }
                    if (u3 < (i13 + i12) / 2) {
                        i12 = i13;
                    }
                    y(coordinatorLayout, appBarLayout, c9.a.b(i12 + paddingTop, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        @Override // v9.f, f0.b
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i6) {
            boolean z10;
            int round;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.h(coordinatorLayout, appBarLayout, i6);
            int pendingAction = appBarLayout.getPendingAction();
            d dVar = this.f2565m;
            if (dVar != null && (pendingAction & 8) == 0) {
                if (dVar.f2579z) {
                    w(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
                } else if (dVar.A) {
                    w(coordinatorLayout, appBarLayout, 0);
                } else {
                    View childAt = appBarLayout.getChildAt(dVar.B);
                    int i10 = -childAt.getBottom();
                    if (this.f2565m.D) {
                        round = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i10;
                    } else {
                        round = Math.round(childAt.getHeight() * this.f2565m.C) + i10;
                    }
                    w(coordinatorLayout, appBarLayout, round);
                }
            } else if (pendingAction != 0) {
                if ((pendingAction & 4) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((pendingAction & 2) != 0) {
                    int i11 = -appBarLayout.getUpNestedPreScrollRange();
                    if (z10) {
                        y(coordinatorLayout, appBarLayout, i11);
                    } else {
                        w(coordinatorLayout, appBarLayout, i11);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z10) {
                        y(coordinatorLayout, appBarLayout, 0);
                    } else {
                        w(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.C = 0;
            this.f2565m = null;
            int b10 = c9.a.b(s(), -appBarLayout.getTotalScrollRange(), 0);
            v.g gVar = this.f13494a;
            if (gVar != null) {
                if (gVar.f13154c != b10) {
                    gVar.f13154c = b10;
                    gVar.b();
                }
            } else {
                this.f13495b = b10;
            }
            D(coordinatorLayout, appBarLayout, s(), 0, true);
            appBarLayout.f2560x = s();
            if (!appBarLayout.willNotDraw()) {
                appBarLayout.postInvalidateOnAnimation();
            }
            if (q0.d(coordinatorLayout) != null) {
                return true;
            }
            q0.r(coordinatorLayout, new b(coordinatorLayout, this, appBarLayout));
            return true;
        }

        @Override // f0.b
        public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i6, int i10, int i11) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((f0.e) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.s(appBarLayout, i6, i10, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        @Override // f0.b
        public final /* bridge */ /* synthetic */ void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i6, int i10, int[] iArr, int i11) {
            A(coordinatorLayout, (AppBarLayout) view, view2, i10, iArr);
        }

        @Override // f0.b
        public final void l(CoordinatorLayout coordinatorLayout, View view, int i6, int i10, int i11, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i11 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                iArr[1] = v(coordinatorLayout2, appBarLayout, u() - i11, -appBarLayout.getDownNestedScrollRange(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
            }
            if (i11 == 0 && q0.d(coordinatorLayout2) == null) {
                q0.r(coordinatorLayout2, new b(coordinatorLayout2, this, appBarLayout));
            }
        }

        @Override // f0.b
        public final void n(View view, Parcelable parcelable) {
            if (parcelable instanceof d) {
                this.f2565m = (d) parcelable;
            } else {
                this.f2565m = null;
            }
        }

        @Override // f0.b
        public final Parcelable o(View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            d B = B(absSavedState, (AppBarLayout) view);
            if (B == null) {
                return absSavedState;
            }
            return B;
        }

        @Override // f0.b
        public final boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, int i6, int i10) {
            boolean z10;
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if ((i6 & 2) != 0 && (appBarLayout.H || appBarLayout.G || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()))) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && (valueAnimator = this.f2564l) != null) {
                valueAnimator.cancel();
            }
            this.f2566n = null;
            this.f2563k = i10;
            return z10;
        }

        @Override // f0.b
        public final void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i6) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f2563k == 0 || i6 == 1) {
                C(coordinatorLayout, appBarLayout);
                if (appBarLayout.H) {
                    appBarLayout.e(appBarLayout.f(view2));
                }
            }
            this.f2566n = new WeakReference(view2);
        }

        @Override // v9.d
        public final int u() {
            return s() + this.j;
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x015b  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0160  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0162  */
        @Override // v9.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int v(androidx.coordinatorlayout.widget.CoordinatorLayout r18, android.view.View r19, int r20, int r21, int r22) {
            /*
                Method dump skipped, instructions count: 378
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.v(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }

        public final void y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i6) {
            int height;
            int abs = Math.abs(u() - i6);
            float abs2 = Math.abs(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            if (abs2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                height = Math.round((abs / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((abs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            }
            int u3 = u();
            if (u3 == i6) {
                ValueAnimator valueAnimator = this.f2564l;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f2564l.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f2564l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f2564l = valueAnimator3;
                valueAnimator3.setInterpolator(u9.a.f12957e);
                this.f2564l.addUpdateListener(new a(coordinatorLayout, this, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f2564l.setDuration(Math.min(height, 600));
            this.f2564l.setIntValues(u3, i6);
            this.f2564l.start();
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            this.f13486f = -1;
            this.f13488h = -1;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, v9.c] */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        ?? layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.f13480a = 1;
        return layoutParams;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }
}
