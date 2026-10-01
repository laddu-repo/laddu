package com.unity3d.ads.core.domain;

import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import ne.c;
import ne.e;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.domain.SendPrivacyUpdateRequest", f = "SendPrivacyUpdateRequest.kt", l = {21, HeaderBiddingTokenOuterClass.HeaderBiddingToken.MEDIATION_AD_UNIT_ID_FIELD_NUMBER}, m = "invoke")
/* loaded from: classes.dex */
public final class SendPrivacyUpdateRequest$invoke$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SendPrivacyUpdateRequest this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendPrivacyUpdateRequest$invoke$1(SendPrivacyUpdateRequest sendPrivacyUpdateRequest, le.c cVar) {
        super(cVar);
        this.this$0 = sendPrivacyUpdateRequest;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(0, null, this);
    }
}
