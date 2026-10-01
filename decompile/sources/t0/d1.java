package t0;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public c1 f12338a;

    public d1(int i6, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f12338a = new b1(a2.o.k(i6, interpolator, j));
        } else {
            this.f12338a = new c1(i6, interpolator, j);
        }
    }
}
