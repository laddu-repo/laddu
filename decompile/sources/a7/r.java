package a7;

import android.os.Process;
import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class r implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f218v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Runnable f219w;

    public /* synthetic */ r(Runnable runnable, int i) {
        this.f218v = i;
        this.f219w = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f218v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                try {
                    this.f219w.run();
                } catch (Exception e7) {
                    b8.h.m("Executor", "Background execution failure.", e7);
                    return;
                }
                break;
            case 1:
                Process.setThreadPriority(10);
                this.f219w.run();
                break;
            case 2:
                this.f219w.run();
                break;
            case 3:
                this.f219w.run();
                break;
            default:
                Process.setThreadPriority(0);
                this.f219w.run();
                break;
        }
    }

    public String toString() {
        switch (this.f218v) {
            case 2:
                return this.f219w.toString();
            case 3:
                return this.f219w.toString();
            default:
                return super.toString();
        }
    }
}
