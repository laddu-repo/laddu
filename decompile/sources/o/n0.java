package o;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends Spinner {
    public static final int[] D = {R.attr.spinnerMode};
    public final m0 A;
    public int B;
    public final Rect C;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final cf.k f9234v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Context f9235w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e0 f9236x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public SpinnerAdapter f9237y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f9238z;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public n0(android.content.Context r11, android.util.AttributeSet r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.n0.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.C;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        cf.k kVar = this.f9234v;
        if (kVar != null) {
            kVar.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        m0 m0Var = this.A;
        return m0Var != null ? m0Var.b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        m0 m0Var = this.A;
        return m0Var != null ? m0Var.m() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.A != null ? this.B : super.getDropDownWidth();
    }

    public final m0 getInternalPopup() {
        return this.A;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        m0 m0Var = this.A;
        return m0Var != null ? m0Var.d() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f9235w;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        m0 m0Var = this.A;
        return m0Var != null ? m0Var.o() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        cf.k kVar = this.f9234v;
        if (kVar != null) {
            return kVar.w();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        cf.k kVar = this.f9234v;
        if (kVar != null) {
            return kVar.x();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m0 m0Var = this.A;
        if (m0Var == null || !m0Var.a()) {
            return;
        }
        m0Var.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i10) {
        super.onMeasure(i, i10);
        if (this.A == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        l0 l0Var = (l0) parcelable;
        super.onRestoreInstanceState(l0Var.getSuperState());
        if (!l0Var.f9217v || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new n.d(2, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        l0 l0Var = new l0(super.onSaveInstanceState());
        m0 m0Var = this.A;
        l0Var.f9217v = m0Var != null && m0Var.a();
        return l0Var;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        e0 e0Var = this.f9236x;
        if (e0Var == null || !e0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        m0 m0Var = this.A;
        if (m0Var == null) {
            return super.performClick();
        }
        if (m0Var.a()) {
            return true;
        }
        m0Var.l(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        cf.k kVar = this.f9234v;
        if (kVar != null) {
            kVar.B();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        cf.k kVar = this.f9234v;
        if (kVar != null) {
            kVar.C(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        m0 m0Var = this.A;
        if (m0Var == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            m0Var.j(i);
            m0Var.k(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        m0 m0Var = this.A;
        if (m0Var != null) {
            m0Var.i(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.A != null) {
            this.B = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        m0 m0Var = this.A;
        if (m0Var != null) {
            m0Var.g(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(com.bumptech.glide.c.t(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        m0 m0Var = this.A;
        if (m0Var != null) {
            m0Var.f(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        cf.k kVar = this.f9234v;
        if (kVar != null) {
            kVar.J(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        cf.k kVar = this.f9234v;
        if (kVar != null) {
            kVar.K(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f9238z) {
            this.f9237y = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        m0 m0Var = this.A;
        if (m0Var != null) {
            Context context = this.f9235w;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            h0 h0Var = new h0();
            h0Var.f9166v = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                h0Var.f9167w = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                f0.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            m0Var.p(h0Var);
        }
    }
}
