package k3;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f7303e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j[] f7304g;

    public c(String str, int i, int i10, long j8, long j9, j[] jVarArr) {
        super("CHAP");
        this.f7300b = str;
        this.f7301c = i;
        this.f7302d = i10;
        this.f7303e = j8;
        this.f = j9;
        this.f7304g = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f7301c == cVar.f7301c && this.f7302d == cVar.f7302d && this.f7303e == cVar.f7303e && this.f == cVar.f && Objects.equals(this.f7300b, cVar.f7300b) && Arrays.equals(this.f7304g, cVar.f7304g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((((527 + this.f7301c) * 31) + this.f7302d) * 31) + ((int) this.f7303e)) * 31) + ((int) this.f)) * 31;
        String str = this.f7300b;
        return i + (str != null ? str.hashCode() : 0);
    }
}
