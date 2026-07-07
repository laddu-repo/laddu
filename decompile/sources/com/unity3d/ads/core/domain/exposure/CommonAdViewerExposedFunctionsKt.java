package com.unity3d.ads.core.domain.exposure;

import android.util.Base64;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.CacheFile;
import com.unity3d.ads.core.domain.ExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.GetIsFileCache;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.HandleOpenUrl;
import com.unity3d.ads.core.domain.Refresh;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.SendPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.attribution.AndroidAttribution;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.domain.offerwall.GetIsOfferwallAdReady;
import com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd;
import com.unity3d.ads.core.domain.om.AndroidOmInteraction;
import com.unity3d.ads.core.domain.om.GetOmData;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.domain.om.OmImpressionOccurred;
import com.unity3d.ads.core.domain.scar.LoadScarAd;
import com.unity3d.ads.core.extensions.JSONObjectExtensionsKt;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.utils.ContinuationFromCallback;
import com.unity3d.services.core.api.Storage;
import com.unity3d.services.core.network.model.RequestType;
import ef.a;
import gatewayprotocol.v1.AllowedPiiKt;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import he.y;
import ie.i;
import java.util.Iterator;
import je.f;
import kf.f1;
import kf.r0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.n;
import le.c;
import le.j;
import org.json.JSONObject;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class CommonAdViewerExposedFunctionsKt {
    public static final ExposedFunction attributionRegisterClick(final AndroidAttribution androidAttribution, final AdObject adObject) {
        k.e(androidAttribution, "androidAttribution");
        k.e(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$attributionRegisterClick$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, ve.p
            public final Object invoke(Object[] objArr, c cVar) {
                AndroidAttribution androidAttribution2 = AndroidAttribution.this;
                Object obj = objArr[0];
                k.c(obj, "null cannot be cast to non-null type kotlin.String");
                return androidAttribution2.registerClick((String) obj, adObject, cVar);
            }
        };
    }

    public static final ExposedFunction attributionRegisterView(final AndroidAttribution androidAttribution, final AdObject adObject) {
        k.e(androidAttribution, "androidAttribution");
        k.e(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$attributionRegisterView$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, ve.p
            public final Object invoke(Object[] objArr, c cVar) {
                AndroidAttribution androidAttribution2 = AndroidAttribution.this;
                Object obj = objArr[0];
                k.c(obj, "null cannot be cast to non-null type kotlin.String");
                return androidAttribution2.registerView((String) obj, adObject, cVar);
            }
        };
    }

    public static final ExposedFunction clearStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$clearStorage$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, ve.p
            public final Object invoke(Object[] objArr, c cVar) {
                j jVar = new j(a8.c.i(cVar));
                Object obj = objArr[0];
                k.c(obj, "null cannot be cast to non-null type kotlin.String");
                Storage.clear((String) obj, new ContinuationFromCallback(jVar));
                return jVar.b();
            }
        };
    }

    public static final ExposedFunction deleteStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$deleteStorage$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, ve.p
            public final Object invoke(Object[] objArr, c cVar) {
                j jVar = new j(a8.c.i(cVar));
                Object obj = objArr[0];
                k.c(obj, "null cannot be cast to non-null type kotlin.String");
                Object obj2 = objArr[1];
                k.c(obj2, "null cannot be cast to non-null type kotlin.String");
                Storage.delete((String) obj, (String) obj2, new ContinuationFromCallback(jVar));
                return jVar.b();
            }
        };
    }

    public static final ExposedFunction download(CacheFile cacheFile, AdObject adObject) {
        k.e(cacheFile, "cacheFile");
        k.e(adObject, "adObject");
        return new CommonAdViewerExposedFunctionsKt$download$1(cacheFile, adObject);
    }

    /* renamed from: getAdContext-yLuu4LI, reason: not valid java name */
    public static final ExposedFunction m65getAdContextyLuu4LI(AndroidGetAdPlayerContext getAndroidAdPlayerContext, String adData, String impressionConfig, String adDataRefreshToken, IsOMActivated isOMActivated, AdObject adObject) {
        k.e(getAndroidAdPlayerContext, "getAndroidAdPlayerContext");
        k.e(adData, "adData");
        k.e(impressionConfig, "impressionConfig");
        k.e(adDataRefreshToken, "adDataRefreshToken");
        k.e(isOMActivated, "isOMActivated");
        k.e(adObject, "adObject");
        return new CommonAdViewerExposedFunctionsKt$getAdContext$1(adData, impressionConfig, adDataRefreshToken, getAndroidAdPlayerContext, adObject, isOMActivated);
    }

    public static final ExposedFunction getAllowedPii(final DeviceInfoRepository deviceInfoRepository) {
        k.e(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getAllowedPii$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, ve.p
            public final Object invoke(Object[] objArr, c cVar) {
                String encodeToString = Base64.encodeToString(((AllowedPiiOuterClass.AllowedPii) ((f1) DeviceInfoRepository.this.getAllowedPii()).getValue()).toByteArray(), 2);
                k.d(encodeToString, "encodeToString(deviceInf…eArray(), Base64.NO_WRAP)");
                return encodeToString;
            }
        };
    }

    public static final ExposedFunction getConnectionType(final DeviceInfoRepository deviceInfoRepository) {
        k.e(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getConnectionType$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, ve.p
            public final Object invoke(Object[] objArr, c cVar) {
                DynamicDeviceInfoOuterClass.ConnectionType connectionType = DeviceInfoRepository.this.getDynamicDeviceInfo().getConnectionType();
                k.d(connectionType, "deviceInfoRepository.dyn…DeviceInfo.connectionType");
                return connectionType;
            }
        };
    }

    public static final ExposedFunction getDeviceMaxVolume(final DeviceInfoRepository deviceInfoRepository) {
        k.e(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getDeviceMaxVolume$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, ve.p
            public final Object invoke(Object[] objArr, c cVar) {
                return new Double(DeviceInfoRepository.this.getDynamicDeviceInfo().getAndroid().getMaxVolume());
            }
        };
    }

    public static final ExposedFunction getDeviceVolume(final DeviceInfoRepository deviceInfoRepository) {
        k.e(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getDeviceVolume$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, ve.p
            public final Object invoke(Object[] objArr, c cVar) {
                return new Double(DeviceInfoRepository.this.getDynamicDeviceInfo().getAndroid().getVolume());
            }
        };
    }

    public static final ExposedFunction getKeysStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getKeysStorage$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, ve.p
            public final Object invoke(Object[] objArr, c cVar) {
                j jVar = new j(a8.c.i(cVar));
                Object obj = objArr[0];
                k.c(obj, "null cannot be cast to non-null type kotlin.String");
                Object obj2 = objArr[1];
                k.c(obj2, "null cannot be cast to non-null type kotlin.String");
                Object obj3 = objArr[2];
                k.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                Storage.getKeys((String) obj, (String) obj2, (Boolean) obj3, new ContinuationFromCallback(jVar));
                return jVar.b();
            }
        };
    }

    public static final ExposedFunction getPrivacy(SessionRepository sessionRepository) {
        k.e(sessionRepository, "sessionRepository");
        return new CommonAdViewerExposedFunctionsKt$getPrivacy$1(sessionRepository);
    }

    public static final ExposedFunction getPrivacyFsm(SessionRepository sessionRepository) {
        k.e(sessionRepository, "sessionRepository");
        return new CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1(sessionRepository);
    }

    public static final ExposedFunction getScreenHeight(final DeviceInfoRepository deviceInfoRepository) {
        k.e(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getScreenHeight$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, ve.p
            public final Object invoke(Object[] objArr, c cVar) {
                return new Integer(DeviceInfoRepository.this.getDynamicDeviceInfo().getScreenHeight());
            }
        };
    }

    public static final ExposedFunction getScreenWidth(final DeviceInfoRepository deviceInfoRepository) {
        k.e(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getScreenWidth$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, ve.p
            public final Object invoke(Object[] objArr, c cVar) {
                return new Integer(DeviceInfoRepository.this.getDynamicDeviceInfo().getScreenWidth());
            }
        };
    }

    public static final ExposedFunction getSessionToken(final SessionRepository sessionRepository) {
        k.e(sessionRepository, "sessionRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getSessionToken$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, ve.p
            public final Object invoke(Object[] objArr, c cVar) {
                return ProtobufExtensionsKt.toBase64$default(SessionRepository.this.getSessionToken(), false, 1, null);
            }
        };
    }

    public static final ExposedFunction getStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getStorage$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, ve.p
            public final Object invoke(Object[] objArr, c cVar) {
                j jVar = new j(a8.c.i(cVar));
                Object obj = objArr[0];
                k.c(obj, "null cannot be cast to non-null type kotlin.String");
                Object obj2 = objArr[1];
                k.c(obj2, "null cannot be cast to non-null type kotlin.String");
                Storage.get((String) obj, (String) obj2, new ContinuationFromCallback(jVar));
                return jVar.b();
            }
        };
    }

    public static final ExposedFunction hbTokenIncrementStarts(final SessionRepository sessionRepository) {
        k.e(sessionRepository, "sessionRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$hbTokenIncrementStarts$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, ve.p
            public final Object invoke(Object[] objArr, c cVar) {
                SessionRepository.this.incrementTokenStartsCount();
                return y.f6101a;
            }
        };
    }

    public static final ExposedFunction hbTokenIncrementWins(final SessionRepository sessionRepository) {
        k.e(sessionRepository, "sessionRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$hbTokenIncrementWins$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, ve.p
            public final Object invoke(Object[] objArr, c cVar) {
                SessionRepository.this.incrementTokenWinsCount();
                return y.f6101a;
            }
        };
    }

    public static final ExposedFunction hbTokenReset(final SessionRepository sessionRepository) {
        k.e(sessionRepository, "sessionRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$hbTokenReset$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, ve.p
            public final Object invoke(Object[] objArr, c cVar) {
                SessionRepository.this.resetTokenCounters();
                return y.f6101a;
            }
        };
    }

    public static final ExposedFunction incrementBannerImpressionCount(final SessionRepository sessionRepository) {
        k.e(sessionRepository, "sessionRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$incrementBannerImpressionCount$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, ve.p
            public final Object invoke(Object[] objArr, c cVar) {
                SessionRepository.this.incrementBannerImpressionCount();
                return y.f6101a;
            }
        };
    }

    public static final ExposedFunction isAttributionAvailable(final AndroidAttribution androidAttribution) {
        k.e(androidAttribution, "androidAttribution");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$isAttributionAvailable$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, ve.p
            public final Object invoke(Object[] objArr, c cVar) {
                return AndroidAttribution.this.isAvailable(cVar);
            }
        };
    }

    public static final ExposedFunction isFileCached(final GetIsFileCache getIfFileCache) {
        k.e(getIfFileCache, "getIfFileCache");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$isFileCached$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, ve.p
            public final Object invoke(Object[] objArr, c cVar) {
                Object obj = objArr[0];
                k.c(obj, "null cannot be cast to non-null type kotlin.String");
                return GetIsFileCache.this.invoke((String) obj, cVar);
            }
        };
    }

    public static final ExposedFunction isOfferwallAdReady(final GetIsOfferwallAdReady getIsOfferwallAdReady) {
        k.e(getIsOfferwallAdReady, "getIsOfferwallAdReady");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$isOfferwallAdReady$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, ve.p
            public final Object invoke(Object[] objArr, c cVar) {
                Object obj = objArr[0];
                k.c(obj, "null cannot be cast to non-null type org.json.JSONObject");
                String placementName = ((JSONObject) obj).optString(HandleInvocationsFromAdViewer.KEY_PLACEMENT_NAME);
                GetIsOfferwallAdReady getIsOfferwallAdReady2 = GetIsOfferwallAdReady.this;
                k.d(placementName, "placementName");
                return getIsOfferwallAdReady2.invoke(placementName, cVar);
            }
        };
    }

    public static final ExposedFunction loadOfferwallAd(LoadOfferwallAd loadOfferwallAd, AdObject adObject) {
        k.e(loadOfferwallAd, "loadOfferwallAd");
        k.e(adObject, "adObject");
        return new CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1(adObject, loadOfferwallAd);
    }

    public static final ExposedFunction loadScarAd(LoadScarAd loadScarAd, AdObject adObject) {
        k.e(loadScarAd, "loadScarAd");
        k.e(adObject, "adObject");
        return new CommonAdViewerExposedFunctionsKt$loadScarAd$1(adObject, loadScarAd);
    }

    public static final ExposedFunction markCampaignStateShown(final CampaignRepository campaignRepository, final AdObject adObject) {
        k.e(campaignRepository, "campaignRepository");
        k.e(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$markCampaignStateShown$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, ve.p
            public final Object invoke(Object[] objArr, c cVar) {
                CampaignRepository.this.setShowTimestamp(adObject.getOpportunityId());
                return y.f6101a;
            }
        };
    }

    public static final ExposedFunction omFinishSession(OmFinishSession omFinishSession, AdObject adObject) {
        k.e(omFinishSession, "omFinishSession");
        k.e(adObject, "adObject");
        return new CommonAdViewerExposedFunctionsKt$omFinishSession$1(omFinishSession, adObject);
    }

    public static final ExposedFunction omGetData(GetOmData getOmData) {
        k.e(getOmData, "getOmData");
        return new CommonAdViewerExposedFunctionsKt$omGetData$1(getOmData);
    }

    public static final ExposedFunction omImpression(OmImpressionOccurred omImpressionOccurred, AdObject adObject) {
        k.e(omImpressionOccurred, "omImpressionOccurred");
        k.e(adObject, "adObject");
        return new CommonAdViewerExposedFunctionsKt$omImpression$1(omImpressionOccurred, adObject);
    }

    public static final ExposedFunction omStartSession(AndroidOmInteraction omStartSession, AdObject adObject) {
        k.e(omStartSession, "omStartSession");
        k.e(adObject, "adObject");
        return new CommonAdViewerExposedFunctionsKt$omStartSession$1(omStartSession, adObject);
    }

    public static final ExposedFunction openUrl(final AdObject adObject, final HandleOpenUrl handleOpenUrl) {
        k.e(adObject, "adObject");
        k.e(handleOpenUrl, "handleOpenUrl");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$openUrl$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, ve.p
            public final Object invoke(Object[] objArr, c cVar) {
                Object obj = objArr[0];
                k.c(obj, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj;
                Object m02 = i.m0(1, objArr);
                JSONObject jSONObject = m02 instanceof JSONObject ? (JSONObject) m02 : null;
                String optString = jSONObject != null ? jSONObject.optString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME) : null;
                String optString2 = jSONObject != null ? jSONObject.optString(HandleInvocationsFromAdViewer.KEY_ACTION, "android.intent.action.VIEW") : null;
                JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject(HandleInvocationsFromAdViewer.KEY_EXTRAS) : null;
                return HandleOpenUrl.this.invoke(adObject, str, optString, optString2, optJSONObject != null ? JSONObjectExtensionsKt.toBuiltInMap(optJSONObject) : null, jSONObject != null ? jSONObject.optBoolean(HandleInvocationsFromAdViewer.KEY_USE_ACTIVITY_FOR_RESULT) : false, cVar);
            }
        };
    }

    public static final ExposedFunction readStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$readStorage$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, ve.p
            public final Object invoke(Object[] objArr, c cVar) {
                j jVar = new j(a8.c.i(cVar));
                Object obj = objArr[0];
                k.c(obj, "null cannot be cast to non-null type kotlin.String");
                Storage.read((String) obj, new ContinuationFromCallback(jVar));
                return jVar.b();
            }
        };
    }

    public static final ExposedFunction refreshAdData(Refresh refresh, AdObject adObject) {
        k.e(refresh, "refresh");
        k.e(adObject, "adObject");
        return new CommonAdViewerExposedFunctionsKt$refreshAdData$1(refresh, adObject);
    }

    public static final ExposedFunction request(RequestType type, ExecuteAdViewerRequest executeAdViewerRequest) {
        k.e(type, "type");
        k.e(executeAdViewerRequest, "executeAdViewerRequest");
        return new CommonAdViewerExposedFunctionsKt$request$1(executeAdViewerRequest, type);
    }

    public static final ExposedFunction sendDiagnosticEvent(final SendDiagnosticEvent sendDiagnosticEvent, final AdObject adObject) {
        k.e(sendDiagnosticEvent, "sendDiagnosticEvent");
        k.e(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendDiagnosticEvent$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, ve.p
            public final Object invoke(Object[] objArr, c cVar) {
                String obj;
                Object obj2 = objArr[0];
                k.c(obj2, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj2;
                Object obj3 = objArr[1];
                k.c(obj3, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj3;
                f fVar = new f();
                Iterator<String> keys = jSONObject.keys();
                k.d(keys, "tags.keys()");
                while (keys.hasNext()) {
                    String next = keys.next();
                    fVar.put(next, jSONObject.getString(next));
                }
                f b10 = fVar.b();
                Object m02 = i.m0(2, objArr);
                SendDiagnosticEvent.DefaultImpls.invoke$default(SendDiagnosticEvent.this, str, (m02 == null || (obj = m02.toString()) == null) ? null : new Double(Double.parseDouble(obj)), b10, null, adObject, null, 40, null);
                return y.f6101a;
            }
        };
    }

    public static final ExposedFunction sendOperativeEvent(GetOperativeEventApi getOperativeEventApi, AdObject adObject) {
        k.e(getOperativeEventApi, "getOperativeEventApi");
        k.e(adObject, "adObject");
        return new CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1(getOperativeEventApi, adObject);
    }

    public static final ExposedFunction sendPrivacyUpdateRequest(SendPrivacyUpdateRequest sendPrivacyUpdateRequest) {
        k.e(sendPrivacyUpdateRequest, "sendPrivacyUpdateRequest");
        return new CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1(sendPrivacyUpdateRequest);
    }

    public static final ExposedFunction setAllowedPii(final DeviceInfoRepository deviceInfoRepository) {
        k.e(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setAllowedPii$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, ve.p
            public final Object invoke(Object[] objArr, c cVar) {
                f1 f1Var;
                Object value;
                final AllowedPiiKt.Dsl _create;
                Object obj = objArr[0];
                k.c(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                r0 allowedPii = DeviceInfoRepository.this.getAllowedPii();
                do {
                    f1Var = (f1) allowedPii;
                    value = f1Var.getValue();
                    AllowedPiiKt.Dsl.Companion companion = AllowedPiiKt.Dsl.Companion;
                    AllowedPiiOuterClass.AllowedPii.Builder builder = ((AllowedPiiOuterClass.AllowedPii) value).toBuilder();
                    k.d(builder, "this.toBuilder()");
                    _create = companion._create(builder);
                    Object opt = jSONObject.opt("idfa");
                    Boolean bool = opt instanceof Boolean ? (Boolean) opt : null;
                    if (bool != null) {
                        new n(_create) { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$2
                            @Override // bf.l
                            public Object get() {
                                return Boolean.valueOf(((AllowedPiiKt.Dsl) this.receiver).getIdfa());
                            }

                            @Override // bf.i
                            public void set(Object obj2) {
                                ((AllowedPiiKt.Dsl) this.receiver).setIdfa(((Boolean) obj2).booleanValue());
                            }
                        }.set(bool);
                    }
                    Object opt2 = jSONObject.opt("idfv");
                    Boolean bool2 = opt2 instanceof Boolean ? (Boolean) opt2 : null;
                    if (bool2 != null) {
                        new n(_create) { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$4
                            @Override // bf.l
                            public Object get() {
                                return Boolean.valueOf(((AllowedPiiKt.Dsl) this.receiver).getIdfv());
                            }

                            @Override // bf.i
                            public void set(Object obj2) {
                                ((AllowedPiiKt.Dsl) this.receiver).setIdfv(((Boolean) obj2).booleanValue());
                            }
                        }.set(bool2);
                    }
                    Object opt3 = jSONObject.opt("appset_id");
                    Boolean bool3 = opt3 instanceof Boolean ? (Boolean) opt3 : null;
                    if (bool3 != null) {
                        new n(_create) { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$6
                            @Override // bf.l
                            public Object get() {
                                return Boolean.valueOf(((AllowedPiiKt.Dsl) this.receiver).getAppsetId());
                            }

                            @Override // bf.i
                            public void set(Object obj2) {
                                ((AllowedPiiKt.Dsl) this.receiver).setAppsetId(((Boolean) obj2).booleanValue());
                            }
                        }.set(bool3);
                    }
                } while (!f1Var.f(value, _create._build()));
                return y.f6101a;
            }
        };
    }

    public static final ExposedFunction setOpportunityTTL(final AdObject adObject) {
        k.e(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOpportunityTTL$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, ve.p
            public final Object invoke(Object[] objArr, c cVar) {
                Object obj = objArr[0];
                k.c(obj, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((Integer) obj).intValue();
                r0 ttl = AdObject.this.getTtl();
                int i6 = a.A;
                a aVar = new a(ef.f.o(intValue, ef.c.SECONDS));
                f1 f1Var = (f1) ttl;
                f1Var.getClass();
                f1Var.h(null, aVar);
                return y.f6101a;
            }
        };
    }

    public static final ExposedFunction setOrientation(AdObject adObject) {
        k.e(adObject, "adObject");
        return new CommonAdViewerExposedFunctionsKt$setOrientation$1(adObject);
    }

    public static final ExposedFunction setPrivacy(SessionRepository sessionRepository) {
        k.e(sessionRepository, "sessionRepository");
        return new CommonAdViewerExposedFunctionsKt$setPrivacy$1(sessionRepository);
    }

    public static final ExposedFunction setPrivacyFsm(SessionRepository sessionRepository) {
        k.e(sessionRepository, "sessionRepository");
        return new CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1(sessionRepository);
    }

    public static final ExposedFunction setStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setStorage$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, ve.p
            public final Object invoke(Object[] objArr, c cVar) {
                j jVar = new j(a8.c.i(cVar));
                Object obj = objArr[0];
                k.c(obj, "null cannot be cast to non-null type kotlin.String");
                Object obj2 = objArr[1];
                k.c(obj2, "null cannot be cast to non-null type kotlin.String");
                Storage.set((String) obj, (String) obj2, objArr[2], new ContinuationFromCallback(jVar));
                return jVar.b();
            }
        };
    }

    public static final ExposedFunction showOfferwallAd() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$showOfferwallAd$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, ve.p
            public final Object invoke(Object[] objArr, c cVar) {
                return y.f6101a;
            }
        };
    }

    public static final ExposedFunction showScarAd() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$showScarAd$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, ve.p
            public final Object invoke(Object[] objArr, c cVar) {
                return y.f6101a;
            }
        };
    }

    public static final ExposedFunction updateCampaignState(final CampaignRepository campaignRepository, final AdObject adObject) {
        k.e(campaignRepository, "campaignRepository");
        k.e(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$updateCampaignState$1
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
            
                if (r0 != null) goto L29;
             */
            @Override // com.unity3d.ads.adplayer.ExposedFunction, ve.p
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object[] r7, le.c r8) {
                /*
                    r6 = this;
                    java.lang.String r8 = "<this>"
                    kotlin.jvm.internal.k.e(r7, r8)
                    int r8 = r7.length
                    r0 = 0
                    r1 = 0
                    if (r8 != 0) goto Lc
                    r7 = r1
                    goto Le
                Lc:
                    r7 = r7[r0]
                Le:
                    boolean r8 = r7 instanceof org.json.JSONObject
                    if (r8 == 0) goto L15
                    org.json.JSONObject r7 = (org.json.JSONObject) r7
                    goto L16
                L15:
                    r7 = r1
                L16:
                    if (r7 == 0) goto Lb3
                    java.lang.String r8 = "data"
                    java.lang.String r2 = r7.optString(r8)
                    r3 = 1
                    if (r2 == 0) goto L2a
                    boolean r4 = df.m.S(r2)
                    if (r4 == 0) goto L28
                    goto L2a
                L28:
                    r4 = 0
                    goto L2b
                L2a:
                    r4 = 1
                L2b:
                    if (r4 != 0) goto Lab
                    java.lang.String r4 = "dataVersion"
                    int r7 = r7.optInt(r4)
                    if (r7 == 0) goto La3
                    com.unity3d.ads.core.data.model.AdObject r4 = com.unity3d.ads.core.data.model.AdObject.this
                    com.google.protobuf.ByteString r4 = r4.getOpportunityId()
                    com.unity3d.ads.core.data.model.AdObject r5 = com.unity3d.ads.core.data.model.AdObject.this
                    java.lang.String r5 = r5.getPlacementId()
                    kotlin.jvm.internal.k.d(r2, r8)
                    com.google.protobuf.ByteString r8 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.fromBase64$default(r2, r0, r3, r1)
                    boolean r0 = r8.isEmpty()
                    if (r0 != 0) goto L9b
                    com.unity3d.ads.core.data.repository.CampaignRepository r0 = r2
                    gatewayprotocol.v1.CampaignStateOuterClass$Campaign r0 = r0.getCampaign(r4)
                    if (r0 == 0) goto L74
                    gatewayprotocol.v1.CampaignKt$Dsl$Companion r1 = gatewayprotocol.v1.CampaignKt.Dsl.Companion
                    com.google.protobuf.GeneratedMessageLite$Builder r0 = r0.toBuilder()
                    java.lang.String r2 = "this.toBuilder()"
                    kotlin.jvm.internal.k.d(r0, r2)
                    gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder r0 = (gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder) r0
                    gatewayprotocol.v1.CampaignKt$Dsl r0 = r1._create(r0)
                    r0.setData(r8)
                    r0.setDataVersion(r7)
                    gatewayprotocol.v1.CampaignStateOuterClass$Campaign r0 = r0._build()
                    if (r0 == 0) goto L74
                    goto L93
                L74:
                    gatewayprotocol.v1.CampaignKt$Dsl$Companion r0 = gatewayprotocol.v1.CampaignKt.Dsl.Companion
                    gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder r1 = gatewayprotocol.v1.CampaignStateOuterClass.Campaign.newBuilder()
                    java.lang.String r2 = "newBuilder()"
                    kotlin.jvm.internal.k.d(r1, r2)
                    gatewayprotocol.v1.CampaignKt$Dsl r0 = r0._create(r1)
                    r0.setData(r8)
                    r0.setDataVersion(r7)
                    r0.setPlacementId(r5)
                    r0.setImpressionOpportunityId(r4)
                    gatewayprotocol.v1.CampaignStateOuterClass$Campaign r0 = r0._build()
                L93:
                    com.unity3d.ads.core.data.repository.CampaignRepository r7 = r2
                    r7.setCampaign(r4, r0)
                    he.y r7 = he.y.f6101a
                    return r7
                L9b:
                    java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                    java.lang.String r8 = "Update campaign state requires a non-empty data byte string"
                    r7.<init>(r8)
                    throw r7
                La3:
                    java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                    java.lang.String r8 = "Update campaign state requires a dataVersion integer"
                    r7.<init>(r8)
                    throw r7
                Lab:
                    java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                    java.lang.String r8 = "Update campaign state requires a data string"
                    r7.<init>(r8)
                    throw r7
                Lb3:
                    java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                    java.lang.String r8 = "Update campaign state requires a JSONObject"
                    r7.<init>(r8)
                    throw r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$updateCampaignState$1.invoke(java.lang.Object[], le.c):java.lang.Object");
            }
        };
    }

    public static final ExposedFunction updateTrackingToken(final AdObject adObject) {
        k.e(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$updateTrackingToken$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, ve.p
            public final Object invoke(Object[] objArr, c cVar) {
                Object obj = objArr[0];
                k.c(obj, "null cannot be cast to non-null type org.json.JSONObject");
                String token = ((JSONObject) obj).optString(HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN);
                if (token != null && token.length() != 0) {
                    AdObject adObject2 = AdObject.this;
                    k.d(token, "token");
                    adObject2.setTrackingToken(ProtobufExtensionsKt.fromBase64$default(token, false, 1, null));
                }
                return y.f6101a;
            }
        };
    }

    public static final ExposedFunction writeStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$writeStorage$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, ve.p
            public final Object invoke(Object[] objArr, c cVar) {
                j jVar = new j(a8.c.i(cVar));
                Object obj = objArr[0];
                k.c(obj, "null cannot be cast to non-null type kotlin.String");
                Storage.write((String) obj, new ContinuationFromCallback(jVar));
                return jVar.b();
            }
        };
    }
}
