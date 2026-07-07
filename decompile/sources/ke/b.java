package ke;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Iterator, ee.a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f7959v = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f7960w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f7961x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public he.c f7962y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ je.d f7963z;

    public b(je.d dVar) {
        this.f7963z = dVar;
        int length = ((CharSequence) dVar.f7113b).length();
        if (length < 0) {
            throw new IllegalArgumentException(d0.d.i(length, "Cannot coerce value to an empty range: maximum ", " is less than minimum 0."));
        }
        length = length >= 0 ? 0 : length;
        this.f7960w = length;
        this.f7961x = length;
    }

    public final void a() {
        od.f fVar;
        je.d dVar = this.f7963z;
        CharSequence charSequence = (CharSequence) dVar.f7113b;
        int i = this.f7961x;
        if (i < 0) {
            this.f7959v = 0;
            this.f7962y = null;
            return;
        }
        if (i <= charSequence.length() && (fVar = (od.f) ((q) dVar.f7114c).i(charSequence, Integer.valueOf(this.f7961x))) != null) {
            int iIntValue = ((Number) fVar.f10116v).intValue();
            int iIntValue2 = ((Number) fVar.f10117w).intValue();
            this.f7962y = android.support.v4.media.session.b.P(this.f7960w, iIntValue);
            int i10 = iIntValue + iIntValue2;
            this.f7960w = i10;
            this.f7961x = i10 + (iIntValue2 == 0 ? 1 : 0);
        } else {
            this.f7962y = new he.c(this.f7960w, h.G(charSequence), 1);
            this.f7961x = -1;
        }
        this.f7959v = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f7959v == -1) {
            a();
        }
        return this.f7959v == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f7959v == -1) {
            a();
        }
        if (this.f7959v == 0) {
            throw new NoSuchElementException();
        }
        he.c cVar = this.f7962y;
        de.i.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f7962y = null;
        this.f7959v = -1;
        return cVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
