package va;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f13555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f13559e;

    public final z0 a() {
        String str;
        if (this.f13559e == 7 && (str = this.f13555a) != null) {
            return new z0(str, this.f13556b, this.f13557c, this.f13558d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f13555a == null) {
            sb2.append(" processName");
        }
        if ((this.f13559e & 1) == 0) {
            sb2.append(" pid");
        }
        if ((this.f13559e & 2) == 0) {
            sb2.append(" importance");
        }
        if ((this.f13559e & 4) == 0) {
            sb2.append(" defaultProcess");
        }
        throw new IllegalStateException(d0.d.m("Missing required properties:", sb2));
    }
}
