package com.unity3d.ads.core.domain.om;

import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidOmFinishSession implements OmFinishSession {
    private final OpenMeasurementRepository openMeasurementRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidOmFinishSession(OpenMeasurementRepository openMeasurementRepository, SendDiagnosticEvent sendDiagnosticEvent) {
        k.e(openMeasurementRepository, "openMeasurementRepository");
        k.e(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.openMeasurementRepository = openMeasurementRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // com.unity3d.ads.core.domain.om.OmFinishSession
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(com.unity3d.ads.core.data.model.AdObject r11, le.c r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.unity3d.ads.core.domain.om.AndroidOmFinishSession$invoke$1
            if (r0 == 0) goto L13
            r0 = r12
            com.unity3d.ads.core.domain.om.AndroidOmFinishSession$invoke$1 r0 = (com.unity3d.ads.core.domain.om.AndroidOmFinishSession$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.om.AndroidOmFinishSession$invoke$1 r0 = new com.unity3d.ads.core.domain.om.AndroidOmFinishSession$invoke$1
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r11 = r0.L$1
            com.unity3d.ads.core.data.model.AdObject r11 = (com.unity3d.ads.core.data.model.AdObject) r11
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.om.AndroidOmFinishSession r0 = (com.unity3d.ads.core.domain.om.AndroidOmFinishSession) r0
            he.a.f(r12)
        L2c:
            r6 = r11
            goto L50
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L36:
            he.a.f(r12)
            com.unity3d.ads.core.data.repository.OpenMeasurementRepository r12 = r10.openMeasurementRepository
            com.google.protobuf.ByteString r1 = r11.getOpportunityId()
            r0.L$0 = r10
            r0.L$1 = r11
            r0.label = r2
            java.lang.Object r12 = r12.finishSession(r1, r0)
            me.a r0 = me.a.f8833x
            if (r12 != r0) goto L4e
            return r0
        L4e:
            r0 = r10
            goto L2c
        L50:
            com.unity3d.ads.core.data.model.OMResult r12 = (com.unity3d.ads.core.data.model.OMResult) r12
            boolean r11 = r12 instanceof com.unity3d.ads.core.data.model.OMResult.Success
            if (r11 == 0) goto L65
            com.unity3d.ads.core.domain.SendDiagnosticEvent r1 = r0.sendDiagnosticEvent
            r8 = 46
            r9 = 0
            java.lang.String r2 = "om_session_finish_success"
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L99
        L65:
            boolean r11 = r12 instanceof com.unity3d.ads.core.data.model.OMResult.Failure
            if (r11 == 0) goto L99
            com.unity3d.ads.core.domain.SendDiagnosticEvent r1 = r0.sendDiagnosticEvent
            je.f r11 = new je.f
            r11.<init>()
            com.unity3d.ads.core.data.model.OMResult$Failure r12 = (com.unity3d.ads.core.data.model.OMResult.Failure) r12
            java.lang.String r0 = r12.getReason()
            java.lang.String r2 = "reason"
            r11.put(r2, r0)
            java.lang.String r0 = r12.getReasonDebug()
            if (r0 == 0) goto L8a
            java.lang.String r0 = "reason_debug"
            java.lang.String r12 = r12.getReasonDebug()
            r11.put(r0, r12)
        L8a:
            je.f r4 = r11.b()
            r8 = 42
            r9 = 0
            java.lang.String r2 = "om_session_finish_failure"
            r3 = 0
            r5 = 0
            r7 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L99:
            he.y r11 = he.y.f6101a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.om.AndroidOmFinishSession.invoke(com.unity3d.ads.core.data.model.AdObject, le.c):java.lang.Object");
    }
}
