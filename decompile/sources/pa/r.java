package pa;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public final e f10708a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f10709b;

    /* renamed from: c, reason: collision with root package name */
    public final Path f10710c;

    /* renamed from: d, reason: collision with root package name */
    public final PathMeasure f10711d;

    /* renamed from: e, reason: collision with root package name */
    public final Matrix f10712e;

    public r(e eVar) {
        Path path = new Path();
        this.f10709b = path;
        this.f10710c = new Path();
        this.f10711d = new PathMeasure(path, false);
        this.f10708a = eVar;
        this.f10712e = new Matrix();
    }

    public static float h(float[] fArr) {
        return (float) Math.toDegrees(Math.atan2(fArr[1], fArr[0]));
    }

    public abstract void a(Canvas canvas, Rect rect, float f3, boolean z10, boolean z11);

    public abstract void b(Canvas canvas, Paint paint, int i6, int i10);

    public abstract void c(Canvas canvas, Paint paint, p pVar, int i6);

    public abstract void d(Canvas canvas, Paint paint, float f3, float f10, int i6, int i10, int i11);

    public abstract int e();

    public abstract int f();

    public abstract void g();
}
