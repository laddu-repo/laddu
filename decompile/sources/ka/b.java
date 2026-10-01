package ka;

import a2.r1;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.measurement.a4;
import com.unity3d.services.UnityAdsConstants;
import ua.m;
import ua.n;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends Drawable {

    /* renamed from: b, reason: collision with root package name */
    public final Paint f7751b;

    /* renamed from: h, reason: collision with root package name */
    public float f7757h;

    /* renamed from: i, reason: collision with root package name */
    public int f7758i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f7759k;

    /* renamed from: l, reason: collision with root package name */
    public int f7760l;

    /* renamed from: m, reason: collision with root package name */
    public int f7761m;

    /* renamed from: o, reason: collision with root package name */
    public m f7763o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f7764p;

    /* renamed from: a, reason: collision with root package name */
    public final r1 f7750a = n.f13026a;

    /* renamed from: c, reason: collision with root package name */
    public final Path f7752c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final Rect f7753d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final RectF f7754e = new RectF();

    /* renamed from: f, reason: collision with root package name */
    public final RectF f7755f = new RectF();

    /* renamed from: g, reason: collision with root package name */
    public final a f7756g = new a(this);

    /* renamed from: n, reason: collision with root package name */
    public boolean f7762n = true;

    public b(m mVar) {
        this.f7763o = mVar;
        Paint paint = new Paint(1);
        this.f7751b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10 = this.f7762n;
        Rect rect = this.f7753d;
        Paint paint = this.f7751b;
        if (z10) {
            copyBounds(rect);
            float height = this.f7757h / rect.height();
            paint.setShader(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rect.top, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rect.bottom, new int[]{l0.b.b(this.f7758i, this.f7761m), l0.b.b(this.j, this.f7761m), l0.b.b(l0.b.d(this.j, 0), this.f7761m), l0.b.b(l0.b.d(this.f7760l, 0), this.f7761m), l0.b.b(this.f7760l, this.f7761m), l0.b.b(this.f7759k, this.f7761m)}, new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.f7762n = false;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        copyBounds(rect);
        RectF rectF = this.f7754e;
        rectF.set(rect);
        ua.d dVar = this.f7763o.f13019e;
        Rect bounds = getBounds();
        RectF rectF2 = this.f7755f;
        rectF2.set(bounds);
        float min = Math.min(dVar.a(rectF2), rectF.width() / 2.0f);
        m mVar = this.f7763o;
        rectF2.set(getBounds());
        if (mVar.f(rectF2)) {
            rectF.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(rectF, min, min, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f7756g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (this.f7757h > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return -3;
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        m mVar = this.f7763o;
        Rect bounds = getBounds();
        RectF rectF = this.f7755f;
        rectF.set(bounds);
        if (mVar.f(rectF)) {
            ua.d dVar = this.f7763o.f13019e;
            rectF.set(getBounds());
            outline.setRoundRect(getBounds(), dVar.a(rectF));
            return;
        }
        Rect rect = this.f7753d;
        copyBounds(rect);
        RectF rectF2 = this.f7754e;
        rectF2.set(rect);
        m mVar2 = this.f7763o;
        r1 r1Var = this.f7750a;
        Path path = this.f7752c;
        r1Var.b(mVar2, null, 1.0f, rectF2, null, path);
        a4.o(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        m mVar = this.f7763o;
        Rect bounds = getBounds();
        RectF rectF = this.f7755f;
        rectF.set(bounds);
        if (mVar.f(rectF)) {
            int round = Math.round(this.f7757h);
            rect.set(round, round, round, round);
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f7764p;
        if ((colorStateList != null && colorStateList.isStateful()) || super.isStateful()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f7762n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f7764p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f7761m)) != this.f7761m) {
            this.f7762n = true;
            this.f7761m = colorForState;
        }
        if (this.f7762n) {
            invalidateSelf();
        }
        return this.f7762n;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i6) {
        this.f7751b.setAlpha(i6);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f7751b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
