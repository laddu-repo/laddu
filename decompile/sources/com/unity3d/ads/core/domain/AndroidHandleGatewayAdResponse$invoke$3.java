package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.core.data.model.AdObject;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$3", f = "AndroidHandleGatewayAdResponse.kt", l = {175}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidHandleGatewayAdResponse$invoke$3 extends j implements l {
    final /* synthetic */ AdObject $tmpAdObject;
    final /* synthetic */ String $webViewUrl;
    final /* synthetic */ AndroidWebViewContainer $webviewContainer;
    long J$0;
    int label;
    final /* synthetic */ AndroidHandleGatewayAdResponse this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHandleGatewayAdResponse$invoke$3(AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse, AndroidWebViewContainer androidWebViewContainer, String str, AdObject adObject, c cVar) {
        super(1, cVar);
        this.this$0 = androidHandleGatewayAdResponse;
        this.$webviewContainer = androidWebViewContainer;
        this.$webViewUrl = str;
        this.$tmpAdObject = adObject;
    }

    @Override // ne.a
    public final c create(c cVar) {
        return new AndroidHandleGatewayAdResponse$invoke$3(this.this$0, this.$webviewContainer, this.$webViewUrl, this.$tmpAdObject, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    @Override // ne.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.label
            he.y r1 = he.y.f6101a
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 != r2) goto L12
            long r2 = r13.J$0
            he.a.f(r14)     // Catch: java.lang.Throwable -> Lf
            goto L33
        Lf:
            r0 = move-exception
            r14 = r0
            goto L38
        L12:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1a:
            he.a.f(r14)
            com.unity3d.ads.adplayer.AndroidWebViewContainer r14 = r13.$webviewContainer
            java.lang.String r0 = r13.$webViewUrl
            long r3 = ef.i.b()
            r13.J$0 = r3     // Catch: java.lang.Throwable -> L35
            r13.label = r2     // Catch: java.lang.Throwable -> L35
            java.lang.Object r14 = r14.loadUrl(r0, r13)     // Catch: java.lang.Throwable -> L35
            me.a r0 = me.a.f8833x
            if (r14 != r0) goto L32
            return r0
        L32:
            r2 = r3
        L33:
            r14 = r1
            goto L3c
        L35:
            r0 = move-exception
            r14 = r0
            r2 = r3
        L38:
            he.j r14 = he.a.b(r14)
        L3c:
            long r2 = ef.k.a(r2)
            com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse r0 = r13.this$0
            com.unity3d.ads.core.data.model.AdObject r9 = r13.$tmpAdObject
            com.unity3d.ads.core.domain.SendDiagnosticEvent r4 = com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.access$getSendDiagnosticEvent$p(r0)
            boolean r0 = r14 instanceof he.j
            if (r0 != 0) goto L50
            java.lang.String r0 = "native_load_file_task_success_time"
        L4e:
            r5 = r0
            goto L53
        L50:
            java.lang.String r0 = "native_load_file_task_failure_time"
            goto L4e
        L53:
            ef.c r0 = ef.c.MILLISECONDS
            double r2 = ef.a.g(r2, r0)
            java.lang.Double r6 = new java.lang.Double
            r6.<init>(r2)
            r11 = 44
            r12 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            he.a.f(r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // ve.l
    public final Object invoke(c cVar) {
        return ((AndroidHandleGatewayAdResponse$invoke$3) create(cVar)).invokeSuspend(y.f6101a);
    }
}
