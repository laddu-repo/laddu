package t0;

import android.graphics.Insets;
import android.view.WindowInsets;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s1 extends r1 {
    public static final w1 s;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        s = w1.h(null, windowInsets);
    }

    public s1(w1 w1Var, WindowInsets windowInsets) {
        super(w1Var, windowInsets);
    }

    @Override // t0.q1, t0.m1, t0.t1
    public l0.c f(int i6) {
        Insets insets;
        insets = this.f12378c.getInsets(v1.a(i6));
        return l0.c.c(insets);
    }
}
