package com.unity3d.ads.core.domain.events;

import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class EventObservers {
    private final DiagnosticEventObserver diagnosticEventObserver;
    private final OperativeEventObserver operativeEventObserver;
    private final TransactionEventObserver transactionEventObserver;

    public EventObservers(OperativeEventObserver operativeEventObserver, DiagnosticEventObserver diagnosticEventObserver, TransactionEventObserver transactionEventObserver) {
        k.e(operativeEventObserver, "operativeEventObserver");
        k.e(diagnosticEventObserver, "diagnosticEventObserver");
        k.e(transactionEventObserver, "transactionEventObserver");
        this.operativeEventObserver = operativeEventObserver;
        this.diagnosticEventObserver = diagnosticEventObserver;
        this.transactionEventObserver = transactionEventObserver;
    }

    public final DiagnosticEventObserver getDiagnosticEventObserver() {
        return this.diagnosticEventObserver;
    }

    public final OperativeEventObserver getOperativeEventObserver() {
        return this.operativeEventObserver;
    }

    public final TransactionEventObserver getTransactionEventObserver() {
        return this.transactionEventObserver;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(le.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.unity3d.ads.core.domain.events.EventObservers$invoke$1
            if (r0 == 0) goto L13
            r0 = r6
            com.unity3d.ads.core.domain.events.EventObservers$invoke$1 r0 = (com.unity3d.ads.core.domain.events.EventObservers$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.events.EventObservers$invoke$1 r0 = new com.unity3d.ads.core.domain.events.EventObservers$invoke$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            me.a r4 = me.a.f8833x
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.events.EventObservers r0 = (com.unity3d.ads.core.domain.events.EventObservers) r0
            he.a.f(r6)
            goto L5d
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            java.lang.Object r1 = r0.L$0
            com.unity3d.ads.core.domain.events.EventObservers r1 = (com.unity3d.ads.core.domain.events.EventObservers) r1
            he.a.f(r6)
            goto L4f
        L3e:
            he.a.f(r6)
            com.unity3d.ads.core.domain.events.OperativeEventObserver r6 = r5.operativeEventObserver
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r6.invoke(r0)
            if (r6 != r4) goto L4e
            goto L5b
        L4e:
            r1 = r5
        L4f:
            com.unity3d.ads.core.domain.events.DiagnosticEventObserver r6 = r1.diagnosticEventObserver
            r0.L$0 = r1
            r0.label = r2
            java.lang.Object r6 = r6.invoke(r0)
            if (r6 != r4) goto L5c
        L5b:
            return r4
        L5c:
            r0 = r1
        L5d:
            com.unity3d.ads.core.domain.events.TransactionEventObserver r6 = r0.transactionEventObserver
            r6.invoke()
            he.y r6 = he.y.f6101a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.EventObservers.invoke(le.c):java.lang.Object");
    }
}
