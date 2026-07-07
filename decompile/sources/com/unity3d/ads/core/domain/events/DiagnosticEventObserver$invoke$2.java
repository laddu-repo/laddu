package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gf.c0;
import he.a;
import he.y;
import j1.f0;
import java.util.List;
import kf.f1;
import kf.r0;
import kf.y0;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.domain.events.DiagnosticEventObserver$invoke$2", f = "DiagnosticEventObserver.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DiagnosticEventObserver$invoke$2 extends j implements p {
    int label;
    final /* synthetic */ DiagnosticEventObserver this$0;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    @e(c = "com.unity3d.ads.core.domain.events.DiagnosticEventObserver$invoke$2$2", f = "DiagnosticEventObserver.kt", l = {45, 49, 54}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.events.DiagnosticEventObserver$invoke$2$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends j implements p {
        /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ DiagnosticEventObserver this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DiagnosticEventObserver diagnosticEventObserver, c cVar) {
            super(2, cVar);
            this.this$0 = diagnosticEventObserver;
        }

        @Override // ne.a
        public final c create(Object obj, c cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(8:1|(1:(1:(1:(3:6|7|8)(2:10|11))(6:12|13|14|15|7|8))(1:21))(1:29)|22|23|24|(4:26|15|7|8)|20|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00e6, code lost:
        
            if (r9.invoke(r2, r0, r8) == r4) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00c9, code lost:
        
            r2 = r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0064, code lost:
        
            if (r9 == r4) goto L28;
         */
        @Override // ne.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                int r0 = r8.label
                r1 = 3
                r2 = 2
                r3 = 1
                me.a r4 = me.a.f8833x
                if (r0 == 0) goto L2f
                if (r0 == r3) goto L2b
                if (r0 == r2) goto L1c
                if (r0 != r1) goto L14
                he.a.f(r9)
                goto Le9
            L14:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1c:
                java.lang.Object r0 = r8.L$1
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r2 = r8.L$0
                gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r2 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) r2
                he.a.f(r9)     // Catch: java.lang.Throwable -> L28
                goto L98
            L28:
                goto Lcb
            L2b:
                he.a.f(r9)
                goto L68
            L2f:
                he.a.f(r9)
                java.lang.Object r9 = r8.L$0
                java.util.List r9 = (java.util.List) r9
                gatewayprotocol.v1.UniversalRequestKt r0 = gatewayprotocol.v1.UniversalRequestKt.INSTANCE
                com.unity3d.ads.core.domain.events.DiagnosticEventObserver r0 = r8.this$0
                gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl$Companion r5 = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion
                gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload$Builder r6 = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder()
                java.lang.String r7 = "newBuilder()"
                kotlin.jvm.internal.k.d(r6, r7)
                gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl r5 = r5._create(r6)
                com.unity3d.ads.core.domain.events.GetDiagnosticEventBatchRequest r0 = com.unity3d.ads.core.domain.events.DiagnosticEventObserver.access$getGetDiagnosticEventBatchRequest$p(r0)
                gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventRequest r9 = r0.invoke(r9)
                r5.setDiagnosticEventRequest(r9)
                gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload r9 = r5._build()
                com.unity3d.ads.core.domain.events.DiagnosticEventObserver r0 = r8.this$0
                com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad r0 = com.unity3d.ads.core.domain.events.DiagnosticEventObserver.access$getGetUniversalRequestForPayLoad$p(r0)
                r8.label = r3
                java.lang.Object r9 = r0.invoke(r9, r8)
                if (r9 != r4) goto L68
                goto Le8
            L68:
                gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r9 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) r9
                java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> Lc9
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lc9
                java.lang.String r3 = "randomUUID().toString()"
                kotlin.jvm.internal.k.d(r0, r3)     // Catch: java.lang.Throwable -> Lc9
                com.unity3d.ads.core.domain.events.DiagnosticEventObserver r3 = r8.this$0     // Catch: java.lang.Throwable -> Lc9
                com.unity3d.ads.core.data.datasource.UniversalRequestDataSource r3 = com.unity3d.ads.core.domain.events.DiagnosticEventObserver.access$getUniversalRequestDataSource$p(r3)     // Catch: java.lang.Throwable -> Lc9
                byte[] r5 = r9.toByteArray()     // Catch: java.lang.Throwable -> Lc9
                java.lang.String r6 = "fullRequest.toByteArray()"
                kotlin.jvm.internal.k.d(r5, r6)     // Catch: java.lang.Throwable -> Lc9
                com.google.protobuf.ByteString r5 = com.google.protobuf.kotlin.ByteStringsKt.toByteString(r5)     // Catch: java.lang.Throwable -> Lc9
                r8.L$0 = r9     // Catch: java.lang.Throwable -> Lc9
                r8.L$1 = r0     // Catch: java.lang.Throwable -> Lc9
                r8.label = r2     // Catch: java.lang.Throwable -> Lc9
                java.lang.Object r2 = r3.set(r0, r5, r8)     // Catch: java.lang.Throwable -> Lc9
                if (r2 != r4) goto L97
                goto Le8
            L97:
                r2 = r9
            L98:
                com.unity3d.ads.core.domain.work.UniversalRequestWorkerData r9 = new com.unity3d.ads.core.domain.work.UniversalRequestWorkerData     // Catch: java.lang.Throwable -> L28
                r9.<init>(r0)     // Catch: java.lang.Throwable -> L28
                com.unity3d.ads.core.domain.events.DiagnosticEventObserver r0 = r8.this$0     // Catch: java.lang.Throwable -> L28
                com.unity3d.ads.core.domain.work.BackgroundWorker r0 = com.unity3d.ads.core.domain.events.DiagnosticEventObserver.access$getBackgroundWorker$p(r0)     // Catch: java.lang.Throwable -> L28
                n9.j r3 = new n9.j     // Catch: java.lang.Throwable -> L28
                java.lang.Class<com.unity3d.ads.core.domain.work.DiagnosticEventJob> r5 = com.unity3d.ads.core.domain.work.DiagnosticEventJob.class
                r3.<init>(r5)     // Catch: java.lang.Throwable -> L28
                v5.f r9 = r9.invoke()     // Catch: java.lang.Throwable -> L28
                java.lang.Object r5 = r3.f9356z     // Catch: java.lang.Throwable -> L28
                e6.i r5 = (e6.i) r5     // Catch: java.lang.Throwable -> L28
                r5.f4375e = r9     // Catch: java.lang.Throwable -> L28
                java.lang.String r9 = "UnityAdsBackgroundWorker"
                java.lang.Object r5 = r3.A     // Catch: java.lang.Throwable -> L28
                java.util.HashSet r5 = (java.util.HashSet) r5     // Catch: java.lang.Throwable -> L28
                r5.add(r9)     // Catch: java.lang.Throwable -> L28
                v5.p r9 = r3.k()     // Catch: java.lang.Throwable -> L28
                v5.u r0 = r0.getWorkManager()     // Catch: java.lang.Throwable -> L28
                r0.a(r9)     // Catch: java.lang.Throwable -> L28
                goto Le9
            Lc9:
                r2 = r9
            Lcb:
                com.unity3d.ads.core.domain.events.DiagnosticEventObserver r9 = r8.this$0
                com.unity3d.ads.core.domain.events.UniversalRequestEventSender r9 = com.unity3d.ads.core.domain.events.DiagnosticEventObserver.access$getUniversalRequestEventSender$p(r9)
                com.unity3d.ads.core.domain.events.DiagnosticEventObserver r0 = r8.this$0
                com.unity3d.ads.core.domain.GetRequestPolicy r0 = com.unity3d.ads.core.domain.events.DiagnosticEventObserver.access$getDiagnosticRequestPolicy$p(r0)
                com.unity3d.ads.gatewayclient.RequestPolicy r0 = r0.invoke()
                r3 = 0
                r8.L$0 = r3
                r8.L$1 = r3
                r8.label = r1
                java.lang.Object r9 = r9.invoke(r2, r0, r8)
                if (r9 != r4) goto Le9
            Le8:
                return r4
            Le9:
                he.y r9 = he.y.f6101a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.DiagnosticEventObserver$invoke$2.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // ve.p
        public final Object invoke(List<DiagnosticEventRequestOuterClass.DiagnosticEvent> list, c cVar) {
            return ((AnonymousClass2) create(list, cVar)).invokeSuspend(y.f6101a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticEventObserver$invoke$2(DiagnosticEventObserver diagnosticEventObserver, c cVar) {
        super(2, cVar);
        this.this$0 = diagnosticEventObserver;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new DiagnosticEventObserver$invoke$2(this.this$0, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((DiagnosticEventObserver$invoke$2) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        f1 f1Var;
        Object value;
        Boolean bool;
        DiagnosticEventRepository diagnosticEventRepository;
        c0 c0Var;
        if (this.label == 0) {
            a.f(obj);
            r0Var = this.this$0.isRunning;
            do {
                f1Var = (f1) r0Var;
                value = f1Var.getValue();
                bool = (Boolean) value;
                bool.getClass();
            } while (!f1Var.f(value, Boolean.TRUE));
            boolean booleanValue = bool.booleanValue();
            y yVar = y.f6101a;
            if (!booleanValue) {
                diagnosticEventRepository = this.this$0.diagnosticEventRepository;
                f0 f0Var = new f0(6, diagnosticEventRepository.getDiagnosticEvents(), new AnonymousClass2(this.this$0, null));
                c0Var = this.this$0.scope;
                y0.p(f0Var, c0Var);
                return yVar;
            }
            return yVar;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
