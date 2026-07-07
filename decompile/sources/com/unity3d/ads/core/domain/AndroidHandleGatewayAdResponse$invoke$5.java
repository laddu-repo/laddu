package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.adplayer.AdPlayer;
import gatewayprotocol.v1.AdResponseOuterClass;
import gf.c0;
import he.y;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.w;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$5", f = "AndroidHandleGatewayAdResponse.kt", l = {218}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidHandleGatewayAdResponse$invoke$5 extends j implements p {
    final /* synthetic */ w $adPlayer;
    final /* synthetic */ ByteString $opportunityId;
    final /* synthetic */ AdResponseOuterClass.AdResponse $response;
    final /* synthetic */ CancellationException $t;
    int label;
    final /* synthetic */ AndroidHandleGatewayAdResponse this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHandleGatewayAdResponse$invoke$5(AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse, CancellationException cancellationException, ByteString byteString, AdResponseOuterClass.AdResponse adResponse, w wVar, c cVar) {
        super(2, cVar);
        this.this$0 = androidHandleGatewayAdResponse;
        this.$t = cancellationException;
        this.$opportunityId = byteString;
        this.$response = adResponse;
        this.$adPlayer = wVar;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new AndroidHandleGatewayAdResponse$invoke$5(this.this$0, this.$t, this.$opportunityId, this.$response, this.$adPlayer, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((AndroidHandleGatewayAdResponse$invoke$5) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        Object cleanup;
        int i6 = this.label;
        if (i6 != 0) {
            if (i6 == 1) {
                he.a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            he.a.f(obj);
            AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse = this.this$0;
            CancellationException cancellationException = this.$t;
            ByteString byteString = this.$opportunityId;
            AdResponseOuterClass.AdResponse adResponse = this.$response;
            AdPlayer adPlayer = (AdPlayer) this.$adPlayer.f8055x;
            this.label = 1;
            cleanup = androidHandleGatewayAdResponse.cleanup(cancellationException, byteString, adResponse, adPlayer, this);
            me.a aVar = me.a.f8833x;
            if (cleanup == aVar) {
                return aVar;
            }
        }
        return y.f6101a;
    }
}
