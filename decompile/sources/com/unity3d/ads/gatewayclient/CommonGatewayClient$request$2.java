package com.unity3d.ads.gatewayclient;

import com.unity3d.ads.core.data.model.OperationType;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gf.c0;
import he.a;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.gatewayclient.CommonGatewayClient$request$2", f = "CommonGatewayClient.kt", l = {60}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class CommonGatewayClient$request$2 extends j implements p {
    final /* synthetic */ OperationType $operationType;
    final /* synthetic */ UniversalRequestOuterClass.UniversalRequest $request;
    final /* synthetic */ RequestPolicy $requestPolicy;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ CommonGatewayClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonGatewayClient$request$2(CommonGatewayClient commonGatewayClient, String str, UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy, OperationType operationType, c cVar) {
        super(2, cVar);
        this.this$0 = commonGatewayClient;
        this.$url = str;
        this.$request = universalRequest;
        this.$requestPolicy = requestPolicy;
        this.$operationType = operationType;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new CommonGatewayClient$request$2(this.this$0, this.$url, this.$request, this.$requestPolicy, this.$operationType, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((CommonGatewayClient$request$2) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        Object executeWithRetry;
        int i6 = this.label;
        if (i6 != 0) {
            if (i6 == 1) {
                a.f(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a.f(obj);
        CommonGatewayClient commonGatewayClient = this.this$0;
        String str = this.$url;
        UniversalRequestOuterClass.UniversalRequest universalRequest = this.$request;
        RequestPolicy requestPolicy = this.$requestPolicy;
        OperationType operationType = this.$operationType;
        this.label = 1;
        executeWithRetry = commonGatewayClient.executeWithRetry(str, universalRequest, requestPolicy, operationType, this);
        me.a aVar = me.a.f8833x;
        if (executeWithRetry == aVar) {
            return aVar;
        }
        return executeWithRetry;
    }
}
