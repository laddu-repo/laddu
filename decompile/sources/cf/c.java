package cf;

import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements j, d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2051a;

    /* renamed from: b, reason: collision with root package name */
    public final j f2052b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2053c;

    public c(j sequence, int i6, int i10) {
        this.f2051a = i10;
        switch (i10) {
            case 1:
                this.f2052b = sequence;
                this.f2053c = i6;
                if (i6 >= 0) {
                    return;
                }
                throw new IllegalArgumentException(("count must be non-negative, but was " + i6 + '.').toString());
            default:
                kotlin.jvm.internal.k.e(sequence, "sequence");
                this.f2052b = sequence;
                this.f2053c = i6;
                if (i6 >= 0) {
                    return;
                }
                throw new IllegalArgumentException(("count must be non-negative, but was " + i6 + '.').toString());
        }
    }

    @Override // cf.d
    public final j a(int i6) {
        switch (this.f2051a) {
            case 0:
                int i10 = this.f2053c;
                int i11 = i10 + i6;
                if (i11 < 0) {
                    return new c(this, i6, 1);
                }
                return new s(this.f2052b, i10, i11);
            default:
                if (i6 >= this.f2053c) {
                    return this;
                }
                return new c(this.f2052b, i6, 1);
        }
    }

    @Override // cf.d
    public final j b(int i6) {
        switch (this.f2051a) {
            case 0:
                int i10 = this.f2053c + i6;
                if (i10 < 0) {
                    return new c(this, i6, 0);
                }
                return new c(this.f2052b, i10, 0);
            default:
                int i11 = this.f2053c;
                if (i6 >= i11) {
                    return e.f2054a;
                }
                return new s(this.f2052b, i6, i11);
        }
    }

    @Override // cf.j
    public final Iterator iterator() {
        switch (this.f2051a) {
            case 0:
                return new b(this);
            default:
                return new b(this, (byte) 0);
        }
    }
}
