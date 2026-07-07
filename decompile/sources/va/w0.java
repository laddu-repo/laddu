package va;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f13538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f13539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f13540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f13541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13542e;
    public byte f;

    public final x0 a() {
        String str;
        if (this.f == 7 && (str = this.f13539b) != null) {
            return new x0(this.f13538a, str, this.f13540c, this.f13541d, this.f13542e);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f & 1) == 0) {
            sb2.append(" pc");
        }
        if (this.f13539b == null) {
            sb2.append(" symbol");
        }
        if ((this.f & 2) == 0) {
            sb2.append(" offset");
        }
        if ((this.f & 4) == 0) {
            sb2.append(" importance");
        }
        throw new IllegalStateException(d0.d.m("Missing required properties:", sb2));
    }
}
