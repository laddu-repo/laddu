package t9;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import androidx.media3.decoder.DecoderInputBuffer;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d extends o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12432e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f12433g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f12434h;
    public EditText i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.google.android.material.datepicker.n f12435j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f12436k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AnimatorSet f12437l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ValueAnimator f12438m;

    public d(n nVar) {
        super(nVar);
        this.f12435j = new com.google.android.material.datepicker.n(14, this);
        this.f12436k = new a(this, 0);
        this.f12432e = u1.c.D(nVar.getContext(), p8.b.motionDurationShort3, 100);
        this.f = u1.c.D(nVar.getContext(), p8.b.motionDurationShort3, 150);
        this.f12433g = u1.c.E(nVar.getContext(), p8.b.motionEasingLinearInterpolator, q8.a.f10944a);
        this.f12434h = u1.c.E(nVar.getContext(), p8.b.motionEasingEmphasizedInterpolator, q8.a.f10947d);
    }

    @Override // t9.o
    public final void a() {
        if (this.f12466b.K != null) {
            return;
        }
        s(t());
    }

    @Override // t9.o
    public final int c() {
        return p8.j.clear_text_end_icon_content_description;
    }

    @Override // t9.o
    public final int d() {
        return p8.e.mtrl_ic_cancel;
    }

    @Override // t9.o
    public final View.OnFocusChangeListener e() {
        return this.f12436k;
    }

    @Override // t9.o
    public final View.OnClickListener f() {
        return this.f12435j;
    }

    @Override // t9.o
    public final View.OnFocusChangeListener g() {
        return this.f12436k;
    }

    @Override // t9.o
    public final void l(EditText editText) {
        this.i = editText;
        this.f12465a.setEndIconVisible(t());
    }

    @Override // t9.o
    public final void o(boolean z2) {
        if (this.f12466b.K == null) {
            return;
        }
        s(z2);
    }

    @Override // t9.o
    public final void q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f12434h);
        valueAnimatorOfFloat.setDuration(this.f);
        final int i = 1;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: t9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f12429b;

            {
                this.f12429b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        d dVar = this.f12429b;
                        dVar.getClass();
                        dVar.f12468d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        d dVar2 = this.f12429b;
                        dVar2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar2.f12468d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f12433g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i10 = this.f12432e;
        valueAnimatorOfFloat2.setDuration(i10);
        final int i11 = 0;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: t9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f12429b;

            {
                this.f12429b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i11) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        d dVar = this.f12429b;
                        dVar.getClass();
                        dVar.f12468d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        d dVar2 = this.f12429b;
                        dVar2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar2.f12468d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f12437l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f12437l.addListener(new c(this, i11));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i10);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: t9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f12429b;

            {
                this.f12429b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i11) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        d dVar = this.f12429b;
                        dVar.getClass();
                        dVar.f12468d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        d dVar2 = this.f12429b;
                        dVar2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar2.f12468d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.f12438m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new c(this, i));
    }

    @Override // t9.o
    public final void r() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new jd.j(6, this));
        }
    }

    public final void s(boolean z2) {
        boolean z10 = this.f12466b.d() == z2;
        if (z2 && !this.f12437l.isRunning()) {
            this.f12438m.cancel();
            this.f12437l.start();
            if (z10) {
                this.f12437l.end();
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        this.f12437l.cancel();
        this.f12438m.start();
        if (z10) {
            this.f12438m.end();
        }
    }

    public final boolean t() {
        EditText editText = this.i;
        if (editText != null) {
            return (editText.hasFocus() || this.f12468d.hasFocus()) && this.i.getText().length() > 0;
        }
        return false;
    }
}
