package com.unity3d.ads.core.domain;

import android.content.Context;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.gatewayclient.GatewayClient;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass;
import gf.f0;
import gf.y;
import kotlin.jvm.internal.k;
import le.c;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidLoad implements Load {
    private final AdRepository adRepository;
    private final y defaultDispatcher;
    private final GatewayClient gatewayClient;
    private final GetAdPlayerConfigRequest getAdPlayerConfigRequest;
    private final GetAdRequest getAdRequest;
    private final GetRequestPolicy getRequestPolicy;
    private final HandleGatewayAdResponse handleGatewayAdResponse;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    public AndroidLoad(y defaultDispatcher, GetAdRequest getAdRequest, GetAdPlayerConfigRequest getAdPlayerConfigRequest, GetRequestPolicy getRequestPolicy, HandleGatewayAdResponse handleGatewayAdResponse, SessionRepository sessionRepository, GatewayClient gatewayClient, AdRepository adRepository, SendDiagnosticEvent sendDiagnosticEvent) {
        k.e(defaultDispatcher, "defaultDispatcher");
        k.e(getAdRequest, "getAdRequest");
        k.e(getAdPlayerConfigRequest, "getAdPlayerConfigRequest");
        k.e(getRequestPolicy, "getRequestPolicy");
        k.e(handleGatewayAdResponse, "handleGatewayAdResponse");
        k.e(sessionRepository, "sessionRepository");
        k.e(gatewayClient, "gatewayClient");
        k.e(adRepository, "adRepository");
        k.e(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.defaultDispatcher = defaultDispatcher;
        this.getAdRequest = getAdRequest;
        this.getAdPlayerConfigRequest = getAdPlayerConfigRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.handleGatewayAdResponse = handleGatewayAdResponse;
        this.sessionRepository = sessionRepository;
        this.gatewayClient = gatewayClient;
        this.adRepository = adRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdObject getTmpAdObject(ByteString byteString, String str, boolean z10, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, UnityAdsLoadOptions unityAdsLoadOptions) {
        ByteString EMPTY = ByteString.EMPTY;
        k.d(EMPTY, "EMPTY");
        return new AdObject(byteString, str, EMPTY, false, null, null, null, false, null, null, null, unityAdsLoadOptions, z10, diagnosticAdType, null, null, 50680, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoadResult.Failure handleGatewayException(UnityAdsNetworkException unityAdsNetworkException) {
        UnityAds.UnityAdsLoadError unityAdsLoadError;
        String str;
        String str2;
        boolean z10 = unityAdsNetworkException instanceof NetworkTimeoutException;
        if (z10) {
            unityAdsLoadError = UnityAds.UnityAdsLoadError.TIMEOUT;
        } else {
            unityAdsLoadError = UnityAds.UnityAdsLoadError.INTERNAL_ERROR;
        }
        UnityAds.UnityAdsLoadError unityAdsLoadError2 = unityAdsLoadError;
        if (z10) {
            str = LoadResult.MSG_TIMEOUT;
        } else if (unityAdsNetworkException instanceof GatewayException) {
            str = unityAdsNetworkException.getMessage();
        } else {
            str = LoadResult.MSG_COMMUNICATION_FAILURE;
        }
        String str3 = str;
        if (z10) {
            str2 = "timeout";
        } else {
            str2 = "gateway";
        }
        return new LoadResult.Failure(unityAdsLoadError2, str3, unityAdsNetworkException, str2, unityAdsNetworkException.getMessage(), false, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void incrementLoadRequestAdmCount(boolean z10) {
        if (z10) {
            this.sessionRepository.incrementBannerLoadRequestAdmCount();
        } else {
            this.sessionRepository.incrementLoadRequestAdmCount();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void incrementLoadRequestCount(boolean z10) {
        if (z10) {
            this.sessionRepository.incrementBannerLoadRequestCount();
        } else {
            this.sessionRepository.incrementLoadRequestCount();
        }
    }

    @Override // com.unity3d.ads.core.domain.Load
    public Object invoke(Context context, String str, ByteString byteString, HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup, AdRequestOuterClass.BannerSize bannerSize, UnityAdsLoadOptions unityAdsLoadOptions, c cVar) {
        return f0.J(this.defaultDispatcher, new AndroidLoad$invoke$2(this, bannerSize, headerBiddingAdMarkup, byteString, str, unityAdsLoadOptions, context, null), cVar);
    }
}
