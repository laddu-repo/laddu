package t9;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g extends o9.i {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final /* synthetic */ int f12441c0 = 0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public f f12442b0;

    @Override // o9.i
    public final void g(Canvas canvas) {
        if (this.f12442b0.f12440r.isEmpty()) {
            super.g(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f12442b0.f12440r);
        } else {
            canvas.clipRect(this.f12442b0.f12440r, Region.Op.DIFFERENCE);
        }
        super.g(canvas);
        canvas.restore();
    }

    @Override // o9.i, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f12442b0 = new f(this.f12442b0);
        return this;
    }

    public final void y(float f, float f4, float f10, float f11) {
        RectF rectF = this.f12442b0.f12440r;
        if (f == rectF.left && f4 == rectF.top && f10 == rectF.right && f11 == rectF.bottom) {
            return;
        }
        rectF.set(f, f4, f10, f11);
        invalidateSelf();
    }
}
