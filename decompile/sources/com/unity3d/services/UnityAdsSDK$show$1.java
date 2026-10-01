package com.unity3d.services;

import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import gf.c0;
import gf.f0;
import he.a;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.services.UnityAdsSDK$show$1", f = "UnityAdsSDK.kt", l = {142}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class UnityAdsSDK$show$1 extends j implements p {
    final /* synthetic */ Listeners $listener;
    final /* synthetic */ String $placementId;
    final /* synthetic */ LegacyShowUseCase $showBoldSDK;
    final /* synthetic */ UnityAdsShowOptions $showOptions;
    final /* synthetic */ c0 $showScope;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsSDK$show$1(LegacyShowUseCase legacyShowUseCase, String str, UnityAdsShowOptions unityAdsShowOptions, Listeners listeners, c0 c0Var, c cVar) {
        super(2, cVar);
        this.$showBoldSDK = legacyShowUseCase;
        this.$placementId = str;
        this.$showOptions = unityAdsShowOptions;
        this.$listener = listeners;
        this.$showScope = c0Var;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new UnityAdsSDK$show$1(this.$showBoldSDK, this.$placementId, this.$showOptions, this.$listener, this.$showScope, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((UnityAdsSDK$show$1) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        int i6 = this.label;
        if (i6 != 0) {
            if (i6 == 1) {
                a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a.f(obj);
            LegacyShowUseCase legacyShowUseCase = this.$showBoldSDK;
            String str = this.$placementId;
            UnityAdsShowOptions unityAdsShowOptions = this.$showOptions;
            Listeners listeners = this.$listener;
            this.label = 1;
            Object invoke = legacyShowUseCase.invoke(str, unityAdsShowOptions, listeners, this);
            me.a aVar = me.a.f8833x;
            if (invoke == aVar) {
                return aVar;
            }
        }
        f0.i(this.$showScope);
        return y.f6101a;
    }
}
