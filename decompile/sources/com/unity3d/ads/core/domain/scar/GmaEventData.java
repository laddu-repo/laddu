package com.unity3d.ads.core.domain.scar;

import com.unity3d.scar.adapter.common.b;
import com.unity3d.services.banners.bridge.BannerBridge;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class GmaEventData {
    private final BannerBridge.BannerEvent bannerEvent;
    private final Integer errorCode;
    private final String errorMessage;
    private final b gmaEvent;
    private final String opportunityId;
    private final String placementId;
    private final String queryId;

    public GmaEventData(b gmaEvent, BannerBridge.BannerEvent bannerEvent, String str, String str2, String str3, String str4, Integer num) {
        k.e(gmaEvent, "gmaEvent");
        this.gmaEvent = gmaEvent;
        this.bannerEvent = bannerEvent;
        this.opportunityId = str;
        this.placementId = str2;
        this.queryId = str3;
        this.errorMessage = str4;
        this.errorCode = num;
    }

    public static /* synthetic */ GmaEventData copy$default(GmaEventData gmaEventData, b bVar, BannerBridge.BannerEvent bannerEvent, String str, String str2, String str3, String str4, Integer num, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            bVar = gmaEventData.gmaEvent;
        }
        if ((i6 & 2) != 0) {
            bannerEvent = gmaEventData.bannerEvent;
        }
        if ((i6 & 4) != 0) {
            str = gmaEventData.opportunityId;
        }
        if ((i6 & 8) != 0) {
            str2 = gmaEventData.placementId;
        }
        if ((i6 & 16) != 0) {
            str3 = gmaEventData.queryId;
        }
        if ((i6 & 32) != 0) {
            str4 = gmaEventData.errorMessage;
        }
        if ((i6 & 64) != 0) {
            num = gmaEventData.errorCode;
        }
        String str5 = str4;
        Integer num2 = num;
        String str6 = str3;
        String str7 = str;
        return gmaEventData.copy(bVar, bannerEvent, str7, str2, str6, str5, num2);
    }

    public final b component1() {
        return this.gmaEvent;
    }

    public final BannerBridge.BannerEvent component2() {
        return this.bannerEvent;
    }

    public final String component3() {
        return this.opportunityId;
    }

    public final String component4() {
        return this.placementId;
    }

    public final String component5() {
        return this.queryId;
    }

    public final String component6() {
        return this.errorMessage;
    }

    public final Integer component7() {
        return this.errorCode;
    }

    public final GmaEventData copy(b gmaEvent, BannerBridge.BannerEvent bannerEvent, String str, String str2, String str3, String str4, Integer num) {
        k.e(gmaEvent, "gmaEvent");
        return new GmaEventData(gmaEvent, bannerEvent, str, str2, str3, str4, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GmaEventData)) {
            return false;
        }
        GmaEventData gmaEventData = (GmaEventData) obj;
        if (this.gmaEvent == gmaEventData.gmaEvent && this.bannerEvent == gmaEventData.bannerEvent && k.a(this.opportunityId, gmaEventData.opportunityId) && k.a(this.placementId, gmaEventData.placementId) && k.a(this.queryId, gmaEventData.queryId) && k.a(this.errorMessage, gmaEventData.errorMessage) && k.a(this.errorCode, gmaEventData.errorCode)) {
            return true;
        }
        return false;
    }

    public final BannerBridge.BannerEvent getBannerEvent() {
        return this.bannerEvent;
    }

    public final Integer getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final b getGmaEvent() {
        return this.gmaEvent;
    }

    public final String getOpportunityId() {
        return this.opportunityId;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final String getQueryId() {
        return this.queryId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = this.gmaEvent.hashCode() * 31;
        BannerBridge.BannerEvent bannerEvent = this.bannerEvent;
        int i6 = 0;
        if (bannerEvent == null) {
            hashCode = 0;
        } else {
            hashCode = bannerEvent.hashCode();
        }
        int i10 = (hashCode6 + hashCode) * 31;
        String str = this.opportunityId;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        String str2 = this.placementId;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        String str3 = this.queryId;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        String str4 = this.errorMessage;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i14 = (i13 + hashCode5) * 31;
        Integer num = this.errorCode;
        if (num != null) {
            i6 = num.hashCode();
        }
        return i14 + i6;
    }

    public String toString() {
        return "GmaEventData(gmaEvent=" + this.gmaEvent + ", bannerEvent=" + this.bannerEvent + ", opportunityId=" + this.opportunityId + ", placementId=" + this.placementId + ", queryId=" + this.queryId + ", errorMessage=" + this.errorMessage + ", errorCode=" + this.errorCode + ')';
    }

    public /* synthetic */ GmaEventData(b bVar, BannerBridge.BannerEvent bannerEvent, String str, String str2, String str3, String str4, Integer num, int i6, f fVar) {
        this(bVar, (i6 & 2) != 0 ? null : bannerEvent, (i6 & 4) != 0 ? null : str, (i6 & 8) != 0 ? null : str2, (i6 & 16) != 0 ? null : str3, (i6 & 32) != 0 ? null : str4, (i6 & 64) != 0 ? null : num);
    }
}
