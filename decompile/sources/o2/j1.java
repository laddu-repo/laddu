package o2;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j1 f9467d = new j1(new t1.t0[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y9.z0 f9469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9470c;

    static {
        w1.b0.H(0);
    }

    public j1(t1.t0... t0VarArr) {
        y9.z0 z0VarN = y9.f0.n(t0VarArr);
        this.f9469b = z0VarN;
        this.f9468a = t0VarArr.length;
        int i = 0;
        while (i < z0VarN.f14639y) {
            int i10 = i + 1;
            for (int i11 = i10; i11 < z0VarN.f14639y; i11++) {
                if (((t1.t0) z0VarN.get(i)).equals(z0VarN.get(i11))) {
                    w1.a.p("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i10;
        }
    }

    public final t1.t0 a(int i) {
        return (t1.t0) this.f9469b.get(i);
    }

    public final int b(t1.t0 t0Var) {
        int iIndexOf = this.f9469b.indexOf(t0Var);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j1.class != obj.getClass()) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return this.f9468a == j1Var.f9468a && this.f9469b.equals(j1Var.f9469b);
    }

    public final int hashCode() {
        if (this.f9470c == 0) {
            this.f9470c = this.f9469b.hashCode();
        }
        return this.f9470c;
    }

    public final String toString() {
        return this.f9469b.toString();
    }
}
