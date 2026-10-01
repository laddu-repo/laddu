package j7;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import b7.c0;
import b7.y;
import com.unity3d.services.UnityAdsConstants;
import e7.s;
import j1.f0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g extends a {
    public final RectF D;
    public final c7.a E;
    public final float[] F;
    public final Path G;
    public final d H;
    public s I;
    public s J;

    public g(y yVar, d dVar) {
        super(yVar, dVar);
        this.D = new RectF();
        c7.a aVar = new c7.a();
        this.E = aVar;
        this.F = new float[8];
        this.G = new Path();
        this.H = dVar;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(dVar.f7276l);
    }

    @Override // j7.a, g7.f
    public final void d(f0 f0Var, Object obj) {
        super.d(f0Var, obj);
        if (obj == c0.I) {
            this.I = new s(f0Var, null);
        } else if (obj == 1) {
            this.J = new s(f0Var, null);
        }
    }

    @Override // j7.a, d7.f
    public final void e(RectF rectF, Matrix matrix, boolean z10) {
        super.e(rectF, matrix, z10);
        d dVar = this.H;
        float f3 = dVar.j;
        float f10 = dVar.f7275k;
        RectF rectF2 = this.D;
        rectF2.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, f10);
        this.f7254n.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // j7.a
    public final void k(Canvas canvas, Matrix matrix, int i6, n7.a aVar) {
        Integer num;
        int intValue;
        d dVar = this.H;
        int alpha = Color.alpha(dVar.f7276l);
        if (alpha != 0) {
            s sVar = this.J;
            if (sVar == null) {
                num = null;
            } else {
                num = (Integer) sVar.e();
            }
            c7.a aVar2 = this.E;
            if (num != null) {
                aVar2.setColor(num.intValue());
            } else {
                aVar2.setColor(dVar.f7276l);
            }
            e7.e eVar = this.f7262w.f4453p;
            if (eVar == null) {
                intValue = 100;
            } else {
                intValue = ((Integer) eVar.e()).intValue();
            }
            int i10 = (int) ((((alpha / 255.0f) * intValue) / 100.0f) * (i6 / 255.0f) * 255.0f);
            aVar2.setAlpha(i10);
            if (aVar != null) {
                if (Color.alpha(aVar.f9087d) > 0) {
                    aVar2.setShadowLayer(Math.max(aVar.f9084a, Float.MIN_VALUE), aVar.f9085b, aVar.f9086c, aVar.f9087d);
                } else {
                    aVar2.clearShadowLayer();
                }
            } else {
                aVar2.clearShadowLayer();
            }
            s sVar2 = this.I;
            if (sVar2 != null) {
                aVar2.setColorFilter((ColorFilter) sVar2.e());
            }
            if (i10 > 0) {
                float[] fArr = this.F;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                float f3 = dVar.j;
                fArr[2] = f3;
                fArr[3] = 0.0f;
                fArr[4] = f3;
                float f10 = dVar.f7275k;
                fArr[5] = f10;
                fArr[6] = 0.0f;
                fArr[7] = f10;
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
}
