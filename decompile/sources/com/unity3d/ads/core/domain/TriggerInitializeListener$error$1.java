package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.properties.SdkProperties;
import gf.c0;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.domain.TriggerInitializeListener$error$1", f = "TriggerInitializeListener.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class TriggerInitializeListener$error$1 extends j implements p {
    final /* synthetic */ String $errorMsg;
    final /* synthetic */ UnityAds.UnityAdsInitializationError $unityAdsInitializationError;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggerInitializeListener$error$1(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str, c cVar) {
        super(2, cVar);
        this.$unityAdsInitializationError = unityAdsInitializationError;
        this.$errorMsg = str;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new TriggerInitializeListener$error$1(this.$unityAdsInitializationError, this.$errorMsg, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((TriggerInitializeListener$error$1) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            he.a.f(obj);
            SdkProperties.notifyInitializationFailed(this.$unityAdsInitializationError, this.$errorMsg);
            return y.f6101a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
