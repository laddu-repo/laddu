package com.google.android.gms.internal.measurement;

import android.app.ActivityManager;
import android.util.Log;
import androidx.media3.decoder.DecoderInputBuffer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rb implements x9.m {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ rb f3049w = new rb(0);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ rb f3050x = new rb(1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f3051v;

    public /* synthetic */ rb(int i) {
        this.f3051v = i;
    }

    @Override // x9.m
    public final Object get() {
        switch (this.f3051v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                Object obj = nb.f2919j;
                ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(qb.f3019a);
                return scheduledExecutorServiceNewSingleThreadScheduledExecutor instanceof da.v0 ? (da.v0) scheduledExecutorServiceNewSingleThreadScheduledExecutor : new da.z0(scheduledExecutorServiceNewSingleThreadScheduledExecutor);
            default:
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                boolean z2 = false;
                try {
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    int i = runningAppProcessInfo.importance;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 17);
                    sb2.append("Memory state is: ");
                    sb2.append(i);
                    Log.i("PhenotypeProcessReaper", sb2.toString());
                    if (runningAppProcessInfo.importance >= 400) {
                        z2 = true;
                    }
                } catch (RuntimeException e7) {
                    Log.w("PhenotypeProcessReaper", "Failed to retrieve memory state, not killing process.", e7);
                }
                return new Boolean(z2);
        }
    }
}
