package k4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.ui.DefaultTimeBar;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7697a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f7698b;

    public /* synthetic */ t(v vVar, int i6) {
        this.f7697a = i6;
        this.f7698b = vVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f7697a) {
            case 0:
                v vVar = this.f7698b;
                View view = vVar.f7703b;
                if (view != null) {
                    view.setVisibility(4);
                }
                ViewGroup viewGroup = vVar.f7704c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(4);
                }
                ViewGroup viewGroup2 = vVar.f7706e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(4);
                    return;
                }
                return;
            case 1:
            default:
                super.onAnimationEnd(animator);
                return;
            case 2:
                this.f7698b.i(0);
                return;
            case 3:
                this.f7698b.i(0);
                return;
            case 4:
                ViewGroup viewGroup3 = this.f7698b.f7707f;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(4);
                    return;
                }
                return;
            case 5:
                ViewGroup viewGroup4 = this.f7698b.f7709h;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i6 = this.f7697a;
        int i10 = 4;
        v vVar = this.f7698b;
        switch (i6) {
            case 0:
                View view = vVar.j;
                if ((view instanceof DefaultTimeBar) && !vVar.A) {
                    DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
                    ValueAnimator valueAnimator = defaultTimeBar.f1078e0;
                    if (valueAnimator.isStarted()) {
                        valueAnimator.cancel();
                    }
                    valueAnimator.setFloatValues(defaultTimeBar.f1079f0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    valueAnimator.setDuration(250L);
                    valueAnimator.start();
                    return;
                }
                return;
            case 1:
                View view2 = vVar.f7703b;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                ViewGroup viewGroup = vVar.f7704c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                ViewGroup viewGroup2 = vVar.f7706e;
                if (viewGroup2 != null) {
                    if (vVar.A) {
                        i10 = 0;
                    }
                    viewGroup2.setVisibility(i10);
                }
                View view3 = vVar.j;
                if ((view3 instanceof DefaultTimeBar) && !vVar.A) {
                    DefaultTimeBar defaultTimeBar2 = (DefaultTimeBar) view3;
                    ValueAnimator valueAnimator2 = defaultTimeBar2.f1078e0;
                    if (valueAnimator2.isStarted()) {
                        valueAnimator2.cancel();
                    }
                    defaultTimeBar2.f1080g0 = false;
                    valueAnimator2.setFloatValues(defaultTimeBar2.f1079f0, 1.0f);
                    valueAnimator2.setDuration(250L);
                    valueAnimator2.start();
                    return;
                }
                return;
            case 2:
                vVar.i(4);
                return;
            case 3:
                vVar.i(4);
                return;
            case 4:
                ViewGroup viewGroup3 = vVar.f7709h;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(0);
                    vVar.f7709h.setTranslationX(r9.getWidth());
                    ViewGroup viewGroup4 = vVar.f7709h;
                    viewGroup4.scrollTo(viewGroup4.getWidth(), 0);
                    return;
                }
                return;
            default:
                ViewGroup viewGroup5 = vVar.f7707f;
                if (viewGroup5 != null) {
                    viewGroup5.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
