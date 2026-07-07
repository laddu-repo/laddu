package c6;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r6.h f2223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f2224b;

    public o(r6.h hVar, Executor executor) {
        this.f2223a = hVar;
        this.f2224b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f2223a.equals(((o) obj).f2223a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2223a.hashCode();
    }
}
