package va;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f13293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f13296e;
    public long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f13297g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f13298h;
    public List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte f13299j;

    public final d0 a() {
        String str;
        if (this.f13299j == 63 && (str = this.f13293b) != null) {
            return new d0(this.f13292a, str, this.f13294c, this.f13295d, this.f13296e, this.f, this.f13297g, this.f13298h, this.i);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f13299j & 1) == 0) {
            sb2.append(" pid");
        }
        if (this.f13293b == null) {
            sb2.append(" processName");
        }
        if ((this.f13299j & 2) == 0) {
            sb2.append(" reasonCode");
        }
        if ((this.f13299j & 4) == 0) {
            sb2.append(" importance");
        }
        if ((this.f13299j & 8) == 0) {
            sb2.append(" pss");
        }
        if ((this.f13299j & 16) == 0) {
            sb2.append(" rss");
        }
        if ((this.f13299j & 32) == 0) {
            sb2.append(" timestamp");
        }
        throw new IllegalStateException(d0.d.m("Missing required properties:", sb2));
    }
}
