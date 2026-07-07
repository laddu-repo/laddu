package l3;

import t1.b0;
import t1.d0;
import t1.o;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8161b;

    public d(int i, float f) {
        this.f8160a = f;
        this.f8161b = i;
    }

    @Override // t1.d0
    public final /* synthetic */ o a() {
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
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f8160a == dVar.f8160a && this.f8161b == dVar.f8161b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.f8160a) + 527) * 31) + this.f8161b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f8160a + ", svcTemporalLayerCount=" + this.f8161b;
    }

    @Override // t1.d0
    public final /* synthetic */ void b(b0 b0Var) {
    }
}
