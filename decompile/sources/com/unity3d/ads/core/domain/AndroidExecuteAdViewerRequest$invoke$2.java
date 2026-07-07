package com.unity3d.ads.core.domain;

import com.unity3d.services.core.network.model.RequestType;
import gf.c0;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest$invoke$2", f = "AndroidExecuteAdViewerRequest.kt", l = {28, 29}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidExecuteAdViewerRequest$invoke$2 extends j implements p {
    final /* synthetic */ Object[] $parameters;
    final /* synthetic */ RequestType $type;
    int label;
    final /* synthetic */ AndroidExecuteAdViewerRequest this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidExecuteAdViewerRequest$invoke$2(Object[] objArr, AndroidExecuteAdViewerRequest androidExecuteAdViewerRequest, RequestType requestType, c cVar) {
        super(2, cVar);
        this.$parameters = objArr;
        this.this$0 = androidExecuteAdViewerRequest;
        this.$type = requestType;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new AndroidExecuteAdViewerRequest$invoke$2(this.$parameters, this.this$0, this.$type, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((AndroidExecuteAdViewerRequest$invoke$2) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ac, code lost:
    
        if (r0 == r6) goto L47;
     */
    @Override // ne.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r3 = r18
            int r0 = r3.label
            r1 = 1
            r2 = 2
            me.a r6 = me.a.f8833x
            if (r0 == 0) goto L21
            if (r0 == r1) goto L1a
            if (r0 != r2) goto L12
            he.a.f(r19)
            return r19
        L12:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L1a:
            he.a.f(r19)
            r0 = r19
            goto Laf
        L21:
            he.a.f(r19)
            java.lang.Object[] r0 = r3.$parameters
            java.lang.Object r0 = ie.i.m0(r1, r0)
            boolean r4 = r0 instanceof java.lang.String
            r5 = 0
            if (r4 == 0) goto L32
            java.lang.String r0 = (java.lang.String) r0
            goto L33
        L32:
            r0 = r5
        L33:
            if (r0 != 0) goto L37
            java.lang.String r0 = ""
        L37:
            int r4 = r0.length()
            if (r4 <= 0) goto Lc8
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch: java.lang.Throwable -> L47
            java.lang.String r4 = "parse(this)"
            kotlin.jvm.internal.k.d(r0, r4)     // Catch: java.lang.Throwable -> L47
            goto L4c
        L47:
            r0 = move-exception
            he.j r0 = he.a.b(r0)
        L4c:
            boolean r4 = r0 instanceof he.j
            if (r4 == 0) goto L51
            r0 = r5
        L51:
            android.net.Uri r0 = (android.net.Uri) r0
            if (r0 == 0) goto L8c
            com.unity3d.services.core.network.model.RequestType r4 = r3.$type
            com.unity3d.services.core.network.model.RequestType r7 = com.unity3d.services.core.network.model.RequestType.GET
            if (r4 != r7) goto L5c
            goto L5d
        L5c:
            r0 = r5
        L5d:
            if (r0 == 0) goto L8c
            com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest r4 = r3.this$0
            com.unity3d.ads.core.domain.GetCachedAsset r4 = com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest.access$getGetCachedAsset$p(r4)
            android.webkit.WebResourceResponse r0 = com.unity3d.ads.core.domain.GetCachedAsset.invoke$default(r4, r0, r5, r2, r5)
            if (r0 == 0) goto L8c
            java.io.InputStream r0 = r0.getData()
            if (r0 == 0) goto L8c
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream
            int r5 = r0.available()
            r7 = 8192(0x2000, float:1.148E-41)
            int r5 = java.lang.Math.max(r7, r5)
            r4.<init>(r5)
            e9.f.b(r0, r4, r7)
            byte[] r5 = r4.toByteArray()
            java.lang.String r0 = "toByteArray(...)"
            kotlin.jvm.internal.k.d(r5, r0)
        L8c:
            r8 = r5
            if (r8 == 0) goto La0
            com.unity3d.services.core.network.model.HttpResponse r7 = new com.unity3d.services.core.network.model.HttpResponse
            r16 = 126(0x7e, float:1.77E-43)
            r17 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r16, r17)
            return r7
        La0:
            com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest r0 = r3.this$0
            com.unity3d.ads.core.domain.HttpClientProvider r0 = com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest.access$getHttpClientProvider$p(r0)
            r3.label = r1
            java.lang.Object r0 = r0.invoke(r3)
            if (r0 != r6) goto Laf
            goto Lc6
        Laf:
            com.unity3d.services.core.network.core.HttpClient r0 = (com.unity3d.services.core.network.core.HttpClient) r0
            com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest r1 = r3.this$0
            com.unity3d.services.core.network.model.RequestType r4 = r3.$type
            java.lang.Object[] r5 = r3.$parameters
            com.unity3d.services.core.network.model.HttpRequest r1 = com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest.access$createRequest(r1, r4, r5)
            r3.label = r2
            r2 = 0
            r4 = 2
            r5 = 0
            java.lang.Object r0 = com.unity3d.services.core.network.core.HttpClient.DefaultImpls.execute$default(r0, r1, r2, r3, r4, r5)
            if (r0 != r6) goto Lc7
        Lc6:
            return r6
        Lc7:
            return r0
        Lc8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed requirement."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest$invoke$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
