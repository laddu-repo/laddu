package t9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import o.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class p extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f12470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f12472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f12473e;

    public p(r rVar, int i, TextView textView, int i10, TextView textView2) {
        this.f12473e = rVar;
        this.f12469a = i;
        this.f12470b = textView;
        this.f12471c = i10;
        this.f12472d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        z0 z0Var;
        int i = this.f12469a;
        r rVar = this.f12473e;
        rVar.f12486n = i;
        rVar.f12484l = null;
        TextView textView = this.f12470b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f12471c == 1 && (z0Var = rVar.f12490r) != null) {
                z0Var.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f12472d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f12472d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
