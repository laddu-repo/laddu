package k;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.playfy.tv.R;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h extends Drawable {

    /* renamed from: l, reason: collision with root package name */
    public static final float f7527l = (float) Math.toRadians(45.0d);

    /* renamed from: a, reason: collision with root package name */
    public final Paint f7528a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7529b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7530c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7531d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7532e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f7533f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f7534g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7535h;

    /* renamed from: i, reason: collision with root package name */
    public float f7536i;
    public final float j;

    /* renamed from: k, reason: collision with root package name */
    public final int f7537k;

    public h(Context context) {
        Paint paint = new Paint();
        this.f7528a = paint;
        this.f7534g = new Path();
        this.f7537k = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, h.a.f5744n, R.attr.drawerArrowStyle, R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        int color = obtainStyledAttributes.getColor(3, 0);
        if (color != paint.getColor()) {
            paint.setColor(color);
            invalidateSelf();
        }
        float dimension = obtainStyledAttributes.getDimension(7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (paint.getStrokeWidth() != dimension) {
            paint.setStrokeWidth(dimension);
            this.j = (float) (Math.cos(f7527l) * (dimension / 2.0f));
            invalidateSelf();
        }
        boolean z10 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f7533f != z10) {
            this.f7533f = z10;
            invalidateSelf();
        }
        float round = Math.round(obtainStyledAttributes.getDimension(5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        if (round != this.f7532e) {
            this.f7532e = round;
            invalidateSelf();
        }
        this.f7535h = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f7530c = Math.round(obtainStyledAttributes.getDimension(2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        this.f7529b = Math.round(obtainStyledAttributes.getDimension(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        this.f7531d = obtainStyledAttributes.getDimension(1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        obtainStyledAttributes.recycle();
    }

    public static float a(float f3, float f10, float f11) {
        return h8.c.f(f10, f3, f11, f3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f3;
        float f10;
        int i6;
        Rect bounds = getBounds();
        boolean z10 = false;
        int i10 = this.f7537k;
        if (i10 != 0 && (i10 == 1 || (i10 == 3 ? s1.c.o(this) == 0 : s1.c.o(this) == 1))) {
            z10 = true;
        }
        float f11 = this.f7529b;
        float sqrt = (float) Math.sqrt(f11 * f11 * 2.0f);
        float f12 = this.f7536i;
        float f13 = this.f7530c;
        float a10 = a(f13, sqrt, f12);
        float a11 = a(f13, this.f7531d, this.f7536i);
        float round = Math.round(a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.j, this.f7536i));
        float a12 = a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f7527l, this.f7536i);
        if (z10) {
            f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else {
            f3 = -180.0f;
        }
        if (z10) {
            f10 = 180.0f;
        } else {
            f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float a13 = a(f3, f10, this.f7536i);
        double d10 = a10;
        double d11 = a12;
        float round2 = (float) Math.round(Math.cos(d11) * d10);
        float round3 = (float) Math.round(Math.sin(d11) * d10);
        Path path = this.f7534g;
        path.rewind();
        float f14 = this.f7532e;
        Paint paint = this.f7528a;
        float a14 = a(f14 + paint.getStrokeWidth(), -this.j, this.f7536i);
        float f15 = (-a11) / 2.0f;
        path.moveTo(f15 + round, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        path.rLineTo(a11 - (round * 2.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        path.moveTo(f15, a14);
        path.rLineTo(round2, round3);
        path.moveTo(f15, -a14);
        path.rLineTo(round2, -round3);
        path.close();
        canvas.save();
        float strokeWidth = paint.getStrokeWidth();
        float height = bounds.height() - (3.0f * strokeWidth);
        float f16 = this.f7532e;
        canvas.translate(bounds.centerX(), (strokeWidth * 1.5f) + f16 + ((((int) (height - (f16 * 2.0f))) / 4) * 2));
        if (this.f7533f) {
            if (z10) {
                i6 = -1;
            } else {
                i6 = 1;
            }
            canvas.rotate(a13 * i6);
        } else if (z10) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f7535h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f7535h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i6) {
        Paint paint = this.f7528a;
        if (i6 != paint.getAlpha()) {
            paint.setAlpha(i6);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f7528a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(float f3) {
        if (this.f7536i != f3) {
            this.f7536i = f3;
            invalidateSelf();
        }
    }
}
