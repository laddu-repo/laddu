package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.manager.TransactionEventManager;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.NativeConfigurationKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gf.c0;
import gf.f0;
import he.y;
import java.util.List;
import kotlin.jvm.internal.k;
import le.c;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidHandleGatewayInitializationResponse implements HandleGatewayInitializationResponse {
    private final GetSafeguardedInitializationPolicy getSafeguardedInitializationPolicy;
    private final HandleDebugSettings handleDebugSettings;
    private final c0 sdkScope;
    private final SessionRepository sessionRepository;
    private final TransactionEventManager transactionEventManager;
    private final TriggerInitializationCompletedRequest triggerInitializationCompletedRequest;

    public AndroidHandleGatewayInitializationResponse(TransactionEventManager transactionEventManager, TriggerInitializationCompletedRequest triggerInitializationCompletedRequest, SessionRepository sessionRepository, c0 sdkScope, HandleDebugSettings handleDebugSettings, GetSafeguardedInitializationPolicy getSafeguardedInitializationPolicy) {
        k.e(transactionEventManager, "transactionEventManager");
        k.e(triggerInitializationCompletedRequest, "triggerInitializationCompletedRequest");
        k.e(sessionRepository, "sessionRepository");
        k.e(sdkScope, "sdkScope");
        k.e(handleDebugSettings, "handleDebugSettings");
        k.e(getSafeguardedInitializationPolicy, "getSafeguardedInitializationPolicy");
        this.transactionEventManager = transactionEventManager;
        this.triggerInitializationCompletedRequest = triggerInitializationCompletedRequest;
        this.sessionRepository = sessionRepository;
        this.sdkScope = sdkScope;
        this.handleDebugSettings = handleDebugSettings;
        this.getSafeguardedInitializationPolicy = getSafeguardedInitializationPolicy;
    }

    @Override // com.unity3d.ads.core.domain.HandleGatewayInitializationResponse
    public Object invoke(InitializationResponseOuterClass.InitializationResponse initializationResponse, c cVar) {
        String universalRequestUrl;
        if (!initializationResponse.hasError()) {
            SessionRepository sessionRepository = this.sessionRepository;
            NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration = initializationResponse.getNativeConfiguration();
            k.d(nativeConfiguration, "response.nativeConfiguration");
            NativeConfigurationKt.Dsl.Companion companion = NativeConfigurationKt.Dsl.Companion;
            NativeConfigurationOuterClass.NativeConfiguration.Builder builder = nativeConfiguration.toBuilder();
            k.d(builder, "this.toBuilder()");
            NativeConfigurationKt.Dsl _create = companion._create(builder);
            _create.setInitPolicy(this.getSafeguardedInitializationPolicy.invoke(_create.getInitPolicy()));
            sessionRepository.setNativeConfiguration(_create._build());
            if (initializationResponse.hasUniversalRequestUrl() && (universalRequestUrl = initializationResponse.getUniversalRequestUrl()) != null && universalRequestUrl.length() != 0) {
                SessionRepository sessionRepository2 = this.sessionRepository;
                String universalRequestUrl2 = initializationResponse.getUniversalRequestUrl();
                k.d(universalRequestUrl2, "response.universalRequestUrl");
                sessionRepository2.setGatewayUrl(universalRequestUrl2);
            }
            List<AdFormatOuterClass.AdFormat> scarEligibleFormats = this.sessionRepository.getScarEligibleFormats();
            List<AdFormatOuterClass.AdFormat> scarEligibleFormatsList = initializationResponse.getScarEligibleFormatsList();
            k.d(scarEligibleFormatsList, "response.scarEligibleFormatsList");
            scarEligibleFormats.addAll(scarEligibleFormatsList);
            if (initializationResponse.getTriggerInitializationCompletedRequest()) {
                f0.w(this.sdkScope, null, new AndroidHandleGatewayInitializationResponse$invoke$3(this, null), 3);
            }
            if (initializationResponse.getNativeConfiguration().getEnableIapEvent()) {
                this.transactionEventManager.invoke();
            }
            if (initializationResponse.getNativeConfiguration().hasDebugSettings()) {
                HandleDebugSettings handleDebugSettings = this.handleDebugSettings;
                NativeConfigurationOuterClass.DebugSettings debugSettings = initializationResponse.getNativeConfiguration().getDebugSettings();
                k.d(debugSettings, "response.nativeConfiguration.debugSettings");
                handleDebugSettings.invoke(debugSettings);
            }
            return y.f6101a;
        }
        String errorText = initializationResponse.getError().getErrorText();
        k.d(errorText, "response.error.errorText");
        throw new GatewayException(errorText, new IllegalStateException(initializationResponse.getError().getErrorText()), "gateway_initialization", initializationResponse.getError().getErrorText());
    }
}
