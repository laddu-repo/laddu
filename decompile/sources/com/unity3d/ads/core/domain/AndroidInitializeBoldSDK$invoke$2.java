package com.unity3d.ads.core.domain;

import gf.c0;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2", f = "AndroidInitializeBoldSDK.kt", l = {68, 85}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidInitializeBoldSDK$invoke$2 extends j implements p {
    final /* synthetic */ String $source;
    int I$0;
    long J$0;
    int label;
    final /* synthetic */ AndroidInitializeBoldSDK this$0;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    @e(c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1", f = "AndroidInitializeBoldSDK.kt", l = {69, 71, 73, 74}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends j implements p {
        final /* synthetic */ boolean $isRetry;
        final /* synthetic */ String $source;
        int label;
        final /* synthetic */ AndroidInitializeBoldSDK this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AndroidInitializeBoldSDK androidInitializeBoldSDK, String str, boolean z10, c cVar) {
            super(2, cVar);
            this.this$0 = androidInitializeBoldSDK;
            this.$source = str;
            this.$isRetry = z10;
        }

        @Override // ne.a
        public final c create(Object obj, c cVar) {
            return new AnonymousClass1(this.this$0, this.$source, this.$isRetry, cVar);
        }

        @Override // ve.p
        public final Object invoke(c0 c0Var, c cVar) {
            return ((AnonymousClass1) create(c0Var, cVar)).invokeSuspend(y.f6101a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0080, code lost:
        
            if (r15 == r5) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0082, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
        
            if (r15 == r5) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
        
            if (r15 == r5) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x003c, code lost:
        
            if (r15 == r5) goto L16;
         */
        @Override // ne.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                int r0 = r14.label
                r1 = 4
                r2 = 3
                r3 = 2
                r4 = 1
                me.a r5 = me.a.f8833x
                if (r0 == 0) goto L2d
                if (r0 == r4) goto L29
                if (r0 == r3) goto L25
                if (r0 == r2) goto L20
                if (r0 != r1) goto L18
                he.a.f(r15)
                r11 = r14
                goto L83
            L18:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L20:
                he.a.f(r15)
                r11 = r14
                goto L76
            L25:
                he.a.f(r15)
                goto L54
            L29:
                he.a.f(r15)
                goto L40
            L2d:
                he.a.f(r15)
                com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r15 = r14.this$0
                java.lang.String r0 = r14.$source
                boolean r6 = r14.$isRetry
                r14.label = r4
                java.lang.Object r15 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$initializationStart(r15, r0, r6, r14)
                if (r15 != r5) goto L40
            L3e:
                r11 = r14
                goto L82
            L40:
                com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r15 = r14.this$0
                com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$checkCanInitialize(r15)
                com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r15 = r14.this$0
                com.unity3d.ads.core.domain.GetInitializationRequest r15 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getGetInitializeRequest$p(r15)
                r14.label = r3
                java.lang.Object r15 = r15.invoke(r14)
                if (r15 != r5) goto L54
                goto L3e
            L54:
                r8 = r15
                gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r8 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) r8
                com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r15 = r14.this$0
                com.unity3d.ads.core.domain.GetRequestPolicy r15 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getGetRequestPolicy$p(r15)
                com.unity3d.ads.gatewayclient.RequestPolicy r9 = r15.invoke()
                com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r15 = r14.this$0
                com.unity3d.ads.gatewayclient.GatewayClient r6 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getGatewayClient$p(r15)
                com.unity3d.ads.core.data.model.OperationType r10 = com.unity3d.ads.core.data.model.OperationType.INITIALIZATION
                r14.label = r2
                r7 = 0
                r12 = 1
                r13 = 0
                r11 = r14
                java.lang.Object r15 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r6, r7, r8, r9, r10, r11, r12, r13)
                if (r15 != r5) goto L76
                goto L82
            L76:
                gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse r15 = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r15
                com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r0 = r11.this$0
                r11.label = r1
                java.lang.Object r15 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$handleResponse(r0, r15, r14)
                if (r15 != r5) goto L83
            L82:
                return r5
            L83:
                he.y r15 = he.y.f6101a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidInitializeBoldSDK$invoke$2(AndroidInitializeBoldSDK androidInitializeBoldSDK, String str, c cVar) {
        super(2, cVar);
        this.this$0 = androidInitializeBoldSDK;
        this.$source = str;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new AndroidInitializeBoldSDK$invoke$2(this.this$0, this.$source, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((AndroidInitializeBoldSDK$invoke$2) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        if (gf.f0.K(com.unity3d.services.UnityAdsConstants.Timeout.INIT_TIMEOUT_MS, r12, r11) == r5) goto L24;
     */
    /* JADX WARN: Type inference failed for: r0v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r6v4, types: [long, java.lang.String] */
    @Override // ne.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.label
            he.y r1 = he.y.f6101a
            r2 = 2
            r3 = 0
            r4 = 1
            me.a r5 = me.a.f8833x
            if (r0 == 0) goto L25
            if (r0 == r4) goto L1b
            if (r0 != r2) goto L13
            he.a.f(r12)
            return r1
        L13:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1b:
            int r0 = r11.I$0
            long r6 = r11.J$0
            he.a.f(r12)     // Catch: java.lang.Exception -> L23
            goto L52
        L23:
            r12 = move-exception
            goto L68
        L25:
            he.a.f(r12)
            long r6 = ef.i.b()
            com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r12 = r11.this$0
            com.unity3d.ads.core.data.repository.SessionRepository r12 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getSessionRepository$p(r12)
            boolean r12 = r12.isFirstInitAttempt()
            r0 = r12 ^ 1
            com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1 r12 = new com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1     // Catch: java.lang.Exception -> L23
            com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r8 = r11.this$0     // Catch: java.lang.Exception -> L23
            java.lang.String r9 = r11.$source     // Catch: java.lang.Exception -> L23
            r10 = 0
            r12.<init>(r8, r9, r0, r10)     // Catch: java.lang.Exception -> L23
            r11.J$0 = r6     // Catch: java.lang.Exception -> L23
            r11.I$0 = r0     // Catch: java.lang.Exception -> L23
            r11.label = r4     // Catch: java.lang.Exception -> L23
            r8 = 120000(0x1d4c0, double:5.9288E-319)
            java.lang.Object r12 = gf.f0.K(r8, r12, r11)     // Catch: java.lang.Exception -> L23
            if (r12 != r5) goto L52
            goto L66
        L52:
            com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r12 = r11.this$0
            ef.k r8 = new ef.k
            r8.<init>(r6)
            java.lang.String r6 = r11.$source
            if (r0 == 0) goto L5e
            r3 = 1
        L5e:
            r11.label = r2
            java.lang.Object r12 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$initializationSuccess(r12, r8, r6, r3, r11)
            if (r12 != r5) goto L67
        L66:
            return r5
        L67:
            return r1
        L68:
            com.unity3d.ads.core.data.model.exception.InitializationException$Companion r2 = com.unity3d.ads.core.data.model.exception.InitializationException.Companion
            com.unity3d.ads.core.data.model.exception.InitializationException r2 = r2.parseFrom(r12)
            boolean r12 = r12 instanceof com.unity3d.ads.core.data.model.exception.GatewayException
            if (r12 == 0) goto L7b
            com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r12 = r11.this$0
            com.unity3d.ads.core.data.repository.SessionRepository r12 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getSessionRepository$p(r12)
            r12.setShouldInitialize(r3)
        L7b:
            com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r12 = r11.this$0
            ef.k r5 = new ef.k
            r5.<init>(r6)
            java.lang.String r6 = r11.$source
            if (r0 == 0) goto L87
            r3 = 1
        L87:
            com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$initializationFailure(r12, r5, r2, r6, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
