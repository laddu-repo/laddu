package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.util.Log;
import androidx.media3.decoder.DecoderInputBuffer;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cb implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f2538v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f2539w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Serializable f2540x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f2541y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f2542z;

    public /* synthetic */ cb(Object obj, Serializable serializable, Object obj2, Object obj3, int i) {
        this.f2538v = i;
        this.f2539w = obj;
        this.f2540x = serializable;
        this.f2541y = obj2;
        this.f2542z = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2538v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                da.b1 b1Var = (da.b1) this.f2539w;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f2540x;
                Context context = (Context) this.f2541y;
                bb bbVar = (bb) this.f2542z;
                if ((b1Var.f4450v instanceof da.d) && atomicBoolean.compareAndSet(false, true)) {
                    try {
                        context.unregisterReceiver(bbVar);
                    } catch (IllegalArgumentException e7) {
                        Log.w("DirectBootUtils", "Failed to unregister receiver", e7);
                        return;
                    }
                    break;
                }
                break;
            default:
                p6 p6Var = vb.f3162a;
                Level level = (Level) this.f2539w;
                w2 w2Var = (w2) p6Var.f2983w;
                boolean zE = w2Var.e(level);
                String str = (String) w2Var.f3188a;
                ((i) d.f2554a).getClass();
                n.f2904b.a(str, level, zE);
                ((gh) ((gh) (!zE ? p6.f2981z : new hh(p6Var, level)).a((Throwable) this.f2540x)).b()).c((String) this.f2541y, (Object[]) this.f2542z);
                break;
        }
    }
}
