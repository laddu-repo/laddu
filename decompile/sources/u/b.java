package u;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public float f12719a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f12720b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f12721c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f12722d;

    /* renamed from: e, reason: collision with root package name */
    public float f12723e;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f12726h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f12727i;
    public ColorStateList j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f12724f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f12725g = true;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f12728k = PorterDuff.Mode.SRC_IN;

    public b(ColorStateList colorStateList, float f3) {
        this.f12719a = f3;
        Paint paint = new Paint(5);
        this.f12720b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f12726h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f12726h.getDefaultColor()));
        this.f12721c = new RectF();
        this.f12722d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    public final void b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        float f3 = rect.left;
        float f10 = rect.top;
        float f11 = rect.right;
        float f12 = rect.bottom;
        RectF rectF = this.f12721c;
        rectF.set(f3, f10, f11, f12);
        Rect rect2 = this.f12722d;
        rect2.set(rect);
        if (this.f12724f) {
            rect2.inset((int) Math.ceil(c.a(this.f12723e, this.f12719a, this.f12725g)), (int) Math.ceil(c.b(this.f12723e, this.f12719a, this.f12725g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10;
        PorterDuffColorFilter porterDuffColorFilter = this.f12727i;
        Paint paint = this.f12720b;
        if (porterDuffColorFilter != null && paint.getColorFilter() == null) {
            paint.setColorFilter(this.f12727i);
            z10 = true;
        } else {
            z10 = false;
        }
        RectF rectF = this.f12721c;
        float f3 = this.f12719a;
        canvas.drawRoundRect(rectF, f3, f3, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f12722d, this.f12719a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.j;
        if (colorStateList == null || !colorStateList.isStateful()) {
            ColorStateList colorStateList2 = this.f12726h;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful()) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f12726h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f12720b;
        if (colorForState != paint.getColor()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.j;
        if (colorStateList2 != null && (mode = this.f12728k) != null) {
            this.f12727i = a(colorStateList2, mode);
            return true;
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i6) {
        this.f12720b.setAlpha(i6);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f12720b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        this.f12727i = a(colorStateList, this.f12728k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f12728k = mode;
        this.f12727i = a(this.j, mode);
        invalidateSelf();
    }
}
