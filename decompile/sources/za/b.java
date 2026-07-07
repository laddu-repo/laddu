package za;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15234a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f15235b;

    public /* synthetic */ b(c cVar, int i6) {
        this.f15234a = i6;
        this.f15235b = cVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f15234a) {
            case 1:
                this.f15235b.f15269b.h(false);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f15234a) {
            case 0:
                this.f15235b.f15269b.h(true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
