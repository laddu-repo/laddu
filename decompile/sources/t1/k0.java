package t1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f12017a;

    public k0(m mVar) {
        this.f12017a = mVar;
    }

    public final boolean a(int... iArr) {
        for (int i : iArr) {
            if (this.f12017a.f12018a.get(i)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k0) {
            return this.f12017a.equals(((k0) obj).f12017a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12017a.hashCode();
    }
}
