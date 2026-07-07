package t1;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f12019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f12021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f12022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12023e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f12024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f12025h;
    public final int i;

    static {
        d0.d.p(0, 1, 2, 3, 4);
        w1.b0.H(5);
        w1.b0.H(6);
    }

    public m0(Object obj, int i, z zVar, Object obj2, int i10, long j8, long j9, int i11, int i12) {
        this.f12019a = obj;
        this.f12020b = i;
        this.f12021c = zVar;
        this.f12022d = obj2;
        this.f12023e = i10;
        this.f = j8;
        this.f12024g = j9;
        this.f12025h = i11;
        this.i = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m0.class == obj.getClass()) {
            m0 m0Var = (m0) obj;
            if (this.f12020b == m0Var.f12020b && this.f12023e == m0Var.f12023e && this.f == m0Var.f && this.f12024g == m0Var.f12024g && this.f12025h == m0Var.f12025h && this.i == m0Var.i && Objects.equals(this.f12021c, m0Var.f12021c) && Objects.equals(this.f12019a, m0Var.f12019a) && Objects.equals(this.f12022d, m0Var.f12022d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12019a, Integer.valueOf(this.f12020b), this.f12021c, this.f12022d, Integer.valueOf(this.f12023e), Long.valueOf(this.f), Long.valueOf(this.f12024g), Integer.valueOf(this.f12025h), Integer.valueOf(this.i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.f12020b + ", period=" + this.f12023e + ", pos=" + this.f;
        int i = this.f12025h;
        if (i == -1) {
            return str;
        }
        return str + ", contentPos=" + this.f12024g + ", adGroup=" + i + ", ad=" + this.i;
    }
}
