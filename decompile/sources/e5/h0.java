package e5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends AnimatorListenerAdapter implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f4805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f4806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f4807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4808d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f4809e;

    public h0(h hVar, ViewGroup viewGroup, View view, View view2) {
        this.f4809e = hVar;
        this.f4805a = viewGroup;
        this.f4806b = view;
        this.f4807c = view2;
    }

    @Override // e5.n
    public final void b(p pVar) {
        if (this.f4808d) {
            h();
        }
    }

    @Override // e5.n
    public final void d(p pVar) {
        pVar.x(this);
    }

    @Override // e5.n
    public final void f(p pVar) {
        throw null;
    }

    @Override // e5.n
    public final void g(p pVar) {
        pVar.x(this);
    }

    public final void h() {
        this.f4807c.setTag(j.save_overlay_view, null);
        this.f4805a.getOverlay().remove(this.f4806b);
        this.f4808d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f4805a.getOverlay().remove(this.f4806b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f4806b;
        if (view.getParent() == null) {
            this.f4805a.getOverlay().add(view);
        } else {
            this.f4809e.c();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z2) {
        if (z2) {
            View view = this.f4807c;
            int i = j.save_overlay_view;
            View view2 = this.f4806b;
            view.setTag(i, view2);
            this.f4805a.getOverlay().add(view2);
            this.f4808d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        if (z2) {
            return;
        }
        h();
    }

    @Override // e5.n
    public final void c() {
    }

    @Override // e5.n
    public final void e() {
    }

    @Override // e5.n
    public final void a(p pVar) {
    }
}
