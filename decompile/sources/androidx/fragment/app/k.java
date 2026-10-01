package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.animation.Animation;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c1 f1038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f1039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f1041d;

    public k(c1 c1Var, l lVar, View view, g gVar) {
        this.f1038a = c1Var;
        this.f1039b = lVar;
        this.f1040c = view;
        this.f1041d = gVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        de.i.e(animation, "animation");
        l lVar = this.f1039b;
        lVar.f1044a.post(new androidx.emoji2.text.n(lVar, this.f1040c, this.f1041d, 1));
        if (q0.I(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1038a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        de.i.e(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        de.i.e(animation, "animation");
        if (q0.I(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1038a + " has reached onAnimationStart.");
        }
    }
}
