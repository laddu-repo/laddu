package t1;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12078b;

    static {
        w1.b0.H(0);
        w1.b0.H(1);
    }

    public p(String str, String str2) {
        this.f12077a = w1.b0.N(str);
        this.f12078b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (Objects.equals(this.f12077a, pVar.f12077a) && Objects.equals(this.f12078b, pVar.f12078b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f12078b.hashCode() * 31;
        String str = this.f12077a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
