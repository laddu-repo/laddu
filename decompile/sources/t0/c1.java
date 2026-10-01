package t0;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f12331a;

    /* renamed from: b, reason: collision with root package name */
    public float f12332b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f12333c;

    /* renamed from: d, reason: collision with root package name */
    public final long f12334d;

    public c1(int i6, Interpolator interpolator, long j) {
        this.f12331a = i6;
        this.f12333c = interpolator;
        this.f12334d = j;
    }

    public long a() {
        return this.f12334d;
    }

    public float b() {
        Interpolator interpolator = this.f12333c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f12332b);
        }
        return this.f12332b;
    }

    public int c() {
        return this.f12331a;
    }

    public void d(float f3) {
        this.f12332b = f3;
    }
}
