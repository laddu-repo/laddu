package com.unity3d.services.core.domain.task;

import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.task.BaseTask;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import kotlin.jvm.internal.k;
import le.c;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class InitializeStateConfigWithLoader implements BaseTask<Params, Configuration> {
    private final ISDKDispatchers dispatchers;
    private final InitializeStateNetworkError initializeStateNetworkError;
    private final SDKMetricsSender sdkMetricsSender;
    private final TokenStorage tokenStorage;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Params implements BaseParams {
        private final Configuration config;

        public Params(Configuration config) {
            k.e(config, "config");
            this.config = config;
        }

        public static /* synthetic */ Params copy$default(Params params, Configuration configuration, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                configuration = params.config;
            }
            return params.copy(configuration);
        }

        public final Configuration component1() {
            return this.config;
        }

        public final Params copy(Configuration config) {
            k.e(config, "config");
            return new Params(config);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Params) && k.a(this.config, ((Params) obj).config)) {
                return true;
            }
            return false;
        }

        public final Configuration getConfig() {
            return this.config;
        }

        public int hashCode() {
            return this.config.hashCode();
        }

        public String toString() {
            return "Params(config=" + this.config + ')';
        }
    }

    public InitializeStateConfigWithLoader(ISDKDispatchers dispatchers, InitializeStateNetworkError initializeStateNetworkError, TokenStorage tokenStorage, SDKMetricsSender sdkMetricsSender) {
        k.e(dispatchers, "dispatchers");
        k.e(initializeStateNetworkError, "initializeStateNetworkError");
        k.e(tokenStorage, "tokenStorage");
        k.e(sdkMetricsSender, "sdkMetricsSender");
        this.dispatchers = dispatchers;
        this.initializeStateNetworkError = initializeStateNetworkError;
        this.tokenStorage = tokenStorage;
        this.sdkMetricsSender = sdkMetricsSender;
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return BaseTask.DefaultImpls.getServiceProvider(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // com.unity3d.services.core.domain.task.BaseTask
    /* renamed from: doWork-gIAlu-s, reason: avoid collision after fix types in other method and not valid java name and merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo70doWorkgIAlus(com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.Params r5, le.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$1
            if (r0 == 0) goto L13
            r0 = r6
            com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$1 r0 = (com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$1 r0 = new com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            he.a.f(r6)
            goto L47
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            he.a.f(r6)
            com.unity3d.services.core.domain.ISDKDispatchers r6 = r4.dispatchers
            gf.y r6 = r6.getDefault()
            com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2 r1 = new com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2
            r3 = 0
            r1.<init>(r4, r5, r3)
            r0.label = r2
            java.lang.Object r6 = gf.f0.J(r6, r1, r0)
            me.a r5 = me.a.f8833x
            if (r6 != r5) goto L47
            return r5
        L47:
            he.k r6 = (he.k) r6
            java.lang.Object r5 = r6.f6079x
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.mo70doWorkgIAlus(com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$Params, le.c):java.lang.Object");
    }

    @Override // com.unity3d.services.core.domain.task.BaseTask
    /* renamed from: invoke-gIAlu-s, reason: avoid collision after fix types in other method and not valid java name and merged with bridge method [inline-methods] */
    public Object mo71invokegIAlus(Params params, c cVar) {
        return BaseTask.DefaultImpls.m72invokegIAlus(this, params, cVar);
    }
}
