package za;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import bf.y;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.playfy.tv.R;
import p.b1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t extends LinearLayout {
    public final CheckableImageButton A;
    public ColorStateList B;
    public PorterDuff.Mode C;
    public int D;
    public ImageView.ScaleType E;
    public View.OnLongClickListener F;
    public boolean G;

    /* renamed from: x, reason: collision with root package name */
    public final TextInputLayout f15308x;

    /* renamed from: y, reason: collision with root package name */
    public final b1 f15309y;

    /* renamed from: z, reason: collision with root package name */
    public CharSequence f15310z;

    public t(TextInputLayout textInputLayout, n9.j jVar) {
        super(textInputLayout.getContext());
        CharSequence text;
        Drawable b10;
        this.f15308x = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.A = checkableImageButton;
        if (Build.VERSION.SDK_INT < 23) {
            Context context = checkableImageButton.getContext();
            int d10 = (int) ma.n.d(checkableImageButton.getContext(), 4);
            int[] iArr = sa.b.f12281a;
            b10 = sa.a.b(context, d10);
            checkableImageButton.setBackground(b10);
        }
        b1 b1Var = new b1(getContext(), null);
        this.f15309y = b1Var;
        if (a8.i.o(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.F;
        checkableImageButton.setOnClickListener(null);
        y.t(checkableImageButton, onLongClickListener);
        this.F = null;
        checkableImageButton.setOnLongClickListener(null);
        y.t(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) jVar.f9356z;
        if (typedArray.hasValue(70)) {
            this.B = a8.i.j(getContext(), jVar, 70);
        }
        if (typedArray.hasValue(71)) {
            this.C = ma.n.g(typedArray.getInt(71, -1), null);
        }
        if (typedArray.hasValue(67)) {
            b(jVar.v(67));
            if (typedArray.hasValue(66) && checkableImageButton.getContentDescription() != (text = typedArray.getText(66))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize >= 0) {
            if (dimensionPixelSize != this.D) {
                this.D = dimensionPixelSize;
                checkableImageButton.setMinimumWidth(dimensionPixelSize);
                checkableImageButton.setMinimumHeight(dimensionPixelSize);
            }
            if (typedArray.hasValue(69)) {
                ImageView.ScaleType h4 = y.h(typedArray.getInt(69, -1));
                this.E = h4;
                checkableImageButton.setScaleType(h4);
            }
            b1Var.setVisibility(8);
            b1Var.setId(R.id.textinput_prefix_text);
            b1Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            b1Var.setAccessibilityLiveRegion(1);
            c9.a.t(b1Var, typedArray.getResourceId(61, 0));
            if (typedArray.hasValue(62)) {
                b1Var.setTextColor(jVar.t(62));
            }
            CharSequence text2 = typedArray.getText(60);
            this.f15310z = TextUtils.isEmpty(text2) ? null : text2;
            b1Var.setText(text2);
            e();
            addView(checkableImageButton);
            addView(b1Var);
            return;
        }
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public final int a() {
        int i6;
        CheckableImageButton checkableImageButton = this.A;
        if (checkableImageButton.getVisibility() == 0) {
            i6 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i6 = 0;
        }
        return this.f15309y.getPaddingStart() + getPaddingStart() + i6;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.A;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.B;
            PorterDuff.Mode mode = this.C;
            TextInputLayout textInputLayout = this.f15308x;
            y.c(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            y.s(textInputLayout, checkableImageButton, this.B);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.F;
        checkableImageButton.setOnClickListener(null);
        y.t(checkableImageButton, onLongClickListener);
        this.F = null;
        checkableImageButton.setOnLongClickListener(null);
        y.t(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z10) {
        boolean z11;
        CheckableImageButton checkableImageButton = this.A;
        int i6 = 0;
        if (checkableImageButton.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != z10) {
            if (!z10) {
                i6 = 8;
            }
            checkableImageButton.setVisibility(i6);
            d();
            e();
        }
    }

    public final void d() {
        int paddingStart;
        EditText editText = this.f15308x.B;
        if (editText == null) {
            return;
        }
        if (this.A.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            paddingStart = editText.getPaddingStart();
        }
        this.f15309y.setPaddingRelative(paddingStart, editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    public final void e() {
        int i6;
        int i10 = 8;
        if (this.f15310z != null && !this.G) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        if (this.A.getVisibility() == 0 || i6 == 0) {
            i10 = 0;
        }
        setVisibility(i10);
        this.f15309y.setVisibility(i6);
        this.f15308x.s();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i6, int i10) {
        super.onMeasure(i6, i10);
        d();
    }
}
