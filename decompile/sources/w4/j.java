package w4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13914a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f13915b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f13916c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f13917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f13918e;

    public /* synthetic */ j(m mVar, k kVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i6) {
        this.f13914a = i6;
        this.f13918e = mVar;
        this.f13915b = kVar;
        this.f13916c = viewPropertyAnimator;
        this.f13917d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f13914a) {
            case 0:
                this.f13916c.setListener(null);
                View view = this.f13917d;
                view.setAlpha(1.0f);
                view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                k kVar = this.f13915b;
                i1 i1Var = kVar.f13923a;
                m mVar = this.f13918e;
                mVar.c(i1Var);
                mVar.f13951r.remove(kVar.f13923a);
                mVar.i();
                return;
            default:
                this.f13916c.setListener(null);
                View view2 = this.f13917d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                view2.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                k kVar2 = this.f13915b;
                i1 i1Var2 = kVar2.f13924b;
                m mVar2 = this.f13918e;
                mVar2.c(i1Var2);
                mVar2.f13951r.remove(kVar2.f13924b);
                mVar2.i();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f13914a) {
            case 0:
                i1 i1Var = this.f13915b.f13923a;
                this.f13918e.getClass();
                return;
            default:
                i1 i1Var2 = this.f13915b.f13924b;
                this.f13918e.getClass();
                return;
        }
    }
}
