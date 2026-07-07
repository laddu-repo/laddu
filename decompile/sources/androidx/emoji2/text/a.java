package androidx.emoji2.text;

import androidx.media3.decoder.DecoderInputBuffer;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f885b;

    public /* synthetic */ a(int i, String str) {
        this.f884a = i;
        this.f885b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f884a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                Thread thread = new Thread(runnable, this.f885b);
                thread.setPriority(10);
                return thread;
            default:
                return new Thread(runnable, this.f885b);
        }
    }
}
