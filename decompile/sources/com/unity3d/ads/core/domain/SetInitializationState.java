package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.InitializationState;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public interface SetInitializationState {

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void invoke$default(SetInitializationState setInitializationState, InitializationState initializationState, boolean z10, int i6, Object obj) {
            if (obj == null) {
                if ((i6 & 2) != 0) {
                    z10 = false;
                }
                setInitializationState.invoke(initializationState, z10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
        }
    }

    void invoke(InitializationState initializationState, boolean z10);
}
