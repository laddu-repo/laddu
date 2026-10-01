package od;

import java.util.Comparator;
import java.util.Date;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class w implements Comparator {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f10156x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ x f10157y;

    public w(g gVar, x xVar) {
        this.f10156x = gVar;
        this.f10157y = xVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Long l10;
        long j = 0L;
        int compare = this.f10156x.compare(obj, obj2);
        if (compare != 0) {
            return compare;
        }
        x xVar = this.f10157y;
        Date parse = xVar.i().parse(((kd.u) obj2).C.C);
        if (parse != null) {
            l10 = Long.valueOf(parse.getTime());
        } else {
            l10 = 0L;
        }
        Date parse2 = xVar.i().parse(((kd.u) obj).C.C);
        if (parse2 != null) {
            j = Long.valueOf(parse2.getTime());
        }
        return a8.g.d(l10, j);
    }
}
