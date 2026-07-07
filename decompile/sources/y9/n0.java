package y9;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends p1 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f14591v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f14592w;

    public n0(Object obj) {
        this.f14591v = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f14592w;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f14592w) {
            throw new NoSuchElementException();
        }
        this.f14592w = true;
        return this.f14591v;
    }
}
