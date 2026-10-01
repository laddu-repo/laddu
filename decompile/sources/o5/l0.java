package o5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.playfy.tv.R;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l0 extends AnimatorListenerAdapter implements o {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f9975a;

    /* renamed from: b, reason: collision with root package name */
    public final View f9976b;

    /* renamed from: c, reason: collision with root package name */
    public final View f9977c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9978d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f9979e;

    public l0(h hVar, ViewGroup viewGroup, View view, View view2) {
        this.f9979e = hVar;
        this.f9975a = viewGroup;
        this.f9976b = view;
        this.f9977c = view2;
    }

    @Override // o5.o
    public final void a(r rVar) {
        if (this.f9978d) {
            h();
        }
    }

    @Override // o5.o
    public final void b(r rVar) {
        rVar.y(this);
    }

    @Override // o5.o
    public final void d(r rVar) {
        throw null;
    }

    @Override // o5.o
    public final void g(r rVar) {
        rVar.y(this);
    }

    public final void h() {
        this.f9977c.setTag(R.id.save_overlay_view, null);
        this.f9975a.getOverlay().remove(this.f9976b);
        this.f9978d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f9975a.getOverlay().remove(this.f9976b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f9976b;
        if (view.getParent() == null) {
            this.f9975a.getOverlay().add(view);
        } else {
            this.f9979e.cancel();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z10) {
        if (z10) {
            View view = this.f9977c;
            View view2 = this.f9976b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f9975a.getOverlay().add(view2);
            this.f9978d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z10) {
        if (z10) {
            return;
        }
        h();
    }

    @Override // o5.o
    public final void c() {
    }

    @Override // o5.o
    public final void f() {
    }

    @Override // o5.o
    public final void e(r rVar) {
    }
}
