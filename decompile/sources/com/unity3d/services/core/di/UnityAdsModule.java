package com.unity3d.services.core.di;

import a8.g;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import b1.d;
import b1.h;
import b1.i;
import com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.model.ByteStringSerializer;
import com.unity3d.ads.core.data.model.WebViewConfigurationStoreSerializer;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.ads.measurements.MeasurementsService;
import com.unity3d.services.ads.token.AsyncTokenStorage;
import com.unity3d.services.ads.token.InMemoryAsyncTokenStorage;
import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.ads.topics.TopicsService;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.device.VolumeChange;
import com.unity3d.services.core.device.VolumeChangeMonitor;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.SDKDispatchers;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.metrics.SDKMetrics;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import gatewayprotocol.v1.AdOperationsConfigurationKt;
import gatewayprotocol.v1.DiagnosticEventsConfigurationKt;
import gatewayprotocol.v1.FeatureFlagsKt;
import gatewayprotocol.v1.NativeConfigurationKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.RequestPolicyKt;
import gatewayprotocol.v1.RequestRetryPolicyKt;
import gatewayprotocol.v1.RequestTimeoutPolicyKt;
import gf.a0;
import gf.b0;
import gf.c0;
import gf.f0;
import gf.j1;
import gf.m1;
import gf.o0;
import gf.y;
import kotlin.jvm.internal.k;
import mf.o;
import of.e;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class UnityAdsModule {
    private final NativeConfigurationOuterClass.AdOperationsConfiguration getDefaultAdOperations() {
        AdOperationsConfigurationKt.Dsl.Companion companion = AdOperationsConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.AdOperationsConfiguration.Builder newBuilder = NativeConfigurationOuterClass.AdOperationsConfiguration.newBuilder();
        k.d(newBuilder, "newBuilder()");
        AdOperationsConfigurationKt.Dsl _create = companion._create(newBuilder);
        _create.setLoadTimeoutMs(30000);
        _create.setShowTimeoutMs(UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS);
        _create.setGetTokenTimeoutMs(UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS);
        return _create._build();
    }

    private final NativeConfigurationOuterClass.RequestPolicy getDefaultRequestPolicy() {
        RequestPolicyKt.Dsl.Companion companion = RequestPolicyKt.Dsl.Companion;
        NativeConfigurationOuterClass.RequestPolicy.Builder newBuilder = NativeConfigurationOuterClass.RequestPolicy.newBuilder();
        k.d(newBuilder, "newBuilder()");
        RequestPolicyKt.Dsl _create = companion._create(newBuilder);
        _create.setRetryPolicy(getDefaultRequestRetryPolicy());
        _create.setTimeoutPolicy(getDefaultRequestTimeoutPolicy());
        return _create._build();
    }

    private final NativeConfigurationOuterClass.RequestRetryPolicy getDefaultRequestRetryPolicy() {
        RequestRetryPolicyKt.Dsl.Companion companion = RequestRetryPolicyKt.Dsl.Companion;
        NativeConfigurationOuterClass.RequestRetryPolicy.Builder newBuilder = NativeConfigurationOuterClass.RequestRetryPolicy.newBuilder();
        k.d(newBuilder, "newBuilder()");
        RequestRetryPolicyKt.Dsl _create = companion._create(newBuilder);
        _create.setMaxDuration(UnityAdsConstants.RequestPolicy.RETRY_MAX_DURATION);
        _create.setRetryWaitBase(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
        _create.setRetryJitterPct(0.1f);
        _create.setShouldStoreLocally(false);
        _create.setRetryMaxInterval(UnityAdsConstants.RequestPolicy.RETRY_MAX_INTERVAL);
        _create.setRetryScalingFactor(2.0f);
        return _create._build();
    }

    private final NativeConfigurationOuterClass.RequestTimeoutPolicy getDefaultRequestTimeoutPolicy() {
        RequestTimeoutPolicyKt.Dsl.Companion companion = RequestTimeoutPolicyKt.Dsl.Companion;
        NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder newBuilder = NativeConfigurationOuterClass.RequestTimeoutPolicy.newBuilder();
        k.d(newBuilder, "newBuilder()");
        RequestTimeoutPolicyKt.Dsl _create = companion._create(newBuilder);
        _create.setConnectTimeoutMs(30000);
        _create.setReadTimeoutMs(30000);
        _create.setWriteTimeoutMs(30000);
        _create.setOverallTimeoutMs(30000);
        return _create._build();
    }

    private final ByteStringDataSource provideByteStringDataSource(h hVar) {
        return new AndroidByteStringDataSource(hVar);
    }

    private final h provideByteStringDataStore(Context context, y yVar, String str) {
        return i.a(new ByteStringSerializer(), null, null, f0.b(yVar.plus(f0.e())), new UnityAdsModule$provideByteStringDataStore$1(context, str), 4);
    }

    private final JsonStorage provideJsonStorage(StorageManager.StorageType storageType) {
        if (StorageManager.init(ClientProperties.getApplicationContext())) {
            Storage storage = StorageManager.getStorage(storageType);
            k.d(storage, "getStorage(storageType)");
            return storage;
        }
        throw new IllegalStateException("StorageManager failed to initialize");
    }

    public final Context androidContext() {
        Context applicationContext = ClientProperties.getApplicationContext();
        k.d(applicationContext, "getApplicationContext()");
        return applicationContext;
    }

    public final AsyncTokenStorage asyncTokenStorage(TokenStorage tokenStorage, SDKMetricsSender sdkMetricsSender) {
        k.e(tokenStorage, "tokenStorage");
        k.e(sdkMetricsSender, "sdkMetricsSender");
        return new InMemoryAsyncTokenStorage(null, new Handler(Looper.getMainLooper()), sdkMetricsSender, tokenStorage);
    }

    public final ByteStringDataSource auidDataStore(h dataStore) {
        k.e(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final y defaultDispatcher() {
        return o0.f5693a;
    }

    public final NativeConfigurationOuterClass.NativeConfiguration defaultNativeConfiguration() {
        NativeConfigurationKt.Dsl.Companion companion = NativeConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.NativeConfiguration.Builder newBuilder = NativeConfigurationOuterClass.NativeConfiguration.newBuilder();
        k.d(newBuilder, "newBuilder()");
        NativeConfigurationKt.Dsl _create = companion._create(newBuilder);
        _create.setAdOperations(getDefaultAdOperations());
        _create.setInitPolicy(getDefaultRequestPolicy());
        _create.setAdPolicy(getDefaultRequestPolicy());
        _create.setOtherPolicy(getDefaultRequestPolicy());
        _create.setOperativeEventPolicy(getDefaultRequestPolicy());
        DiagnosticEventsConfigurationKt.Dsl.Companion companion2 = DiagnosticEventsConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder newBuilder2 = NativeConfigurationOuterClass.DiagnosticEventsConfiguration.newBuilder();
        k.d(newBuilder2, "newBuilder()");
        DiagnosticEventsConfigurationKt.Dsl _create2 = companion2._create(newBuilder2);
        _create2.setEnabled(true);
        _create2.setMaxBatchSize(10);
        _create2.setMaxBatchIntervalMs(30000);
        _create2.setTtmEnabled(false);
        _create.setDiagnosticEvents(_create2._build());
        FeatureFlagsKt.Dsl.Companion companion3 = FeatureFlagsKt.Dsl.Companion;
        NativeConfigurationOuterClass.FeatureFlags.Builder newBuilder3 = NativeConfigurationOuterClass.FeatureFlags.newBuilder();
        k.d(newBuilder3, "newBuilder()");
        FeatureFlagsKt.Dsl _create3 = companion3._create(newBuilder3);
        _create3.setBoldSdkNextSessionEnabled(true);
        _create.setFeatureFlags(_create3._build());
        return _create._build();
    }

    public final ByteStringDataSource gatewayCacheDataStore(h dataStore) {
        k.e(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final h gatewayDataStore(Context context, y dispatcher) {
        k.e(context, "context");
        k.e(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, ServiceProvider.DATA_STORE_GATEWAY_CACHE);
    }

    public final c0 getTokenCoroutineScope(ISDKDispatchers dispatchers, a0 errorHandler, j1 parentJob) {
        k.e(dispatchers, "dispatchers");
        k.e(errorHandler, "errorHandler");
        k.e(parentJob, "parentJob");
        return f0.b(parentJob.plus(dispatchers.getDefault()).plus(new b0(ServiceProvider.NAMED_GET_TOKEN_SCOPE)).plus(errorHandler));
    }

    public final h glInfoDataStore(Context context, y dispatcher, d fetchGLInfo) {
        k.e(context, "context");
        k.e(dispatcher, "dispatcher");
        k.e(fetchGLInfo, "fetchGLInfo");
        return i.a(new ByteStringSerializer(), null, g.m(fetchGLInfo), f0.b(dispatcher.plus(f0.e())), new UnityAdsModule$glInfoDataStore$1(context), 2);
    }

    public final h iapTransactionDataStore(Context context, y dispatcher) {
        k.e(context, "context");
        k.e(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, ServiceProvider.DATA_STORE_IAP_TRANSACTION);
    }

    public final ByteStringDataSource idfiDataStore(h dataStore) {
        k.e(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final c0 initCoroutineScope(ISDKDispatchers dispatchers, a0 errorHandler, j1 parentJob) {
        k.e(dispatchers, "dispatchers");
        k.e(errorHandler, "errorHandler");
        k.e(parentJob, "parentJob");
        return f0.b(parentJob.plus(dispatchers.getDefault()).plus(new b0(ServiceProvider.NAMED_INIT_SCOPE)).plus(errorHandler));
    }

    public final y ioDispatcher() {
        return o0.f5694b;
    }

    public final c0 loadCoroutineScope(ISDKDispatchers dispatchers, a0 errorHandler, j1 parentJob) {
        k.e(dispatchers, "dispatchers");
        k.e(errorHandler, "errorHandler");
        k.e(parentJob, "parentJob");
        return f0.b(parentJob.plus(dispatchers.getDefault()).plus(new b0(ServiceProvider.NAMED_LOAD_SCOPE)).plus(errorHandler));
    }

    public final y mainDispatcher() {
        e eVar = o0.f5693a;
        return o.f8875a;
    }

    public final MeasurementsService measurementService(Context context, ISDKDispatchers dispatchers) {
        k.e(context, "context");
        k.e(dispatchers, "dispatchers");
        return new MeasurementsService(context, dispatchers, SharedInstances.INSTANCE.getWebViewEventSender());
    }

    public final JsonStorage memoryJsonStorage() {
        return provideJsonStorage(StorageManager.StorageType.MEMORY);
    }

    public final h nativeConfigurationDataStore(Context context, y dispatcher) {
        k.e(context, "context");
        k.e(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, ServiceProvider.DATA_STORE_NATIVE_CONFIG);
    }

    public final c0 offerwallSignalsCoroutineScope(ISDKDispatchers dispatchers, a0 errorHandler, j1 parentJob) {
        k.e(dispatchers, "dispatchers");
        k.e(errorHandler, "errorHandler");
        k.e(parentJob, "parentJob");
        return f0.b(parentJob.plus(dispatchers.getDefault()).plus(new b0(ServiceProvider.NAMED_OFFERWALL_SCOPE)).plus(errorHandler));
    }

    public final c0 omidCoroutineScope(ISDKDispatchers dispatchers, a0 errorHandler, j1 parentJob) {
        k.e(dispatchers, "dispatchers");
        k.e(errorHandler, "errorHandler");
        k.e(parentJob, "parentJob");
        return f0.b(parentJob.plus(dispatchers.getDefault()).plus(new b0(ServiceProvider.NAMED_OMID_SCOPE)).plus(errorHandler));
    }

    public final h privacyDataStore(Context context, y dispatcher) {
        k.e(context, "context");
        k.e(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, ServiceProvider.DATA_STORE_PRIVACY);
    }

    public final h privacyFsmDataStore(Context context, y dispatcher) {
        k.e(context, "context");
        k.e(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, ServiceProvider.DATA_STORE_PRIVACY_FSM);
    }

    public final JsonStorage privateJsonStorage() {
        return provideJsonStorage(StorageManager.StorageType.PRIVATE);
    }

    public final j1 publicApiJob(DiagnosticEventRepository diagnosticEventRepository) {
        k.e(diagnosticEventRepository, "diagnosticEventRepository");
        m1 c10 = f0.c();
        c10.y(new UnityAdsModule$publicApiJob$1$1(diagnosticEventRepository));
        return c10;
    }

    public final JsonStorage publicJsonStorage() {
        return provideJsonStorage(StorageManager.StorageType.PUBLIC);
    }

    public final c0 scarSignalsCoroutineScope(ISDKDispatchers dispatchers, a0 errorHandler, j1 parentJob) {
        k.e(dispatchers, "dispatchers");
        k.e(errorHandler, "errorHandler");
        k.e(parentJob, "parentJob");
        return f0.b(parentJob.plus(dispatchers.getDefault()).plus(new b0(ServiceProvider.NAMED_SCAR_SCOPE)).plus(errorHandler));
    }

    public final ISDKDispatchers sdkDispatchers() {
        return new SDKDispatchers();
    }

    public final SDKMetricsSender sdkMetrics() {
        SDKMetricsSender sDKMetrics = SDKMetrics.getInstance();
        k.d(sDKMetrics, "getInstance()");
        return sDKMetrics;
    }

    public final c0 showCoroutineScope(ISDKDispatchers dispatchers, a0 errorHandler, j1 parentJob) {
        k.e(dispatchers, "dispatchers");
        k.e(errorHandler, "errorHandler");
        k.e(parentJob, "parentJob");
        return f0.b(parentJob.plus(dispatchers.getDefault()).plus(new b0(ServiceProvider.NAMED_SHOW_SCOPE)).plus(errorHandler));
    }

    public final TopicsService topicsService(Context context, ISDKDispatchers dispatchers) {
        k.e(context, "context");
        k.e(dispatchers, "dispatchers");
        return new TopicsService(context, dispatchers, SharedInstances.INSTANCE.getWebViewEventSender());
    }

    public final c0 transactionCoroutineScope(ISDKDispatchers dispatchers, a0 errorHandler, j1 parentJob) {
        k.e(dispatchers, "dispatchers");
        k.e(errorHandler, "errorHandler");
        k.e(parentJob, "parentJob");
        return f0.b(parentJob.plus(dispatchers.getDefault()).plus(new b0(ServiceProvider.NAMED_TRANSACTION_SCOPE)).plus(errorHandler));
    }

    public final VolumeChangeMonitor volumeChangeMonitor(VolumeChange volumeChange) {
        k.e(volumeChange, "volumeChange");
        return new VolumeChangeMonitor(SharedInstances.INSTANCE.getWebViewEventSender(), volumeChange);
    }

    public final h webViewConfigurationDataStore(Context context, y dispatcher) {
        k.e(context, "context");
        k.e(dispatcher, "dispatcher");
        return i.a(new WebViewConfigurationStoreSerializer(), null, null, f0.b(dispatcher.plus(f0.e())), new UnityAdsModule$webViewConfigurationDataStore$1(context), 4);
    }

    public final ByteStringDataSource iapTransactionDataStore(h dataStore) {
        k.e(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final ByteStringDataSource nativeConfigurationDataStore(h dataStore) {
        k.e(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final ByteStringDataSource privacyDataStore(h dataStore) {
        k.e(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final ByteStringDataSource privacyFsmDataStore(h dataStore) {
        k.e(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final ByteStringDataSource glInfoDataStore(h dataStore) {
        k.e(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }
}
