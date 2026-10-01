package m5;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f8606a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f8607b;

    public b(e eVar, d dVar) {
        this.f8607b = eVar;
        this.f8606a = dVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        d dVar = this.f8606a;
        e.d(floatValue, dVar);
        e eVar = this.f8607b;
        eVar.a(floatValue, dVar, false);
        eVar.invalidateSelf();
    }
}
