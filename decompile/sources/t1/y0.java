package t1;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f12174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f12176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean[] f12177e;

    static {
        w1.b0.H(0);
        w1.b0.H(1);
        w1.b0.H(3);
        w1.b0.H(4);
    }

    public y0(t0 t0Var, boolean z2, int[] iArr, boolean[] zArr) {
        int i = t0Var.f12111a;
        this.f12173a = i;
        boolean z10 = false;
        w1.a.d(i == iArr.length && i == zArr.length);
        this.f12174b = t0Var;
        if (z2 && i > 1) {
            z10 = true;
        }
        this.f12175c = z10;
        this.f12176d = (int[]) iArr.clone();
        this.f12177e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y0.class == obj.getClass()) {
            y0 y0Var = (y0) obj;
            if (this.f12175c == y0Var.f12175c && this.f12174b.equals(y0Var.f12174b) && Arrays.equals(this.f12176d, y0Var.f12176d) && Arrays.equals(this.f12177e, y0Var.f12177e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12177e) + ((Arrays.hashCode(this.f12176d) + (((this.f12174b.hashCode() * 31) + (this.f12175c ? 1 : 0)) * 31)) * 31);
    }
}
