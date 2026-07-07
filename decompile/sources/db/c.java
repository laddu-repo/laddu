package db;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class c implements Iterator {
    public final /* synthetic */ Object A;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f3985x = 0;

    /* renamed from: y, reason: collision with root package name */
    public final Iterator f3986y;

    /* renamed from: z, reason: collision with root package name */
    public Object f3987z;

    public c(l lVar) {
        Iterator it;
        this.A = lVar;
        Collection collection = lVar.f4012y;
        this.f3987z = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f3986y = it;
    }

    public void a() {
        l lVar = (l) this.A;
        lVar.b();
        if (lVar.f4012y == ((Collection) this.f3987z)) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f3985x) {
            case 0:
                return this.f3986y.hasNext();
            case 1:
                return this.f3986y.hasNext();
            default:
                a();
                return this.f3986y.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f3985x) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f3986y.next();
                this.f3987z = (Collection) entry.getValue();
                return ((d) this.A).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f3986y.next();
                this.f3987z = entry2;
                return entry2.getKey();
            default:
                a();
                return this.f3986y.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z10;
        boolean z11;
        switch (this.f3985x) {
            case 0:
                if (((Collection) this.f3987z) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                jb.b.i("no calls to next() since the last call to remove()", z10);
                this.f3986y.remove();
                ((d) this.A).A.B -= ((Collection) this.f3987z).size();
                ((Collection) this.f3987z).clear();
                this.f3987z = null;
                return;
            case 1:
                if (((Map.Entry) this.f3987z) != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                jb.b.i("no calls to next() since the last call to remove()", z11);
                Collection collection = (Collection) ((Map.Entry) this.f3987z).getValue();
                this.f3986y.remove();
                ((e) this.A).f3994y.B -= collection.size();
                collection.clear();
                this.f3987z = null;
                return;
            default:
                this.f3986y.remove();
                l lVar = (l) this.A;
                y0 y0Var = lVar.B;
                y0Var.B--;
                lVar.c();
                return;
        }
    }

    public c(l lVar, ListIterator listIterator) {
        this.A = lVar;
        this.f3987z = lVar.f4012y;
        this.f3986y = listIterator;
    }

    public c(e eVar, Iterator it) {
        this.f3986y = it;
        this.A = eVar;
    }

    public c(d dVar) {
        this.A = dVar;
        this.f3986y = dVar.f3991z.entrySet().iterator();
    }
}
