package c5;

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

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e extends Drawable implements Animatable {
    public static final LinearInterpolator B = new LinearInterpolator();
    public static final o1.a C = new o1.a(1);
    public static final int[] D = {-16777216};
    public boolean A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final d f2128v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f2129w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Resources f2130x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ValueAnimator f2131y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f2132z;

    public e(Context context) {
        context.getClass();
        this.f2130x = context.getResources();
        d dVar = new d();
        this.f2128v = dVar;
        dVar.i = D;
        dVar.a(0);
        dVar.f2115h = 2.5f;
        dVar.f2110b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new b(this, dVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(B);
        valueAnimatorOfFloat.addListener(new c(this, dVar));
        this.f2131y = valueAnimatorOfFloat;
    }

    public static void d(float f, d dVar) {
        if (f <= 0.75f) {
            dVar.f2127u = dVar.i[dVar.f2116j];
            return;
        }
        float f4 = (f - 0.75f) / 0.25f;
        int[] iArr = dVar.i;
        int i = dVar.f2116j;
        int i10 = iArr[i];
        int i11 = iArr[(i + 1) % iArr.length];
        dVar.f2127u = ((((i10 >> 24) & 255) + ((int) ((((i11 >> 24) & 255) - r1) * f4))) << 24) | ((((i10 >> 16) & 255) + ((int) ((((i11 >> 16) & 255) - r3) * f4))) << 16) | ((((i10 >> 8) & 255) + ((int) ((((i11 >> 8) & 255) - r4) * f4))) << 8) | ((i10 & 255) + ((int) (f4 * ((i11 & 255) - r2))));
    }

    public final void a(float f, d dVar, boolean z2) {
        float interpolation;
        float interpolation2;
        if (this.A) {
            d(f, dVar);
            float fFloor = (float) (Math.floor(dVar.f2119m / 0.8f) + 1.0d);
            float f4 = dVar.f2117k;
            float f10 = dVar.f2118l;
            dVar.f2113e = (((f10 - 0.01f) - f4) * f) + f4;
            dVar.f = f10;
            float f11 = dVar.f2119m;
            dVar.f2114g = j4.a.g(fFloor, f11, f, f11);
            return;
        }
        if (f != 1.0f || z2) {
            float f12 = dVar.f2119m;
            o1.a aVar = C;
            if (f < 0.5f) {
                interpolation = dVar.f2117k;
                interpolation2 = (aVar.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f13 = dVar.f2117k + 0.79f;
                interpolation = f13 - (((1.0f - aVar.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = f13;
            }
            float f14 = (0.20999998f * f) + f12;
            float f15 = (f + this.f2132z) * 216.0f;
            dVar.f2113e = interpolation;
            dVar.f = interpolation2;
            dVar.f2114g = f14;
            this.f2129w = f15;
        }
    }

    public final void b(float f, float f4, float f10, float f11) {
        float f12 = this.f2130x.getDisplayMetrics().density;
        float f13 = f4 * f12;
        d dVar = this.f2128v;
        dVar.f2115h = f13;
        dVar.f2110b.setStrokeWidth(f13);
        dVar.f2123q = f * f12;
        dVar.a(0);
        dVar.f2124r = (int) (f10 * f12);
        dVar.f2125s = (int) (f11 * f12);
    }

    public final void c(int i) {
        if (i == 0) {
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
        canvas.rotate(this.f2129w, bounds.exactCenterX(), bounds.exactCenterY());
        d dVar = this.f2128v;
        Paint paint = dVar.f2110b;
        RectF rectF = dVar.f2109a;
        float f = dVar.f2123q;
        float fMin = (dVar.f2115h / 2.0f) + f;
        if (f <= 0.0f) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((dVar.f2124r * dVar.f2122p) / 2.0f, dVar.f2115h / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f4 = dVar.f2113e;
        float f10 = dVar.f2114g;
        float f11 = (f4 + f10) * 360.0f;
        float f12 = ((dVar.f + f10) * 360.0f) - f11;
        paint.setColor(dVar.f2127u);
        paint.setAlpha(dVar.f2126t);
        float f13 = dVar.f2115h / 2.0f;
        rectF.inset(f13, f13);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, dVar.f2112d);
        float f14 = -f13;
        rectF.inset(f14, f14);
        canvas.drawArc(rectF, f11, f12, false, paint);
        Paint paint2 = dVar.f2111c;
        if (dVar.f2120n) {
            Path path = dVar.f2121o;
            if (path == null) {
                Path path2 = new Path();
                dVar.f2121o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f15 = (dVar.f2124r * dVar.f2122p) / 2.0f;
            dVar.f2121o.moveTo(0.0f, 0.0f);
            dVar.f2121o.lineTo(dVar.f2124r * dVar.f2122p, 0.0f);
            Path path3 = dVar.f2121o;
            float f16 = dVar.f2124r;
            float f17 = dVar.f2122p;
            path3.lineTo((f16 * f17) / 2.0f, dVar.f2125s * f17);
            dVar.f2121o.offset((rectF.centerX() + fMin2) - f15, (dVar.f2115h / 2.0f) + rectF.centerY());
            dVar.f2121o.close();
            paint2.setColor(dVar.f2127u);
            paint2.setAlpha(dVar.f2126t);
            canvas.save();
            canvas.rotate(f11 + f12, rectF.centerX(), rectF.centerY());
            canvas.drawPath(dVar.f2121o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f2128v.f2126t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f2131y.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f2128v.f2126t = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f2128v.f2110b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f2131y.cancel();
        d dVar = this.f2128v;
        float f = dVar.f2113e;
        dVar.f2117k = f;
        float f4 = dVar.f;
        dVar.f2118l = f4;
        dVar.f2119m = dVar.f2114g;
        if (f4 != f) {
            this.A = true;
            this.f2131y.setDuration(666L);
            this.f2131y.start();
            return;
        }
        dVar.a(0);
        dVar.f2117k = 0.0f;
        dVar.f2118l = 0.0f;
        dVar.f2119m = 0.0f;
        dVar.f2113e = 0.0f;
        dVar.f = 0.0f;
        dVar.f2114g = 0.0f;
        this.f2131y.setDuration(1332L);
        this.f2131y.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f2131y.cancel();
        this.f2129w = 0.0f;
        d dVar = this.f2128v;
        if (dVar.f2120n) {
            dVar.f2120n = false;
        }
        dVar.a(0);
        dVar.f2117k = 0.0f;
        dVar.f2118l = 0.0f;
        dVar.f2119m = 0.0f;
        dVar.f2113e = 0.0f;
        dVar.f = 0.0f;
        dVar.f2114g = 0.0f;
        invalidateSelf();
    }
}
