package h4;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f6120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f6121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f6122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6123e;

    public b(int i, float f, float f4, float f10, long j8) {
        this.f6119a = i;
        this.f6120b = f;
        this.f6121c = f4;
        this.f6122d = f10;
        this.f6123e = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            return this.f6121c == bVar.f6121c && this.f6122d == bVar.f6122d && this.f6120b == bVar.f6120b && this.f6119a == bVar.f6119a && this.f6123e == bVar.f6123e;
        }
        return false;
    }

    public final int hashCode() {
        int iFloatToIntBits = (((Float.floatToIntBits(this.f6120b) + ((Float.floatToIntBits(this.f6122d) + (Float.floatToIntBits(this.f6121c) * 31)) * 31)) * 31) + this.f6119a) * 31;
        long j8 = this.f6123e;
        return iFloatToIntBits + ((int) (j8 ^ (j8 >>> 32)));
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.f6121c + ", touchY=" + this.f6122d + ", progress=" + this.f6120b + ", swipeEdge=" + this.f6119a + ", frameTimeMillis=" + this.f6123e + ')';
    }
}
