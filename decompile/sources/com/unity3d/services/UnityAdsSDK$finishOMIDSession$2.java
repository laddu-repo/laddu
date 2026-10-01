package com.unity3d.services;

import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.GetAdObject;
import com.unity3d.ads.core.domain.om.OmFinishSession;
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
@e(c = "com.unity3d.services.UnityAdsSDK$finishOMIDSession$2", f = "UnityAdsSDK.kt", l = {231}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class UnityAdsSDK$finishOMIDSession$2 extends j implements p {
    final /* synthetic */ f $getAdObject$delegate;
    final /* synthetic */ f $omFinishSession$delegate;
    final /* synthetic */ c0 $omidScope;
    final /* synthetic */ String $opportunityId;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsSDK$finishOMIDSession$2(String str, c0 c0Var, f fVar, f fVar2, c cVar) {
        super(2, cVar);
        this.$opportunityId = str;
        this.$omidScope = c0Var;
        this.$getAdObject$delegate = fVar;
        this.$omFinishSession$delegate = fVar2;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new UnityAdsSDK$finishOMIDSession$2(this.$opportunityId, this.$omidScope, this.$getAdObject$delegate, this.$omFinishSession$delegate, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((UnityAdsSDK$finishOMIDSession$2) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        GetAdObject finishOMIDSession$lambda$20;
        OmFinishSession finishOMIDSession$lambda$21;
        int i6 = this.label;
        if (i6 != 0) {
            if (i6 == 1) {
                a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a.f(obj);
            finishOMIDSession$lambda$20 = UnityAdsSDK.finishOMIDSession$lambda$20(this.$getAdObject$delegate);
            AdObject invoke = finishOMIDSession$lambda$20.invoke(this.$opportunityId);
            if (invoke != null) {
                finishOMIDSession$lambda$21 = UnityAdsSDK.finishOMIDSession$lambda$21(this.$omFinishSession$delegate);
                this.label = 1;
                Object invoke2 = finishOMIDSession$lambda$21.invoke(invoke, this);
                me.a aVar = me.a.f8833x;
                if (invoke2 == aVar) {
                    return aVar;
                }
            }
        }
        f0.i(this.$omidScope);
        return y.f6101a;
    }
}
