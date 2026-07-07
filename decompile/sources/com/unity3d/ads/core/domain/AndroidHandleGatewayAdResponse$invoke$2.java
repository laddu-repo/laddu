package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.AdPlayer;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import he.y;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.w;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$2", f = "AndroidHandleGatewayAdResponse.kt", l = {161}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidHandleGatewayAdResponse$invoke$2 extends j implements p {
    final /* synthetic */ w $adPlayer;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHandleGatewayAdResponse$invoke$2(w wVar, c cVar) {
        super(2, cVar);
        this.$adPlayer = wVar;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        AndroidHandleGatewayAdResponse$invoke$2 androidHandleGatewayAdResponse$invoke$2 = new AndroidHandleGatewayAdResponse$invoke$2(this.$adPlayer, cVar);
        androidHandleGatewayAdResponse$invoke$2.L$0 = obj;
        return androidHandleGatewayAdResponse$invoke$2;
    }

    @Override // ve.p
    public final Object invoke(AllowedPiiOuterClass.AllowedPii allowedPii, c cVar) {
        return ((AndroidHandleGatewayAdResponse$invoke$2) create(allowedPii, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        int i6 = this.label;
        if (i6 != 0) {
            if (i6 == 1) {
                he.a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            he.a.f(obj);
            AllowedPiiOuterClass.AllowedPii allowedPii = (AllowedPiiOuterClass.AllowedPii) this.L$0;
            AdPlayer adPlayer = (AdPlayer) this.$adPlayer.f8055x;
            byte[] byteArray = allowedPii.toByteArray();
            k.d(byteArray, "it.toByteArray()");
            this.label = 1;
            Object onAllowedPiiChange = adPlayer.onAllowedPiiChange(byteArray, this);
            me.a aVar = me.a.f8833x;
            if (onAllowedPiiChange == aVar) {
                return aVar;
            }
        }
        return y.f6101a;
    }
}
