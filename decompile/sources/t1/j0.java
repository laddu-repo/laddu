package t1;

import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f12012a;

    static {
        new SparseBooleanArray();
        w1.a.j(!false);
        w1.b0.H(0);
    }

    public j0(m mVar) {
        this.f12012a = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j0) {
            return this.f12012a.equals(((j0) obj).f12012a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12012a.hashCode();
    }
}
