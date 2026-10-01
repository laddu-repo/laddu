package x9;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j implements i, Serializable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List f14292v;

    public j(List list) {
        this.f14292v = list;
    }

    @Override // x9.i
    public final boolean apply(Object obj) {
        int i = 0;
        while (true) {
            List list = this.f14292v;
            if (i >= list.size()) {
                return true;
            }
            if (!((i) list.get(i)).apply(obj)) {
                return false;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f14292v.equals(((j) obj).f14292v);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14292v.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Predicates.and(");
        boolean z2 = true;
        for (Object obj : this.f14292v) {
            if (!z2) {
                sb2.append(',');
            }
            sb2.append(obj);
            z2 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
