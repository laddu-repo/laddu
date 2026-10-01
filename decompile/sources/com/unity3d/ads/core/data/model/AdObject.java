package com.unity3d.ads.core.data.model;

import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import h8.c;
import kf.r0;
import kf.y0;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import okhttp3.internal.http2.Http2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AdObject {
    private final AdPlayer adPlayer;
    private final DiagnosticEventRequestOuterClass.DiagnosticAdType adType;
    private final boolean isHeaderBidding;
    private boolean isOfferwallAd;
    private boolean isScarAd;
    private final UnityAdsLoadOptions loadOptions;
    private String offerwallPlacementName;
    private final ByteString opportunityId;
    private final String placementId;
    private String playerServerId;
    private String scarAdString;
    private String scarAdUnitId;
    private String scarQueryId;
    private r0 state;
    private ByteString trackingToken;
    private r0 ttl;

    public AdObject(ByteString opportunityId, String placementId, ByteString trackingToken, boolean z10, String str, String str2, String str3, boolean z11, String str4, AdPlayer adPlayer, String str5, UnityAdsLoadOptions loadOptions, boolean z12, DiagnosticEventRequestOuterClass.DiagnosticAdType adType, r0 ttl, r0 state) {
        k.e(opportunityId, "opportunityId");
        k.e(placementId, "placementId");
        k.e(trackingToken, "trackingToken");
        k.e(loadOptions, "loadOptions");
        k.e(adType, "adType");
        k.e(ttl, "ttl");
        k.e(state, "state");
        this.opportunityId = opportunityId;
        this.placementId = placementId;
        this.trackingToken = trackingToken;
        this.isScarAd = z10;
        this.scarQueryId = str;
        this.scarAdUnitId = str2;
        this.scarAdString = str3;
        this.isOfferwallAd = z11;
        this.offerwallPlacementName = str4;
        this.adPlayer = adPlayer;
        this.playerServerId = str5;
        this.loadOptions = loadOptions;
        this.isHeaderBidding = z12;
        this.adType = adType;
        this.ttl = ttl;
        this.state = state;
    }

    public final ByteString component1() {
        return this.opportunityId;
    }

    public final AdPlayer component10() {
        return this.adPlayer;
    }

    public final String component11() {
        return this.playerServerId;
    }

    public final UnityAdsLoadOptions component12() {
        return this.loadOptions;
    }

    public final boolean component13() {
        return this.isHeaderBidding;
    }

    public final DiagnosticEventRequestOuterClass.DiagnosticAdType component14() {
        return this.adType;
    }

    public final r0 component15() {
        return this.ttl;
    }

    public final r0 component16() {
        return this.state;
    }

    public final String component2() {
        return this.placementId;
    }

    public final ByteString component3() {
        return this.trackingToken;
    }

    public final boolean component4() {
        return this.isScarAd;
    }

    public final String component5() {
        return this.scarQueryId;
    }

    public final String component6() {
        return this.scarAdUnitId;
    }

    public final String component7() {
        return this.scarAdString;
    }

    public final boolean component8() {
        return this.isOfferwallAd;
    }

    public final String component9() {
        return this.offerwallPlacementName;
    }

    public final AdObject copy(ByteString opportunityId, String placementId, ByteString trackingToken, boolean z10, String str, String str2, String str3, boolean z11, String str4, AdPlayer adPlayer, String str5, UnityAdsLoadOptions loadOptions, boolean z12, DiagnosticEventRequestOuterClass.DiagnosticAdType adType, r0 ttl, r0 state) {
        k.e(opportunityId, "opportunityId");
        k.e(placementId, "placementId");
        k.e(trackingToken, "trackingToken");
        k.e(loadOptions, "loadOptions");
        k.e(adType, "adType");
        k.e(ttl, "ttl");
        k.e(state, "state");
        return new AdObject(opportunityId, placementId, trackingToken, z10, str, str2, str3, z11, str4, adPlayer, str5, loadOptions, z12, adType, ttl, state);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdObject)) {
            return false;
        }
        AdObject adObject = (AdObject) obj;
        if (k.a(this.opportunityId, adObject.opportunityId) && k.a(this.placementId, adObject.placementId) && k.a(this.trackingToken, adObject.trackingToken) && this.isScarAd == adObject.isScarAd && k.a(this.scarQueryId, adObject.scarQueryId) && k.a(this.scarAdUnitId, adObject.scarAdUnitId) && k.a(this.scarAdString, adObject.scarAdString) && this.isOfferwallAd == adObject.isOfferwallAd && k.a(this.offerwallPlacementName, adObject.offerwallPlacementName) && k.a(this.adPlayer, adObject.adPlayer) && k.a(this.playerServerId, adObject.playerServerId) && k.a(this.loadOptions, adObject.loadOptions) && this.isHeaderBidding == adObject.isHeaderBidding && this.adType == adObject.adType && k.a(this.ttl, adObject.ttl) && k.a(this.state, adObject.state)) {
            return true;
        }
        return false;
    }

    public final AdPlayer getAdPlayer() {
        return this.adPlayer;
    }

    public final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
        return this.adType;
    }

    public final UnityAdsLoadOptions getLoadOptions() {
        return this.loadOptions;
    }

    public final String getOfferwallPlacementName() {
        return this.offerwallPlacementName;
    }

    public final ByteString getOpportunityId() {
        return this.opportunityId;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final String getPlayerServerId() {
        return this.playerServerId;
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

    public final r0 getState() {
        return this.state;
    }

    public final ByteString getTrackingToken() {
        return this.trackingToken;
    }

    public final r0 getTtl() {
        return this.ttl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = (this.trackingToken.hashCode() + c.g(this.placementId, this.opportunityId.hashCode() * 31, 31)) * 31;
        boolean z10 = this.isScarAd;
        int i6 = 1;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode6 + i10) * 31;
        String str = this.scarQueryId;
        int i12 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i13 = (i11 + hashCode) * 31;
        String str2 = this.scarAdUnitId;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i14 = (i13 + hashCode2) * 31;
        String str3 = this.scarAdString;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i15 = (i14 + hashCode3) * 31;
        boolean z11 = this.isOfferwallAd;
        int i16 = z11;
        if (z11 != 0) {
            i16 = 1;
        }
        int i17 = (i15 + i16) * 31;
        String str4 = this.offerwallPlacementName;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i18 = (i17 + hashCode4) * 31;
        AdPlayer adPlayer = this.adPlayer;
        if (adPlayer == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = adPlayer.hashCode();
        }
        int i19 = (i18 + hashCode5) * 31;
        String str5 = this.playerServerId;
        if (str5 != null) {
            i12 = str5.hashCode();
        }
        int hashCode7 = (this.loadOptions.hashCode() + ((i19 + i12) * 31)) * 31;
        boolean z12 = this.isHeaderBidding;
        if (!z12) {
            i6 = z12 ? 1 : 0;
        }
        return this.state.hashCode() + ((this.ttl.hashCode() + ((this.adType.hashCode() + ((hashCode7 + i6) * 31)) * 31)) * 31);
    }

    public final boolean isHeaderBidding() {
        return this.isHeaderBidding;
    }

    public final boolean isOfferwallAd() {
        return this.isOfferwallAd;
    }

    public final boolean isScarAd() {
        return this.isScarAd;
    }

    public final void setOfferwallAd(boolean z10) {
        this.isOfferwallAd = z10;
    }

    public final void setOfferwallPlacementName(String str) {
        this.offerwallPlacementName = str;
    }

    public final void setPlayerServerId(String str) {
        this.playerServerId = str;
    }

    public final void setScarAd(boolean z10) {
        this.isScarAd = z10;
    }

    public final void setScarAdString(String str) {
        this.scarAdString = str;
    }

    public final void setScarAdUnitId(String str) {
        this.scarAdUnitId = str;
    }

    public final void setScarQueryId(String str) {
        this.scarQueryId = str;
    }

    public final void setState(r0 r0Var) {
        k.e(r0Var, "<set-?>");
        this.state = r0Var;
    }

    public final void setTrackingToken(ByteString byteString) {
        k.e(byteString, "<set-?>");
        this.trackingToken = byteString;
    }

    public final void setTtl(r0 r0Var) {
        k.e(r0Var, "<set-?>");
        this.ttl = r0Var;
    }

    public String toString() {
        return "AdObject(opportunityId=" + this.opportunityId + ", placementId=" + this.placementId + ", trackingToken=" + this.trackingToken + ", isScarAd=" + this.isScarAd + ", scarQueryId=" + this.scarQueryId + ", scarAdUnitId=" + this.scarAdUnitId + ", scarAdString=" + this.scarAdString + ", isOfferwallAd=" + this.isOfferwallAd + ", offerwallPlacementName=" + this.offerwallPlacementName + ", adPlayer=" + this.adPlayer + ", playerServerId=" + this.playerServerId + ", loadOptions=" + this.loadOptions + ", isHeaderBidding=" + this.isHeaderBidding + ", adType=" + this.adType + ", ttl=" + this.ttl + ", state=" + this.state + ')';
    }

    public /* synthetic */ AdObject(ByteString byteString, String str, ByteString byteString2, boolean z10, String str2, String str3, String str4, boolean z11, String str5, AdPlayer adPlayer, String str6, UnityAdsLoadOptions unityAdsLoadOptions, boolean z12, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, r0 r0Var, r0 r0Var2, int i6, f fVar) {
        this(byteString, str, byteString2, (i6 & 8) != 0 ? false : z10, (i6 & 16) != 0 ? null : str2, (i6 & 32) != 0 ? null : str3, (i6 & 64) != 0 ? null : str4, (i6 & 128) != 0 ? false : z11, (i6 & 256) != 0 ? null : str5, (i6 & 512) != 0 ? null : adPlayer, (i6 & 1024) != 0 ? null : str6, unityAdsLoadOptions, z12, diagnosticAdType, (i6 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? y0.c(null) : r0Var, (i6 & 32768) != 0 ? y0.c(AdObjectState.INIT) : r0Var2);
    }
}
