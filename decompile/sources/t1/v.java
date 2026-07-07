package t1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f12126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f12127e;

    static {
        new g2.t().a();
        w1.b0.H(0);
        w1.b0.H(1);
        w1.b0.H(2);
        w1.b0.H(3);
        w1.b0.H(4);
    }

    public v(g2.t tVar) {
        long j8 = tVar.f5476a;
        long j9 = tVar.f5477b;
        long j10 = tVar.f5478c;
        float f = tVar.f5479d;
        float f4 = tVar.f5480e;
        this.f12123a = j8;
        this.f12124b = j9;
        this.f12125c = j10;
        this.f12126d = f;
        this.f12127e = f4;
    }

    public final g2.t a() {
        g2.t tVar = new g2.t();
        tVar.f5476a = this.f12123a;
        tVar.f5477b = this.f12124b;
        tVar.f5478c = this.f12125c;
        tVar.f5479d = this.f12126d;
        tVar.f5480e = this.f12127e;
        return tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f12123a == vVar.f12123a && this.f12124b == vVar.f12124b && this.f12125c == vVar.f12125c && this.f12126d == vVar.f12126d && this.f12127e == vVar.f12127e;
    }

    public final int hashCode() {
        long j8 = this.f12123a;
        long j9 = this.f12124b;
        int i = ((((int) (j8 ^ (j8 >>> 32))) * 31) + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j10 = this.f12125c;
        int i10 = (i + ((int) ((j10 >>> 32) ^ j10))) * 31;
        float f = this.f12126d;
        int iFloatToIntBits = (i10 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f4 = this.f12127e;
        return iFloatToIntBits + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0);
    }
}
