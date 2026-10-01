package t1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z0 f12183b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y9.f0 f12184a;

    static {
        y9.c0 c0Var = y9.f0.f14553w;
        f12183b = new z0(y9.z0.f14637z);
        w1.b0.H(0);
    }

    public z0(y9.z0 z0Var) {
        this.f12184a = y9.f0.m(z0Var);
    }

    public final boolean a(int i) {
        int i10 = 0;
        while (true) {
            y9.f0 f0Var = this.f12184a;
            if (i10 >= f0Var.size()) {
                return false;
            }
            y0 y0Var = (y0) f0Var.get(i10);
            boolean[] zArr = y0Var.f12177e;
            int length = zArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                if (!zArr[i11]) {
                    i11++;
                } else if (y0Var.f12174b.f12113c == i) {
                    return true;
                }
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z0.class != obj.getClass()) {
            return false;
        }
        return this.f12184a.equals(((z0) obj).f12184a);
    }

    public final int hashCode() {
        return this.f12184a.hashCode();
    }
}
