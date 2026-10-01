package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.AdPlayerScope;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidHandleGatewayAdResponse implements HandleGatewayAdResponse {
    private final AdPlayerScope adPlayerScope;
    private final AdRepository adRepository;
    private final CacheWebViewAssets cacheWebViewAssets;
    private final CampaignRepository campaignRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetAdPlayer getAdPlayer;
    private final HandleInvocationsFromAdViewer getHandleInvocationsFromAdViewer;
    private final GetLatestWebViewConfiguration getLatestWebViewConfiguration;
    private final GetOperativeEventApi getOperativeEventApi;
    private final GetWebViewBridgeUseCase getWebViewBridge;
    private final AndroidGetWebViewContainerUseCase getWebViewContainerUseCase;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidHandleGatewayAdResponse(AdRepository adRepository, AndroidGetWebViewContainerUseCase getWebViewContainerUseCase, GetWebViewBridgeUseCase getWebViewBridge, DeviceInfoRepository deviceInfoRepository, HandleInvocationsFromAdViewer getHandleInvocationsFromAdViewer, CampaignRepository campaignRepository, SendDiagnosticEvent sendDiagnosticEvent, GetOperativeEventApi getOperativeEventApi, GetLatestWebViewConfiguration getLatestWebViewConfiguration, AdPlayerScope adPlayerScope, GetAdPlayer getAdPlayer, CacheWebViewAssets cacheWebViewAssets) {
        k.e(adRepository, "adRepository");
        k.e(getWebViewContainerUseCase, "getWebViewContainerUseCase");
        k.e(getWebViewBridge, "getWebViewBridge");
        k.e(deviceInfoRepository, "deviceInfoRepository");
        k.e(getHandleInvocationsFromAdViewer, "getHandleInvocationsFromAdViewer");
        k.e(campaignRepository, "campaignRepository");
        k.e(sendDiagnosticEvent, "sendDiagnosticEvent");
        k.e(getOperativeEventApi, "getOperativeEventApi");
        k.e(getLatestWebViewConfiguration, "getLatestWebViewConfiguration");
        k.e(adPlayerScope, "adPlayerScope");
        k.e(getAdPlayer, "getAdPlayer");
        k.e(cacheWebViewAssets, "cacheWebViewAssets");
        this.adRepository = adRepository;
        this.getWebViewContainerUseCase = getWebViewContainerUseCase;
        this.getWebViewBridge = getWebViewBridge;
        this.deviceInfoRepository = deviceInfoRepository;
        this.getHandleInvocationsFromAdViewer = getHandleInvocationsFromAdViewer;
        this.campaignRepository = campaignRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getOperativeEventApi = getOperativeEventApi;
        this.getLatestWebViewConfiguration = getLatestWebViewConfiguration;
        this.adPlayerScope = adPlayerScope;
        this.getAdPlayer = getAdPlayer;
        this.cacheWebViewAssets = cacheWebViewAssets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009e, code lost:
    
        if (com.unity3d.ads.core.domain.events.GetOperativeEventApi.invoke$default(r2, r4, r18, r6, r7, null, null, r10, 48, null) == r15) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object cleanup(java.lang.Throwable r17, com.google.protobuf.ByteString r18, gatewayprotocol.v1.AdResponseOuterClass.AdResponse r19, com.unity3d.ads.adplayer.AdPlayer r20, le.c r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r21
            boolean r2 = r1 instanceof com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$cleanup$1
            if (r2 == 0) goto L18
            r2 = r1
            com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$cleanup$1 r2 = (com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$cleanup$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.label = r3
        L16:
            r10 = r2
            goto L1e
        L18:
            com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$cleanup$1 r2 = new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$cleanup$1
            r2.<init>(r0, r1)
            goto L16
        L1e:
            java.lang.Object r1 = r10.result
            int r2 = r10.label
            he.y r13 = he.y.f6101a
            r14 = 2
            r3 = 1
            me.a r15 = me.a.f8833x
            if (r2 == 0) goto L44
            if (r2 == r3) goto L3b
            if (r2 != r14) goto L33
            he.a.f(r1)
            goto Laf
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3b:
            java.lang.Object r2 = r10.L$0
            com.unity3d.ads.adplayer.AdPlayer r2 = (com.unity3d.ads.adplayer.AdPlayer) r2
            he.a.f(r1)
            r1 = r2
            goto La1
        L44:
            he.a.f(r1)
            gatewayprotocol.v1.OperativeEventErrorDataKt$Dsl$Companion r1 = gatewayprotocol.v1.OperativeEventErrorDataKt.Dsl.Companion
            gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData$Builder r2 = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.newBuilder()
            java.lang.String r4 = "newBuilder()"
            kotlin.jvm.internal.k.d(r2, r4)
            gatewayprotocol.v1.OperativeEventErrorDataKt$Dsl r1 = r1._create(r2)
            gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType r2 = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED
            r1.setErrorType(r2)
            java.lang.Throwable r2 = r17.getCause()
            if (r2 == 0) goto L67
            java.lang.String r2 = r2.getMessage()
            if (r2 != 0) goto L6f
        L67:
            java.lang.String r2 = r17.getMessage()
            if (r2 != 0) goto L6f
            java.lang.String r2 = ""
        L6f:
            r1.setMessage(r2)
            gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData r1 = r1._build()
            com.unity3d.ads.core.domain.events.GetOperativeEventApi r2 = r0.getOperativeEventApi
            gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType r4 = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_LOAD_ERROR
            com.google.protobuf.ByteString r6 = r19.getTrackingToken()
            java.lang.String r5 = "response.trackingToken"
            kotlin.jvm.internal.k.d(r6, r5)
            com.google.protobuf.ByteString r7 = r1.toByteString()
            java.lang.String r1 = "operativeEventErrorData.toByteString()"
            kotlin.jvm.internal.k.d(r7, r1)
            r1 = r20
            r10.L$0 = r1
            r10.label = r3
            r8 = 0
            r9 = 0
            r11 = 48
            r12 = 0
            r5 = r18
            r3 = r2
            java.lang.Object r2 = com.unity3d.ads.core.domain.events.GetOperativeEventApi.invoke$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r2 != r15) goto La1
            goto Lae
        La1:
            if (r1 == 0) goto Laf
            r2 = 0
            r10.L$0 = r2
            r10.label = r14
            java.lang.Object r1 = r1.destroy(r10)
            if (r1 != r15) goto Laf
        Lae:
            return r15
        Laf:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.cleanup(java.lang.Throwable, com.google.protobuf.ByteString, gatewayprotocol.v1.AdResponseOuterClass$AdResponse, com.unity3d.ads.adplayer.AdPlayer, le.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(5:5|6|7|8|9))|196|6|7|8|9|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x013c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x008e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x008f, code lost:
    
        r17 = r0;
        r20 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x04c7, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x05b1, code lost:
    
        if (gf.f0.J(r0, r15, r9) != r14) goto L164;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0026. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0259 A[Catch: CancellationException -> 0x008e, TryCatch #16 {CancellationException -> 0x008e, blocks: (B:33:0x0083, B:108:0x024f, B:110:0x0259, B:112:0x026f, B:116:0x0285, B:119:0x028e, B:122:0x02a7, B:137:0x0557, B:118:0x0289), top: B:8:0x0026, inners: #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x026f A[Catch: CancellationException -> 0x008e, TryCatch #16 {CancellationException -> 0x008e, blocks: (B:33:0x0083, B:108:0x024f, B:110:0x0259, B:112:0x026f, B:116:0x0285, B:119:0x028e, B:122:0x02a7, B:137:0x0557, B:118:0x0289), top: B:8:0x0026, inners: #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0453 A[Catch: CancellationException -> 0x04e1, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x04e1, blocks: (B:37:0x044d, B:39:0x0453, B:42:0x045c, B:45:0x0473), top: B:36:0x044d }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x04f6 A[Catch: CancellationException -> 0x04c7, TryCatch #17 {CancellationException -> 0x04c7, blocks: (B:23:0x04ab, B:50:0x048f, B:62:0x04f6, B:64:0x0533, B:66:0x054c, B:68:0x0539, B:70:0x053f, B:72:0x0547), top: B:8:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x032c  */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v35, types: [int] */
    /* JADX WARN: Type inference failed for: r4v36, types: [int] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    @Override // com.unity3d.ads.core.domain.HandleGatewayAdResponse
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(com.unity3d.ads.UnityAdsLoadOptions r50, com.google.protobuf.ByteString r51, gatewayprotocol.v1.AdResponseOuterClass.AdResponse r52, android.content.Context r53, java.lang.String r54, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType r55, boolean r56, le.c r57) {
        /*
            Method dump skipped, instructions count: 1488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.invoke(com.unity3d.ads.UnityAdsLoadOptions, com.google.protobuf.ByteString, gatewayprotocol.v1.AdResponseOuterClass$AdResponse, android.content.Context, java.lang.String, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType, boolean, le.c):java.lang.Object");
    }
}
