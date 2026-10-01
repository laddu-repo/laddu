package w4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13877a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i1 f13878b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f13879c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f13880d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f13881e;

    public h(m mVar, i1 i1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f13881e = mVar;
        this.f13878b = i1Var;
        this.f13880d = viewPropertyAnimator;
        this.f13879c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f13877a) {
            case 1:
                this.f13879c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f13877a) {
            case 0:
                this.f13880d.setListener(null);
                this.f13879c.setAlpha(1.0f);
                m mVar = this.f13881e;
                i1 i1Var = this.f13878b;
                mVar.c(i1Var);
                mVar.f13950q.remove(i1Var);
                mVar.i();
                return;
            default:
                this.f13880d.setListener(null);
                m mVar2 = this.f13881e;
                i1 i1Var2 = this.f13878b;
                mVar2.c(i1Var2);
                mVar2.f13948o.remove(i1Var2);
                mVar2.i();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f13877a) {
            case 0:
                this.f13881e.getClass();
                return;
            default:
                this.f13881e.getClass();
                return;
        }
    }

    public h(m mVar, i1 i1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f13881e = mVar;
        this.f13878b = i1Var;
        this.f13879c = view;
        this.f13880d = viewPropertyAnimator;
    }
}
