package com.unity3d.services;

import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken;
import com.unity3d.ads.core.domain.TokenNumberProvider;
import gf.c0;
import gf.f0;
import he.a;
import he.f;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.services.UnityAdsSDK$getToken$2", f = "UnityAdsSDK.kt", l = {168}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class UnityAdsSDK$getToken$2 extends j implements p {
    final /* synthetic */ f $getAsyncHeaderBiddingToken$delegate;
    final /* synthetic */ c0 $getTokenScope;
    final /* synthetic */ IUnityAdsTokenListener $listener;
    final /* synthetic */ TokenConfiguration $tokenConfiguration;
    final /* synthetic */ f $tokenNumberProvider$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsSDK$getToken$2(TokenConfiguration tokenConfiguration, IUnityAdsTokenListener iUnityAdsTokenListener, c0 c0Var, f fVar, f fVar2, c cVar) {
        super(2, cVar);
        this.$tokenConfiguration = tokenConfiguration;
        this.$listener = iUnityAdsTokenListener;
        this.$getTokenScope = c0Var;
        this.$getAsyncHeaderBiddingToken$delegate = fVar;
        this.$tokenNumberProvider$delegate = fVar2;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new UnityAdsSDK$getToken$2(this.$tokenConfiguration, this.$listener, this.$getTokenScope, this.$getAsyncHeaderBiddingToken$delegate, this.$tokenNumberProvider$delegate, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((UnityAdsSDK$getToken$2) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        GetAsyncHeaderBiddingToken token$lambda$9;
        TokenNumberProvider token$lambda$8;
        int i6 = this.label;
        if (i6 != 0) {
            if (i6 == 1) {
                a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a.f(obj);
            token$lambda$9 = UnityAdsSDK.getToken$lambda$9(this.$getAsyncHeaderBiddingToken$delegate);
            token$lambda$8 = UnityAdsSDK.getToken$lambda$8(this.$tokenNumberProvider$delegate);
            int invoke = token$lambda$8.invoke();
            TokenConfiguration tokenConfiguration = this.$tokenConfiguration;
            IUnityAdsTokenListener iUnityAdsTokenListener = this.$listener;
            this.label = 1;
            Object invoke2 = token$lambda$9.invoke(invoke, tokenConfiguration, iUnityAdsTokenListener, this);
            me.a aVar = me.a.f8833x;
            if (invoke2 == aVar) {
                return aVar;
            }
        }
        f0.i(this.$getTokenScope);
        return y.f6101a;
    }
}
