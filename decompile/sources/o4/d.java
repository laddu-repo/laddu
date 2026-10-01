package o4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z0 f9692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f9694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f9696e;
    public final /* synthetic */ h f;

    public d(h hVar, z0 z0Var, int i, View view, int i10, ViewPropertyAnimator viewPropertyAnimator) {
        this.f = hVar;
        this.f9692a = z0Var;
        this.f9693b = i;
        this.f9694c = view;
        this.f9695d = i10;
        this.f9696e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f9693b;
        View view = this.f9694c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f9695d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f9696e.setListener(null);
        h hVar = this.f;
        z0 z0Var = this.f9692a;
        hVar.c(z0Var);
        hVar.f9742p.remove(z0Var);
        hVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f.getClass();
    }
}
