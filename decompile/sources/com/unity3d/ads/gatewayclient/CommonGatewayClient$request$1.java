package com.unity3d.ads.gatewayclient;

import ne.c;
import ne.e;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.gatewayclient.CommonGatewayClient", f = "CommonGatewayClient.kt", l = {59}, m = "request")
/* loaded from: classes.dex */
public final class CommonGatewayClient$request$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonGatewayClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonGatewayClient$request$1(CommonGatewayClient commonGatewayClient, le.c cVar) {
        super(cVar);
        this.this$0 = commonGatewayClient;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.request(null, null, null, null, this);
    }
}
