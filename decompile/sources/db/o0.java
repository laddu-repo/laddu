package db;

import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o0 extends e0 {
    @Override // db.e0
    public final e0 c(Object obj) {
        obj.getClass();
        a(obj);
        return this;
    }

    public final p0 g() {
        int i6 = this.f3996b;
        if (i6 != 0) {
            if (i6 != 1) {
                p0 j = p0.j(i6, this.f3995a);
                this.f3996b = j.size();
                this.f3997c = true;
                return j;
            }
            Object obj = this.f3995a[0];
            Objects.requireNonNull(obj);
            int i10 = p0.f4027z;
            return new o1(obj);
        }
        int i11 = p0.f4027z;
        return i1.G;
    }
}
