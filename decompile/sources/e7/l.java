package e7;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l extends o7.a {

    /* renamed from: q, reason: collision with root package name */
    public Path f4422q;

    /* renamed from: r, reason: collision with root package name */
    public final o7.a f4423r;

    public l(b7.j jVar, o7.a aVar) {
        super(jVar, (PointF) aVar.f10013b, (PointF) aVar.f10014c, aVar.f10015d, aVar.f10016e, aVar.f10017f, aVar.f10018g, aVar.f10019h);
        this.f4423r = aVar;
        d();
    }

    public final void d() {
        boolean z10;
        Object obj;
        Object obj2 = this.f10014c;
        Object obj3 = this.f10013b;
        if (obj2 != null && obj3 != null && ((PointF) obj3).equals(((PointF) obj2).x, ((PointF) obj2).y)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (obj3 != null && (obj = this.f10014c) != null && !z10) {
            PointF pointF = (PointF) obj3;
            PointF pointF2 = (PointF) obj;
            o7.a aVar = this.f4423r;
            PointF pointF3 = aVar.f10025o;
            PointF pointF4 = aVar.f10026p;
            Matrix matrix = n7.i.f9124a;
            Path path = new Path();
            path.moveTo(pointF.x, pointF.y);
            if (pointF3 != null && pointF4 != null && (pointF3.length() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || pointF4.length() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                float f3 = pointF3.x + pointF.x;
                float f10 = pointF.y + pointF3.y;
                float f11 = pointF2.x;
                float f12 = f11 + pointF4.x;
                float f13 = pointF2.y;
                path.cubicTo(f3, f10, f12, f13 + pointF4.y, f11, f13);
            } else {
                path.lineTo(pointF2.x, pointF2.y);
            }
            this.f4422q = path;
        }
    }
}
