package g7;

import android.graphics.PointF;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final PointF f5481a;

    /* renamed from: b, reason: collision with root package name */
    public final PointF f5482b;

    /* renamed from: c, reason: collision with root package name */
    public final PointF f5483c;

    public a() {
        this.f5481a = new PointF();
        this.f5482b = new PointF();
        this.f5483c = new PointF();
    }

    public final String toString() {
        PointF pointF = this.f5483c;
        Float valueOf = Float.valueOf(pointF.x);
        Float valueOf2 = Float.valueOf(pointF.y);
        PointF pointF2 = this.f5481a;
        Float valueOf3 = Float.valueOf(pointF2.x);
        Float valueOf4 = Float.valueOf(pointF2.y);
        PointF pointF3 = this.f5482b;
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", valueOf, valueOf2, valueOf3, valueOf4, Float.valueOf(pointF3.x), Float.valueOf(pointF3.y));
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f5481a = pointF;
        this.f5482b = pointF2;
        this.f5483c = pointF3;
    }
}
