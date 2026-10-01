package me;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class u extends sd.a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final t f8734x = new t();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f8735w;

    public u() {
        super(f8734x);
        this.f8735w = "Room Invalidation Tracker Refresh";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && de.i.a(this.f8735w, ((u) obj).f8735w);
    }

    public final int hashCode() {
        return this.f8735w.hashCode();
    }

    public final String toString() {
        return "CoroutineName(" + this.f8735w + ')';
    }
}
