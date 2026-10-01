package com.unity3d.ads.core.domain;

import com.unity3d.services.core.misc.Utilities;
import gf.c0;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.domain.CommonSafeCallbackInvoke$invoke$1", f = "CommonSafeCallbackInvoke.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class CommonSafeCallbackInvoke$invoke$1 extends j implements p {
    final /* synthetic */ ve.a $block;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonSafeCallbackInvoke$invoke$1(ve.a aVar, c cVar) {
        super(2, cVar);
        this.$block = aVar;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new CommonSafeCallbackInvoke$invoke$1(this.$block, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((CommonSafeCallbackInvoke$invoke$1) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            he.a.f(obj);
            final ve.a aVar = this.$block;
            Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.ads.core.domain.a
                @Override // java.lang.Runnable
                public final void run() {
                    ve.a.this.invoke();
                }
            });
            return y.f6101a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
