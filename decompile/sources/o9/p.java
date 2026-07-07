package o9;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class p extends u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f10047c;

    public p(r rVar) {
        this.f10047c = rVar;
    }

    @Override // o9.u
    public final void a(Matrix matrix, n9.a aVar, int i, Canvas canvas) {
        float f;
        r rVar = this.f10047c;
        float f4 = rVar.f;
        float f10 = rVar.f10056g;
        RectF rectF = new RectF(rVar.f10052b, rVar.f10053c, rVar.f10054d, rVar.f10055e);
        Paint paint = aVar.f9034b;
        boolean z2 = f10 < 0.0f;
        Path path = aVar.f9038g;
        int[] iArr = n9.a.f9031k;
        if (z2) {
            iArr[0] = 0;
            iArr[1] = aVar.f;
            iArr[2] = aVar.f9037e;
            iArr[3] = aVar.f9036d;
            f = 0.0f;
        } else {
            path.rewind();
            f = 0.0f;
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f4, f10);
            path.close();
            float f11 = -i;
            rectF.inset(f11, f11);
            iArr[0] = 0;
            iArr[1] = aVar.f9036d;
            iArr[2] = aVar.f9037e;
            iArr[3] = aVar.f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= f) {
            return;
        }
        float f12 = 1.0f - (i / fWidth);
        float[] fArr = n9.a.f9032l;
        fArr[1] = f12;
        fArr[2] = ((1.0f - f12) / 2.0f) + f12;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z2) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aVar.f9039h);
        }
        canvas.drawArc(rectF, f4, f10, true, paint);
        canvas.restore();
    }
}
