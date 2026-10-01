package c2;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f1980c;

    public v0(u0 u0Var) {
        this.f1978a = u0Var.f1969a;
        this.f1979b = u0Var.f1970b;
        this.f1980c = u0Var.f1971c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.f1978a == v0Var.f1978a && this.f1979b == v0Var.f1979b && this.f1980c == v0Var.f1980c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f1978a), Float.valueOf(this.f1979b), Long.valueOf(this.f1980c));
    }
}
