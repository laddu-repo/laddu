package va;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f13249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f13250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f13252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f13253e;
    public String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f13254g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f13255h;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public m2 f13256j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public s1 f13257k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p1 f13258l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte f13259m;

    public final b0 a() {
        if (this.f13259m == 1 && this.f13249a != null && this.f13250b != null && this.f13252d != null && this.f13255h != null && this.i != null) {
            return new b0(this.f13249a, this.f13250b, this.f13251c, this.f13252d, this.f13253e, this.f, this.f13254g, this.f13255h, this.i, this.f13256j, this.f13257k, this.f13258l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f13249a == null) {
            sb2.append(" sdkVersion");
        }
        if (this.f13250b == null) {
            sb2.append(" gmpAppId");
        }
        if ((1 & this.f13259m) == 0) {
            sb2.append(" platform");
        }
        if (this.f13252d == null) {
            sb2.append(" installationUuid");
        }
        if (this.f13255h == null) {
            sb2.append(" buildVersion");
        }
        if (this.i == null) {
            sb2.append(" displayVersion");
        }
        throw new IllegalStateException(d0.d.m("Missing required properties:", sb2));
    }
}
