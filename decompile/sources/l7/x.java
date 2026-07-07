package l7;

import android.graphics.PointF;
import j1.f0;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x implements d0 {

    /* renamed from: x, reason: collision with root package name */
    public static final x f8306x = new Object();

    /* renamed from: y, reason: collision with root package name */
    public static final f0 f8307y = f0.V("c", "v", "i", "o");

    @Override // l7.d0
    public final Object a(m7.a aVar, float f3) {
        if (aVar.f0() == 1) {
            aVar.d();
        }
        aVar.f();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        boolean z10 = false;
        while (aVar.K()) {
            int h02 = aVar.h0(f8307y);
            if (h02 != 0) {
                if (h02 != 1) {
                    if (h02 != 2) {
                        if (h02 != 3) {
                            aVar.i0();
                            aVar.j0();
                        } else {
                            arrayList3 = n.c(aVar, f3);
                        }
                    } else {
                        arrayList2 = n.c(aVar, f3);
                    }
                } else {
                    arrayList = n.c(aVar, f3);
                }
            } else {
                z10 = aVar.Q();
            }
        }
        aVar.m();
        if (aVar.f0() == 2) {
            aVar.l();
        }
        if (arrayList != null && arrayList2 != null && arrayList3 != null) {
            if (arrayList.isEmpty()) {
                return new i7.k(new PointF(), false, Collections.EMPTY_LIST);
            }
            int size = arrayList.size();
            PointF pointF = (PointF) arrayList.get(0);
            ArrayList arrayList4 = new ArrayList(size);
            for (int i6 = 1; i6 < size; i6++) {
                PointF pointF2 = (PointF) arrayList.get(i6);
                int i10 = i6 - 1;
                arrayList4.add(new g7.a(n7.g.a((PointF) arrayList.get(i10), (PointF) arrayList3.get(i10)), n7.g.a(pointF2, (PointF) arrayList2.get(i6)), pointF2));
            }
            if (z10) {
                PointF pointF3 = (PointF) arrayList.get(0);
                int i11 = size - 1;
                arrayList4.add(new g7.a(n7.g.a((PointF) arrayList.get(i11), (PointF) arrayList3.get(i11)), n7.g.a(pointF3, (PointF) arrayList2.get(0)), pointF3));
            }
            return new i7.k(pointF, z10, arrayList4);
        }
        throw new IllegalArgumentException("Shape data was missing information.");
    }
}
