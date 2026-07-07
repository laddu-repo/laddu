package va;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f13355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f13356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f13358e;

    public final i1 a() {
        String str;
        String str2;
        if (this.f13358e == 3 && (str = this.f13355b) != null && (str2 = this.f13356c) != null) {
            return new i1(this.f13354a, str, str2, this.f13357d);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f13358e & 1) == 0) {
            sb2.append(" platform");
        }
        if (this.f13355b == null) {
            sb2.append(" version");
        }
        if (this.f13356c == null) {
            sb2.append(" buildVersion");
        }
        if ((this.f13358e & 2) == 0) {
            sb2.append(" jailbroken");
        }
        throw new IllegalStateException(d0.d.m("Missing required properties:", sb2));
    }
}
