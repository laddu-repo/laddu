package com.unity3d.ads.core.domain.om;

import android.content.Context;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidInitializeOMSDK implements InitializeOMSDK {
    private final Context context;
    private final OpenMeasurementRepository omRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    public AndroidInitializeOMSDK(Context context, SendDiagnosticEvent sendDiagnosticEvent, SessionRepository sessionRepository, OpenMeasurementRepository omRepository) {
        k.e(context, "context");
        k.e(sendDiagnosticEvent, "sendDiagnosticEvent");
        k.e(sessionRepository, "sessionRepository");
        k.e(omRepository, "omRepository");
        this.context = context;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.sessionRepository = sessionRepository;
        this.omRepository = omRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // com.unity3d.ads.core.domain.om.InitializeOMSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(le.c r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK$invoke$1
            if (r0 == 0) goto L13
            r0 = r15
            com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK$invoke$1 r0 = (com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK$invoke$1 r0 = new com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK$invoke$1
            r0.<init>(r14, r15)
        L18:
            java.lang.Object r15 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            long r1 = r0.J$0
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK r0 = (com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK) r0
            he.a.f(r15)
            goto L66
        L2b:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L33:
            he.a.f(r15)
            com.unity3d.ads.core.data.repository.SessionRepository r15 = r14.sessionRepository
            boolean r15 = r15.isOmEnabled()
            if (r15 == 0) goto Lcb
            long r3 = ef.i.b()
            com.unity3d.ads.core.domain.SendDiagnosticEvent r5 = r14.sendDiagnosticEvent
            r12 = 62
            r13 = 0
            java.lang.String r6 = "om_activate_started"
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            com.unity3d.ads.core.data.repository.OpenMeasurementRepository r15 = r14.omRepository
            android.content.Context r1 = r14.context
            r0.L$0 = r14
            r0.J$0 = r3
            r0.label = r2
            java.lang.Object r15 = r15.activateOM(r1, r0)
            me.a r0 = me.a.f8833x
            if (r15 != r0) goto L64
            return r0
        L64:
            r0 = r14
            r1 = r3
        L66:
            com.unity3d.ads.core.data.model.OMResult r15 = (com.unity3d.ads.core.data.model.OMResult) r15
            boolean r3 = r15 instanceof com.unity3d.ads.core.data.model.OMResult.Success
            if (r3 == 0) goto L89
            com.unity3d.ads.core.domain.SendDiagnosticEvent r4 = r0.sendDiagnosticEvent
            ef.k r15 = new ef.k
            r15.<init>(r1)
            double r0 = com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(r15)
            java.lang.Double r6 = new java.lang.Double
            r6.<init>(r0)
            r11 = 60
            r12 = 0
            java.lang.String r5 = "om_activate_success_time"
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto Lcb
        L89:
            boolean r3 = r15 instanceof com.unity3d.ads.core.data.model.OMResult.Failure
            if (r3 == 0) goto Lcb
            com.unity3d.ads.core.domain.SendDiagnosticEvent r4 = r0.sendDiagnosticEvent
            ef.k r0 = new ef.k
            r0.<init>(r1)
            double r0 = com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(r0)
            java.lang.Double r6 = new java.lang.Double
            r6.<init>(r0)
            je.f r0 = new je.f
            r0.<init>()
            com.unity3d.ads.core.data.model.OMResult$Failure r15 = (com.unity3d.ads.core.data.model.OMResult.Failure) r15
            java.lang.String r1 = r15.getReason()
            java.lang.String r2 = "reason"
            r0.put(r2, r1)
            java.lang.String r1 = r15.getReasonDebug()
            if (r1 == 0) goto Lbc
            java.lang.String r1 = "reason_debug"
            java.lang.String r15 = r15.getReasonDebug()
            r0.put(r1, r15)
        Lbc:
            je.f r7 = r0.b()
            r11 = 56
            r12 = 0
            java.lang.String r5 = "om_activate_failure_time"
            r8 = 0
            r9 = 0
            r10 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r4, r5, r6, r7, r8, r9, r10, r11, r12)
        Lcb:
            he.y r15 = he.y.f6101a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK.invoke(le.c):java.lang.Object");
    }
}
