package j1;

import a2.e1;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a1 f6900a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f6901b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f6902c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f6903d;

    public e(a1 a1Var, ViewGroup viewGroup, View view, f fVar) {
        this.f6900a = a1Var;
        this.f6901b = viewGroup;
        this.f6902c = view;
        this.f6903d = fVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        kotlin.jvm.internal.k.e(animation, "animation");
        ViewGroup viewGroup = this.f6901b;
        viewGroup.post(new e1(viewGroup, this.f6902c, this.f6903d, 11));
        if (p0.L(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f6900a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        kotlin.jvm.internal.k.e(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        kotlin.jvm.internal.k.e(animation, "animation");
        if (p0.L(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f6900a + " has reached onAnimationStart.");
        }
    }
}
