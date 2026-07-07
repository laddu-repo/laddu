package t9;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import o.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class r {
    public ColorStateList A;
    public Typeface B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f12478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f12479e;
    public final TimeInterpolator f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f12480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextInputLayout f12481h;
    public LinearLayout i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12482j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public FrameLayout f12483k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AnimatorSet f12484l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f12485m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f12486n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f12487o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f12488p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f12489q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public z0 f12490r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f12491s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f12492t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f12493u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ColorStateList f12494v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CharSequence f12495w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f12496x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public z0 f12497y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f12498z;

    public r(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f12480g = context;
        this.f12481h = textInputLayout;
        this.f12485m = context.getResources().getDimensionPixelSize(p8.d.design_textinput_caption_translate_y);
        this.f12475a = u1.c.D(context, p8.b.motionDurationShort4, 217);
        this.f12476b = u1.c.D(context, p8.b.motionDurationMedium4, 167);
        this.f12477c = u1.c.D(context, p8.b.motionDurationShort4, 167);
        this.f12478d = u1.c.E(context, p8.b.motionEasingEmphasizedDecelerateInterpolator, q8.a.f10947d);
        int i = p8.b.motionEasingEmphasizedDecelerateInterpolator;
        LinearInterpolator linearInterpolator = q8.a.f10944a;
        this.f12479e = u1.c.E(context, i, linearInterpolator);
        this.f = u1.c.E(context, p8.b.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(z0 z0Var, int i) {
        if (this.i == null && this.f12483k == null) {
            Context context = this.f12480g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.i;
            TextInputLayout textInputLayout = this.f12481h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f12483k = new FrameLayout(context);
            this.i.addView(this.f12483k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i == 0 || i == 1) {
            this.f12483k.setVisibility(0);
            this.f12483k.addView(z0Var);
        } else {
            this.i.addView(z0Var, new LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.f12482j++;
    }

    public final void b() {
        if (this.i != null) {
            TextInputLayout textInputLayout = this.f12481h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f12480g;
                boolean zY = com.bumptech.glide.c.y(context);
                LinearLayout linearLayout = this.i;
                int i = p8.d.material_helper_text_font_1_3_padding_horizontal;
                int paddingStart = editText.getPaddingStart();
                if (zY) {
                    paddingStart = context.getResources().getDimensionPixelSize(i);
                }
                int i10 = p8.d.material_helper_text_font_1_3_padding_top;
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(p8.d.material_helper_text_default_padding_top);
                if (zY) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
                }
                int i11 = p8.d.material_helper_text_font_1_3_padding_horizontal;
                int paddingEnd = editText.getPaddingEnd();
                if (zY) {
                    paddingEnd = context.getResources().getDimensionPixelSize(i11);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f12484l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z2, z0 z0Var, int i, int i10, int i11) {
        if (z0Var == null || !z2) {
            return;
        }
        if (i == i11 || i == i10) {
            boolean z10 = i11 == i;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(z0Var, (Property<z0, Float>) View.ALPHA, z10 ? 1.0f : 0.0f);
            int i12 = this.f12477c;
            objectAnimatorOfFloat.setDuration(z10 ? this.f12476b : i12);
            objectAnimatorOfFloat.setInterpolator(z10 ? this.f12479e : this.f);
            if (i == i11 && i10 != 0) {
                objectAnimatorOfFloat.setStartDelay(i12);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i11 != i || i10 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(z0Var, (Property<z0, Float>) View.TRANSLATION_Y, -this.f12485m, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f12475a);
            objectAnimatorOfFloat2.setInterpolator(this.f12478d);
            objectAnimatorOfFloat2.setStartDelay(i12);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    public final TextView e(int i) {
        if (i == 1) {
            return this.f12490r;
        }
        if (i != 2) {
            return null;
        }
        return this.f12497y;
    }

    public final void f() {
        this.f12488p = null;
        c();
        if (this.f12486n == 1) {
            if (!this.f12496x || TextUtils.isEmpty(this.f12495w)) {
                this.f12487o = 0;
            } else {
                this.f12487o = 2;
            }
        }
        i(this.f12486n, this.f12487o, h(this.f12490r, ""));
    }

    public final void g(z0 z0Var, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f12483k) != null) {
            frameLayout.removeView(z0Var);
        } else {
            linearLayout.removeView(z0Var);
        }
        int i10 = this.f12482j - 1;
        this.f12482j = i10;
        LinearLayout linearLayout2 = this.i;
        if (i10 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(z0 z0Var, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f12481h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f12487o == this.f12486n && z0Var != null && TextUtils.equals(z0Var.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public final void i(int i, int i10, boolean z2) {
        TextView textViewE;
        TextView textViewE2;
        if (i == i10) {
            return;
        }
        if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f12484l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f12496x, this.f12497y, 2, i, i10);
            d(arrayList, this.f12489q, this.f12490r, 1, i, i10);
            a.a.w(animatorSet, arrayList);
            animatorSet.addListener(new p(this, i10, e(i), i, e(i10)));
            animatorSet.start();
        } else if (i != i10) {
            if (i10 != 0 && (textViewE2 = e(i10)) != null) {
                textViewE2.setVisibility(0);
                textViewE2.setAlpha(1.0f);
            }
            if (i != 0 && (textViewE = e(i)) != null) {
                textViewE.setVisibility(4);
                if (i == 1) {
                    textViewE.setText((CharSequence) null);
                }
            }
            this.f12486n = i10;
        }
        TextInputLayout textInputLayout = this.f12481h;
        textInputLayout.t();
        textInputLayout.w(z2, false);
        textInputLayout.z();
    }
}
