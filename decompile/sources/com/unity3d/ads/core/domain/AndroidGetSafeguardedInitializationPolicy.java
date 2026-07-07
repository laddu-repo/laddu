package com.unity3d.ads.core.domain;

import com.unity3d.services.UnityAdsConstants;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidGetSafeguardedInitializationPolicy implements GetSafeguardedInitializationPolicy {
    @Override // com.unity3d.ads.core.domain.GetSafeguardedInitializationPolicy
    public NativeConfigurationOuterClass.RequestPolicy invoke(NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
        k.e(requestPolicy, "requestPolicy");
        NativeConfigurationOuterClass.RequestRetryPolicy retryPolicy = requestPolicy.getRetryPolicy();
        NativeConfigurationOuterClass.RequestTimeoutPolicy timeoutPolicy = requestPolicy.getTimeoutPolicy();
        NativeConfigurationOuterClass.RequestPolicy build = NativeConfigurationOuterClass.RequestPolicy.newBuilder(requestPolicy).setRetryPolicy(NativeConfigurationOuterClass.RequestRetryPolicy.newBuilder(retryPolicy).setMaxDuration(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_DURATION, retryPolicy.getMaxDuration())).setRetryWaitBase(Math.max(0, retryPolicy.getRetryWaitBase())).setRetryMaxInterval(Math.max(0, retryPolicy.getRetryMaxInterval())).setRetryScalingFactor(Math.max(0.1f, retryPolicy.getRetryScalingFactor())).setRetryJitterPct(Math.min(100.0f, Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, retryPolicy.getRetryJitterPct())))).setTimeoutPolicy(NativeConfigurationOuterClass.RequestTimeoutPolicy.newBuilder(timeoutPolicy).setConnectTimeoutMs(Math.max(UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT, timeoutPolicy.getConnectTimeoutMs())).setReadTimeoutMs(Math.max(UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT, timeoutPolicy.getReadTimeoutMs())).setWriteTimeoutMs(Math.max(UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT, timeoutPolicy.getWriteTimeoutMs())).setOverallTimeoutMs(Math.max(UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT, timeoutPolicy.getOverallTimeoutMs()))).build();
        k.d(build, "newBuilder(requestPolicy…  )\n            ).build()");
        return build;
    }
}
