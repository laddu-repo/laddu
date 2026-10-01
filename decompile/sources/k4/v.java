package k4;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.playfy.tv.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class v {
    public boolean A;
    public boolean B;

    /* renamed from: a, reason: collision with root package name */
    public final q f7702a;

    /* renamed from: b, reason: collision with root package name */
    public final View f7703b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f7704c;

    /* renamed from: d, reason: collision with root package name */
    public final ViewGroup f7705d;

    /* renamed from: e, reason: collision with root package name */
    public final ViewGroup f7706e;

    /* renamed from: f, reason: collision with root package name */
    public final ViewGroup f7707f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewGroup f7708g;

    /* renamed from: h, reason: collision with root package name */
    public final ViewGroup f7709h;

    /* renamed from: i, reason: collision with root package name */
    public final ViewGroup f7710i;
    public final View j;

    /* renamed from: k, reason: collision with root package name */
    public final View f7711k;

    /* renamed from: l, reason: collision with root package name */
    public final AnimatorSet f7712l;

    /* renamed from: m, reason: collision with root package name */
    public final AnimatorSet f7713m;

    /* renamed from: n, reason: collision with root package name */
    public final AnimatorSet f7714n;

    /* renamed from: o, reason: collision with root package name */
    public final AnimatorSet f7715o;

    /* renamed from: p, reason: collision with root package name */
    public final AnimatorSet f7716p;

    /* renamed from: q, reason: collision with root package name */
    public final ValueAnimator f7717q;

    /* renamed from: r, reason: collision with root package name */
    public final ValueAnimator f7718r;
    public final r s;

    /* renamed from: t, reason: collision with root package name */
    public final r f7719t;

    /* renamed from: v, reason: collision with root package name */
    public final r f7721v;

    /* renamed from: x, reason: collision with root package name */
    public final ca.a f7723x;

    /* renamed from: u, reason: collision with root package name */
    public final r f7720u = new r(this, 4);

    /* renamed from: w, reason: collision with root package name */
    public final r f7722w = new r(this, 6);
    public boolean C = true;

    /* renamed from: z, reason: collision with root package name */
    public int f7725z = 0;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f7724y = new ArrayList();

    public v(q qVar) {
        this.f7702a = qVar;
        final int i6 = 0;
        this.s = new r(this, i6);
        final int i10 = 3;
        this.f7719t = new r(this, i10);
        int i11 = 5;
        this.f7721v = new r(this, i11);
        this.f7723x = new ca.a(this, i10);
        final int i12 = 1;
        this.f7703b = qVar.findViewById(R.id.exo_controls_background);
        this.f7704c = (ViewGroup) qVar.findViewById(R.id.exo_center_controls);
        this.f7706e = (ViewGroup) qVar.findViewById(R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) qVar.findViewById(R.id.exo_bottom_bar);
        this.f7705d = viewGroup;
        this.f7710i = (ViewGroup) qVar.findViewById(R.id.exo_time);
        View findViewById = qVar.findViewById(R.id.exo_progress);
        this.j = findViewById;
        this.f7707f = (ViewGroup) qVar.findViewById(R.id.exo_basic_controls);
        this.f7708g = (ViewGroup) qVar.findViewById(R.id.exo_extra_controls);
        this.f7709h = (ViewGroup) qVar.findViewById(R.id.exo_extra_controls_scroll_view);
        View findViewById2 = qVar.findViewById(R.id.exo_overflow_show);
        this.f7711k = findViewById2;
        View findViewById3 = qVar.findViewById(R.id.exo_overflow_hide);
        if (findViewById2 != null && findViewById3 != null) {
            findViewById2.setOnClickListener(new com.google.android.material.datepicker.n(this, i11));
            findViewById3.setOnClickListener(new com.google.android.material.datepicker.n(this, i11));
        }
        final int i13 = 2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: k4.s

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f7696b;

            {
                this.f7696b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i10) {
                    case 0:
                        v vVar = this.f7696b;
                        vVar.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = vVar.f7703b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = vVar.f7704c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = vVar.f7706e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                            return;
                        }
                        return;
                    case 1:
                        v vVar2 = this.f7696b;
                        vVar2.getClass();
                        vVar2.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    case 2:
                        v vVar3 = this.f7696b;
                        vVar3.getClass();
                        vVar3.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        v vVar4 = this.f7696b;
                        vVar4.getClass();
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = vVar4.f7703b;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup4 = vVar4.f7704c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = vVar4.f7706e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                            return;
                        }
                        return;
                }
            }
        });
        ofFloat.addListener(new t(this, i6));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: k4.s

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f7696b;

            {
                this.f7696b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i6) {
                    case 0:
                        v vVar = this.f7696b;
                        vVar.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = vVar.f7703b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = vVar.f7704c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = vVar.f7706e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                            return;
                        }
                        return;
                    case 1:
                        v vVar2 = this.f7696b;
                        vVar2.getClass();
                        vVar2.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    case 2:
                        v vVar3 = this.f7696b;
                        vVar3.getClass();
                        vVar3.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        v vVar4 = this.f7696b;
                        vVar4.getClass();
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = vVar4.f7703b;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup4 = vVar4.f7704c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = vVar4.f7706e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                            return;
                        }
                        return;
                }
            }
        });
        ofFloat2.addListener(new t(this, i12));
        Resources resources = qVar.getResources();
        float dimension = resources.getDimension(R.dimen.exo_styled_bottom_bar_height) - resources.getDimension(R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(R.dimen.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f7712l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new u(this, qVar, i6));
        animatorSet.play(ofFloat).with(d(findViewById, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, dimension)).with(d(viewGroup, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, dimension));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f7713m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new u(this, qVar, i12));
        animatorSet2.play(d(findViewById, dimension, dimension2)).with(d(viewGroup, dimension, dimension2));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f7714n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new u(this, qVar, i13));
        animatorSet3.play(ofFloat).with(d(findViewById, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, dimension2)).with(d(viewGroup, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, dimension2));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f7715o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new t(this, i13));
        animatorSet4.play(ofFloat2).with(d(findViewById, dimension, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)).with(d(viewGroup, dimension, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f7716p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new t(this, i10));
        animatorSet5.play(ofFloat2).with(d(findViewById, dimension2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)).with(d(viewGroup, dimension2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        this.f7717q = ofFloat3;
        ofFloat3.setDuration(250L);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: k4.s

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f7696b;

            {
                this.f7696b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i12) {
                    case 0:
                        v vVar = this.f7696b;
                        vVar.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = vVar.f7703b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = vVar.f7704c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = vVar.f7706e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                            return;
                        }
                        return;
                    case 1:
                        v vVar2 = this.f7696b;
                        vVar2.getClass();
                        vVar2.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    case 2:
                        v vVar3 = this.f7696b;
                        vVar3.getClass();
                        vVar3.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        v vVar4 = this.f7696b;
                        vVar4.getClass();
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = vVar4.f7703b;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup4 = vVar4.f7704c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = vVar4.f7706e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                            return;
                        }
                        return;
                }
            }
        });
        ofFloat3.addListener(new t(this, 4));
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f7718r = ofFloat4;
        ofFloat4.setDuration(250L);
        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: k4.s

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f7696b;

            {
                this.f7696b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i13) {
                    case 0:
                        v vVar = this.f7696b;
                        vVar.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = vVar.f7703b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = vVar.f7704c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = vVar.f7706e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                            return;
                        }
                        return;
                    case 1:
                        v vVar2 = this.f7696b;
                        vVar2.getClass();
                        vVar2.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    case 2:
                        v vVar3 = this.f7696b;
                        vVar3.getClass();
                        vVar3.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        v vVar4 = this.f7696b;
                        vVar4.getClass();
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = vVar4.f7703b;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup4 = vVar4.f7704c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = vVar4.f7706e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                            return;
                        }
                        return;
                }
            }
        });
        ofFloat4.addListener(new t(this, 5));
    }

    public static int c(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + width;
        }
        return width;
    }

    public static ObjectAnimator d(View view, float f3, float f10) {
        return ObjectAnimator.ofFloat(view, "translationY", f3, f10);
    }

    public static boolean j(View view) {
        int id2 = view.getId();
        if (id2 != R.id.exo_bottom_bar && id2 != R.id.exo_prev && id2 != R.id.exo_next && id2 != R.id.exo_rew && id2 != R.id.exo_rew_with_amount && id2 != R.id.exo_ffwd && id2 != R.id.exo_ffwd_with_amount) {
            return false;
        }
        return true;
    }

    public final void a(float f3) {
        ViewGroup viewGroup = this.f7709h;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) ((1.0f - f3) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.f7710i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f3);
        }
        ViewGroup viewGroup3 = this.f7707f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f3);
        }
    }

    public final boolean b(View view) {
        if (view != null && this.f7724y.contains(view)) {
            return true;
        }
        return false;
    }

    public final void e(Runnable runnable, long j) {
        if (j >= 0) {
            this.f7702a.postDelayed(runnable, j);
        }
    }

    public final void f() {
        r rVar = this.f7722w;
        q qVar = this.f7702a;
        qVar.removeCallbacks(rVar);
        qVar.removeCallbacks(this.f7719t);
        qVar.removeCallbacks(this.f7721v);
        qVar.removeCallbacks(this.f7720u);
    }

    public final void g() {
        if (this.f7725z != 3) {
            f();
            int showTimeoutMs = this.f7702a.getShowTimeoutMs();
            if (showTimeoutMs > 0) {
                if (!this.C) {
                    e(this.f7722w, showTimeoutMs);
                } else if (this.f7725z == 1) {
                    e(this.f7720u, 2000L);
                } else {
                    e(this.f7721v, showTimeoutMs);
                }
            }
        }
    }

    public final void h(View view, boolean z10) {
        if (view == null) {
            return;
        }
        ArrayList arrayList = this.f7724y;
        if (!z10) {
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

    public final void i(int i6) {
        int i10 = this.f7725z;
        this.f7725z = i6;
        q qVar = this.f7702a;
        if (i6 == 2) {
            qVar.setVisibility(8);
        } else if (i10 == 2) {
            qVar.setVisibility(0);
        }
        if (i10 != i6) {
            Iterator it = qVar.G.iterator();
            while (it.hasNext()) {
                p pVar = (p) it.next();
                qVar.getVisibility();
                ((w) pVar).f7728z.m();
            }
        }
    }

    public final void k() {
        if (!this.C) {
            i(0);
            g();
            return;
        }
        int i6 = this.f7725z;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 == 4) {
                        return;
                    }
                } else {
                    this.B = true;
                }
            } else {
                this.f7716p.start();
            }
        } else {
            this.f7715o.start();
        }
        g();
    }
}
