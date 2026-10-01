package b0;

import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public o f1250a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f1251b;

    public static long a(f fVar, long j) {
        o oVar = fVar.f1239d;
        ArrayList arrayList = fVar.f1245k;
        if (oVar instanceof j) {
            return j;
        }
        int size = arrayList.size();
        long j10 = j;
        for (int i6 = 0; i6 < size; i6++) {
            d dVar = (d) arrayList.get(i6);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f1239d != oVar) {
                    j10 = Math.min(j10, a(fVar2, fVar2.f1241f + j));
                }
            }
        }
        f fVar3 = oVar.f1268i;
        f fVar4 = oVar.f1267h;
        if (fVar == fVar3) {
            long j11 = j - oVar.j();
            return Math.min(Math.min(j10, a(fVar4, j11)), j11 - fVar4.f1241f);
        }
        return j10;
    }

    public static long b(f fVar, long j) {
        o oVar = fVar.f1239d;
        ArrayList arrayList = fVar.f1245k;
        if (oVar instanceof j) {
            return j;
        }
        int size = arrayList.size();
        long j10 = j;
        for (int i6 = 0; i6 < size; i6++) {
            d dVar = (d) arrayList.get(i6);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f1239d != oVar) {
                    j10 = Math.max(j10, b(fVar2, fVar2.f1241f + j));
                }
            }
        }
        f fVar3 = oVar.f1267h;
        f fVar4 = oVar.f1268i;
        if (fVar == fVar3) {
            long j11 = oVar.j() + j;
            return Math.max(Math.max(j10, b(fVar4, j11)), j11 - fVar4.f1241f);
        }
        return j10;
    }
}
