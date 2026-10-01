package j1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f6912a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f6913b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f6914c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a1 f6915d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f6916e;

    public h(ViewGroup viewGroup, View view, boolean z10, a1 a1Var, i iVar) {
        this.f6912a = viewGroup;
        this.f6913b = view;
        this.f6914c = z10;
        this.f6915d = a1Var;
        this.f6916e = iVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator anim) {
        kotlin.jvm.internal.k.e(anim, "anim");
        ViewGroup viewGroup = this.f6912a;
        View viewToAnimate = this.f6913b;
        viewGroup.endViewTransition(viewToAnimate);
        boolean z10 = this.f6914c;
        a1 a1Var = this.f6915d;
        if (z10 || a1Var.f6874a == 3) {
            int i6 = a1Var.f6874a;
            kotlin.jvm.internal.k.d(viewToAnimate, "viewToAnimate");
            h8.c.d(i6, viewToAnimate, viewGroup);
        }
        i iVar = this.f6916e;
        ((a1) iVar.f6918c.f4301y).c(iVar);
        if (p0.L(2)) {
            Log.v("FragmentManager", "Animator from operation " + a1Var + " has ended.");
        }
    }
}
