package j5;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.decoder.DecoderInputBuffer;
import java.util.concurrent.Semaphore;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f6889v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w f6890w;

    public /* synthetic */ t(w wVar, int i) {
        this.f6889v = i;
        this.f6890w = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6889v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                Drawable drawable = this.f6890w;
                Drawable.Callback callback = drawable.getCallback();
                if (callback != null) {
                    callback.invalidateDrawable(drawable);
                    return;
                }
                return;
            default:
                w wVar = this.f6890w;
                Semaphore semaphore = wVar.f6902h0;
                r5.b bVar = wVar.J;
                if (bVar == null) {
                    return;
                }
                try {
                    semaphore.acquire();
                    bVar.r(wVar.f6909w.a());
                    if (w.f6893n0 && wVar.f6900f0) {
                        if (wVar.f6903i0 == null) {
                            wVar.f6903i0 = new Handler(Looper.getMainLooper());
                            wVar.f6904j0 = new t(wVar, 0);
                        }
                        wVar.f6903i0.post(wVar.f6904j0);
                    }
                    break;
                } catch (InterruptedException unused) {
                } catch (Throwable th) {
                    semaphore.release();
                    throw th;
                }
                semaphore.release();
                return;
        }
    }
}
