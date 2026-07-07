package ya;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f15027a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f15028b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f15029c;

    public e(f fVar, View view, View view2) {
        this.f15029c = fVar;
        this.f15027a = view;
        this.f15028b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f15029c.c(this.f15027a, this.f15028b, valueAnimator.getAnimatedFraction());
    }
}
