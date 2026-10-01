package org.chromium.net;

import java.util.Date;
import java.util.Set;
import org.chromium.net.CronetEngine;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class ICronetEngineBuilder {
    public abstract ICronetEngineBuilder addPublicKeyPins(String str, Set<byte[]> set, boolean z10, Date date);

    public abstract ICronetEngineBuilder addQuicHint(String str, int i6, int i10);

    public abstract ExperimentalCronetEngine build();

    public abstract ICronetEngineBuilder enableHttp2(boolean z10);

    public abstract ICronetEngineBuilder enableHttpCache(int i6, long j);

    public abstract ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z10);

    public abstract ICronetEngineBuilder enableQuic(boolean z10);

    public abstract ICronetEngineBuilder enableSdch(boolean z10);

    public abstract String getDefaultUserAgent();

    public abstract ICronetEngineBuilder setExperimentalOptions(String str);

    public abstract ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader);

    public abstract ICronetEngineBuilder setStoragePath(String str);

    public abstract ICronetEngineBuilder setUserAgent(String str);

    public ICronetEngineBuilder enableBrotli(boolean z10) {
        return this;
    }

    public ICronetEngineBuilder enableNetworkQualityEstimator(boolean z10) {
        return this;
    }

    public ICronetEngineBuilder setThreadPriority(int i6) {
        return this;
    }
}
