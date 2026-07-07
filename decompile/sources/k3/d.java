package k3;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f7306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f7307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f7308e;
    public final j[] f;

    public d(String str, boolean z2, boolean z10, String[] strArr, j[] jVarArr) {
        super("CTOC");
        this.f7305b = str;
        this.f7306c = z2;
        this.f7307d = z10;
        this.f7308e = strArr;
        this.f = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f7306c == dVar.f7306c && this.f7307d == dVar.f7307d && Objects.equals(this.f7305b, dVar.f7305b) && Arrays.equals(this.f7308e, dVar.f7308e) && Arrays.equals(this.f, dVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((527 + (this.f7306c ? 1 : 0)) * 31) + (this.f7307d ? 1 : 0)) * 31;
        String str = this.f7305b;
        return i + (str != null ? str.hashCode() : 0);
    }
}
