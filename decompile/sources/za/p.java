package za;

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
import com.google.android.gms.internal.measurement.j5;
import com.google.android.material.textfield.TextInputLayout;
import com.playfy.tv.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import okhttp3.HttpUrl;
import p.b1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p {
    public ColorStateList A;
    public Typeface B;

    /* renamed from: a, reason: collision with root package name */
    public final int f15278a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15279b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15280c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f15281d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f15282e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f15283f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f15284g;

    /* renamed from: h, reason: collision with root package name */
    public final TextInputLayout f15285h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f15286i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f15287k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f15288l;

    /* renamed from: m, reason: collision with root package name */
    public final float f15289m;

    /* renamed from: n, reason: collision with root package name */
    public int f15290n;

    /* renamed from: o, reason: collision with root package name */
    public int f15291o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f15292p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f15293q;

    /* renamed from: r, reason: collision with root package name */
    public b1 f15294r;
    public CharSequence s;

    /* renamed from: t, reason: collision with root package name */
    public int f15295t;

    /* renamed from: u, reason: collision with root package name */
    public int f15296u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f15297v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f15298w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f15299x;

    /* renamed from: y, reason: collision with root package name */
    public b1 f15300y;

    /* renamed from: z, reason: collision with root package name */
    public int f15301z;

    public p(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f15284g = context;
        this.f15285h = textInputLayout;
        this.f15289m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f15278a = j5.t(context, R.attr.motionDurationShort4, 217);
        this.f15279b = j5.t(context, R.attr.motionDurationMedium4, 167);
        this.f15280c = j5.t(context, R.attr.motionDurationShort4, 167);
        this.f15281d = j5.u(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, u9.a.f12956d);
        LinearInterpolator linearInterpolator = u9.a.f12953a;
        this.f15282e = j5.u(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f15283f = j5.u(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(b1 b1Var, int i6) {
        if (this.f15286i == null && this.f15287k == null) {
            Context context = this.f15284g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f15286i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f15286i;
            TextInputLayout textInputLayout = this.f15285h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f15287k = new FrameLayout(context);
            this.f15286i.addView(this.f15287k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i6 != 0 && i6 != 1) {
            this.f15286i.addView(b1Var, new LinearLayout.LayoutParams(-2, -2));
        } else {
            this.f15287k.setVisibility(0);
            this.f15287k.addView(b1Var);
        }
        this.f15286i.setVisibility(0);
        this.j++;
    }

    public final void b() {
        if (this.f15286i != null) {
            TextInputLayout textInputLayout = this.f15285h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f15284g;
                boolean o10 = a8.i.o(context);
                LinearLayout linearLayout = this.f15286i;
                int paddingStart = editText.getPaddingStart();
                if (o10) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (o10) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (o10) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f15288l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z10, b1 b1Var, int i6, int i10, int i11) {
        boolean z11;
        float f3;
        long j;
        TimeInterpolator timeInterpolator;
        if (b1Var != null && z10) {
            if (i6 == i11 || i6 == i10) {
                if (i11 == i6) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    f3 = 1.0f;
                } else {
                    f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(b1Var, (Property<b1, Float>) View.ALPHA, f3);
                int i12 = this.f15280c;
                if (z11) {
                    j = this.f15279b;
                } else {
                    j = i12;
                }
                ofFloat.setDuration(j);
                if (z11) {
                    timeInterpolator = this.f15282e;
                } else {
                    timeInterpolator = this.f15283f;
                }
                ofFloat.setInterpolator(timeInterpolator);
                if (i6 == i11 && i10 != 0) {
                    ofFloat.setStartDelay(i12);
                }
                arrayList.add(ofFloat);
                if (i11 == i6 && i10 != 0) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(b1Var, (Property<b1, Float>) View.TRANSLATION_Y, -this.f15289m, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    ofFloat2.setDuration(this.f15278a);
                    ofFloat2.setInterpolator(this.f15281d);
                    ofFloat2.setStartDelay(i12);
                    arrayList.add(ofFloat2);
                }
            }
        }
    }

    public final TextView e(int i6) {
        if (i6 != 1) {
            if (i6 != 2) {
                return null;
            }
            return this.f15300y;
        }
        return this.f15294r;
    }

    public final void f() {
        this.f15292p = null;
        c();
        if (this.f15290n == 1) {
            if (this.f15299x && !TextUtils.isEmpty(this.f15298w)) {
                this.f15291o = 2;
            } else {
                this.f15291o = 0;
            }
        }
        i(h(this.f15294r, HttpUrl.FRAGMENT_ENCODE_SET), this.f15290n, this.f15291o);
    }

    public final void g(b1 b1Var, int i6) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f15286i;
        if (linearLayout != null) {
            if ((i6 == 0 || i6 == 1) && (frameLayout = this.f15287k) != null) {
                frameLayout.removeView(b1Var);
            } else {
                linearLayout.removeView(b1Var);
            }
            int i10 = this.j - 1;
            this.j = i10;
            LinearLayout linearLayout2 = this.f15286i;
            if (i10 == 0) {
                linearLayout2.setVisibility(8);
            }
        }
    }

    public final boolean h(b1 b1Var, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f15285h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            if (this.f15291o != this.f15290n || b1Var == null || !TextUtils.equals(b1Var.getText(), charSequence)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(boolean z10, int i6, int i10) {
        TextView e10;
        TextView e11;
        if (i6 == i10) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f15288l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f15299x, this.f15300y, 2, i6, i10);
            d(arrayList, this.f15293q, this.f15294r, 1, i6, i10);
            jb.b.v(animatorSet, arrayList);
            animatorSet.addListener(new n(this, i10, e(i6), i6, e(i10)));
            animatorSet.start();
        } else if (i6 != i10) {
            if (i10 != 0 && (e11 = e(i10)) != null) {
                e11.setVisibility(0);
                e11.setAlpha(1.0f);
            }
            if (i6 != 0 && (e10 = e(i6)) != null) {
                e10.setVisibility(4);
                if (i6 == 1) {
                    e10.setText((CharSequence) null);
                }
            }
            this.f15290n = i10;
        }
        TextInputLayout textInputLayout = this.f15285h;
        textInputLayout.t();
        textInputLayout.w(z10, false);
        textInputLayout.z();
    }
}
