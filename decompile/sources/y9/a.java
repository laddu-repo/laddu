package y9;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Iterator {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Iterator f14516v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f14517w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Collection f14518x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Iterator f14519y = m0.f14585v;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ w0 f14520z;

    public a(w0 w0Var) {
        this.f14520z = w0Var;
        this.f14516v = w0Var.f14625y.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14516v.hasNext() || this.f14519y.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f14519y.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f14516v.next();
            this.f14517w = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f14518x = collection;
            this.f14519y = collection.iterator();
        }
        return this.f14519y.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f14519y.remove();
        Collection collection = this.f14518x;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f14516v.remove();
        }
        w0 w0Var = this.f14520z;
        w0Var.f14626z--;
    }
}
