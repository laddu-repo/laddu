package o4;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9760e;

    public boolean a() {
        int i = this.f9756a;
        int i10 = 2;
        if ((i & 7) != 0) {
            int i11 = this.f9759d;
            int i12 = this.f9757b;
            if (((i11 > i12 ? 1 : i11 == i12 ? 2 : 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 112) != 0) {
            int i13 = this.f9759d;
            int i14 = this.f9758c;
            if ((((i13 > i14 ? 1 : i13 == i14 ? 2 : 4) << 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 1792) != 0) {
            int i15 = this.f9760e;
            int i16 = this.f9757b;
            if ((((i15 > i16 ? 1 : i15 == i16 ? 2 : 4) << 8) & i) == 0) {
                return false;
            }
        }
        if ((i & 28672) != 0) {
            int i17 = this.f9760e;
            int i18 = this.f9758c;
            if (i17 > i18) {
                i10 = 1;
            } else if (i17 != i18) {
                i10 = 4;
            }
            if ((i & (i10 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
