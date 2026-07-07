package k3;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f7329e;
    public final int[] f;

    public m(int i, int i10, int i11, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f7326b = i;
        this.f7327c = i10;
        this.f7328d = i11;
        this.f7329e = iArr;
        this.f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f7326b == mVar.f7326b && this.f7327c == mVar.f7327c && this.f7328d == mVar.f7328d && Arrays.equals(this.f7329e, mVar.f7329e) && Arrays.equals(this.f, mVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f) + ((Arrays.hashCode(this.f7329e) + ((((((527 + this.f7326b) * 31) + this.f7327c) * 31) + this.f7328d) * 31)) * 31);
    }
}
