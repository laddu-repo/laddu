package com.google.android.gms.internal.measurement;

import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ae implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ ae f2480w = new ae(0);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ ae f2481x = new ae(1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f2482v;

    public /* synthetic */ ae(int i) {
        this.f2482v = i;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f2482v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return;
            default:
                throw new IllegalStateException("Span was closed by an invalid call to SpanEndSignal.run()");
        }
    }

    private final /* synthetic */ void a() {
    }
}
