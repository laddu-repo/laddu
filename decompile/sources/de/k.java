package de;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f4519a;

    public k(Class cls) {
        this.f4519a = cls;
    }

    @Override // de.e
    public final Class a() {
        return this.f4519a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return i.a(this.f4519a, ((k) obj).f4519a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4519a.hashCode();
    }

    public final String toString() {
        return this.f4519a.toString() + " (Kotlin reflection is not available)";
    }
}
