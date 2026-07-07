package e7;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.unity3d.services.UnityAdsConstants;
import j1.f0;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m extends k {

    /* renamed from: i, reason: collision with root package name */
    public final PointF f4424i;
    public final float[] j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f4425k;

    /* renamed from: l, reason: collision with root package name */
    public final PathMeasure f4426l;

    /* renamed from: m, reason: collision with root package name */
    public l f4427m;

    public m(ArrayList arrayList) {
        super(arrayList);
        this.f4424i = new PointF();
        this.j = new float[2];
        this.f4425k = new float[2];
        this.f4426l = new PathMeasure();
    }

    @Override // e7.e
    public final Object f(o7.a aVar, float f3) {
        float f10;
        l lVar = (l) aVar;
        Path path = lVar.f4422q;
        f0 f0Var = this.f4408e;
        if (f0Var != null && aVar.f10019h != null) {
            f10 = f3;
            PointF pointF = (PointF) f0Var.U(lVar.f10018g, lVar.f10019h.floatValue(), (PointF) lVar.f10013b, (PointF) lVar.f10014c, d(), f10, this.f4407d);
            if (pointF != null) {
                return pointF;
            }
        } else {
            f10 = f3;
        }
        if (path == null) {
            return (PointF) aVar.f10013b;
        }
        l lVar2 = this.f4427m;
        PathMeasure pathMeasure = this.f4426l;
        if (lVar2 != lVar) {
            pathMeasure.setPath(path, false);
            this.f4427m = lVar;
        }
        float length = pathMeasure.getLength();
        float f11 = f10 * length;
        float[] fArr = this.j;
        float[] fArr2 = this.f4425k;
        pathMeasure.getPosTan(f11, fArr, fArr2);
        float f12 = fArr[0];
        float f13 = fArr[1];
        PointF pointF2 = this.f4424i;
        pointF2.set(f12, f13);
        if (f11 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            pointF2.offset(fArr2[0] * f11, fArr2[1] * f11);
            return pointF2;
        }
        if (f11 > length) {
            float f14 = f11 - length;
            pointF2.offset(fArr2[0] * f14, fArr2[1] * f14);
        }
        return pointF2;
    }
}
