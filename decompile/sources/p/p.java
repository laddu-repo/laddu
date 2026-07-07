package p;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class p extends Button implements w0.k {

    /* renamed from: x, reason: collision with root package name */
    public final o4.j f10338x;

    /* renamed from: y, reason: collision with root package name */
    public final x0 f10339y;

    /* renamed from: z, reason: collision with root package name */
    public w f10340z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        c3.a(context);
        b3.a(this, getContext());
        o4.j jVar = new o4.j(this);
        this.f10338x = jVar;
        jVar.m(attributeSet, i6);
        x0 x0Var = new x0(this);
        this.f10339y = x0Var;
        x0Var.f(attributeSet, i6);
        x0Var.b();
        getEmojiTextViewHelper().b(attributeSet, i6);
    }

    private w getEmojiTextViewHelper() {
        if (this.f10340z == null) {
            this.f10340z = new w(this);
        }
        return this.f10340z;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o4.j jVar = this.f10338x;
        if (jVar != null) {
            jVar.b();
        }
        x0 x0Var = this.f10339y;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (u3.f10394c) {
            return super.getAutoSizeMaxTextSize();
        }
        x0 x0Var = this.f10339y;
        if (x0Var != null) {
            return Math.round(x0Var.f10416i.f10255e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (u3.f10394c) {
            return super.getAutoSizeMinTextSize();
        }
        x0 x0Var = this.f10339y;
        if (x0Var != null) {
            return Math.round(x0Var.f10416i.f10254d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (u3.f10394c) {
            return super.getAutoSizeStepGranularity();
        }
        x0 x0Var = this.f10339y;
        if (x0Var != null) {
            return Math.round(x0Var.f10416i.f10253c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (u3.f10394c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        x0 x0Var = this.f10339y;
        if (x0Var != null) {
            return x0Var.f10416i.f10256f;
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (u3.f10394c) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        x0 x0Var = this.f10339y;
        if (x0Var == null) {
            return 0;
        }
        return x0Var.f10416i.f10251a;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return c9.a.v(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        o4.j jVar = this.f10338x;
        if (jVar != null) {
            return jVar.j();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o4.j jVar = this.f10338x;
        if (jVar != null) {
            return jVar.k();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f10339y.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f10339y.e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        super.onLayout(z10, i6, i10, i11, i12);
        x0 x0Var = this.f10339y;
        if (x0Var != null && !u3.f10394c) {
            x0Var.f10416i.a();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        super.onTextChanged(charSequence, i6, i10, i11);
        x0 x0Var = this.f10339y;
        if (x0Var != null) {
            g1 g1Var = x0Var.f10416i;
            if (!u3.f10394c && g1Var.f()) {
                g1Var.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i6, int i10, int i11, int i12) {
        if (u3.f10394c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i6, i10, i11, i12);
            return;
        }
        x0 x0Var = this.f10339y;
        if (x0Var != null) {
            x0Var.i(i6, i10, i11, i12);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i6) {
        if (u3.f10394c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i6);
            return;
        }
        x0 x0Var = this.f10339y;
        if (x0Var != null) {
            x0Var.j(iArr, i6);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i6) {
        if (u3.f10394c) {
            super.setAutoSizeTextTypeWithDefaults(i6);
            return;
        }
        x0 x0Var = this.f10339y;
        if (x0Var != null) {
            x0Var.k(i6);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o4.j jVar = this.f10338x;
        if (jVar != null) {
            jVar.o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        o4.j jVar = this.f10338x;
        if (jVar != null) {
            jVar.p(i6);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(c9.a.w(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z10) {
        x0 x0Var = this.f10339y;
        if (x0Var != null) {
            x0Var.f10408a.setAllCaps(z10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o4.j jVar = this.f10338x;
        if (jVar != null) {
            jVar.w(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o4.j jVar = this.f10338x;
        if (jVar != null) {
            jVar.x(mode);
        }
    }

    @Override // w0.k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        x0 x0Var = this.f10339y;
        x0Var.l(colorStateList);
        x0Var.b();
    }

    @Override // w0.k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        x0 x0Var = this.f10339y;
        x0Var.m(mode);
        x0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i6) {
        super.setTextAppearance(context, i6);
        x0 x0Var = this.f10339y;
        if (x0Var != null) {
            x0Var.g(context, i6);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i6, float f3) {
        boolean z10 = u3.f10394c;
        if (z10) {
            super.setTextSize(i6, f3);
            return;
        }
        x0 x0Var = this.f10339y;
        if (x0Var != null) {
            g1 g1Var = x0Var.f10416i;
            if (!z10 && !g1Var.f()) {
                g1Var.g(i6, f3);
            }
        }
    }
}
