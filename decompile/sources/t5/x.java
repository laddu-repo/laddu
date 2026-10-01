package t5;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class x implements d0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final x f12302v = new x();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final ob.d f12303w = ob.d.f("c", "v", "i", "o");

    @Override // t5.d0
    public final Object a(u5.b bVar, float f) {
        if (bVar.c0() == 1) {
            bVar.a();
        }
        bVar.i();
        ArrayList arrayListC = null;
        ArrayList arrayListC2 = null;
        ArrayList arrayListC3 = null;
        boolean zD = false;
        while (bVar.B()) {
            int iN0 = bVar.n0(f12303w);
            if (iN0 == 0) {
                zD = bVar.D();
            } else if (iN0 == 1) {
                arrayListC = n.c(bVar, f);
            } else if (iN0 == 2) {
                arrayListC2 = n.c(bVar, f);
            } else if (iN0 != 3) {
                bVar.o0();
                bVar.p0();
            } else {
                arrayListC3 = n.c(bVar, f);
            }
        }
        bVar.m();
        if (bVar.c0() == 2) {
            bVar.l();
        }
        if (arrayListC == null || arrayListC2 == null || arrayListC3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (arrayListC.isEmpty()) {
            return new q5.k(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = arrayListC.size();
        PointF pointF = (PointF) arrayListC.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) arrayListC.get(i);
            int i10 = i - 1;
            arrayList.add(new o5.a(v5.g.a((PointF) arrayListC.get(i10), (PointF) arrayListC3.get(i10)), v5.g.a(pointF2, (PointF) arrayListC2.get(i)), pointF2));
        }
        if (zD) {
            PointF pointF3 = (PointF) arrayListC.get(0);
            int i11 = size - 1;
            arrayList.add(new o5.a(v5.g.a((PointF) arrayListC.get(i11), (PointF) arrayListC3.get(i11)), v5.g.a(pointF3, (PointF) arrayListC2.get(0)), pointF3));
        }
        return new q5.k(pointF, zD, arrayList);
    }
}
