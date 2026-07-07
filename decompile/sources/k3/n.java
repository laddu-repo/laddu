package k3;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class n extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f7331c;

    public n(String str, byte[] bArr) {
        super("PRIV");
        this.f7330b = str;
        this.f7331c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f7330b, nVar.f7330b) && Arrays.equals(this.f7331c, nVar.f7331c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f7330b;
        return Arrays.hashCode(this.f7331c) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // k3.j
    public final String toString() {
        return this.f7321a + ": owner=" + this.f7330b;
    }
}
