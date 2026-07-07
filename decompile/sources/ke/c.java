package ke;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Iterator, ee.a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final CharSequence f7964v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f7965w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f7966x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f7967y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f7968z;

    public c(CharSequence charSequence) {
        de.i.e(charSequence, "string");
        this.f7964v = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i10;
        int i11 = this.f7965w;
        if (i11 != 0) {
            return i11 == 1;
        }
        if (this.f7968z < 0) {
            this.f7965w = 2;
            return false;
        }
        CharSequence charSequence = this.f7964v;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i12 = this.f7966x; i12 < length2; i12++) {
            char cCharAt = charSequence.charAt(i12);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i10 = i12 + 1) < charSequence.length() && charSequence.charAt(i10) == '\n') ? 2 : 1;
                length = i12;
                this.f7965w = 1;
                this.f7968z = i;
                this.f7967y = length;
                return true;
            }
        }
        i = -1;
        this.f7965w = 1;
        this.f7968z = i;
        this.f7967y = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f7965w = 0;
        int i = this.f7967y;
        int i10 = this.f7966x;
        this.f7966x = this.f7968z + i;
        return this.f7964v.subSequence(i10, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
