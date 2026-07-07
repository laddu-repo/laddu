package de;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class a implements g, Serializable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f4498v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f4499w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f4500x = 2;

    public a(Object obj) {
        this.f4498v = obj;
    }

    @Override // de.g
    public final int d() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f4499w == aVar.f4499w && this.f4500x == aVar.f4500x && i.a(this.f4498v, aVar.f4498v) && AtomicReference.class.equals(AtomicReference.class);
    }

    public final int hashCode() {
        return ((((((((((AtomicReference.class.hashCode() + ((this.f4498v != null ? r0.hashCode() : 0) * 31)) * 31) + 113762) * 31) - 869290769) * 31) + (this.f4499w ? 1231 : 1237)) * 31) + 2) * 31) + this.f4500x;
    }

    public final String toString() {
        q.f4523a.getClass();
        return r.a(this);
    }
}
