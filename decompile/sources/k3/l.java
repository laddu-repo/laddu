package k3;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7325d;

    public l(String str, String str2, String str3) {
        super("----");
        this.f7323b = str;
        this.f7324c = str2;
        this.f7325d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (Objects.equals(this.f7324c, lVar.f7324c) && Objects.equals(this.f7323b, lVar.f7323b) && Objects.equals(this.f7325d, lVar.f7325d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f7323b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7324c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f7325d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // k3.j
    public final String toString() {
        return this.f7321a + ": domain=" + this.f7323b + ", description=" + this.f7324c;
    }
}
