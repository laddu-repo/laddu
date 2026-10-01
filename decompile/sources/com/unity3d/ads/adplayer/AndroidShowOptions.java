package com.unity3d.ads.adplayer;

import java.util.Map;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidShowOptions implements ShowOptions {
    private final boolean isOfferwallAd;
    private final boolean isScarAd;
    private final String offerwallPlacementName;
    private final String placementId;
    private final String scarAdString;
    private final String scarAdUnitId;
    private final String scarQueryId;
    private final Map<String, Object> unityAdsShowOptions;

    public AndroidShowOptions(Map<String, ? extends Object> map, String str, boolean z10, String str2, String str3, String str4, boolean z11, String str5) {
        this.unityAdsShowOptions = map;
        this.placementId = str;
        this.isScarAd = z10;
        this.scarQueryId = str2;
        this.scarAdString = str3;
        this.scarAdUnitId = str4;
        this.isOfferwallAd = z11;
        this.offerwallPlacementName = str5;
    }

    public static /* synthetic */ AndroidShowOptions copy$default(AndroidShowOptions androidShowOptions, Map map, String str, boolean z10, String str2, String str3, String str4, boolean z11, String str5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            map = androidShowOptions.unityAdsShowOptions;
        }
        if ((i6 & 2) != 0) {
            str = androidShowOptions.placementId;
        }
        if ((i6 & 4) != 0) {
            z10 = androidShowOptions.isScarAd;
        }
        if ((i6 & 8) != 0) {
            str2 = androidShowOptions.scarQueryId;
        }
        if ((i6 & 16) != 0) {
            str3 = androidShowOptions.scarAdString;
        }
        if ((i6 & 32) != 0) {
            str4 = androidShowOptions.scarAdUnitId;
        }
        if ((i6 & 64) != 0) {
            z11 = androidShowOptions.isOfferwallAd;
        }
        if ((i6 & 128) != 0) {
            str5 = androidShowOptions.offerwallPlacementName;
        }
        boolean z12 = z11;
        String str6 = str5;
        String str7 = str3;
        String str8 = str4;
        return androidShowOptions.copy(map, str, z10, str2, str7, str8, z12, str6);
    }

    public final Map<String, Object> component1() {
        return this.unityAdsShowOptions;
    }

    public final String component2() {
        return this.placementId;
    }

    public final boolean component3() {
        return this.isScarAd;
    }

    public final String component4() {
        return this.scarQueryId;
    }

    public final String component5() {
        return this.scarAdString;
    }

    public final String component6() {
        return this.scarAdUnitId;
    }

    public final boolean component7() {
        return this.isOfferwallAd;
    }

    public final String component8() {
        return this.offerwallPlacementName;
    }

    public final AndroidShowOptions copy(Map<String, ? extends Object> map, String str, boolean z10, String str2, String str3, String str4, boolean z11, String str5) {
        return new AndroidShowOptions(map, str, z10, str2, str3, str4, z11, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidShowOptions)) {
            return false;
        }
        AndroidShowOptions androidShowOptions = (AndroidShowOptions) obj;
        if (k.a(this.unityAdsShowOptions, androidShowOptions.unityAdsShowOptions) && k.a(this.placementId, androidShowOptions.placementId) && this.isScarAd == androidShowOptions.isScarAd && k.a(this.scarQueryId, androidShowOptions.scarQueryId) && k.a(this.scarAdString, androidShowOptions.scarAdString) && k.a(this.scarAdUnitId, androidShowOptions.scarAdUnitId) && this.isOfferwallAd == androidShowOptions.isOfferwallAd && k.a(this.offerwallPlacementName, androidShowOptions.offerwallPlacementName)) {
            return true;
        }
        return false;
    }

    public final String getOfferwallPlacementName() {
        return this.offerwallPlacementName;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final String getScarAdString() {
        return this.scarAdString;
    }

    public final String getScarAdUnitId() {
        return this.scarAdUnitId;
    }

    public final String getScarQueryId() {
        return this.scarQueryId;
    }

    public final Map<String, Object> getUnityAdsShowOptions() {
        return this.unityAdsShowOptions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        Map<String, Object> map = this.unityAdsShowOptions;
        int i6 = 0;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        int i10 = hashCode * 31;
        String str = this.placementId;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        boolean z10 = this.isScarAd;
        int i12 = 1;
        int i13 = z10;
        if (z10 != 0) {
            i13 = 1;
        }
        int i14 = (i11 + i13) * 31;
        String str2 = this.scarQueryId;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i15 = (i14 + hashCode3) * 31;
        String str3 = this.scarAdString;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i16 = (i15 + hashCode4) * 31;
        String str4 = this.scarAdUnitId;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i17 = (i16 + hashCode5) * 31;
        boolean z11 = this.isOfferwallAd;
        if (!z11) {
            i12 = z11 ? 1 : 0;
        }
        int i18 = (i17 + i12) * 31;
        String str5 = this.offerwallPlacementName;
        if (str5 != null) {
            i6 = str5.hashCode();
        }
        return i18 + i6;
    }

    public final boolean isOfferwallAd() {
        return this.isOfferwallAd;
    }

    public final boolean isScarAd() {
        return this.isScarAd;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidShowOptions(unityAdsShowOptions=");
        sb2.append(this.unityAdsShowOptions);
        sb2.append(", placementId=");
        sb2.append(this.placementId);
        sb2.append(", isScarAd=");
        sb2.append(this.isScarAd);
        sb2.append(", scarQueryId=");
        sb2.append(this.scarQueryId);
        sb2.append(", scarAdString=");
        sb2.append(this.scarAdString);
        sb2.append(", scarAdUnitId=");
        sb2.append(this.scarAdUnitId);
        sb2.append(", isOfferwallAd=");
        sb2.append(this.isOfferwallAd);
        sb2.append(", offerwallPlacementName=");
        return r4.a.n(sb2, this.offerwallPlacementName, ')');
    }

    public /* synthetic */ AndroidShowOptions(Map map, String str, boolean z10, String str2, String str3, String str4, boolean z11, String str5, int i6, f fVar) {
        this(map, (i6 & 2) != 0 ? null : str, (i6 & 4) != 0 ? false : z10, (i6 & 8) != 0 ? null : str2, (i6 & 16) != 0 ? null : str3, (i6 & 32) != 0 ? null : str4, (i6 & 64) != 0 ? false : z11, (i6 & 128) != 0 ? null : str5);
    }
}
