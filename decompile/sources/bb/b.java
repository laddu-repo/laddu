package bb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import java.util.ArrayList;
import ka.h;
import kotlin.jvm.internal.k;
import o5.r;
import p5.e;
import pa.u;
import za.i;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1651a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1652b;

    public /* synthetic */ b(Object obj, int i6) {
        this.f1651a = i6;
        this.f1652b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f1651a) {
            case 4:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1652b;
                actionBarOverlayLayout.T = null;
                actionBarOverlayLayout.G = false;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator a10) {
        switch (this.f1651a) {
            case 0:
                ((ExpandableTransformationBehavior) this.f1652b).f2820b = null;
                return;
            case 1:
                k.e(a10, "a");
                ((ve.a) this.f1652b).invoke();
                return;
            case 2:
                h hVar = (h) this.f1652b;
                hVar.f7798r = 0;
                hVar.f7793m = null;
                return;
            case 3:
                ((r) this.f1652b).l();
                a10.removeListener(this);
                return;
            case 4:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1652b;
                actionBarOverlayLayout.T = null;
                actionBarOverlayLayout.G = false;
                return;
            case 5:
                e eVar = (e) this.f1652b;
                ArrayList arrayList = new ArrayList(eVar.B);
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    ((pa.c) arrayList.get(i6)).a(eVar);
                }
                return;
            case 6:
            default:
                super.onAnimationEnd(a10);
                return;
            case 7:
                ((HideBottomViewOnScrollBehavior) this.f1652b).f2589k = null;
                return;
            case 8:
                ((HideViewOnScrollBehavior) this.f1652b).f2599k = null;
                return;
            case 9:
                i iVar = (i) this.f1652b;
                iVar.p();
                iVar.f15262r.start();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.f1651a) {
            case 6:
                super.onAnimationRepeat(animator);
                u uVar = (u) this.f1652b;
                uVar.f10726f = (uVar.f10726f + 1) % uVar.f10725e.f10637e.length;
                uVar.f10727g = true;
                return;
            default:
                super.onAnimationRepeat(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f1651a) {
            case 2:
                h hVar = (h) this.f1652b;
                hVar.s.a(0, false);
                hVar.f7798r = 2;
                hVar.f7793m = animator;
                return;
            case 5:
                e eVar = (e) this.f1652b;
                ArrayList arrayList = new ArrayList(eVar.B);
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    ((pa.c) arrayList.get(i6)).b(eVar);
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
