package androidx.emoji2.text;

import android.os.Trace;
import androidx.media3.decoder.DecoderInputBuffer;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class q implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ q f927w = new q(2);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f928v;

    public /* synthetic */ q(int i) {
        this.f928v = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f928v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                try {
                    Method method = p0.k.f10189b;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (m.f912k != null) {
                        m.a().c();
                        break;
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    Method method2 = p0.k.f10189b;
                    Trace.endSection();
                    throw th;
                }
            case 1:
            default:
                return;
        }
    }

    private final void a() {
    }

    private final /* synthetic */ void b() {
    }
}
