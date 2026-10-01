package va;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f13367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f13368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f13369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f13370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f13371e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u1 f13372g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l2 f13373h;
    public k2 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public v1 f13374j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f13375k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13376l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte f13377m;

    public final j0 a() {
        String str;
        String str2;
        u1 u1Var;
        if (this.f13377m == 7 && (str = this.f13367a) != null && (str2 = this.f13368b) != null && (u1Var = this.f13372g) != null) {
            return new j0(str, str2, this.f13369c, this.f13370d, this.f13371e, this.f, u1Var, this.f13373h, this.i, this.f13374j, this.f13375k, this.f13376l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f13367a == null) {
            sb2.append(" generator");
        }
        if (this.f13368b == null) {
            sb2.append(" identifier");
        }
        if ((this.f13377m & 1) == 0) {
            sb2.append(" startedAt");
        }
        if ((this.f13377m & 2) == 0) {
            sb2.append(" crashed");
        }
        if (this.f13372g == null) {
            sb2.append(" app");
        }
        if ((this.f13377m & 4) == 0) {
            sb2.append(" generatorType");
        }
        throw new IllegalStateException(d0.d.m("Missing required properties:", sb2));
    }
}
