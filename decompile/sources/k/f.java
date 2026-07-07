package k;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f implements Drawable.Callback {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f7522x = 0;

    /* renamed from: y, reason: collision with root package name */
    public Object f7523y;

    public /* synthetic */ f() {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f7522x) {
            case 0:
                return;
            default:
                ((p5.e) this.f7523y).invalidateSelf();
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.f7522x) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f7523y;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j);
                    return;
                }
                return;
            default:
                ((p5.e) this.f7523y).scheduleSelf(runnable, j);
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f7522x) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f7523y;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            default:
                ((p5.e) this.f7523y).unscheduleSelf(runnable);
                return;
        }
    }

    public f(p5.e eVar) {
        this.f7523y = eVar;
    }

    private final void a(Drawable drawable) {
    }
}
