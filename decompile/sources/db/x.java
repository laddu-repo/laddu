package db;

import java.util.Comparator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x extends z {
    public static z f(int i6) {
        if (i6 < 0) {
            return z.f4061b;
        }
        if (i6 > 0) {
            return z.f4062c;
        }
        return z.f4060a;
    }

    @Override // db.z
    public final z a(int i6, int i10) {
        return f(Integer.compare(i6, i10));
    }

    @Override // db.z
    public final z b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // db.z
    public final z c(boolean z10, boolean z11) {
        return f(Boolean.compare(z10, z11));
    }

    @Override // db.z
    public final z d(boolean z10, boolean z11) {
        return f(Boolean.compare(z11, z10));
    }

    @Override // db.z
    public final int e() {
        return 0;
    }
}
