package com.unity3d.ads.adplayer;

import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import gf.c0;
import gf.q;
import gf.t;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.l;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.adplayer.Invocation$handle$3", f = "Invocation.kt", l = {HeaderBiddingTokenOuterClass.HeaderBiddingToken.MEDIATION_AD_UNIT_ID_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class Invocation$handle$3 extends j implements p {
    final /* synthetic */ l $handler;
    int label;
    final /* synthetic */ Invocation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Invocation$handle$3(l lVar, Invocation invocation, c cVar) {
        super(2, cVar);
        this.$handler = lVar;
        this.this$0 = invocation;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new Invocation$handle$3(this.$handler, this.this$0, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((Invocation$handle$3) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        gf.p pVar;
        gf.p pVar2;
        int i6 = this.label;
        try {
            if (i6 != 0) {
                if (i6 == 1) {
                    he.a.f(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                he.a.f(obj);
                l lVar = this.$handler;
                this.label = 1;
                obj = lVar.invoke(this);
                me.a aVar = me.a.f8833x;
                if (obj == aVar) {
                    return aVar;
                }
            }
            pVar2 = this.this$0.completableDeferred;
            ((q) pVar2).K(obj);
        } catch (Throwable th) {
            pVar = this.this$0.completableDeferred;
            q qVar = (q) pVar;
            qVar.getClass();
            qVar.K(new t(th, false));
        }
        return y.f6101a;
    }
}
