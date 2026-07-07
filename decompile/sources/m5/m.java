package m5;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m extends k {
    public final PointF i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f8473j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float[] f8474k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PathMeasure f8475l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public l f8476m;

    public m(ArrayList arrayList) {
        super(arrayList);
        this.i = new PointF();
        this.f8473j = new float[2];
        this.f8474k = new float[2];
        this.f8475l = new PathMeasure();
    }

    @Override // m5.e
    public final Object f(w5.a aVar, float f) {
        float f4;
        l lVar = (l) aVar;
        Path path = lVar.f8471q;
        p2.c cVar = this.f8459e;
        if (cVar == null || aVar.f13903h == null) {
            f4 = f;
        } else {
            f4 = f;
            PointF pointF = (PointF) cVar.m(lVar.f13902g, lVar.f13903h.floatValue(), (PointF) lVar.f13898b, (PointF) lVar.f13899c, d(), f4, this.f8458d);
            if (pointF != null) {
                return pointF;
            }
        }
        if (path == null) {
            return (PointF) aVar.f13898b;
        }
        l lVar2 = this.f8476m;
        PathMeasure pathMeasure = this.f8475l;
        if (lVar2 != lVar) {
            pathMeasure.setPath(path, false);
            this.f8476m = lVar;
        }
        float length = pathMeasure.getLength();
        float f10 = f4 * length;
        float[] fArr = this.f8473j;
        float[] fArr2 = this.f8474k;
        pathMeasure.getPosTan(f10, fArr, fArr2);
        float f11 = fArr[0];
        float f12 = fArr[1];
        PointF pointF2 = this.i;
        pointF2.set(f11, f12);
        if (f10 < 0.0f) {
            pointF2.offset(fArr2[0] * f10, fArr2[1] * f10);
            return pointF2;
        }
        if (f10 > length) {
            float f13 = f10 - length;
            pointF2.offset(fArr2[0] * f13, fArr2[1] * f13);
        }
        return pointF2;
    }
}
