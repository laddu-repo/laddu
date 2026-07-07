package com.unity3d.ads.core.domain.work;

import android.content.Context;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import v5.u;
import w5.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class BackgroundWorker {
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "UnityAdsBackgroundWorker";
    private final u workManager;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private Companion() {
        }
    }

    public BackgroundWorker(Context applicationContext) {
        k.e(applicationContext, "applicationContext");
        this.workManager = l.c(applicationContext);
    }

    public final u getWorkManager() {
        return this.workManager;
    }

    public final <T extends UniversalRequestJob> void invoke(UniversalRequestWorkerData universalRequestWorkerData) {
        k.e(universalRequestWorkerData, "universalRequestWorkerData");
        k.j();
        throw null;
    }
}
