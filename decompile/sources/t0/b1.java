package t0;

import android.view.WindowInsetsAnimation;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b1 extends c1 {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f12330e;

    public b1(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f12330e = windowInsetsAnimation;
    }

    @Override // t0.c1
    public final long a() {
        long durationMillis;
        durationMillis = this.f12330e.getDurationMillis();
        return durationMillis;
    }

    @Override // t0.c1
    public final float b() {
        float interpolatedFraction;
        interpolatedFraction = this.f12330e.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // t0.c1
    public final int c() {
        int typeMask;
        typeMask = this.f12330e.getTypeMask();
        return typeMask;
    }

    @Override // t0.c1
    public final void d(float f3) {
        this.f12330e.setFraction(f3);
    }
}
