package y9;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class o1 implements Iterator {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Iterator f14595v;

    public o1(Iterator it) {
        it.getClass();
        this.f14595v = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14595v.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f14595v.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f14595v.remove();
    }
}
