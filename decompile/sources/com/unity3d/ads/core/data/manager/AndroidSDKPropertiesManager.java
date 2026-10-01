package com.unity3d.ads.core.data.manager;

import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.properties.SdkProperties;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidSDKPropertiesManager implements SDKPropertiesManager {
    @Override // com.unity3d.ads.core.data.manager.SDKPropertiesManager
    public SdkProperties.InitializationState getCurrentInitializationState() {
        SdkProperties.InitializationState currentInitializationState = SdkProperties.getCurrentInitializationState();
        k.d(currentInitializationState, "getCurrentInitializationState()");
        return currentInitializationState;
    }

    @Override // com.unity3d.ads.core.data.manager.SDKPropertiesManager
    public void setInitializationTime() {
        SdkProperties.setInitializationTime(Device.getElapsedRealtime());
    }

    @Override // com.unity3d.ads.core.data.manager.SDKPropertiesManager
    public void setInitializationTimeSinceEpoch() {
        SdkProperties.setInitializationTimeSinceEpoch(System.currentTimeMillis());
    }

    @Override // com.unity3d.ads.core.data.manager.SDKPropertiesManager
    public void setInitializeState(SdkProperties.InitializationState initializeState) {
        k.e(initializeState, "initializeState");
        SdkProperties.setInitializeState(initializeState);
    }

    @Override // com.unity3d.ads.core.data.manager.SDKPropertiesManager
    public void setInitialized(boolean z10) {
        SdkProperties.setInitialized(z10);
    }
}
