package o9;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class q extends u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f10048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f10050e;

    public q(s sVar, float f, float f4) {
        this.f10048c = sVar;
        this.f10049d = f;
        this.f10050e = f4;
    }

    @Override // o9.u
    public final void a(Matrix matrix, n9.a aVar, int i, Canvas canvas) {
        s sVar = this.f10048c;
        float f = sVar.f10058c;
        float f4 = this.f10050e;
        float f10 = sVar.f10057b;
        float f11 = this.f10049d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f4, f10 - f11), 0.0f);
        Matrix matrix2 = this.f10061a;
        matrix2.set(matrix);
        matrix2.preTranslate(f11, f4);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i10 = aVar.f;
        int[] iArr = n9.a.i;
        iArr[0] = i10;
        iArr[1] = aVar.f9037e;
        iArr[2] = aVar.f9036d;
        Paint paint = aVar.f9035c;
        float f12 = rectF.left;
        paint.setShader(new LinearGradient(f12, rectF.top, f12, rectF.bottom, iArr, n9.a.f9030j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        s sVar = this.f10048c;
        return (float) Math.toDegrees(Math.atan((sVar.f10058c - this.f10050e) / (sVar.f10057b - this.f10049d)));
    }
}
