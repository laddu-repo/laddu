package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.InitializationStateKt;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class CommonGetInitializationState implements GetInitializationState {
    private final SDKPropertiesManager sdkPropertiesManager;
    private final SessionRepository sessionRepository;

    public CommonGetInitializationState(SessionRepository sessionRepository, SDKPropertiesManager sdkPropertiesManager) {
        k.e(sessionRepository, "sessionRepository");
        k.e(sdkPropertiesManager, "sdkPropertiesManager");
        this.sessionRepository = sessionRepository;
        this.sdkPropertiesManager = sdkPropertiesManager;
    }

    @Override // com.unity3d.ads.core.domain.GetInitializationState
    public InitializationState invoke(boolean z10) {
        if (z10) {
            return InitializationStateKt.toBold(this.sdkPropertiesManager.getCurrentInitializationState());
        }
        return this.sessionRepository.getInitializationState();
    }
}
