package g4;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.ui.PlayerView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class w {
    public boolean A;
    public boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f5602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f5603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f5604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ViewGroup f5605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ViewGroup f5606e;
    public final ViewGroup f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ViewGroup f5607g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ViewGroup f5608h;
    public final ViewGroup i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f5609j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View f5610k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AnimatorSet f5611l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AnimatorSet f5612m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AnimatorSet f5613n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AnimatorSet f5614o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AnimatorSet f5615p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ValueAnimator f5616q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ValueAnimator f5617r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final s f5618s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final s f5619t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final s f5621v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e f5623x;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final s f5620u = new s(this, 4);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final s f5622w = new s(this, 6);
    public boolean C = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f5625z = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f5624y = new ArrayList();

    public w(r rVar) {
        this.f5602a = rVar;
        final int i = 0;
        this.f5618s = new s(this, i);
        final int i10 = 3;
        this.f5619t = new s(this, i10);
        int i11 = 5;
        this.f5621v = new s(this, i11);
        final int i12 = 1;
        this.f5623x = new e(i12, this);
        this.f5603b = rVar.findViewById(g0.exo_controls_background);
        this.f5604c = (ViewGroup) rVar.findViewById(g0.exo_center_controls);
        this.f5606e = (ViewGroup) rVar.findViewById(g0.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) rVar.findViewById(g0.exo_bottom_bar);
        this.f5605d = viewGroup;
        this.i = (ViewGroup) rVar.findViewById(g0.exo_time);
        View viewFindViewById = rVar.findViewById(g0.exo_progress);
        this.f5609j = viewFindViewById;
        this.f = (ViewGroup) rVar.findViewById(g0.exo_basic_controls);
        this.f5607g = (ViewGroup) rVar.findViewById(g0.exo_extra_controls);
        this.f5608h = (ViewGroup) rVar.findViewById(g0.exo_extra_controls_scroll_view);
        View viewFindViewById2 = rVar.findViewById(g0.exo_overflow_show);
        this.f5610k = viewFindViewById2;
        View viewFindViewById3 = rVar.findViewById(g0.exo_overflow_hide);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new com.google.android.material.datepicker.n(i11, this));
            viewFindViewById3.setOnClickListener(new com.google.android.material.datepicker.n(i11, this));
        }
        final int i13 = 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: g4.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f5594b;

            {
                this.f5594b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i10) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        w wVar = this.f5594b;
                        wVar.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = wVar.f5603b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = wVar.f5604c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = wVar.f5606e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                        }
                        break;
                    case 1:
                        w wVar2 = this.f5594b;
                        wVar2.getClass();
                        wVar2.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        w wVar3 = this.f5594b;
                        wVar3.getClass();
                        wVar3.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        w wVar4 = this.f5594b;
                        wVar4.getClass();
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = wVar4.f5603b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup4 = wVar4.f5604c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = wVar4.f5606e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat.addListener(new u(this, i));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: g4.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f5594b;

            {
                this.f5594b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        w wVar = this.f5594b;
                        wVar.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = wVar.f5603b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = wVar.f5604c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = wVar.f5606e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                        }
                        break;
                    case 1:
                        w wVar2 = this.f5594b;
                        wVar2.getClass();
                        wVar2.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        w wVar3 = this.f5594b;
                        wVar3.getClass();
                        wVar3.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        w wVar4 = this.f5594b;
                        wVar4.getClass();
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = wVar4.f5603b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup4 = wVar4.f5604c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = wVar4.f5606e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat2.addListener(new u(this, i12));
        Resources resources = rVar.getResources();
        float dimension = resources.getDimension(d0.exo_styled_bottom_bar_height) - resources.getDimension(d0.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(d0.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f5611l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new v(this, rVar, i));
        animatorSet.play(valueAnimatorOfFloat).with(d(viewFindViewById, 0.0f, dimension)).with(d(viewGroup, 0.0f, dimension));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f5612m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new v(this, rVar, i12));
        animatorSet2.play(d(viewFindViewById, dimension, dimension2)).with(d(viewGroup, dimension, dimension2));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f5613n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new v(this, rVar, i13));
        animatorSet3.play(valueAnimatorOfFloat).with(d(viewFindViewById, 0.0f, dimension2)).with(d(viewGroup, 0.0f, dimension2));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f5614o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new u(this, i13));
        animatorSet4.play(valueAnimatorOfFloat2).with(d(viewFindViewById, dimension, 0.0f)).with(d(viewGroup, dimension, 0.0f));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f5615p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new u(this, i10));
        animatorSet5.play(valueAnimatorOfFloat2).with(d(viewFindViewById, dimension2, 0.0f)).with(d(viewGroup, dimension2, 0.0f));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f5616q = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: g4.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f5594b;

            {
                this.f5594b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i12) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        w wVar = this.f5594b;
                        wVar.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = wVar.f5603b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = wVar.f5604c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = wVar.f5606e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                        }
                        break;
                    case 1:
                        w wVar2 = this.f5594b;
                        wVar2.getClass();
                        wVar2.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        w wVar3 = this.f5594b;
                        wVar3.getClass();
                        wVar3.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        w wVar4 = this.f5594b;
                        wVar4.getClass();
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = wVar4.f5603b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup4 = wVar4.f5604c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = wVar4.f5606e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat3.addListener(new u(this, 4));
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f5617r = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: g4.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f5594b;

            {
                this.f5594b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i13) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        w wVar = this.f5594b;
                        wVar.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = wVar.f5603b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = wVar.f5604c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = wVar.f5606e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                        }
                        break;
                    case 1:
                        w wVar2 = this.f5594b;
                        wVar2.getClass();
                        wVar2.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        w wVar3 = this.f5594b;
                        wVar3.getClass();
                        wVar3.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        w wVar4 = this.f5594b;
                        wVar4.getClass();
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = wVar4.f5603b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup4 = wVar4.f5604c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = wVar4.f5606e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat4.addListener(new u(this, 5));
    }

    public static int c(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + width;
    }

    public static ObjectAnimator d(View view, float f, float f4) {
        return ObjectAnimator.ofFloat(view, "translationY", f, f4);
    }

    public static boolean j(View view) {
        int id2 = view.getId();
        return id2 == g0.exo_bottom_bar || id2 == g0.exo_prev || id2 == g0.exo_next || id2 == g0.exo_rew || id2 == g0.exo_rew_with_amount || id2 == g0.exo_ffwd || id2 == g0.exo_ffwd_with_amount;
    }

    public final void a(float f) {
        ViewGroup viewGroup = this.f5608h;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) ((1.0f - f) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f);
        }
        ViewGroup viewGroup3 = this.f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f);
        }
    }

    public final boolean b(View view) {
        return view != null && this.f5624y.contains(view);
    }

    public final void e(Runnable runnable, long j8) {
        if (j8 >= 0) {
            this.f5602a.postDelayed(runnable, j8);
        }
    }

    public final void f() {
        s sVar = this.f5622w;
        r rVar = this.f5602a;
        rVar.removeCallbacks(sVar);
        rVar.removeCallbacks(this.f5619t);
        rVar.removeCallbacks(this.f5621v);
        rVar.removeCallbacks(this.f5620u);
    }

    public final void g() {
        if (this.f5625z == 3) {
            return;
        }
        f();
        int showTimeoutMs = this.f5602a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.C) {
                e(this.f5622w, showTimeoutMs);
            } else if (this.f5625z == 1) {
                e(this.f5620u, 2000L);
            } else {
                e(this.f5621v, showTimeoutMs);
            }
        }
    }

    public final void h(View view, boolean z2) {
        if (view == null) {
            return;
        }
        ArrayList arrayList = this.f5624y;
        if (!z2) {
            view.setVisibility(8);
            arrayList.remove(view);
            return;
        }
        if (this.A && j(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        arrayList.add(view);
    }

    public final void i(int i) {
        int i10 = this.f5625z;
        this.f5625z = i;
        r rVar = this.f5602a;
        if (i == 2) {
            rVar.setVisibility(8);
        } else if (i10 == 2) {
            rVar.setVisibility(0);
        }
        if (i10 != i) {
            for (q qVar : rVar.f5587y) {
                int visibility = rVar.getVisibility();
                PlayerView playerView = ((y) qVar).f5634x;
                playerView.k();
                z zVar = playerView.J;
                if (zVar != null) {
                    fc.h hVar = (fc.h) ((s5.c) zVar).f11492w;
                    if (!hVar.K && !hVar.L) {
                        hVar.I = visibility == 0;
                    }
                }
            }
        }
    }

    public final void k() {
        if (!this.C) {
            i(0);
            g();
            return;
        }
        int i = this.f5625z;
        if (i == 1) {
            this.f5614o.start();
        } else if (i == 2) {
            this.f5615p.start();
        } else if (i == 3) {
            this.B = true;
        } else if (i == 4) {
            return;
        }
        g();
    }
}
