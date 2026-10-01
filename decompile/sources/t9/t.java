package t9;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import java.util.Locale;
import o.c2;
import o.i0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class t extends o.n {
    public final AccessibilityManager A;
    public final Rect B;
    public final int C;
    public final float D;
    public ColorStateList E;
    public int F;
    public ColorStateList G;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final c2 f12502z;

    /* JADX WARN: Illegal instructions before constructor call */
    public t(Context context, AttributeSet attributeSet) {
        int i = g.a.autoCompleteTextViewStyle;
        super(v9.a.a(context, attributeSet, i, 0), attributeSet, i);
        this.B = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayD = i9.m.d(context2, attributeSet, p8.l.MaterialAutoCompleteTextView, i, g.i.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayD.hasValue(p8.l.MaterialAutoCompleteTextView_android_inputType) && typedArrayD.getInt(p8.l.MaterialAutoCompleteTextView_android_inputType, 0) == 0) {
            setKeyListener(null);
        }
        this.C = typedArrayD.getResourceId(p8.l.MaterialAutoCompleteTextView_simpleItemLayout, p8.h.mtrl_auto_complete_simple_item);
        this.D = typedArrayD.getDimensionPixelOffset(p8.l.MaterialAutoCompleteTextView_android_popupElevation, p8.d.mtrl_exposed_dropdown_menu_popup_elevation);
        if (typedArrayD.hasValue(p8.l.MaterialAutoCompleteTextView_dropDownBackgroundTint)) {
            this.E = ColorStateList.valueOf(typedArrayD.getColor(p8.l.MaterialAutoCompleteTextView_dropDownBackgroundTint, 0));
        }
        this.F = typedArrayD.getColor(p8.l.MaterialAutoCompleteTextView_simpleItemSelectedColor, 0);
        this.G = com.bumptech.glide.c.p(context2, typedArrayD, p8.l.MaterialAutoCompleteTextView_simpleItemSelectedRippleColor);
        this.A = (AccessibilityManager) context2.getSystemService("accessibility");
        c2 c2Var = new c2(context2, null, g.a.listPopupWindowStyle, 0);
        this.f12502z = c2Var;
        c2Var.T = true;
        c2Var.U.setFocusable(true);
        c2Var.J = this;
        c2Var.U.setInputMethodMode(2);
        c2Var.p(getAdapter());
        c2Var.K = new i0(2, this);
        if (typedArrayD.hasValue(p8.l.MaterialAutoCompleteTextView_simpleItems)) {
            setSimpleItems(typedArrayD.getResourceId(p8.l.MaterialAutoCompleteTextView_simpleItems, 0));
        }
        typedArrayD.recycle();
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.A;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null) {
            return false;
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (c()) {
            this.f12502z.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.E;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutB = b();
        return (textInputLayoutB == null || !textInputLayoutB.f3540d0) ? super.getHint() : textInputLayoutB.getHint();
    }

    public float getPopupElevation() {
        return this.D;
    }

    public int getSimpleItemSelectedColor() {
        return this.F;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.G;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null && textInputLayoutB.f3540d0 && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f12502z.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i10) {
        super.onMeasure(i, i10);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutB = b();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutB != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                c2 c2Var = this.f12502z;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !c2Var.U.isShowing() ? -1 : c2Var.f9129x.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutB);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable background = c2Var.U.getBackground();
                if (background != null) {
                    Rect rect = this.B;
                    background.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutB.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z2) {
        if (c()) {
            return;
        }
        super.onWindowFocusChanged(z2);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t10) {
        super.setAdapter(t10);
        this.f12502z.p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        c2 c2Var = this.f12502z;
        if (c2Var != null) {
            c2Var.g(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.E = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof o9.i) {
            ((o9.i) dropDownBackground).q(this.E);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f12502z.L = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null) {
            textInputLayoutB.u();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.F = i;
        if (getAdapter() instanceof s) {
            ((s) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.G = colorStateList;
        if (getAdapter() instanceof s) {
            ((s) getAdapter()).a();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (c()) {
            this.f12502z.c();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new s(this, getContext(), this.C, strArr));
    }
}
