package o;

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
import k8.k4;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class z0 extends TextView implements x0.k {
    public k4 A;
    public Future B;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final cf.k f9354v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final v0 f9355w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f9356x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public u f9357y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f9358z;

    public z0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private u getEmojiTextViewHelper() {
        if (this.f9357y == null) {
            this.f9357y = new u(this);
        }
        return this.f9357y;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        cf.k kVar = this.f9354v;
        if (kVar != null) {
            kVar.b();
        }
        v0 v0Var = this.f9355w;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (s3.f9296c) {
            return super.getAutoSizeMaxTextSize();
        }
        v0 v0Var = this.f9355w;
        if (v0Var != null) {
            return Math.round(v0Var.i.f9144e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (s3.f9296c) {
            return super.getAutoSizeMinTextSize();
        }
        v0 v0Var = this.f9355w;
        if (v0Var != null) {
            return Math.round(v0Var.i.f9143d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (s3.f9296c) {
            return super.getAutoSizeStepGranularity();
        }
        v0 v0Var = this.f9355w;
        if (v0Var != null) {
            return Math.round(v0Var.i.f9142c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (s3.f9296c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        v0 v0Var = this.f9355w;
        return v0Var != null ? v0Var.i.f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (s3.f9296c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        v0 v0Var = this.f9355w;
        if (v0Var != null) {
            return v0Var.i.f9140a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return com.bumptech.glide.d.P(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public w0 getSuperCaller() {
        if (this.A == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.A = new y0(this);
            } else if (i >= 28) {
                this.A = new x0(this);
            } else if (i >= 26) {
                this.A = new k4((Object) this);
            }
        }
        return this.A;
    }

    public ColorStateList getSupportBackgroundTintList() {
        cf.k kVar = this.f9354v;
        if (kVar != null) {
            return kVar.w();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        cf.k kVar = this.f9354v;
        if (kVar != null) {
            return kVar.x();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f9355w.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f9355w.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.B;
        if (future != null) {
            try {
                this.B = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                com.bumptech.glide.d.v(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        y yVar;
        if (Build.VERSION.SDK_INT >= 28 || (yVar = this.f9356x) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) yVar.f9343c;
        return textClassifier == null ? o0.a((TextView) yVar.f9342b) : textClassifier;
    }

    public r0.d getTextMetricsParamsCompat() {
        return com.bumptech.glide.d.v(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f9355w.getClass();
        v0.h(editorInfo, inputConnectionOnCreateInputConnection, this);
        va.t1.j(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i, int i10, int i11, int i12) {
        super.onLayout(z2, i, i10, i11, i12);
        v0 v0Var = this.f9355w;
        if (v0Var == null || s3.f9296c) {
            return;
        }
        v0Var.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i10) {
        Future future = this.B;
        if (future != null) {
            try {
                this.B = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                com.bumptech.glide.d.v(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i10);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i10, int i11) {
        super.onTextChanged(charSequence, i, i10, i11);
        v0 v0Var = this.f9355w;
        if (v0Var != null) {
            e1 e1Var = v0Var.i;
            if (s3.f9296c || !e1Var.f()) {
                return;
            }
            e1Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i10, int i11, int i12) {
        if (s3.f9296c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i10, i11, i12);
            return;
        }
        v0 v0Var = this.f9355w;
        if (v0Var != null) {
            v0Var.i(i, i10, i11, i12);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (s3.f9296c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        v0 v0Var = this.f9355w;
        if (v0Var != null) {
            v0Var.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (s3.f9296c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        v0 v0Var = this.f9355w;
        if (v0Var != null) {
            v0Var.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        cf.k kVar = this.f9354v;
        if (kVar != null) {
            kVar.B();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        cf.k kVar = this.f9354v;
        if (kVar != null) {
            kVar.C(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.f9355w;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.f9355w;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.f9355w;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.f9355w;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(com.bumptech.glide.d.R(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().d(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().d(i);
        } else {
            com.bumptech.glide.d.J(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().a(i);
        } else {
            com.bumptech.glide.d.K(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        com.bumptech.glide.d.L(this, i);
    }

    public void setPrecomputedText(r0.e eVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        com.bumptech.glide.d.v(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        cf.k kVar = this.f9354v;
        if (kVar != null) {
            kVar.J(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        cf.k kVar = this.f9354v;
        if (kVar != null) {
            kVar.K(mode);
        }
    }

    @Override // x0.k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        v0 v0Var = this.f9355w;
        v0Var.l(colorStateList);
        v0Var.b();
    }

    @Override // x0.k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        v0 v0Var = this.f9355w;
        v0Var.m(mode);
        v0Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        v0 v0Var = this.f9355w;
        if (v0Var != null) {
            v0Var.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        y yVar;
        if (Build.VERSION.SDK_INT >= 28 || (yVar = this.f9356x) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            yVar.f9343c = textClassifier;
        }
    }

    public void setTextFuture(Future<r0.e> future) {
        this.B = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(r0.d dVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = dVar.f11053b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(dVar.f11052a);
        setBreakStrategy(dVar.f11054c);
        setHyphenationFrequency(dVar.f11055d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z2 = s3.f9296c;
        if (z2) {
            super.setTextSize(i, f);
            return;
        }
        v0 v0Var = this.f9355w;
        if (v0Var != null) {
            e1 e1Var = v0Var.i;
            if (z2 || e1Var.f()) {
                return;
            }
            e1Var.g(i, f);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.f9358z) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            qf.g gVar = l0.f.f8002a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.f9358z = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f9358z = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b3.a(context);
        this.f9358z = false;
        this.A = null;
        a3.a(getContext(), this);
        cf.k kVar = new cf.k(this);
        this.f9354v = kVar;
        kVar.z(attributeSet, i);
        v0 v0Var = new v0(this);
        this.f9355w = v0Var;
        v0Var.f(attributeSet, i);
        v0Var.b();
        y yVar = new y();
        yVar.f9342b = this;
        this.f9356x = yVar;
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            getSuperCaller().m(i, f);
        } else if (i10 >= 34) {
            s.a.h(this, i, f);
        } else {
            com.bumptech.glide.d.L(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i10, int i11, int i12) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? com.bumptech.glide.c.t(context, i) : null, i10 != 0 ? com.bumptech.glide.c.t(context, i10) : null, i11 != 0 ? com.bumptech.glide.c.t(context, i11) : null, i12 != 0 ? com.bumptech.glide.c.t(context, i12) : null);
        v0 v0Var = this.f9355w;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i10, int i11, int i12) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? com.bumptech.glide.c.t(context, i) : null, i10 != 0 ? com.bumptech.glide.c.t(context, i10) : null, i11 != 0 ? com.bumptech.glide.c.t(context, i11) : null, i12 != 0 ? com.bumptech.glide.c.t(context, i12) : null);
        v0 v0Var = this.f9355w;
        if (v0Var != null) {
            v0Var.b();
        }
    }
}
