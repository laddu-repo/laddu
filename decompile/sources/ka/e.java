package ka;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f7774a = new float[9];

    /* renamed from: b, reason: collision with root package name */
    public final float[] f7775b = new float[9];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f7776c = new Matrix();

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f7777d;

    public e(h hVar) {
        this.f7777d = hVar;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f3, Object obj, Object obj2) {
        this.f7777d.f7796p = f3;
        float[] fArr = this.f7774a;
        ((Matrix) obj).getValues(fArr);
        float[] fArr2 = this.f7775b;
        ((Matrix) obj2).getValues(fArr2);
        for (int i6 = 0; i6 < 9; i6++) {
            float f10 = fArr2[i6];
            float f11 = fArr[i6];
            fArr2[i6] = h8.c.f(f10, f11, f3, f11);
        }
        Matrix matrix = this.f7776c;
        matrix.setValues(fArr2);
        return matrix;
    }
}
