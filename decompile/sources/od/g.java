package od;

import java.util.Comparator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g implements Comparator {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f10082x;

    public /* synthetic */ g(int i6) {
        this.f10082x = i6;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        boolean z10;
        switch (this.f10082x) {
            case 0:
                return a8.g.d(((a) ((he.i) obj2).f6077y).f10047b, ((a) ((he.i) obj).f6077y).f10047b);
            default:
                boolean z11 = false;
                if (((kd.u) obj).C.E <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Boolean valueOf = Boolean.valueOf(z10);
                if (((kd.u) obj2).C.E <= 0) {
                    z11 = true;
                }
                return a8.g.d(valueOf, Boolean.valueOf(z11));
        }
    }
}
