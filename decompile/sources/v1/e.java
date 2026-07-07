package v1;

import r1.g0;
import r1.i0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f13193a;

    /* renamed from: b, reason: collision with root package name */
    public final float f13194b;

    public e(float f3, float f10) {
        boolean z10;
        if (f3 >= -90.0f && f3 <= 90.0f && f10 >= -180.0f && f10 <= 180.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.a("Invalid latitude or longitude", z10);
        this.f13193a = f3;
        this.f13194b = f10;
    }

    @Override // r1.i0
    public final /* synthetic */ r1.q a() {
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
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f13193a == eVar.f13193a && this.f13194b == eVar.f13194b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.f13194b).hashCode() + ((Float.valueOf(this.f13193a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f13193a + ", longitude=" + this.f13194b;
    }

    @Override // r1.i0
    public final /* synthetic */ void b(g0 g0Var) {
    }
}
