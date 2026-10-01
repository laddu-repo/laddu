package za;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.gms.internal.measurement.j5;
import com.google.android.material.internal.CheckableImageButton;
import com.playfy.tv.R;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c extends m {

    /* renamed from: e, reason: collision with root package name */
    public final int f15236e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15237f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f15238g;

    /* renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f15239h;

    /* renamed from: i, reason: collision with root package name */
    public EditText f15240i;
    public final com.google.android.material.datepicker.n j;

    /* renamed from: k, reason: collision with root package name */
    public final gd.a f15241k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f15242l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f15243m;

    public c(l lVar) {
        super(lVar);
        this.j = new com.google.android.material.datepicker.n(this, 11);
        this.f15241k = new gd.a(this, 5);
        this.f15236e = j5.t(lVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f15237f = j5.t(lVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f15238g = j5.u(lVar.getContext(), R.attr.motionEasingLinearInterpolator, u9.a.f12953a);
        this.f15239h = j5.u(lVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, u9.a.f12956d);
    }

    @Override // za.m
    public final void a() {
        if (this.f15269b.M != null) {
            return;
        }
        s(t());
    }

    @Override // za.m
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // za.m
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // za.m
    public final View.OnFocusChangeListener e() {
        return this.f15241k;
    }

    @Override // za.m
    public final View.OnClickListener f() {
        return this.j;
    }

    @Override // za.m
    public final View.OnFocusChangeListener g() {
        return this.f15241k;
    }

    @Override // za.m
    public final void l(EditText editText) {
        this.f15240i = editText;
        this.f15268a.setEndIconVisible(t());
    }

    @Override // za.m
    public final void o(boolean z10) {
        if (this.f15269b.M == null) {
            return;
        }
        s(z10);
    }

    @Override // za.m
    public final void q() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.f15239h);
        ofFloat.setDuration(this.f15237f);
        final int i6 = 1;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: za.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f15233b;

            {
                this.f15233b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i6) {
                    case 0:
                        c cVar = this.f15233b;
                        cVar.getClass();
                        cVar.f15271d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        c cVar2 = this.f15233b;
                        cVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = cVar2.f15271d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        TimeInterpolator timeInterpolator = this.f15238g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i10 = this.f15236e;
        ofFloat2.setDuration(i10);
        final int i11 = 0;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: za.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f15233b;

            {
                this.f15233b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i11) {
                    case 0:
                        c cVar = this.f15233b;
                        cVar.getClass();
                        cVar.f15271d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        c cVar2 = this.f15233b;
                        cVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = cVar2.f15271d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f15242l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f15242l.addListener(new b(this, i11));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i10);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: za.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f15233b;

            {
                this.f15233b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i11) {
                    case 0:
                        c cVar = this.f15233b;
                        cVar.getClass();
                        cVar.f15271d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        c cVar2 = this.f15233b;
                        cVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = cVar2.f15271d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        this.f15243m = ofFloat3;
        ofFloat3.addListener(new b(this, i6));
    }

    @Override // za.m
    public final void r() {
        EditText editText = this.f15240i;
        if (editText != null) {
            editText.post(new j2.h(this, 18));
        }
    }

    public final void s(boolean z10) {
        boolean z11;
        if (this.f15269b.d() == z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && !this.f15242l.isRunning()) {
            this.f15243m.cancel();
            this.f15242l.start();
            if (z11) {
                this.f15242l.end();
                return;
            }
            return;
        }
        if (!z10) {
            this.f15242l.cancel();
            this.f15243m.start();
            if (z11) {
                this.f15243m.end();
            }
        }
    }

    public final boolean t() {
        EditText editText = this.f15240i;
        if (editText != null) {
            if ((editText.hasFocus() || this.f15271d.hasFocus()) && this.f15240i.getText().length() > 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
