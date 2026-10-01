package o9;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class r extends t {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final RectF f10051h = new RectF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f10055e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f10056g;

    public r(float f, float f4, float f10, float f11) {
        this.f10052b = f;
        this.f10053c = f4;
        this.f10054d = f10;
        this.f10055e = f11;
    }

    @Override // o9.t
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f10059a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f = this.f10054d;
        float f4 = this.f10055e;
        RectF rectF = f10051h;
        rectF.set(this.f10052b, this.f10053c, f, f4);
        path.arcTo(rectF, this.f, this.f10056g, false);
        path.transform(matrix);
    }
}
