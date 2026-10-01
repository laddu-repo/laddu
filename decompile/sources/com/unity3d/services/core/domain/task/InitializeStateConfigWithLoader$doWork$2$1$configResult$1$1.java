package com.unity3d.services.core.domain.task;

import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.IConfigurationLoader;
import com.unity3d.services.core.configuration.IConfigurationLoaderListener;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.extensions.AbortRetryException;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.request.metrics.TSIMetric;
import gf.c0;
import gf.f0;
import he.a;
import he.y;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.w;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1", f = "InitializeStateConfigWithLoader.kt", l = {69}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1 extends j implements p {
    final /* synthetic */ w $config;
    final /* synthetic */ w $configurationLoader;
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ InitializeStateConfigWithLoader this$0;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    @e(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1$1", f = "InitializeStateConfigWithLoader.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends j implements p {
        final /* synthetic */ w $config;
        final /* synthetic */ w $configurationLoader;
        int label;
        final /* synthetic */ InitializeStateConfigWithLoader this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(w wVar, w wVar2, InitializeStateConfigWithLoader initializeStateConfigWithLoader, c cVar) {
            super(2, cVar);
            this.$configurationLoader = wVar;
            this.$config = wVar2;
            this.this$0 = initializeStateConfigWithLoader;
        }

        @Override // ne.a
        public final c create(Object obj, c cVar) {
            return new AnonymousClass1(this.$configurationLoader, this.$config, this.this$0, cVar);
        }

        @Override // ve.p
        public final Object invoke(c0 c0Var, c cVar) {
            return ((AnonymousClass1) create(c0Var, cVar)).invokeSuspend(y.f6101a);
        }

        @Override // ne.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                a.f(obj);
                IConfigurationLoader iConfigurationLoader = (IConfigurationLoader) this.$configurationLoader.f8055x;
                final w wVar = this.$config;
                final InitializeStateConfigWithLoader initializeStateConfigWithLoader = this.this$0;
                iConfigurationLoader.loadConfiguration(new IConfigurationLoaderListener() { // from class: com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.doWork.2.1.configResult.1.1.1.1
                    @Override // com.unity3d.services.core.configuration.IConfigurationLoaderListener
                    public void onError(String errorMsg) {
                        SDKMetricsSender sDKMetricsSender;
                        k.e(errorMsg, "errorMsg");
                        sDKMetricsSender = initializeStateConfigWithLoader.sdkMetricsSender;
                        Metric newEmergencySwitchOff = TSIMetric.newEmergencySwitchOff();
                        k.d(newEmergencySwitchOff, "newEmergencySwitchOff()");
                        sDKMetricsSender.sendMetric(newEmergencySwitchOff);
                        throw new AbortRetryException(errorMsg);
                    }

                    @Override // com.unity3d.services.core.configuration.IConfigurationLoaderListener
                    public void onSuccess(Configuration configuration) {
                        TokenStorage tokenStorage;
                        k.e(configuration, "configuration");
                        w.this.f8055x = configuration;
                        configuration.saveToDisk();
                        tokenStorage = initializeStateConfigWithLoader.tokenStorage;
                        tokenStorage.setInitToken(((Configuration) w.this.f8055x).getUnifiedAuctionToken());
                    }
                });
                return y.f6101a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1(InitializeStateConfigWithLoader initializeStateConfigWithLoader, w wVar, w wVar2, c cVar) {
        super(2, cVar);
        this.this$0 = initializeStateConfigWithLoader;
        this.$configurationLoader = wVar;
        this.$config = wVar2;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1 initializeStateConfigWithLoader$doWork$2$1$configResult$1$1 = new InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1(this.this$0, this.$configurationLoader, this.$config, cVar);
        initializeStateConfigWithLoader$doWork$2$1$configResult$1$1.I$0 = ((Number) obj).intValue();
        return initializeStateConfigWithLoader$doWork$2$1$configResult$1$1;
    }

    public final Object invoke(int i6, c cVar) {
        return ((InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1) create(Integer.valueOf(i6), cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        ISDKDispatchers iSDKDispatchers;
        int i6 = this.label;
        if (i6 != 0) {
            if (i6 == 1) {
                a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a.f(obj);
            if (this.I$0 > 0) {
                InitializeEventsMetricSender.getInstance().onRetryConfig();
            }
            iSDKDispatchers = this.this$0.dispatchers;
            gf.y io = iSDKDispatchers.getIo();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$configurationLoader, this.$config, this.this$0, null);
            this.label = 1;
            Object J = f0.J(io, anonymousClass1, this);
            me.a aVar = me.a.f8833x;
            if (J == aVar) {
                return aVar;
            }
        }
        return y.f6101a;
    }

    @Override // ve.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), (c) obj2);
    }
}
