package com.unity3d.ads.core.domain.work;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.ServiceProvider;
import he.a;
import he.f;
import he.g;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class OperativeEventJob extends UniversalRequestJob implements IServiceComponent {
    private final f getOperativeRequestPolicy$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperativeEventJob(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        k.e(context, "context");
        k.e(workerParams, "workerParams");
        this.getOperativeRequestPolicy$delegate = a.c(g.f6075z, new OperativeEventJob$special$$inlined$inject$default$1(this, ServiceProvider.NAMED_OPERATIVE_REQ));
    }

    private final GetRequestPolicy getGetOperativeRequestPolicy() {
        return (GetRequestPolicy) this.getOperativeRequestPolicy$delegate.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // com.unity3d.ads.core.domain.work.UniversalRequestJob, androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object doWork(le.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.unity3d.ads.core.domain.work.OperativeEventJob$doWork$1
            if (r0 == 0) goto L13
            r0 = r5
            com.unity3d.ads.core.domain.work.OperativeEventJob$doWork$1 r0 = (com.unity3d.ads.core.domain.work.OperativeEventJob$doWork$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.work.OperativeEventJob$doWork$1 r0 = new com.unity3d.ads.core.domain.work.OperativeEventJob$doWork$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.work.OperativeEventJob r0 = (com.unity3d.ads.core.domain.work.OperativeEventJob) r0
            he.a.f(r5)     // Catch: java.lang.Throwable -> L29
            goto L4f
        L29:
            r5 = move-exception
            goto L54
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            he.a.f(r5)
            com.unity3d.ads.core.domain.GetRequestPolicy r5 = r4.getGetOperativeRequestPolicy()     // Catch: java.lang.Throwable -> L52
            com.unity3d.ads.gatewayclient.RequestPolicy r5 = r5.invoke()     // Catch: java.lang.Throwable -> L52
            r4.setRequestPolicy(r5)     // Catch: java.lang.Throwable -> L52
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L52
            r0.label = r2     // Catch: java.lang.Throwable -> L52
            java.lang.Object r5 = super.doWork(r0)     // Catch: java.lang.Throwable -> L52
            me.a r0 = me.a.f8833x
            if (r5 != r0) goto L4e
            return r0
        L4e:
            r0 = r4
        L4f:
            v5.n r5 = (v5.n) r5     // Catch: java.lang.Throwable -> L29
            return r5
        L52:
            r5 = move-exception
            r0 = r4
        L54:
            com.unity3d.ads.core.log.Logger r0 = r0.getLogger()
            java.lang.String r1 = "OperativeEventJob failed to process work"
            r0.trace(r1, r5)
            v5.l r5 = new v5.l
            r5.<init>()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.work.OperativeEventJob.doWork(le.c):java.lang.Object");
    }
}
