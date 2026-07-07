package od;

import java.util.Comparator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h implements Comparator {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f10086x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Comparator f10087y;

    public /* synthetic */ h(Comparator comparator, int i6) {
        this.f10086x = i6;
        this.f10087y = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f10086x) {
            case 0:
                int compare = ((h) this.f10087y).compare(obj, obj2);
                if (compare == 0) {
                    return a8.g.d(((a) ((he.i) obj).f6077y).f10048c, ((a) ((he.i) obj2).f6077y).f10048c);
                }
                return compare;
            default:
                int compare2 = ((g) this.f10087y).compare(obj, obj2);
                if (compare2 == 0) {
                    return a8.g.d(((a) ((he.i) obj2).f6077y).f10046a, ((a) ((he.i) obj).f6077y).f10046a);
                }
                return compare2;
        }
    }
}
