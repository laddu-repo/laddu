package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class q extends CheckBox implements w0.j, w0.k {
    public w A;

    /* renamed from: x, reason: collision with root package name */
    public final s f10356x;

    /* renamed from: y, reason: collision with root package name */
    public final o4.j f10357y;

    /* renamed from: z, reason: collision with root package name */
    public final x0 f10358z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        c3.a(context);
        b3.a(this, getContext());
        s sVar = new s(this);
        this.f10356x = sVar;
        sVar.c(attributeSet, i6);
        o4.j jVar = new o4.j(this);
        this.f10357y = jVar;
        jVar.m(attributeSet, i6);
        x0 x0Var = new x0(this);
        this.f10358z = x0Var;
        x0Var.f(attributeSet, i6);
        getEmojiTextViewHelper().b(attributeSet, i6);
    }

    private w getEmojiTextViewHelper() {
        if (this.A == null) {
            this.A = new w(this);
        }
        return this.A;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        o4.j jVar = this.f10357y;
        if (jVar != null) {
            jVar.b();
        }
        x0 x0Var = this.f10358z;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        o4.j jVar = this.f10357y;
        if (jVar != null) {
            return jVar.j();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o4.j jVar = this.f10357y;
        if (jVar != null) {
            return jVar.k();
        }
        return null;
    }

    @Override // w0.j
    public ColorStateList getSupportButtonTintList() {
        s sVar = this.f10356x;
        if (sVar != null) {
            return sVar.f10373a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        s sVar = this.f10356x;
        if (sVar != null) {
            return sVar.f10374b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f10358z.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f10358z.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o4.j jVar = this.f10357y;
        if (jVar != null) {
            jVar.o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        o4.j jVar = this.f10357y;
        if (jVar != null) {
            jVar.p(i6);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        s sVar = this.f10356x;
        if (sVar != null) {
            if (sVar.f10377e) {
                sVar.f10377e = false;
            } else {
                sVar.f10377e = true;
                sVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f10358z;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f10358z;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o4.j jVar = this.f10357y;
        if (jVar != null) {
            jVar.w(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o4.j jVar = this.f10357y;
        if (jVar != null) {
            jVar.x(mode);
        }
    }

    @Override // w0.j
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        s sVar = this.f10356x;
        if (sVar != null) {
            sVar.f10373a = colorStateList;
            sVar.f10375c = true;
            sVar.a();
        }
    }

    @Override // w0.j
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        s sVar = this.f10356x;
        if (sVar != null) {
            sVar.f10374b = mode;
            sVar.f10376d = true;
            sVar.a();
        }
    }

    @Override // w0.k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        x0 x0Var = this.f10358z;
        x0Var.l(colorStateList);
        x0Var.b();
    }

    @Override // w0.k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        x0 x0Var = this.f10358z;
        x0Var.m(mode);
        x0Var.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i6) {
        setButtonDrawable(c9.a.f(getContext(), i6));
    }
}
