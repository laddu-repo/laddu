package com.google.android.material.floatingactionbutton;

import a2.a2;
import a8.i;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import bb.d;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.playfy.tv.R;
import com.unity3d.services.UnityAdsConstants;
import i0.f;
import ja.a;
import ja.b;
import java.util.ArrayList;
import ka.g;
import ka.h;
import ma.q;
import p.t;
import s1.c;
import s8.n;
import t0.q0;
import u9.e;
import ua.m;
import ua.v;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class FloatingActionButton extends q implements a, v, f0.a {
    public ColorStateList A;
    public PorterDuff.Mode B;
    public ColorStateList C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public final Rect I;
    public final Rect J;
    public final n K;
    public final b L;
    public h M;

    /* renamed from: y */
    public ColorStateList f2704y;

    /* renamed from: z */
    public PorterDuff.Mode f2705z;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, ja.b] */
    /* JADX WARN: Type inference failed for: r5v2, types: [ua.i, ka.g] */
    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        super(ab.a.a(context, attributeSet, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton), attributeSet, R.attr.floatingActionButtonStyle);
        ColorStateList colorStateList;
        Drawable drawable;
        Drawable drawable2;
        this.f8797x = getVisibility();
        this.I = new Rect();
        this.J = new Rect();
        Context context2 = getContext();
        TypedArray f3 = ma.n.f(context2, attributeSet, t9.a.f12684m, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.f2704y = i.i(context2, f3, 1);
        this.f2705z = ma.n.g(f3.getInt(2, -1), null);
        this.C = i.i(context2, f3, 12);
        this.D = f3.getInt(7, -1);
        this.E = f3.getDimensionPixelSize(6, 0);
        int dimensionPixelSize = f3.getDimensionPixelSize(3, 0);
        float dimension = f3.getDimension(4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float dimension2 = f3.getDimension(9, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float dimension3 = f3.getDimension(11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.H = f3.getBoolean(16, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(f3.getDimensionPixelSize(10, 0));
        e a10 = e.a(context2, f3, 15);
        e a11 = e.a(context2, f3, 8);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, t9.a.C, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        m a12 = m.b(context2, resourceId, resourceId2, m.f13014m).a();
        boolean z10 = f3.getBoolean(5, false);
        setEnabled(f3.getBoolean(0, true));
        f3.recycle();
        n nVar = new n(this);
        this.K = nVar;
        nVar.e(attributeSet, R.attr.floatingActionButtonStyle);
        ?? obj = new Object();
        obj.f7317a = false;
        obj.f7318b = 0;
        obj.f7319c = this;
        this.L = obj;
        getImpl().g(a12);
        h impl = getImpl();
        ColorStateList colorStateList2 = this.f2704y;
        PorterDuff.Mode mode = this.f2705z;
        ColorStateList colorStateList3 = this.C;
        FloatingActionButton floatingActionButton = impl.s;
        m mVar = impl.f7782a;
        mVar.getClass();
        ?? iVar = new ua.i(mVar);
        impl.f7783b = iVar;
        iVar.setTintList(colorStateList2);
        if (mode != null) {
            impl.f7783b.setTintMode(mode);
        }
        impl.f7783b.m(floatingActionButton.getContext());
        if (dimensionPixelSize > 0) {
            Context context3 = floatingActionButton.getContext();
            m mVar2 = impl.f7782a;
            mVar2.getClass();
            ka.b bVar = new ka.b(mVar2);
            int c10 = f.c(context3, R.color.design_fab_stroke_top_outer_color);
            int c11 = f.c(context3, R.color.design_fab_stroke_top_inner_color);
            colorStateList = colorStateList3;
            int c12 = f.c(context3, R.color.design_fab_stroke_end_inner_color);
            int c13 = f.c(context3, R.color.design_fab_stroke_end_outer_color);
            bVar.f7758i = c10;
            bVar.j = c11;
            bVar.f7759k = c12;
            bVar.f7760l = c13;
            float f10 = dimensionPixelSize;
            if (bVar.f7757h != f10) {
                bVar.f7757h = f10;
                bVar.f7751b.setStrokeWidth(f10 * 1.3333f);
                bVar.f7762n = true;
                bVar.invalidateSelf();
            }
            if (colorStateList2 != null) {
                bVar.f7761m = colorStateList2.getColorForState(bVar.getState(), bVar.f7761m);
            }
            bVar.f7764p = colorStateList2;
            bVar.f7762n = true;
            bVar.invalidateSelf();
            impl.f7785d = bVar;
            ka.b bVar2 = impl.f7785d;
            bVar2.getClass();
            g gVar = impl.f7783b;
            gVar.getClass();
            drawable2 = new LayerDrawable(new Drawable[]{bVar2, gVar});
            drawable = null;
        } else {
            colorStateList = colorStateList3;
            drawable = null;
            impl.f7785d = null;
            drawable2 = impl.f7783b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(sa.b.b(colorStateList), drawable2, drawable);
        impl.f7784c = rippleDrawable;
        impl.f7786e = rippleDrawable;
        getImpl().f7791k = dimensionPixelSize2;
        h impl2 = getImpl();
        if (impl2.f7789h != dimension) {
            impl2.f7789h = dimension;
            impl2.e(dimension, impl2.f7790i, impl2.j);
        }
        h impl3 = getImpl();
        if (impl3.f7790i != dimension2) {
            impl3.f7790i = dimension2;
            impl3.e(impl3.f7789h, dimension2, impl3.j);
        }
        h impl4 = getImpl();
        if (impl4.j != dimension3) {
            impl4.j = dimension3;
            impl4.e(impl4.f7789h, impl4.f7790i, dimension3);
        }
        getImpl().f7794n = a10;
        getImpl().f7795o = a11;
        getImpl().f7787f = z10;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private h getImpl() {
        if (this.M == null) {
            this.M = new h(this, new a2(this, 13));
        }
        return this.M;
    }

    public final int c(int i6) {
        int i10 = this.E;
        if (i10 != 0) {
            return i10;
        }
        Resources resources = getResources();
        if (i6 != -1) {
            if (i6 != 1) {
                return resources.getDimensionPixelSize(R.dimen.design_fab_size_normal);
            }
            return resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
        }
        if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return c(1);
        }
        return c(0);
    }

    public final void d() {
        AnimatorSet c10;
        h impl = getImpl();
        FloatingActionButton floatingActionButton = impl.s;
        if (floatingActionButton.getVisibility() == 0) {
            if (impl.f7798r == 1) {
                return;
            }
        } else if (impl.f7798r != 2) {
            return;
        }
        Animator animator = impl.f7793m;
        if (animator != null) {
            animator.cancel();
        }
        FloatingActionButton floatingActionButton2 = impl.s;
        if (floatingActionButton2.isLaidOut() && !floatingActionButton2.isInEditMode()) {
            e eVar = impl.f7795o;
            if (eVar != null) {
                c10 = impl.b(eVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            } else {
                c10 = impl.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.4f, 0.4f, h.B, h.C);
            }
            c10.addListener(new d(impl));
            c10.start();
            return;
        }
        floatingActionButton.a(4, false);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if (Build.VERSION.SDK_INT == 21) {
            h impl = getImpl();
            FloatingActionButton floatingActionButton = impl.s;
            if (floatingActionButton.isEnabled()) {
                floatingActionButton.setElevation(impl.f7789h);
                if (floatingActionButton.isPressed()) {
                    floatingActionButton.setTranslationZ(impl.j);
                    return;
                } else if (!floatingActionButton.isFocused() && !floatingActionButton.isHovered()) {
                    floatingActionButton.setTranslationZ(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    return;
                } else {
                    floatingActionButton.setTranslationZ(impl.f7790i);
                    return;
                }
            }
            floatingActionButton.setElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            floatingActionButton.setTranslationZ(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    public final void e() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.A;
        if (colorStateList == null) {
            c.e(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.B;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(t.c(colorForState, mode));
    }

    public final void f() {
        AnimatorSet c10;
        float f3;
        float f10;
        h impl = getImpl();
        FloatingActionButton floatingActionButton = impl.s;
        Matrix matrix = impl.f7803x;
        FloatingActionButton floatingActionButton2 = impl.s;
        boolean z10 = true;
        if (floatingActionButton.getVisibility() != 0) {
            if (impl.f7798r == 2) {
                return;
            }
        } else if (impl.f7798r != 1) {
            return;
        }
        Animator animator = impl.f7793m;
        if (animator != null) {
            animator.cancel();
        }
        if (impl.f7794n != null) {
            z10 = false;
        }
        if (floatingActionButton2.isLaidOut() && !floatingActionButton2.isInEditMode()) {
            if (floatingActionButton.getVisibility() != 0) {
                float f11 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                floatingActionButton.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                if (z10) {
                    f3 = 0.4f;
                } else {
                    f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                floatingActionButton.setScaleY(f3);
                if (z10) {
                    f10 = 0.4f;
                } else {
                    f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                floatingActionButton.setScaleX(f10);
                if (z10) {
                    f11 = 0.4f;
                }
                impl.f7796p = f11;
                impl.a(f11, matrix);
                floatingActionButton2.setImageMatrix(matrix);
            }
            e eVar = impl.f7794n;
            if (eVar != null) {
                c10 = impl.b(eVar, 1.0f, 1.0f, 1.0f);
            } else {
                c10 = impl.c(1.0f, 1.0f, 1.0f, h.f7781z, h.A);
            }
            c10.addListener(new bb.b(impl, 2));
            c10.start();
            return;
        }
        floatingActionButton.a(0, false);
        floatingActionButton.setAlpha(1.0f);
        floatingActionButton.setScaleY(1.0f);
        floatingActionButton.setScaleX(1.0f);
        impl.f7796p = 1.0f;
        impl.a(1.0f, matrix);
        floatingActionButton2.setImageMatrix(matrix);
    }

    @Override // android.widget.ImageButton, android.widget.ImageView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f2704y;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f2705z;
    }

    @Override // f0.a
    public f0.b getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().s.getElevation();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f7790i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().j;
    }

    public Drawable getContentBackground() {
        return getImpl().f7786e;
    }

    public int getCustomSize() {
        return this.E;
    }

    public int getExpandedComponentIdHint() {
        return this.L.f7318b;
    }

    public e getHideMotionSpec() {
        return getImpl().f7795o;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.C;
    }

    public m getShapeAppearanceModel() {
        m mVar = getImpl().f7782a;
        mVar.getClass();
        return mVar;
    }

    public e getShowMotionSpec() {
        return getImpl().f7794n;
    }

    public int getSize() {
        return this.D;
    }

    public int getSizeDimension() {
        return c(this.D);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.A;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.B;
    }

    public boolean getUseCompatPadding() {
        return this.H;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h impl = getImpl();
        g gVar = impl.f7783b;
        if (gVar != null) {
            lg.c.s(impl.s, gVar);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().s.getViewTreeObserver();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i6, int i10) {
        int sizeDimension = getSizeDimension();
        this.F = (sizeDimension - this.G) / 2;
        getImpl().h();
        int min = Math.min(View.resolveSize(sizeDimension, i6), View.resolveSize(sizeDimension, i10));
        Rect rect = this.I;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof xa.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        xa.a aVar = (xa.a) parcelable;
        super.onRestoreInstanceState(aVar.f15113x);
        Bundle bundle = (Bundle) aVar.f14700z.get("expandableWidgetHelper");
        bundle.getClass();
        b bVar = this.L;
        bVar.getClass();
        bVar.f7317a = bundle.getBoolean("expanded", false);
        bVar.f7318b = bundle.getInt("expandedComponentIdHint", 0);
        if (bVar.f7317a) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) bVar.f7319c;
            ViewParent parent = floatingActionButton.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).i(floatingActionButton);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        xa.a aVar = new xa.a(onSaveInstanceState);
        b bVar = this.L;
        bVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", bVar.f7317a);
        bundle.putInt("expandedComponentIdHint", bVar.f7318b);
        aVar.f14700z.put("expandableWidgetHelper", bundle);
        return aVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i6;
        if (motionEvent.getAction() == 0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.J;
            rect.set(0, 0, measuredWidth, measuredHeight);
            int i10 = rect.left;
            Rect rect2 = this.I;
            rect.left = i10 + rect2.left;
            rect.top += rect2.top;
            rect.right -= rect2.right;
            rect.bottom -= rect2.bottom;
            h hVar = this.M;
            if (hVar.f7787f) {
                i6 = Math.max((hVar.f7791k - hVar.s.getSizeDimension()) / 2, 0);
            } else {
                i6 = 0;
            }
            int i11 = -i6;
            rect.inset(i11, i11);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i6) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f2704y != colorStateList) {
            this.f2704y = colorStateList;
            h impl = getImpl();
            g gVar = impl.f7783b;
            if (gVar != null) {
                gVar.setTintList(colorStateList);
            }
            ka.b bVar = impl.f7785d;
            if (bVar != null) {
                if (colorStateList != null) {
                    bVar.f7761m = colorStateList.getColorForState(bVar.getState(), bVar.f7761m);
                }
                bVar.f7764p = colorStateList;
                bVar.f7762n = true;
                bVar.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f2705z != mode) {
            this.f2705z = mode;
            g gVar = getImpl().f7783b;
            if (gVar != null) {
                gVar.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f3) {
        h impl = getImpl();
        if (impl.f7789h != f3) {
            impl.f7789h = f3;
            impl.e(f3, impl.f7790i, impl.j);
        }
    }

    public void setCompatElevationResource(int i6) {
        setCompatElevation(getResources().getDimension(i6));
    }

    public void setCompatHoveredFocusedTranslationZ(float f3) {
        h impl = getImpl();
        if (impl.f7790i != f3) {
            impl.f7790i = f3;
            impl.e(impl.f7789h, f3, impl.j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i6) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i6));
    }

    public void setCompatPressedTranslationZ(float f3) {
        h impl = getImpl();
        if (impl.j != f3) {
            impl.j = f3;
            impl.e(impl.f7789h, impl.f7790i, f3);
        }
    }

    public void setCompatPressedTranslationZResource(int i6) {
        setCompatPressedTranslationZ(getResources().getDimension(i6));
    }

    public void setCustomSize(int i6) {
        if (i6 >= 0) {
            if (i6 != this.E) {
                this.E = i6;
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        g gVar = getImpl().f7783b;
        if (gVar != null) {
            gVar.p(f3);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        if (z10 != getImpl().f7787f) {
            getImpl().f7787f = z10;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i6) {
        this.L.f7318b = i6;
    }

    public void setHideMotionSpec(e eVar) {
        getImpl().f7795o = eVar;
    }

    public void setHideMotionSpecResource(int i6) {
        setHideMotionSpec(e.b(getContext(), i6));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            h impl = getImpl();
            float f3 = impl.f7796p;
            impl.f7796p = f3;
            Matrix matrix = impl.f7803x;
            impl.a(f3, matrix);
            impl.s.setImageMatrix(matrix);
            if (this.A != null) {
                e();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i6) {
        this.K.i(i6);
        e();
    }

    public void setMaxImageSize(int i6) {
        this.G = i6;
        h impl = getImpl();
        if (impl.f7797q != i6) {
            impl.f7797q = i6;
            float f3 = impl.f7796p;
            impl.f7796p = f3;
            Matrix matrix = impl.f7803x;
            impl.a(f3, matrix);
            impl.s.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(int i6) {
        setRippleColor(ColorStateList.valueOf(i6));
    }

    @Override // android.view.View
    public void setScaleX(float f3) {
        super.setScaleX(f3);
        getImpl().getClass();
    }

    @Override // android.view.View
    public void setScaleY(float f3) {
        super.setScaleY(f3);
        getImpl().getClass();
    }

    public void setShadowPaddingEnabled(boolean z10) {
        h impl = getImpl();
        impl.f7788g = z10;
        impl.h();
    }

    @Override // ua.v
    public void setShapeAppearanceModel(m mVar) {
        getImpl().g(mVar);
    }

    public void setShowMotionSpec(e eVar) {
        getImpl().f7794n = eVar;
    }

    public void setShowMotionSpecResource(int i6) {
        setShowMotionSpec(e.b(getContext(), i6));
    }

    public void setSize(int i6) {
        this.E = 0;
        if (i6 != this.D) {
            this.D = i6;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            e();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.B != mode) {
            this.B = mode;
            e();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f3) {
        super.setTranslationX(f3);
        getImpl().f();
    }

    @Override // android.view.View
    public void setTranslationY(float f3) {
        super.setTranslationY(f3);
        getImpl().f();
    }

    @Override // android.view.View
    public void setTranslationZ(float f3) {
        super.setTranslationZ(f3);
        getImpl().f();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.H != z10) {
            this.H = z10;
            getImpl().h();
        }
    }

    @Override // ma.q, android.widget.ImageView, android.view.View
    public void setVisibility(int i6) {
        super.setVisibility(i6);
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static class BaseBehavior<T extends FloatingActionButton> extends f0.b {

        /* renamed from: a */
        public Rect f2706a;

        /* renamed from: b */
        public final boolean f2707b;

        public BaseBehavior() {
            this.f2707b = true;
        }

        @Override // f0.b
        public final boolean a(Rect rect, View view) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.I;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // f0.b
        public final void c(f0.e eVar) {
            if (eVar.f4618h == 0) {
                eVar.f4618h = 80;
            }
        }

        @Override // f0.b
        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            boolean z10;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                s(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof f0.e) {
                    z10 = ((f0.e) layoutParams).f4611a instanceof BottomSheetBehavior;
                } else {
                    z10 = false;
                }
                if (z10) {
                    t(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // f0.b
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i6) {
            int i10;
            boolean z10;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList k8 = coordinatorLayout.k(floatingActionButton);
            int size = k8.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                View view2 = (View) k8.get(i12);
                if (view2 instanceof AppBarLayout) {
                    if (s(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof f0.e) {
                        z10 = ((f0.e) layoutParams).f4611a instanceof BottomSheetBehavior;
                    } else {
                        z10 = false;
                    }
                    if (z10 && t(view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.r(floatingActionButton, i6);
            Rect rect = floatingActionButton.I;
            if (rect.centerX() > 0 && rect.centerY() > 0) {
                f0.e eVar = (f0.e) floatingActionButton.getLayoutParams();
                if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) eVar).rightMargin) {
                    i10 = rect.right;
                } else if (floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) eVar).leftMargin) {
                    i10 = -rect.left;
                } else {
                    i10 = 0;
                }
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) {
                    i11 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) eVar).topMargin) {
                    i11 = -rect.top;
                }
                if (i11 != 0) {
                    q0.l(floatingActionButton, i11);
                }
                if (i10 != 0) {
                    q0.k(floatingActionButton, i10);
                }
            }
            return true;
        }

        public final boolean s(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            f0.e eVar = (f0.e) floatingActionButton.getLayoutParams();
            if (!this.f2707b || eVar.f4616f != appBarLayout.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (this.f2706a == null) {
                this.f2706a = new Rect();
            }
            Rect rect = this.f2706a;
            ma.d.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.d();
                return true;
            }
            floatingActionButton.f();
            return true;
        }

        public final boolean t(View view, FloatingActionButton floatingActionButton) {
            f0.e eVar = (f0.e) floatingActionButton.getLayoutParams();
            if (!this.f2707b || eVar.f4616f != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((f0.e) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.d();
                return true;
            }
            floatingActionButton.f();
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t9.a.f12685n);
            this.f2707b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            h impl = getImpl();
            ColorStateList colorStateList2 = this.C;
            RippleDrawable rippleDrawable = impl.f7784c;
            if (rippleDrawable != null) {
                rippleDrawable.setColor(sa.b.b(colorStateList2));
            } else if (rippleDrawable != null) {
                rippleDrawable.setTintList(sa.b.b(colorStateList2));
            }
        }
    }
}
