package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f1032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c1 f1035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f1036e;

    public j(l lVar, View view, boolean z2, c1 c1Var, g gVar) {
        this.f1032a = lVar;
        this.f1033b = view;
        this.f1034c = z2;
        this.f1035d = c1Var;
        this.f1036e = gVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        de.i.e(animator, "anim");
        ViewGroup viewGroup = this.f1032a.f1044a;
        View view = this.f1033b;
        viewGroup.endViewTransition(view);
        boolean z2 = this.f1034c;
        c1 c1Var = this.f1035d;
        if (z2) {
            int i = c1Var.f990a;
            de.i.d(view, "viewToAnimate");
            j4.a.a(view, i);
        }
        this.f1036e.d();
        if (q0.I(2)) {
            Log.v("FragmentManager", "Animator from operation " + c1Var + " has ended.");
        }
    }
}
