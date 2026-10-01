package com.unity3d.ads.core.domain.work;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.domain.events.UniversalRequestEventSender;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import he.a;
import he.f;
import he.g;
import kotlin.jvm.internal.k;
import le.c;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class UniversalRequestJob extends CoroutineWorker implements IServiceComponent {
    private final f logger$delegate;
    public RequestPolicy requestPolicy;
    private final f universalRequestDataSource$delegate;
    private final f universalRequestEventSender$delegate;
    private final WorkerParameters workerParams;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalRequestJob(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        k.e(context, "context");
        k.e(workerParams, "workerParams");
        this.workerParams = workerParams;
        UniversalRequestJob$special$$inlined$inject$default$1 universalRequestJob$special$$inlined$inject$default$1 = new UniversalRequestJob$special$$inlined$inject$default$1(this, HttpUrl.FRAGMENT_ENCODE_SET);
        g gVar = g.f6075z;
        this.universalRequestEventSender$delegate = a.c(gVar, universalRequestJob$special$$inlined$inject$default$1);
        this.universalRequestDataSource$delegate = a.c(gVar, new UniversalRequestJob$special$$inlined$inject$default$2(this, HttpUrl.FRAGMENT_ENCODE_SET));
        this.logger$delegate = a.c(gVar, new UniversalRequestJob$special$$inlined$inject$default$3(this, HttpUrl.FRAGMENT_ENCODE_SET));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(10:5|6|7|(1:(1:(1:(3:12|13|14)(2:16|17))(5:18|19|20|21|(1:23)(2:26|27)))(1:29))(3:34|(1:36)(1:43)|(2:38|39)(3:40|(1:42)|25))|30|31|(2:33|25)|20|21|(0)(0)))|46|6|7|(0)(0)|30|31|(0)|20|21|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c6, code lost:
    
        if (r10.remove(r9, r0) == r6) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0044, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b0, code lost:
    
        r10 = he.a.b(r10);
        r1 = r1;
        r9 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r10v18, types: [com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore] */
    /* JADX WARN: Type inference failed for: r10v6, types: [com.unity3d.ads.core.data.datasource.UniversalRequestDataSource] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object doWork$suspendImpl(com.unity3d.ads.core.domain.work.UniversalRequestJob r9, le.c r10) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.work.UniversalRequestJob.doWork$suspendImpl(com.unity3d.ads.core.domain.work.UniversalRequestJob, le.c):java.lang.Object");
    }

    @Override // androidx.work.CoroutineWorker
    public Object doWork(c cVar) {
        return doWork$suspendImpl(this, cVar);
    }

    public final Logger getLogger() {
        return (Logger) this.logger$delegate.getValue();
    }

    public final RequestPolicy getRequestPolicy() {
        RequestPolicy requestPolicy = this.requestPolicy;
        if (requestPolicy != null) {
            return requestPolicy;
        }
        k.k("requestPolicy");
        throw null;
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    public final UniversalRequestDataSource getUniversalRequestDataSource() {
        return (UniversalRequestDataSource) this.universalRequestDataSource$delegate.getValue();
    }

    public final UniversalRequestEventSender getUniversalRequestEventSender() {
        return (UniversalRequestEventSender) this.universalRequestEventSender$delegate.getValue();
    }

    public final WorkerParameters getWorkerParams() {
        return this.workerParams;
    }

    public final void setRequestPolicy(RequestPolicy requestPolicy) {
        k.e(requestPolicy, "<set-?>");
        this.requestPolicy = requestPolicy;
    }
}
