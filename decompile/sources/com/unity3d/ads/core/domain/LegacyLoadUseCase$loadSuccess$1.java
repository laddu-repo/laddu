package com.unity3d.ads.core.domain;

import com.unity3d.ads.IUnityAdsLoadListener;
import he.y;
import kotlin.jvm.internal.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class LegacyLoadUseCase$loadSuccess$1 extends l implements ve.a {
    final /* synthetic */ LegacyLoadUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyLoadUseCase$loadSuccess$1(LegacyLoadUseCase legacyLoadUseCase) {
        super(0);
        this.this$0 = legacyLoadUseCase;
    }

    @Override // ve.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m59invoke();
        return y.f6101a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m59invoke() {
        IUnityAdsLoadListener iUnityAdsLoadListener;
        String str;
        iUnityAdsLoadListener = this.this$0.listener;
        if (iUnityAdsLoadListener != null) {
            str = this.this$0.placement;
            iUnityAdsLoadListener.onUnityAdsAdLoaded(str);
        }
    }
}
