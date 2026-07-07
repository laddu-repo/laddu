package w2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class z implements Choreographer.FrameCallback, Handler.Callback {
    public static final z B = new z();
    public int A;

    /* renamed from: x, reason: collision with root package name */
    public volatile long f13724x = -9223372036854775807L;

    /* renamed from: y, reason: collision with root package name */
    public final Handler f13725y;

    /* renamed from: z, reason: collision with root package name */
    public Choreographer f13726z;

    public z() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        String str = u1.a0.f12750a;
        Handler handler = new Handler(looper, this);
        this.f13725y = handler;
        handler.sendEmptyMessage(1);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f13724x = j;
        Choreographer choreographer = this.f13726z;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i6 = message.what;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    return false;
                }
                Choreographer choreographer = this.f13726z;
                if (choreographer != null) {
                    int i10 = this.A - 1;
                    this.A = i10;
                    if (i10 == 0) {
                        choreographer.removeFrameCallback(this);
                        this.f13724x = -9223372036854775807L;
                    }
                }
                return true;
            }
            Choreographer choreographer2 = this.f13726z;
            if (choreographer2 != null) {
                int i11 = this.A + 1;
                this.A = i11;
                if (i11 == 1) {
                    choreographer2.postFrameCallback(this);
                }
            }
            return true;
        }
        try {
            this.f13726z = Choreographer.getInstance();
        } catch (RuntimeException e10) {
            u1.a.q("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
        }
        return true;
    }
}
