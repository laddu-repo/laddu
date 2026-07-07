package za;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f extends ua.i {

    /* renamed from: f0, reason: collision with root package name */
    public static final /* synthetic */ int f15246f0 = 0;

    /* renamed from: e0, reason: collision with root package name */
    public e f15247e0;

    @Override // ua.i
    public final void g(Canvas canvas) {
        if (this.f15247e0.f15245r.isEmpty()) {
            super.g(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f15247e0.f15245r);
        } else {
            canvas.clipRect(this.f15247e0.f15245r, Region.Op.DIFFERENCE);
        }
        super.g(canvas);
        canvas.restore();
    }

    @Override // ua.i, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f15247e0 = new e(this.f15247e0);
        return this;
    }

    public final void y(float f3, float f10, float f11, float f12) {
        RectF rectF = this.f15247e0.f15245r;
        if (f3 == rectF.left && f10 == rectF.top && f11 == rectF.right && f12 == rectF.bottom) {
            return;
        }
        rectF.set(f3, f10, f11, f12);
        invalidateSelf();
    }
}
