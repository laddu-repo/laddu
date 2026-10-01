package m5;

import android.animation.Animator;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f8608a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f8609b;

    public c(e eVar, d dVar) {
        this.f8609b = eVar;
        this.f8608a = dVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        e eVar = this.f8609b;
        d dVar = this.f8608a;
        eVar.a(1.0f, dVar, true);
        dVar.f8619k = dVar.f8614e;
        dVar.f8620l = dVar.f8615f;
        dVar.f8621m = dVar.f8616g;
        dVar.a((dVar.j + 1) % dVar.f8618i.length);
        if (eVar.C) {
            eVar.C = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            if (dVar.f8622n) {
                dVar.f8622n = false;
                return;
            }
            return;
        }
        eVar.B += 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f8609b.B = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }
}
