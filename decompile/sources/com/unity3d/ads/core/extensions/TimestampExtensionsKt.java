package com.unity3d.ads.core.extensions;

import com.google.protobuf.Timestamp;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class TimestampExtensionsKt {
    public static final long duration(long j) {
        return System.nanoTime() - j;
    }

    public static final Timestamp fromMillis(long j) {
        Timestamp.Builder newBuilder = Timestamp.newBuilder();
        long j10 = UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT;
        Timestamp build = newBuilder.setSeconds(j / j10).setNanos((int) ((j % j10) * 1000000)).build();
        k.d(build, "newBuilder().setSeconds(…000000).toInt())).build()");
        return build;
    }
}
