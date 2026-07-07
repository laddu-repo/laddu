package com.unity3d.services;

import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import com.unity3d.ads.core.domain.TokenNumberProvider;
import gf.c0;
import he.a;
import he.f;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.services.UnityAdsSDK$fetchToken$token$1", f = "UnityAdsSDK.kt", l = {193}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class UnityAdsSDK$fetchToken$token$1 extends j implements p {
    final /* synthetic */ f $getHeaderBiddingToken$delegate;
    final /* synthetic */ f $tokenNumberProvider$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsSDK$fetchToken$token$1(f fVar, f fVar2, c cVar) {
        super(2, cVar);
        this.$getHeaderBiddingToken$delegate = fVar;
        this.$tokenNumberProvider$delegate = fVar2;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new UnityAdsSDK$fetchToken$token$1(this.$getHeaderBiddingToken$delegate, this.$tokenNumberProvider$delegate, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((UnityAdsSDK$fetchToken$token$1) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        GetHeaderBiddingToken fetchToken$lambda$11;
        TokenNumberProvider fetchToken$lambda$10;
        int i6 = this.label;
        if (i6 != 0) {
            if (i6 == 1) {
                a.f(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a.f(obj);
        fetchToken$lambda$11 = UnityAdsSDK.fetchToken$lambda$11(this.$getHeaderBiddingToken$delegate);
        fetchToken$lambda$10 = UnityAdsSDK.fetchToken$lambda$10(this.$tokenNumberProvider$delegate);
        int invoke = fetchToken$lambda$10.invoke();
        this.label = 1;
        Object invoke$default = GetHeaderBiddingToken.DefaultImpls.invoke$default(fetchToken$lambda$11, invoke, null, this, 2, null);
        me.a aVar = me.a.f8833x;
        if (invoke$default == aVar) {
            return aVar;
        }
        return invoke$default;
    }
}
