package t1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12109a;

    static {
        new s(new r());
        w1.b0.H(0);
        w1.b0.H(1);
        w1.b0.H(2);
        w1.b0.H(3);
        w1.b0.H(4);
        w1.b0.H(5);
        w1.b0.H(6);
        w1.b0.H(7);
    }

    public s(r rVar) {
        int i = w1.b0.f13686a;
        this.f12109a = rVar.f12092a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && this.f12109a == ((s) obj).f12109a;
    }

    public final int hashCode() {
        long j8 = this.f12109a;
        return ((((int) 0) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 923521;
    }
}
