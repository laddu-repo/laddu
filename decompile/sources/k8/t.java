package k8;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class t implements Iterator {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Iterator f7762v;

    public t(u uVar) {
        this.f7762v = uVar.f7778v.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7762v.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f7762v.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
