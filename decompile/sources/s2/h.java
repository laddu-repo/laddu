package s2;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11459d;

    public h(int i, int i10, int i11, int i12) {
        this.f11456a = i;
        this.f11457b = i10;
        this.f11458c = i11;
        this.f11459d = i12;
    }

    public final boolean a(int i) {
        if (i == 1) {
            if (this.f11456a - this.f11457b <= 1) {
                return false;
            }
        } else if (this.f11458c - this.f11459d <= 1) {
            return false;
        }
        return true;
    }
}
