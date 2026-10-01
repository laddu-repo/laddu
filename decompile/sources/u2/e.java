package u2;

import java.util.Arrays;
import u1.a0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public int f12835c;

    /* renamed from: d, reason: collision with root package name */
    public int f12836d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12833a = true;

    /* renamed from: b, reason: collision with root package name */
    public final int f12834b = 65536;

    /* renamed from: e, reason: collision with root package name */
    public int f12837e = 0;

    /* renamed from: f, reason: collision with root package name */
    public a[] f12838f = new a[100];

    public final synchronized void a(int i6) {
        boolean z10;
        if (i6 < this.f12835c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12835c = i6;
        if (z10) {
            b();
        }
    }

    public final synchronized void b() {
        int max = Math.max(0, a0.f(this.f12835c, this.f12834b) - this.f12836d);
        int i6 = this.f12837e;
        if (max >= i6) {
            return;
        }
        Arrays.fill(this.f12838f, max, i6, (Object) null);
        this.f12837e = max;
    }
}
