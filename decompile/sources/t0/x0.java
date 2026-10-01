package t0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d1 f12419a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w1 f12420b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w1 f12421c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12422d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f12423e;

    public x0(d1 d1Var, w1 w1Var, w1 w1Var2, int i6, View view) {
        this.f12419a = d1Var;
        this.f12420b = w1Var;
        this.f12421c = w1Var2;
        this.f12422d = i6;
        this.f12423e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        l1 f1Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        d1 d1Var = this.f12419a;
        c1 c1Var = d1Var.f12338a;
        c1Var.d(animatedFraction);
        w1 w1Var = this.f12420b;
        t1 t1Var = w1Var.f12417a;
        float b10 = c1Var.b();
        PathInterpolator pathInterpolator = z0.f12430e;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 34) {
            f1Var = new k1(w1Var);
        } else if (i6 >= 31) {
            f1Var = new j1(w1Var);
        } else if (i6 >= 30) {
            f1Var = new i1(w1Var);
        } else if (i6 >= 29) {
            f1Var = new g1(w1Var);
        } else {
            f1Var = new f1(w1Var);
        }
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((this.f12422d & i10) == 0) {
                f1Var.c(i10, t1Var.f(i10));
            } else {
                l0.c f3 = t1Var.f(i10);
                l0.c f10 = this.f12421c.f12417a.f(i10);
                float f11 = 1.0f - b10;
                f1Var.c(i10, w1.e(f3, (int) (((f3.f8062a - f10.f8062a) * f11) + 0.5d), (int) (((f3.f8063b - f10.f8063b) * f11) + 0.5d), (int) (((f3.f8064c - f10.f8064c) * f11) + 0.5d), (int) (((f3.f8065d - f10.f8065d) * f11) + 0.5d)));
            }
        }
        z0.g(this.f12423e, f1Var.b(), Collections.singletonList(d1Var));
    }
}
