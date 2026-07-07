package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import ba.c;
import i0.f;
import jb.b;
import ma.n;
import u.a;
import ua.g;
import ua.i;
import ua.l;
import ua.m;
import ua.v;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class MaterialCardView extends a implements Checkable, v {
    public static final int[] I = {R.attr.state_checkable};
    public static final int[] J = {R.attr.state_checked};
    public static final int[] K = {com.playfy.tv.R.attr.state_dragged};
    public final c E;
    public final boolean F;
    public boolean G;
    public boolean H;

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        super(ab.a.a(context, attributeSet, com.playfy.tv.R.attr.materialCardViewStyle, com.playfy.tv.R.style.Widget_MaterialComponents_CardView), attributeSet);
        this.G = false;
        this.H = false;
        this.F = true;
        TypedArray f3 = n.f(getContext(), attributeSet, t9.a.f12695y, com.playfy.tv.R.attr.materialCardViewStyle, com.playfy.tv.R.style.Widget_MaterialComponents_CardView, new int[0]);
        c cVar = new c(this, attributeSet);
        this.E = cVar;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        i iVar = cVar.f1628c;
        iVar.q(cardBackgroundColor);
        cVar.f1627b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        cVar.l();
        MaterialCardView materialCardView = cVar.f1626a;
        ColorStateList i6 = a8.i.i(materialCardView.getContext(), f3, 11);
        cVar.f1638n = i6;
        if (i6 == null) {
            cVar.f1638n = ColorStateList.valueOf(-1);
        }
        cVar.f1633h = f3.getDimensionPixelSize(12, 0);
        boolean z10 = f3.getBoolean(0, false);
        cVar.s = z10;
        materialCardView.setLongClickable(z10);
        cVar.f1636l = a8.i.i(materialCardView.getContext(), f3, 6);
        cVar.g(a8.i.l(materialCardView.getContext(), f3, 2));
        cVar.f1631f = f3.getDimensionPixelSize(5, 0);
        cVar.f1630e = f3.getDimensionPixelSize(4, 0);
        cVar.f1632g = f3.getInteger(3, 8388661);
        ColorStateList i10 = a8.i.i(materialCardView.getContext(), f3, 7);
        cVar.f1635k = i10;
        if (i10 == null) {
            cVar.f1635k = ColorStateList.valueOf(b.o(materialCardView, com.playfy.tv.R.attr.colorControlHighlight));
        }
        ColorStateList i11 = a8.i.i(materialCardView.getContext(), f3, 1);
        i11 = i11 == null ? ColorStateList.valueOf(0) : i11;
        i iVar2 = cVar.f1629d;
        iVar2.q(i11);
        RippleDrawable rippleDrawable = cVar.f1639o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(cVar.f1635k);
        }
        iVar.p(materialCardView.getCardElevation());
        float f10 = cVar.f1633h;
        ColorStateList colorStateList = cVar.f1638n;
        iVar2.f13000y.f12987k = f10;
        iVar2.invalidateSelf();
        g gVar = iVar2.f13000y;
        if (gVar.f12982e != colorStateList) {
            gVar.f12982e = colorStateList;
            iVar2.onStateChange(iVar2.getState());
        }
        materialCardView.setBackgroundInternal(cVar.d(iVar));
        Drawable c10 = cVar.j() ? cVar.c() : iVar2;
        cVar.f1634i = c10;
        materialCardView.setForeground(cVar.d(c10));
        f3.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.E.f1628c.getBounds());
        return rectF;
    }

    public final void b() {
        c cVar;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT > 26 && (rippleDrawable = (cVar = this.E).f1639o) != null) {
            Rect bounds = rippleDrawable.getBounds();
            int i6 = bounds.bottom;
            cVar.f1639o.setBounds(bounds.left, bounds.top, bounds.right, i6 - 1);
            cVar.f1639o.setBounds(bounds.left, bounds.top, bounds.right, i6);
        }
    }

    @Override // u.a
    public ColorStateList getCardBackgroundColor() {
        return this.E.f1628c.f13000y.f12981d;
    }

    public ColorStateList getCardForegroundColor() {
        return this.E.f1629d.f13000y.f12981d;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.E.j;
    }

    public int getCheckedIconGravity() {
        return this.E.f1632g;
    }

    public int getCheckedIconMargin() {
        return this.E.f1630e;
    }

    public int getCheckedIconSize() {
        return this.E.f1631f;
    }

    public ColorStateList getCheckedIconTint() {
        return this.E.f1636l;
    }

    @Override // u.a
    public int getContentPaddingBottom() {
        return this.E.f1627b.bottom;
    }

    @Override // u.a
    public int getContentPaddingLeft() {
        return this.E.f1627b.left;
    }

    @Override // u.a
    public int getContentPaddingRight() {
        return this.E.f1627b.right;
    }

    @Override // u.a
    public int getContentPaddingTop() {
        return this.E.f1627b.top;
    }

    public float getProgress() {
        return this.E.f1628c.f13000y.j;
    }

    @Override // u.a
    public float getRadius() {
        return this.E.f1628c.k();
    }

    public ColorStateList getRippleColor() {
        return this.E.f1635k;
    }

    public m getShapeAppearanceModel() {
        return this.E.f1637m;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.E.f1638n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.E.f1638n;
    }

    public int getStrokeWidth() {
        return this.E.f1633h;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.G;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c cVar = this.E;
        cVar.k();
        lg.c.s(this, cVar.f1628c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i6) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i6 + 3);
        c cVar = this.E;
        if (cVar != null && cVar.s) {
            View.mergeDrawableStates(onCreateDrawableState, I);
        }
        if (this.G) {
            View.mergeDrawableStates(onCreateDrawableState, J);
        }
        if (this.H) {
            View.mergeDrawableStates(onCreateDrawableState, K);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.G);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        c cVar = this.E;
        if (cVar != null && cVar.s) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setCheckable(z10);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.G);
    }

    @Override // u.a, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i6, int i10) {
        super.onMeasure(i6, i10);
        this.E.e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.F) {
            c cVar = this.E;
            if (!cVar.f1642r) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                cVar.f1642r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // u.a
    public void setCardBackgroundColor(int i6) {
        this.E.f1628c.q(ColorStateList.valueOf(i6));
    }

    @Override // u.a
    public void setCardElevation(float f3) {
        super.setCardElevation(f3);
        c cVar = this.E;
        cVar.f1628c.p(cVar.f1626a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        i iVar = this.E.f1629d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        iVar.q(colorStateList);
    }

    public void setCheckable(boolean z10) {
        this.E.s = z10;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (this.G != z10) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.E.g(drawable);
    }

    public void setCheckedIconGravity(int i6) {
        c cVar = this.E;
        if (cVar.f1632g != i6) {
            cVar.f1632g = i6;
            MaterialCardView materialCardView = cVar.f1626a;
            cVar.e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i6) {
        this.E.f1630e = i6;
    }

    public void setCheckedIconMarginResource(int i6) {
        if (i6 != -1) {
            this.E.f1630e = getResources().getDimensionPixelSize(i6);
        }
    }

    public void setCheckedIconResource(int i6) {
        this.E.g(c9.a.f(getContext(), i6));
    }

    public void setCheckedIconSize(int i6) {
        this.E.f1631f = i6;
    }

    public void setCheckedIconSizeResource(int i6) {
        if (i6 != 0) {
            this.E.f1631f = getResources().getDimensionPixelSize(i6);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        c cVar = this.E;
        cVar.f1636l = colorStateList;
        Drawable drawable = cVar.j;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z10) {
        super.setClickable(z10);
        c cVar = this.E;
        if (cVar != null) {
            cVar.k();
        }
    }

    public void setDragged(boolean z10) {
        if (this.H != z10) {
            this.H = z10;
            refreshDrawableState();
            b();
            invalidate();
        }
    }

    @Override // u.a
    public void setMaxCardElevation(float f3) {
        super.setMaxCardElevation(f3);
        this.E.m();
    }

    @Override // u.a
    public void setPreventCornerOverlap(boolean z10) {
        super.setPreventCornerOverlap(z10);
        c cVar = this.E;
        cVar.m();
        cVar.l();
    }

    public void setProgress(float f3) {
        c cVar = this.E;
        cVar.f1628c.r(f3);
        i iVar = cVar.f1629d;
        if (iVar != null) {
            iVar.r(f3);
        }
        i iVar2 = cVar.f1641q;
        if (iVar2 != null) {
            iVar2.r(f3);
        }
    }

    @Override // u.a
    public void setRadius(float f3) {
        super.setRadius(f3);
        c cVar = this.E;
        l g10 = cVar.f1637m.g();
        g10.f13007e = new ua.a(f3);
        g10.f13008f = new ua.a(f3);
        g10.f13009g = new ua.a(f3);
        g10.f13010h = new ua.a(f3);
        cVar.h(g10.a());
        cVar.f1634i.invalidateSelf();
        if (cVar.i() || (cVar.f1626a.getPreventCornerOverlap() && !cVar.f1628c.n())) {
            cVar.l();
        }
        if (cVar.i()) {
            cVar.m();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        c cVar = this.E;
        cVar.f1635k = colorStateList;
        RippleDrawable rippleDrawable = cVar.f1639o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i6) {
        ColorStateList d10 = f.d(getContext(), i6);
        c cVar = this.E;
        cVar.f1635k = d10;
        RippleDrawable rippleDrawable = cVar.f1639o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(d10);
        }
    }

    @Override // ua.v
    public void setShapeAppearanceModel(m mVar) {
        setClipToOutline(mVar.f(getBoundsAsRectF()));
        this.E.h(mVar);
    }

    public void setStrokeColor(int i6) {
        setStrokeColor(ColorStateList.valueOf(i6));
    }

    public void setStrokeWidth(int i6) {
        c cVar = this.E;
        if (i6 != cVar.f1633h) {
            cVar.f1633h = i6;
            i iVar = cVar.f1629d;
            ColorStateList colorStateList = cVar.f1638n;
            iVar.f13000y.f12987k = i6;
            iVar.invalidateSelf();
            g gVar = iVar.f13000y;
            if (gVar.f12982e != colorStateList) {
                gVar.f12982e = colorStateList;
                iVar.onStateChange(iVar.getState());
            }
        }
        invalidate();
    }

    @Override // u.a
    public void setUseCompatPadding(boolean z10) {
        super.setUseCompatPadding(z10);
        c cVar = this.E;
        cVar.m();
        cVar.l();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        c cVar = this.E;
        if (cVar != null && cVar.s && isEnabled()) {
            this.G = !this.G;
            refreshDrawableState();
            b();
            cVar.f(this.G, true);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        c cVar = this.E;
        if (cVar.f1638n != colorStateList) {
            cVar.f1638n = colorStateList;
            i iVar = cVar.f1629d;
            iVar.f13000y.f12987k = cVar.f1633h;
            iVar.invalidateSelf();
            g gVar = iVar.f13000y;
            if (gVar.f12982e != colorStateList) {
                gVar.f12982e = colorStateList;
                iVar.onStateChange(iVar.getState());
            }
        }
        invalidate();
    }

    @Override // u.a
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.E.f1628c.q(colorStateList);
    }

    public void setOnCheckedChangeListener(ba.a aVar) {
    }
}
