package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.connectivity.ConnectivityMonitor;
import com.unity3d.services.core.domain.task.InitializeStateNetworkError;
import com.unity3d.services.core.log.DeviceLog;
import gf.c0;
import gf.f0;
import he.a;
import he.k;
import he.y;
import java.util.concurrent.CancellationException;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$2", f = "InitializeStateNetworkError.kt", l = {39}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class InitializeStateNetworkError$doWork$2 extends j implements p {
    final /* synthetic */ InitializeStateNetworkError.Params $params;
    Object L$0;
    int label;
    final /* synthetic */ InitializeStateNetworkError this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateNetworkError$doWork$2(InitializeStateNetworkError initializeStateNetworkError, InitializeStateNetworkError.Params params, c cVar) {
        super(2, cVar);
        this.this$0 = initializeStateNetworkError;
        this.$params = params;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new InitializeStateNetworkError$doWork$2(this.this$0, this.$params, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((InitializeStateNetworkError$doWork$2) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        Object b10;
        Throwable a10;
        InitializeStateNetworkError initializeStateNetworkError;
        int i6 = this.label;
        try {
            if (i6 != 0) {
                if (i6 == 1) {
                    initializeStateNetworkError = (InitializeStateNetworkError) this.L$0;
                    a.f(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a.f(obj);
                initializeStateNetworkError = this.this$0;
                InitializeStateNetworkError.Params params = this.$params;
                DeviceLog.error("Unity Ads init: network error, waiting for connection events");
                initializeStateNetworkError.maximumConnectedEvents = params.getConfig().getMaximumConnectedEvents();
                initializeStateNetworkError.connectedEventThreshold = params.getConfig().getConnectedEventThreshold();
                long networkErrorTimeout = params.getConfig().getNetworkErrorTimeout();
                InitializeStateNetworkError$doWork$2$1$success$1 initializeStateNetworkError$doWork$2$1$success$1 = new InitializeStateNetworkError$doWork$2$1$success$1(initializeStateNetworkError, null);
                this.L$0 = initializeStateNetworkError;
                this.label = 1;
                obj = f0.L(networkErrorTimeout, initializeStateNetworkError$doWork$2$1$success$1, this);
                me.a aVar = me.a.f8833x;
                if (obj == aVar) {
                    return aVar;
                }
            }
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th) {
            b10 = a.b(th);
        }
        if (((y) obj) != null) {
            b10 = y.f6101a;
            if ((b10 instanceof he.j) && (a10 = k.a(b10)) != null) {
                b10 = a.b(a10);
            }
            return new k(b10);
        }
        ConnectivityMonitor.removeListener(initializeStateNetworkError);
        throw new Exception("No connected events within the timeout!");
    }
}
