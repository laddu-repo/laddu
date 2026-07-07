package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.domain.task.InitializeStateReset;
import gf.c0;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2", f = "InitializeStateReset.kt", l = {41}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class InitializeStateReset$doWork$2 extends j implements p {
    final /* synthetic */ InitializeStateReset.Params $params;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ InitializeStateReset this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateReset$doWork$2(InitializeStateReset.Params params, InitializeStateReset initializeStateReset, c cVar) {
        super(2, cVar);
        this.$params = params;
        this.this$0 = initializeStateReset;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new InitializeStateReset$doWork$2(this.$params, this.this$0, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((InitializeStateReset$doWork$2) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007d A[Catch: all -> 0x0014, CancellationException -> 0x0017, TryCatch #2 {CancellationException -> 0x0017, all -> 0x0014, blocks: (B:6:0x0010, B:7:0x0060, B:10:0x006e, B:12:0x007d, B:14:0x0083, B:16:0x0091, B:17:0x0093, B:19:0x0096, B:21:0x00a2, B:23:0x00a9, B:26:0x00ac, B:35:0x00b1, B:36:0x00b8, B:37:0x00b9, B:38:0x00c0, B:39:0x0066, B:40:0x006d, B:44:0x0029, B:46:0x0034, B:48:0x0039, B:50:0x0041), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9 A[Catch: all -> 0x0014, CancellationException -> 0x0017, TryCatch #2 {CancellationException -> 0x0017, all -> 0x0014, blocks: (B:6:0x0010, B:7:0x0060, B:10:0x006e, B:12:0x007d, B:14:0x0083, B:16:0x0091, B:17:0x0093, B:19:0x0096, B:21:0x00a2, B:23:0x00a9, B:26:0x00ac, B:35:0x00b1, B:36:0x00b8, B:37:0x00b9, B:38:0x00c0, B:39:0x0066, B:40:0x006d, B:44:0x0029, B:46:0x0034, B:48:0x0039, B:50:0x0041), top: B:2:0x0004 }] */
    @Override // ne.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.label
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L22
            if (r0 != r1) goto L1a
            java.lang.Object r0 = r8.L$1
            com.unity3d.services.core.domain.task.InitializeStateReset r0 = (com.unity3d.services.core.domain.task.InitializeStateReset) r0
            java.lang.Object r1 = r8.L$0
            com.unity3d.services.core.domain.task.InitializeStateReset$Params r1 = (com.unity3d.services.core.domain.task.InitializeStateReset.Params) r1
            he.a.f(r9)     // Catch: java.lang.Throwable -> L14 java.util.concurrent.CancellationException -> L17
            goto L60
        L14:
            r9 = move-exception
            goto Lc1
        L17:
            r9 = move-exception
            goto Lda
        L1a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L22:
            he.a.f(r9)
            com.unity3d.services.core.domain.task.InitializeStateReset$Params r9 = r8.$params
            com.unity3d.services.core.domain.task.InitializeStateReset r0 = r8.this$0
            java.lang.String r3 = "Unity Ads init: starting init"
            com.unity3d.services.core.log.DeviceLog.debug(r3)     // Catch: java.lang.Throwable -> L14 java.util.concurrent.CancellationException -> L17
            com.unity3d.services.core.webview.WebViewApp r3 = com.unity3d.services.core.webview.WebViewApp.getCurrentApp()     // Catch: java.lang.Throwable -> L14 java.util.concurrent.CancellationException -> L17
            if (r3 == 0) goto L37
            r3.resetWebViewAppInitialization()     // Catch: java.lang.Throwable -> L14 java.util.concurrent.CancellationException -> L17
        L37:
            if (r3 == 0) goto L3e
            com.unity3d.services.core.webview.WebView r4 = r3.getWebView()     // Catch: java.lang.Throwable -> L14 java.util.concurrent.CancellationException -> L17
            goto L3f
        L3e:
            r4 = r2
        L3f:
            if (r4 == 0) goto L6e
            com.unity3d.services.core.configuration.Configuration r4 = r9.getConfig()     // Catch: java.lang.Throwable -> L14 java.util.concurrent.CancellationException -> L17
            long r4 = r4.getWebViewAppCreateTimeout()     // Catch: java.lang.Throwable -> L14 java.util.concurrent.CancellationException -> L17
            com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2$1$success$1 r6 = new com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2$1$success$1     // Catch: java.lang.Throwable -> L14 java.util.concurrent.CancellationException -> L17
            r6.<init>(r0, r3, r2)     // Catch: java.lang.Throwable -> L14 java.util.concurrent.CancellationException -> L17
            r8.L$0 = r9     // Catch: java.lang.Throwable -> L14 java.util.concurrent.CancellationException -> L17
            r8.L$1 = r0     // Catch: java.lang.Throwable -> L14 java.util.concurrent.CancellationException -> L17
            r8.label = r1     // Catch: java.lang.Throwable -> L14 java.util.concurrent.CancellationException -> L17
            java.lang.Object r1 = gf.f0.L(r4, r6, r8)     // Catch: java.lang.Throwable -> L14 java.util.concurrent.CancellationException -> L17
            me.a r3 = me.a.f8833x
            if (r1 != r3) goto L5d
            return r3
        L5d:
            r7 = r1
            r1 = r9
            r9 = r7
        L60:
            he.y r9 = (he.y) r9     // Catch: java.lang.Throwable -> L14 java.util.concurrent.CancellationException -> L17
            if (r9 == 0) goto L66
            r9 = r1
            goto L6e
        L66:
            java.lang.Exception r9 = new java.lang.Exception     // Catch: java.lang.Throwable -> L14 java.util.concurrent.CancellationException -> L17
            java.lang.String r0 = "Reset failed on opening ConditionVariable"
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L14 java.util.concurrent.CancellationException -> L17
            throw r9     // Catch: java.lang.Throwable -> L14 java.util.concurrent.CancellationException -> L17
        L6e:
            com.unity3d.services.core.domain.task.InitializeStateReset.access$unregisterLifecycleCallbacks(r0)     // Catch: java.lang.Throwable -> L14 java.util.concurrent.CancellationException -> L17
            com.unity3d.services.core.properties.SdkProperties.setCacheDirectory(r2)     // Catch: java.lang.Throwable -> L14 java.util.concurrent.CancellationException -> L17
            com.unity3d.services.core.properties.SdkProperties.setWebViewCacheDirectory(r2)     // Catch: java.lang.Throwable -> L14 java.util.concurrent.CancellationException -> L17
            java.io.File r0 = com.unity3d.services.core.properties.SdkProperties.getCacheDirectory()     // Catch: java.lang.Throwable -> L14 java.util.concurrent.CancellationException -> L17
            if (r0 == 0) goto Lb9
            java.io.File r0 = com.unity3d.services.core.properties.SdkProperties.getWebViewCacheDirectory()     // Catch: java.lang.Throwable -> L14 java.util.concurrent.CancellationException -> L17
            if (r0 == 0) goto Lb1
            r0 = 0
            com.unity3d.services.core.properties.SdkProperties.setInitialized(r0)     // Catch: java.lang.Throwable -> L14 java.util.concurrent.CancellationException -> L17
            com.unity3d.services.core.configuration.Configuration r1 = r9.getConfig()     // Catch: java.lang.Throwable -> L14 java.util.concurrent.CancellationException -> L17
            java.lang.Class[] r1 = r1.getModuleConfigurationList()     // Catch: java.lang.Throwable -> L14 java.util.concurrent.CancellationException -> L17
            if (r1 != 0) goto L93
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L14 java.util.concurrent.CancellationException -> L17
        L93:
            int r2 = r1.length     // Catch: java.lang.Throwable -> L14 java.util.concurrent.CancellationException -> L17
        L94:
            if (r0 >= r2) goto Lac
            r3 = r1[r0]     // Catch: java.lang.Throwable -> L14 java.util.concurrent.CancellationException -> L17
            com.unity3d.services.core.configuration.Configuration r4 = r9.getConfig()     // Catch: java.lang.Throwable -> L14 java.util.concurrent.CancellationException -> L17
            com.unity3d.services.core.configuration.IModuleConfiguration r3 = r4.getModuleConfiguration(r3)     // Catch: java.lang.Throwable -> L14 java.util.concurrent.CancellationException -> L17
            if (r3 == 0) goto La9
            com.unity3d.services.core.configuration.Configuration r4 = r9.getConfig()     // Catch: java.lang.Throwable -> L14 java.util.concurrent.CancellationException -> L17
            r3.resetState(r4)     // Catch: java.lang.Throwable -> L14 java.util.concurrent.CancellationException -> L17
        La9:
            int r0 = r0 + 1
            goto L94
        Lac:
            com.unity3d.services.core.configuration.Configuration r9 = r9.getConfig()     // Catch: java.lang.Throwable -> L14 java.util.concurrent.CancellationException -> L17
            goto Lc5
        Lb1:
            java.lang.Exception r9 = new java.lang.Exception     // Catch: java.lang.Throwable -> L14 java.util.concurrent.CancellationException -> L17
            java.lang.String r0 = "WebView cache directory is NULL"
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L14 java.util.concurrent.CancellationException -> L17
            throw r9     // Catch: java.lang.Throwable -> L14 java.util.concurrent.CancellationException -> L17
        Lb9:
            java.lang.Exception r9 = new java.lang.Exception     // Catch: java.lang.Throwable -> L14 java.util.concurrent.CancellationException -> L17
            java.lang.String r0 = "Cache directory is NULL"
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L14 java.util.concurrent.CancellationException -> L17
            throw r9     // Catch: java.lang.Throwable -> L14 java.util.concurrent.CancellationException -> L17
        Lc1:
            he.j r9 = he.a.b(r9)
        Lc5:
            boolean r0 = r9 instanceof he.j
            if (r0 != 0) goto Lca
            goto Ld4
        Lca:
            java.lang.Throwable r0 = he.k.a(r9)
            if (r0 == 0) goto Ld4
            he.j r9 = he.a.b(r0)
        Ld4:
            he.k r0 = new he.k
            r0.<init>(r9)
            return r0
        Lda:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
