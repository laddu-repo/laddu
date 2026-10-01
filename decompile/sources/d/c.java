package d;

import android.os.Build;
import android.window.BackEvent;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float f3417a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3418b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3419c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3420d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3421e;

    public c(BackEvent backEvent) {
        long j;
        float l10 = a.l(backEvent);
        float m9 = a.m(backEvent);
        float h4 = a.h(backEvent);
        int k8 = a.k(backEvent);
        if (Build.VERSION.SDK_INT >= 36) {
            j = b.b(backEvent);
        } else {
            j = 0;
        }
        this.f3417a = l10;
        this.f3418b = m9;
        this.f3419c = h4;
        this.f3420d = k8;
        this.f3421e = j;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f3417a + ", touchY=" + this.f3418b + ", progress=" + this.f3419c + ", swipeEdge=" + this.f3420d + ", frameTimeMillis=" + this.f3421e + '}';
    }
}
