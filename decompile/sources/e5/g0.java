package e5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends AnimatorListenerAdapter implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f4800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f4802c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4804e;
    public boolean f = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f4803d = true;

    public g0(View view, int i) {
        this.f4800a = view;
        this.f4801b = i;
        this.f4802c = (ViewGroup) view.getParent();
        h(true);
    }

    @Override // e5.n
    public final void c() {
        h(false);
        if (this.f) {
            return;
        }
        z.b(this.f4800a, this.f4801b);
    }

    @Override // e5.n
    public final void d(p pVar) {
        pVar.x(this);
    }

    @Override // e5.n
    public final void e() {
        h(true);
        if (this.f) {
            return;
        }
        z.b(this.f4800a, 0);
    }

    @Override // e5.n
    public final void f(p pVar) {
        throw null;
    }

    @Override // e5.n
    public final void g(p pVar) {
        pVar.x(this);
    }

    public final void h(boolean z2) {
        ViewGroup viewGroup;
        if (!this.f4803d || this.f4804e == z2 || (viewGroup = this.f4802c) == null) {
            return;
        }
        this.f4804e = z2;
        a.a.x(viewGroup, z2);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f) {
            z.b(this.f4800a, this.f4801b);
            ViewGroup viewGroup = this.f4802c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        h(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z2) {
        if (z2) {
            z.b(this.f4800a, 0);
            ViewGroup viewGroup = this.f4802c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        if (z2) {
            return;
        }
        if (!this.f) {
            z.b(this.f4800a, this.f4801b);
            ViewGroup viewGroup = this.f4802c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        h(false);
    }

    @Override // e5.n
    public final void a(p pVar) {
    }

    @Override // e5.n
    public final void b(p pVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
