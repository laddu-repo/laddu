package f5;

import android.graphics.drawable.Drawable;
import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Drawable.Callback {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f5225v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f5226w;

    public /* synthetic */ c() {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f5225v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                ((f) this.f5226w).invalidateSelf();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j8) {
        switch (this.f5225v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                ((f) this.f5226w).scheduleSelf(runnable, j8);
                break;
            default:
                Drawable.Callback callback = (Drawable.Callback) this.f5226w;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j8);
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f5225v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                ((f) this.f5226w).unscheduleSelf(runnable);
                break;
            default:
                Drawable.Callback callback = (Drawable.Callback) this.f5226w;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                }
                break;
        }
    }

    public c(f fVar) {
        this.f5226w = fVar;
    }

    private final void a(Drawable drawable) {
    }
}
