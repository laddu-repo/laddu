package com.google.android.gms.internal.measurement;

import androidx.media3.decoder.DecoderInputBuffer;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2464b;

    public /* synthetic */ a(int i, Object obj) {
        this.f2463a = i;
        this.f2464b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        switch (this.f2463a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return new xa(((q6) this.f2464b).f3011c);
            case 1:
                return new xa(((q6) this.f2464b).f3012d);
            default:
                f6 f6Var = (f6) this.f2464b;
                synchronized (((rf) f6Var.f2639x).f3059g) {
                    f6Var.f2638w = null;
                    break;
                }
                return null;
        }
    }
}
