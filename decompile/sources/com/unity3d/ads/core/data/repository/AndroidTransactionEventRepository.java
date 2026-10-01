package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import jf.a;
import kf.q0;
import kf.s0;
import kf.u0;
import kf.x0;
import kf.y0;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidTransactionEventRepository implements TransactionEventRepository {
    private final q0 _transactionEvents;
    private final u0 transactionEvents;

    public AndroidTransactionEventRepository() {
        x0 a10 = y0.a(10, 10, a.f7437y);
        this._transactionEvents = a10;
        this.transactionEvents = new s0(a10);
    }

    @Override // com.unity3d.ads.core.data.repository.TransactionEventRepository
    public void addTransactionEvent(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest) {
        k.e(transactionEventRequest, "transactionEventRequest");
        this._transactionEvents.m(transactionEventRequest);
    }

    @Override // com.unity3d.ads.core.data.repository.TransactionEventRepository
    public u0 getTransactionEvents() {
        return this.transactionEvents;
    }
}
