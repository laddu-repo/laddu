package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.domain.task.InitializeStateConfig;
import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.NetworkIOException;
import gf.c0;
import he.a;
import he.k;
import he.y;
import java.util.concurrent.CancellationException;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.services.core.domain.task.InitializeStateConfig$doWork$2", f = "InitializeStateConfig.kt", l = {32}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class InitializeStateConfig$doWork$2 extends j implements p {
    final /* synthetic */ InitializeStateConfig.Params $params;
    Object L$0;
    int label;
    final /* synthetic */ InitializeStateConfig this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateConfig$doWork$2(InitializeStateConfig.Params params, InitializeStateConfig initializeStateConfig, c cVar) {
        super(2, cVar);
        this.$params = params;
        this.this$0 = initializeStateConfig;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new InitializeStateConfig$doWork$2(this.$params, this.this$0, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((InitializeStateConfig$doWork$2) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        Object b10;
        Throwable a10;
        InitializeStateConfigWithLoader initializeStateConfigWithLoader;
        Object mo71invokegIAlus;
        Configuration configuration = "Unity Ads init: load configuration from ";
        int i6 = this.label;
        try {
            try {
                if (i6 != 0) {
                    if (i6 == 1) {
                        Configuration configuration2 = (Configuration) this.L$0;
                        a.f(obj);
                        mo71invokegIAlus = ((k) obj).f6079x;
                        configuration = configuration2;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a.f(obj);
                    InitializeStateConfig.Params params = this.$params;
                    InitializeStateConfig initializeStateConfig = this.this$0;
                    DeviceLog.info("Unity Ads init: load configuration from " + SdkProperties.getConfigUrl());
                    Configuration configuration3 = new Configuration(SdkProperties.getConfigUrl(), params.getConfig().getExperimentsReader());
                    initializeStateConfigWithLoader = initializeStateConfig.initializeStateConfigWithLoader;
                    InitializeStateConfigWithLoader.Params params2 = new InitializeStateConfigWithLoader.Params(configuration3);
                    this.L$0 = configuration3;
                    this.label = 1;
                    mo71invokegIAlus = initializeStateConfigWithLoader.mo71invokegIAlus(params2, (c) this);
                    me.a aVar = me.a.f8833x;
                    configuration = configuration3;
                    if (mo71invokegIAlus == aVar) {
                        return aVar;
                    }
                }
                a.f(mo71invokegIAlus);
                b10 = (Configuration) mo71invokegIAlus;
            } catch (NetworkIOException e10) {
                throw new InitializationException(ErrorState.NetworkConfigRequest, e10, configuration);
            }
        } catch (CancellationException e11) {
            throw e11;
        } catch (Throwable th) {
            b10 = a.b(th);
        }
        if ((b10 instanceof he.j) && (a10 = k.a(b10)) != null) {
            b10 = a.b(a10);
        }
        return new k(b10);
    }
}
