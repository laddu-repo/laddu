package db;

import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class p1 implements Iterator {

    /* renamed from: x, reason: collision with root package name */
    public final Iterator f4029x;

    public p1(Iterator it) {
        it.getClass();
        this.f4029x = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4029x.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f4029x.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f4029x.remove();
    }
}
