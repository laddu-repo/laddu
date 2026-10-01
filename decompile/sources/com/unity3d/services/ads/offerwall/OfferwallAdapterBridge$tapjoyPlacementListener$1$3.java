package com.unity3d.services.ads.offerwall;

import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import gf.c0;
import he.y;
import kf.q0;
import le.c;
import ne.e;
import ne.j;
import okhttp3.HttpUrl;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$tapjoyPlacementListener$1$3", f = "OfferwallAdapterBridge.kt", l = {114}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class OfferwallAdapterBridge$tapjoyPlacementListener$1$3 extends j implements p {
    final /* synthetic */ String $placementName;
    int label;
    final /* synthetic */ OfferwallAdapterBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferwallAdapterBridge$tapjoyPlacementListener$1$3(OfferwallAdapterBridge offerwallAdapterBridge, String str, c cVar) {
        super(2, cVar);
        this.this$0 = offerwallAdapterBridge;
        this.$placementName = str;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new OfferwallAdapterBridge$tapjoyPlacementListener$1$3(this.this$0, this.$placementName, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((OfferwallAdapterBridge$tapjoyPlacementListener$1$3) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        q0 q0Var;
        int i6 = this.label;
        if (i6 != 0) {
            if (i6 == 1) {
                he.a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            he.a.f(obj);
            q0Var = this.this$0._offerwallEventFlow;
            OfferwallEvent offerwallEvent = OfferwallEvent.ON_CONTENT_READY;
            String str = this.$placementName;
            if (str == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            OfferwallEventData offerwallEventData = new OfferwallEventData(offerwallEvent, str, null, null, 12, null);
            this.label = 1;
            Object emit = q0Var.emit(offerwallEventData, this);
            me.a aVar = me.a.f8833x;
            if (emit == aVar) {
                return aVar;
            }
        }
        return y.f6101a;
    }
}
