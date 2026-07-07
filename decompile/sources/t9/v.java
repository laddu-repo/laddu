package t9;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import o.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class v extends LinearLayout {
    public PorterDuff.Mode A;
    public int B;
    public ImageView.ScaleType C;
    public View.OnLongClickListener D;
    public boolean E;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TextInputLayout f12505v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final z0 f12506w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public CharSequence f12507x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final CheckableImageButton f12508y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ColorStateList f12509z;

    public v(TextInputLayout textInputLayout, hd.a aVar) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f12505v = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(p8.h.design_text_input_start_icon, (ViewGroup) this, false);
        this.f12508y = checkableImageButton;
        z0 z0Var = new z0(getContext(), null);
        this.f12506w = z0Var;
        if (com.bumptech.glide.c.y(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.D;
        checkableImageButton.setOnClickListener(null);
        u1.c.F(checkableImageButton, onLongClickListener);
        this.D = null;
        checkableImageButton.setOnLongClickListener(null);
        u1.c.F(checkableImageButton, null);
        int i = p8.l.TextInputLayout_startIconTint;
        TypedArray typedArray = (TypedArray) aVar.f6280x;
        if (typedArray.hasValue(i)) {
            this.f12509z = com.bumptech.glide.c.q(getContext(), aVar, p8.l.TextInputLayout_startIconTint);
        }
        if (typedArray.hasValue(p8.l.TextInputLayout_startIconTintMode)) {
            this.A = i9.n.c(typedArray.getInt(p8.l.TextInputLayout_startIconTintMode, -1), null);
        }
        if (typedArray.hasValue(p8.l.TextInputLayout_startIconDrawable)) {
            b(aVar.v(p8.l.TextInputLayout_startIconDrawable));
            if (typedArray.hasValue(p8.l.TextInputLayout_startIconContentDescription) && checkableImageButton.getContentDescription() != (text = typedArray.getText(p8.l.TextInputLayout_startIconContentDescription))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(p8.l.TextInputLayout_startIconCheckable, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(p8.l.TextInputLayout_startIconMinSize, getResources().getDimensionPixelSize(p8.d.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.B) {
            this.B = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(p8.l.TextInputLayout_startIconScaleType)) {
            ImageView.ScaleType scaleTypeK = u1.c.k(typedArray.getInt(p8.l.TextInputLayout_startIconScaleType, -1));
            this.C = scaleTypeK;
            checkableImageButton.setScaleType(scaleTypeK);
        }
        z0Var.setVisibility(8);
        z0Var.setId(p8.f.textinput_prefix_text);
        z0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        z0Var.setAccessibilityLiveRegion(1);
        z0Var.setTextAppearance(typedArray.getResourceId(p8.l.TextInputLayout_prefixTextAppearance, 0));
        if (typedArray.hasValue(p8.l.TextInputLayout_prefixTextColor)) {
            z0Var.setTextColor(aVar.s(p8.l.TextInputLayout_prefixTextColor));
        }
        CharSequence text2 = typedArray.getText(p8.l.TextInputLayout_prefixText);
        this.f12507x = TextUtils.isEmpty(text2) ? null : text2;
        z0Var.setText(text2);
        e();
        addView(checkableImageButton);
        addView(z0Var);
    }

    public final int a() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.f12508y;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        return this.f12506w.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f12508y;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f12509z;
            PorterDuff.Mode mode = this.A;
            TextInputLayout textInputLayout = this.f12505v;
            u1.c.b(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            u1.c.C(textInputLayout, checkableImageButton, this.f12509z);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.D;
        checkableImageButton.setOnClickListener(null);
        u1.c.F(checkableImageButton, onLongClickListener);
        this.D = null;
        checkableImageButton.setOnLongClickListener(null);
        u1.c.F(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z2) {
        CheckableImageButton checkableImageButton = this.f12508y;
        if ((checkableImageButton.getVisibility() == 0) != z2) {
            checkableImageButton.setVisibility(z2 ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        EditText editText = this.f12505v.f3565z;
        if (editText == null) {
            return;
        }
        this.f12506w.setPaddingRelative(this.f12508y.getVisibility() == 0 ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(p8.d.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    public final void e() {
        int i = (this.f12507x == null || this.E) ? 8 : 0;
        setVisibility((this.f12508y.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f12506w.setVisibility(i);
        this.f12505v.s();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        super.onMeasure(i, i10);
        d();
    }
}
