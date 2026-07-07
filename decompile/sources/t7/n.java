package t7;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class n implements r7.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f12386c = new n(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12387b;

    public /* synthetic */ n(String str) {
        this.f12387b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            return y.j(this.f12387b, ((n) obj).f12387b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12387b});
    }
}
