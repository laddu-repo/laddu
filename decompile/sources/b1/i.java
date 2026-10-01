package b1;

import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i {
    public static g0 a(l lVar, k7.c cVar, List list, mf.e eVar, ve.a aVar, int i6) {
        le.c cVar2 = null;
        b bVar = cVar;
        if ((i6 & 2) != 0) {
            bVar = null;
        }
        if ((i6 & 4) != 0) {
            list = ie.r.f6846x;
        }
        if (bVar == null) {
            bVar = new ua.f(6);
        }
        return new g0(aVar, lVar, a8.g.m(new androidx.lifecycle.c(list, cVar2, 2)), bVar, eVar);
    }
}
