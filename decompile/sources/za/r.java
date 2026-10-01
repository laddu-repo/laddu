package za;

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
import com.playfy.tv.R;
import java.util.List;
import java.util.Locale;
import okhttp3.HttpUrl;
import p.f2;
import p.l0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r extends p.o {
    public final f2 B;
    public final AccessibilityManager C;
    public final Rect D;
    public final int E;
    public final float F;
    public ColorStateList G;
    public int H;
    public ColorStateList I;

    public r(Context context, AttributeSet attributeSet) {
        super(ab.a.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.D = new Rect();
        Context context2 = getContext();
        TypedArray f3 = ma.n.f(context2, attributeSet, t9.a.s, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (f3.hasValue(0) && f3.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.E = f3.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.F = f3.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (f3.hasValue(2)) {
            this.G = ColorStateList.valueOf(f3.getColor(2, 0));
        }
        this.H = f3.getColor(4, 0);
        this.I = a8.i.i(context2, f3, 5);
        this.C = (AccessibilityManager) context2.getSystemService("accessibility");
        f2 f2Var = new f2(context2, null, R.attr.listPopupWindowStyle, 0);
        this.B = f2Var;
        f2Var.V = true;
        f2Var.W.setFocusable(true);
        f2Var.L = this;
        f2Var.W.setInputMethodMode(2);
        f2Var.p(getAdapter());
        f2Var.M = new l0(this, 2);
        if (f3.hasValue(6)) {
            setSimpleItems(f3.getResourceId(6, 0));
        }
        f3.recycle();
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
        AccessibilityManager accessibilityManager = this.C;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) != null) {
                for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                    if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (c()) {
            this.B.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.G;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout b10 = b();
        if (b10 != null && b10.f2775f0) {
            return b10.getHint();
        }
        return super.getHint();
    }

    public float getPopupElevation() {
        return this.F;
    }

    public int getSimpleItemSelectedColor() {
        return this.H;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.I;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        String str;
        super.onAttachedToWindow();
        TextInputLayout b10 = b();
        if (b10 != null && b10.f2775f0 && super.getHint() == null) {
            String str2 = Build.MANUFACTURER;
            if (str2 != null) {
                str = str2.toLowerCase(Locale.ENGLISH);
            } else {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (str.equals("meizu")) {
                setHint(HttpUrl.FRAGMENT_ENCODE_SET);
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.B.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i6, int i10) {
        int selectedItemPosition;
        super.onMeasure(i6, i10);
        if (View.MeasureSpec.getMode(i6) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b10 = b();
            int i11 = 0;
            if (adapter != null && b10 != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                f2 f2Var = this.B;
                if (!f2Var.W.isShowing()) {
                    selectedItemPosition = -1;
                } else {
                    selectedItemPosition = f2Var.f10240z.getSelectedItemPosition();
                }
                int min = Math.min(adapter.getCount(), Math.max(0, selectedItemPosition) + 15);
                View view = null;
                int i12 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i11) {
                        view = null;
                        i11 = itemViewType;
                    }
                    view = adapter.getView(max, view, b10);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i12 = Math.max(i12, view.getMeasuredWidth());
                }
                Drawable background = f2Var.W.getBackground();
                if (background != null) {
                    Rect rect = this.D;
                    background.getPadding(rect);
                    i12 += rect.left + rect.right;
                }
                i11 = b10.getEndIconView().getMeasuredWidth() + i12;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i11), View.MeasureSpec.getSize(i6)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        if (c()) {
            return;
        }
        super.onWindowFocusChanged(z10);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t10) {
        super.setAdapter(t10);
        this.B.p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        f2 f2Var = this.B;
        if (f2Var != null) {
            f2Var.j(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i6) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i6));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.G = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof ua.i) {
            ((ua.i) dropDownBackground).q(this.G);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.B.N = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i6) {
        super.setRawInputType(i6);
        TextInputLayout b10 = b();
        if (b10 != null) {
            b10.u();
        }
    }

    public void setSimpleItemSelectedColor(int i6) {
        this.H = i6;
        if (getAdapter() instanceof q) {
            ((q) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.I = colorStateList;
        if (getAdapter() instanceof q) {
            ((q) getAdapter()).a();
        }
    }

    public void setSimpleItems(int i6) {
        setSimpleItems(getResources().getStringArray(i6));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (c()) {
            this.B.b();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new q(this, getContext(), this.E, strArr));
    }
}
