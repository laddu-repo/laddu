package ua;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p extends u {

    /* renamed from: c, reason: collision with root package name */
    public final r f13029c;

    public p(r rVar) {
        this.f13029c = rVar;
    }

    @Override // ua.u
    public final void a(Matrix matrix, ta.a aVar, int i6, Canvas canvas) {
        boolean z10;
        char c10;
        r rVar = this.f13029c;
        float f3 = rVar.f13038f;
        float f10 = rVar.f13039g;
        RectF rectF = new RectF(rVar.f13034b, rVar.f13035c, rVar.f13036d, rVar.f13037e);
        Paint paint = aVar.f12701b;
        if (f10 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            z10 = true;
        } else {
            z10 = false;
        }
        Path path = aVar.f12706g;
        int[] iArr = ta.a.f12698k;
        if (z10) {
            iArr[0] = 0;
            iArr[1] = aVar.f12705f;
            iArr[2] = aVar.f12704e;
            iArr[3] = aVar.f12703d;
            c10 = 1;
        } else {
            path.rewind();
            c10 = 1;
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f3, f10);
            path.close();
            float f11 = -i6;
            rectF.inset(f11, f11);
            iArr[0] = 0;
            iArr[1] = aVar.f12703d;
            iArr[2] = aVar.f12704e;
            iArr[3] = aVar.f12705f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        float f12 = 1.0f - (i6 / width);
        float[] fArr = ta.a.f12699l;
        fArr[c10] = f12;
        fArr[2] = ((1.0f - f12) / 2.0f) + f12;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z10) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aVar.f12707h);
        }
        canvas.drawArc(rectF, f3, f10, true, paint);
        canvas.restore();
    }
}
