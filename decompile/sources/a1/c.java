package a1;

import android.graphics.Rect;
import java.util.Comparator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements Comparator {
    public final ua.f A;

    /* renamed from: x, reason: collision with root package name */
    public final Rect f128x = new Rect();

    /* renamed from: y, reason: collision with root package name */
    public final Rect f129y = new Rect();

    /* renamed from: z, reason: collision with root package name */
    public final boolean f130z;

    public c(boolean z10, ua.f fVar) {
        this.f130z = z10;
        this.A = fVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.A.getClass();
        Rect rect = this.f128x;
        ((u0.c) obj).f(rect);
        Rect rect2 = this.f129y;
        ((u0.c) obj2).f(rect2);
        int i6 = rect.top;
        int i10 = rect2.top;
        if (i6 >= i10) {
            if (i6 <= i10) {
                int i11 = rect.left;
                int i12 = rect2.left;
                boolean z10 = this.f130z;
                if (i11 < i12) {
                    if (!z10) {
                        return -1;
                    }
                    return 1;
                }
                if (i11 > i12) {
                    if (z10) {
                        return -1;
                    }
                    return 1;
                }
                int i13 = rect.bottom;
                int i14 = rect2.bottom;
                if (i13 >= i14) {
                    if (i13 <= i14) {
                        int i15 = rect.right;
                        int i16 = rect2.right;
                        if (i15 < i16) {
                            if (!z10) {
                                return -1;
                            }
                            return 1;
                        }
                        if (i15 > i16) {
                            if (z10) {
                                return -1;
                            }
                            return 1;
                        }
                        return 0;
                    }
                    return 1;
                }
                return -1;
            }
            return 1;
        }
        return -1;
    }
}
