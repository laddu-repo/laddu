package com.unity3d.ads.core.data.manager;

import android.content.Context;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import he.y;
import kf.i;
import ne.e;
import ne.j;
import sd.c;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$1", f = "AndroidScarManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidScarManager$loadBannerAd$1 extends j implements p {
    final /* synthetic */ UnityBannerSize $bannerSize;
    final /* synthetic */ BannerView $bannerView;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $opportunityId;
    final /* synthetic */ c $scarAdMetadata;
    int label;
    final /* synthetic */ AndroidScarManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidScarManager$loadBannerAd$1(AndroidScarManager androidScarManager, Context context, BannerView bannerView, String str, c cVar, UnityBannerSize unityBannerSize, le.c cVar2) {
        super(2, cVar2);
        this.this$0 = androidScarManager;
        this.$context = context;
        this.$bannerView = bannerView;
        this.$opportunityId = str;
        this.$scarAdMetadata = cVar;
        this.$bannerSize = unityBannerSize;
    }

    @Override // ne.a
    public final le.c create(Object obj, le.c cVar) {
        return new AndroidScarManager$loadBannerAd$1(this.this$0, this.$context, this.$bannerView, this.$opportunityId, this.$scarAdMetadata, this.$bannerSize, cVar);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        GMAScarAdapterBridge gMAScarAdapterBridge;
        if (this.label == 0) {
            he.a.f(obj);
            gMAScarAdapterBridge = this.this$0.gmaBridge;
            gMAScarAdapterBridge.loadBanner(this.$context, this.$bannerView, this.$opportunityId, this.$scarAdMetadata, this.$bannerSize);
            return y.f6101a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // ve.p
    public final Object invoke(i iVar, le.c cVar) {
        return ((AndroidScarManager$loadBannerAd$1) create(iVar, cVar)).invokeSuspend(y.f6101a);
    }
}
