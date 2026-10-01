package o5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.playfy.tv.R;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter implements o {

    /* renamed from: a, reason: collision with root package name */
    public final View f9957a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9958b = false;

    public g(View view) {
        this.f9957a = view;
    }

    @Override // o5.o
    public final void c() {
        float f3;
        View view = this.f9957a;
        if (view.getVisibility() == 0) {
            f3 = b0.f9938a.j(view);
        } else {
            f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(f3));
    }

    @Override // o5.o
    public final void d(r rVar) {
        throw null;
    }

    @Override // o5.o
    public final void f() {
        this.f9957a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // o5.o
    public final void g(r rVar) {
        throw null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        b0.f9938a.m(this.f9957a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f9957a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f9958b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z10) {
        boolean z11 = this.f9958b;
        View view = this.f9957a;
        if (z11) {
            view.setLayerType(0, null);
        }
        if (z10) {
            return;
        }
        e0 e0Var = b0.f9938a;
        e0Var.m(view, 1.0f);
        e0Var.getClass();
    }

    @Override // o5.o
    public final void a(r rVar) {
    }

    @Override // o5.o
    public final void b(r rVar) {
    }

    @Override // o5.o
    public final void e(r rVar) {
    }
}
