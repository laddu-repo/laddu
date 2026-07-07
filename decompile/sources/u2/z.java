package u2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class z implements Choreographer.FrameCallback, Handler.Callback {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final z f12807z = new z();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile long f12808v = -9223372036854775807L;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Handler f12809w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Choreographer f12810x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f12811y;

    public z() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i = w1.b0.f13686a;
        Handler handler = new Handler(looper, this);
        this.f12809w = handler;
        handler.sendEmptyMessage(1);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j8) {
        this.f12808v = j8;
        Choreographer choreographer = this.f12810x;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            try {
                this.f12810x = Choreographer.getInstance();
            } catch (RuntimeException e7) {
                w1.a.D("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e7);
            }
            return true;
        }
        if (i == 2) {
            Choreographer choreographer = this.f12810x;
            if (choreographer != null) {
                int i10 = this.f12811y + 1;
                this.f12811y = i10;
                if (i10 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i != 3) {
            return false;
        }
        Choreographer choreographer2 = this.f12810x;
        if (choreographer2 != null) {
            int i11 = this.f12811y - 1;
            this.f12811y = i11;
            if (i11 == 0) {
                choreographer2.removeFrameCallback(this);
                this.f12808v = -9223372036854775807L;
            }
        }
        return true;
    }
}
