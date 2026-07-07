package t1;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f12121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y9.f0 f12122b;

    static {
        w1.b0.H(0);
        w1.b0.H(1);
    }

    public u0(t0 t0Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= t0Var.f12111a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f12121a = t0Var;
        this.f12122b = y9.f0.m(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u0.class == obj.getClass()) {
            u0 u0Var = (u0) obj;
            if (this.f12121a.equals(u0Var.f12121a) && this.f12122b.equals(u0Var.f12122b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f12122b.hashCode() * 31) + this.f12121a.hashCode();
    }
}
