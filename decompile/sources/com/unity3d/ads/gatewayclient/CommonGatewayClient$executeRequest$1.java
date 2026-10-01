package com.unity3d.ads.gatewayclient;

import ne.c;
import ne.e;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.gatewayclient.CommonGatewayClient", f = "CommonGatewayClient.kt", l = {118, 119}, m = "executeRequest")
/* loaded from: classes.dex */
public final class CommonGatewayClient$executeRequest$1 extends c {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonGatewayClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonGatewayClient$executeRequest$1(CommonGatewayClient commonGatewayClient, le.c cVar) {
        super(cVar);
        this.this$0 = commonGatewayClient;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        Object executeRequest;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        executeRequest = this.this$0.executeRequest(null, 0, null, this);
        return executeRequest;
    }
}
