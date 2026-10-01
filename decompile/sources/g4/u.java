package g4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.ui.DefaultTimeBar;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class u extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f5596b;

    public /* synthetic */ u(w wVar, int i) {
        this.f5595a = i;
        this.f5596b = wVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f5595a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                w wVar = this.f5596b;
                View view = wVar.f5603b;
                if (view != null) {
                    view.setVisibility(4);
                }
                ViewGroup viewGroup = wVar.f5604c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(4);
                }
                ViewGroup viewGroup2 = wVar.f5606e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(4);
                }
                break;
            case 1:
            default:
                super.onAnimationEnd(animator);
                break;
            case 2:
                this.f5596b.i(0);
                break;
            case 3:
                this.f5596b.i(0);
                break;
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                ViewGroup viewGroup3 = this.f5596b.f;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(4);
                }
                break;
            case g1.g.STRING_FIELD_NUMBER /* 5 */:
                ViewGroup viewGroup4 = this.f5596b.f5608h;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(4);
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.f5595a;
        w wVar = this.f5596b;
        switch (i) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                View view = wVar.f5609j;
                if ((view instanceof DefaultTimeBar) && !wVar.A) {
                    DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
                    ValueAnimator valueAnimator = defaultTimeBar.f1327c0;
                    if (valueAnimator.isStarted()) {
                        valueAnimator.cancel();
                    }
                    valueAnimator.setFloatValues(defaultTimeBar.f1328d0, 0.0f);
                    valueAnimator.setDuration(250L);
                    valueAnimator.start();
                    break;
                }
                break;
            case 1:
                View view2 = wVar.f5603b;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                ViewGroup viewGroup = wVar.f5604c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                ViewGroup viewGroup2 = wVar.f5606e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(wVar.A ? 0 : 4);
                }
                View view3 = wVar.f5609j;
                if ((view3 instanceof DefaultTimeBar) && !wVar.A) {
                    DefaultTimeBar defaultTimeBar2 = (DefaultTimeBar) view3;
                    ValueAnimator valueAnimator2 = defaultTimeBar2.f1327c0;
                    if (valueAnimator2.isStarted()) {
                        valueAnimator2.cancel();
                    }
                    defaultTimeBar2.f1329e0 = false;
                    valueAnimator2.setFloatValues(defaultTimeBar2.f1328d0, 1.0f);
                    valueAnimator2.setDuration(250L);
                    valueAnimator2.start();
                    break;
                }
                break;
            case 2:
                wVar.i(4);
                break;
            case 3:
                wVar.i(4);
                break;
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                ViewGroup viewGroup3 = wVar.f5608h;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(0);
                    wVar.f5608h.setTranslationX(r9.getWidth());
                    ViewGroup viewGroup4 = wVar.f5608h;
                    viewGroup4.scrollTo(viewGroup4.getWidth(), 0);
                }
                break;
            default:
                ViewGroup viewGroup5 = wVar.f;
                if (viewGroup5 != null) {
                    viewGroup5.setVisibility(0);
                }
                break;
        }
    }
}
