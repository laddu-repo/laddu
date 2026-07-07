package g9;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e implements TypeEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f5760a = new float[9];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f5761b = new float[9];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f5762c = new Matrix();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f5763d;

    public e(g gVar) {
        this.f5763d = gVar;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        this.f5763d.f5779p = f;
        float[] fArr = this.f5760a;
        ((Matrix) obj).getValues(fArr);
        float[] fArr2 = this.f5761b;
        ((Matrix) obj2).getValues(fArr2);
        for (int i = 0; i < 9; i++) {
            float f4 = fArr2[i];
            float f10 = fArr[i];
            fArr2[i] = j4.a.g(f4, f10, f, f10);
        }
        Matrix matrix = this.f5762c;
        matrix.setValues(fArr2);
        return matrix;
    }
}
