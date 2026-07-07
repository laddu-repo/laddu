package com.unity3d.ads.core.domain;

import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import ef.i;
import ie.w;
import je.f;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class CommonInitAwaitingGetHeaderBiddingToken implements GetAsyncHeaderBiddingToken {
    private final AwaitInitialization awaitInitialization;
    private boolean didAwaitInit;
    private final GetHeaderBiddingToken getHeaderBiddingToken;
    private final GetInitializationState getInitializationState;
    private IUnityAdsTokenListener listener;
    private final Logger logger;
    private final SafeCallbackInvoke safeCallbackInvoke;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private InitializationState startState;
    private final long startTime;

    public CommonInitAwaitingGetHeaderBiddingToken(GetHeaderBiddingToken getHeaderBiddingToken, SendDiagnosticEvent sendDiagnosticEvent, GetInitializationState getInitializationState, AwaitInitialization awaitInitialization, SessionRepository sessionRepository, SafeCallbackInvoke safeCallbackInvoke, Logger logger) {
        k.e(getHeaderBiddingToken, "getHeaderBiddingToken");
        k.e(sendDiagnosticEvent, "sendDiagnosticEvent");
        k.e(getInitializationState, "getInitializationState");
        k.e(awaitInitialization, "awaitInitialization");
        k.e(sessionRepository, "sessionRepository");
        k.e(safeCallbackInvoke, "safeCallbackInvoke");
        k.e(logger, "logger");
        this.getHeaderBiddingToken = getHeaderBiddingToken;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getInitializationState = getInitializationState;
        this.awaitInitialization = awaitInitialization;
        this.sessionRepository = sessionRepository;
        this.safeCallbackInvoke = safeCallbackInvoke;
        this.logger = logger;
        this.startTime = i.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object fetchToken(int r5, com.unity3d.ads.TokenConfiguration r6, le.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1 r0 = (com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1 r0 = new com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            int r5 = r0.I$0
            java.lang.Object r6 = r0.L$0
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken r6 = (com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken) r6
            he.a.f(r7)     // Catch: java.lang.Exception -> L2c
            goto L4b
        L2c:
            r7 = move-exception
            goto L53
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            he.a.f(r7)
            com.unity3d.ads.core.domain.GetHeaderBiddingToken r7 = r4.getHeaderBiddingToken     // Catch: java.lang.Exception -> L51
            r0.L$0 = r4     // Catch: java.lang.Exception -> L51
            r0.I$0 = r5     // Catch: java.lang.Exception -> L51
            r0.label = r2     // Catch: java.lang.Exception -> L51
            java.lang.Object r7 = r7.invoke(r5, r6, r0)     // Catch: java.lang.Exception -> L51
            me.a r6 = me.a.f8833x
            if (r7 != r6) goto L4a
            return r6
        L4a:
            r6 = r4
        L4b:
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L2c
            r0 = r3
            r3 = r7
            r7 = r0
            goto L5a
        L51:
            r7 = move-exception
            r6 = r4
        L53:
            r0 = 0
            java.lang.String r7 = com.unity3d.ads.core.extensions.ExceptionExtensionsKt.getShortenedStackTrace$default(r7, r0, r2, r3)
            java.lang.String r0 = "uncaught_exception"
        L5a:
            if (r3 != 0) goto L60
            r6.tokenFailure(r5, r0, r7)
            goto L63
        L60:
            r6.tokenSuccess(r5, r3)
        L63:
            he.y r5 = he.y.f6101a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.fetchToken(int, com.unity3d.ads.TokenConfiguration, le.c):java.lang.Object");
    }

    private final void tokenFailure(int i6, String str, String str2) {
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        Double valueOf = Double.valueOf(TimeExtensionsKt.elapsedMillis(new ef.k(this.startTime)));
        f fVar = new f();
        fVar.put("sync", "false");
        fVar.put("state", String.valueOf(this.startState));
        fVar.put("complete_state", GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString());
        fVar.put("awaited_init", String.valueOf(this.didAwaitInit));
        if (str != null) {
        }
        if (str2 != null) {
            fVar.put("reason_debug", str2);
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_gateway_token_failure_time", valueOf, fVar.b(), null, null, Integer.valueOf(i6), 24, null);
        Logger.DefaultImpls.error$default(this.logger, r4.a.k("Returned nil token due to: ", str), null, 2, null);
        this.safeCallbackInvoke.invoke(new CommonInitAwaitingGetHeaderBiddingToken$tokenFailure$2(this));
    }

    public static /* synthetic */ void tokenFailure$default(CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken, int i6, String str, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        commonInitAwaitingGetHeaderBiddingToken.tokenFailure(i6, str, str2);
    }

    private final void tokenStart(int i6) {
        this.logger.info("Token generation started");
        InitializationState invoke$default = GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null);
        this.startState = invoke$default;
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_gateway_token_started", null, w.y(new he.i("sync", "false"), new he.i("state", String.valueOf(invoke$default))), null, null, Integer.valueOf(i6), 26, null);
    }

    private final void tokenSuccess(int i6, String str) {
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_gateway_token_success_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(new ef.k(this.startTime))), w.y(new he.i("sync", "false"), new he.i("state", String.valueOf(this.startState)), new he.i("complete_state", GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString()), new he.i("awaited_init", String.valueOf(this.didAwaitInit))), null, null, Integer.valueOf(i6), 24, null);
        this.logger.info("Generated a valid token.");
        this.safeCallbackInvoke.invoke(new CommonInitAwaitingGetHeaderBiddingToken$tokenSuccess$1(this, str));
    }

    public final AwaitInitialization getAwaitInitialization() {
        return this.awaitInitialization;
    }

    public final GetHeaderBiddingToken getGetHeaderBiddingToken() {
        return this.getHeaderBiddingToken;
    }

    public final GetInitializationState getGetInitializationState() {
        return this.getInitializationState;
    }

    public final IUnityAdsTokenListener getListener() {
        return this.listener;
    }

    public final Logger getLogger() {
        return this.logger;
    }

    public final SafeCallbackInvoke getSafeCallbackInvoke() {
        return this.safeCallbackInvoke;
    }

    public final SendDiagnosticEvent getSendDiagnosticEvent() {
        return this.sendDiagnosticEvent;
    }

    public final SessionRepository getSessionRepository() {
        return this.sessionRepository;
    }

    /* renamed from: getStartTime-z9LOYto, reason: not valid java name */
    public final long m55getStartTimez9LOYto() {
        return this.startTime;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(int r10, com.unity3d.ads.TokenConfiguration r11, com.unity3d.ads.IUnityAdsTokenListener r12, le.c r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$1
            if (r0 == 0) goto L13
            r0 = r13
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$1 r0 = (com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$1 r0 = new com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$1
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.result
            int r1 = r0.label
            java.lang.String r2 = "!sessionRepository.shouldInitialize"
            java.lang.String r3 = "gateway"
            r4 = 2
            r5 = 1
            r6 = 0
            he.y r7 = he.y.f6101a
            me.a r8 = me.a.f8833x
            if (r1 == 0) goto L47
            if (r1 == r5) goto L39
            if (r1 != r4) goto L31
            he.a.f(r13)
            goto La2
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            int r10 = r0.I$0
            java.lang.Object r11 = r0.L$1
            com.unity3d.ads.TokenConfiguration r11 = (com.unity3d.ads.TokenConfiguration) r11
            java.lang.Object r12 = r0.L$0
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken r12 = (com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken) r12
            he.a.f(r13)
            goto L89
        L47:
            he.a.f(r13)
            r9.listener = r12
            r9.tokenStart(r10)
            if (r12 != 0) goto L59
            java.lang.String r11 = "listener_null"
            java.lang.String r12 = "IUnityAdsTokenListener is null"
            r9.tokenFailure(r10, r11, r12)
            return r7
        L59:
            com.unity3d.ads.core.data.repository.SessionRepository r12 = r9.sessionRepository
            boolean r12 = r12.getShouldInitialize()
            if (r12 != 0) goto L65
            r9.tokenFailure(r10, r3, r2)
            return r7
        L65:
            com.unity3d.ads.core.data.repository.SessionRepository r12 = r9.sessionRepository
            gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfiguration r12 = r12.getNativeConfiguration()
            gatewayprotocol.v1.NativeConfigurationOuterClass$AdOperationsConfiguration r12 = r12.getAdOperations()
            int r12 = r12.getGetTokenTimeoutMs()
            long r12 = (long) r12
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$2 r1 = new com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$2
            r1.<init>(r9, r6)
            r0.L$0 = r9
            r0.L$1 = r11
            r0.I$0 = r10
            r0.label = r5
            java.lang.Object r12 = gf.f0.L(r12, r1, r0)
            if (r12 != r8) goto L88
            goto La1
        L88:
            r12 = r9
        L89:
            com.unity3d.ads.core.data.repository.SessionRepository r13 = r12.sessionRepository
            boolean r13 = r13.getShouldInitialize()
            if (r13 != 0) goto L95
            r12.tokenFailure(r10, r3, r2)
            return r7
        L95:
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r10 = r12.fetchToken(r10, r11, r0)
            if (r10 != r8) goto La2
        La1:
            return r8
        La2:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.invoke(int, com.unity3d.ads.TokenConfiguration, com.unity3d.ads.IUnityAdsTokenListener, le.c):java.lang.Object");
    }

    public final void setListener(IUnityAdsTokenListener iUnityAdsTokenListener) {
        this.listener = iUnityAdsTokenListener;
    }
}
