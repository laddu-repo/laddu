package cf;

import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s implements j, d {

    /* renamed from: a, reason: collision with root package name */
    public final j f2079a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2080b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2081c;

    public s(j sequence, int i6, int i10) {
        kotlin.jvm.internal.k.e(sequence, "sequence");
        this.f2079a = sequence;
        this.f2080b = i6;
        this.f2081c = i10;
        if (i6 >= 0) {
            if (i10 >= 0) {
                if (i10 >= i6) {
                    return;
                } else {
                    throw new IllegalArgumentException(h8.c.l("endIndex should be not less than startIndex, but was ", " < ", i10, i6).toString());
                }
            }
            throw new IllegalArgumentException(h8.c.i(i10, "endIndex should be non-negative, but is ").toString());
        }
        throw new IllegalArgumentException(h8.c.i(i6, "startIndex should be non-negative, but is ").toString());
    }

    @Override // cf.d
    public final j a(int i6) {
        int i10 = this.f2081c;
        int i11 = this.f2080b;
        if (i6 >= i10 - i11) {
            return this;
        }
        return new s(this.f2079a, i11, i6 + i11);
    }

    @Override // cf.d
    public final j b(int i6) {
        int i10 = this.f2081c;
        int i11 = this.f2080b;
        if (i6 >= i10 - i11) {
            return e.f2054a;
        }
        return new s(this.f2079a, i11 + i6, i10);
    }

    @Override // cf.j
    public final Iterator iterator() {
        return new h(this);
    }
}
