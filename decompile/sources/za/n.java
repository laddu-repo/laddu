package za;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import p.b1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15272a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f15273b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15274c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f15275d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f15276e;

    public n(p pVar, int i6, TextView textView, int i10, TextView textView2) {
        this.f15276e = pVar;
        this.f15272a = i6;
        this.f15273b = textView;
        this.f15274c = i10;
        this.f15275d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        b1 b1Var;
        int i6 = this.f15272a;
        p pVar = this.f15276e;
        pVar.f15290n = i6;
        pVar.f15288l = null;
        TextView textView = this.f15273b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f15274c == 1 && (b1Var = pVar.f15294r) != null) {
                b1Var.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f15275d;
        if (textView2 != null) {
            textView2.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f15275d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }
}
