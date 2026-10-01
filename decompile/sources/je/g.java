package je;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g extends ie.f {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f7431x;

    /* renamed from: y, reason: collision with root package name */
    public final f f7432y;

    public /* synthetic */ g(f fVar, int i6) {
        this.f7431x = i6;
        this.f7432y = fVar;
    }

    @Override // ie.f
    public final int a() {
        switch (this.f7431x) {
            case 0:
                return this.f7432y.F;
            default:
                return this.f7432y.F;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f7431x) {
            case 0:
                Map.Entry element = (Map.Entry) obj;
                k.e(element, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        switch (this.f7431x) {
            case 0:
                k.e(elements, "elements");
                throw new UnsupportedOperationException();
            default:
                k.e(elements, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f7431x) {
            case 0:
                this.f7432y.clear();
                return;
            default:
                this.f7432y.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f7431x) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                return this.f7432y.f((Map.Entry) obj);
            default:
                return this.f7432y.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        switch (this.f7431x) {
            case 0:
                k.e(elements, "elements");
                return this.f7432y.e(elements);
            default:
                return super.containsAll(elements);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f7431x) {
            case 0:
                return this.f7432y.isEmpty();
            default:
                return this.f7432y.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f7431x) {
            case 0:
                f fVar = this.f7432y;
                fVar.getClass();
                return new d(fVar, 0);
            default:
                f fVar2 = this.f7432y;
                fVar2.getClass();
                return new d(fVar2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f7431x) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                f fVar = this.f7432y;
                fVar.getClass();
                fVar.c();
                int h4 = fVar.h(entry.getKey());
                if (h4 < 0) {
                    return false;
                }
                Object[] objArr = fVar.f7429y;
                k.b(objArr);
                if (!k.a(objArr[h4], entry.getValue())) {
                    return false;
                }
                fVar.l(h4);
                return true;
            default:
                f fVar2 = this.f7432y;
                fVar2.c();
                int h10 = fVar2.h(obj);
                if (h10 < 0) {
                    return false;
                }
                fVar2.l(h10);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        switch (this.f7431x) {
            case 0:
                k.e(elements, "elements");
                this.f7432y.c();
                return super.removeAll(elements);
            default:
                k.e(elements, "elements");
                this.f7432y.c();
                return super.removeAll(elements);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        switch (this.f7431x) {
            case 0:
                k.e(elements, "elements");
                this.f7432y.c();
                return super.retainAll(elements);
            default:
                k.e(elements, "elements");
                this.f7432y.c();
                return super.retainAll(elements);
        }
    }
}
