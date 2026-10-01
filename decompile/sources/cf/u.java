package cf;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u implements Iterator, we.a {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f2085x;

    /* renamed from: y, reason: collision with root package name */
    public Iterator f2086y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f2087z;

    public u(he.p pVar) {
        this.f2085x = 1;
        this.f2087z = new ArrayList();
        this.f2086y = pVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2085x) {
            case 0:
                return this.f2086y.hasNext();
            default:
                return this.f2086y.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        ViewGroup viewGroup;
        switch (this.f2085x) {
            case 0:
                return ((t) this.f2087z).f2084c.invoke(this.f2086y.next());
            default:
                Object next = this.f2086y.next();
                ArrayList arrayList = (ArrayList) this.f2087z;
                View view = (View) next;
                he.p pVar = null;
                if (view instanceof ViewGroup) {
                    viewGroup = (ViewGroup) view;
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    pVar = new he.p(viewGroup, 6);
                }
                if (pVar != null && pVar.hasNext()) {
                    arrayList.add(this.f2086y);
                    this.f2086y = pVar;
                } else {
                    while (!this.f2086y.hasNext() && !arrayList.isEmpty()) {
                        this.f2086y = (Iterator) ie.j.M(arrayList);
                        ie.p.B(arrayList);
                    }
                }
                return next;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2085x) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public u(t tVar) {
        this.f2085x = 0;
        this.f2087z = tVar;
        this.f2086y = tVar.f2083b.iterator();
    }
}
