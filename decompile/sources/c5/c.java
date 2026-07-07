package c5;

import android.animation.Animator;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f2107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f2108b;

    public c(e eVar, d dVar) {
        this.f2108b = eVar;
        this.f2107a = dVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        e eVar = this.f2108b;
        d dVar = this.f2107a;
        eVar.a(1.0f, dVar, true);
        dVar.f2117k = dVar.f2113e;
        dVar.f2118l = dVar.f;
        dVar.f2119m = dVar.f2114g;
        dVar.a((dVar.f2116j + 1) % dVar.i.length);
        if (!eVar.A) {
            eVar.f2132z += 1.0f;
            return;
        }
        eVar.A = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        if (dVar.f2120n) {
            dVar.f2120n = false;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2108b.f2132z = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }
}
