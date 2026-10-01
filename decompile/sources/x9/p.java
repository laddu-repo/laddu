package x9;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class p implements m, Serializable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f14307v;

    public p(Object obj) {
        this.f14307v = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return Objects.equals(this.f14307v, ((p) obj).f14307v);
        }
        return false;
    }

    @Override // x9.m
    public final Object get() {
        return this.f14307v;
    }

    public final int hashCode() {
        return Objects.hash(this.f14307v);
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f14307v + ")";
    }
}
