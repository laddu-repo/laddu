package pa;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10692a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f10693b;

    public /* synthetic */ n(o oVar, int i6) {
        this.f10692a = i6;
        this.f10693b = oVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f10692a) {
            case 1:
                super.onAnimationEnd(animator);
                o oVar = this.f10693b;
                o.a(oVar);
                ArrayList arrayList = oVar.D;
                if (arrayList != null && !oVar.E) {
                    int size = arrayList.size();
                    int i6 = 0;
                    while (i6 < size) {
                        Object obj = arrayList.get(i6);
                        i6++;
                        ((c) obj).a(oVar);
                    }
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f10692a) {
            case 0:
                super.onAnimationStart(animator);
                o oVar = this.f10693b;
                ArrayList arrayList = oVar.D;
                if (arrayList != null && !oVar.E) {
                    int size = arrayList.size();
                    int i6 = 0;
                    while (i6 < size) {
                        Object obj = arrayList.get(i6);
                        i6++;
                        ((c) obj).b(oVar);
                    }
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
