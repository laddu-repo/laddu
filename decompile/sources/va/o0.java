package va;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f13465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f13466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d2 f13467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e2 f13468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f2 f13469e;
    public i2 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte f13470g;

    public final p0 a() {
        String str;
        d2 d2Var;
        e2 e2Var;
        if (this.f13470g == 1 && (str = this.f13466b) != null && (d2Var = this.f13467c) != null && (e2Var = this.f13468d) != null) {
            return new p0(this.f13465a, str, d2Var, e2Var, this.f13469e, this.f);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((1 & this.f13470g) == 0) {
            sb2.append(" timestamp");
        }
        if (this.f13466b == null) {
            sb2.append(" type");
        }
        if (this.f13467c == null) {
            sb2.append(" app");
        }
        if (this.f13468d == null) {
            sb2.append(" device");
        }
        throw new IllegalStateException(d0.d.m("Missing required properties:", sb2));
    }
}
