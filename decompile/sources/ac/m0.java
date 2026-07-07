package ac;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {
    public static final l0 Companion = new l0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final od.c[] f425d = {null, null, com.bumptech.glide.f.B(new j0(0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1 f427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f428c;

    public /* synthetic */ m0(int i, q0 q0Var, j1 j1Var, Map map) {
        if (1 != (i & 1)) {
            af.k.a(i, 1, k0.f419a.d());
            throw null;
        }
        this.f426a = q0Var;
        if ((i & 2) == 0) {
            this.f427b = null;
        } else {
            this.f427b = j1Var;
        }
        if ((i & 4) == 0) {
            this.f428c = null;
        } else {
            this.f428c = map;
        }
    }

    public static m0 a(m0 m0Var, q0 q0Var, j1 j1Var, Map map, int i) {
        if ((i & 1) != 0) {
            q0Var = m0Var.f426a;
        }
        if ((i & 2) != 0) {
            j1Var = m0Var.f427b;
        }
        if ((i & 4) != 0) {
            map = m0Var.f428c;
        }
        m0Var.getClass();
        de.i.e(q0Var, "sessionDetails");
        return new m0(q0Var, j1Var, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return de.i.a(this.f426a, m0Var.f426a) && de.i.a(this.f427b, m0Var.f427b) && de.i.a(this.f428c, m0Var.f428c);
    }

    public final int hashCode() {
        int iHashCode = this.f426a.hashCode() * 31;
        j1 j1Var = this.f427b;
        int iHashCode2 = (iHashCode + (j1Var == null ? 0 : j1Var.hashCode())) * 31;
        Map map = this.f428c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "SessionData(sessionDetails=" + this.f426a + ", backgroundTime=" + this.f427b + ", processDataMap=" + this.f428c + ')';
    }

    public m0(q0 q0Var, j1 j1Var, Map map) {
        de.i.e(q0Var, "sessionDetails");
        this.f426a = q0Var;
        this.f427b = j1Var;
        this.f428c = map;
    }
}
