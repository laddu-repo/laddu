package androidx.lifecycle;

import android.os.Handler;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class v0 implements f0 {
    public static final v0 F = new v0();
    public Handler B;

    /* renamed from: x, reason: collision with root package name */
    public int f988x;

    /* renamed from: y, reason: collision with root package name */
    public int f989y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f990z = true;
    public boolean A = true;
    public final h0 C = new h0(this);
    public final a2.a D = new a2.a(this, 5);
    public final o1 E = new o1(this);

    public final void a() {
        int i6 = this.f989y + 1;
        this.f989y = i6;
        if (i6 == 1) {
            if (this.f990z) {
                this.C.f(w.ON_RESUME);
                this.f990z = false;
            } else {
                Handler handler = this.B;
                kotlin.jvm.internal.k.b(handler);
                handler.removeCallbacks(this.D);
            }
        }
    }

    @Override // androidx.lifecycle.f0
    public final y getLifecycle() {
        return this.C;
    }
}
