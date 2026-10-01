package db;

import java.io.Serializable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class z0 extends a1 implements Serializable {

    /* renamed from: y, reason: collision with root package name */
    public static final z0 f4063y = new z0(0);

    /* renamed from: z, reason: collision with root package name */
    public static final z0 f4064z = new z0(1);

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f4065x;

    public /* synthetic */ z0(int i6) {
        this.f4065x = i6;
    }

    @Override // db.a1
    public final a1 a() {
        switch (this.f4065x) {
            case 0:
                return f4064z;
            default:
                return f4063y;
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f4065x) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                if (comparable3 == comparable4) {
                    return 0;
                }
                return comparable4.compareTo(comparable3);
        }
    }

    public final String toString() {
        switch (this.f4065x) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
