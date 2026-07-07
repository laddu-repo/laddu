package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.ExecuteAdViewerRequest;
import com.unity3d.services.core.network.model.RequestType;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class CommonAdViewerExposedFunctionsKt$request$1 implements ExposedFunction {
    final /* synthetic */ ExecuteAdViewerRequest $executeAdViewerRequest;
    final /* synthetic */ RequestType $type;

    public CommonAdViewerExposedFunctionsKt$request$1(ExecuteAdViewerRequest executeAdViewerRequest, RequestType requestType) {
        this.$executeAdViewerRequest = executeAdViewerRequest;
        this.$type = requestType;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006c A[Catch: Exception -> 0x002d, TryCatch #1 {Exception -> 0x002d, blocks: (B:11:0x0029, B:12:0x0062, B:14:0x006c, B:15:0x007f, B:19:0x006f, B:21:0x0073), top: B:10:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f A[Catch: Exception -> 0x002d, TryCatch #1 {Exception -> 0x002d, blocks: (B:11:0x0029, B:12:0x0062, B:14:0x006c, B:15:0x007f, B:19:0x006f, B:21:0x0073), top: B:10:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // com.unity3d.ads.adplayer.ExposedFunction, ve.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object[] r9, le.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$request$1$invoke$1
            if (r0 == 0) goto L13
            r0 = r10
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$request$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$request$1$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$request$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$request$1$invoke$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            java.lang.Object r9 = r0.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r0 = r0.L$0
            java.lang.String r0 = (java.lang.String) r0
            he.a.f(r10)     // Catch: java.lang.Exception -> L2d
            goto L62
        L2d:
            r10 = move-exception
            goto Lb3
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            he.a.f(r10)
            java.lang.Object r10 = ie.i.l0(r9)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.k.c(r10, r1)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r1 = ie.i.m0(r2, r9)
            java.lang.String r1 = (java.lang.String) r1
            com.unity3d.ads.core.domain.ExecuteAdViewerRequest r3 = r8.$executeAdViewerRequest     // Catch: java.lang.Exception -> Laf
            com.unity3d.services.core.network.model.RequestType r4 = r8.$type     // Catch: java.lang.Exception -> Laf
            r0.L$0 = r10     // Catch: java.lang.Exception -> Laf
            r0.L$1 = r1     // Catch: java.lang.Exception -> Laf
            r0.label = r2     // Catch: java.lang.Exception -> Laf
            java.lang.Object r9 = r3.invoke(r4, r9, r0)     // Catch: java.lang.Exception -> Laf
            me.a r0 = me.a.f8833x
            if (r9 != r0) goto L5f
            return r0
        L5f:
            r0 = r10
            r10 = r9
            r9 = r1
        L62:
            com.unity3d.services.core.network.model.HttpResponse r10 = (com.unity3d.services.core.network.model.HttpResponse) r10     // Catch: java.lang.Exception -> L2d
            java.lang.Object r1 = r10.getBody()     // Catch: java.lang.Exception -> L2d
            boolean r3 = r1 instanceof java.lang.String     // Catch: java.lang.Exception -> L2d
            if (r3 == 0) goto L6f
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L2d
            goto L7f
        L6f:
            boolean r3 = r1 instanceof byte[]     // Catch: java.lang.Exception -> L2d
            if (r3 == 0) goto L7e
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Exception -> L2d
            byte[] r1 = (byte[]) r1     // Catch: java.lang.Exception -> L2d
            java.nio.charset.Charset r4 = df.a.f4115a     // Catch: java.lang.Exception -> L2d
            r3.<init>(r1, r4)     // Catch: java.lang.Exception -> L2d
            r1 = r3
            goto L7f
        L7e:
            r1 = 0
        L7f:
            com.unity3d.ads.adplayer.model.OnWebRequestComplete r3 = new com.unity3d.ads.adplayer.model.OnWebRequestComplete     // Catch: java.lang.Exception -> L2d
            java.lang.String r4 = r10.getUrlString()     // Catch: java.lang.Exception -> L2d
            int r5 = r10.getStatusCode()     // Catch: java.lang.Exception -> L2d
            java.lang.Integer r6 = new java.lang.Integer     // Catch: java.lang.Exception -> L2d
            r6.<init>(r5)     // Catch: java.lang.Exception -> L2d
            java.util.Map r10 = r10.getHeaders()     // Catch: java.lang.Exception -> L2d
            org.json.JSONArray r10 = com.unity3d.services.core.network.mapper.HttpResponseHeaderToJSONArrayKt.toResponseHeadersMap(r10)     // Catch: java.lang.Exception -> L2d
            r5 = 5
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L2d
            r7 = 0
            r5[r7] = r0     // Catch: java.lang.Exception -> L2d
            r5[r2] = r4     // Catch: java.lang.Exception -> L2d
            r2 = 2
            r5[r2] = r1     // Catch: java.lang.Exception -> L2d
            r1 = 3
            r5[r1] = r6     // Catch: java.lang.Exception -> L2d
            r1 = 4
            r5[r1] = r10     // Catch: java.lang.Exception -> L2d
            java.util.List r10 = ie.k.t(r5)     // Catch: java.lang.Exception -> L2d
            r3.<init>(r10)     // Catch: java.lang.Exception -> L2d
            return r3
        Laf:
            r9 = move-exception
            r0 = r10
            r10 = r9
            r9 = r1
        Lb3:
            com.unity3d.ads.adplayer.model.OnWebRequestFailed r1 = new com.unity3d.ads.adplayer.model.OnWebRequestFailed
            java.lang.String r10 = r10.getMessage()
            if (r10 != 0) goto Lbd
            java.lang.String r10 = ""
        Lbd:
            java.lang.String[] r9 = new java.lang.String[]{r0, r9, r10}
            java.util.List r9 = ie.k.t(r9)
            r1.<init>(r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$request$1.invoke(java.lang.Object[], le.c):java.lang.Object");
    }
}
