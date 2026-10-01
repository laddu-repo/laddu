package w4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i1 f13886a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13887b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f13888c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13889d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f13890e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m f13891f;

    public i(m mVar, i1 i1Var, int i6, View view, int i10, ViewPropertyAnimator viewPropertyAnimator) {
        this.f13891f = mVar;
        this.f13886a = i1Var;
        this.f13887b = i6;
        this.f13888c = view;
        this.f13889d = i10;
        this.f13890e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i6 = this.f13887b;
        View view = this.f13888c;
        if (i6 != 0) {
            view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (this.f13889d != 0) {
            view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f13890e.setListener(null);
        m mVar = this.f13891f;
        i1 i1Var = this.f13886a;
        mVar.c(i1Var);
        mVar.f13949p.remove(i1Var);
        mVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f13891f.getClass();
    }
}
