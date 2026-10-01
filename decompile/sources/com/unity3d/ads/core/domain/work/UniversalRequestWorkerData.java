package com.unity3d.ads.core.domain.work;

import java.util.HashMap;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class UniversalRequestWorkerData {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_UNIVERSAL_REQUEST_ID = "universalRequestId";
    private final String universalRequestId;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private Companion() {
        }
    }

    public UniversalRequestWorkerData(String universalRequestId) {
        k.e(universalRequestId, "universalRequestId");
        this.universalRequestId = universalRequestId;
    }

    public final v5.f invoke() {
        HashMap hashMap = new HashMap();
        hashMap.put(KEY_UNIVERSAL_REQUEST_ID, this.universalRequestId);
        v5.f fVar = new v5.f(hashMap);
        v5.f.b(fVar);
        return fVar;
    }
}
