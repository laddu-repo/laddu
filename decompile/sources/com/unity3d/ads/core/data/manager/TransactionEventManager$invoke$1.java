package com.unity3d.ads.core.data.manager;

import com.unity3d.ads.core.data.model.exception.TransactionException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter;
import com.unity3d.services.store.gpbl.listeners.BillingInitializationListener;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import gf.c0;
import gf.k;
import he.y;
import java.util.List;
import kf.f1;
import kf.r0;
import kf.y0;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1", f = "TransactionEventManager.kt", l = {163}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class TransactionEventManager$invoke$1 extends j implements p {
    Object L$0;
    int label;
    final /* synthetic */ TransactionEventManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionEventManager$invoke$1(TransactionEventManager transactionEventManager, c cVar) {
        super(2, cVar);
        this.this$0 = transactionEventManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(TransactionEventManager transactionEventManager, BillingResultBridge billingResultBridge, List list) {
        transactionEventManager.onPurchasesReceived(billingResultBridge, list, TransactionEventRequestOuterClass.TransactionOrigin.TRANSACTION_ORIGIN_HISTORICAL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$2(TransactionEventManager transactionEventManager, BillingResultBridge billingResultBridge, List list) {
        transactionEventManager.onPurchasesReceived(billingResultBridge, list, TransactionEventRequestOuterClass.TransactionOrigin.TRANSACTION_ORIGIN_HISTORICAL);
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new TransactionEventManager$invoke$1(this.this$0, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((TransactionEventManager$invoke$1) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        Logger logger;
        BillingClientAdapter billingClientAdapter;
        BillingClientAdapter billingClientAdapter2;
        SessionRepository sessionRepository;
        BillingClientAdapter billingClientAdapter3;
        BillingClientAdapter billingClientAdapter4;
        int i6 = this.label;
        try {
        } catch (Exception e10) {
            logger = this.this$0.logger;
            logger.trace(TransactionEventManager.BILLING_SERVICE_UNAVAILABLE, e10);
        }
        if (i6 != 0) {
            if (i6 == 1) {
                he.a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            he.a.f(obj);
            billingClientAdapter = this.this$0.billingClientAdapter;
            if (!billingClientAdapter.isInitialized()) {
                final TransactionEventManager transactionEventManager = this.this$0;
                this.L$0 = transactionEventManager;
                this.label = 1;
                final k kVar = new k(1, a8.c.i(this));
                kVar.s();
                billingClientAdapter2 = transactionEventManager.billingClientAdapter;
                billingClientAdapter2.initialize(new BillingInitializationListener() { // from class: com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1$1$1
                    private final r0 hasBeenResumed = y0.c(Boolean.FALSE);

                    private final void tryResume() {
                        f1 f1Var;
                        Object value;
                        Boolean bool;
                        if (gf.j.this.isActive()) {
                            r0 r0Var = this.hasBeenResumed;
                            do {
                                f1Var = (f1) r0Var;
                                value = f1Var.getValue();
                                bool = (Boolean) value;
                                bool.getClass();
                            } while (!f1Var.f(value, Boolean.TRUE));
                            if (!bool.booleanValue()) {
                                gf.j.this.resumeWith(y.f6101a);
                            }
                        }
                    }

                    private final void tryResumeWithException(Exception exc) {
                        f1 f1Var;
                        Object value;
                        Boolean bool;
                        if (gf.j.this.isActive()) {
                            r0 r0Var = this.hasBeenResumed;
                            do {
                                f1Var = (f1) r0Var;
                                value = f1Var.getValue();
                                bool = (Boolean) value;
                                bool.getClass();
                            } while (!f1Var.f(value, Boolean.TRUE));
                            if (!bool.booleanValue()) {
                                gf.j.this.resumeWith(he.a.b(exc));
                            }
                        }
                    }

                    public final r0 getHasBeenResumed() {
                        return this.hasBeenResumed;
                    }

                    @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
                    public void onBillingServiceDisconnected() {
                        tryResumeWithException(new TransactionException("Billing service disconnected"));
                    }

                    @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
                    public void onBillingSetupFinished(BillingResultBridge billingResult) {
                        kotlin.jvm.internal.k.e(billingResult, "billingResult");
                        if (billingResult.getResponseCode() != BillingResultResponseCode.OK) {
                            tryResumeWithException(new TransactionException("Billing setup failed"));
                        } else {
                            tryResume();
                        }
                    }

                    @Override // com.unity3d.services.store.gpbl.listeners.BillingInitializationListener
                    public void onIsAlreadyInitialized() {
                        tryResume();
                    }

                    @Override // com.unity3d.services.store.gpbl.listeners.PurchaseUpdatedResponseListener
                    public void onPurchaseUpdated(BillingResultBridge billingResult, List<? extends PurchaseBridge> list) {
                        kotlin.jvm.internal.k.e(billingResult, "billingResult");
                        transactionEventManager.onPurchasesReceived(billingResult, list, TransactionEventRequestOuterClass.TransactionOrigin.TRANSACTION_ORIGIN_LIVE_UPDATE);
                    }
                });
                Object r10 = kVar.r();
                me.a aVar = me.a.f8833x;
                if (r10 == aVar) {
                    return aVar;
                }
            }
            return y.f6101a;
        }
        sessionRepository = this.this$0.sessionRepository;
        if (sessionRepository.getNativeConfiguration().getFeatureFlags().getShouldSendIapHistory()) {
            billingClientAdapter3 = this.this$0.billingClientAdapter;
            final TransactionEventManager transactionEventManager2 = this.this$0;
            final int i10 = 0;
            billingClientAdapter3.queryPurchasesAsync("inapp", new PurchasesResponseListener() { // from class: com.unity3d.ads.core.data.manager.a
                @Override // com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener
                public final void onPurchaseResponse(BillingResultBridge billingResultBridge, List list) {
                    switch (i10) {
                        case 0:
                            TransactionEventManager$invoke$1.invokeSuspend$lambda$1(transactionEventManager2, billingResultBridge, list);
                            return;
                        default:
                            TransactionEventManager$invoke$1.invokeSuspend$lambda$2(transactionEventManager2, billingResultBridge, list);
                            return;
                    }
                }
            });
            billingClientAdapter4 = this.this$0.billingClientAdapter;
            final TransactionEventManager transactionEventManager3 = this.this$0;
            final int i11 = 1;
            billingClientAdapter4.queryPurchasesAsync("subs", new PurchasesResponseListener() { // from class: com.unity3d.ads.core.data.manager.a
                @Override // com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener
                public final void onPurchaseResponse(BillingResultBridge billingResultBridge, List list) {
                    switch (i11) {
                        case 0:
                            TransactionEventManager$invoke$1.invokeSuspend$lambda$1(transactionEventManager3, billingResultBridge, list);
                            return;
                        default:
                            TransactionEventManager$invoke$1.invokeSuspend$lambda$2(transactionEventManager3, billingResultBridge, list);
                            return;
                    }
                }
            });
        }
        return y.f6101a;
    }
}
