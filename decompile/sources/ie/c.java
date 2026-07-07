package ie;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c extends d implements RandomAccess {

    /* renamed from: x, reason: collision with root package name */
    public final d f6837x;

    /* renamed from: y, reason: collision with root package name */
    public final int f6838y;

    /* renamed from: z, reason: collision with root package name */
    public final int f6839z;

    public c(d dVar, int i6, int i10) {
        this.f6837x = dVar;
        this.f6838y = i6;
        a8.e.j(i6, i10, dVar.a());
        this.f6839z = i10 - i6;
    }

    @Override // ie.a
    public final int a() {
        return this.f6839z;
    }

    @Override // java.util.List
    public final Object get(int i6) {
        int i10 = this.f6839z;
        if (i6 >= 0 && i6 < i10) {
            return this.f6837x.get(this.f6838y + i6);
        }
        throw new IndexOutOfBoundsException(h8.c.l("index: ", ", size: ", i6, i10));
    }

    @Override // ie.d, java.util.List
    public final List subList(int i6, int i10) {
        a8.e.j(i6, i10, this.f6839z);
        int i11 = this.f6838y;
        return new c(this.f6837x, i6 + i11, i11 + i10);
    }
}
