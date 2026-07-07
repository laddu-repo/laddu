package e5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.media3.decoder.DecoderInputBuffer;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4814b;

    public /* synthetic */ l(int i, Object obj) {
        this.f4813a = i;
        this.f4814b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f4813a) {
            case 3:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f4814b;
                actionBarOverlayLayout.R = null;
                actionBarOverlayLayout.E = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4813a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                ((p) this.f4814b).m();
                animator.removeListener(this);
                break;
            case 1:
                f5.f fVar = (f5.f) this.f4814b;
                ArrayList arrayList = new ArrayList(fVar.f5236z);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((z8.a) arrayList.get(i)).f14827b.J;
                    if (colorStateList != null) {
                        fVar.setTintList(colorStateList);
                    }
                }
                break;
            case 2:
                g9.g gVar = (g9.g) this.f4814b;
                gVar.f5781r = 0;
                gVar.f5776m = null;
                break;
            case 3:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f4814b;
                actionBarOverlayLayout.R = null;
                actionBarOverlayLayout.E = false;
                break;
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                ((HideBottomViewOnScrollBehavior) this.f4814b).f3326k = null;
                break;
            case g1.g.STRING_FIELD_NUMBER /* 5 */:
                ((HideViewOnScrollBehavior) this.f4814b).f3338k = null;
                break;
            case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                t9.k kVar = (t9.k) this.f4814b;
                kVar.p();
                kVar.f12457r.start();
                break;
            default:
                ((ExpandableTransformationBehavior) this.f4814b).f3589b = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f4813a) {
            case 1:
                f5.f fVar = (f5.f) this.f4814b;
                ArrayList arrayList = new ArrayList(fVar.f5236z);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    z8.c cVar = ((z8.a) arrayList.get(i)).f14827b;
                    ColorStateList colorStateList = cVar.J;
                    if (colorStateList != null) {
                        fVar.setTint(colorStateList.getColorForState(cVar.N, colorStateList.getDefaultColor()));
                    }
                }
                break;
            case 2:
                g9.g gVar = (g9.g) this.f4814b;
                gVar.f5782s.a(0, false);
                gVar.f5781r = 2;
                gVar.f5776m = animator;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
