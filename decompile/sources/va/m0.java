package va;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f13435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f13437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f13438e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13439g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f13440h;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte f13441j;

    public final n0 a() {
        String str;
        String str2;
        String str3;
        if (this.f13441j == 63 && (str = this.f13435b) != null && (str2 = this.f13440h) != null && (str3 = this.i) != null) {
            return new n0(this.f13434a, str, this.f13436c, this.f13437d, this.f13438e, this.f, this.f13439g, str2, str3);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f13441j & 1) == 0) {
            sb2.append(" arch");
        }
        if (this.f13435b == null) {
            sb2.append(" model");
        }
        if ((this.f13441j & 2) == 0) {
            sb2.append(" cores");
        }
        if ((this.f13441j & 4) == 0) {
            sb2.append(" ram");
        }
        if ((this.f13441j & 8) == 0) {
            sb2.append(" diskSpace");
        }
        if ((this.f13441j & 16) == 0) {
            sb2.append(" simulator");
        }
        if ((this.f13441j & 32) == 0) {
            sb2.append(" state");
        }
        if (this.f13440h == null) {
            sb2.append(" manufacturer");
        }
        if (this.i == null) {
            sb2.append(" modelClass");
        }
        throw new IllegalStateException(d0.d.m("Missing required properties:", sb2));
    }
}
