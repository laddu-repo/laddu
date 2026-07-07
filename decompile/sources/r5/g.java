package r5;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import j5.a0;
import j5.w;
import m5.s;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g extends a {
    public final RectF D;
    public final k5.a E;
    public final float[] F;
    public final Path G;
    public final d H;
    public s I;
    public s J;

    public g(w wVar, d dVar) {
        super(wVar, dVar);
        this.D = new RectF();
        k5.a aVar = new k5.a();
        this.E = aVar;
        this.F = new float[8];
        this.G = new Path();
        this.H = dVar;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(dVar.f11273l);
    }

    @Override // r5.a, l5.f
    public final void a(RectF rectF, Matrix matrix, boolean z2) {
        super.a(rectF, matrix, z2);
        d dVar = this.H;
        float f = dVar.f11271j;
        float f4 = dVar.f11272k;
        RectF rectF2 = this.D;
        rectF2.set(0.0f, 0.0f, f, f4);
        this.f11251n.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // r5.a, o5.f
    public final void g(Object obj, p2.c cVar) {
        super.g(obj, cVar);
        if (obj == a0.I) {
            this.I = new s(null, cVar);
        } else if (obj == 1) {
            this.J = new s(null, cVar);
        }
    }

    @Override // r5.a
    public final void k(Canvas canvas, Matrix matrix, int i, v5.a aVar) {
        d dVar = this.H;
        int iAlpha = Color.alpha(dVar.f11273l);
        if (iAlpha == 0) {
            return;
        }
        s sVar = this.J;
        Integer num = sVar == null ? null : (Integer) sVar.e();
        k5.a aVar2 = this.E;
        if (num != null) {
            aVar2.setColor(num.intValue());
        } else {
            aVar2.setColor(dVar.f11273l);
        }
        int iIntValue = (int) ((((iAlpha / 255.0f) * (this.f11260w.f8503p == null ? 100 : ((Integer) r2.e()).intValue())) / 100.0f) * (i / 255.0f) * 255.0f);
        aVar2.setAlpha(iIntValue);
        if (aVar == null || Color.alpha(aVar.f13169d) <= 0) {
            aVar2.clearShadowLayer();
        } else {
            aVar2.setShadowLayer(Math.max(aVar.f13166a, Float.MIN_VALUE), aVar.f13167b, aVar.f13168c, aVar.f13169d);
        }
        s sVar2 = this.I;
        if (sVar2 != null) {
            aVar2.setColorFilter((ColorFilter) sVar2.e());
        }
        if (iIntValue > 0) {
            float[] fArr = this.F;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f = dVar.f11271j;
            fArr[2] = f;
            fArr[3] = 0.0f;
            fArr[4] = f;
            float f4 = dVar.f11272k;
            fArr[5] = f4;
            fArr[6] = 0.0f;
            fArr[7] = f4;
            matrix.mapPoints(fArr);
            Path path = this.G;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, aVar2);
        }
    }
}
