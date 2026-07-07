package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.adplayer.model.ShowStatus;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import ef.j;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.OperativeEventErrorDataKt;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import he.i;
import he.y;
import ie.w;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kf.f1;
import kf.r0;
import kf.y0;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import le.c;
import okhttp3.HttpUrl;
import org.json.JSONObject;
import ve.r;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class LegacyShowUseCase {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_OBJECT_ID = "objectId";
    public static final String MESSAGE_AD_OBJECT_EXPIRED = "The ad has expired";
    public static final String MESSAGE_AD_PLAYER_UNAVAILABLE = "Ad player is unavailable.";
    public static final String MESSAGE_ALREADY_SHOWING = "Can't show a new ad unit when ad unit is already open";
    public static final String MESSAGE_NO_AD_OBJECT = "No ad object found for opportunity id: ";
    public static final String MESSAGE_OPPORTUNITY_ID = "No valid opportunity id provided";
    public static final String MESSAGE_OPT_TIMEOUT = "timeout";
    public static final String MESSAGE_PLACEMENT_NOT_LOADED = "Placement %s must be Loaded before calling Show";
    public static final String MESSAGE_TIMEOUT = "[UnityAds] Timeout while trying to show ";
    public static final String MSG_OPPORTUNITY_AND_PLACEMENT_NOT_MATCHING = "[UnityAds] Object ID and Placement ID provided does not match previously loaded ad";
    private static volatile boolean isFullscreenAdShowing;
    private AdObject adObject;
    private final AdRepository adRepository;
    private final GetInitializationState getInitializationState;
    private final GetOperativeEventApi getOperativeEventApi;
    private final r0 hasStarted;
    private final Logger logger;
    private String placement;
    private final SafeCallbackInvoke safeCallbackInvoke;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final Show show;
    private final r0 timeoutCancellationRequested;
    private UnityAdsShowOptions unityAdsShowOptions;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private Companion() {
        }
    }

    public LegacyShowUseCase(Show show, AdRepository adRepository, SendDiagnosticEvent sendDiagnosticEvent, GetOperativeEventApi getOperativeEventApi, GetInitializationState getInitializationState, SessionRepository sessionRepository, SafeCallbackInvoke safeCallbackInvoke, Logger logger) {
        k.e(show, "show");
        k.e(adRepository, "adRepository");
        k.e(sendDiagnosticEvent, "sendDiagnosticEvent");
        k.e(getOperativeEventApi, "getOperativeEventApi");
        k.e(getInitializationState, "getInitializationState");
        k.e(sessionRepository, "sessionRepository");
        k.e(safeCallbackInvoke, "safeCallbackInvoke");
        k.e(logger, "logger");
        this.show = show;
        this.adRepository = adRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getOperativeEventApi = getOperativeEventApi;
        this.getInitializationState = getInitializationState;
        this.sessionRepository = sessionRepository;
        this.safeCallbackInvoke = safeCallbackInvoke;
        this.logger = logger;
        Boolean bool = Boolean.FALSE;
        this.hasStarted = y0.c(bool);
        this.timeoutCancellationRequested = y0.c(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bannerLeftApplication(j jVar, String str, Listeners listeners) {
        this.logger.info("Left app while showing ad " + getAdInfoString());
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_left_app", Double.valueOf(TimeExtensionsKt.elapsedMillis(jVar)), null, null, this.adObject, null, 44, null);
        this.safeCallbackInvoke.invoke(new LegacyShowUseCase$bannerLeftApplication$1(listeners, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelTimeout(j jVar) {
        r0 r0Var = this.timeoutCancellationRequested;
        Boolean bool = Boolean.TRUE;
        f1 f1Var = (f1) r0Var;
        f1Var.getClass();
        f1Var.h(null, bool);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_cancel_timeout", Double.valueOf(TimeExtensionsKt.elapsedMillis(jVar)), null, null, this.adObject, null, 44, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getAdInfoString() {
        String str;
        ByteString opportunityId;
        StringBuilder sb2 = new StringBuilder("for placement ");
        AdObject adObject = this.adObject;
        UUID uuid = null;
        if (adObject != null) {
            str = adObject.getPlacementId();
        } else {
            str = null;
        }
        sb2.append(str);
        sb2.append(" with instance id ");
        AdObject adObject2 = this.adObject;
        if (adObject2 != null && (opportunityId = adObject2.getOpportunityId()) != null) {
            uuid = ProtobufExtensionsKt.toUUID(opportunityId);
        }
        sb2.append(uuid);
        return sb2.toString();
    }

    private final String getOpportunityId(UnityAdsShowOptions unityAdsShowOptions) {
        Object opt;
        String obj;
        JSONObject data = unityAdsShowOptions.getData();
        if (data != null && (opt = data.opt("objectId")) != null && (obj = opt.toString()) != null) {
            return UUID.fromString(obj).toString();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> getTags(String str, Integer num, String str2) {
        LinkedHashMap z10 = w.z(new i("operation", OperationType.SHOW.toString()), new i("reason", str));
        if (num != null) {
        }
        if (str2 != null) {
            z10.put("reason_debug", str2);
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdObject getTmpAdObject(String str) {
        UUID fromString = UUID.fromString(str);
        k.d(fromString, "fromString(opportunityId)");
        ByteString byteString = ProtobufExtensionsKt.toByteString(fromString);
        AdObject ad2 = this.adRepository.getAd(byteString);
        if (ad2 != null) {
            return ad2;
        }
        String str2 = this.placement;
        if (str2 == null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        ByteString EMPTY = ByteString.EMPTY;
        k.d(EMPTY, "EMPTY");
        return new AdObject(byteString, str2, EMPTY, false, null, null, null, false, null, null, null, new UnityAdsLoadOptions(), false, DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_UNSPECIFIED, null, null, 50680, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object sendOperativeError(OperativeEventRequestOuterClass.OperativeEventErrorType operativeEventErrorType, String str, AdObject adObject, c cVar) {
        OperativeEventErrorDataKt.Dsl.Companion companion = OperativeEventErrorDataKt.Dsl.Companion;
        OperativeEventRequestOuterClass.OperativeEventErrorData.Builder newBuilder = OperativeEventRequestOuterClass.OperativeEventErrorData.newBuilder();
        k.d(newBuilder, "newBuilder()");
        OperativeEventErrorDataKt.Dsl _create = companion._create(newBuilder);
        _create.setErrorType(operativeEventErrorType);
        _create.setMessage(str);
        OperativeEventRequestOuterClass.OperativeEventErrorData _build = _create._build();
        GetOperativeEventApi getOperativeEventApi = this.getOperativeEventApi;
        OperativeEventRequestOuterClass.OperativeEventType operativeEventType = OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_SHOW_ERROR;
        ByteString byteString = _build.toByteString();
        k.d(byteString, "errorData.toByteString()");
        Object invoke = getOperativeEventApi.invoke(operativeEventType, adObject, byteString, cVar);
        if (invoke == me.a.f8833x) {
            return invoke;
        }
        return y.f6101a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showClicked(j jVar, String str, Listeners listeners) {
        this.logger.info("Clicked on ad " + getAdInfoString());
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_clicked", Double.valueOf(TimeExtensionsKt.elapsedMillis(jVar)), null, null, this.adObject, null, 44, null);
        this.safeCallbackInvoke.invoke(new LegacyShowUseCase$showClicked$1(listeners, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCompleted(j jVar, String str, ShowStatus showStatus, Listeners listeners, String str2, String str3) {
        this.logger.info("Finished showing ad " + getAdInfoString());
        je.f fVar = new je.f();
        if (str2 != null) {
        }
        if (str3 != null) {
            fVar.put("reason_debug", str3);
        }
        je.f b10 = fVar.b();
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_success_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(jVar)), b10, null, this.adObject, null, 40, null);
        this.safeCallbackInvoke.invoke(new LegacyShowUseCase$showCompleted$1(listeners, str, showStatus, this));
    }

    public static /* synthetic */ void showCompleted$default(LegacyShowUseCase legacyShowUseCase, j jVar, String str, ShowStatus showStatus, Listeners listeners, String str2, String str3, int i6, Object obj) {
        if ((i6 & 16) != 0) {
            str2 = null;
        }
        if ((i6 & 32) != 0) {
            str3 = null;
        }
        legacyShowUseCase.showCompleted(jVar, str, showStatus, listeners, str2, str3);
    }

    private final r showError(j jVar, String str, String str2, Listeners listeners) {
        return new LegacyShowUseCase$showError$1(this, str2, jVar, listeners, str, null);
    }

    private final void showStart(String str) {
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_started", null, null, null, getTmpAdObject(str), null, 46, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showStarted(j jVar, String str, Listeners listeners) {
        this.logger.info("Started showing ad " + getAdInfoString());
        r0 r0Var = this.hasStarted;
        Boolean bool = Boolean.TRUE;
        f1 f1Var = (f1) r0Var;
        f1Var.getClass();
        f1Var.h(null, bool);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_wv_started", Double.valueOf(TimeExtensionsKt.elapsedMillis(jVar)), null, null, this.adObject, null, 44, null);
        this.safeCallbackInvoke.invoke(new LegacyShowUseCase$showStarted$1(listeners, str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0218, code lost:
    
        if (r13.invoke("already_showing", r11, com.unity3d.ads.core.domain.LegacyShowUseCase.MESSAGE_ALREADY_SHOWING, null, null, r15) == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0246, code lost:
    
        if (r13.invoke("placement_validation", r11, com.unity3d.ads.core.domain.LegacyShowUseCase.MSG_OPPORTUNITY_AND_PLACEMENT_NOT_MATCHING, null, null, r15) == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011a, code lost:
    
        if (r13.invoke("not_initialized", r11, com.unity3d.ads.core.data.model.LoadResult.MSG_NOT_INITIALIZED, null, null, r15) == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0131, code lost:
    
        if (r13.invoke("placement_null", r11, com.unity3d.ads.core.data.model.LoadResult.MSG_PLACEMENT_NULL, null, null, r15) == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0159, code lost:
    
        if (r13.invoke("no_opportunity_id", r11, com.unity3d.ads.core.domain.LegacyShowUseCase.MESSAGE_OPPORTUNITY_ID, null, r12, r15) == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0179, code lost:
    
        if (r13.invoke("placement_not_loaded", r11, r12, null, null, r15) == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a6, code lost:
    
        if (r13.invoke("ad_object_not_found", r11, r12, null, null, r15) == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01f8, code lost:
    
        if (r13.invoke("ad_player_scope_not_active", r11, com.unity3d.ads.core.domain.LegacyShowUseCase.MESSAGE_AD_PLAYER_UNAVAILABLE, null, null, r15) == r3) goto L66;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x002b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.String r25, com.unity3d.ads.UnityAdsShowOptions r26, com.unity3d.ads.core.data.model.Listeners r27, le.c r28) {
        /*
            Method dump skipped, instructions count: 708
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyShowUseCase.invoke(java.lang.String, com.unity3d.ads.UnityAdsShowOptions, com.unity3d.ads.core.data.model.Listeners, le.c):java.lang.Object");
    }
}
