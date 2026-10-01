package m2;

import android.os.Handler;
import android.os.HandlerThread;
import java.io.Closeable;
import java.io.OutputStream;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class y implements Closeable {

    /* renamed from: x, reason: collision with root package name */
    public final OutputStream f8549x;

    /* renamed from: y, reason: collision with root package name */
    public final HandlerThread f8550y;

    /* renamed from: z, reason: collision with root package name */
    public final Handler f8551z;

    public y(z zVar, OutputStream outputStream) {
        this.f8549x = outputStream;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:RtspMessageChannel:Sender");
        this.f8550y = handlerThread;
        handlerThread.start();
        this.f8551z = new Handler(handlerThread.getLooper());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        HandlerThread handlerThread = this.f8550y;
        Objects.requireNonNull(handlerThread);
        this.f8551z.post(new j2.h(handlerThread, 6));
        try {
            handlerThread.join();
        } catch (InterruptedException unused) {
            handlerThread.interrupt();
        }
    }
}
