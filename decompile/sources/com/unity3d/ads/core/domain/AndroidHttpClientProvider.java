package com.unity3d.ads.core.domain;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.configuration.MediationTraitsMetadataReader;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.core.CronetClient;
import com.unity3d.services.core.network.core.CronetEngineBuilderFactory;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.core.OkHttp3Client;
import gf.f0;
import gf.j;
import he.i;
import ie.w;
import kotlin.jvm.internal.k;
import le.c;
import okhttp3.OkHttpClient;
import org.chromium.net.CronetEngine;
import qf.d;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidHttpClientProvider implements HttpClientProvider {
    private final AlternativeFlowReader alternativeFlowReader;
    private HttpClient cachedClient;
    private final Context context;
    private final CronetEngineBuilderFactory cronetEngineBuilderFactory;
    private final ISDKDispatchers dispatchers;
    private final MediationTraitsMetadataReader mediationTraitsMetadataReader;
    private final qf.a mutex;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidHttpClientProvider(AlternativeFlowReader alternativeFlowReader, ISDKDispatchers dispatchers, SendDiagnosticEvent sendDiagnosticEvent, Context context, CronetEngineBuilderFactory cronetEngineBuilderFactory, MediationTraitsMetadataReader mediationTraitsMetadataReader) {
        k.e(alternativeFlowReader, "alternativeFlowReader");
        k.e(dispatchers, "dispatchers");
        k.e(sendDiagnosticEvent, "sendDiagnosticEvent");
        k.e(context, "context");
        k.e(cronetEngineBuilderFactory, "cronetEngineBuilderFactory");
        k.e(mediationTraitsMetadataReader, "mediationTraitsMetadataReader");
        this.alternativeFlowReader = alternativeFlowReader;
        this.dispatchers = dispatchers;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.context = context;
        this.cronetEngineBuilderFactory = cronetEngineBuilderFactory;
        this.mediationTraitsMetadataReader = mediationTraitsMetadataReader;
        this.mutex = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object buildNetworkClient(final Context context, final ISDKDispatchers iSDKDispatchers, final HttpClientSelection httpClientSelection, c cVar) {
        final gf.k kVar = new gf.k(1, a8.c.i(cVar));
        kVar.s();
        o9.a.a(context).i(f0.f(iSDKDispatchers.getIo()), new s9.c() { // from class: com.unity3d.ads.core.domain.AndroidHttpClientProvider$buildNetworkClient$2$1
            @Override // s9.c
            public final void onComplete(Task it) {
                SendDiagnosticEvent sendDiagnosticEvent;
                CronetEngineBuilderFactory cronetEngineBuilderFactory;
                SendDiagnosticEvent sendDiagnosticEvent2;
                String message;
                k.e(it, "it");
                String str = "Errored without message.";
                if (it.h()) {
                    try {
                        cronetEngineBuilderFactory = AndroidHttpClientProvider.this.cronetEngineBuilderFactory;
                        CronetEngine.Builder createCronetEngineBuilder = cronetEngineBuilderFactory.createCronetEngineBuilder(context);
                        if (httpClientSelection == HttpClientSelection.CRONET_WITH_QUIC) {
                            createCronetEngineBuilder.enableQuic(true);
                            createCronetEngineBuilder.addQuicHint(ServiceProvider.GATEWAY_HOST, 443, 443);
                            createCronetEngineBuilder.addQuicHint(ServiceProvider.CDN_CREATIVES_HOST, 443, 443);
                        }
                        CronetEngine cronetEngine = createCronetEngineBuilder.build();
                        j jVar = kVar;
                        k.d(cronetEngine, "cronetEngine");
                        jVar.resumeWith(new CronetClient(cronetEngine, iSDKDispatchers));
                        return;
                    } catch (Throwable th) {
                        sendDiagnosticEvent = AndroidHttpClientProvider.this.sendDiagnosticEvent;
                        String message2 = th.getMessage();
                        if (message2 != null) {
                            str = message2;
                        }
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_cronet_engine_error", null, w.x(new i("reason", str)), null, null, null, 58, null);
                        kVar.resumeWith(AndroidHttpClientProvider.this.getOkHttp3Client());
                        return;
                    }
                }
                sendDiagnosticEvent2 = AndroidHttpClientProvider.this.sendDiagnosticEvent;
                Exception e10 = it.e();
                if (e10 != null && (message = e10.getMessage()) != null) {
                    str = message;
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, "native_cronet_install_error", null, w.x(new i("reason", str)), null, null, null, 58, null);
                kVar.resumeWith(AndroidHttpClientProvider.this.getOkHttp3Client());
            }
        });
        return kVar.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0074, code lost:
    
        if (r0 == null) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object createHttpClient(le.c r14) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHttpClientProvider.createHttpClient(le.c):java.lang.Object");
    }

    public final OkHttp3Client getOkHttp3Client() {
        return new OkHttp3Client(this.dispatchers, new OkHttpClient());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065 A[Catch: all -> 0x0033, TRY_ENTER, TryCatch #0 {all -> 0x0033, blocks: (B:12:0x002f, B:13:0x0073, B:21:0x005d, B:25:0x0065), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [qf.a] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v5, types: [qf.a] */
    @Override // com.unity3d.ads.core.domain.HttpClientProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(le.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$1 r0 = (com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$1 r0 = new com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            r4 = 0
            me.a r5 = me.a.f8833x
            if (r1 == 0) goto L49
            if (r1 == r3) goto L3d
            if (r1 != r2) goto L35
            java.lang.Object r1 = r0.L$1
            qf.a r1 = (qf.a) r1
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.AndroidHttpClientProvider r0 = (com.unity3d.ads.core.domain.AndroidHttpClientProvider) r0
            he.a.f(r7)     // Catch: java.lang.Throwable -> L33
            goto L73
        L33:
            r7 = move-exception
            goto L7b
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3d:
            java.lang.Object r1 = r0.L$1
            qf.a r1 = (qf.a) r1
            java.lang.Object r3 = r0.L$0
            com.unity3d.ads.core.domain.AndroidHttpClientProvider r3 = (com.unity3d.ads.core.domain.AndroidHttpClientProvider) r3
            he.a.f(r7)
            goto L5d
        L49:
            he.a.f(r7)
            qf.a r7 = r6.mutex
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r1 = r7.d(r0)
            if (r1 != r5) goto L5b
            goto L71
        L5b:
            r3 = r6
            r1 = r7
        L5d:
            com.unity3d.services.core.network.core.HttpClient r7 = r3.cachedClient     // Catch: java.lang.Throwable -> L33
            if (r7 == 0) goto L65
            r1.f(r4)
            return r7
        L65:
            r0.L$0 = r3     // Catch: java.lang.Throwable -> L33
            r0.L$1 = r1     // Catch: java.lang.Throwable -> L33
            r0.label = r2     // Catch: java.lang.Throwable -> L33
            java.lang.Object r7 = r3.createHttpClient(r0)     // Catch: java.lang.Throwable -> L33
            if (r7 != r5) goto L72
        L71:
            return r5
        L72:
            r0 = r3
        L73:
            com.unity3d.services.core.network.core.HttpClient r7 = (com.unity3d.services.core.network.core.HttpClient) r7     // Catch: java.lang.Throwable -> L33
            r0.cachedClient = r7     // Catch: java.lang.Throwable -> L33
            r1.f(r4)
            return r7
        L7b:
            r1.f(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHttpClientProvider.invoke(le.c):java.lang.Object");
    }
}
