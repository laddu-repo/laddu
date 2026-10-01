package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.ExposedFunctionLocation;
import com.unity3d.ads.core.data.model.AdData;
import com.unity3d.ads.core.data.model.AdDataRefreshToken;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.ImpressionConfig;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import he.i;
import ie.w;
import j1.f0;
import kf.h;
import kf.u0;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import ve.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class HandleInvocationsFromAdViewer implements IServiceComponent {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_ACTION = "action";
    public static final String KEY_AD_DATA = "adData";
    public static final String KEY_AD_DATA_REFRESH_TOKEN = "adDataRefreshToken";
    public static final String KEY_AD_STRING = "adString";
    public static final String KEY_AD_TYPE = "type";
    public static final String KEY_AD_UNIT_ID = "adUnitId";
    public static final String KEY_DOWNLOAD_PRIORITY = "priority";
    public static final String KEY_DOWNLOAD_URL = "url";
    public static final String KEY_EXTRAS = "extras";
    public static final String KEY_IMPRESSION_CONFIG = "impressionConfig";
    public static final String KEY_IS_HEADER_BIDDING = "isHeaderBidding";
    public static final String KEY_LOAD_OPTIONS = "loadOptions";
    public static final String KEY_NATIVE_CONTEXT = "nativeContext";
    public static final String KEY_OMID = "openMeasurement";
    public static final String KEY_OMJS_SERVICE = "serviceFilePath";
    public static final String KEY_OMJS_SESSION = "sessionFilePath";
    public static final String KEY_OM_PARTNER = "partnerName";
    public static final String KEY_OM_PARTNER_VERSION = "partnerVersion";
    public static final String KEY_OM_VERSION = "version";
    public static final String KEY_PACKAGE_NAME = "packageName";
    public static final String KEY_PLACEMENT_ID = "placementId";
    public static final String KEY_PLACEMENT_NAME = "placementName";
    public static final String KEY_PRIVACY_UPDATE_CONTENT = "content";
    public static final String KEY_PRIVACY_UPDATE_VERSION = "version";
    public static final String KEY_QUERY_ID = "queryId";
    public static final String KEY_TRACKING_TOKEN = "trackingToken";
    public static final String KEY_USE_ACTIVITY_FOR_RESULT = "useActivityForResult";
    public static final String KEY_VIDEO_LENGTH = "videoLength";

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    public final h invoke(u0 onInvocations, String adData, String adDataRefreshToken, String impressionConfig, AdObject adObject, l onSubscription) {
        k.e(onInvocations, "onInvocations");
        k.e(adData, "adData");
        k.e(adDataRefreshToken, "adDataRefreshToken");
        k.e(impressionConfig, "impressionConfig");
        k.e(adObject, "adObject");
        k.e(onSubscription, "onSubscription");
        return new f0(6, new f0(onInvocations, new HandleInvocationsFromAdViewer$invoke$1(onSubscription, null)), new HandleInvocationsFromAdViewer$invoke$2(w.y(new i(ExposedFunctionLocation.GET_AD_CONTEXT, new HandleInvocationsFromAdViewer$invoke$definition$1(this, AdData.m33constructorimpl(adData), ImpressionConfig.m47constructorimpl(impressionConfig), AdDataRefreshToken.m40constructorimpl(adDataRefreshToken), adObject)), new i(ExposedFunctionLocation.GET_CONNECTION_TYPE, new HandleInvocationsFromAdViewer$invoke$definition$2(this)), new i(ExposedFunctionLocation.GET_DEVICE_VOLUME, new HandleInvocationsFromAdViewer$invoke$definition$3(this)), new i(ExposedFunctionLocation.GET_DEVICE_MAX_VOLUME, new HandleInvocationsFromAdViewer$invoke$definition$4(this)), new i(ExposedFunctionLocation.GET_SCREEN_HEIGHT, new HandleInvocationsFromAdViewer$invoke$definition$5(this)), new i(ExposedFunctionLocation.GET_SCREEN_WIDTH, new HandleInvocationsFromAdViewer$invoke$definition$6(this)), new i(ExposedFunctionLocation.OPEN_URL, new HandleInvocationsFromAdViewer$invoke$definition$7(adObject, this)), new i(ExposedFunctionLocation.SET_ORIENTATION, new HandleInvocationsFromAdViewer$invoke$definition$8(adObject)), new i(ExposedFunctionLocation.SEND_OPERATIVE_EVENT, new HandleInvocationsFromAdViewer$invoke$definition$9(this, adObject)), new i(ExposedFunctionLocation.STORAGE_WRITE, HandleInvocationsFromAdViewer$invoke$definition$10.INSTANCE), new i(ExposedFunctionLocation.STORAGE_READ, HandleInvocationsFromAdViewer$invoke$definition$11.INSTANCE), new i(ExposedFunctionLocation.STORAGE_DELETE, HandleInvocationsFromAdViewer$invoke$definition$12.INSTANCE), new i(ExposedFunctionLocation.STORAGE_CLEAR, HandleInvocationsFromAdViewer$invoke$definition$13.INSTANCE), new i(ExposedFunctionLocation.STORAGE_GET_KEYS, HandleInvocationsFromAdViewer$invoke$definition$14.INSTANCE), new i(ExposedFunctionLocation.STORAGE_GET, HandleInvocationsFromAdViewer$invoke$definition$15.INSTANCE), new i(ExposedFunctionLocation.STORAGE_SET, HandleInvocationsFromAdViewer$invoke$definition$16.INSTANCE), new i(ExposedFunctionLocation.GET_PRIVACY_FSM, new HandleInvocationsFromAdViewer$invoke$definition$17(this)), new i(ExposedFunctionLocation.SET_PRIVACY_FSM, new HandleInvocationsFromAdViewer$invoke$definition$18(this)), new i(ExposedFunctionLocation.GET_PRIVACY, new HandleInvocationsFromAdViewer$invoke$definition$19(this)), new i(ExposedFunctionLocation.SET_PRIVACY, new HandleInvocationsFromAdViewer$invoke$definition$20(this)), new i(ExposedFunctionLocation.GET_ALLOWED_PII, new HandleInvocationsFromAdViewer$invoke$definition$21(this)), new i(ExposedFunctionLocation.SET_ALLOWED_PII, new HandleInvocationsFromAdViewer$invoke$definition$22(this)), new i(ExposedFunctionLocation.GET_SESSION_TOKEN, new HandleInvocationsFromAdViewer$invoke$definition$23(this)), new i(ExposedFunctionLocation.MARK_CAMPAIGN_STATE_SHOWN, new HandleInvocationsFromAdViewer$invoke$definition$24(this, adObject)), new i(ExposedFunctionLocation.REFRESH_AD_DATA, new HandleInvocationsFromAdViewer$invoke$definition$25(this, adObject)), new i(ExposedFunctionLocation.UPDATE_CAMPAIGN_STATE, new HandleInvocationsFromAdViewer$invoke$definition$26(this, adObject)), new i(ExposedFunctionLocation.UPDATE_TRACKING_TOKEN, new HandleInvocationsFromAdViewer$invoke$definition$27(adObject)), new i(ExposedFunctionLocation.SEND_PRIVACY_UPDATE_REQUEST, new HandleInvocationsFromAdViewer$invoke$definition$28(this)), new i(ExposedFunctionLocation.SEND_DIAGNOSTIC_EVENT, new HandleInvocationsFromAdViewer$invoke$definition$29(this, adObject)), new i(ExposedFunctionLocation.INCREMENT_BANNER_IMPRESSION_COUNT, new HandleInvocationsFromAdViewer$invoke$definition$30(this)), new i(ExposedFunctionLocation.DOWNLOAD, new HandleInvocationsFromAdViewer$invoke$definition$31(this, adObject)), new i(ExposedFunctionLocation.IS_FILE_CACHED, new HandleInvocationsFromAdViewer$invoke$definition$32(this)), new i(ExposedFunctionLocation.OM_START_SESSION, new HandleInvocationsFromAdViewer$invoke$definition$33(this, adObject)), new i(ExposedFunctionLocation.OM_FINISH_SESSION, new HandleInvocationsFromAdViewer$invoke$definition$34(this, adObject)), new i(ExposedFunctionLocation.OM_IMPRESSION, new HandleInvocationsFromAdViewer$invoke$definition$35(this, adObject)), new i(ExposedFunctionLocation.OM_GET_DATA, new HandleInvocationsFromAdViewer$invoke$definition$36(this)), new i(ExposedFunctionLocation.IS_ATTRIBUTION_AVAILABLE, new HandleInvocationsFromAdViewer$invoke$definition$37(this)), new i(ExposedFunctionLocation.ATTRIBUTION_REGISTER_VIEW, new HandleInvocationsFromAdViewer$invoke$definition$38(this, adObject)), new i(ExposedFunctionLocation.ATTRIBUTION_REGISTER_CLICK, new HandleInvocationsFromAdViewer$invoke$definition$39(this, adObject)), new i(ExposedFunctionLocation.LOAD_SCAR_AD, new HandleInvocationsFromAdViewer$invoke$definition$40(this, adObject)), new i(ExposedFunctionLocation.SHOW_SCAR_AD, HandleInvocationsFromAdViewer$invoke$definition$41.INSTANCE), new i(ExposedFunctionLocation.HEADER_BIDDING_TOKEN_INCREMENT_WINS, new HandleInvocationsFromAdViewer$invoke$definition$42(this)), new i(ExposedFunctionLocation.HEADER_BIDDING_TOKEN_INCREMENT_STARTS, new HandleInvocationsFromAdViewer$invoke$definition$43(this)), new i(ExposedFunctionLocation.HEADER_BIDDING_TOKEN_RESET, new HandleInvocationsFromAdViewer$invoke$definition$44(this)), new i(ExposedFunctionLocation.LOAD_OFFERWALL_AD, new HandleInvocationsFromAdViewer$invoke$definition$45(this, adObject)), new i(ExposedFunctionLocation.SHOW_OFFERWALL_AD, HandleInvocationsFromAdViewer$invoke$definition$46.INSTANCE), new i(ExposedFunctionLocation.IS_OFFERWALL_AD_READY, new HandleInvocationsFromAdViewer$invoke$definition$47(this)), new i(ExposedFunctionLocation.REQUEST_GET, new HandleInvocationsFromAdViewer$invoke$definition$48(this)), new i(ExposedFunctionLocation.REQUEST_POST, new HandleInvocationsFromAdViewer$invoke$definition$49(this)), new i(ExposedFunctionLocation.REQUEST_HEAD, new HandleInvocationsFromAdViewer$invoke$definition$50(this)), new i(ExposedFunctionLocation.SET_OPPORTUNITY_TTL, new HandleInvocationsFromAdViewer$invoke$definition$51(adObject))), null));
    }
}
