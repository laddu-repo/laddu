package com.unity3d.ads.core.domain;

import android.content.Context;
import com.google.protobuf.ByteString;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.banners.UnityBannerSize;
import df.m;
import ef.j;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.BannerSizeKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass;
import he.i;
import ie.w;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kf.f1;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import le.c;
import okhttp3.HttpUrl;
import org.json.JSONObject;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class LegacyLoadUseCase {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_AD_MARKUP = "adMarkup";
    public static final String KEY_OBJECT_ID = "objectId";
    private String adMarkup;
    private final AdRepository adRepository;
    private final AwaitInitialization awaitInitialization;
    private final CleanUpWhenOpportunityExpires cleanUpWhenOpportunityExpires;
    private final GetInitializationState getInitializationState;
    private boolean isBanner;
    private boolean isHeaderBidding;
    private IUnityAdsLoadListener listener;
    private final Load load;
    private UnityAdsLoadOptions loadOptions;
    private final Logger logger;
    private ByteString opportunity;
    private String placement;
    private final SafeCallbackInvoke safeCallbackInvoke;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private j startTime;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private Companion() {
        }
    }

    public LegacyLoadUseCase(Load load, SendDiagnosticEvent sendDiagnosticEvent, GetInitializationState getInitializationState, AwaitInitialization awaitInitialization, SessionRepository sessionRepository, AdRepository adRepository, SafeCallbackInvoke safeCallbackInvoke, CleanUpWhenOpportunityExpires cleanUpWhenOpportunityExpires, Logger logger) {
        k.e(load, "load");
        k.e(sendDiagnosticEvent, "sendDiagnosticEvent");
        k.e(getInitializationState, "getInitializationState");
        k.e(awaitInitialization, "awaitInitialization");
        k.e(sessionRepository, "sessionRepository");
        k.e(adRepository, "adRepository");
        k.e(safeCallbackInvoke, "safeCallbackInvoke");
        k.e(cleanUpWhenOpportunityExpires, "cleanUpWhenOpportunityExpires");
        k.e(logger, "logger");
        this.load = load;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getInitializationState = getInitializationState;
        this.awaitInitialization = awaitInitialization;
        this.sessionRepository = sessionRepository;
        this.adRepository = adRepository;
        this.safeCallbackInvoke = safeCallbackInvoke;
        this.cleanUpWhenOpportunityExpires = cleanUpWhenOpportunityExpires;
        this.logger = logger;
    }

    private final String getAdInfoString(String str) {
        return "for placement " + this.placement + " with instance id " + str;
    }

    private final String getAdMarkup(UnityAdsLoadOptions unityAdsLoadOptions) {
        Object opt;
        JSONObject data = unityAdsLoadOptions.getData();
        if (data != null && (opt = data.opt(KEY_AD_MARKUP)) != null) {
            return opt.toString();
        }
        return null;
    }

    private final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
        if (this.isBanner) {
            return DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER;
        }
        return DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_FULLSCREEN;
    }

    private final AdRequestOuterClass.BannerSize getBannerSize(UnityBannerSize unityBannerSize) {
        if (unityBannerSize != null) {
            BannerSizeKt.Dsl.Companion companion = BannerSizeKt.Dsl.Companion;
            AdRequestOuterClass.BannerSize.Builder newBuilder = AdRequestOuterClass.BannerSize.newBuilder();
            k.d(newBuilder, "newBuilder()");
            BannerSizeKt.Dsl _create = companion._create(newBuilder);
            _create.setWidth(unityBannerSize.getWidth());
            _create.setHeight(unityBannerSize.getHeight());
            return _create._build();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup getHeaderBiddingAdMarkup(String str) {
        if (str != null && !m.S(str)) {
            try {
                return HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.parseFrom(ProtobufExtensionsKt.fromBase64$default(str, false, 1, null).toByteArray());
            } catch (Exception unused) {
                return null;
            }
        }
        return HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.getDefaultInstance();
    }

    private final String getOpportunityId(UnityAdsLoadOptions unityAdsLoadOptions) {
        Object opt;
        JSONObject data = unityAdsLoadOptions.getData();
        if (data != null && (opt = data.opt("objectId")) != null) {
            return opt.toString();
        }
        return null;
    }

    private final Map<String, String> getTags(String str, String str2) {
        LinkedHashMap z10 = w.z(new i("state", GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString()), new i("operation", OperationType.LOAD.toString()));
        if (str != null && str.length() != 0) {
            z10.put("reason", str);
        }
        if (str2 != null && str2.length() != 0) {
            z10.put("reason_debug", str2);
        }
        return z10;
    }

    public static /* synthetic */ Map getTags$default(LegacyLoadUseCase legacyLoadUseCase, String str, String str2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = null;
        }
        if ((i6 & 2) != 0) {
            str2 = null;
        }
        return legacyLoadUseCase.getTags(str, str2);
    }

    private final AdObject getTmpAdObject(String str, boolean z10) {
        UUID fromString = UUID.fromString(str);
        k.d(fromString, "fromString(opportunityId)");
        ByteString byteString = ProtobufExtensionsKt.toByteString(fromString);
        String str2 = this.placement;
        if (str2 == null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String str3 = str2;
        ByteString EMPTY = ByteString.EMPTY;
        UnityAdsLoadOptions unityAdsLoadOptions = this.loadOptions;
        if (unityAdsLoadOptions != null) {
            boolean z11 = this.isHeaderBidding;
            DiagnosticEventRequestOuterClass.DiagnosticAdType adType = getAdType();
            k.d(EMPTY, "EMPTY");
            return new AdObject(byteString, str3, EMPTY, z10, null, null, null, false, null, null, null, unityAdsLoadOptions, z11, adType, null, null, 50672, null);
        }
        k.k(HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS);
        throw null;
    }

    public static /* synthetic */ AdObject getTmpAdObject$default(LegacyLoadUseCase legacyLoadUseCase, String str, boolean z10, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            z10 = false;
        }
        return legacyLoadUseCase.getTmpAdObject(str, z10);
    }

    public static /* synthetic */ Object invoke$default(LegacyLoadUseCase legacyLoadUseCase, Context context, String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener, UnityBannerSize unityBannerSize, c cVar, int i6, Object obj) {
        if ((i6 & 16) != 0) {
            unityBannerSize = null;
        }
        return legacyLoadUseCase.invoke(context, str, unityAdsLoadOptions, iUnityAdsLoadListener, unityBannerSize, cVar);
    }

    private final void loadFailure(String str, LoadResult.Failure failure) {
        Double d10 = null;
        Logger.DefaultImpls.error$default(this.logger, "Failed to load ad " + getAdInfoString(str) + ", error: " + failure.getError() + " :: " + failure.getMessage(), null, 2, null);
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        j jVar = this.startTime;
        if (jVar != null) {
            d10 = Double.valueOf(TimeExtensionsKt.elapsedMillis(jVar));
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_load_failure_time", d10, getTags(failure.getReason(), failure.getReasonDebug()), null, getTmpAdObject(str, failure.isScarAd()), null, 40, null);
        this.safeCallbackInvoke.invoke(new LegacyLoadUseCase$loadFailure$1(this, failure));
    }

    private final j loadStart(String str) {
        long b10 = ef.i.b();
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_load_started", null, getTags$default(this, null, null, 3, null), null, getTmpAdObject$default(this, str, false, 2, null), null, 42, null);
        return new ef.k(b10);
    }

    private final void loadSuccess(AdObject adObject) {
        Double d10;
        this.logger.info("Successfully loaded ad " + getAdInfoString(ProtobufExtensionsKt.toUUID(adObject.getOpportunityId()).toString()));
        ((f1) adObject.getState()).g(AdObjectState.LOADED);
        this.cleanUpWhenOpportunityExpires.invoke(adObject);
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        j jVar = this.startTime;
        if (jVar != null) {
            d10 = Double.valueOf(TimeExtensionsKt.elapsedMillis(jVar));
        } else {
            d10 = null;
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_load_success_time", d10, getTags$default(this, null, null, 3, null), null, adObject, null, 40, null);
        this.safeCallbackInvoke.invoke(new LegacyLoadUseCase$loadSuccess$1(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00de A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:12:0x003d, B:13:0x00da, B:15:0x00de, B:16:0x00fd, B:18:0x0101, B:22:0x010b, B:24:0x010f), top: B:11:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0101 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:12:0x003d, B:13:0x00da, B:15:0x00de, B:16:0x00fd, B:18:0x0101, B:22:0x010b, B:24:0x010f), top: B:11:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010b A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:12:0x003d, B:13:0x00da, B:15:0x00de, B:16:0x00fd, B:18:0x0101, B:22:0x010b, B:24:0x010f), top: B:11:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(android.content.Context r22, java.lang.String r23, com.unity3d.ads.UnityAdsLoadOptions r24, com.unity3d.ads.IUnityAdsLoadListener r25, com.unity3d.services.banners.UnityBannerSize r26, le.c r27) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyLoadUseCase.invoke(android.content.Context, java.lang.String, com.unity3d.ads.UnityAdsLoadOptions, com.unity3d.ads.IUnityAdsLoadListener, com.unity3d.services.banners.UnityBannerSize, le.c):java.lang.Object");
    }
}
