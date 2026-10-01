package x1;

import t1.b0;
import t1.d0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f14094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f14095b;

    public e(float f, float f4) {
        w1.a.c("Invalid latitude or longitude", f >= -90.0f && f <= 90.0f && f4 >= -180.0f && f4 <= 180.0f);
        this.f14094a = f;
        this.f14095b = f4;
    }

    @Override // t1.d0
    public final /* synthetic */ t1.o a() {
        return null;
    }

    @Override // t1.d0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f14094a == eVar.f14094a && this.f14095b == eVar.f14095b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f14095b) + ((Float.floatToIntBits(this.f14094a) + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f14094a + ", longitude=" + this.f14095b;
    }

    @Override // t1.d0
    public final /* synthetic */ void b(b0 b0Var) {
    }
}
