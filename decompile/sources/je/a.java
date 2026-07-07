package je;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements ListIterator, we.a {
    public int A;
    public final ie.e B;

    /* renamed from: y, reason: collision with root package name */
    public int f7417y;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f7416x = 0;

    /* renamed from: z, reason: collision with root package name */
    public int f7418z = -1;

    public a(c cVar, int i6) {
        int i10;
        this.B = cVar;
        this.f7417y = i6;
        i10 = ((AbstractList) cVar).modCount;
        this.A = i10;
    }

    public void a() {
        int i6;
        i6 = ((AbstractList) ((b) this.B).B).modCount;
        if (i6 == this.A) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i6;
        int i10;
        switch (this.f7416x) {
            case 0:
                a();
                b bVar = (b) this.B;
                int i11 = this.f7417y;
                this.f7417y = i11 + 1;
                bVar.add(i11, obj);
                this.f7418z = -1;
                i6 = ((AbstractList) bVar).modCount;
                this.A = i6;
                return;
            default:
                b();
                c cVar = (c) this.B;
                int i12 = this.f7417y;
                this.f7417y = i12 + 1;
                cVar.add(i12, obj);
                this.f7418z = -1;
                i10 = ((AbstractList) cVar).modCount;
                this.A = i10;
                return;
        }
    }

    public void b() {
        int i6;
        i6 = ((AbstractList) ((c) this.B)).modCount;
        if (i6 == this.A) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f7416x) {
            case 0:
                if (this.f7417y < ((b) this.B).f7421z) {
                    return true;
                }
                return false;
            default:
                if (this.f7417y < ((c) this.B).f7423y) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f7416x) {
            case 0:
                if (this.f7417y > 0) {
                    return true;
                }
                return false;
            default:
                if (this.f7417y > 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f7416x) {
            case 0:
                a();
                int i6 = this.f7417y;
                b bVar = (b) this.B;
                if (i6 < bVar.f7421z) {
                    this.f7417y = i6 + 1;
                    this.f7418z = i6;
                    return bVar.f7419x[bVar.f7420y + i6];
                }
                throw new NoSuchElementException();
            default:
                b();
                int i10 = this.f7417y;
                c cVar = (c) this.B;
                if (i10 < cVar.f7423y) {
                    this.f7417y = i10 + 1;
                    this.f7418z = i10;
                    return cVar.f7422x[i10];
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f7416x) {
            case 0:
                return this.f7417y;
            default:
                return this.f7417y;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f7416x) {
            case 0:
                a();
                int i6 = this.f7417y;
                if (i6 > 0) {
                    int i10 = i6 - 1;
                    this.f7417y = i10;
                    this.f7418z = i10;
                    b bVar = (b) this.B;
                    return bVar.f7419x[bVar.f7420y + i10];
                }
                throw new NoSuchElementException();
            default:
                b();
                int i11 = this.f7417y;
                if (i11 > 0) {
                    int i12 = i11 - 1;
                    this.f7417y = i12;
                    this.f7418z = i12;
                    return ((c) this.B).f7422x[i12];
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i6;
        switch (this.f7416x) {
            case 0:
                i6 = this.f7417y;
                break;
            default:
                i6 = this.f7417y;
                break;
        }
        return i6 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i6;
        int i10;
        switch (this.f7416x) {
            case 0:
                b bVar = (b) this.B;
                a();
                int i11 = this.f7418z;
                if (i11 != -1) {
                    bVar.b(i11);
                    this.f7417y = this.f7418z;
                    this.f7418z = -1;
                    i6 = ((AbstractList) bVar).modCount;
                    this.A = i6;
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            default:
                c cVar = (c) this.B;
                b();
                int i12 = this.f7418z;
                if (i12 != -1) {
                    cVar.b(i12);
                    this.f7417y = this.f7418z;
                    this.f7418z = -1;
                    i10 = ((AbstractList) cVar).modCount;
                    this.A = i10;
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f7416x) {
            case 0:
                a();
                int i6 = this.f7418z;
                if (i6 != -1) {
                    ((b) this.B).set(i6, obj);
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            default:
                b();
                int i10 = this.f7418z;
                if (i10 != -1) {
                    ((c) this.B).set(i10, obj);
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
        }
    }

    public a(b bVar, int i6) {
        int i10;
        this.B = bVar;
        this.f7417y = i6;
        i10 = ((AbstractList) bVar).modCount;
        this.A = i10;
    }
}
