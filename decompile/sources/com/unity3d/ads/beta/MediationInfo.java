package com.unity3d.ads.beta;

import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class MediationInfo {
    private final String adapterVersion;
    private final String name;
    private final String version;

    public MediationInfo(String name, String version, String adapterVersion) {
        k.e(name, "name");
        k.e(version, "version");
        k.e(adapterVersion, "adapterVersion");
        this.name = name;
        this.version = version;
        this.adapterVersion = adapterVersion;
    }

    public final String getAdapterVersion() {
        return this.adapterVersion;
    }

    public final String getName() {
        return this.name;
    }

    public final String getVersion() {
        return this.version;
    }
}
