package n9;

import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t implements Iterator {

    /* renamed from: x, reason: collision with root package name */
    public final Iterator f9481x;

    public t(u uVar) {
        this.f9481x = uVar.f9492x.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9481x.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f9481x.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
