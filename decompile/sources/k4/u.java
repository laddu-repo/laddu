package k4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7699a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f7700b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f7701c;

    public /* synthetic */ u(v vVar, q qVar, int i6) {
        this.f7699a = i6;
        this.f7701c = vVar;
        this.f7700b = qVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f7699a) {
            case 0:
                v vVar = this.f7701c;
                vVar.i(1);
                if (vVar.B) {
                    this.f7700b.post(vVar.s);
                    vVar.B = false;
                    return;
                }
                return;
            case 1:
                v vVar2 = this.f7701c;
                vVar2.i(2);
                if (vVar2.B) {
                    this.f7700b.post(vVar2.s);
                    vVar2.B = false;
                    return;
                }
                return;
            default:
                v vVar3 = this.f7701c;
                vVar3.i(2);
                if (vVar3.B) {
                    this.f7700b.post(vVar3.s);
                    vVar3.B = false;
                    return;
                }
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f7699a) {
            case 0:
                this.f7701c.i(3);
                return;
            case 1:
                this.f7701c.i(3);
                return;
            default:
                this.f7701c.i(3);
                return;
        }
    }
}
