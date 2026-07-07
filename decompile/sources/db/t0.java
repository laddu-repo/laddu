package db;

import java.util.AbstractList;
import java.util.ListIterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t0 extends p1 implements ListIterator {

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f4045y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ AbstractList f4046z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(AbstractList abstractList, ListIterator listIterator, int i6) {
        super(listIterator);
        this.f4045y = i6;
        this.f4046z = abstractList;
    }

    @Override // db.p1
    public final Object a(Object obj) {
        switch (this.f4045y) {
            case 0:
                return ((u0) this.f4046z).f4051y.apply(obj);
            default:
                return ((v0) this.f4046z).f4056y.apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f4029x).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f4029x).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return a(((ListIterator) this.f4029x).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f4029x).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
