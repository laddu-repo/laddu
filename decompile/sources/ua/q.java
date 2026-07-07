package ua;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q extends u {

    /* renamed from: c, reason: collision with root package name */
    public final s f13030c;

    /* renamed from: d, reason: collision with root package name */
    public final float f13031d;

    /* renamed from: e, reason: collision with root package name */
    public final float f13032e;

    public q(s sVar, float f3, float f10) {
        this.f13030c = sVar;
        this.f13031d = f3;
        this.f13032e = f10;
    }

    @Override // ua.u
    public final void a(Matrix matrix, ta.a aVar, int i6, Canvas canvas) {
        s sVar = this.f13030c;
        float f3 = sVar.f13041c;
        float f10 = this.f13032e;
        float f11 = sVar.f13040b;
        float f12 = this.f13031d;
        RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (float) Math.hypot(f3 - f10, f11 - f12), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Matrix matrix2 = this.f13044a;
        matrix2.set(matrix);
        matrix2.preTranslate(f12, f10);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i6;
        rectF.offset(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -i6);
        int i10 = aVar.f12705f;
        int[] iArr = ta.a.f12697i;
        iArr[0] = i10;
        iArr[1] = aVar.f12704e;
        iArr[2] = aVar.f12703d;
        Paint paint = aVar.f12702c;
        float f13 = rectF.left;
        paint.setShader(new LinearGradient(f13, rectF.top, f13, rectF.bottom, iArr, ta.a.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        s sVar = this.f13030c;
        return (float) Math.toDegrees(Math.atan((sVar.f13041c - this.f13032e) / (sVar.f13040b - this.f13031d)));
    }
}
