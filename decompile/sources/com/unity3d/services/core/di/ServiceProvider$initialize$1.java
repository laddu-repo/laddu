package com.unity3d.services.core.di;

import android.content.Context;
import b1.d;
import b1.h;
import com.unity3d.ads.adplayer.AdPlayerScope;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.configuration.AndroidManifestIntPropertyReader;
import com.unity3d.ads.core.configuration.CommonAlternativeFlowReader;
import com.unity3d.ads.core.configuration.GameServerIdReader;
import com.unity3d.ads.core.configuration.MediationInitBlobMetadataReader;
import com.unity3d.ads.core.configuration.MediationTraitsMetadataReader;
import com.unity3d.ads.core.data.datasource.AnalyticsDataSource;
import com.unity3d.ads.core.data.datasource.AndroidAnalyticsDataSource;
import com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource;
import com.unity3d.ads.core.data.datasource.AndroidDeveloperConsentDataSource;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidFIdDataSource;
import com.unity3d.ads.core.data.datasource.AndroidFIdExistenceDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLegacyConfigStoreDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLegacyUserConsentDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLifecycleDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLocalCacheDataSource;
import com.unity3d.ads.core.data.datasource.AndroidMediationDataSource;
import com.unity3d.ads.core.data.datasource.AndroidPrivacyDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStoreDataSource;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import com.unity3d.ads.core.data.datasource.AndroidUnityBootConfigDataSource;
import com.unity3d.ads.core.data.datasource.AndroidUnityInfoDataSource;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.datasource.CacheDataSource;
import com.unity3d.ads.core.data.datasource.DeveloperConsentDataSource;
import com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.FIdDataSource;
import com.unity3d.ads.core.data.datasource.FIdExistenceDataSource;
import com.unity3d.ads.core.data.datasource.FetchGLInfoDataMigration;
import com.unity3d.ads.core.data.datasource.LegacyUserConsentDataSource;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.datasource.MediationDataSource;
import com.unity3d.ads.core.data.datasource.PrivacyDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.StoreDataSource;
import com.unity3d.ads.core.data.datasource.TcfDataSource;
import com.unity3d.ads.core.data.datasource.UnityBootConfigDataSource;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataStoreProvider;
import com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource;
import com.unity3d.ads.core.data.manager.AndroidOfferwallManager;
import com.unity3d.ads.core.data.manager.AndroidOmidManager;
import com.unity3d.ads.core.data.manager.AndroidSDKPropertiesManager;
import com.unity3d.ads.core.data.manager.AndroidScarManager;
import com.unity3d.ads.core.data.manager.AndroidStorageManager;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.data.manager.TransactionEventManager;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.AndroidAdRepository;
import com.unity3d.ads.core.data.repository.AndroidCacheRepository;
import com.unity3d.ads.core.data.repository.AndroidCampaignRepository;
import com.unity3d.ads.core.data.repository.AndroidDeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.AndroidDeviceInfoRepository;
import com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.AndroidLegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.AndroidMediationRepository;
import com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.AndroidSessionRepository;
import com.unity3d.ads.core.data.repository.AndroidTcfRepository;
import com.unity3d.ads.core.data.repository.AndroidTransactionEventRepository;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.FocusRepository;
import com.unity3d.ads.core.data.repository.LegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.MediationRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import com.unity3d.ads.core.data.repository.OrientationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TcfRepository;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken;
import com.unity3d.ads.core.domain.AndroidCacheWebViewAssets;
import com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.AndroidGenerateByteStringId;
import com.unity3d.ads.core.domain.AndroidGetAdDataRefreshRequest;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerConfigRequest;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.AndroidGetAdRequest;
import com.unity3d.ads.core.domain.AndroidGetAdRequestPolicy;
import com.unity3d.ads.core.domain.AndroidGetClientInfo;
import com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest;
import com.unity3d.ads.core.domain.AndroidGetInitializationData;
import com.unity3d.ads.core.domain.AndroidGetInitializationRequest;
import com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload;
import com.unity3d.ads.core.domain.AndroidGetIsAdActivity;
import com.unity3d.ads.core.domain.AndroidGetLifecycleFlow;
import com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken;
import com.unity3d.ads.core.domain.AndroidGetOpenGLRendererInfo;
import com.unity3d.ads.core.domain.AndroidGetSafeguardedInitializationPolicy;
import com.unity3d.ads.core.domain.AndroidGetSharedDataTimestamps;
import com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData;
import com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase;
import com.unity3d.ads.core.domain.AndroidHandleFocusCounters;
import com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse;
import com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse;
import com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.AndroidHandleOpenUrl;
import com.unity3d.ads.core.domain.AndroidHttpClientProvider;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import com.unity3d.ads.core.domain.AndroidIntentCreation;
import com.unity3d.ads.core.domain.AndroidLoad;
import com.unity3d.ads.core.domain.AndroidRefresh;
import com.unity3d.ads.core.domain.AndroidRemoveUrlQuery;
import com.unity3d.ads.core.domain.AndroidSendDiagnosticEvent;
import com.unity3d.ads.core.domain.AndroidSendWebViewClientErrorDiagnostics;
import com.unity3d.ads.core.domain.AndroidShow;
import com.unity3d.ads.core.domain.AndroidTestDataInfo;
import com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest;
import com.unity3d.ads.core.domain.AwaitInitialization;
import com.unity3d.ads.core.domain.BuildHeaderBiddingToken;
import com.unity3d.ads.core.domain.CacheFile;
import com.unity3d.ads.core.domain.CacheWebViewAssets;
import com.unity3d.ads.core.domain.CheckForGameIdAndTestModeChanges;
import com.unity3d.ads.core.domain.CleanAssets;
import com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires;
import com.unity3d.ads.core.domain.CommonAwaitInitialization;
import com.unity3d.ads.core.domain.CommonCacheFile;
import com.unity3d.ads.core.domain.CommonCheckForGameIdAndTestModeChanges;
import com.unity3d.ads.core.domain.CommonCleanAssets;
import com.unity3d.ads.core.domain.CommonCreateFile;
import com.unity3d.ads.core.domain.CommonGetAdObject;
import com.unity3d.ads.core.domain.CommonGetAdPlayer;
import com.unity3d.ads.core.domain.CommonGetCacheDirectory;
import com.unity3d.ads.core.domain.CommonGetFileExtensionFromUrl;
import com.unity3d.ads.core.domain.CommonGetGameId;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.ads.core.domain.CommonGetInitializationState;
import com.unity3d.ads.core.domain.CommonGetIsFileCache;
import com.unity3d.ads.core.domain.CommonGetWebViewBridgeUseCase;
import com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken;
import com.unity3d.ads.core.domain.CommonSafeCallbackInvoke;
import com.unity3d.ads.core.domain.CommonSetGameId;
import com.unity3d.ads.core.domain.CommonSetInitializationState;
import com.unity3d.ads.core.domain.CommonShouldAllowInitialization;
import com.unity3d.ads.core.domain.CommonTokenNumberProvider;
import com.unity3d.ads.core.domain.CommonValidateGameId;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.ExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.GetAdDataRefreshRequest;
import com.unity3d.ads.core.domain.GetAdObject;
import com.unity3d.ads.core.domain.GetAdPlayer;
import com.unity3d.ads.core.domain.GetAdPlayerConfigRequest;
import com.unity3d.ads.core.domain.GetAdRequest;
import com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetByteStringId;
import com.unity3d.ads.core.domain.GetCacheDirectory;
import com.unity3d.ads.core.domain.GetCachedAsset;
import com.unity3d.ads.core.domain.GetClientInfo;
import com.unity3d.ads.core.domain.GetFileExtensionFromUrl;
import com.unity3d.ads.core.domain.GetGameId;
import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetInitRequestPolicy;
import com.unity3d.ads.core.domain.GetInitializationCompletedRequest;
import com.unity3d.ads.core.domain.GetInitializationData;
import com.unity3d.ads.core.domain.GetInitializationRequest;
import com.unity3d.ads.core.domain.GetInitializationRequestPayload;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.GetIsFileCache;
import com.unity3d.ads.core.domain.GetLatestWebViewConfiguration;
import com.unity3d.ads.core.domain.GetLimitedSessionToken;
import com.unity3d.ads.core.domain.GetOpenGLRendererInfo;
import com.unity3d.ads.core.domain.GetOperativeEventRequestPolicy;
import com.unity3d.ads.core.domain.GetOtherRequestPolicy;
import com.unity3d.ads.core.domain.GetPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetSafeguardedInitializationPolicy;
import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.GetUniversalRequestSharedData;
import com.unity3d.ads.core.domain.GetWebViewBridgeUseCase;
import com.unity3d.ads.core.domain.HandleDebugSettings;
import com.unity3d.ads.core.domain.HandleGatewayAdResponse;
import com.unity3d.ads.core.domain.HandleGatewayInitializationResponse;
import com.unity3d.ads.core.domain.HandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.HandleOpenUrl;
import com.unity3d.ads.core.domain.HttpClientProvider;
import com.unity3d.ads.core.domain.InitializeBoldSDK;
import com.unity3d.ads.core.domain.IntentCreation;
import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import com.unity3d.ads.core.domain.Load;
import com.unity3d.ads.core.domain.Refresh;
import com.unity3d.ads.core.domain.RemoveUrlQuery;
import com.unity3d.ads.core.domain.SafeCallbackInvoke;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.SendPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics;
import com.unity3d.ads.core.domain.SetGameId;
import com.unity3d.ads.core.domain.SetInitializationState;
import com.unity3d.ads.core.domain.ShouldAllowInitialization;
import com.unity3d.ads.core.domain.Show;
import com.unity3d.ads.core.domain.TokenNumberProvider;
import com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest;
import com.unity3d.ads.core.domain.TriggerInitializeListener;
import com.unity3d.ads.core.domain.ValidateGameId;
import com.unity3d.ads.core.domain.attribution.AndroidAttribution;
import com.unity3d.ads.core.domain.billing.CommonProductDetailsFetcher;
import com.unity3d.ads.core.domain.billing.IsBillingClientAvailable;
import com.unity3d.ads.core.domain.billing.ProductDetailsFetcher;
import com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback;
import com.unity3d.ads.core.domain.events.AndroidGetTransactionData;
import com.unity3d.ads.core.domain.events.AndroidHandleGatewayEventResponse;
import com.unity3d.ads.core.domain.events.CommonGetTransactionRequest;
import com.unity3d.ads.core.domain.events.CommonUniversalRequestTtlValidator;
import com.unity3d.ads.core.domain.events.DiagnosticEventObserver;
import com.unity3d.ads.core.domain.events.EventObservers;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventBatchRequest;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.domain.events.GetOperativeEventRequest;
import com.unity3d.ads.core.domain.events.GetTransactionData;
import com.unity3d.ads.core.domain.events.GetTransactionRequest;
import com.unity3d.ads.core.domain.events.HandleGatewayEventResponse;
import com.unity3d.ads.core.domain.events.OperativeEventObserver;
import com.unity3d.ads.core.domain.events.TransactionEventObserver;
import com.unity3d.ads.core.domain.events.UniversalRequestEventSender;
import com.unity3d.ads.core.domain.events.UniversalRequestTtlValidator;
import com.unity3d.ads.core.domain.offerwall.GetIsOfferwallAdReady;
import com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd;
import com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK;
import com.unity3d.ads.core.domain.om.AndroidOmFinishSession;
import com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred;
import com.unity3d.ads.core.domain.om.AndroidOmInteraction;
import com.unity3d.ads.core.domain.om.AndroidOmStartSession;
import com.unity3d.ads.core.domain.om.CommonGetOmData;
import com.unity3d.ads.core.domain.om.CommonIsOMActivated;
import com.unity3d.ads.core.domain.om.GetOmData;
import com.unity3d.ads.core.domain.om.InitializeOMSDK;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.domain.om.OmImpressionOccurred;
import com.unity3d.ads.core.domain.privacy.DeveloperConsentFlattenerRulesUseCase;
import com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase;
import com.unity3d.ads.core.domain.privacy.LegacyUserConsentFlattenerRulesUseCase;
import com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase;
import com.unity3d.ads.core.domain.scar.CommonScarEligibleEffectiveUseCase;
import com.unity3d.ads.core.domain.scar.CommonScarEventReceiver;
import com.unity3d.ads.core.domain.scar.FetchSignalsAndSendUseCase;
import com.unity3d.ads.core.domain.scar.GetAndroidTokenEventRequest;
import com.unity3d.ads.core.domain.scar.GetHbTokenEventRequest;
import com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest;
import com.unity3d.ads.core.domain.scar.HandleGetTokenRequest;
import com.unity3d.ads.core.domain.scar.LoadScarAd;
import com.unity3d.ads.core.domain.scar.ScarEligibleEffectiveUseCase;
import com.unity3d.ads.core.domain.scar.ScarTimeHackFixer;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import com.unity3d.ads.core.domain.work.DiagnosticEventRequestWorkModifier;
import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.core.log.UnityLogger;
import com.unity3d.ads.core.utils.CommonCoroutineTimer;
import com.unity3d.ads.core.utils.CoroutineTimer;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.services.SDKErrorHandler;
import com.unity3d.services.ads.gmascar.GMA;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.ads.measurements.MeasurementsService;
import com.unity3d.services.ads.offerwall.OfferwallAdapterBridge;
import com.unity3d.services.ads.token.AsyncTokenStorage;
import com.unity3d.services.ads.token.InMemoryTokenStorage;
import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.ads.topics.TopicsService;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.device.VolumeChange;
import com.unity3d.services.core.device.VolumeChangeContentObserver;
import com.unity3d.services.core.device.VolumeChangeMonitor;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;
import com.unity3d.services.core.domain.task.InitializeSDK;
import com.unity3d.services.core.domain.task.InitializeStateComplete;
import com.unity3d.services.core.domain.task.InitializeStateConfig;
import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import com.unity3d.services.core.domain.task.InitializeStateCreate;
import com.unity3d.services.core.domain.task.InitializeStateError;
import com.unity3d.services.core.domain.task.InitializeStateLoadCache;
import com.unity3d.services.core.domain.task.InitializeStateLoadWeb;
import com.unity3d.services.core.domain.task.InitializeStateNetworkError;
import com.unity3d.services.core.domain.task.InitializeStateReset;
import com.unity3d.services.core.fid.Constants;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.network.core.CronetEngineBuilderFactory;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.IEventSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import com.unity3d.services.store.StoreMonitor;
import com.unity3d.services.store.StoreWebViewEventSender;
import com.unity3d.services.store.core.GatewayStoreExceptionHandler;
import com.unity3d.services.store.core.StoreEventListenerFactory;
import com.unity3d.services.store.core.StoreExceptionHandler;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapterFactory;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gf.a0;
import gf.c0;
import gf.f0;
import gf.j1;
import gf.y;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.x;
import le.c;
import le.i;
import ne.e;
import ne.j;
import okhttp3.HttpUrl;
import ve.a;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class ServiceProvider$initialize$1 extends l implements ve.l {
    public static final ServiceProvider$initialize$1 INSTANCE = new ServiceProvider$initialize$1();

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends l implements a {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // ve.a
        public final Context invoke() {
            return ClientProperties.getApplicationContext();
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$10, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass10 extends l implements a {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final c0 invoke() {
            return this.$moduleInstance.transactionCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ISDKDispatchers.class))), (a0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, x.a(a0.class))), (j1) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, x.a(j1.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$100, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass100 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass100(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final GetInitializationRequestPayload invoke() {
            return new AndroidGetInitializationRequestPayload((GetClientInfo) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetClientInfo.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SessionRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(DeviceInfoRepository.class))), (LegacyUserConsentRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(LegacyUserConsentRepository.class))), (MediationInitBlobMetadataReader) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(MediationInitBlobMetadataReader.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$101, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass101 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass101(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final GetInitializationState invoke() {
            return new CommonGetInitializationState((SessionRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SessionRepository.class))), (SDKPropertiesManager) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SDKPropertiesManager.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$102, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass102 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass102(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final GetIsFileCache invoke() {
            return new CommonGetIsFileCache((CacheRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(CacheRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SendDiagnosticEvent.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$103, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass103 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass103(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final SetInitializationState invoke() {
            return new CommonSetInitializationState((SessionRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SessionRepository.class))), (SDKPropertiesManager) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SDKPropertiesManager.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$104, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass104 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass104(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final GetRequestPolicy invoke() {
            return new AndroidGetAdRequestPolicy((SessionRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SessionRepository.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$105, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass105 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass105(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final GetAdDataRefreshRequest invoke() {
            return new AndroidGetAdDataRefreshRequest((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetUniversalRequestForPayLoad.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SessionRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(DeviceInfoRepository.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(CampaignRepository.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$106, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass106 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass106(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final GetAdPlayerConfigRequest invoke() {
            return new AndroidGetAdPlayerConfigRequest((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetUniversalRequestForPayLoad.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$107, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass107 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass107(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final AndroidGetAdPlayerContext invoke() {
            return new AndroidGetAdPlayerContext((DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(DeviceInfoRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SessionRepository.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$108, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass108 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass108(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final GetAdRequest invoke() {
            return new AndroidGetAdRequest((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetUniversalRequestForPayLoad.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SessionRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(DeviceInfoRepository.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(CampaignRepository.class))), (WebviewConfigurationDataSource) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(WebviewConfigurationDataSource.class))), (TcfRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(TcfRepository.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$109, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass109 extends l implements a {
        public static final AnonymousClass109 INSTANCE = new AnonymousClass109();

        public AnonymousClass109() {
            super(0);
        }

        @Override // ve.a
        public final GetHbTokenEventRequest invoke() {
            return new GetAndroidTokenEventRequest();
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$11, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass11 extends l implements a {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass11(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final c0 invoke() {
            return this.$moduleInstance.getTokenCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ISDKDispatchers.class))), (a0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, x.a(a0.class))), (j1) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, x.a(j1.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$110, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass110 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass110(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final CommonScarEventReceiver invoke() {
            return new CommonScarEventReceiver((c0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SCAR_SCOPE, x.a(c0.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$111, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass111 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass111(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final GMAScarAdapterBridge invoke() {
            GMAScarAdapterBridge bridge = GMA.getInstance(new GMAEventSender((IEventSender) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(CommonScarEventReceiver.class))))).getBridge();
            k.d(bridge, "getInstance(GMAEventSend…EventReceiver>())).bridge");
            return bridge;
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$112, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass112 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass112(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final ScarTimeHackFixer invoke() {
            return new ScarTimeHackFixer((SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SendDiagnosticEvent.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$113, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass113 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass113(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final ScarManager invoke() {
            return new AndroidScarManager((CommonScarEventReceiver) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(CommonScarEventReceiver.class))), (GMAScarAdapterBridge) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GMAScarAdapterBridge.class))), (ScarTimeHackFixer) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ScarTimeHackFixer.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$114, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass114 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass114(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final FetchSignalsAndSendUseCase invoke() {
            return new AndroidFetchSignalsAndSendUseCase((c0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SCAR_SCOPE, x.a(c0.class))), (ScarManager) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ScarManager.class))), (HandleGetTokenRequest) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(HandleGetTokenRequest.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SendDiagnosticEvent.class))), (ScarEligibleEffectiveUseCase) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ScarEligibleEffectiveUseCase.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$115, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass115 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass115(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final LoadScarAd invoke() {
            return new LoadScarAd((ScarManager) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ScarManager.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$116, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass116 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass116(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final HandleGetTokenRequest invoke() {
            return new HandleAndroidGetTokenRequest((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetUniversalRequestForPayLoad.class))), (GetHbTokenEventRequest) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetHbTokenEventRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, x.a(GetRequestPolicy.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GatewayClient.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$117, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass117 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass117(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final GetClientInfo invoke() {
            return new AndroidGetClientInfo((SessionRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SessionRepository.class))), (MediationRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(MediationRepository.class))), (OmidManager) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(OmidManager.class))), (ScarManager) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ScarManager.class))), (OfferwallManager) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(OfferwallManager.class))), (FIdExistenceDataSource) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(FIdExistenceDataSource.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$118, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass118 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass118(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final GetInitializationCompletedRequest invoke() {
            return new AndroidGetInitializationCompletedRequest((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetUniversalRequestForPayLoad.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(DeviceInfoRepository.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$119, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass119 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass119(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final GetInitializationRequest invoke() {
            return new AndroidGetInitializationRequest((GetInitializationRequestPayload) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetInitializationRequestPayload.class))), (GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetUniversalRequestForPayLoad.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$12, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass12 extends l implements a {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass12(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final c0 invoke() {
            return this.$moduleInstance.scarSignalsCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ISDKDispatchers.class))), (a0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, x.a(a0.class))), (j1) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, x.a(j1.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$120, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass120 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass120(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final GetLimitedSessionToken invoke() {
            return new AndroidGetLimitedSessionToken((DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(DeviceInfoRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SessionRepository.class))), (MediationRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(MediationRepository.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$121, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass121 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass121(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final GetOpenGLRendererInfo invoke() {
            return new AndroidGetOpenGLRendererInfo((SessionRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SessionRepository.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$122, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass122 extends l implements a {
        public static final AnonymousClass122 INSTANCE = new AnonymousClass122();

        public AnonymousClass122() {
            super(0);
        }

        @Override // ve.a
        public final GetSharedDataTimestamps invoke() {
            return new AndroidGetSharedDataTimestamps();
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$123, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass123 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass123(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final GetUniversalRequestForPayLoad invoke() {
            return new AndroidGetUniversalRequestForPayLoad((GetUniversalRequestSharedData) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetUniversalRequestSharedData.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$124, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass124 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass124(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final GetUniversalRequestSharedData invoke() {
            return new AndroidGetUniversalRequestSharedData((GetSharedDataTimestamps) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetSharedDataTimestamps.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SessionRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(DeviceInfoRepository.class))), (GetLimitedSessionToken) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetLimitedSessionToken.class))), (DeveloperConsentRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(DeveloperConsentRepository.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$125, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass125 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass125(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final GetCachedAsset invoke() {
            return new GetCachedAsset((CacheRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(CacheRepository.class))), (Context) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(Context.class))), (CacheWebViewAssets) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(CacheWebViewAssets.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$126, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass126 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass126(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final GetWebViewBridgeUseCase invoke() {
            return new CommonGetWebViewBridgeUseCase((y) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, x.a(y.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SendDiagnosticEvent.class))), (Logger) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(Logger.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$127, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass127 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass127(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final GetRequestPolicy invoke() {
            return new GetInitRequestPolicy((SessionRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SessionRepository.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$128, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass128 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass128(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final GetLatestWebViewConfiguration invoke() {
            return new GetLatestWebViewConfiguration((WebviewConfigurationDataSource) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(WebviewConfigurationDataSource.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$129, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass129 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass129(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final GetRequestPolicy invoke() {
            return new GetOperativeEventRequestPolicy((SessionRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SessionRepository.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$13, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass13 extends l implements a {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass13(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final c0 invoke() {
            return this.$moduleInstance.offerwallSignalsCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ISDKDispatchers.class))), (a0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, x.a(a0.class))), (j1) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, x.a(j1.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$130, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass130 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass130(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final GetRequestPolicy invoke() {
            return new GetOtherRequestPolicy((SessionRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SessionRepository.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$131, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass131 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass131(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final GetPrivacyUpdateRequest invoke() {
            return new GetPrivacyUpdateRequest((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetUniversalRequestForPayLoad.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$132, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass132 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass132(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final HandleGatewayInitializationResponse invoke() {
            return new AndroidHandleGatewayInitializationResponse((TransactionEventManager) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(TransactionEventManager.class))), (TriggerInitializationCompletedRequest) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(TriggerInitializationCompletedRequest.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SessionRepository.class))), (c0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_SCOPE, x.a(c0.class))), (HandleDebugSettings) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(HandleDebugSettings.class))), (GetSafeguardedInitializationPolicy) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetSafeguardedInitializationPolicy.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$133, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass133 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass133(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final HandleGatewayUniversalResponse invoke() {
            return new AndroidHandleGatewayUniversalResponse((SessionRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SessionRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(DeviceInfoRepository.class))), (AndroidAppSetIdDataSource) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AndroidAppSetIdDataSource.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$134, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass134 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass134(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final InitializeBoldSDK invoke() {
            return new AndroidInitializeBoldSDK((y) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, x.a(y.class))), (InitializeOMSDK) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(InitializeOMSDK.class))), (GetInitializationRequest) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetInitializationRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_REQ, x.a(GetRequestPolicy.class))), (CleanAssets) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(CleanAssets.class))), (HandleGatewayInitializationResponse) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(HandleGatewayInitializationResponse.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GatewayClient.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SessionRepository.class))), (EventObservers) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(EventObservers.class))), (TriggerInitializeListener) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(TriggerInitializeListener.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SendDiagnosticEvent.class))), (DiagnosticEventRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(DiagnosticEventRepository.class))), (StorageManager) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(StorageManager.class))), (ConfigurationReader) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ConfigurationReader.class))), (SDKPropertiesManager) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SDKPropertiesManager.class))), (GetGameId) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetGameId.class))), (Logger) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(Logger.class))), (AndroidHandleFocusCounters) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AndroidHandleFocusCounters.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$135, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass135 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass135(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final LegacyShowUseCase invoke() {
            return new LegacyShowUseCase((Show) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(Show.class))), (AdRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AdRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SendDiagnosticEvent.class))), (GetOperativeEventApi) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetOperativeEventApi.class))), (GetInitializationState) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetInitializationState.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SessionRepository.class))), (SafeCallbackInvoke) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SafeCallbackInvoke.class))), (Logger) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(Logger.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$136, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass136 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass136(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final SendPrivacyUpdateRequest invoke() {
            return new SendPrivacyUpdateRequest((GetPrivacyUpdateRequest) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetPrivacyUpdateRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, x.a(GetRequestPolicy.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GatewayClient.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$137, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass137 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass137(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final TriggerInitializationCompletedRequest invoke() {
            return new AndroidTriggerInitializationCompletedRequest((GetInitializationCompletedRequest) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetInitializationCompletedRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_REQ, x.a(GetRequestPolicy.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GatewayClient.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SendDiagnosticEvent.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$138, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass138 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass138(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final TriggerInitializeListener invoke() {
            return new TriggerInitializeListener((y) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, x.a(y.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$139, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass139 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass139(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final DiagnosticEventObserver invoke() {
            return new DiagnosticEventObserver((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetUniversalRequestForPayLoad.class))), (GetDiagnosticEventBatchRequest) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetDiagnosticEventBatchRequest.class))), (y) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, x.a(y.class))), (DiagnosticEventRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(DiagnosticEventRepository.class))), (UniversalRequestDataSource) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(UniversalRequestDataSource.class))), (BackgroundWorker) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(BackgroundWorker.class))), (UniversalRequestEventSender) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(UniversalRequestEventSender.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, x.a(GetRequestPolicy.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$14, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass14 extends l implements a {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass14(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final c0 invoke() {
            return this.$moduleInstance.omidCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ISDKDispatchers.class))), (a0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, x.a(a0.class))), (j1) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, x.a(j1.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$140, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass140 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass140(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final EventObservers invoke() {
            return new EventObservers((OperativeEventObserver) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(OperativeEventObserver.class))), (DiagnosticEventObserver) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(DiagnosticEventObserver.class))), (TransactionEventObserver) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(TransactionEventObserver.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$141, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass141 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass141(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final GetTransactionData invoke() {
            return new AndroidGetTransactionData((GetByteStringId) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetByteStringId.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$142, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass142 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass142(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final GetTransactionRequest invoke() {
            return new CommonGetTransactionRequest((DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(DeviceInfoRepository.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$143, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass143 extends l implements a {
        public static final AnonymousClass143 INSTANCE = new AnonymousClass143();

        public AnonymousClass143() {
            super(0);
        }

        @Override // ve.a
        public final GetDiagnosticEventBatchRequest invoke() {
            return new GetDiagnosticEventBatchRequest();
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$144, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass144 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass144(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final GetDiagnosticEventRequest invoke() {
            return new GetDiagnosticEventRequest((GetSharedDataTimestamps) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetSharedDataTimestamps.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$145, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass145 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass145(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final GetOperativeEventApi invoke() {
            return new GetOperativeEventApi((OperativeEventRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(OperativeEventRepository.class))), (GetOperativeEventRequest) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetOperativeEventRequest.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$146, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass146 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass146(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final GetOperativeEventRequest invoke() {
            return new GetOperativeEventRequest((GetByteStringId) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetByteStringId.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(DeviceInfoRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SessionRepository.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(CampaignRepository.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$147, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass147 extends l implements a {
        public static final AnonymousClass147 INSTANCE = new AnonymousClass147();

        public AnonymousClass147() {
            super(0);
        }

        @Override // ve.a
        public final HandleGatewayEventResponse invoke() {
            return new AndroidHandleGatewayEventResponse();
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$148, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass148 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass148(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final OperativeEventObserver invoke() {
            return new OperativeEventObserver((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetUniversalRequestForPayLoad.class))), (y) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, x.a(y.class))), (OperativeEventRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(OperativeEventRepository.class))), (UniversalRequestDataSource) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(UniversalRequestDataSource.class))), (BackgroundWorker) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(BackgroundWorker.class))), (UniversalRequestEventSender) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(UniversalRequestEventSender.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OPERATIVE_REQ, x.a(GetRequestPolicy.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$149, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass149 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass149(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final TransactionEventObserver invoke() {
            return new TransactionEventObserver((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetUniversalRequestForPayLoad.class))), (c0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_TRANSACTION_SCOPE, x.a(c0.class))), (TransactionEventRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(TransactionEventRepository.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GatewayClient.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, x.a(GetRequestPolicy.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, x.a(ByteStringDataSource.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$15, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass15 extends l implements a {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass15(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final j1 invoke() {
            return this.$moduleInstance.publicApiJob((DiagnosticEventRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(DiagnosticEventRepository.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$150, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass150 extends l implements a {
        public static final AnonymousClass150 INSTANCE = new AnonymousClass150();

        public AnonymousClass150() {
            super(0);
        }

        @Override // ve.a
        public final UniversalRequestTtlValidator invoke() {
            return new CommonUniversalRequestTtlValidator();
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$151, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass151 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass151(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final UniversalRequestEventSender invoke() {
            return new UniversalRequestEventSender((GatewayClient) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GatewayClient.class))), (HandleGatewayEventResponse) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(HandleGatewayEventResponse.class))), (UniversalRequestTtlValidator) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(UniversalRequestTtlValidator.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$152, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass152 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass152(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final OmFinishSession invoke() {
            return new AndroidOmFinishSession((OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(OpenMeasurementRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SendDiagnosticEvent.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$153, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass153 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass153(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final OmImpressionOccurred invoke() {
            return new AndroidOmImpressionOccurred((OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(OpenMeasurementRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SendDiagnosticEvent.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$154, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass154 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass154(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final AndroidOmInteraction invoke() {
            return new AndroidOmStartSession((OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(OpenMeasurementRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SendDiagnosticEvent.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$155, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass155 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass155(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final GetOmData invoke() {
            return new CommonGetOmData((OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(OpenMeasurementRepository.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$156, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass156 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass156(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final IsOMActivated invoke() {
            return new CommonIsOMActivated((OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(OpenMeasurementRepository.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$157, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass157 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass157(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final InitializeOMSDK invoke() {
            return new AndroidInitializeOMSDK((Context) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(Context.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SendDiagnosticEvent.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SessionRepository.class))), (OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(OpenMeasurementRepository.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$158, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass158 extends l implements a {
        public static final AnonymousClass158 INSTANCE = new AnonymousClass158();

        public AnonymousClass158() {
            super(0);
        }

        @Override // ve.a
        public final FlattenerRulesUseCase invoke() {
            return new DeveloperConsentFlattenerRulesUseCase();
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$159, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass159 extends l implements a {
        public static final AnonymousClass159 INSTANCE = new AnonymousClass159();

        public AnonymousClass159() {
            super(0);
        }

        @Override // ve.a
        public final FlattenerRulesUseCase invoke() {
            return new LegacyUserConsentFlattenerRulesUseCase();
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$16, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass16 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass16(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final ByteStringDataSource invoke() {
            return new AndroidLegacyConfigStoreDataSource((StorageManager) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(StorageManager.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$160, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass160 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass160(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final BackgroundWorker invoke() {
            return new BackgroundWorker((Context) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(Context.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$161, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass161 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass161(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final DiagnosticEventRequestWorkModifier invoke() {
            return new DiagnosticEventRequestWorkModifier((SessionRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SessionRepository.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$162, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass162 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass162(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final GatewayClient invoke() {
            return new CommonGatewayClient((HttpClientProvider) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(HttpClientProvider.class))), (HandleGatewayUniversalResponse) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(HandleGatewayUniversalResponse.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SendDiagnosticEvent.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SessionRepository.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$163, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass163 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass163(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final a0 invoke() {
            return new SDKErrorHandler((y) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, x.a(y.class))), (AlternativeFlowReader) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AlternativeFlowReader.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SendDiagnosticEvent.class))), (SDKMetricsSender) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SDKMetricsSender.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$164, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass164 extends l implements a {
        public static final AnonymousClass164 INSTANCE = new AnonymousClass164();

        public AnonymousClass164() {
            super(0);
        }

        @Override // ve.a
        public final TokenStorage invoke() {
            return new InMemoryTokenStorage();
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$165, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass165 extends l implements a {
        public static final AnonymousClass165 INSTANCE = new AnonymousClass165();

        public AnonymousClass165() {
            super(0);
        }

        @Override // ve.a
        public final VolumeChange invoke() {
            return new VolumeChangeContentObserver();
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$166, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass166 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass166(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final ConfigFileFromLocalStorage invoke() {
            return new ConfigFileFromLocalStorage((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ISDKDispatchers.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$167, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass167 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass167(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final InitializeSDK invoke() {
            return new InitializeSDK((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ISDKDispatchers.class))), (ConfigFileFromLocalStorage) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ConfigFileFromLocalStorage.class))), (InitializeStateReset) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(InitializeStateReset.class))), (InitializeStateError) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(InitializeStateError.class))), (InitializeStateConfig) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(InitializeStateConfig.class))), (InitializeStateCreate) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(InitializeStateCreate.class))), (InitializeStateLoadCache) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(InitializeStateLoadCache.class))), (InitializeStateLoadWeb) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(InitializeStateLoadWeb.class))), (InitializeStateComplete) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(InitializeStateComplete.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$168, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass168 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass168(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final InitializeStateComplete invoke() {
            return new InitializeStateComplete((h) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, x.a(h.class))), (ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ISDKDispatchers.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$169, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass169 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass169(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final InitializeStateConfig invoke() {
            return new InitializeStateConfig((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ISDKDispatchers.class))), (InitializeStateConfigWithLoader) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(InitializeStateConfigWithLoader.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$17, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass17 extends l implements a {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass17(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final h invoke() {
            return this.$moduleInstance.privacyDataStore((Context) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(Context.class))), (y) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, x.a(y.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$170, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass170 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass170(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final InitializeStateConfigWithLoader invoke() {
            return new InitializeStateConfigWithLoader((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ISDKDispatchers.class))), (InitializeStateNetworkError) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(InitializeStateNetworkError.class))), (TokenStorage) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(TokenStorage.class))), (SDKMetricsSender) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SDKMetricsSender.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$171, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass171 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass171(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final InitializeStateCreate invoke() {
            return new InitializeStateCreate((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ISDKDispatchers.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$172, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass172 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass172(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final InitializeStateError invoke() {
            return new InitializeStateError((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ISDKDispatchers.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$173, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass173 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass173(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final InitializeStateLoadCache invoke() {
            return new InitializeStateLoadCache((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ISDKDispatchers.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$174, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass174 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass174(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final InitializeStateLoadWeb invoke() {
            return new InitializeStateLoadWeb((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ISDKDispatchers.class))), (InitializeStateNetworkError) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(InitializeStateNetworkError.class))), (HttpClientProvider) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(HttpClientProvider.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$175, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass175 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass175(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final InitializeStateReset invoke() {
            return new InitializeStateReset((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ISDKDispatchers.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$176, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass176 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass176(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final StoreMonitor invoke() {
            return new StoreMonitor((StoreExceptionHandler) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(StoreExceptionHandler.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$177, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass177 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass177(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final StoreWebViewEventSender invoke() {
            return new StoreWebViewEventSender((IEventSender) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(IEventSender.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$178, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass178 extends l implements a {
        public static final AnonymousClass178 INSTANCE = new AnonymousClass178();

        public AnonymousClass178() {
            super(0);
        }

        @Override // ve.a
        public final StoreExceptionHandler invoke() {
            return new GatewayStoreExceptionHandler();
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$179, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass179 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass179(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final StoreEventListenerFactory invoke() {
            return new StoreEventListenerFactory((StoreWebViewEventSender) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(StoreWebViewEventSender.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$18, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass18 extends l implements a {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass18(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final ByteStringDataSource invoke() {
            return this.$moduleInstance.privacyDataStore((h) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, x.a(h.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$180, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass180 extends l implements a {
        public static final AnonymousClass180 INSTANCE = new AnonymousClass180();

        public AnonymousClass180() {
            super(0);
        }

        @Override // ve.a
        public final ConfigurationReader invoke() {
            return new ConfigurationReader();
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$181, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass181 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass181(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final AndroidAttribution invoke() {
            return new AndroidAttribution((Context) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(Context.class))), (ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ISDKDispatchers.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SessionRepository.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$182, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass182 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass182(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final AdPlayerScope invoke() {
            return new AdPlayerScope((y) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, x.a(y.class))), (a0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, x.a(a0.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$183, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass183 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass183(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final AndroidWebViewClient invoke() {
            return new AndroidWebViewClient((GetCachedAsset) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetCachedAsset.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SendDiagnosticEvent.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$184, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass184 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass184(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final AndroidGetWebViewContainerUseCase invoke() {
            return new AndroidGetWebViewContainerUseCase((Context) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(Context.class))), (AndroidWebViewClient) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AndroidWebViewClient.class))), (SendWebViewClientErrorDiagnostics) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SendWebViewClientErrorDiagnostics.class))), (y) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, x.a(y.class))), (y) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, x.a(y.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$185, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass185 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass185(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final Load invoke() {
            return new AndroidLoad((y) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, x.a(y.class))), (GetAdRequest) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetAdRequest.class))), (GetAdPlayerConfigRequest) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetAdPlayerConfigRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_AD_REQ, x.a(GetRequestPolicy.class))), (HandleGatewayAdResponse) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(HandleGatewayAdResponse.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SessionRepository.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GatewayClient.class))), (AdRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AdRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SendDiagnosticEvent.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$186, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass186 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass186(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final AwaitInitialization invoke() {
            return new CommonAwaitInitialization((SessionRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SessionRepository.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$187, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass187 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass187(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final GetAsyncHeaderBiddingToken invoke() {
            return new CommonInitAwaitingGetHeaderBiddingToken((GetHeaderBiddingToken) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetHeaderBiddingToken.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SendDiagnosticEvent.class))), (GetInitializationState) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetInitializationState.class))), (AwaitInitialization) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AwaitInitialization.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SessionRepository.class))), (SafeCallbackInvoke) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SafeCallbackInvoke.class))), (Logger) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(Logger.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$188, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass188 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass188(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final GetAdPlayer invoke() {
            return new CommonGetAdPlayer((DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(DeviceInfoRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SessionRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SendDiagnosticEvent.class))), (y) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, x.a(y.class))), (c0) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AdPlayerScope.class))), (OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(OpenMeasurementRepository.class))), (ScarManager) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ScarManager.class))), (OfferwallManager) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(OfferwallManager.class))), (AdRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AdRepository.class))), (LifecycleDataSource) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(LifecycleDataSource.class))), (OrientationRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(OrientationRepository.class))), (Context) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(Context.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$189, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass189 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass189(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final CacheWebViewAssets invoke() {
            return new AndroidCacheWebViewAssets((CacheRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(CacheRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SessionRepository.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$19, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass19 extends l implements a {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass19(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final h invoke() {
            return this.$moduleInstance.privacyFsmDataStore((Context) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(Context.class))), (y) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, x.a(y.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$190, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass190 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass190(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final HandleGatewayAdResponse invoke() {
            return new AndroidHandleGatewayAdResponse((AdRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AdRepository.class))), (AndroidGetWebViewContainerUseCase) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AndroidGetWebViewContainerUseCase.class))), (GetWebViewBridgeUseCase) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetWebViewBridgeUseCase.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(DeviceInfoRepository.class))), (HandleInvocationsFromAdViewer) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(HandleInvocationsFromAdViewer.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(CampaignRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SendDiagnosticEvent.class))), (GetOperativeEventApi) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetOperativeEventApi.class))), (GetLatestWebViewConfiguration) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetLatestWebViewConfiguration.class))), (AdPlayerScope) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AdPlayerScope.class))), (GetAdPlayer) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetAdPlayer.class))), (CacheWebViewAssets) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(CacheWebViewAssets.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$191, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass191 extends l implements a {
        public static final AnonymousClass191 INSTANCE = new AnonymousClass191();

        public AnonymousClass191() {
            super(0);
        }

        @Override // ve.a
        public final HandleInvocationsFromAdViewer invoke() {
            return new HandleInvocationsFromAdViewer();
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$192, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass192 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass192(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final LegacyLoadUseCase invoke() {
            return new LegacyLoadUseCase((Load) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(Load.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SendDiagnosticEvent.class))), (GetInitializationState) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetInitializationState.class))), (AwaitInitialization) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AwaitInitialization.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SessionRepository.class))), (AdRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AdRepository.class))), (SafeCallbackInvoke) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SafeCallbackInvoke.class))), (CleanUpWhenOpportunityExpires) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(CleanUpWhenOpportunityExpires.class))), (Logger) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(Logger.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$193, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass193 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass193(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final SafeCallbackInvoke invoke() {
            return new CommonSafeCallbackInvoke((y) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, x.a(y.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$194, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass194 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass194(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final InitializeStateNetworkError invoke() {
            return new InitializeStateNetworkError((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ISDKDispatchers.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$195, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass195 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass195(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final CoroutineTimer invoke() {
            return new CommonCoroutineTimer((y) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, x.a(y.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$196, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass196 extends l implements a {
        public static final AnonymousClass196 INSTANCE = new AnonymousClass196();

        public AnonymousClass196() {
            super(0);
        }

        @Override // ve.a
        public final IEventSender invoke() {
            return SharedInstances.INSTANCE.getWebViewEventSender();
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$197, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass197 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass197(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final SetGameId invoke() {
            return new CommonSetGameId((SessionRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SessionRepository.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$198, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass198 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass198(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final GetGameId invoke() {
            return new CommonGetGameId((SessionRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SessionRepository.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$199, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass199 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass199(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final ValidateGameId invoke() {
            return new CommonValidateGameId((GetGameId) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetGameId.class))), (SetGameId) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SetGameId.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends l implements a {
        final /* synthetic */ UnityAdsModule $moduleInstance;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(UnityAdsModule unityAdsModule) {
            super(0);
            this.$moduleInstance = unityAdsModule;
        }

        @Override // ve.a
        public final y invoke() {
            return this.$moduleInstance.mainDispatcher();
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$20, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass20 extends l implements a {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass20(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final ByteStringDataSource invoke() {
            return this.$moduleInstance.privacyFsmDataStore((h) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, x.a(h.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$200, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass200 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass200(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final ShouldAllowInitialization invoke() {
            return new CommonShouldAllowInitialization((AlternativeFlowReader) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AlternativeFlowReader.class))), (CheckForGameIdAndTestModeChanges) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(CheckForGameIdAndTestModeChanges.class))), (GetInitializationState) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetInitializationState.class))), (SetInitializationState) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SetInitializationState.class))), (ValidateGameId) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ValidateGameId.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$201, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass201 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass201(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final CheckForGameIdAndTestModeChanges invoke() {
            return new CommonCheckForGameIdAndTestModeChanges((GetGameId) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetGameId.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SendDiagnosticEvent.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$202, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass202 extends l implements a {
        public static final AnonymousClass202 INSTANCE = new AnonymousClass202();

        public AnonymousClass202() {
            super(0);
        }

        @Override // ve.a
        public final DownloadPriorityQueue invoke() {
            return new DownloadPriorityQueue();
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$203, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass203 extends l implements a {
        public static final AnonymousClass203 INSTANCE = new AnonymousClass203();

        public AnonymousClass203() {
            super(0);
        }

        @Override // ve.a
        public final CleanupDirectory invoke() {
            return new CleanupDirectory();
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$204, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass204 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass204(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final FocusRepository invoke() {
            return new FocusRepository((AndroidGetLifecycleFlow) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AndroidGetLifecycleFlow.class))), (y) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, x.a(y.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$205, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass205 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass205(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final AndroidGetIsAdActivity invoke() {
            return new AndroidGetIsAdActivity((SessionRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SessionRepository.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$206, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass206 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass206(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final AndroidGetLifecycleFlow invoke() {
            return new AndroidGetLifecycleFlow((Context) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(Context.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$207, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass207 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass207(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final AndroidHandleFocusCounters invoke() {
            return new AndroidHandleFocusCounters((SessionRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SessionRepository.class))), (FocusRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(FocusRepository.class))), (AndroidGetIsAdActivity) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AndroidGetIsAdActivity.class))), (y) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, x.a(y.class))), null, 16, null);
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$208, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass208 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass208(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final OfferwallAdapterBridge invoke() {
            return new OfferwallAdapterBridge((c0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OFFERWALL_SCOPE, x.a(c0.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$209, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass209 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass209(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final OfferwallManager invoke() {
            return new AndroidOfferwallManager((OfferwallAdapterBridge) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(OfferwallAdapterBridge.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$21, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass21 extends l implements a {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass21(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final h invoke() {
            return this.$moduleInstance.nativeConfigurationDataStore((Context) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(Context.class))), (y) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, x.a(y.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$210, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass210 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass210(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final LoadOfferwallAd invoke() {
            return new LoadOfferwallAd((OfferwallManager) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(OfferwallManager.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$211, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass211 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass211(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final GetIsOfferwallAdReady invoke() {
            return new GetIsOfferwallAdReady((OfferwallManager) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(OfferwallManager.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$212, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass212 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass212(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final FIdDataSource invoke() {
            return new AndroidFIdDataSource((Context) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(Context.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$213, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass213 extends l implements a {
        public static final AnonymousClass213 INSTANCE = new AnonymousClass213();

        public AnonymousClass213() {
            super(0);
        }

        @Override // ve.a
        public final FIdExistenceDataSource invoke() {
            return new AndroidFIdExistenceDataSource(Constants.FID_CLASS);
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$214, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass214 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass214(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final CleanUpWhenOpportunityExpires invoke() {
            return new CleanUpWhenOpportunityExpires((y) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, x.a(y.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$215, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass215 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass215(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final OrientationRepository invoke() {
            return new OrientationRepository((AndroidGetLifecycleFlow) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AndroidGetLifecycleFlow.class))), (y) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, x.a(y.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$216, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass216 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass216(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final AndroidAppSetIdDataSource invoke() {
            return new AndroidAppSetIdDataSource((Context) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(Context.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$217, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass217 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass217(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final AndroidUnityInfoDataSource invoke() {
            return new AndroidUnityInfoDataSource((Context) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(Context.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$218, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass218 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass218(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final HandleDebugSettings invoke() {
            return new HandleDebugSettings((Logger) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(Logger.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$219, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass219 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass219(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final Logger invoke() {
            return new UnityLogger((SessionRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SessionRepository.class))), (CreateFile) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(CreateFile.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$22, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass22 extends l implements a {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass22(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final ByteStringDataSource invoke() {
            return this.$moduleInstance.nativeConfigurationDataStore((h) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, x.a(h.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$220, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass220 extends l implements a {
        public static final AnonymousClass220 INSTANCE = new AnonymousClass220();

        public AnonymousClass220() {
            super(0);
        }

        @Override // ve.a
        public final IsBillingClientAvailable invoke() {
            return new IsBillingClientAvailable();
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$221, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass221 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass221(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final UnityBootConfigDataSource invoke() {
            return new AndroidUnityBootConfigDataSource((Context) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(Context.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$222, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass222 extends l implements a {
        public static final AnonymousClass222 INSTANCE = new AnonymousClass222();

        public AnonymousClass222() {
            super(0);
        }

        @Override // ve.a
        public final GetSafeguardedInitializationPolicy invoke() {
            return new AndroidGetSafeguardedInitializationPolicy();
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$23, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass23 extends l implements a {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass23(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final h invoke() {
            return this.$moduleInstance.glInfoDataStore((Context) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(Context.class))), (y) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, x.a(y.class))), (d) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.PREF_GL_INFO, x.a(d.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$24, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass24 extends l implements a {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass24(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final ByteStringDataSource invoke() {
            return this.$moduleInstance.glInfoDataStore((h) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, x.a(h.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$25, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass25 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass25(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final UniversalRequestDataStoreProvider invoke() {
            return new UniversalRequestDataStoreProvider((Context) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(Context.class))), (y) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, x.a(y.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$26, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass26 extends l implements a {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass26(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final h invoke() {
            return this.$moduleInstance.iapTransactionDataStore((Context) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(Context.class))), (y) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, x.a(y.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$27, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass27 extends l implements a {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass27(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final ByteStringDataSource invoke() {
            return this.$moduleInstance.iapTransactionDataStore((h) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, x.a(h.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$28, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass28 extends l implements a {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass28(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final h invoke() {
            return this.$moduleInstance.webViewConfigurationDataStore((Context) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(Context.class))), (y) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, x.a(y.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$29, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass29 extends l implements a {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass29(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final AsyncTokenStorage invoke() {
            return this.$moduleInstance.asyncTokenStorage((TokenStorage) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(TokenStorage.class))), (SDKMetricsSender) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SDKMetricsSender.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends l implements a {
        final /* synthetic */ UnityAdsModule $moduleInstance;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(UnityAdsModule unityAdsModule) {
            super(0);
            this.$moduleInstance = unityAdsModule;
        }

        @Override // ve.a
        public final y invoke() {
            return this.$moduleInstance.defaultDispatcher();
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$30, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass30 extends l implements a {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass30(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final VolumeChangeMonitor invoke() {
            return this.$moduleInstance.volumeChangeMonitor((VolumeChange) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(VolumeChange.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$31, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass31 extends l implements a {
        final /* synthetic */ UnityAdsModule $moduleInstance;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass31(UnityAdsModule unityAdsModule) {
            super(0);
            this.$moduleInstance = unityAdsModule;
        }

        @Override // ve.a
        public final JsonStorage invoke() {
            return this.$moduleInstance.publicJsonStorage();
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$32, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass32 extends l implements a {
        final /* synthetic */ UnityAdsModule $moduleInstance;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass32(UnityAdsModule unityAdsModule) {
            super(0);
            this.$moduleInstance = unityAdsModule;
        }

        @Override // ve.a
        public final JsonStorage invoke() {
            return this.$moduleInstance.privateJsonStorage();
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$33, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass33 extends l implements a {
        final /* synthetic */ UnityAdsModule $moduleInstance;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass33(UnityAdsModule unityAdsModule) {
            super(0);
            this.$moduleInstance = unityAdsModule;
        }

        @Override // ve.a
        public final JsonStorage invoke() {
            return this.$moduleInstance.memoryJsonStorage();
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$34, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass34 extends l implements a {
        final /* synthetic */ UnityAdsModule $moduleInstance;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass34(UnityAdsModule unityAdsModule) {
            super(0);
            this.$moduleInstance = unityAdsModule;
        }

        @Override // ve.a
        public final NativeConfigurationOuterClass.NativeConfiguration invoke() {
            return this.$moduleInstance.defaultNativeConfiguration();
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$35, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass35 extends l implements a {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass35(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final MeasurementsService invoke() {
            return this.$moduleInstance.measurementService((Context) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(Context.class))), (ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ISDKDispatchers.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$36, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass36 extends l implements a {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass36(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final TopicsService invoke() {
            return this.$moduleInstance.topicsService((Context) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(Context.class))), (ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ISDKDispatchers.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$37, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass37 extends l implements a {
        public static final AnonymousClass37 INSTANCE = new AnonymousClass37();

        public AnonymousClass37() {
            super(0);
        }

        @Override // ve.a
        public final CronetEngineBuilderFactory invoke() {
            return new CronetEngineBuilderFactory();
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$38, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass38 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass38(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final HttpClientProvider invoke() {
            return new AndroidHttpClientProvider((AlternativeFlowReader) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AlternativeFlowReader.class))), (ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ISDKDispatchers.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SendDiagnosticEvent.class))), (Context) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(Context.class))), (CronetEngineBuilderFactory) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(CronetEngineBuilderFactory.class))), (MediationTraitsMetadataReader) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(MediationTraitsMetadataReader.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$39, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass39 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
        @e(c = "com.unity3d.services.core.di.ServiceProvider$initialize$1$39$1", f = "ServiceProvider.kt", l = {462}, m = "invokeSuspend")
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$39$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends j implements p {
            final /* synthetic */ ServicesRegistry $this_registry;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ServicesRegistry servicesRegistry, c cVar) {
                super(2, cVar);
                this.$this_registry = servicesRegistry;
            }

            @Override // ne.a
            public final c create(Object obj, c cVar) {
                return new AnonymousClass1(this.$this_registry, cVar);
            }

            @Override // ve.p
            public final Object invoke(c0 c0Var, c cVar) {
                return ((AnonymousClass1) create(c0Var, cVar)).invokeSuspend(he.y.f6101a);
            }

            @Override // ne.a
            public final Object invokeSuspend(Object obj) {
                int i6 = this.label;
                if (i6 != 0) {
                    if (i6 == 1) {
                        he.a.f(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                he.a.f(obj);
                HttpClientProvider httpClientProvider = (HttpClientProvider) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(HttpClientProvider.class)));
                this.label = 1;
                Object invoke = httpClientProvider.invoke(this);
                me.a aVar = me.a.f8833x;
                if (invoke == aVar) {
                    return aVar;
                }
                return invoke;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass39(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final HttpClient invoke() {
            return (HttpClient) f0.B(i.f8353x, new AnonymousClass1(this.$this_registry, null));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends l implements a {
        final /* synthetic */ UnityAdsModule $moduleInstance;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(UnityAdsModule unityAdsModule) {
            super(0);
            this.$moduleInstance = unityAdsModule;
        }

        @Override // ve.a
        public final y invoke() {
            return this.$moduleInstance.ioDispatcher();
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$40, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass40 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass40(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final MediationTraitsMetadataReader invoke() {
            return new MediationTraitsMetadataReader((JsonStorage) this.$this_registry.resolveService(new ServiceKey("MEMORY", x.a(JsonStorage.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$41, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass41 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass41(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final AlternativeFlowReader invoke() {
            return new CommonAlternativeFlowReader((ConfigurationReader) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ConfigurationReader.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SessionRepository.class))), (MediationTraitsMetadataReader) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(MediationTraitsMetadataReader.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$42, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass42 extends l implements a {
        public static final AnonymousClass42 INSTANCE = new AnonymousClass42();

        public AnonymousClass42() {
            super(0);
        }

        @Override // ve.a
        public final TcfDataSource invoke() {
            return new AndroidTcfDataSource();
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$43, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass43 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass43(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final TcfRepository invoke() {
            return new AndroidTcfRepository((TcfDataSource) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(TcfDataSource.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$44, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass44 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass44(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final AndroidManifestIntPropertyReader invoke() {
            return new AndroidManifestIntPropertyReader((Context) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(Context.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$45, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass45 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass45(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final AndroidTestDataInfo invoke() {
            return new AndroidTestDataInfo((AndroidManifestIntPropertyReader) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AndroidManifestIntPropertyReader.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$46, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass46 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass46(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final GameServerIdReader invoke() {
            return new GameServerIdReader((JsonStorage) this.$this_registry.resolveService(new ServiceKey("PUBLIC", x.a(JsonStorage.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$47, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass47 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass47(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final StoreDataSource invoke() {
            return new AndroidStoreDataSource((Context) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(Context.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$48, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass48 extends l implements a {
        public static final AnonymousClass48 INSTANCE = new AnonymousClass48();

        public AnonymousClass48() {
            super(0);
        }

        @Override // ve.a
        public final AnalyticsDataSource invoke() {
            return new AndroidAnalyticsDataSource();
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$49, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass49 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass49(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final DeveloperConsentDataSource invoke() {
            return new AndroidDeveloperConsentDataSource((FlattenerRulesUseCase) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEV_CONSENT_PRIVACY_RULES, x.a(FlattenerRulesUseCase.class))), (JsonStorage) this.$this_registry.resolveService(new ServiceKey("PUBLIC", x.a(JsonStorage.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends l implements a {
        final /* synthetic */ UnityAdsModule $moduleInstance;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(UnityAdsModule unityAdsModule) {
            super(0);
            this.$moduleInstance = unityAdsModule;
        }

        @Override // ve.a
        public final ISDKDispatchers invoke() {
            return this.$moduleInstance.sdkDispatchers();
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$50, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass50 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass50(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final DynamicDeviceInfoDataSource invoke() {
            return new AndroidDynamicDeviceInfoDataSource((Context) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(Context.class))), (LifecycleDataSource) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(LifecycleDataSource.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$51, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass51 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass51(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final LegacyUserConsentDataSource invoke() {
            return new AndroidLegacyUserConsentDataSource((FlattenerRulesUseCase) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.LEGACY_PRIVACY_RULES, x.a(FlattenerRulesUseCase.class))), (JsonStorage) this.$this_registry.resolveService(new ServiceKey("PRIVATE", x.a(JsonStorage.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$52, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass52 extends l implements a {
        public static final AnonymousClass52 INSTANCE = new AnonymousClass52();

        public AnonymousClass52() {
            super(0);
        }

        @Override // ve.a
        public final LifecycleDataSource invoke() {
            return new AndroidLifecycleDataSource();
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$53, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass53 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass53(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final CacheDataSource invoke() {
            return new AndroidLocalCacheDataSource((CreateFile) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(CreateFile.class))), (GetFileExtensionFromUrl) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetFileExtensionFromUrl.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$54, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass54 extends l implements a {
        public static final AnonymousClass54 INSTANCE = new AnonymousClass54();

        public AnonymousClass54() {
            super(0);
        }

        @Override // ve.a
        public final CreateFile invoke() {
            return new CommonCreateFile();
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$55, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass55 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass55(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final GetFileExtensionFromUrl invoke() {
            return new CommonGetFileExtensionFromUrl((RemoveUrlQuery) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(RemoveUrlQuery.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$56, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass56 extends l implements a {
        public static final AnonymousClass56 INSTANCE = new AnonymousClass56();

        public AnonymousClass56() {
            super(0);
        }

        @Override // ve.a
        public final RemoveUrlQuery invoke() {
            return new AndroidRemoveUrlQuery();
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$57, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass57 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass57(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final MediationDataSource invoke() {
            return new AndroidMediationDataSource((JsonStorage) this.$this_registry.resolveService(new ServiceKey("MEMORY", x.a(JsonStorage.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$58, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass58 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass58(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final PrivacyDeviceInfoDataSource invoke() {
            return new AndroidPrivacyDeviceInfoDataSource((Context) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(Context.class))), (FIdDataSource) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(FIdDataSource.class))), (AndroidAppSetIdDataSource) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AndroidAppSetIdDataSource.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$59, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass59 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass59(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final CacheDataSource invoke() {
            return new AndroidRemoteCacheDataSource((y) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, x.a(y.class))), (CreateFile) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(CreateFile.class))), (GetFileExtensionFromUrl) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetFileExtensionFromUrl.class))), (HttpClientProvider) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(HttpClientProvider.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass6 extends l implements a {
        final /* synthetic */ UnityAdsModule $moduleInstance;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(UnityAdsModule unityAdsModule) {
            super(0);
            this.$moduleInstance = unityAdsModule;
        }

        @Override // ve.a
        public final SDKMetricsSender invoke() {
            return this.$moduleInstance.sdkMetrics();
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$60, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass60 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass60(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final StaticDeviceInfoDataSource invoke() {
            return new AndroidStaticDeviceInfoDataSource((Context) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(Context.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, x.a(ByteStringDataSource.class))), (AnalyticsDataSource) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AnalyticsDataSource.class))), (StoreDataSource) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(StoreDataSource.class))), (UnityBootConfigDataSource) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(UnityBootConfigDataSource.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$61, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass61 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass61(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final d invoke() {
            return new FetchGLInfoDataMigration((GetOpenGLRendererInfo) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetOpenGLRendererInfo.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$62, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass62 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass62(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final UniversalRequestDataSource invoke() {
            return new UniversalRequestDataSource((UniversalRequestDataStoreProvider) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(UniversalRequestDataStoreProvider.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$63, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass63 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass63(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final WebviewConfigurationDataSource invoke() {
            return new WebviewConfigurationDataSource((h) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_WEBVIEW_CONFIG, x.a(h.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$64, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass64 extends l implements a {
        public static final AnonymousClass64 INSTANCE = new AnonymousClass64();

        public AnonymousClass64() {
            super(0);
        }

        @Override // ve.a
        public final OmidManager invoke() {
            return new AndroidOmidManager();
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$65, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass65 extends l implements a {
        public static final AnonymousClass65 INSTANCE = new AnonymousClass65();

        public AnonymousClass65() {
            super(0);
        }

        @Override // ve.a
        public final SDKPropertiesManager invoke() {
            return new AndroidSDKPropertiesManager();
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$66, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass66 extends l implements a {
        public static final AnonymousClass66 INSTANCE = new AnonymousClass66();

        public AnonymousClass66() {
            super(0);
        }

        @Override // ve.a
        public final StorageManager invoke() {
            return new AndroidStorageManager();
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$67, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass67 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass67(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final BillingClientAdapter invoke() {
            return new BillingClientAdapterFactory().createBillingClientAdapter((Context) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(Context.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$68, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass68 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass68(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final ProductDetailsFetcher invoke() {
            return new ProductDetailsFetcherWithFallback(new CommonProductDetailsFetcher((BillingClientAdapter) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(BillingClientAdapter.class))), "inapp"), new CommonProductDetailsFetcher((BillingClientAdapter) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(BillingClientAdapter.class))), "subs"));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$69, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass69 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass69(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final TransactionEventManager invoke() {
            return new TransactionEventManager((c0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_TRANSACTION_SCOPE, x.a(c0.class))), (BillingClientAdapter) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(BillingClientAdapter.class))), (GetTransactionData) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetTransactionData.class))), (GetTransactionRequest) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetTransactionRequest.class))), (TransactionEventRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(TransactionEventRepository.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, x.a(ByteStringDataSource.class))), (IsBillingClientAvailable) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(IsBillingClientAvailable.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SessionRepository.class))), (ProductDetailsFetcher) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ProductDetailsFetcher.class))), (Logger) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(Logger.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$7, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass7 extends l implements a {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final c0 invoke() {
            return this.$moduleInstance.initCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ISDKDispatchers.class))), (a0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, x.a(a0.class))), (j1) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, x.a(j1.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$70, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass70 extends l implements a {
        public static final AnonymousClass70 INSTANCE = new AnonymousClass70();

        public AnonymousClass70() {
            super(0);
        }

        @Override // ve.a
        public final AdRepository invoke() {
            return new AndroidAdRepository();
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$71, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass71 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass71(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final CacheRepository invoke() {
            return new AndroidCacheRepository((y) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, x.a(y.class))), (GetCacheDirectory) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetCacheDirectory.class))), (CacheDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_LOCAL, x.a(CacheDataSource.class))), (CacheDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_REMOTE, x.a(CacheDataSource.class))), (Context) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(Context.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SessionRepository.class))), (CleanupDirectory) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(CleanupDirectory.class))), (DownloadPriorityQueue) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(DownloadPriorityQueue.class))), (CreateFile) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(CreateFile.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$72, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass72 extends l implements a {
        public static final AnonymousClass72 INSTANCE = new AnonymousClass72();

        public AnonymousClass72() {
            super(0);
        }

        @Override // ve.a
        public final GetCacheDirectory invoke() {
            return new CommonGetCacheDirectory();
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$73, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass73 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass73(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final CampaignRepository invoke() {
            return new AndroidCampaignRepository((GetSharedDataTimestamps) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetSharedDataTimestamps.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$74, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass74 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass74(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final DeveloperConsentRepository invoke() {
            return new AndroidDeveloperConsentRepository((DeveloperConsentDataSource) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(DeveloperConsentDataSource.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$75, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass75 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass75(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final DeviceInfoRepository invoke() {
            return new AndroidDeviceInfoRepository((StaticDeviceInfoDataSource) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(StaticDeviceInfoDataSource.class))), (DynamicDeviceInfoDataSource) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(DynamicDeviceInfoDataSource.class))), (PrivacyDeviceInfoDataSource) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(PrivacyDeviceInfoDataSource.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SessionRepository.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$76, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass76 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass76(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final DiagnosticEventRepository invoke() {
            return new AndroidDiagnosticEventRepository((CoroutineTimer) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(CoroutineTimer.class))), (GetDiagnosticEventRequest) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetDiagnosticEventRequest.class))), (y) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, x.a(y.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$77, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass77 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass77(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final LegacyUserConsentRepository invoke() {
            return new AndroidLegacyUserConsentRepository((LegacyUserConsentDataSource) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(LegacyUserConsentDataSource.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$78, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass78 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass78(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final MediationRepository invoke() {
            return new AndroidMediationRepository((MediationDataSource) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(MediationDataSource.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$79, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass79 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass79(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final OpenMeasurementRepository invoke() {
            return new AndroidOpenMeasurementRepository((y) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, x.a(y.class))), (OmidManager) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(OmidManager.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$8, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass8 extends l implements a {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final c0 invoke() {
            return this.$moduleInstance.loadCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ISDKDispatchers.class))), (a0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, x.a(a0.class))), (j1) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, x.a(j1.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$80, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass80 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass80(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final SessionRepository invoke() {
            return new AndroidSessionRepository((ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_GATEWAY_CACHE, x.a(ByteStringDataSource.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, x.a(ByteStringDataSource.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, x.a(ByteStringDataSource.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, x.a(ByteStringDataSource.class))), (AndroidUnityInfoDataSource) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AndroidUnityInfoDataSource.class))), (NativeConfigurationOuterClass.NativeConfiguration) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(NativeConfigurationOuterClass.NativeConfiguration.class))), (y) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, x.a(y.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SendDiagnosticEvent.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$81, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass81 extends l implements a {
        public static final AnonymousClass81 INSTANCE = new AnonymousClass81();

        public AnonymousClass81() {
            super(0);
        }

        @Override // ve.a
        public final TransactionEventRepository invoke() {
            return new AndroidTransactionEventRepository();
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$82, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass82 extends l implements a {
        public static final AnonymousClass82 INSTANCE = new AnonymousClass82();

        public AnonymousClass82() {
            super(0);
        }

        @Override // ve.a
        public final OperativeEventRepository invoke() {
            return new OperativeEventRepository();
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$83, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass83 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass83(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final ExecuteAdViewerRequest invoke() {
            return new AndroidExecuteAdViewerRequest((y) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, x.a(y.class))), (HttpClientProvider) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(HttpClientProvider.class))), (GetCachedAsset) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetCachedAsset.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$84, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass84 extends l implements a {
        public static final AnonymousClass84 INSTANCE = new AnonymousClass84();

        public AnonymousClass84() {
            super(0);
        }

        @Override // ve.a
        public final GetByteStringId invoke() {
            return new AndroidGenerateByteStringId();
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$85, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass85 extends l implements a {
        public static final AnonymousClass85 INSTANCE = new AnonymousClass85();

        public AnonymousClass85() {
            super(0);
        }

        @Override // ve.a
        public final IntentCreation invoke() {
            return new AndroidIntentCreation();
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$86, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass86 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass86(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final HandleOpenUrl invoke() {
            return new AndroidHandleOpenUrl((Context) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(Context.class))), (IntentCreation) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(IntentCreation.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$87, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass87 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass87(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final Refresh invoke() {
            return new AndroidRefresh((y) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, x.a(y.class))), (GetAdDataRefreshRequest) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetAdDataRefreshRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_AD_REQ, x.a(GetRequestPolicy.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GatewayClient.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$88, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass88 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass88(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final SendDiagnosticEvent invoke() {
            return new AndroidSendDiagnosticEvent((DiagnosticEventRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(DiagnosticEventRepository.class))), (GetDiagnosticEventRequest) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetDiagnosticEventRequest.class))), (LifecycleDataSource) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(LifecycleDataSource.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$89, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass89 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass89(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final SendWebViewClientErrorDiagnostics invoke() {
            return new AndroidSendWebViewClientErrorDiagnostics((SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SendDiagnosticEvent.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$9, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass9 extends l implements a {
        final /* synthetic */ UnityAdsModule $moduleInstance;
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
            super(0);
            this.$moduleInstance = unityAdsModule;
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final c0 invoke() {
            return this.$moduleInstance.showCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ISDKDispatchers.class))), (a0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, x.a(a0.class))), (j1) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, x.a(j1.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$90, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass90 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass90(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final Show invoke() {
            return new AndroidShow((AdRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AdRepository.class))), (GameServerIdReader) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GameServerIdReader.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SendDiagnosticEvent.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$91, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass91 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass91(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final CacheFile invoke() {
            return new CommonCacheFile((CacheRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(CacheRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SendDiagnosticEvent.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$92, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass92 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass92(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final CleanAssets invoke() {
            return new CommonCleanAssets((CacheRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(CacheRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SendDiagnosticEvent.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$93, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass93 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass93(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final GetAdObject invoke() {
            return new CommonGetAdObject((AdRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AdRepository.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$94, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass94 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass94(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final ScarEligibleEffectiveUseCase invoke() {
            return new CommonScarEligibleEffectiveUseCase((SessionRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SessionRepository.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$95, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass95 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass95(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final GetHeaderBiddingToken invoke() {
            return new CommonGetHeaderBiddingToken((BuildHeaderBiddingToken) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(BuildHeaderBiddingToken.class))), (FetchSignalsAndSendUseCase) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(FetchSignalsAndSendUseCase.class))), (ScarEligibleEffectiveUseCase) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ScarEligibleEffectiveUseCase.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$96, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass96 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass96(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final BuildHeaderBiddingToken invoke() {
            return new AndroidBuildHeaderBiddingToken((GetByteStringId) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetByteStringId.class))), (GetClientInfo) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetClientInfo.class))), (GetSharedDataTimestamps) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetSharedDataTimestamps.class))), (GetLimitedSessionToken) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetLimitedSessionToken.class))), (GetInitializationData) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetInitializationData.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(DeviceInfoRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SessionRepository.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(CampaignRepository.class))), (TcfRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(TcfRepository.class))), (AndroidTestDataInfo) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AndroidTestDataInfo.class))), (OfferwallManager) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(OfferwallManager.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$97, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass97 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass97(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final TokenNumberProvider invoke() {
            return new CommonTokenNumberProvider((SessionRepository) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SessionRepository.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$98, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass98 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass98(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final GetInitializationData invoke() {
            return new AndroidGetInitializationData((GetInitializationRequestPayload) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetInitializationRequestPayload.class))), (GetUniversalRequestSharedData) this.$this_registry.resolveService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetUniversalRequestSharedData.class))));
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$99, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass99 extends l implements a {
        final /* synthetic */ ServicesRegistry $this_registry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass99(ServicesRegistry servicesRegistry) {
            super(0);
            this.$this_registry = servicesRegistry;
        }

        @Override // ve.a
        public final MediationInitBlobMetadataReader invoke() {
            return new MediationInitBlobMetadataReader((JsonStorage) this.$this_registry.resolveService(new ServiceKey("MEMORY", x.a(JsonStorage.class))));
        }
    }

    public ServiceProvider$initialize$1() {
        super(1);
    }

    @Override // ve.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ServicesRegistry) obj);
        return he.y.f6101a;
    }

    public final void invoke(ServicesRegistry registry) {
        k.e(registry, "$this$registry");
        UnityAdsModule unityAdsModule = new UnityAdsModule();
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(Context.class)), he.a.d(AnonymousClass1.INSTANCE));
        registry.updateService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, x.a(y.class)), he.a.d(new AnonymousClass2(unityAdsModule)));
        registry.updateService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, x.a(y.class)), he.a.d(new AnonymousClass3(unityAdsModule)));
        registry.updateService(new ServiceKey(ServiceProvider.IO_DISPATCHER, x.a(y.class)), he.a.d(new AnonymousClass4(unityAdsModule)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ISDKDispatchers.class)), he.a.d(new AnonymousClass5(unityAdsModule)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SDKMetricsSender.class)), he.a.d(new AnonymousClass6(unityAdsModule)));
        registry.updateService(new ServiceKey(ServiceProvider.NAMED_INIT_SCOPE, x.a(c0.class)), ServiceFactoryKt.factoryOf(new AnonymousClass7(unityAdsModule, registry)));
        registry.updateService(new ServiceKey(ServiceProvider.NAMED_LOAD_SCOPE, x.a(c0.class)), ServiceFactoryKt.factoryOf(new AnonymousClass8(unityAdsModule, registry)));
        registry.updateService(new ServiceKey(ServiceProvider.NAMED_SHOW_SCOPE, x.a(c0.class)), ServiceFactoryKt.factoryOf(new AnonymousClass9(unityAdsModule, registry)));
        registry.updateService(new ServiceKey(ServiceProvider.NAMED_TRANSACTION_SCOPE, x.a(c0.class)), ServiceFactoryKt.factoryOf(new AnonymousClass10(unityAdsModule, registry)));
        registry.updateService(new ServiceKey(ServiceProvider.NAMED_GET_TOKEN_SCOPE, x.a(c0.class)), ServiceFactoryKt.factoryOf(new AnonymousClass11(unityAdsModule, registry)));
        registry.updateService(new ServiceKey(ServiceProvider.NAMED_SCAR_SCOPE, x.a(c0.class)), ServiceFactoryKt.factoryOf(new AnonymousClass12(unityAdsModule, registry)));
        registry.updateService(new ServiceKey(ServiceProvider.NAMED_OFFERWALL_SCOPE, x.a(c0.class)), ServiceFactoryKt.factoryOf(new AnonymousClass13(unityAdsModule, registry)));
        registry.updateService(new ServiceKey(ServiceProvider.NAMED_OMID_SCOPE, x.a(c0.class)), ServiceFactoryKt.factoryOf(new AnonymousClass14(unityAdsModule, registry)));
        registry.updateService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, x.a(j1.class)), ServiceFactoryKt.factoryOf(new AnonymousClass15(unityAdsModule, registry)));
        registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_GATEWAY_CACHE, x.a(ByteStringDataSource.class)), he.a.d(new AnonymousClass16(registry)));
        registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, x.a(h.class)), he.a.d(new AnonymousClass17(unityAdsModule, registry)));
        registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, x.a(ByteStringDataSource.class)), he.a.d(new AnonymousClass18(unityAdsModule, registry)));
        registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, x.a(h.class)), he.a.d(new AnonymousClass19(unityAdsModule, registry)));
        registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, x.a(ByteStringDataSource.class)), he.a.d(new AnonymousClass20(unityAdsModule, registry)));
        registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, x.a(h.class)), he.a.d(new AnonymousClass21(unityAdsModule, registry)));
        registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, x.a(ByteStringDataSource.class)), he.a.d(new AnonymousClass22(unityAdsModule, registry)));
        registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, x.a(h.class)), he.a.d(new AnonymousClass23(unityAdsModule, registry)));
        registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, x.a(ByteStringDataSource.class)), he.a.d(new AnonymousClass24(unityAdsModule, registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(UniversalRequestDataStoreProvider.class)), he.a.d(new AnonymousClass25(registry)));
        registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, x.a(h.class)), he.a.d(new AnonymousClass26(unityAdsModule, registry)));
        registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, x.a(ByteStringDataSource.class)), he.a.d(new AnonymousClass27(unityAdsModule, registry)));
        registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_WEBVIEW_CONFIG, x.a(h.class)), he.a.d(new AnonymousClass28(unityAdsModule, registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AsyncTokenStorage.class)), he.a.d(new AnonymousClass29(unityAdsModule, registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(VolumeChangeMonitor.class)), he.a.d(new AnonymousClass30(unityAdsModule, registry)));
        registry.updateService(new ServiceKey("PUBLIC", x.a(JsonStorage.class)), he.a.d(new AnonymousClass31(unityAdsModule)));
        registry.updateService(new ServiceKey("PRIVATE", x.a(JsonStorage.class)), he.a.d(new AnonymousClass32(unityAdsModule)));
        registry.updateService(new ServiceKey("MEMORY", x.a(JsonStorage.class)), he.a.d(new AnonymousClass33(unityAdsModule)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(NativeConfigurationOuterClass.NativeConfiguration.class)), he.a.d(new AnonymousClass34(unityAdsModule)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(MeasurementsService.class)), he.a.d(new AnonymousClass35(unityAdsModule, registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(TopicsService.class)), he.a.d(new AnonymousClass36(unityAdsModule, registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(CronetEngineBuilderFactory.class)), he.a.d(AnonymousClass37.INSTANCE));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(HttpClientProvider.class)), he.a.d(new AnonymousClass38(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(HttpClient.class)), he.a.d(new AnonymousClass39(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(MediationTraitsMetadataReader.class)), ServiceFactoryKt.factoryOf(new AnonymousClass40(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AlternativeFlowReader.class)), he.a.d(new AnonymousClass41(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(TcfDataSource.class)), he.a.d(AnonymousClass42.INSTANCE));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(TcfRepository.class)), he.a.d(new AnonymousClass43(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AndroidManifestIntPropertyReader.class)), he.a.d(new AnonymousClass44(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AndroidTestDataInfo.class)), he.a.d(new AnonymousClass45(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GameServerIdReader.class)), he.a.d(new AnonymousClass46(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(StoreDataSource.class)), he.a.d(new AnonymousClass47(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AnalyticsDataSource.class)), he.a.d(AnonymousClass48.INSTANCE));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(DeveloperConsentDataSource.class)), he.a.d(new AnonymousClass49(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(DynamicDeviceInfoDataSource.class)), he.a.d(new AnonymousClass50(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(LegacyUserConsentDataSource.class)), he.a.d(new AnonymousClass51(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(LifecycleDataSource.class)), he.a.d(AnonymousClass52.INSTANCE));
        registry.updateService(new ServiceKey(ServiceProvider.NAMED_LOCAL, x.a(CacheDataSource.class)), he.a.d(new AnonymousClass53(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(CreateFile.class)), he.a.d(AnonymousClass54.INSTANCE));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetFileExtensionFromUrl.class)), he.a.d(new AnonymousClass55(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(RemoveUrlQuery.class)), he.a.d(AnonymousClass56.INSTANCE));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(MediationDataSource.class)), he.a.d(new AnonymousClass57(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(PrivacyDeviceInfoDataSource.class)), he.a.d(new AnonymousClass58(registry)));
        registry.updateService(new ServiceKey(ServiceProvider.NAMED_REMOTE, x.a(CacheDataSource.class)), he.a.d(new AnonymousClass59(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(StaticDeviceInfoDataSource.class)), he.a.d(new AnonymousClass60(registry)));
        registry.updateService(new ServiceKey(ServiceProvider.PREF_GL_INFO, x.a(d.class)), he.a.d(new AnonymousClass61(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(UniversalRequestDataSource.class)), he.a.d(new AnonymousClass62(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(WebviewConfigurationDataSource.class)), he.a.d(new AnonymousClass63(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(OmidManager.class)), he.a.d(AnonymousClass64.INSTANCE));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SDKPropertiesManager.class)), he.a.d(AnonymousClass65.INSTANCE));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(StorageManager.class)), he.a.d(AnonymousClass66.INSTANCE));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(BillingClientAdapter.class)), he.a.d(new AnonymousClass67(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ProductDetailsFetcher.class)), he.a.d(new AnonymousClass68(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(TransactionEventManager.class)), he.a.d(new AnonymousClass69(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AdRepository.class)), he.a.d(AnonymousClass70.INSTANCE));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(CacheRepository.class)), he.a.d(new AnonymousClass71(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetCacheDirectory.class)), he.a.d(AnonymousClass72.INSTANCE));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(CampaignRepository.class)), he.a.d(new AnonymousClass73(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(DeveloperConsentRepository.class)), he.a.d(new AnonymousClass74(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(DeviceInfoRepository.class)), he.a.d(new AnonymousClass75(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(DiagnosticEventRepository.class)), he.a.d(new AnonymousClass76(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(LegacyUserConsentRepository.class)), he.a.d(new AnonymousClass77(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(MediationRepository.class)), he.a.d(new AnonymousClass78(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(OpenMeasurementRepository.class)), he.a.d(new AnonymousClass79(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SessionRepository.class)), he.a.d(new AnonymousClass80(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(TransactionEventRepository.class)), he.a.d(AnonymousClass81.INSTANCE));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(OperativeEventRepository.class)), he.a.d(AnonymousClass82.INSTANCE));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ExecuteAdViewerRequest.class)), he.a.d(new AnonymousClass83(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetByteStringId.class)), he.a.d(AnonymousClass84.INSTANCE));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(IntentCreation.class)), ServiceFactoryKt.factoryOf(AnonymousClass85.INSTANCE));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(HandleOpenUrl.class)), ServiceFactoryKt.factoryOf(new AnonymousClass86(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(Refresh.class)), he.a.d(new AnonymousClass87(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SendDiagnosticEvent.class)), he.a.d(new AnonymousClass88(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SendWebViewClientErrorDiagnostics.class)), he.a.d(new AnonymousClass89(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(Show.class)), he.a.d(new AnonymousClass90(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(CacheFile.class)), he.a.d(new AnonymousClass91(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(CleanAssets.class)), he.a.d(new AnonymousClass92(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetAdObject.class)), he.a.d(new AnonymousClass93(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ScarEligibleEffectiveUseCase.class)), ServiceFactoryKt.factoryOf(new AnonymousClass94(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(new AnonymousClass95(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(BuildHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(new AnonymousClass96(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(TokenNumberProvider.class)), ServiceFactoryKt.factoryOf(new AnonymousClass97(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetInitializationData.class)), he.a.d(new AnonymousClass98(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(MediationInitBlobMetadataReader.class)), ServiceFactoryKt.factoryOf(new AnonymousClass99(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetInitializationRequestPayload.class)), he.a.d(new AnonymousClass100(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetInitializationState.class)), he.a.d(new AnonymousClass101(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetIsFileCache.class)), he.a.d(new AnonymousClass102(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SetInitializationState.class)), he.a.d(new AnonymousClass103(registry)));
        registry.updateService(new ServiceKey(ServiceProvider.NAMED_AD_REQ, x.a(GetRequestPolicy.class)), he.a.d(new AnonymousClass104(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetAdDataRefreshRequest.class)), he.a.d(new AnonymousClass105(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetAdPlayerConfigRequest.class)), he.a.d(new AnonymousClass106(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AndroidGetAdPlayerContext.class)), he.a.d(new AnonymousClass107(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetAdRequest.class)), he.a.d(new AnonymousClass108(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetHbTokenEventRequest.class)), he.a.d(AnonymousClass109.INSTANCE));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(CommonScarEventReceiver.class)), he.a.d(new AnonymousClass110(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GMAScarAdapterBridge.class)), he.a.d(new AnonymousClass111(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ScarTimeHackFixer.class)), he.a.d(new AnonymousClass112(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ScarManager.class)), he.a.d(new AnonymousClass113(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(FetchSignalsAndSendUseCase.class)), he.a.d(new AnonymousClass114(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(LoadScarAd.class)), he.a.d(new AnonymousClass115(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(HandleGetTokenRequest.class)), he.a.d(new AnonymousClass116(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetClientInfo.class)), he.a.d(new AnonymousClass117(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetInitializationCompletedRequest.class)), he.a.d(new AnonymousClass118(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetInitializationRequest.class)), he.a.d(new AnonymousClass119(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetLimitedSessionToken.class)), he.a.d(new AnonymousClass120(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetOpenGLRendererInfo.class)), he.a.d(new AnonymousClass121(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetSharedDataTimestamps.class)), he.a.d(AnonymousClass122.INSTANCE));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetUniversalRequestForPayLoad.class)), he.a.d(new AnonymousClass123(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetUniversalRequestSharedData.class)), he.a.d(new AnonymousClass124(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetCachedAsset.class)), he.a.d(new AnonymousClass125(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetWebViewBridgeUseCase.class)), he.a.d(new AnonymousClass126(registry)));
        registry.updateService(new ServiceKey(ServiceProvider.NAMED_INIT_REQ, x.a(GetRequestPolicy.class)), he.a.d(new AnonymousClass127(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetLatestWebViewConfiguration.class)), he.a.d(new AnonymousClass128(registry)));
        registry.updateService(new ServiceKey(ServiceProvider.NAMED_OPERATIVE_REQ, x.a(GetRequestPolicy.class)), he.a.d(new AnonymousClass129(registry)));
        registry.updateService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, x.a(GetRequestPolicy.class)), he.a.d(new AnonymousClass130(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetPrivacyUpdateRequest.class)), he.a.d(new AnonymousClass131(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(HandleGatewayInitializationResponse.class)), he.a.d(new AnonymousClass132(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(HandleGatewayUniversalResponse.class)), he.a.d(new AnonymousClass133(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(InitializeBoldSDK.class)), he.a.d(new AnonymousClass134(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(LegacyShowUseCase.class)), ServiceFactoryKt.factoryOf(new AnonymousClass135(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SendPrivacyUpdateRequest.class)), he.a.d(new AnonymousClass136(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(TriggerInitializationCompletedRequest.class)), he.a.d(new AnonymousClass137(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(TriggerInitializeListener.class)), he.a.d(new AnonymousClass138(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(DiagnosticEventObserver.class)), he.a.d(new AnonymousClass139(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(EventObservers.class)), he.a.d(new AnonymousClass140(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetTransactionData.class)), he.a.d(new AnonymousClass141(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetTransactionRequest.class)), he.a.d(new AnonymousClass142(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetDiagnosticEventBatchRequest.class)), he.a.d(AnonymousClass143.INSTANCE));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetDiagnosticEventRequest.class)), he.a.d(new AnonymousClass144(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetOperativeEventApi.class)), he.a.d(new AnonymousClass145(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetOperativeEventRequest.class)), he.a.d(new AnonymousClass146(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(HandleGatewayEventResponse.class)), he.a.d(AnonymousClass147.INSTANCE));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(OperativeEventObserver.class)), he.a.d(new AnonymousClass148(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(TransactionEventObserver.class)), he.a.d(new AnonymousClass149(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(UniversalRequestTtlValidator.class)), he.a.d(AnonymousClass150.INSTANCE));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(UniversalRequestEventSender.class)), he.a.d(new AnonymousClass151(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(OmFinishSession.class)), he.a.d(new AnonymousClass152(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(OmImpressionOccurred.class)), he.a.d(new AnonymousClass153(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AndroidOmInteraction.class)), he.a.d(new AnonymousClass154(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetOmData.class)), he.a.d(new AnonymousClass155(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(IsOMActivated.class)), he.a.d(new AnonymousClass156(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(InitializeOMSDK.class)), he.a.d(new AnonymousClass157(registry)));
        registry.updateService(new ServiceKey(ServiceProvider.DEV_CONSENT_PRIVACY_RULES, x.a(FlattenerRulesUseCase.class)), he.a.d(AnonymousClass158.INSTANCE));
        registry.updateService(new ServiceKey(ServiceProvider.LEGACY_PRIVACY_RULES, x.a(FlattenerRulesUseCase.class)), he.a.d(AnonymousClass159.INSTANCE));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(BackgroundWorker.class)), he.a.d(new AnonymousClass160(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(DiagnosticEventRequestWorkModifier.class)), he.a.d(new AnonymousClass161(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GatewayClient.class)), he.a.d(new AnonymousClass162(registry)));
        registry.updateService(new ServiceKey(ServiceProvider.NAMED_SDK, x.a(a0.class)), he.a.d(new AnonymousClass163(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(TokenStorage.class)), he.a.d(AnonymousClass164.INSTANCE));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(VolumeChange.class)), he.a.d(AnonymousClass165.INSTANCE));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ConfigFileFromLocalStorage.class)), he.a.d(new AnonymousClass166(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(InitializeSDK.class)), he.a.d(new AnonymousClass167(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(InitializeStateComplete.class)), he.a.d(new AnonymousClass168(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(InitializeStateConfig.class)), he.a.d(new AnonymousClass169(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(InitializeStateConfigWithLoader.class)), he.a.d(new AnonymousClass170(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(InitializeStateCreate.class)), he.a.d(new AnonymousClass171(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(InitializeStateError.class)), he.a.d(new AnonymousClass172(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(InitializeStateLoadCache.class)), he.a.d(new AnonymousClass173(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(InitializeStateLoadWeb.class)), he.a.d(new AnonymousClass174(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(InitializeStateReset.class)), he.a.d(new AnonymousClass175(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(StoreMonitor.class)), he.a.d(new AnonymousClass176(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(StoreWebViewEventSender.class)), he.a.d(new AnonymousClass177(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(StoreExceptionHandler.class)), he.a.d(AnonymousClass178.INSTANCE));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(StoreEventListenerFactory.class)), he.a.d(new AnonymousClass179(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ConfigurationReader.class)), he.a.d(AnonymousClass180.INSTANCE));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AndroidAttribution.class)), he.a.d(new AnonymousClass181(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AdPlayerScope.class)), ServiceFactoryKt.factoryOf(new AnonymousClass182(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AndroidWebViewClient.class)), ServiceFactoryKt.factoryOf(new AnonymousClass183(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AndroidGetWebViewContainerUseCase.class)), ServiceFactoryKt.factoryOf(new AnonymousClass184(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(Load.class)), ServiceFactoryKt.factoryOf(new AnonymousClass185(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AwaitInitialization.class)), ServiceFactoryKt.factoryOf(new AnonymousClass186(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetAsyncHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(new AnonymousClass187(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetAdPlayer.class)), ServiceFactoryKt.factoryOf(new AnonymousClass188(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(CacheWebViewAssets.class)), he.a.d(new AnonymousClass189(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(HandleGatewayAdResponse.class)), ServiceFactoryKt.factoryOf(new AnonymousClass190(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(HandleInvocationsFromAdViewer.class)), ServiceFactoryKt.factoryOf(AnonymousClass191.INSTANCE));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(LegacyLoadUseCase.class)), ServiceFactoryKt.factoryOf(new AnonymousClass192(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SafeCallbackInvoke.class)), he.a.d(new AnonymousClass193(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(InitializeStateNetworkError.class)), ServiceFactoryKt.factoryOf(new AnonymousClass194(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(CoroutineTimer.class)), ServiceFactoryKt.factoryOf(new AnonymousClass195(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(IEventSender.class)), he.a.d(AnonymousClass196.INSTANCE));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(SetGameId.class)), he.a.d(new AnonymousClass197(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetGameId.class)), he.a.d(new AnonymousClass198(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ValidateGameId.class)), he.a.d(new AnonymousClass199(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ShouldAllowInitialization.class)), he.a.d(new AnonymousClass200(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(CheckForGameIdAndTestModeChanges.class)), he.a.d(new AnonymousClass201(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(DownloadPriorityQueue.class)), he.a.d(AnonymousClass202.INSTANCE));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(CleanupDirectory.class)), he.a.d(AnonymousClass203.INSTANCE));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(FocusRepository.class)), he.a.d(new AnonymousClass204(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AndroidGetIsAdActivity.class)), he.a.d(new AnonymousClass205(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AndroidGetLifecycleFlow.class)), he.a.d(new AnonymousClass206(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AndroidHandleFocusCounters.class)), he.a.d(new AnonymousClass207(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(OfferwallAdapterBridge.class)), he.a.d(new AnonymousClass208(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(OfferwallManager.class)), he.a.d(new AnonymousClass209(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(LoadOfferwallAd.class)), he.a.d(new AnonymousClass210(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetIsOfferwallAdReady.class)), he.a.d(new AnonymousClass211(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(FIdDataSource.class)), he.a.d(new AnonymousClass212(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(FIdExistenceDataSource.class)), he.a.d(AnonymousClass213.INSTANCE));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(CleanUpWhenOpportunityExpires.class)), he.a.d(new AnonymousClass214(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(OrientationRepository.class)), he.a.d(new AnonymousClass215(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AndroidAppSetIdDataSource.class)), he.a.d(new AnonymousClass216(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AndroidUnityInfoDataSource.class)), he.a.d(new AnonymousClass217(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(HandleDebugSettings.class)), he.a.d(new AnonymousClass218(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(Logger.class)), he.a.d(new AnonymousClass219(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(IsBillingClientAvailable.class)), he.a.d(AnonymousClass220.INSTANCE));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(UnityBootConfigDataSource.class)), he.a.d(new AnonymousClass221(registry)));
        registry.updateService(new ServiceKey(HttpUrl.FRAGMENT_ENCODE_SET, x.a(GetSafeguardedInitializationPolicy.class)), he.a.d(AnonymousClass222.INSTANCE));
    }
}
