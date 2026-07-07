package bg;

import java.util.RandomAccess;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b0 extends ie.d implements RandomAccess {

    /* renamed from: x, reason: collision with root package name */
    public final n[] f1690x;

    /* renamed from: y, reason: collision with root package name */
    public final int[] f1691y;

    public b0(n[] nVarArr, int[] iArr) {
        this.f1690x = nVarArr;
        this.f1691y = iArr;
    }

    @Override // ie.a
    public final int a() {
        return this.f1690x.length;
    }

    @Override // ie.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        return super.contains((n) obj);
    }

    @Override // java.util.List
    public final Object get(int i6) {
        return this.f1690x[i6];
    }

    @Override // ie.d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof n)) {
            return -1;
        }
        return super.indexOf((n) obj);
    }

    @Override // ie.d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof n)) {
            return -1;
        }
        return super.lastIndexOf((n) obj);
    }
}
