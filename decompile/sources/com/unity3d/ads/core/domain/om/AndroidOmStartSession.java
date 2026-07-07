package com.unity3d.ads.core.domain.om;

import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidOmStartSession extends AndroidOmInteraction {
    private final OpenMeasurementRepository openMeasurementRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidOmStartSession(OpenMeasurementRepository openMeasurementRepository, SendDiagnosticEvent sendDiagnosticEvent) {
        k.e(openMeasurementRepository, "openMeasurementRepository");
        k.e(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.openMeasurementRepository = openMeasurementRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // com.unity3d.ads.core.domain.om.OmInteraction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(com.unity3d.ads.core.data.model.AdObject r10, org.json.JSONObject r11, le.c r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.unity3d.ads.core.domain.om.AndroidOmStartSession$invoke$1
            if (r0 == 0) goto L13
            r0 = r12
            com.unity3d.ads.core.domain.om.AndroidOmStartSession$invoke$1 r0 = (com.unity3d.ads.core.domain.om.AndroidOmStartSession$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.om.AndroidOmStartSession$invoke$1 r0 = new com.unity3d.ads.core.domain.om.AndroidOmStartSession$invoke$1
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r10 = r0.L$1
            com.unity3d.ads.core.data.model.AdObject r10 = (com.unity3d.ads.core.data.model.AdObject) r10
            java.lang.Object r11 = r0.L$0
            com.unity3d.ads.core.domain.om.AndroidOmStartSession r11 = (com.unity3d.ads.core.domain.om.AndroidOmStartSession) r11
            he.a.f(r12)
        L2c:
            r5 = r10
            goto L58
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            he.a.f(r12)
            com.unity3d.ads.core.data.repository.OpenMeasurementRepository r12 = r9.openMeasurementRepository
            com.google.protobuf.ByteString r1 = r10.getOpportunityId()
            android.webkit.WebView r3 = r9.getWebview(r10)
            com.unity3d.ads.core.data.model.OmidOptions r11 = r9.getOMidOptions(r11)
            r0.L$0 = r9
            r0.L$1 = r10
            r0.label = r2
            java.lang.Object r12 = r12.startSession(r1, r3, r11, r0)
            me.a r11 = me.a.f8833x
            if (r12 != r11) goto L56
            return r11
        L56:
            r11 = r9
            goto L2c
        L58:
            com.unity3d.ads.core.data.model.OMResult r12 = (com.unity3d.ads.core.data.model.OMResult) r12
            boolean r10 = r12 instanceof com.unity3d.ads.core.data.model.OMResult.Success
            if (r10 == 0) goto L6d
            com.unity3d.ads.core.domain.SendDiagnosticEvent r0 = r11.sendDiagnosticEvent
            r7 = 46
            r8 = 0
            java.lang.String r1 = "om_session_start_success"
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            goto La1
        L6d:
            boolean r10 = r12 instanceof com.unity3d.ads.core.data.model.OMResult.Failure
            if (r10 == 0) goto La1
            com.unity3d.ads.core.domain.SendDiagnosticEvent r0 = r11.sendDiagnosticEvent
            je.f r10 = new je.f
            r10.<init>()
            com.unity3d.ads.core.data.model.OMResult$Failure r12 = (com.unity3d.ads.core.data.model.OMResult.Failure) r12
            java.lang.String r11 = r12.getReason()
            java.lang.String r1 = "reason"
            r10.put(r1, r11)
            java.lang.String r11 = r12.getReasonDebug()
            if (r11 == 0) goto L92
            java.lang.String r11 = "reason_debug"
            java.lang.String r12 = r12.getReasonDebug()
            r10.put(r11, r12)
        L92:
            je.f r3 = r10.b()
            r7 = 42
            r8 = 0
            java.lang.String r1 = "om_session_start_failure"
            r2 = 0
            r4 = 0
            r6 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r0, r1, r2, r3, r4, r5, r6, r7, r8)
        La1:
            he.y r10 = he.y.f6101a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.om.AndroidOmStartSession.invoke(com.unity3d.ads.core.data.model.AdObject, org.json.JSONObject, le.c):java.lang.Object");
    }
}
