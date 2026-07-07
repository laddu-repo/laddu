package l7;

import android.graphics.Color;
import android.graphics.PointF;
import com.unity3d.services.UnityAdsConstants;
import j1.f0;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final f0 f8288a = f0.V("x", "y");

    public static int a(m7.a aVar) {
        aVar.d();
        int S = (int) (aVar.S() * 255.0d);
        int S2 = (int) (aVar.S() * 255.0d);
        int S3 = (int) (aVar.S() * 255.0d);
        while (aVar.K()) {
            aVar.j0();
        }
        aVar.l();
        return Color.argb(255, S, S2, S3);
    }

    public static PointF b(m7.a aVar, float f3) {
        int c10 = y.e.c(aVar.f0());
        if (c10 != 0) {
            if (c10 != 2) {
                if (c10 == 6) {
                    float S = (float) aVar.S();
                    float S2 = (float) aVar.S();
                    while (aVar.K()) {
                        aVar.j0();
                    }
                    return new PointF(S * f3, S2 * f3);
                }
                throw new IllegalArgumentException("Unknown point starts with ".concat(h8.c.w(aVar.f0())));
            }
            aVar.f();
            float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float f11 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            while (aVar.K()) {
                int h02 = aVar.h0(f8288a);
                if (h02 != 0) {
                    if (h02 != 1) {
                        aVar.i0();
                        aVar.j0();
                    } else {
                        f11 = d(aVar);
                    }
                } else {
                    f10 = d(aVar);
                }
            }
            aVar.m();
            return new PointF(f10 * f3, f11 * f3);
        }
        aVar.d();
        float S3 = (float) aVar.S();
        float S4 = (float) aVar.S();
        while (aVar.f0() != 2) {
            aVar.j0();
        }
        aVar.l();
        return new PointF(S3 * f3, S4 * f3);
    }

    public static ArrayList c(m7.a aVar, float f3) {
        ArrayList arrayList = new ArrayList();
        aVar.d();
        while (aVar.f0() == 1) {
            aVar.d();
            arrayList.add(b(aVar, f3));
            aVar.l();
        }
        aVar.l();
        return arrayList;
    }

    public static float d(m7.a aVar) {
        int f02 = aVar.f0();
        int c10 = y.e.c(f02);
        if (c10 != 0) {
            if (c10 == 6) {
                return (float) aVar.S();
            }
            throw new IllegalArgumentException("Unknown value for token of type ".concat(h8.c.w(f02)));
        }
        aVar.d();
        float S = (float) aVar.S();
        while (aVar.K()) {
            aVar.j0();
        }
        aVar.l();
        return S;
    }
}
