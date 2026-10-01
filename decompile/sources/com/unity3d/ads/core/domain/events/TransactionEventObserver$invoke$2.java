package com.unity3d.ads.core.domain.events;

import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2", f = "TransactionEventObserver.kt", l = {35, 36, 44}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class TransactionEventObserver$invoke$2 extends j implements p {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TransactionEventObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionEventObserver$invoke$2(TransactionEventObserver transactionEventObserver, c cVar) {
        super(2, cVar);
        this.this$0 = transactionEventObserver;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        TransactionEventObserver$invoke$2 transactionEventObserver$invoke$2 = new TransactionEventObserver$invoke$2(this.this$0, cVar);
        transactionEventObserver$invoke$2.L$0 = obj;
        return transactionEventObserver$invoke$2;
    }

    @Override // ve.p
    public final Object invoke(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest, c cVar) {
        return ((TransactionEventObserver$invoke$2) create(transactionEventRequest, cVar)).invokeSuspend(y.f6101a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(1:2)|(1:(1:(1:(4:7|8|9|10)(2:12|13))(6:14|15|16|(1:18)|9|10))(1:23))(3:31|32|(2:34|20))|24|25|26|27|(2:29|20)(5:30|16|(0)|9|10)) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00aa, code lost:
    
        if (r14.set(r0, r13) == r4) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086 A[Catch: UnityAdsNetworkException -> 0x00ad, TRY_LEAVE, TryCatch #1 {UnityAdsNetworkException -> 0x00ad, blocks: (B:16:0x007e, B:18:0x0086, B:27:0x0076), top: B:26:0x0076 }] */
    @Override // ne.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.label
            r1 = 3
            r2 = 2
            r3 = 1
            me.a r4 = me.a.f8833x
            if (r0 == 0) goto L2a
            if (r0 == r3) goto L26
            if (r0 == r2) goto L1d
            if (r0 != r1) goto L15
            he.a.f(r14)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L12
        L12:
            r10 = r13
            goto Lad
        L15:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1d:
            java.lang.Object r0 = r13.L$0
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r0 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) r0
            he.a.f(r14)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L12
            r10 = r13
            goto L7e
        L26:
            he.a.f(r14)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L12
            goto L59
        L2a:
            he.a.f(r14)
            java.lang.Object r14 = r13.L$0
            gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionEventRequest r14 = (gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) r14
            gatewayprotocol.v1.UniversalRequestKt r0 = gatewayprotocol.v1.UniversalRequestKt.INSTANCE     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L12
            gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl$Companion r0 = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L12
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload$Builder r5 = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder()     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L12
            java.lang.String r6 = "newBuilder()"
            kotlin.jvm.internal.k.d(r5, r6)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L12
            gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl r0 = r0._create(r5)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L12
            r0.setTransactionEventRequest(r14)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L12
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload r14 = r0._build()     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L12
            com.unity3d.ads.core.domain.events.TransactionEventObserver r0 = r13.this$0     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L12
            com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad r0 = com.unity3d.ads.core.domain.events.TransactionEventObserver.access$getGetUniversalRequestForPayLoad$p(r0)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L12
            r13.label = r3     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L12
            java.lang.Object r14 = r0.invoke(r14, r13)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L12
            if (r14 != r4) goto L59
            r10 = r13
            goto Lac
        L59:
            r7 = r14
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r7 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) r7     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L12
            com.unity3d.ads.core.domain.events.TransactionEventObserver r14 = r13.this$0     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L12
            com.unity3d.ads.gatewayclient.GatewayClient r5 = com.unity3d.ads.core.domain.events.TransactionEventObserver.access$getGatewayClient$p(r14)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L12
            com.unity3d.ads.core.domain.events.TransactionEventObserver r14 = r13.this$0     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L12
            com.unity3d.ads.core.domain.GetRequestPolicy r14 = com.unity3d.ads.core.domain.events.TransactionEventObserver.access$getGetRequestPolicy$p(r14)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L12
            com.unity3d.ads.gatewayclient.RequestPolicy r8 = r14.invoke()     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L12
            com.unity3d.ads.core.data.model.OperationType r9 = com.unity3d.ads.core.data.model.OperationType.TRANSACTION_EVENT     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L12
            r13.L$0 = r7     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L12
            r13.label = r2     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L12
            r6 = 0
            r11 = 1
            r12 = 0
            r10 = r13
            java.lang.Object r14 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lad
            if (r14 != r4) goto L7d
            goto Lac
        L7d:
            r0 = r7
        L7e:
            gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse r14 = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r14     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lad
            gatewayprotocol.v1.ErrorOuterClass$Error r14 = r14.getError()     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lad
            if (r14 == 0) goto Lad
            com.unity3d.ads.core.domain.events.TransactionEventObserver r14 = r10.this$0     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lad
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r14 = com.unity3d.ads.core.domain.events.TransactionEventObserver.access$getIapTransactionStore$p(r14)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lad
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedData r0 = r0.getSharedData()     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lad
            gatewayprotocol.v1.TimestampsOuterClass$Timestamps r0 = r0.getTimestamps()     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lad
            com.google.protobuf.Timestamp r0 = r0.getTimestamp()     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lad
            com.google.protobuf.ByteString r0 = r0.toByteString()     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lad
            java.lang.String r2 = "fullRequest.sharedData.t….timestamp.toByteString()"
            kotlin.jvm.internal.k.d(r0, r2)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lad
            r2 = 0
            r10.L$0 = r2     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lad
            r10.label = r1     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lad
            java.lang.Object r14 = r14.set(r0, r13)     // Catch: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> Lad
            if (r14 != r4) goto Lad
        Lac:
            return r4
        Lad:
            he.y r14 = he.y.f6101a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
