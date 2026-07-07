package k3;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7311d;

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f7309b = str;
        this.f7310c = str2;
        this.f7311d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (Objects.equals(this.f7310c, eVar.f7310c) && Objects.equals(this.f7309b, eVar.f7309b) && Objects.equals(this.f7311d, eVar.f7311d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f7309b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7310c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f7311d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // k3.j
    public final String toString() {
        return this.f7321a + ": language=" + this.f7309b + ", description=" + this.f7310c + ", text=" + this.f7311d;
    }
}
