package pa;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10657a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f10658b;

    public /* synthetic */ g(h hVar, int i6) {
        this.f10657a = i6;
        this.f10658b = hVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f10657a) {
            case 1:
                super.onAnimationEnd(animator);
                h hVar = this.f10658b;
                hVar.c();
                c cVar = hVar.j;
                if (cVar != null) {
                    cVar.a((s) hVar.f6268a);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.f10657a) {
            case 0:
                super.onAnimationRepeat(animator);
                h hVar = this.f10658b;
                hVar.f10668g = (hVar.f10668g + 4) % hVar.f10667f.f10637e.length;
                return;
            default:
                super.onAnimationRepeat(animator);
                return;
        }
    }
}
