package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.gatewayclient.GatewayClient;
import gf.c0;
import j1.f0;
import kf.f1;
import kf.r0;
import kf.y0;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class TransactionEventObserver {
    private final GatewayClient gatewayClient;
    private final GetRequestPolicy getRequestPolicy;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final ByteStringDataSource iapTransactionStore;
    private final r0 isRunning;
    private final c0 scope;
    private final TransactionEventRepository transactionEventRepository;

    public TransactionEventObserver(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, c0 scope, TransactionEventRepository transactionEventRepository, GatewayClient gatewayClient, GetRequestPolicy getRequestPolicy, ByteStringDataSource iapTransactionStore) {
        k.e(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        k.e(scope, "scope");
        k.e(transactionEventRepository, "transactionEventRepository");
        k.e(gatewayClient, "gatewayClient");
        k.e(getRequestPolicy, "getRequestPolicy");
        k.e(iapTransactionStore, "iapTransactionStore");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.scope = scope;
        this.transactionEventRepository = transactionEventRepository;
        this.gatewayClient = gatewayClient;
        this.getRequestPolicy = getRequestPolicy;
        this.iapTransactionStore = iapTransactionStore;
        this.isRunning = y0.c(Boolean.FALSE);
    }

    public final void invoke() {
        f1 f1Var;
        Object value;
        Boolean bool;
        r0 r0Var = this.isRunning;
        do {
            f1Var = (f1) r0Var;
            value = f1Var.getValue();
            bool = (Boolean) value;
            bool.getClass();
        } while (!f1Var.f(value, Boolean.TRUE));
        if (bool.booleanValue()) {
            return;
        }
        y0.p(new f0(6, this.transactionEventRepository.getTransactionEvents(), new TransactionEventObserver$invoke$2(this, null)), this.scope);
    }
}
