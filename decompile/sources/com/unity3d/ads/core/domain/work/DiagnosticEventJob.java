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
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class DiagnosticEventJob extends UniversalRequestJob implements IServiceComponent {
    private final f diagnosticEventRequestWorkModifier$delegate;
    private final f getDiagnosticRequestPolicy$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticEventJob(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        k.e(context, "context");
        k.e(workerParams, "workerParams");
        DiagnosticEventJob$special$$inlined$inject$default$1 diagnosticEventJob$special$$inlined$inject$default$1 = new DiagnosticEventJob$special$$inlined$inject$default$1(this, ServiceProvider.NAMED_OTHER_REQ);
        g gVar = g.f6075z;
        this.getDiagnosticRequestPolicy$delegate = a.c(gVar, diagnosticEventJob$special$$inlined$inject$default$1);
        this.diagnosticEventRequestWorkModifier$delegate = a.c(gVar, new DiagnosticEventJob$special$$inlined$inject$default$2(this, HttpUrl.FRAGMENT_ENCODE_SET));
    }

    private final DiagnosticEventRequestWorkModifier getDiagnosticEventRequestWorkModifier() {
        return (DiagnosticEventRequestWorkModifier) this.diagnosticEventRequestWorkModifier$delegate.getValue();
    }

    private final GetRequestPolicy getGetDiagnosticRequestPolicy() {
        return (GetRequestPolicy) this.getDiagnosticRequestPolicy$delegate.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.unity3d.ads.core.domain.work.UniversalRequestJob, androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object doWork(le.c r10) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.work.DiagnosticEventJob.doWork(le.c):java.lang.Object");
    }
}
