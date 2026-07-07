package oe;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f10159a;

    public h(Throwable th) {
        this.f10159a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return de.i.a(this.f10159a, ((h) obj).f10159a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f10159a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // oe.i
    public final String toString() {
        return "Closed(" + this.f10159a + ')';
    }
}
