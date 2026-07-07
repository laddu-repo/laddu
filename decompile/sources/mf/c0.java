package mf;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f8764b = new int[10];

    public final int a() {
        if ((this.f8763a & 16) != 0) {
            return this.f8764b[4];
        }
        return 65535;
    }

    public final void b(c0 c0Var) {
        de.i.e(c0Var, "other");
        for (int i = 0; i < 10; i++) {
            if (((1 << i) & c0Var.f8763a) != 0) {
                c(i, c0Var.f8764b[i]);
            }
        }
    }

    public final void c(int i, int i10) {
        if (i >= 0) {
            int[] iArr = this.f8764b;
            if (i >= iArr.length) {
                return;
            }
            this.f8763a = (1 << i) | this.f8763a;
            iArr[i] = i10;
        }
    }
}
