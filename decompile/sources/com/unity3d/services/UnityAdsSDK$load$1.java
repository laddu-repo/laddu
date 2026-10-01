package com.unity3d.services;

import android.content.Context;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import com.unity3d.services.banners.UnityBannerSize;
import gf.c0;
import gf.f0;
import he.a;
import he.f;
import he.y;
import kotlin.jvm.internal.x;
import le.c;
import ne.e;
import ne.j;
import okhttp3.HttpUrl;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.services.UnityAdsSDK$load$1", f = "UnityAdsSDK.kt", l = {132}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class UnityAdsSDK$load$1 extends j implements p {
    final /* synthetic */ UnityBannerSize $bannerSize;
    final /* synthetic */ f $context$delegate;
    final /* synthetic */ IUnityAdsLoadListener $listener;
    final /* synthetic */ UnityAdsLoadOptions $loadOptions;
    final /* synthetic */ c0 $loadScope;
    final /* synthetic */ String $placementId;
    int label;
    final /* synthetic */ UnityAdsSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsSDK$load$1(UnityAdsSDK unityAdsSDK, String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener, UnityBannerSize unityBannerSize, c0 c0Var, f fVar, c cVar) {
        super(2, cVar);
        this.this$0 = unityAdsSDK;
        this.$placementId = str;
        this.$loadOptions = unityAdsLoadOptions;
        this.$listener = iUnityAdsLoadListener;
        this.$bannerSize = unityBannerSize;
        this.$loadScope = c0Var;
        this.$context$delegate = fVar;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new UnityAdsSDK$load$1(this.this$0, this.$placementId, this.$loadOptions, this.$listener, this.$bannerSize, this.$loadScope, this.$context$delegate, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((UnityAdsSDK$load$1) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        Context load$lambda$6;
        UnityAdsSDK$load$1 unityAdsSDK$load$1;
        int i6 = this.label;
        if (i6 != 0) {
            if (i6 == 1) {
                a.f(obj);
                unityAdsSDK$load$1 = this;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a.f(obj);
            LegacyLoadUseCase legacyLoadUseCase = (LegacyLoadUseCase) this.this$0.getServiceProvider().getRegistry().getService(HttpUrl.FRAGMENT_ENCODE_SET, x.a(LegacyLoadUseCase.class));
            load$lambda$6 = UnityAdsSDK.load$lambda$6(this.$context$delegate);
            String str = this.$placementId;
            UnityAdsLoadOptions unityAdsLoadOptions = this.$loadOptions;
            IUnityAdsLoadListener iUnityAdsLoadListener = this.$listener;
            UnityBannerSize unityBannerSize = this.$bannerSize;
            this.label = 1;
            unityAdsSDK$load$1 = this;
            Object invoke = legacyLoadUseCase.invoke(load$lambda$6, str, unityAdsLoadOptions, iUnityAdsLoadListener, unityBannerSize, unityAdsSDK$load$1);
            me.a aVar = me.a.f8833x;
            if (invoke == aVar) {
                return aVar;
            }
        }
        f0.i(unityAdsSDK$load$1.$loadScope);
        return y.f6101a;
    }
}
