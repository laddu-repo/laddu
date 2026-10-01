package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.domain.scar.FetchSignalsAndSendUseCase;
import com.unity3d.ads.core.domain.scar.ScarEligibleEffectiveUseCase;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class CommonGetHeaderBiddingToken implements GetHeaderBiddingToken {
    public static final Companion Companion = new Companion(null);
    public static final String HB_TOKEN_VERSION = "2";
    private final BuildHeaderBiddingToken buildHeaderBiddingToken;
    private final FetchSignalsAndSendUseCase fetchSignalsAndSendUseCase;
    private final ScarEligibleEffectiveUseCase scarEligibleEffectiveUseCase;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private Companion() {
        }
    }

    public CommonGetHeaderBiddingToken(BuildHeaderBiddingToken buildHeaderBiddingToken, FetchSignalsAndSendUseCase fetchSignalsAndSendUseCase, ScarEligibleEffectiveUseCase scarEligibleEffectiveUseCase) {
        k.e(buildHeaderBiddingToken, "buildHeaderBiddingToken");
        k.e(fetchSignalsAndSendUseCase, "fetchSignalsAndSendUseCase");
        k.e(scarEligibleEffectiveUseCase, "scarEligibleEffectiveUseCase");
        this.buildHeaderBiddingToken = buildHeaderBiddingToken;
        this.fetchSignalsAndSendUseCase = fetchSignalsAndSendUseCase;
        this.scarEligibleEffectiveUseCase = scarEligibleEffectiveUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.unity3d.ads.core.domain.GetHeaderBiddingToken
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(int r9, com.unity3d.ads.TokenConfiguration r10, le.c r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken$invoke$1
            if (r0 == 0) goto L13
            r0 = r11
            com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken$invoke$1 r0 = (com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken$invoke$1 r0 = new com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken$invoke$1
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 0
            r4 = 1
            me.a r5 = me.a.f8833x
            if (r1 == 0) goto L49
            if (r1 == r4) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r9 = r0.L$0
            gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken r9 = (gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) r9
            he.a.f(r11)
            goto L92
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            int r9 = r0.I$0
            java.lang.Object r10 = r0.L$2
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r1 = r0.L$1
            com.unity3d.ads.TokenConfiguration r1 = (com.unity3d.ads.TokenConfiguration) r1
            java.lang.Object r6 = r0.L$0
            com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken r6 = (com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken) r6
            he.a.f(r11)
            goto L6f
        L49:
            he.a.f(r11)
            com.unity3d.ads.core.domain.scar.ScarEligibleEffectiveUseCase r11 = r8.scarEligibleEffectiveUseCase
            java.util.List r11 = r11.invoke(r10)
            com.unity3d.ads.core.domain.BuildHeaderBiddingToken r1 = r8.buildHeaderBiddingToken
            boolean r6 = r11.isEmpty()
            r6 = r6 ^ r4
            r0.L$0 = r8
            r0.L$1 = r10
            r0.L$2 = r11
            r0.I$0 = r9
            r0.label = r4
            java.lang.Object r1 = r1.invoke(r9, r10, r6, r0)
            if (r1 != r5) goto L6a
            goto L90
        L6a:
            r6 = r1
            r1 = r10
            r10 = r11
            r11 = r6
            r6 = r8
        L6f:
            gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken r11 = (gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) r11
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L93
            com.unity3d.ads.core.domain.scar.FetchSignalsAndSendUseCase r10 = r6.fetchSignalsAndSendUseCase
            com.google.protobuf.ByteString r6 = r11.getTokenId()
            java.lang.String r7 = "rawToken.tokenId"
            kotlin.jvm.internal.k.d(r6, r7)
            r0.L$0 = r11
            r0.L$1 = r3
            r0.L$2 = r3
            r0.label = r2
            java.lang.Object r9 = r10.invoke(r9, r6, r1, r0)
            if (r9 != r5) goto L91
        L90:
            return r5
        L91:
            r9 = r11
        L92:
            r11 = r9
        L93:
            com.google.protobuf.ByteString r9 = r11.toByteString()
            java.lang.String r10 = "rawToken.toByteString()"
            kotlin.jvm.internal.k.d(r9, r10)
            r10 = 0
            java.lang.String r9 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(r9, r10, r4, r3)
            java.lang.String r10 = "2:"
            java.lang.String r9 = r4.a.k(r10, r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken.invoke(int, com.unity3d.ads.TokenConfiguration, le.c):java.lang.Object");
    }
}
