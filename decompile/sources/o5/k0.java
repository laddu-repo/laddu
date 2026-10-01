package o5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.measurement.k4;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k0 extends AnimatorListenerAdapter implements o {

    /* renamed from: a, reason: collision with root package name */
    public final View f9969a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9970b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f9971c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9973e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9974f = false;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9972d = true;

    public k0(View view, int i6) {
        this.f9969a = view;
        this.f9970b = i6;
        this.f9971c = (ViewGroup) view.getParent();
        h(true);
    }

    @Override // o5.o
    public final void b(r rVar) {
        rVar.y(this);
    }

    @Override // o5.o
    public final void c() {
        h(false);
        if (!this.f9974f) {
            b0.b(this.f9969a, this.f9970b);
        }
    }

    @Override // o5.o
    public final void d(r rVar) {
        throw null;
    }

    @Override // o5.o
    public final void f() {
        h(true);
        if (!this.f9974f) {
            b0.b(this.f9969a, 0);
        }
    }

    @Override // o5.o
    public final void g(r rVar) {
        rVar.y(this);
    }

    public final void h(boolean z10) {
        ViewGroup viewGroup;
        if (this.f9972d && this.f9973e != z10 && (viewGroup = this.f9971c) != null) {
            this.f9973e = z10;
            k4.q(viewGroup, z10);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f9974f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f9974f) {
            b0.b(this.f9969a, this.f9970b);
            ViewGroup viewGroup = this.f9971c;
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
    public final void onAnimationStart(Animator animator, boolean z10) {
        if (z10) {
            b0.b(this.f9969a, 0);
            ViewGroup viewGroup = this.f9971c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z10) {
        if (z10) {
            return;
        }
        if (!this.f9974f) {
            b0.b(this.f9969a, this.f9970b);
            ViewGroup viewGroup = this.f9971c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        h(false);
    }

    @Override // o5.o
    public final void a(r rVar) {
    }

    @Override // o5.o
    public final void e(r rVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
