package com.unity3d.services.core.domain.task;

import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.unity3d.services.core.domain.ISDKDispatchers;
import he.y;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class InitializeSDK extends MetricTask<EmptyParams, y> {
    private final ConfigFileFromLocalStorage configFileFromLocalStorage;
    private final ISDKDispatchers dispatchers;
    private final InitializeStateComplete initializeStateComplete;
    private final InitializeStateConfig initializeStateConfig;
    private final InitializeStateCreate initializeStateCreate;
    private final InitializeStateError initializeStateError;
    private final InitializeStateLoadCache initializeStateLoadCache;
    private final InitializeStateLoadWeb initializeStateLoadWeb;
    private final InitializeStateReset initializeStateReset;

    public InitializeSDK(ISDKDispatchers dispatchers, ConfigFileFromLocalStorage configFileFromLocalStorage, InitializeStateReset initializeStateReset, InitializeStateError initializeStateError, InitializeStateConfig initializeStateConfig, InitializeStateCreate initializeStateCreate, InitializeStateLoadCache initializeStateLoadCache, InitializeStateLoadWeb initializeStateLoadWeb, InitializeStateComplete initializeStateComplete) {
        k.e(dispatchers, "dispatchers");
        k.e(configFileFromLocalStorage, "configFileFromLocalStorage");
        k.e(initializeStateReset, "initializeStateReset");
        k.e(initializeStateError, "initializeStateError");
        k.e(initializeStateConfig, "initializeStateConfig");
        k.e(initializeStateCreate, "initializeStateCreate");
        k.e(initializeStateLoadCache, "initializeStateLoadCache");
        k.e(initializeStateLoadWeb, "initializeStateLoadWeb");
        k.e(initializeStateComplete, "initializeStateComplete");
        this.dispatchers = dispatchers;
        this.configFileFromLocalStorage = configFileFromLocalStorage;
        this.initializeStateReset = initializeStateReset;
        this.initializeStateError = initializeStateError;
        this.initializeStateConfig = initializeStateConfig;
        this.initializeStateCreate = initializeStateCreate;
        this.initializeStateLoadCache = initializeStateLoadCache;
        this.initializeStateLoadWeb = initializeStateLoadWeb;
        this.initializeStateComplete = initializeStateComplete;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: executeErrorState-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m75executeErrorStateBWLJW6A(com.unity3d.services.core.configuration.ErrorState r5, java.lang.Throwable r6, com.unity3d.services.core.configuration.Configuration r7, le.c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.unity3d.services.core.domain.task.InitializeSDK$executeErrorState$1
            if (r0 == 0) goto L13
            r0 = r8
            com.unity3d.services.core.domain.task.InitializeSDK$executeErrorState$1 r0 = (com.unity3d.services.core.domain.task.InitializeSDK$executeErrorState$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.services.core.domain.task.InitializeSDK$executeErrorState$1 r0 = new com.unity3d.services.core.domain.task.InitializeSDK$executeErrorState$1
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            he.a.f(r8)
            he.k r8 = (he.k) r8
            java.lang.Object r5 = r8.f6079x
            return r5
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            he.a.f(r8)
            com.unity3d.services.core.domain.task.InitializeStateError r8 = r4.initializeStateError
            com.unity3d.services.core.domain.task.InitializeStateError$Params r1 = new com.unity3d.services.core.domain.task.InitializeStateError$Params
            java.lang.Exception r3 = new java.lang.Exception
            if (r6 == 0) goto L41
            java.lang.String r6 = r6.getMessage()
            goto L42
        L41:
            r6 = 0
        L42:
            r3.<init>(r6)
            r1.<init>(r5, r3, r7)
            r0.label = r2
            java.lang.Object r5 = r8.mo71invokegIAlus(r1, r0)
            me.a r6 = me.a.f8833x
            if (r5 != r6) goto L53
            return r6
        L53:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeSDK.m75executeErrorStateBWLJW6A(com.unity3d.services.core.configuration.ErrorState, java.lang.Throwable, com.unity3d.services.core.configuration.Configuration, le.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object handleInitializationException(com.unity3d.services.core.domain.task.InitializationException r5, le.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.unity3d.services.core.domain.task.InitializeSDK$handleInitializationException$1
            if (r0 == 0) goto L13
            r0 = r6
            com.unity3d.services.core.domain.task.InitializeSDK$handleInitializationException$1 r0 = (com.unity3d.services.core.domain.task.InitializeSDK$handleInitializationException$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.services.core.domain.task.InitializeSDK$handleInitializationException$1 r0 = new com.unity3d.services.core.domain.task.InitializeSDK$handleInitializationException$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 == r2) goto L29
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L29:
            java.lang.Object r5 = r0.L$0
            com.unity3d.services.core.domain.task.InitializationException r5 = (com.unity3d.services.core.domain.task.InitializationException) r5
            he.a.f(r6)
            he.k r6 = (he.k) r6
            r6.getClass()
            goto L52
        L36:
            he.a.f(r6)
            com.unity3d.services.core.configuration.ErrorState r6 = r5.getErrorState()
            java.lang.Exception r1 = r5.getOriginalException()
            com.unity3d.services.core.configuration.Configuration r3 = r5.getConfig()
            r0.L$0 = r5
            r0.label = r2
            java.lang.Object r6 = r4.m75executeErrorStateBWLJW6A(r6, r1, r3, r0)
            me.a r0 = me.a.f8833x
            if (r6 != r0) goto L52
            return r0
        L52:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeSDK.handleInitializationException(com.unity3d.services.core.domain.task.InitializationException, le.c):java.lang.Object");
    }

    @Override // com.unity3d.services.core.domain.task.MetricTask
    public String getMetricName() {
        return getMetricNameForInitializeTask(MobileAdsBridgeBase.initializeMethodName);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // com.unity3d.services.core.domain.task.BaseTask
    /* renamed from: doWork-gIAlu-s, reason: not valid java name and merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo70doWorkgIAlus(com.unity3d.services.core.domain.task.EmptyParams r4, le.c r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof com.unity3d.services.core.domain.task.InitializeSDK$doWork$1
            if (r4 == 0) goto L13
            r4 = r5
            com.unity3d.services.core.domain.task.InitializeSDK$doWork$1 r4 = (com.unity3d.services.core.domain.task.InitializeSDK$doWork$1) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.label = r0
            goto L18
        L13:
            com.unity3d.services.core.domain.task.InitializeSDK$doWork$1 r4 = new com.unity3d.services.core.domain.task.InitializeSDK$doWork$1
            r4.<init>(r3, r5)
        L18:
            java.lang.Object r5 = r4.result
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L2d
            if (r0 != r1) goto L25
            he.a.f(r5)
            goto L47
        L25:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            he.a.f(r5)
            com.unity3d.services.core.domain.ISDKDispatchers r5 = r3.dispatchers
            gf.y r5 = r5.getDefault()
            com.unity3d.services.core.domain.task.InitializeSDK$doWork$2 r0 = new com.unity3d.services.core.domain.task.InitializeSDK$doWork$2
            r2 = 0
            r0.<init>(r3, r2)
            r4.label = r1
            java.lang.Object r5 = gf.f0.J(r5, r0, r4)
            me.a r4 = me.a.f8833x
            if (r5 != r4) goto L47
            return r4
        L47:
            he.k r5 = (he.k) r5
            java.lang.Object r4 = r5.f6079x
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeSDK.mo70doWorkgIAlus(com.unity3d.services.core.domain.task.EmptyParams, le.c):java.lang.Object");
    }
}
