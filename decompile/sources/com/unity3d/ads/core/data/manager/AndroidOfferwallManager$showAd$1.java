package com.unity3d.ads.core.data.manager;

import com.unity3d.services.ads.offerwall.OfferwallAdapterBridge;
import he.y;
import kf.i;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$1", f = "AndroidOfferwallManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidOfferwallManager$showAd$1 extends j implements p {
    final /* synthetic */ String $placementName;
    int label;
    final /* synthetic */ AndroidOfferwallManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidOfferwallManager$showAd$1(AndroidOfferwallManager androidOfferwallManager, String str, c cVar) {
        super(2, cVar);
        this.this$0 = androidOfferwallManager;
        this.$placementName = str;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new AndroidOfferwallManager$showAd$1(this.this$0, this.$placementName, cVar);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        OfferwallAdapterBridge offerwallAdapterBridge;
        if (this.label == 0) {
            he.a.f(obj);
            offerwallAdapterBridge = this.this$0.offerwallBridge;
            offerwallAdapterBridge.showAd(this.$placementName);
            return y.f6101a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // ve.p
    public final Object invoke(i iVar, c cVar) {
        return ((AndroidOfferwallManager$showAd$1) create(iVar, cVar)).invokeSuspend(y.f6101a);
    }
}
