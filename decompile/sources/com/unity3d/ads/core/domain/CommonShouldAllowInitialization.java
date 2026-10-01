package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.services.core.configuration.EnvironmentCheck;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.metrics.InitMetric;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class CommonShouldAllowInitialization implements ShouldAllowInitialization {
    private final AlternativeFlowReader alternativeFlowReader;
    private final CheckForGameIdAndTestModeChanges checkForGameIdAndTestModeChanges;
    private final GetInitializationState getInitializationState;
    private final SetInitializationState setInitializationState;
    private final ValidateGameId validateGameId;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InitializationState.values().length];
            try {
                iArr[InitializationState.INITIALIZING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InitializationState.INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InitializationState.NOT_INITIALIZED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InitializationState.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CommonShouldAllowInitialization(AlternativeFlowReader alternativeFlowReader, CheckForGameIdAndTestModeChanges checkForGameIdAndTestModeChanges, GetInitializationState getInitializationState, SetInitializationState setInitializationState, ValidateGameId validateGameId) {
        k.e(alternativeFlowReader, "alternativeFlowReader");
        k.e(checkForGameIdAndTestModeChanges, "checkForGameIdAndTestModeChanges");
        k.e(getInitializationState, "getInitializationState");
        k.e(setInitializationState, "setInitializationState");
        k.e(validateGameId, "validateGameId");
        this.alternativeFlowReader = alternativeFlowReader;
        this.checkForGameIdAndTestModeChanges = checkForGameIdAndTestModeChanges;
        this.getInitializationState = getInitializationState;
        this.setInitializationState = setInitializationState;
        this.validateGameId = validateGameId;
    }

    public final AlternativeFlowReader getAlternativeFlowReader() {
        return this.alternativeFlowReader;
    }

    public final CheckForGameIdAndTestModeChanges getCheckForGameIdAndTestModeChanges() {
        return this.checkForGameIdAndTestModeChanges;
    }

    public final GetInitializationState getGetInitializationState() {
        return this.getInitializationState;
    }

    public final SetInitializationState getSetInitializationState() {
        return this.setInitializationState;
    }

    public final ValidateGameId getValidateGameId() {
        return this.validateGameId;
    }

    @Override // com.unity3d.ads.core.domain.ShouldAllowInitialization
    public boolean invoke(String str) {
        if (!this.validateGameId.invoke(str)) {
            return false;
        }
        if (this.alternativeFlowReader.invoke()) {
            int i6 = WhenMappings.$EnumSwitchMapping$0[this.getInitializationState.invoke(false).ordinal()];
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3 && i6 != 4) {
                        throw new RuntimeException();
                    }
                    this.checkForGameIdAndTestModeChanges.invoke(false);
                    this.setInitializationState.invoke(InitializationState.INITIALIZING, false);
                    return true;
                }
                SdkProperties.notifyInitializationComplete();
            }
            return false;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.getInitializationState.invoke(true).ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        SdkProperties.notifyInitializationFailed(UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK failed to initialize due to previous failed reason");
                        return false;
                    }
                    throw new RuntimeException();
                }
                if (!EnvironmentCheck.isEnvironmentOk()) {
                    DeviceLog.error("Error during Unity Services environment check, halting Unity Services init");
                    SdkProperties.notifyInitializationFailed(UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK failed to initialize due to environment check failed");
                    InitializeEventsMetricSender.getInstance().sendMetric(InitMetric.newInitEnvironmentNotOk());
                    return false;
                }
                DeviceLog.info("Unity Services environment check OK");
                InitializeEventsMetricSender.getInstance().sendMetric(InitMetric.newInitEnvironmentOk());
                this.checkForGameIdAndTestModeChanges.invoke(true);
                this.setInitializationState.invoke(InitializationState.INITIALIZING, true);
                return true;
            }
            SdkProperties.notifyInitializationComplete();
        }
        return false;
    }
}
