package va;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f1 f13319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f13320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f13321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f13322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f13323e;

    public final e1 a() {
        f1 f1Var;
        String str;
        String str2;
        if (this.f13323e == 1 && (f1Var = this.f13319a) != null && (str = this.f13320b) != null && (str2 = this.f13321c) != null) {
            return new e1(f1Var, str, str2, this.f13322d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f13319a == null) {
            sb2.append(" rolloutVariant");
        }
        if (this.f13320b == null) {
            sb2.append(" parameterKey");
        }
        if (this.f13321c == null) {
            sb2.append(" parameterValue");
        }
        if ((1 & this.f13323e) == 0) {
            sb2.append(" templateVersion");
        }
        throw new IllegalStateException(d0.d.m("Missing required properties:", sb2));
    }
}
