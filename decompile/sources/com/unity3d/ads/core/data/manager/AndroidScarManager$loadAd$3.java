package com.unity3d.ads.core.data.manager;

import com.unity3d.ads.core.domain.scar.GmaEventData;
import com.unity3d.scar.adapter.common.b;
import he.y;
import ie.k;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3", f = "AndroidScarManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidScarManager$loadAd$3 extends j implements p {
    final /* synthetic */ String $placementId;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidScarManager$loadAd$3(String str, c cVar) {
        super(2, cVar);
        this.$placementId = str;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        AndroidScarManager$loadAd$3 androidScarManager$loadAd$3 = new AndroidScarManager$loadAd$3(this.$placementId, cVar);
        androidScarManager$loadAd$3.L$0 = obj;
        return androidScarManager$loadAd$3;
    }

    @Override // ve.p
    public final Object invoke(GmaEventData gmaEventData, c cVar) {
        return ((AndroidScarManager$loadAd$3) create(gmaEventData, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            he.a.f(obj);
            GmaEventData gmaEventData = (GmaEventData) this.L$0;
            boolean z10 = false;
            if ((k.t(b.H, b.L).contains(gmaEventData.getGmaEvent()) && kotlin.jvm.internal.k.a(gmaEventData.getPlacementId(), this.$placementId)) || k.t(b.f3389b0, b.f3393y, b.K).contains(gmaEventData.getGmaEvent())) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
