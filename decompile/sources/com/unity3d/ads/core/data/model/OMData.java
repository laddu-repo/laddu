package com.unity3d.ads.core.data.model;

import h8.c;
import kotlin.jvm.internal.k;
import r4.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class OMData {
    private final String partnerName;
    private final String partnerVersion;
    private final String version;

    public OMData(String version, String partnerName, String partnerVersion) {
        k.e(version, "version");
        k.e(partnerName, "partnerName");
        k.e(partnerVersion, "partnerVersion");
        this.version = version;
        this.partnerName = partnerName;
        this.partnerVersion = partnerVersion;
    }

    public static /* synthetic */ OMData copy$default(OMData oMData, String str, String str2, String str3, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = oMData.version;
        }
        if ((i6 & 2) != 0) {
            str2 = oMData.partnerName;
        }
        if ((i6 & 4) != 0) {
            str3 = oMData.partnerVersion;
        }
        return oMData.copy(str, str2, str3);
    }

    public final String component1() {
        return this.version;
    }

    public final String component2() {
        return this.partnerName;
    }

    public final String component3() {
        return this.partnerVersion;
    }

    public final OMData copy(String version, String partnerName, String partnerVersion) {
        k.e(version, "version");
        k.e(partnerName, "partnerName");
        k.e(partnerVersion, "partnerVersion");
        return new OMData(version, partnerName, partnerVersion);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OMData)) {
            return false;
        }
        OMData oMData = (OMData) obj;
        if (k.a(this.version, oMData.version) && k.a(this.partnerName, oMData.partnerName) && k.a(this.partnerVersion, oMData.partnerVersion)) {
            return true;
        }
        return false;
    }

    public final String getPartnerName() {
        return this.partnerName;
    }

    public final String getPartnerVersion() {
        return this.partnerVersion;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.partnerVersion.hashCode() + c.g(this.partnerName, this.version.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("OMData(version=");
        sb2.append(this.version);
        sb2.append(", partnerName=");
        sb2.append(this.partnerName);
        sb2.append(", partnerVersion=");
        return a.n(sb2, this.partnerVersion, ')');
    }
}
