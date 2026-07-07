package com.unity3d.ads.gatewayclient;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class RequestPolicy {
    private final int connectTimeout;
    private final int maxDuration;
    private final int overallTimeout;
    private final int readTimeout;
    private final float retryJitterPct;
    private final int retryMaxInterval;
    private final float retryScalingFactor;
    private final int retryWaitBase;
    private final boolean shouldStoreLocally;
    private final int writeTimeout;

    public RequestPolicy(int i6, int i10, int i11, float f3, float f10, int i12, int i13, int i14, int i15, boolean z10) {
        this.maxDuration = i6;
        this.retryMaxInterval = i10;
        this.retryWaitBase = i11;
        this.retryJitterPct = f3;
        this.retryScalingFactor = f10;
        this.connectTimeout = i12;
        this.readTimeout = i13;
        this.writeTimeout = i14;
        this.overallTimeout = i15;
        this.shouldStoreLocally = z10;
    }

    public static /* synthetic */ RequestPolicy copy$default(RequestPolicy requestPolicy, int i6, int i10, int i11, float f3, float f10, int i12, int i13, int i14, int i15, boolean z10, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i6 = requestPolicy.maxDuration;
        }
        if ((i16 & 2) != 0) {
            i10 = requestPolicy.retryMaxInterval;
        }
        if ((i16 & 4) != 0) {
            i11 = requestPolicy.retryWaitBase;
        }
        if ((i16 & 8) != 0) {
            f3 = requestPolicy.retryJitterPct;
        }
        if ((i16 & 16) != 0) {
            f10 = requestPolicy.retryScalingFactor;
        }
        if ((i16 & 32) != 0) {
            i12 = requestPolicy.connectTimeout;
        }
        if ((i16 & 64) != 0) {
            i13 = requestPolicy.readTimeout;
        }
        if ((i16 & 128) != 0) {
            i14 = requestPolicy.writeTimeout;
        }
        if ((i16 & 256) != 0) {
            i15 = requestPolicy.overallTimeout;
        }
        if ((i16 & 512) != 0) {
            z10 = requestPolicy.shouldStoreLocally;
        }
        int i17 = i15;
        boolean z11 = z10;
        int i18 = i13;
        int i19 = i14;
        float f11 = f10;
        int i20 = i12;
        return requestPolicy.copy(i6, i10, i11, f3, f11, i20, i18, i19, i17, z11);
    }

    public final int component1() {
        return this.maxDuration;
    }

    public final boolean component10() {
        return this.shouldStoreLocally;
    }

    public final int component2() {
        return this.retryMaxInterval;
    }

    public final int component3() {
        return this.retryWaitBase;
    }

    public final float component4() {
        return this.retryJitterPct;
    }

    public final float component5() {
        return this.retryScalingFactor;
    }

    public final int component6() {
        return this.connectTimeout;
    }

    public final int component7() {
        return this.readTimeout;
    }

    public final int component8() {
        return this.writeTimeout;
    }

    public final int component9() {
        return this.overallTimeout;
    }

    public final RequestPolicy copy(int i6, int i10, int i11, float f3, float f10, int i12, int i13, int i14, int i15, boolean z10) {
        return new RequestPolicy(i6, i10, i11, f3, f10, i12, i13, i14, i15, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestPolicy)) {
            return false;
        }
        RequestPolicy requestPolicy = (RequestPolicy) obj;
        if (this.maxDuration == requestPolicy.maxDuration && this.retryMaxInterval == requestPolicy.retryMaxInterval && this.retryWaitBase == requestPolicy.retryWaitBase && Float.compare(this.retryJitterPct, requestPolicy.retryJitterPct) == 0 && Float.compare(this.retryScalingFactor, requestPolicy.retryScalingFactor) == 0 && this.connectTimeout == requestPolicy.connectTimeout && this.readTimeout == requestPolicy.readTimeout && this.writeTimeout == requestPolicy.writeTimeout && this.overallTimeout == requestPolicy.overallTimeout && this.shouldStoreLocally == requestPolicy.shouldStoreLocally) {
            return true;
        }
        return false;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    public final int getMaxDuration() {
        return this.maxDuration;
    }

    public final int getOverallTimeout() {
        return this.overallTimeout;
    }

    public final int getReadTimeout() {
        return this.readTimeout;
    }

    public final float getRetryJitterPct() {
        return this.retryJitterPct;
    }

    public final int getRetryMaxInterval() {
        return this.retryMaxInterval;
    }

    public final float getRetryScalingFactor() {
        return this.retryScalingFactor;
    }

    public final int getRetryWaitBase() {
        return this.retryWaitBase;
    }

    public final boolean getShouldStoreLocally() {
        return this.shouldStoreLocally;
    }

    public final int getWriteTimeout() {
        return this.writeTimeout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int floatToIntBits = (((((((((Float.floatToIntBits(this.retryScalingFactor) + ((Float.floatToIntBits(this.retryJitterPct) + (((((this.maxDuration * 31) + this.retryMaxInterval) * 31) + this.retryWaitBase) * 31)) * 31)) * 31) + this.connectTimeout) * 31) + this.readTimeout) * 31) + this.writeTimeout) * 31) + this.overallTimeout) * 31;
        boolean z10 = this.shouldStoreLocally;
        int i6 = z10;
        if (z10 != 0) {
            i6 = 1;
        }
        return floatToIntBits + i6;
    }

    public String toString() {
        return "RequestPolicy(maxDuration=" + this.maxDuration + ", retryMaxInterval=" + this.retryMaxInterval + ", retryWaitBase=" + this.retryWaitBase + ", retryJitterPct=" + this.retryJitterPct + ", retryScalingFactor=" + this.retryScalingFactor + ", connectTimeout=" + this.connectTimeout + ", readTimeout=" + this.readTimeout + ", writeTimeout=" + this.writeTimeout + ", overallTimeout=" + this.overallTimeout + ", shouldStoreLocally=" + this.shouldStoreLocally + ')';
    }
}
