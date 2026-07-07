package ua;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r extends t {

    /* renamed from: h, reason: collision with root package name */
    public static final RectF f13033h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f13034b;

    /* renamed from: c, reason: collision with root package name */
    public final float f13035c;

    /* renamed from: d, reason: collision with root package name */
    public final float f13036d;

    /* renamed from: e, reason: collision with root package name */
    public final float f13037e;

    /* renamed from: f, reason: collision with root package name */
    public float f13038f;

    /* renamed from: g, reason: collision with root package name */
    public float f13039g;

    public r(float f3, float f10, float f11, float f12) {
        this.f13034b = f3;
        this.f13035c = f10;
        this.f13036d = f11;
        this.f13037e = f12;
    }

    @Override // ua.t
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f13042a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f3 = this.f13036d;
        float f10 = this.f13037e;
        RectF rectF = f13033h;
        rectF.set(this.f13034b, this.f13035c, f3, f10);
        path.arcTo(rectF, this.f13038f, this.f13039g, false);
        path.transform(matrix);
    }
}
