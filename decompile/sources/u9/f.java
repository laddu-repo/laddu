package u9;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public long f12962a;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f12964c = null;

    /* renamed from: d, reason: collision with root package name */
    public int f12965d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f12966e = 1;

    /* renamed from: b, reason: collision with root package name */
    public long f12963b = 150;

    public f(long j) {
        this.f12962a = j;
    }

    public final void a(ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay(this.f12962a);
        objectAnimator.setDuration(this.f12963b);
        objectAnimator.setInterpolator(b());
        objectAnimator.setRepeatCount(this.f12965d);
        objectAnimator.setRepeatMode(this.f12966e);
    }

    public final TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.f12964c;
        if (timeInterpolator != null) {
            return timeInterpolator;
        }
        return a.f12954b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f12962a != fVar.f12962a || this.f12963b != fVar.f12963b || this.f12965d != fVar.f12965d || this.f12966e != fVar.f12966e) {
            return false;
        }
        return b().getClass().equals(fVar.b().getClass());
    }

    public final int hashCode() {
        long j = this.f12962a;
        long j10 = this.f12963b;
        return ((((b().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31) + this.f12965d) * 31) + this.f12966e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n");
        sb2.append(f.class.getName());
        sb2.append('{');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" delay: ");
        sb2.append(this.f12962a);
        sb2.append(" duration: ");
        sb2.append(this.f12963b);
        sb2.append(" interpolator: ");
        sb2.append(b().getClass());
        sb2.append(" repeatCount: ");
        sb2.append(this.f12965d);
        sb2.append(" repeatMode: ");
        return r4.a.l(sb2, this.f12966e, "}\n");
    }
}
