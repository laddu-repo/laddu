package je;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i extends ie.f implements Serializable {

    /* renamed from: y, reason: collision with root package name */
    public static final i f7434y;

    /* renamed from: x, reason: collision with root package name */
    public final f f7435x;

    static {
        f fVar = f.K;
        f7434y = new i(f.K);
    }

    public i(f backing) {
        k.e(backing, "backing");
        this.f7435x = backing;
    }

    @Override // ie.f
    public final int a() {
        return this.f7435x.F;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        if (this.f7435x.a(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        k.e(elements, "elements");
        this.f7435x.c();
        return super.addAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f7435x.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f7435x.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f7435x.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        f fVar = this.f7435x;
        fVar.getClass();
        return new d(fVar, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        f fVar = this.f7435x;
        fVar.c();
        int h4 = fVar.h(obj);
        if (h4 < 0) {
            return false;
        }
        fVar.l(h4);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        k.e(elements, "elements");
        this.f7435x.c();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        k.e(elements, "elements");
        this.f7435x.c();
        return super.retainAll(elements);
    }

    public i() {
        this(new f());
    }
}
