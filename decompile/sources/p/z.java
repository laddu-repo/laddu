package p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class z extends MultiAutoCompleteTextView implements w0.k {
    public static final int[] A = {R.attr.popupBackground};

    /* renamed from: x, reason: collision with root package name */
    public final o4.j f10433x;

    /* renamed from: y, reason: collision with root package name */
    public final x0 f10434y;

    /* renamed from: z, reason: collision with root package name */
    public final b0 f10435z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.playfy.tv.R.attr.autoCompleteTextViewStyle);
        c3.a(context);
        b3.a(this, getContext());
        n9.j E = n9.j.E(getContext(), attributeSet, A, com.playfy.tv.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) E.f9356z).hasValue(0)) {
            setDropDownBackgroundDrawable(E.v(0));
        }
        E.G();
        o4.j jVar = new o4.j(this);
        this.f10433x = jVar;
        jVar.m(attributeSet, com.playfy.tv.R.attr.autoCompleteTextViewStyle);
        x0 x0Var = new x0(this);
        this.f10434y = x0Var;
        x0Var.f(attributeSet, com.playfy.tv.R.attr.autoCompleteTextViewStyle);
        x0Var.b();
        b0 b0Var = new b0(this);
        this.f10435z = b0Var;
        b0Var.b(attributeSet, com.playfy.tv.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = isFocusable();
            boolean isClickable = isClickable();
            boolean isLongClickable = isLongClickable();
            int inputType = getInputType();
            KeyListener a10 = b0Var.a(keyListener);
            if (a10 != keyListener) {
                super.setKeyListener(a10);
                setRawInputType(inputType);
                setFocusable(isFocusable);
                setClickable(isClickable);
                setLongClickable(isLongClickable);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o4.j jVar = this.f10433x;
        if (jVar != null) {
            jVar.b();
        }
        x0 x0Var = this.f10434y;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        o4.j jVar = this.f10433x;
        if (jVar != null) {
            return jVar.j();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o4.j jVar = this.f10433x;
        if (jVar != null) {
            return jVar.k();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f10434y.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f10434y.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        dg.b.l(editorInfo, onCreateInputConnection, this);
        return this.f10435z.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o4.j jVar = this.f10433x;
        if (jVar != null) {
            jVar.o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        o4.j jVar = this.f10433x;
        if (jVar != null) {
            jVar.p(i6);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f10434y;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f10434y;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i6) {
        setDropDownBackgroundDrawable(c9.a.f(getContext(), i6));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f10435z.d(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f10435z.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o4.j jVar = this.f10433x;
        if (jVar != null) {
            jVar.w(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o4.j jVar = this.f10433x;
        if (jVar != null) {
            jVar.x(mode);
        }
    }

    @Override // w0.k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        x0 x0Var = this.f10434y;
        x0Var.l(colorStateList);
        x0Var.b();
    }

    @Override // w0.k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        x0 x0Var = this.f10434y;
        x0Var.m(mode);
        x0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i6) {
        super.setTextAppearance(context, i6);
        x0 x0Var = this.f10434y;
        if (x0Var != null) {
            x0Var.g(context, i6);
        }
    }
}
