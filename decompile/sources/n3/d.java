package n3;

import r1.g0;
import r1.i0;
import r1.q;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f9036a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9037b;

    public d(int i6, float f3) {
        this.f9036a = f3;
        this.f9037b = i6;
    }

    @Override // r1.i0
    public final /* synthetic */ q a() {
        return null;
    }

    @Override // r1.i0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f9036a == dVar.f9036a && this.f9037b == dVar.f9037b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f9036a).hashCode() + 527) * 31) + this.f9037b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f9036a + ", svcTemporalLayerCount=" + this.f9037b;
    }

    @Override // r1.i0
    public final /* synthetic */ void b(g0 g0Var) {
    }
}
