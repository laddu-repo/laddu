package db;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements Iterator {
    public final /* synthetic */ y0 B;

    /* renamed from: x, reason: collision with root package name */
    public final Iterator f3980x;

    /* renamed from: y, reason: collision with root package name */
    public Object f3981y = null;

    /* renamed from: z, reason: collision with root package name */
    public Collection f3982z = null;
    public Iterator A = r0.f4036x;

    public a(y0 y0Var) {
        this.B = y0Var;
        this.f3980x = y0Var.A.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f3980x.hasNext() && !this.A.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.A.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f3980x.next();
            this.f3981y = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f3982z = collection;
            this.A = collection.iterator();
        }
        return this.A.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.A.remove();
        Collection collection = this.f3982z;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f3980x.remove();
        }
        y0 y0Var = this.B;
        y0Var.B--;
    }
}
