package t5;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ob.d f12284a = ob.d.f("x", "y");

    public static int a(u5.b bVar) {
        bVar.a();
        int iG = (int) (bVar.G() * 255.0d);
        int iG2 = (int) (bVar.G() * 255.0d);
        int iG3 = (int) (bVar.G() * 255.0d);
        while (bVar.B()) {
            bVar.p0();
        }
        bVar.l();
        return Color.argb(255, iG, iG2, iG3);
    }

    public static PointF b(u5.b bVar, float f) {
        int iC = y.e.c(bVar.c0());
        if (iC == 0) {
            bVar.a();
            float fG = (float) bVar.G();
            float fG2 = (float) bVar.G();
            while (bVar.c0() != 2) {
                bVar.p0();
            }
            bVar.l();
            return new PointF(fG * f, fG2 * f);
        }
        if (iC != 2) {
            if (iC != 6) {
                throw new IllegalArgumentException("Unknown point starts with ".concat(u5.a.g(bVar.c0())));
            }
            float fG3 = (float) bVar.G();
            float fG4 = (float) bVar.G();
            while (bVar.B()) {
                bVar.p0();
            }
            return new PointF(fG3 * f, fG4 * f);
        }
        bVar.i();
        float fD = 0.0f;
        float fD2 = 0.0f;
        while (bVar.B()) {
            int iN0 = bVar.n0(f12284a);
            if (iN0 == 0) {
                fD = d(bVar);
            } else if (iN0 != 1) {
                bVar.o0();
                bVar.p0();
            } else {
                fD2 = d(bVar);
            }
        }
        bVar.m();
        return new PointF(fD * f, fD2 * f);
    }

    public static ArrayList c(u5.b bVar, float f) {
        ArrayList arrayList = new ArrayList();
        bVar.a();
        while (bVar.c0() == 1) {
            bVar.a();
            arrayList.add(b(bVar, f));
            bVar.l();
        }
        bVar.l();
        return arrayList;
    }

    public static float d(u5.b bVar) {
        int iC0 = bVar.c0();
        int iC = y.e.c(iC0);
        if (iC != 0) {
            if (iC == 6) {
                return (float) bVar.G();
            }
            throw new IllegalArgumentException("Unknown value for token of type ".concat(u5.a.g(iC0)));
        }
        bVar.a();
        float fG = (float) bVar.G();
        while (bVar.B()) {
            bVar.p0();
        }
        bVar.l();
        return fG;
    }
}
