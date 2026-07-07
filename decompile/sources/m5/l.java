package m5;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l extends w5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Path f8471q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w5.a f8472r;

    public l(j5.j jVar, w5.a aVar) {
        super(jVar, (PointF) aVar.f13898b, (PointF) aVar.f13899c, aVar.f13900d, aVar.f13901e, aVar.f, aVar.f13902g, aVar.f13903h);
        this.f8472r = aVar;
        d();
    }

    public final void d() {
        Object obj;
        Object obj2 = this.f13899c;
        Object obj3 = this.f13898b;
        boolean z2 = (obj2 == null || obj3 == null || !((PointF) obj3).equals(((PointF) obj2).x, ((PointF) obj2).y)) ? false : true;
        if (obj3 == null || (obj = this.f13899c) == null || z2) {
            return;
        }
        PointF pointF = (PointF) obj3;
        PointF pointF2 = (PointF) obj;
        w5.a aVar = this.f8472r;
        PointF pointF3 = aVar.f13909o;
        PointF pointF4 = aVar.f13910p;
        Matrix matrix = v5.i.f13208a;
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f = pointF3.x + pointF.x;
            float f4 = pointF.y + pointF3.y;
            float f10 = pointF2.x;
            float f11 = f10 + pointF4.x;
            float f12 = pointF2.y;
            path.cubicTo(f, f4, f11, f12 + pointF4.y, f10, f12);
        }
        this.f8471q = path;
    }
}
