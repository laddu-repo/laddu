package o5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import t0.d1;
import t0.v0;
import t0.z0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9960a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9961b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9962c;

    public /* synthetic */ j(Object obj, View view, int i6) {
        this.f9960a = i6;
        this.f9961b = obj;
        this.f9962c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f9960a) {
            case 1:
                ((v0) this.f9961b).a();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f9960a) {
            case 0:
                ((v.e) this.f9961b).remove(animator);
                ((r) this.f9962c).K.remove(animator);
                return;
            case 1:
                ((v0) this.f9961b).c();
                return;
            default:
                ((d1) this.f9961b).f12338a.d(1.0f);
                z0.e((View) this.f9962c);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f9960a) {
            case 0:
                ((r) this.f9962c).K.add(animator);
                return;
            case 1:
                ((v0) this.f9961b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public j(r rVar, v.e eVar) {
        this.f9960a = 0;
        this.f9962c = rVar;
        this.f9961b = eVar;
    }
}
