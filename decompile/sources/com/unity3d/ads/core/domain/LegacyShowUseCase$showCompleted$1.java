package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.model.ShowStatus;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.ShowStatusExtensionsKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import he.y;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class LegacyShowUseCase$showCompleted$1 extends l implements ve.a {
    final /* synthetic */ Listeners $listeners;
    final /* synthetic */ String $placement;
    final /* synthetic */ ShowStatus $status;
    final /* synthetic */ LegacyShowUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyShowUseCase$showCompleted$1(Listeners listeners, String str, ShowStatus showStatus, LegacyShowUseCase legacyShowUseCase) {
        super(0);
        this.$listeners = listeners;
        this.$placement = str;
        this.$status = showStatus;
        this.this$0 = legacyShowUseCase;
    }

    @Override // ve.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m62invoke();
        return y.f6101a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m62invoke() {
        SessionRepository sessionRepository;
        Listeners listeners = this.$listeners;
        String str = this.$placement;
        ShowStatus showStatus = this.$status;
        sessionRepository = this.this$0.sessionRepository;
        NativeConfigurationOuterClass.ShowCompletionState defaultShowCompletionState = sessionRepository.getNativeConfiguration().getDefaultShowCompletionState();
        k.d(defaultShowCompletionState, "sessionRepository.native…efaultShowCompletionState");
        listeners.onComplete(str, ShowStatusExtensionsKt.toUnityAdsShowCompletionState(showStatus, defaultShowCompletionState));
    }
}
