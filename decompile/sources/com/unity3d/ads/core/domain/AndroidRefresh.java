package com.unity3d.ads.core.domain;

import com.unity3d.ads.gatewayclient.GatewayClient;
import gf.y;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidRefresh implements Refresh {
    private final y defaultDispatcher;
    private final GatewayClient gatewayClient;
    private final GetAdDataRefreshRequest getAdDataRefreshRequest;
    private final GetRequestPolicy getRequestPolicy;

    public AndroidRefresh(y defaultDispatcher, GetAdDataRefreshRequest getAdDataRefreshRequest, GetRequestPolicy getRequestPolicy, GatewayClient gatewayClient) {
        k.e(defaultDispatcher, "defaultDispatcher");
        k.e(getAdDataRefreshRequest, "getAdDataRefreshRequest");
        k.e(getRequestPolicy, "getRequestPolicy");
        k.e(gatewayClient, "gatewayClient");
        this.defaultDispatcher = defaultDispatcher;
        this.getAdDataRefreshRequest = getAdDataRefreshRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.gatewayClient = gatewayClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // com.unity3d.ads.core.domain.Refresh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(com.google.protobuf.ByteString r5, com.google.protobuf.ByteString r6, le.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.core.domain.AndroidRefresh$invoke$1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.ads.core.domain.AndroidRefresh$invoke$1 r0 = (com.unity3d.ads.core.domain.AndroidRefresh$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.AndroidRefresh$invoke$1 r0 = new com.unity3d.ads.core.domain.AndroidRefresh$invoke$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            he.a.f(r7)
            goto L43
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            he.a.f(r7)
            gf.y r7 = r4.defaultDispatcher
            com.unity3d.ads.core.domain.AndroidRefresh$invoke$2 r1 = new com.unity3d.ads.core.domain.AndroidRefresh$invoke$2
            r3 = 0
            r1.<init>(r4, r6, r5, r3)
            r0.label = r2
            java.lang.Object r7 = gf.f0.J(r7, r1, r0)
            me.a r5 = me.a.f8833x
            if (r7 != r5) goto L43
            return r5
        L43:
            java.lang.String r5 = "override suspend fun inv…RefreshResponse\n        }"
            kotlin.jvm.internal.k.d(r7, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidRefresh.invoke(com.google.protobuf.ByteString, com.google.protobuf.ByteString, le.c):java.lang.Object");
    }
}
