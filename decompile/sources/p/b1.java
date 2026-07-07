package p;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class b1 extends TextView implements w0.k {
    public w A;
    public boolean B;
    public k7.c C;
    public Future D;

    /* renamed from: x, reason: collision with root package name */
    public final o4.j f10210x;

    /* renamed from: y, reason: collision with root package name */
    public final x0 f10211y;

    /* renamed from: z, reason: collision with root package name */
    public final b0 f10212z;

    public b1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private w getEmojiTextViewHelper() {
        if (this.A == null) {
            this.A = new w(this);
        }
        return this.A;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o4.j jVar = this.f10210x;
        if (jVar != null) {
            jVar.b();
        }
        x0 x0Var = this.f10211y;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (u3.f10394c) {
            return super.getAutoSizeMaxTextSize();
        }
        x0 x0Var = this.f10211y;
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
        x0 x0Var = this.f10211y;
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
        x0 x0Var = this.f10211y;
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
        x0 x0Var = this.f10211y;
        if (x0Var != null) {
            return x0Var.f10416i.f10256f;
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (u3.f10394c) {
            if (super.getAutoSizeTextType() == 1) {
                return 1;
            }
            return 0;
        }
        x0 x0Var = this.f10211y;
        if (x0Var != null) {
            return x0Var.f10416i.f10251a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return c9.a.v(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public y0 getSuperCaller() {
        if (this.C == null) {
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 34) {
                this.C = new a1(this);
            } else if (i6 >= 28) {
                this.C = new z0(this);
            } else if (i6 >= 26) {
                this.C = new k7.c(this, 22);
            }
        }
        return this.C;
    }

    public ColorStateList getSupportBackgroundTintList() {
        o4.j jVar = this.f10210x;
        if (jVar != null) {
            return jVar.j();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o4.j jVar = this.f10210x;
        if (jVar != null) {
            return jVar.k();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f10211y.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f10211y.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.D;
        if (future != null) {
            try {
                this.D = null;
                if (future.get() == null) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        throw null;
                    }
                    c9.a.h(this);
                    throw null;
                }
                throw new ClassCastException();
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        b0 b0Var;
        if (Build.VERSION.SDK_INT < 28 && (b0Var = this.f10212z) != null) {
            TextClassifier textClassifier = (TextClassifier) b0Var.f10209c;
            if (textClassifier == null) {
                return r0.a((TextView) b0Var.f10208b);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    public r0.c getTextMetricsParamsCompat() {
        return c9.a.h(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f10211y.getClass();
        x0.h(editorInfo, onCreateInputConnection, this);
        dg.b.l(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 30 && i6 < 33 && onCheckIsTextEditor()) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        super.onLayout(z10, i6, i10, i11, i12);
        x0 x0Var = this.f10211y;
        if (x0Var != null && !u3.f10394c) {
            x0Var.f10416i.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i6, int i10) {
        Future future = this.D;
        if (future != null) {
            try {
                this.D = null;
                if (future.get() == null) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        throw null;
                    }
                    c9.a.h(this);
                    throw null;
                }
                throw new ClassCastException();
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i6, i10);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        super.onTextChanged(charSequence, i6, i10, i11);
        x0 x0Var = this.f10211y;
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
        x0 x0Var = this.f10211y;
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
        x0 x0Var = this.f10211y;
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
        x0 x0Var = this.f10211y;
        if (x0Var != null) {
            x0Var.k(i6);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o4.j jVar = this.f10210x;
        if (jVar != null) {
            jVar.o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        o4.j jVar = this.f10210x;
        if (jVar != null) {
            jVar.p(i6);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f10211y;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f10211y;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f10211y;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f10211y;
        if (x0Var != null) {
            x0Var.b();
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

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i6) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().s(i6);
        } else {
            c9.a.q(this, i6);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i6) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().o(i6);
        } else {
            c9.a.r(this, i6);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i6) {
        c9.a.s(this, i6);
    }

    public void setPrecomputedText(r0.d dVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        c9.a.h(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o4.j jVar = this.f10210x;
        if (jVar != null) {
            jVar.w(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o4.j jVar = this.f10210x;
        if (jVar != null) {
            jVar.x(mode);
        }
    }

    @Override // w0.k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        x0 x0Var = this.f10211y;
        x0Var.l(colorStateList);
        x0Var.b();
    }

    @Override // w0.k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        x0 x0Var = this.f10211y;
        x0Var.m(mode);
        x0Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i6) {
        super.setTextAppearance(context, i6);
        x0 x0Var = this.f10211y;
        if (x0Var != null) {
            x0Var.g(context, i6);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        b0 b0Var;
        if (Build.VERSION.SDK_INT < 28 && (b0Var = this.f10212z) != null) {
            b0Var.f10209c = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    public void setTextFuture(Future<r0.d> future) {
        this.D = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(r0.c cVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = cVar.f11251b;
        TextPaint textPaint = cVar.f11250a;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i6 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i6 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i6 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i6 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i6 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i6 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i6 = 7;
            }
        }
        setTextDirection(i6);
        if (Build.VERSION.SDK_INT < 23) {
            float textScaleX = textPaint.getTextScaleX();
            getPaint().set(textPaint);
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
            return;
        }
        getPaint().set(textPaint);
        j4.n.h(this, cVar.f11252c);
        j4.n.k(this, cVar.f11253d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i6, float f3) {
        boolean z10 = u3.f10394c;
        if (z10) {
            super.setTextSize(i6, f3);
            return;
        }
        x0 x0Var = this.f10211y;
        if (x0Var != null) {
            g1 g1Var = x0Var.f10416i;
            if (!z10 && !g1Var.f()) {
                g1Var.g(i6, f3);
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i6) {
        Typeface typeface2;
        if (this.B) {
            return;
        }
        if (typeface != null && i6 > 0) {
            Context context = getContext();
            android.support.v4.media.session.b bVar = l0.f.f8069a;
            if (context != null) {
                typeface2 = Typeface.create(typeface, i6);
            } else {
                throw new IllegalArgumentException("Context cannot be null");
            }
        } else {
            typeface2 = null;
        }
        this.B = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i6);
        } finally {
            this.B = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        c3.a(context);
        this.B = false;
        this.C = null;
        b3.a(this, getContext());
        o4.j jVar = new o4.j(this);
        this.f10210x = jVar;
        jVar.m(attributeSet, i6);
        x0 x0Var = new x0(this);
        this.f10211y = x0Var;
        x0Var.f(attributeSet, i6);
        x0Var.b();
        b0 b0Var = new b0();
        b0Var.f10208b = this;
        this.f10212z = b0Var;
        getEmojiTextViewHelper().b(attributeSet, i6);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i6, float f3) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            getSuperCaller().t(i6, f3);
        } else if (i10 >= 34) {
            d.a.i(this, i6, f3);
        } else {
            c9.a.s(this, Math.round(TypedValue.applyDimension(i6, f3, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i6, int i10, int i11, int i12) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i6 != 0 ? c9.a.f(context, i6) : null, i10 != 0 ? c9.a.f(context, i10) : null, i11 != 0 ? c9.a.f(context, i11) : null, i12 != 0 ? c9.a.f(context, i12) : null);
        x0 x0Var = this.f10211y;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i6, int i10, int i11, int i12) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i6 != 0 ? c9.a.f(context, i6) : null, i10 != 0 ? c9.a.f(context, i10) : null, i11 != 0 ? c9.a.f(context, i11) : null, i12 != 0 ? c9.a.f(context, i12) : null);
        x0 x0Var = this.f10211y;
        if (x0Var != null) {
            x0Var.b();
        }
    }
}
