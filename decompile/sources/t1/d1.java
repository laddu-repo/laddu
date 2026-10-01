package t1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d1 f11975d = new d1(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f11978c;

    static {
        w1.b0.H(0);
        w1.b0.H(1);
        w1.b0.H(3);
    }

    public d1(int i, int i10) {
        this(1.0f, i, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d1) {
            d1 d1Var = (d1) obj;
            if (this.f11976a == d1Var.f11976a && this.f11977b == d1Var.f11977b && this.f11978c == d1Var.f11978c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f11978c) + ((((217 + this.f11976a) * 31) + this.f11977b) * 31);
    }

    public d1(float f, int i, int i10) {
        this.f11976a = i;
        this.f11977b = i10;
        this.f11978c = f;
    }
}
