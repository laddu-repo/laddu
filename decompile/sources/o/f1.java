package o;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends ToggleButton implements x0.k {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final cf.k f9151v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final v0 f9152w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public u f9153x;

    public f1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        a3.a(getContext(), this);
        cf.k kVar = new cf.k(this);
        this.f9151v = kVar;
        kVar.z(attributeSet, R.attr.buttonStyleToggle);
        v0 v0Var = new v0(this);
        this.f9152w = v0Var;
        v0Var.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.buttonStyleToggle);
    }

    private u getEmojiTextViewHelper() {
        if (this.f9153x == null) {
            this.f9153x = new u(this);
        }
        return this.f9153x;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        cf.k kVar = this.f9151v;
        if (kVar != null) {
            kVar.b();
        }
        v0 v0Var = this.f9152w;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        cf.k kVar = this.f9151v;
        if (kVar != null) {
            return kVar.w();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        cf.k kVar = this.f9151v;
        if (kVar != null) {
            return kVar.x();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f9152w.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f9152w.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        cf.k kVar = this.f9151v;
        if (kVar != null) {
            kVar.B();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        cf.k kVar = this.f9151v;
        if (kVar != null) {
            kVar.C(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.f9152w;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.f9152w;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().d(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        cf.k kVar = this.f9151v;
        if (kVar != null) {
            kVar.J(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        cf.k kVar = this.f9151v;
        if (kVar != null) {
            kVar.K(mode);
        }
    }

    @Override // x0.k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        v0 v0Var = this.f9152w;
        v0Var.l(colorStateList);
        v0Var.b();
    }

    @Override // x0.k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        v0 v0Var = this.f9152w;
        v0Var.m(mode);
        v0Var.b();
    }
}
