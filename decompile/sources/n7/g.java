package n7;

import android.graphics.Path;
import android.graphics.PointF;
import d7.l;
import i7.k;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final PointF f9099a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f3, float f10, float f11) {
        return Math.max(f10, Math.min(f11, f3));
    }

    public static int c(int i6) {
        return Math.max(0, Math.min(255, i6));
    }

    public static int d(float f3, float f10) {
        boolean z10;
        int i6 = (int) f3;
        int i10 = (int) f10;
        int i11 = i6 / i10;
        if ((i6 ^ i10) >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i12 = i6 % i10;
        if (!z10 && i12 != 0) {
            i11--;
        }
        return i6 - (i10 * i11);
    }

    public static void e(k kVar, Path path) {
        Path path2;
        path.reset();
        PointF pointF = kVar.f6676b;
        ArrayList arrayList = kVar.f6675a;
        path.moveTo(pointF.x, pointF.y);
        float f3 = pointF.x;
        float f10 = pointF.y;
        PointF pointF2 = f9099a;
        pointF2.set(f3, f10);
        int i6 = 0;
        while (i6 < arrayList.size()) {
            g7.a aVar = (g7.a) arrayList.get(i6);
            PointF pointF3 = aVar.f5481a;
            PointF pointF4 = aVar.f5482b;
            PointF pointF5 = aVar.f5483c;
            if (pointF3.equals(pointF2) && pointF4.equals(pointF5)) {
                path.lineTo(pointF5.x, pointF5.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            }
            pointF2.set(pointF5.x, pointF5.y);
            i6++;
            path = path2;
        }
        Path path3 = path;
        if (kVar.f6677c) {
            path3.close();
        }
    }

    public static float f(float f3, float f10, float f11) {
        return h8.c.f(f10, f3, f11, f3);
    }

    public static void g(g7.e eVar, int i6, ArrayList arrayList, g7.e eVar2, l lVar) {
        if (eVar.a(i6, lVar.getName())) {
            String name = lVar.getName();
            g7.e eVar3 = new g7.e(eVar2);
            eVar3.f5506a.add(name);
            g7.e eVar4 = new g7.e(eVar3);
            eVar4.f5507b = lVar;
            arrayList.add(eVar4);
        }
    }
}
