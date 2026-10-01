package bb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f1653a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1654b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1655c;

    public c(boolean z10, View view, View view2) {
        this.f1653a = z10;
        this.f1654b = view;
        this.f1655c = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f1653a) {
            this.f1654b.setVisibility(4);
            View view = this.f1655c;
            view.setAlpha(1.0f);
            view.setVisibility(0);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.f1653a) {
            this.f1654b.setVisibility(0);
            View view = this.f1655c;
            view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setVisibility(4);
        }
    }
}
