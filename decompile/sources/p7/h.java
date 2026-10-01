package p7;

import androidx.media3.decoder.DecoderInputBuffer;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Executor {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ h f10412w = new h(0);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ h f10413x = new h(1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f10414v;

    public /* synthetic */ h(int i) {
        this.f10414v = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f10414v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
