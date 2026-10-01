package com.unity3d.ads.core.domain;

import gf.c0;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse$invoke$3", f = "AndroidHandleGatewayInitializationResponse.kt", l = {44}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidHandleGatewayInitializationResponse$invoke$3 extends j implements p {
    int label;
    final /* synthetic */ AndroidHandleGatewayInitializationResponse this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHandleGatewayInitializationResponse$invoke$3(AndroidHandleGatewayInitializationResponse androidHandleGatewayInitializationResponse, c cVar) {
        super(2, cVar);
        this.this$0 = androidHandleGatewayInitializationResponse;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new AndroidHandleGatewayInitializationResponse$invoke$3(this.this$0, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((AndroidHandleGatewayInitializationResponse$invoke$3) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        TriggerInitializationCompletedRequest triggerInitializationCompletedRequest;
        int i6 = this.label;
        if (i6 != 0) {
            if (i6 == 1) {
                he.a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            he.a.f(obj);
            triggerInitializationCompletedRequest = this.this$0.triggerInitializationCompletedRequest;
            this.label = 1;
            Object invoke = triggerInitializationCompletedRequest.invoke(this);
            me.a aVar = me.a.f8833x;
            if (invoke == aVar) {
                return aVar;
            }
        }
        return y.f6101a;
    }
}
