package m5;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e extends Drawable implements Animatable {
    public static final LinearInterpolator D = new LinearInterpolator();
    public static final l1.a E = new l1.a(1);
    public static final int[] F = {-16777216};
    public final ValueAnimator A;
    public float B;
    public boolean C;

    /* renamed from: x, reason: collision with root package name */
    public final d f8629x;

    /* renamed from: y, reason: collision with root package name */
    public float f8630y;

    /* renamed from: z, reason: collision with root package name */
    public final Resources f8631z;

    public e(Context context) {
        context.getClass();
        this.f8631z = context.getResources();
        d dVar = new d();
        this.f8629x = dVar;
        dVar.f8618i = F;
        dVar.a(0);
        dVar.f8617h = 2.5f;
        dVar.f8611b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat.addUpdateListener(new b(this, dVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(D);
        ofFloat.addListener(new c(this, dVar));
        this.A = ofFloat;
    }

    public static void d(float f3, d dVar) {
        if (f3 > 0.75f) {
            float f10 = (f3 - 0.75f) / 0.25f;
            int[] iArr = dVar.f8618i;
            int i6 = dVar.j;
            int i10 = iArr[i6];
            int i11 = iArr[(i6 + 1) % iArr.length];
            dVar.f8628u = ((((i10 >> 24) & 255) + ((int) ((((i11 >> 24) & 255) - r1) * f10))) << 24) | ((((i10 >> 16) & 255) + ((int) ((((i11 >> 16) & 255) - r3) * f10))) << 16) | ((((i10 >> 8) & 255) + ((int) ((((i11 >> 8) & 255) - r4) * f10))) << 8) | ((i10 & 255) + ((int) (f10 * ((i11 & 255) - r2))));
            return;
        }
        dVar.f8628u = dVar.f8618i[dVar.j];
    }

    public final void a(float f3, d dVar, boolean z10) {
        float interpolation;
        float f10;
        if (this.C) {
            d(f3, dVar);
            float floor = (float) (Math.floor(dVar.f8621m / 0.8f) + 1.0d);
            float f11 = dVar.f8619k;
            float f12 = dVar.f8620l;
            dVar.f8614e = (((f12 - 0.01f) - f11) * f3) + f11;
            dVar.f8615f = f12;
            float f13 = dVar.f8621m;
            dVar.f8616g = h8.c.f(floor, f13, f3, f13);
            return;
        }
        if (f3 == 1.0f && !z10) {
            return;
        }
        float f14 = dVar.f8621m;
        l1.a aVar = E;
        if (f3 < 0.5f) {
            interpolation = dVar.f8619k;
            f10 = (aVar.getInterpolation(f3 / 0.5f) * 0.79f) + 0.01f + interpolation;
        } else {
            float f15 = dVar.f8619k + 0.79f;
            interpolation = f15 - (((1.0f - aVar.getInterpolation((f3 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
            f10 = f15;
        }
        float f16 = (0.20999998f * f3) + f14;
        float f17 = (f3 + this.B) * 216.0f;
        dVar.f8614e = interpolation;
        dVar.f8615f = f10;
        dVar.f8616g = f16;
        this.f8630y = f17;
    }

    public final void b(float f3, float f10, float f11, float f12) {
        float f13 = this.f8631z.getDisplayMetrics().density;
        float f14 = f10 * f13;
        d dVar = this.f8629x;
        dVar.f8617h = f14;
        dVar.f8611b.setStrokeWidth(f14);
        dVar.f8625q = f3 * f13;
        dVar.a(0);
        dVar.f8626r = (int) (f11 * f13);
        dVar.s = (int) (f12 * f13);
    }

    public final void c(int i6) {
        if (i6 == 0) {
            b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f8630y, bounds.exactCenterX(), bounds.exactCenterY());
        d dVar = this.f8629x;
        Paint paint = dVar.f8611b;
        RectF rectF = dVar.f8610a;
        float f3 = dVar.f8625q;
        float f10 = (dVar.f8617h / 2.0f) + f3;
        if (f3 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f10 = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((dVar.f8626r * dVar.f8624p) / 2.0f, dVar.f8617h / 2.0f);
        }
        rectF.set(bounds.centerX() - f10, bounds.centerY() - f10, bounds.centerX() + f10, bounds.centerY() + f10);
        float f11 = dVar.f8614e;
        float f12 = dVar.f8616g;
        float f13 = (f11 + f12) * 360.0f;
        float f14 = ((dVar.f8615f + f12) * 360.0f) - f13;
        paint.setColor(dVar.f8628u);
        paint.setAlpha(dVar.f8627t);
        float f15 = dVar.f8617h / 2.0f;
        rectF.inset(f15, f15);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, dVar.f8613d);
        float f16 = -f15;
        rectF.inset(f16, f16);
        canvas.drawArc(rectF, f13, f14, false, paint);
        Paint paint2 = dVar.f8612c;
        if (dVar.f8622n) {
            Path path = dVar.f8623o;
            if (path == null) {
                Path path2 = new Path();
                dVar.f8623o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f17 = (dVar.f8626r * dVar.f8624p) / 2.0f;
            dVar.f8623o.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            dVar.f8623o.lineTo(dVar.f8626r * dVar.f8624p, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Path path3 = dVar.f8623o;
            float f18 = dVar.f8626r;
            float f19 = dVar.f8624p;
            path3.lineTo((f18 * f19) / 2.0f, dVar.s * f19);
            dVar.f8623o.offset((rectF.centerX() + min) - f17, (dVar.f8617h / 2.0f) + rectF.centerY());
            dVar.f8623o.close();
            paint2.setColor(dVar.f8628u);
            paint2.setAlpha(dVar.f8627t);
            canvas.save();
            canvas.rotate(f13 + f14, rectF.centerX(), rectF.centerY());
            canvas.drawPath(dVar.f8623o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f8629x.f8627t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.A.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i6) {
        this.f8629x.f8627t = i6;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f8629x.f8611b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.A.cancel();
        d dVar = this.f8629x;
        float f3 = dVar.f8614e;
        dVar.f8619k = f3;
        float f10 = dVar.f8615f;
        dVar.f8620l = f10;
        dVar.f8621m = dVar.f8616g;
        if (f10 != f3) {
            this.C = true;
            this.A.setDuration(666L);
            this.A.start();
            return;
        }
        dVar.a(0);
        dVar.f8619k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        dVar.f8620l = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        dVar.f8621m = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        dVar.f8614e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        dVar.f8615f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        dVar.f8616g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.A.setDuration(1332L);
        this.A.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.A.cancel();
        this.f8630y = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        d dVar = this.f8629x;
        if (dVar.f8622n) {
            dVar.f8622n = false;
        }
        dVar.a(0);
        dVar.f8619k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        dVar.f8620l = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        dVar.f8621m = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        dVar.f8614e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        dVar.f8615f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        dVar.f8616g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        invalidateSelf();
    }
}
