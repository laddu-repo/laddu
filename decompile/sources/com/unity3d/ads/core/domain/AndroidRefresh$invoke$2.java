package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import gf.c0;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.domain.AndroidRefresh$invoke$2", f = "AndroidRefresh.kt", l = {26, 28}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidRefresh$invoke$2 extends j implements p {
    final /* synthetic */ ByteString $adDataRefreshToken;
    final /* synthetic */ ByteString $opportunityId;
    int label;
    final /* synthetic */ AndroidRefresh this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidRefresh$invoke$2(AndroidRefresh androidRefresh, ByteString byteString, ByteString byteString2, c cVar) {
        super(2, cVar);
        this.this$0 = androidRefresh;
        this.$adDataRefreshToken = byteString;
        this.$opportunityId = byteString2;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new AndroidRefresh$invoke$2(this.this$0, this.$adDataRefreshToken, this.$opportunityId, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((AndroidRefresh$invoke$2) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
    
        if (r13 == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r13 == r3) goto L15;
     */
    @Override // ne.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.label
            r1 = 2
            r2 = 1
            me.a r3 = me.a.f8833x
            if (r0 == 0) goto L1c
            if (r0 == r2) goto L18
            if (r0 != r1) goto L10
            he.a.f(r13)
            goto L54
        L10:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L18:
            he.a.f(r13)
            goto L32
        L1c:
            he.a.f(r13)
            com.unity3d.ads.core.domain.AndroidRefresh r13 = r12.this$0
            com.unity3d.ads.core.domain.GetAdDataRefreshRequest r13 = com.unity3d.ads.core.domain.AndroidRefresh.access$getGetAdDataRefreshRequest$p(r13)
            com.google.protobuf.ByteString r0 = r12.$adDataRefreshToken
            com.google.protobuf.ByteString r4 = r12.$opportunityId
            r12.label = r2
            java.lang.Object r13 = r13.invoke(r0, r4, r12)
            if (r13 != r3) goto L32
            goto L53
        L32:
            r6 = r13
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r6 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) r6
            com.unity3d.ads.core.domain.AndroidRefresh r13 = r12.this$0
            com.unity3d.ads.core.domain.GetRequestPolicy r13 = com.unity3d.ads.core.domain.AndroidRefresh.access$getGetRequestPolicy$p(r13)
            com.unity3d.ads.gatewayclient.RequestPolicy r7 = r13.invoke()
            com.unity3d.ads.core.domain.AndroidRefresh r13 = r12.this$0
            com.unity3d.ads.gatewayclient.GatewayClient r4 = com.unity3d.ads.core.domain.AndroidRefresh.access$getGatewayClient$p(r13)
            com.unity3d.ads.core.data.model.OperationType r8 = com.unity3d.ads.core.data.model.OperationType.REFRESH
            r12.label = r1
            r5 = 0
            r10 = 1
            r11 = 0
            r9 = r12
            java.lang.Object r13 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r4, r5, r6, r7, r8, r9, r10, r11)
            if (r13 != r3) goto L54
        L53:
            return r3
        L54:
            gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse r13 = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r13
            gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse$Payload r13 = r13.getPayload()
            gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse r13 = r13.getAdDataRefreshResponse()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidRefresh$invoke$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
