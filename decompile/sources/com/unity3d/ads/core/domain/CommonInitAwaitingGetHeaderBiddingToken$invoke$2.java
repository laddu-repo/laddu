package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.domain.AwaitInitialization;
import com.unity3d.ads.core.domain.GetInitializationState;
import gf.c0;
import he.y;
import ie.i;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$2", f = "CommonInitAwaitingGetHeaderBiddingToken.kt", l = {59}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class CommonInitAwaitingGetHeaderBiddingToken$invoke$2 extends j implements p {
    int label;
    final /* synthetic */ CommonInitAwaitingGetHeaderBiddingToken this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonInitAwaitingGetHeaderBiddingToken$invoke$2(CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken, c cVar) {
        super(2, cVar);
        this.this$0 = commonInitAwaitingGetHeaderBiddingToken;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new CommonInitAwaitingGetHeaderBiddingToken$invoke$2(this.this$0, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((CommonInitAwaitingGetHeaderBiddingToken$invoke$2) create(c0Var, cVar)).invokeSuspend(y.f6101a);
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
            if (i.Z(new InitializationState[]{InitializationState.NOT_INITIALIZED, InitializationState.INITIALIZING}, GetInitializationState.DefaultImpls.invoke$default(this.this$0.getGetInitializationState(), false, 1, null))) {
                this.this$0.didAwaitInit = true;
                AwaitInitialization awaitInitialization = this.this$0.getAwaitInitialization();
                this.label = 1;
                Object invoke$default = AwaitInitialization.DefaultImpls.invoke$default(awaitInitialization, 0L, this, 1, null);
                me.a aVar = me.a.f8833x;
                if (invoke$default == aVar) {
                    return aVar;
                }
            }
        }
        return y.f6101a;
    }
}
