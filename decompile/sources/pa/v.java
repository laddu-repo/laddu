package pa;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class v extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10729a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f10730b;

    public /* synthetic */ v(w wVar, int i6) {
        this.f10729a = i6;
        this.f10730b = wVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f10729a) {
            case 1:
                super.onAnimationEnd(animator);
                w wVar = this.f10730b;
                wVar.c();
                c cVar = wVar.j;
                if (cVar != null) {
                    cVar.a((s) wVar.f6268a);
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
        switch (this.f10729a) {
            case 0:
                super.onAnimationRepeat(animator);
                w wVar = this.f10730b;
                wVar.f10738g = (wVar.f10738g + 1) % wVar.f10737f.f10637e.length;
                wVar.f10739h = true;
                return;
            default:
                super.onAnimationRepeat(animator);
                return;
        }
    }
}
