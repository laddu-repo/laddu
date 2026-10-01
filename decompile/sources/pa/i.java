package pa;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10671a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f10672b;

    public /* synthetic */ i(j jVar, int i6) {
        this.f10671a = i6;
        this.f10672b = jVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f10671a) {
            case 1:
                super.onAnimationEnd(animator);
                j jVar = this.f10672b;
                jVar.c();
                c cVar = jVar.j;
                if (cVar != null) {
                    cVar.a((s) jVar.f6268a);
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
        switch (this.f10671a) {
            case 0:
                super.onAnimationRepeat(animator);
                j jVar = this.f10672b;
                jVar.f10682g = (jVar.f10682g + j.f10674l.length) % jVar.f10681f.f10637e.length;
                return;
            default:
                super.onAnimationRepeat(animator);
                return;
        }
    }
}
