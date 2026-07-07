package com.google.android.gms.internal.measurement;

import android.os.Process;
import android.util.Log;
import androidx.media3.decoder.DecoderInputBuffer;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zd implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f3286v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f3287w;

    public /* synthetic */ zd(int i, Object obj) {
        this.f3286v = i;
        this.f3287w = obj;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f3286v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                throw new RuntimeException(((ExecutionException) this.f3287w).getCause());
            case 1:
                try {
                    da.o0.b((ListenableFuture) this.f3287w);
                    return;
                } catch (ExecutionException e7) {
                    eh.e().post(new zd(0, e7));
                    return;
                }
            case 2:
                try {
                    da.o0.b((da.j0) this.f3287w);
                    return;
                } catch (Exception e10) {
                    Log.w("PhFlagUpdateRegistry", "Failed to register flag update listener which may lead to stale flags.", e10);
                    return;
                }
            case 3:
                if (((Boolean) ((fe) this.f3287w).f2646c.get()).booleanValue()) {
                    Log.i("PhenotypeProcessReaper", "Killing process to refresh experiment configuration");
                    Process.killProcess(Process.myPid());
                    System.exit(0);
                    return;
                }
                return;
            default:
                try {
                    da.o0.b((da.k0) this.f3287w);
                    return;
                } catch (Exception e11) {
                    if (Log.isLoggable("StorageInfoHandler", 3)) {
                        Log.d("StorageInfoHandler", "Failed to get storage info from GMS", e11);
                        return;
                    }
                    return;
                }
        }
    }
}
