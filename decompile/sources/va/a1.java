package va;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Double f13260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f13264e;
    public long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte f13265g;

    public final b1 a() {
        if (this.f13265g == 31) {
            return new b1(this.f13260a, this.f13261b, this.f13262c, this.f13263d, this.f13264e, this.f);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f13265g & 1) == 0) {
            sb2.append(" batteryVelocity");
        }
        if ((this.f13265g & 2) == 0) {
            sb2.append(" proximityOn");
        }
        if ((this.f13265g & 4) == 0) {
            sb2.append(" orientation");
        }
        if ((this.f13265g & 8) == 0) {
            sb2.append(" ramUsed");
        }
        if ((this.f13265g & 16) == 0) {
            sb2.append(" diskUsed");
        }
        throw new IllegalStateException(d0.d.m("Missing required properties:", sb2));
    }
}
