package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.network.model.HttpRequest;
import gf.c0;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$1$webViewData$1", f = "InitializeStateLoadWeb.kt", l = {71, 71}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class InitializeStateLoadWeb$doWork$2$1$webViewData$1 extends j implements p {
    final /* synthetic */ HttpRequest $request;
    int label;
    final /* synthetic */ InitializeStateLoadWeb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateLoadWeb$doWork$2$1$webViewData$1(InitializeStateLoadWeb initializeStateLoadWeb, HttpRequest httpRequest, c cVar) {
        super(2, cVar);
        this.this$0 = initializeStateLoadWeb;
        this.$request = httpRequest;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new InitializeStateLoadWeb$doWork$2$1$webViewData$1(this.this$0, this.$request, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((InitializeStateLoadWeb$doWork$2$1$webViewData$1) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (r11 == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (r11 == r3) goto L15;
     */
    @Override // ne.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.label
            r1 = 2
            r2 = 1
            me.a r3 = me.a.f8833x
            if (r0 == 0) goto L1c
            if (r0 == r2) goto L18
            if (r0 != r1) goto L10
            he.a.f(r11)
            goto L40
        L10:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L18:
            he.a.f(r11)
            goto L2e
        L1c:
            he.a.f(r11)
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb r11 = r10.this$0
            com.unity3d.ads.core.domain.HttpClientProvider r11 = com.unity3d.services.core.domain.task.InitializeStateLoadWeb.access$getHttpClientProvider$p(r11)
            r10.label = r2
            java.lang.Object r11 = r11.invoke(r10)
            if (r11 != r3) goto L2e
            goto L3f
        L2e:
            r4 = r11
            com.unity3d.services.core.network.core.HttpClient r4 = (com.unity3d.services.core.network.core.HttpClient) r4
            com.unity3d.services.core.network.model.HttpRequest r5 = r10.$request
            r10.label = r1
            r6 = 0
            r8 = 2
            r9 = 0
            r7 = r10
            java.lang.Object r11 = com.unity3d.services.core.network.core.HttpClient.DefaultImpls.execute$default(r4, r5, r6, r7, r8, r9)
            if (r11 != r3) goto L40
        L3f:
            return r3
        L40:
            com.unity3d.services.core.network.model.HttpResponse r11 = (com.unity3d.services.core.network.model.HttpResponse) r11
            java.lang.Object r11 = r11.getBody()
            java.lang.String r11 = r11.toString()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$1$webViewData$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
