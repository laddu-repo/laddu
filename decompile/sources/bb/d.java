package bb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import ka.h;
import w4.u;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1656a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1657b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1658c;

    public d(View view, boolean z10) {
        this.f1656a = 0;
        this.f1657b = z10;
        this.f1658c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f1656a) {
            case 1:
                this.f1657b = true;
                return;
            case 2:
                this.f1657b = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1656a) {
            case 0:
                if (!this.f1657b) {
                    ((View) this.f1658c).setVisibility(4);
                    return;
                }
                return;
            case 1:
                h hVar = (h) this.f1658c;
                hVar.f7798r = 0;
                hVar.f7793m = null;
                if (!this.f1657b) {
                    hVar.s.a(4, false);
                    return;
                }
                return;
            default:
                u uVar = (u) this.f1658c;
                if (this.f1657b) {
                    this.f1657b = false;
                    return;
                } else if (((Float) uVar.f14047z.getAnimatedValue()).floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    uVar.A = 0;
                    uVar.g(0);
                    return;
                } else {
                    uVar.A = 2;
                    uVar.s.invalidate();
                    return;
                }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f1656a) {
            case 0:
                if (this.f1657b) {
                    ((View) this.f1658c).setVisibility(0);
                    return;
                }
                return;
            case 1:
                h hVar = (h) this.f1658c;
                hVar.s.a(0, false);
                hVar.f7798r = 1;
                hVar.f7793m = animator;
                this.f1657b = false;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public d(h hVar) {
        this.f1656a = 1;
        this.f1658c = hVar;
    }

    public d(u uVar) {
        this.f1656a = 2;
        this.f1658c = uVar;
        this.f1657b = false;
    }
}
