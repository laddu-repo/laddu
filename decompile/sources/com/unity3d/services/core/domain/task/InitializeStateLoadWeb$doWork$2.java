package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.domain.task.InitializeStateLoadWeb;
import gf.c0;
import he.y;
import le.c;
import ne.e;
import ne.j;
import okhttp3.internal.ws.WebSocketProtocol;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2", f = "InitializeStateLoadWeb.kt", l = {46, WebSocketProtocol.B0_FLAG_RSV1, 71}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class InitializeStateLoadWeb$doWork$2 extends j implements p {
    final /* synthetic */ InitializeStateLoadWeb.Params $params;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ InitializeStateLoadWeb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateLoadWeb$doWork$2(InitializeStateLoadWeb.Params params, InitializeStateLoadWeb initializeStateLoadWeb, c cVar) {
        super(2, cVar);
        this.$params = params;
        this.this$0 = initializeStateLoadWeb;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        InitializeStateLoadWeb$doWork$2 initializeStateLoadWeb$doWork$2 = new InitializeStateLoadWeb$doWork$2(this.$params, this.this$0, cVar);
        initializeStateLoadWeb$doWork$2.L$0 = obj;
        return initializeStateLoadWeb$doWork$2;
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((InitializeStateLoadWeb$doWork$2) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x01af, code lost:
    
        com.unity3d.services.core.misc.Utilities.writeFile(new java.io.File(com.unity3d.services.core.properties.SdkProperties.getLocalWebViewFile()), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x015e, code lost:
    
        if (r1 == r11) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0142 A[Catch: all -> 0x001f, CancellationException -> 0x0022, TryCatch #5 {CancellationException -> 0x0022, all -> 0x001f, blocks: (B:8:0x0018, B:10:0x0161, B:11:0x0185, B:13:0x018f, B:16:0x019a, B:17:0x01ac, B:20:0x01af, B:21:0x01bb, B:35:0x013e, B:37:0x0142, B:40:0x0165, B:41:0x0177, B:67:0x0139, B:48:0x010f, B:53:0x0178, B:56:0x010b, B:58:0x0072), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0165 A[Catch: all -> 0x001f, CancellationException -> 0x0022, TryCatch #5 {CancellationException -> 0x0022, all -> 0x001f, blocks: (B:8:0x0018, B:10:0x0161, B:11:0x0185, B:13:0x018f, B:16:0x019a, B:17:0x01ac, B:20:0x01af, B:21:0x01bb, B:35:0x013e, B:37:0x0142, B:40:0x0165, B:41:0x0177, B:67:0x0139, B:48:0x010f, B:53:0x0178, B:56:0x010b, B:58:0x0072), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0113 A[Catch: all -> 0x0047, TRY_ENTER, TryCatch #3 {all -> 0x0047, blocks: (B:32:0x003c, B:33:0x0132, B:50:0x0113), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0178 A[Catch: all -> 0x001f, CancellationException -> 0x0022, TryCatch #5 {CancellationException -> 0x0022, all -> 0x001f, blocks: (B:8:0x0018, B:10:0x0161, B:11:0x0185, B:13:0x018f, B:16:0x019a, B:17:0x01ac, B:20:0x01af, B:21:0x01bb, B:35:0x013e, B:37:0x0142, B:40:0x0165, B:41:0x0177, B:67:0x0139, B:48:0x010f, B:53:0x0178, B:56:0x010b, B:58:0x0072), top: B:2:0x000c }] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.unity3d.services.core.network.model.HttpRequest] */
    /* JADX WARN: Type inference failed for: r1v26, types: [com.unity3d.services.core.network.model.HttpRequest] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    @Override // ne.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
