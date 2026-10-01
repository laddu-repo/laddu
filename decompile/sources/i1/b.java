package i1;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.media3.decoder.DecoderInputBuffer;
import h.l;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f6314v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f6315w;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j8) {
        switch (this.f6314v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                ((Runnable) this.f6315w).run();
                break;
            default:
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new l((Context) this.f6315w, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
        }
    }

    public /* synthetic */ b(Runnable runnable) {
        this.f6315w = runnable;
    }
}
