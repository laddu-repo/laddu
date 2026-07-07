package com.unity3d.services.core.network.core;

import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import gf.c0;
import he.a;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.services.core.network.core.CronetClient$executeBlocking$1", f = "CronetClient.kt", l = {37}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class CronetClient$executeBlocking$1 extends j implements p {
    final /* synthetic */ HttpRequest $request;
    int label;
    final /* synthetic */ CronetClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CronetClient$executeBlocking$1(CronetClient cronetClient, HttpRequest httpRequest, c cVar) {
        super(2, cVar);
        this.this$0 = cronetClient;
        this.$request = httpRequest;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new CronetClient$executeBlocking$1(this.this$0, this.$request, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((CronetClient$executeBlocking$1) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        int i6 = this.label;
        if (i6 != 0) {
            if (i6 == 1) {
                a.f(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a.f(obj);
        CronetClient cronetClient = this.this$0;
        HttpRequest httpRequest = this.$request;
        this.label = 1;
        Object execute$default = HttpClient.DefaultImpls.execute$default(cronetClient, httpRequest, false, this, 2, null);
        me.a aVar = me.a.f8833x;
        if (execute$default == aVar) {
            return aVar;
        }
        return execute$default;
    }
}
