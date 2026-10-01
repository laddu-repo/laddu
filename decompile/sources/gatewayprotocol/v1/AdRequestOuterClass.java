package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.MediationInfoOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AdRequestOuterClass {

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class AdRequest extends GeneratedMessageLite<AdRequest, Builder> implements AdRequestOrBuilder {
        public static final int AD_FORMAT_FIELD_NUMBER = 13;
        public static final int AD_REQUEST_TYPE_FIELD_NUMBER = 11;
        public static final int BANNER_SIZE_FIELD_NUMBER = 12;
        public static final int CAMPAIGN_STATE_FIELD_NUMBER = 4;
        private static final AdRequest DEFAULT_INSTANCE;
        public static final int DYNAMIC_DEVICE_INFO_FIELD_NUMBER = 3;
        public static final int EXTRAS_FIELD_NUMBER = 15;
        public static final int IMPRESSION_OPPORTUNITY_ID_FIELD_NUMBER = 5;
        public static final int MEDIATION_AD_UNIT_ID_FIELD_NUMBER = 14;
        public static final int MEDIATION_INFO_FIELD_NUMBER = 16;
        private static volatile Parser<AdRequest> PARSER = null;
        public static final int PLACEMENT_ID_FIELD_NUMBER = 6;
        public static final int REQUEST_IMPRESSION_CONFIGURATION_FIELD_NUMBER = 7;
        public static final int SCAR_SIGNAL_FIELD_NUMBER = 8;
        public static final int SESSION_COUNTERS_FIELD_NUMBER = 1;
        public static final int STATIC_DEVICE_INFO_FIELD_NUMBER = 2;
        public static final int TCF_FIELD_NUMBER = 10;
        public static final int WEBVIEW_VERSION_FIELD_NUMBER = 9;
        private int adFormat_;
        private int adRequestType_;
        private BannerSize bannerSize_;
        private int bitField0_;
        private CampaignStateOuterClass.CampaignState campaignState_;
        private DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo_;
        private MapFieldLite<String, String> extras_ = MapFieldLite.emptyMapField();
        private ByteString impressionOpportunityId_;
        private String mediationAdUnitId_;
        private MediationInfoOuterClass.MediationInfo mediationInfo_;
        private String placementId_;
        private boolean requestImpressionConfiguration_;
        private ByteString scarSignal_;
        private SessionCountersOuterClass.SessionCounters sessionCounters_;
        private StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo_;
        private ByteString tcf_;
        private int webviewVersion_;

        /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
        /* loaded from: classes.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<AdRequest, Builder> implements AdRequestOrBuilder {
            public /* synthetic */ Builder(fe.e eVar) {
                this();
            }

            public Builder clearAdFormat() {
                copyOnWrite();
                ((AdRequest) this.instance).clearAdFormat();
                return this;
            }

            public Builder clearAdRequestType() {
                copyOnWrite();
                ((AdRequest) this.instance).clearAdRequestType();
                return this;
            }

            public Builder clearBannerSize() {
                copyOnWrite();
                ((AdRequest) this.instance).clearBannerSize();
                return this;
            }

            public Builder clearCampaignState() {
                copyOnWrite();
                ((AdRequest) this.instance).clearCampaignState();
                return this;
            }

            public Builder clearDynamicDeviceInfo() {
                copyOnWrite();
                ((AdRequest) this.instance).clearDynamicDeviceInfo();
                return this;
            }

            public Builder clearExtras() {
                copyOnWrite();
                ((AdRequest) this.instance).getMutableExtrasMap().clear();
                return this;
            }

            public Builder clearImpressionOpportunityId() {
                copyOnWrite();
                ((AdRequest) this.instance).clearImpressionOpportunityId();
                return this;
            }

            public Builder clearMediationAdUnitId() {
                copyOnWrite();
                ((AdRequest) this.instance).clearMediationAdUnitId();
                return this;
            }

            public Builder clearMediationInfo() {
                copyOnWrite();
                ((AdRequest) this.instance).clearMediationInfo();
                return this;
            }

            public Builder clearPlacementId() {
                copyOnWrite();
                ((AdRequest) this.instance).clearPlacementId();
                return this;
            }

            public Builder clearRequestImpressionConfiguration() {
                copyOnWrite();
                ((AdRequest) this.instance).clearRequestImpressionConfiguration();
                return this;
            }

            public Builder clearScarSignal() {
                copyOnWrite();
                ((AdRequest) this.instance).clearScarSignal();
                return this;
            }

            public Builder clearSessionCounters() {
                copyOnWrite();
                ((AdRequest) this.instance).clearSessionCounters();
                return this;
            }

            public Builder clearStaticDeviceInfo() {
                copyOnWrite();
                ((AdRequest) this.instance).clearStaticDeviceInfo();
                return this;
            }

            public Builder clearTcf() {
                copyOnWrite();
                ((AdRequest) this.instance).clearTcf();
                return this;
            }

            public Builder clearWebviewVersion() {
                copyOnWrite();
                ((AdRequest) this.instance).clearWebviewVersion();
                return this;
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public boolean containsExtras(String str) {
                str.getClass();
                return ((AdRequest) this.instance).getExtrasMap().containsKey(str);
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public AdFormatOuterClass.AdFormat getAdFormat() {
                return ((AdRequest) this.instance).getAdFormat();
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public int getAdFormatValue() {
                return ((AdRequest) this.instance).getAdFormatValue();
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public AdRequestType getAdRequestType() {
                return ((AdRequest) this.instance).getAdRequestType();
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public int getAdRequestTypeValue() {
                return ((AdRequest) this.instance).getAdRequestTypeValue();
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public BannerSize getBannerSize() {
                return ((AdRequest) this.instance).getBannerSize();
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public CampaignStateOuterClass.CampaignState getCampaignState() {
                return ((AdRequest) this.instance).getCampaignState();
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
                return ((AdRequest) this.instance).getDynamicDeviceInfo();
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            @Deprecated
            public Map<String, String> getExtras() {
                return getExtrasMap();
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public int getExtrasCount() {
                return ((AdRequest) this.instance).getExtrasMap().size();
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public Map<String, String> getExtrasMap() {
                return Collections.unmodifiableMap(((AdRequest) this.instance).getExtrasMap());
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public String getExtrasOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> extrasMap = ((AdRequest) this.instance).getExtrasMap();
                if (extrasMap.containsKey(str)) {
                    return extrasMap.get(str);
                }
                return str2;
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public String getExtrasOrThrow(String str) {
                str.getClass();
                Map<String, String> extrasMap = ((AdRequest) this.instance).getExtrasMap();
                if (extrasMap.containsKey(str)) {
                    return extrasMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public ByteString getImpressionOpportunityId() {
                return ((AdRequest) this.instance).getImpressionOpportunityId();
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public String getMediationAdUnitId() {
                return ((AdRequest) this.instance).getMediationAdUnitId();
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public ByteString getMediationAdUnitIdBytes() {
                return ((AdRequest) this.instance).getMediationAdUnitIdBytes();
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public MediationInfoOuterClass.MediationInfo getMediationInfo() {
                return ((AdRequest) this.instance).getMediationInfo();
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public String getPlacementId() {
                return ((AdRequest) this.instance).getPlacementId();
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public ByteString getPlacementIdBytes() {
                return ((AdRequest) this.instance).getPlacementIdBytes();
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public boolean getRequestImpressionConfiguration() {
                return ((AdRequest) this.instance).getRequestImpressionConfiguration();
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public ByteString getScarSignal() {
                return ((AdRequest) this.instance).getScarSignal();
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public SessionCountersOuterClass.SessionCounters getSessionCounters() {
                return ((AdRequest) this.instance).getSessionCounters();
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
                return ((AdRequest) this.instance).getStaticDeviceInfo();
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public ByteString getTcf() {
                return ((AdRequest) this.instance).getTcf();
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public int getWebviewVersion() {
                return ((AdRequest) this.instance).getWebviewVersion();
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public boolean hasAdFormat() {
                return ((AdRequest) this.instance).hasAdFormat();
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public boolean hasAdRequestType() {
                return ((AdRequest) this.instance).hasAdRequestType();
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public boolean hasBannerSize() {
                return ((AdRequest) this.instance).hasBannerSize();
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public boolean hasCampaignState() {
                return ((AdRequest) this.instance).hasCampaignState();
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public boolean hasDynamicDeviceInfo() {
                return ((AdRequest) this.instance).hasDynamicDeviceInfo();
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public boolean hasMediationAdUnitId() {
                return ((AdRequest) this.instance).hasMediationAdUnitId();
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public boolean hasMediationInfo() {
                return ((AdRequest) this.instance).hasMediationInfo();
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public boolean hasSessionCounters() {
                return ((AdRequest) this.instance).hasSessionCounters();
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public boolean hasStaticDeviceInfo() {
                return ((AdRequest) this.instance).hasStaticDeviceInfo();
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public boolean hasTcf() {
                return ((AdRequest) this.instance).hasTcf();
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
            public boolean hasWebviewVersion() {
                return ((AdRequest) this.instance).hasWebviewVersion();
            }

            public Builder mergeBannerSize(BannerSize bannerSize) {
                copyOnWrite();
                ((AdRequest) this.instance).mergeBannerSize(bannerSize);
                return this;
            }

            public Builder mergeCampaignState(CampaignStateOuterClass.CampaignState campaignState) {
                copyOnWrite();
                ((AdRequest) this.instance).mergeCampaignState(campaignState);
                return this;
            }

            public Builder mergeDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                copyOnWrite();
                ((AdRequest) this.instance).mergeDynamicDeviceInfo(dynamicDeviceInfo);
                return this;
            }

            public Builder mergeMediationInfo(MediationInfoOuterClass.MediationInfo mediationInfo) {
                copyOnWrite();
                ((AdRequest) this.instance).mergeMediationInfo(mediationInfo);
                return this;
            }

            public Builder mergeSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
                copyOnWrite();
                ((AdRequest) this.instance).mergeSessionCounters(sessionCounters);
                return this;
            }

            public Builder mergeStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                copyOnWrite();
                ((AdRequest) this.instance).mergeStaticDeviceInfo(staticDeviceInfo);
                return this;
            }

            public Builder putAllExtras(Map<String, String> map) {
                copyOnWrite();
                ((AdRequest) this.instance).getMutableExtrasMap().putAll(map);
                return this;
            }

            public Builder putExtras(String str, String str2) {
                str.getClass();
                str2.getClass();
                copyOnWrite();
                ((AdRequest) this.instance).getMutableExtrasMap().put(str, str2);
                return this;
            }

            public Builder removeExtras(String str) {
                str.getClass();
                copyOnWrite();
                ((AdRequest) this.instance).getMutableExtrasMap().remove(str);
                return this;
            }

            public Builder setAdFormat(AdFormatOuterClass.AdFormat adFormat) {
                copyOnWrite();
                ((AdRequest) this.instance).setAdFormat(adFormat);
                return this;
            }

            public Builder setAdFormatValue(int i6) {
                copyOnWrite();
                ((AdRequest) this.instance).setAdFormatValue(i6);
                return this;
            }

            public Builder setAdRequestType(AdRequestType adRequestType) {
                copyOnWrite();
                ((AdRequest) this.instance).setAdRequestType(adRequestType);
                return this;
            }

            public Builder setAdRequestTypeValue(int i6) {
                copyOnWrite();
                ((AdRequest) this.instance).setAdRequestTypeValue(i6);
                return this;
            }

            public Builder setBannerSize(BannerSize bannerSize) {
                copyOnWrite();
                ((AdRequest) this.instance).setBannerSize(bannerSize);
                return this;
            }

            public Builder setCampaignState(CampaignStateOuterClass.CampaignState campaignState) {
                copyOnWrite();
                ((AdRequest) this.instance).setCampaignState(campaignState);
                return this;
            }

            public Builder setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                copyOnWrite();
                ((AdRequest) this.instance).setDynamicDeviceInfo(dynamicDeviceInfo);
                return this;
            }

            public Builder setImpressionOpportunityId(ByteString byteString) {
                copyOnWrite();
                ((AdRequest) this.instance).setImpressionOpportunityId(byteString);
                return this;
            }

            public Builder setMediationAdUnitId(String str) {
                copyOnWrite();
                ((AdRequest) this.instance).setMediationAdUnitId(str);
                return this;
            }

            public Builder setMediationAdUnitIdBytes(ByteString byteString) {
                copyOnWrite();
                ((AdRequest) this.instance).setMediationAdUnitIdBytes(byteString);
                return this;
            }

            public Builder setMediationInfo(MediationInfoOuterClass.MediationInfo mediationInfo) {
                copyOnWrite();
                ((AdRequest) this.instance).setMediationInfo(mediationInfo);
                return this;
            }

            public Builder setPlacementId(String str) {
                copyOnWrite();
                ((AdRequest) this.instance).setPlacementId(str);
                return this;
            }

            public Builder setPlacementIdBytes(ByteString byteString) {
                copyOnWrite();
                ((AdRequest) this.instance).setPlacementIdBytes(byteString);
                return this;
            }

            public Builder setRequestImpressionConfiguration(boolean z10) {
                copyOnWrite();
                ((AdRequest) this.instance).setRequestImpressionConfiguration(z10);
                return this;
            }

            public Builder setScarSignal(ByteString byteString) {
                copyOnWrite();
                ((AdRequest) this.instance).setScarSignal(byteString);
                return this;
            }

            public Builder setSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
                copyOnWrite();
                ((AdRequest) this.instance).setSessionCounters(sessionCounters);
                return this;
            }

            public Builder setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                copyOnWrite();
                ((AdRequest) this.instance).setStaticDeviceInfo(staticDeviceInfo);
                return this;
            }

            public Builder setTcf(ByteString byteString) {
                copyOnWrite();
                ((AdRequest) this.instance).setTcf(byteString);
                return this;
            }

            public Builder setWebviewVersion(int i6) {
                copyOnWrite();
                ((AdRequest) this.instance).setWebviewVersion(i6);
                return this;
            }

            private Builder() {
                super(AdRequest.DEFAULT_INSTANCE);
            }

            public Builder setBannerSize(BannerSize.Builder builder) {
                copyOnWrite();
                ((AdRequest) this.instance).setBannerSize(builder.build());
                return this;
            }

            public Builder setCampaignState(CampaignStateOuterClass.CampaignState.Builder builder) {
                copyOnWrite();
                ((AdRequest) this.instance).setCampaignState(builder.build());
                return this;
            }

            public Builder setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder) {
                copyOnWrite();
                ((AdRequest) this.instance).setDynamicDeviceInfo(builder.build());
                return this;
            }

            public Builder setMediationInfo(MediationInfoOuterClass.MediationInfo.Builder builder) {
                copyOnWrite();
                ((AdRequest) this.instance).setMediationInfo(builder.build());
                return this;
            }

            public Builder setSessionCounters(SessionCountersOuterClass.SessionCounters.Builder builder) {
                copyOnWrite();
                ((AdRequest) this.instance).setSessionCounters(builder.build());
                return this;
            }

            public Builder setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder) {
                copyOnWrite();
                ((AdRequest) this.instance).setStaticDeviceInfo(builder.build());
                return this;
            }
        }

        static {
            AdRequest adRequest = new AdRequest();
            DEFAULT_INSTANCE = adRequest;
            GeneratedMessageLite.registerDefaultInstance(AdRequest.class, adRequest);
        }

        private AdRequest() {
            ByteString byteString = ByteString.EMPTY;
            this.impressionOpportunityId_ = byteString;
            this.placementId_ = HttpUrl.FRAGMENT_ENCODE_SET;
            this.scarSignal_ = byteString;
            this.tcf_ = byteString;
            this.mediationAdUnitId_ = HttpUrl.FRAGMENT_ENCODE_SET;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdFormat() {
            this.bitField0_ &= -257;
            this.adFormat_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdRequestType() {
            this.bitField0_ &= -65;
            this.adRequestType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBannerSize() {
            this.bannerSize_ = null;
            this.bitField0_ &= -129;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCampaignState() {
            this.campaignState_ = null;
            this.bitField0_ &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDynamicDeviceInfo() {
            this.dynamicDeviceInfo_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImpressionOpportunityId() {
            this.impressionOpportunityId_ = getDefaultInstance().getImpressionOpportunityId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMediationAdUnitId() {
            this.bitField0_ &= -513;
            this.mediationAdUnitId_ = getDefaultInstance().getMediationAdUnitId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMediationInfo() {
            this.mediationInfo_ = null;
            this.bitField0_ &= -1025;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlacementId() {
            this.placementId_ = getDefaultInstance().getPlacementId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRequestImpressionConfiguration() {
            this.requestImpressionConfiguration_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScarSignal() {
            this.scarSignal_ = getDefaultInstance().getScarSignal();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionCounters() {
            this.sessionCounters_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStaticDeviceInfo() {
            this.staticDeviceInfo_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTcf() {
            this.bitField0_ &= -33;
            this.tcf_ = getDefaultInstance().getTcf();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWebviewVersion() {
            this.bitField0_ &= -17;
            this.webviewVersion_ = 0;
        }

        public static AdRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> getMutableExtrasMap() {
            return internalGetMutableExtras();
        }

        private MapFieldLite<String, String> internalGetExtras() {
            return this.extras_;
        }

        private MapFieldLite<String, String> internalGetMutableExtras() {
            if (!this.extras_.isMutable()) {
                this.extras_ = this.extras_.mutableCopy();
            }
            return this.extras_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBannerSize(BannerSize bannerSize) {
            bannerSize.getClass();
            BannerSize bannerSize2 = this.bannerSize_;
            if (bannerSize2 != null && bannerSize2 != BannerSize.getDefaultInstance()) {
                this.bannerSize_ = BannerSize.newBuilder(this.bannerSize_).mergeFrom((BannerSize.Builder) bannerSize).buildPartial();
            } else {
                this.bannerSize_ = bannerSize;
            }
            this.bitField0_ |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCampaignState(CampaignStateOuterClass.CampaignState campaignState) {
            campaignState.getClass();
            CampaignStateOuterClass.CampaignState campaignState2 = this.campaignState_;
            if (campaignState2 != null && campaignState2 != CampaignStateOuterClass.CampaignState.getDefaultInstance()) {
                this.campaignState_ = CampaignStateOuterClass.CampaignState.newBuilder(this.campaignState_).mergeFrom((CampaignStateOuterClass.CampaignState.Builder) campaignState).buildPartial();
            } else {
                this.campaignState_ = campaignState;
            }
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.getClass();
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo2 = this.dynamicDeviceInfo_;
            if (dynamicDeviceInfo2 != null && dynamicDeviceInfo2 != DynamicDeviceInfoOuterClass.DynamicDeviceInfo.getDefaultInstance()) {
                this.dynamicDeviceInfo_ = DynamicDeviceInfoOuterClass.DynamicDeviceInfo.newBuilder(this.dynamicDeviceInfo_).mergeFrom((DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder) dynamicDeviceInfo).buildPartial();
            } else {
                this.dynamicDeviceInfo_ = dynamicDeviceInfo;
            }
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMediationInfo(MediationInfoOuterClass.MediationInfo mediationInfo) {
            mediationInfo.getClass();
            MediationInfoOuterClass.MediationInfo mediationInfo2 = this.mediationInfo_;
            if (mediationInfo2 != null && mediationInfo2 != MediationInfoOuterClass.MediationInfo.getDefaultInstance()) {
                this.mediationInfo_ = MediationInfoOuterClass.MediationInfo.newBuilder(this.mediationInfo_).mergeFrom((MediationInfoOuterClass.MediationInfo.Builder) mediationInfo).buildPartial();
            } else {
                this.mediationInfo_ = mediationInfo;
            }
            this.bitField0_ |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
            sessionCounters.getClass();
            SessionCountersOuterClass.SessionCounters sessionCounters2 = this.sessionCounters_;
            if (sessionCounters2 != null && sessionCounters2 != SessionCountersOuterClass.SessionCounters.getDefaultInstance()) {
                this.sessionCounters_ = SessionCountersOuterClass.SessionCounters.newBuilder(this.sessionCounters_).mergeFrom((SessionCountersOuterClass.SessionCounters.Builder) sessionCounters).buildPartial();
            } else {
                this.sessionCounters_ = sessionCounters;
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.getClass();
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo2 = this.staticDeviceInfo_;
            if (staticDeviceInfo2 != null && staticDeviceInfo2 != StaticDeviceInfoOuterClass.StaticDeviceInfo.getDefaultInstance()) {
                this.staticDeviceInfo_ = StaticDeviceInfoOuterClass.StaticDeviceInfo.newBuilder(this.staticDeviceInfo_).mergeFrom((StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder) staticDeviceInfo).buildPartial();
            } else {
                this.staticDeviceInfo_ = staticDeviceInfo;
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AdRequest parseDelimitedFrom(InputStream inputStream) {
            return (AdRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdRequest parseFrom(ByteBuffer byteBuffer) {
            return (AdRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AdRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdFormat(AdFormatOuterClass.AdFormat adFormat) {
            this.adFormat_ = adFormat.getNumber();
            this.bitField0_ |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdFormatValue(int i6) {
            this.bitField0_ |= 256;
            this.adFormat_ = i6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdRequestType(AdRequestType adRequestType) {
            this.adRequestType_ = adRequestType.getNumber();
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdRequestTypeValue(int i6) {
            this.bitField0_ |= 64;
            this.adRequestType_ = i6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBannerSize(BannerSize bannerSize) {
            bannerSize.getClass();
            this.bannerSize_ = bannerSize;
            this.bitField0_ |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCampaignState(CampaignStateOuterClass.CampaignState campaignState) {
            campaignState.getClass();
            this.campaignState_ = campaignState;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.getClass();
            this.dynamicDeviceInfo_ = dynamicDeviceInfo;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImpressionOpportunityId(ByteString byteString) {
            byteString.getClass();
            this.impressionOpportunityId_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMediationAdUnitId(String str) {
            str.getClass();
            this.bitField0_ |= 512;
            this.mediationAdUnitId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMediationAdUnitIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.mediationAdUnitId_ = byteString.toStringUtf8();
            this.bitField0_ |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMediationInfo(MediationInfoOuterClass.MediationInfo mediationInfo) {
            mediationInfo.getClass();
            this.mediationInfo_ = mediationInfo;
            this.bitField0_ |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlacementId(String str) {
            str.getClass();
            this.placementId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlacementIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.placementId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRequestImpressionConfiguration(boolean z10) {
            this.requestImpressionConfiguration_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScarSignal(ByteString byteString) {
            byteString.getClass();
            this.scarSignal_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
            sessionCounters.getClass();
            this.sessionCounters_ = sessionCounters;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.getClass();
            this.staticDeviceInfo_ = staticDeviceInfo;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTcf(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 32;
            this.tcf_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWebviewVersion(int i6) {
            this.bitField0_ |= 16;
            this.webviewVersion_ = i6;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public boolean containsExtras(String str) {
            str.getClass();
            return internalGetExtras().containsKey(str);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            fe.e eVar = null;
            switch (fe.e.f5239a[methodToInvoke.ordinal()]) {
                case 1:
                    return new AdRequest();
                case 2:
                    return new Builder(eVar);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0001\u0001\u0010\u0010\u0001\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\n\u0006Ȉ\u0007\u0007\b\n\tင\u0004\nည\u0005\u000bဌ\u0006\fဉ\u0007\rဌ\b\u000eለ\t\u000f2\u0010ဉ\n", new Object[]{"bitField0_", "sessionCounters_", "staticDeviceInfo_", "dynamicDeviceInfo_", "campaignState_", "impressionOpportunityId_", "placementId_", "requestImpressionConfiguration_", "scarSignal_", "webviewVersion_", "tcf_", "adRequestType_", "bannerSize_", "adFormat_", "mediationAdUnitId_", "extras_", d.f5575a, "mediationInfo_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<AdRequest> parser2 = PARSER;
                    if (parser2 == null) {
                        synchronized (AdRequest.class) {
                            try {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return parser;
                    }
                    return parser2;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public AdFormatOuterClass.AdFormat getAdFormat() {
            AdFormatOuterClass.AdFormat forNumber = AdFormatOuterClass.AdFormat.forNumber(this.adFormat_);
            if (forNumber == null) {
                return AdFormatOuterClass.AdFormat.UNRECOGNIZED;
            }
            return forNumber;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public int getAdFormatValue() {
            return this.adFormat_;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public AdRequestType getAdRequestType() {
            AdRequestType forNumber = AdRequestType.forNumber(this.adRequestType_);
            if (forNumber == null) {
                return AdRequestType.UNRECOGNIZED;
            }
            return forNumber;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public int getAdRequestTypeValue() {
            return this.adRequestType_;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public BannerSize getBannerSize() {
            BannerSize bannerSize = this.bannerSize_;
            if (bannerSize == null) {
                return BannerSize.getDefaultInstance();
            }
            return bannerSize;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public CampaignStateOuterClass.CampaignState getCampaignState() {
            CampaignStateOuterClass.CampaignState campaignState = this.campaignState_;
            if (campaignState == null) {
                return CampaignStateOuterClass.CampaignState.getDefaultInstance();
            }
            return campaignState;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this.dynamicDeviceInfo_;
            if (dynamicDeviceInfo == null) {
                return DynamicDeviceInfoOuterClass.DynamicDeviceInfo.getDefaultInstance();
            }
            return dynamicDeviceInfo;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        @Deprecated
        public Map<String, String> getExtras() {
            return getExtrasMap();
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public int getExtrasCount() {
            return internalGetExtras().size();
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public Map<String, String> getExtrasMap() {
            return Collections.unmodifiableMap(internalGetExtras());
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public String getExtrasOrDefault(String str, String str2) {
            str.getClass();
            MapFieldLite<String, String> internalGetExtras = internalGetExtras();
            if (internalGetExtras.containsKey(str)) {
                return internalGetExtras.get(str);
            }
            return str2;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public String getExtrasOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, String> internalGetExtras = internalGetExtras();
            if (internalGetExtras.containsKey(str)) {
                return internalGetExtras.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public ByteString getImpressionOpportunityId() {
            return this.impressionOpportunityId_;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public String getMediationAdUnitId() {
            return this.mediationAdUnitId_;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public ByteString getMediationAdUnitIdBytes() {
            return ByteString.copyFromUtf8(this.mediationAdUnitId_);
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public MediationInfoOuterClass.MediationInfo getMediationInfo() {
            MediationInfoOuterClass.MediationInfo mediationInfo = this.mediationInfo_;
            if (mediationInfo == null) {
                return MediationInfoOuterClass.MediationInfo.getDefaultInstance();
            }
            return mediationInfo;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public String getPlacementId() {
            return this.placementId_;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public ByteString getPlacementIdBytes() {
            return ByteString.copyFromUtf8(this.placementId_);
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public boolean getRequestImpressionConfiguration() {
            return this.requestImpressionConfiguration_;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public ByteString getScarSignal() {
            return this.scarSignal_;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public SessionCountersOuterClass.SessionCounters getSessionCounters() {
            SessionCountersOuterClass.SessionCounters sessionCounters = this.sessionCounters_;
            if (sessionCounters == null) {
                return SessionCountersOuterClass.SessionCounters.getDefaultInstance();
            }
            return sessionCounters;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this.staticDeviceInfo_;
            if (staticDeviceInfo == null) {
                return StaticDeviceInfoOuterClass.StaticDeviceInfo.getDefaultInstance();
            }
            return staticDeviceInfo;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public ByteString getTcf() {
            return this.tcf_;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public int getWebviewVersion() {
            return this.webviewVersion_;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public boolean hasAdFormat() {
            if ((this.bitField0_ & 256) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public boolean hasAdRequestType() {
            if ((this.bitField0_ & 64) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public boolean hasBannerSize() {
            if ((this.bitField0_ & 128) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public boolean hasCampaignState() {
            if ((this.bitField0_ & 8) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public boolean hasDynamicDeviceInfo() {
            if ((this.bitField0_ & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public boolean hasMediationAdUnitId() {
            if ((this.bitField0_ & 512) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public boolean hasMediationInfo() {
            if ((this.bitField0_ & 1024) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public boolean hasSessionCounters() {
            if ((this.bitField0_ & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public boolean hasStaticDeviceInfo() {
            if ((this.bitField0_ & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public boolean hasTcf() {
            if ((this.bitField0_ & 32) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.AdRequestOrBuilder
        public boolean hasWebviewVersion() {
            if ((this.bitField0_ & 16) != 0) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(AdRequest adRequest) {
            return DEFAULT_INSTANCE.createBuilder(adRequest);
        }

        public static AdRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AdRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AdRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (AdRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AdRequest parseFrom(ByteString byteString) {
            return (AdRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AdRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (AdRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AdRequest parseFrom(byte[] bArr) {
            return (AdRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AdRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (AdRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AdRequest parseFrom(InputStream inputStream) {
            return (AdRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AdRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AdRequest parseFrom(CodedInputStream codedInputStream) {
            return (AdRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AdRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AdRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public interface AdRequestOrBuilder extends MessageLiteOrBuilder {
        boolean containsExtras(String str);

        AdFormatOuterClass.AdFormat getAdFormat();

        int getAdFormatValue();

        AdRequestType getAdRequestType();

        int getAdRequestTypeValue();

        BannerSize getBannerSize();

        CampaignStateOuterClass.CampaignState getCampaignState();

        DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo();

        @Deprecated
        Map<String, String> getExtras();

        int getExtrasCount();

        Map<String, String> getExtrasMap();

        String getExtrasOrDefault(String str, String str2);

        String getExtrasOrThrow(String str);

        ByteString getImpressionOpportunityId();

        String getMediationAdUnitId();

        ByteString getMediationAdUnitIdBytes();

        MediationInfoOuterClass.MediationInfo getMediationInfo();

        String getPlacementId();

        ByteString getPlacementIdBytes();

        boolean getRequestImpressionConfiguration();

        ByteString getScarSignal();

        SessionCountersOuterClass.SessionCounters getSessionCounters();

        StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo();

        ByteString getTcf();

        int getWebviewVersion();

        boolean hasAdFormat();

        boolean hasAdRequestType();

        boolean hasBannerSize();

        boolean hasCampaignState();

        boolean hasDynamicDeviceInfo();

        boolean hasMediationAdUnitId();

        boolean hasMediationInfo();

        boolean hasSessionCounters();

        boolean hasStaticDeviceInfo();

        boolean hasTcf();

        boolean hasWebviewVersion();
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public enum AdRequestType implements Internal.EnumLite {
        AD_REQUEST_TYPE_UNSPECIFIED(0),
        AD_REQUEST_TYPE_FULLSCREEN(1),
        AD_REQUEST_TYPE_BANNER(2),
        UNRECOGNIZED(-1);

        public static final int AD_REQUEST_TYPE_BANNER_VALUE = 2;
        public static final int AD_REQUEST_TYPE_FULLSCREEN_VALUE = 1;
        public static final int AD_REQUEST_TYPE_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<AdRequestType> internalValueMap = new Object();
        private final int value;

        AdRequestType(int i6) {
            this.value = i6;
        }

        public static AdRequestType forNumber(int i6) {
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        return null;
                    }
                    return AD_REQUEST_TYPE_BANNER;
                }
                return AD_REQUEST_TYPE_FULLSCREEN;
            }
            return AD_REQUEST_TYPE_UNSPECIFIED;
        }

        public static Internal.EnumLiteMap<AdRequestType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return f.f5578a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static AdRequestType valueOf(int i6) {
            return forNumber(i6);
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class BannerSize extends GeneratedMessageLite<BannerSize, Builder> implements BannerSizeOrBuilder {
        private static final BannerSize DEFAULT_INSTANCE;
        public static final int HEIGHT_FIELD_NUMBER = 2;
        private static volatile Parser<BannerSize> PARSER = null;
        public static final int WIDTH_FIELD_NUMBER = 1;
        private int height_;
        private int width_;

        /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
        /* loaded from: classes.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<BannerSize, Builder> implements BannerSizeOrBuilder {
            public /* synthetic */ Builder(fe.e eVar) {
                this();
            }

            public Builder clearHeight() {
                copyOnWrite();
                ((BannerSize) this.instance).clearHeight();
                return this;
            }

            public Builder clearWidth() {
                copyOnWrite();
                ((BannerSize) this.instance).clearWidth();
                return this;
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.BannerSizeOrBuilder
            public int getHeight() {
                return ((BannerSize) this.instance).getHeight();
            }

            @Override // gatewayprotocol.v1.AdRequestOuterClass.BannerSizeOrBuilder
            public int getWidth() {
                return ((BannerSize) this.instance).getWidth();
            }

            public Builder setHeight(int i6) {
                copyOnWrite();
                ((BannerSize) this.instance).setHeight(i6);
                return this;
            }

            public Builder setWidth(int i6) {
                copyOnWrite();
                ((BannerSize) this.instance).setWidth(i6);
                return this;
            }

            private Builder() {
                super(BannerSize.DEFAULT_INSTANCE);
            }
        }

        static {
            BannerSize bannerSize = new BannerSize();
            DEFAULT_INSTANCE = bannerSize;
            GeneratedMessageLite.registerDefaultInstance(BannerSize.class, bannerSize);
        }

        private BannerSize() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHeight() {
            this.height_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWidth() {
            this.width_ = 0;
        }

        public static BannerSize getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static BannerSize parseDelimitedFrom(InputStream inputStream) {
            return (BannerSize) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BannerSize parseFrom(ByteBuffer byteBuffer) {
            return (BannerSize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<BannerSize> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeight(int i6) {
            this.height_ = i6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWidth(int i6) {
            this.width_ = i6;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            fe.e eVar = null;
            switch (fe.e.f5239a[methodToInvoke.ordinal()]) {
                case 1:
                    return new BannerSize();
                case 2:
                    return new Builder(eVar);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"width_", "height_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<BannerSize> parser2 = PARSER;
                    if (parser2 == null) {
                        synchronized (BannerSize.class) {
                            try {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return parser;
                    }
                    return parser2;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.BannerSizeOrBuilder
        public int getHeight() {
            return this.height_;
        }

        @Override // gatewayprotocol.v1.AdRequestOuterClass.BannerSizeOrBuilder
        public int getWidth() {
            return this.width_;
        }

        public static Builder newBuilder(BannerSize bannerSize) {
            return DEFAULT_INSTANCE.createBuilder(bannerSize);
        }

        public static BannerSize parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BannerSize) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BannerSize parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (BannerSize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static BannerSize parseFrom(ByteString byteString) {
            return (BannerSize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static BannerSize parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (BannerSize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static BannerSize parseFrom(byte[] bArr) {
            return (BannerSize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BannerSize parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (BannerSize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static BannerSize parseFrom(InputStream inputStream) {
            return (BannerSize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BannerSize parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BannerSize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BannerSize parseFrom(CodedInputStream codedInputStream) {
            return (BannerSize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static BannerSize parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BannerSize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public interface BannerSizeOrBuilder extends MessageLiteOrBuilder {
        int getHeight();

        int getWidth();
    }

    private AdRequestOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
