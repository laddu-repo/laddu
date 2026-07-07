package com.unity3d.ads.adplayer;

import gf.c0;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onCreate$6", f = "FullScreenWebViewDisplay.kt", l = {82}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FullScreenWebViewDisplay$onCreate$6 extends j implements p {
    int label;
    final /* synthetic */ FullScreenWebViewDisplay this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenWebViewDisplay$onCreate$6(FullScreenWebViewDisplay fullScreenWebViewDisplay, c cVar) {
        super(2, cVar);
        this.this$0 = fullScreenWebViewDisplay;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new FullScreenWebViewDisplay$onCreate$6(this.this$0, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((FullScreenWebViewDisplay$onCreate$6) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        Object listenToAdPlayerEvents;
        int i6 = this.label;
        if (i6 != 0) {
            if (i6 == 1) {
                he.a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            he.a.f(obj);
            FullScreenWebViewDisplay fullScreenWebViewDisplay = this.this$0;
            this.label = 1;
            listenToAdPlayerEvents = fullScreenWebViewDisplay.listenToAdPlayerEvents(this);
            me.a aVar = me.a.f8833x;
            if (listenToAdPlayerEvents == aVar) {
                return aVar;
            }
        }
        return y.f6101a;
    }
}
