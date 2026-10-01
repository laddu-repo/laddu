package com.unity3d.services.store;

import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.store.core.StoreExceptionHandler;
import com.unity3d.services.store.core.StoreLifecycleListener;
import com.unity3d.services.store.gpbl.StoreBilling;
import com.unity3d.services.store.gpbl.listeners.BillingInitializationListener;
import com.unity3d.services.store.gpbl.listeners.FeatureSupportedListener;
import com.unity3d.services.store.gpbl.listeners.PurchaseHistoryResponseListener;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import com.unity3d.services.store.gpbl.listeners.SkuDetailsResponseListener;
import com.unity3d.services.store.gpbl.listeners.StoreEventListener;
import java.util.ArrayList;
import java.util.List;
import kf.f1;
import kf.r0;
import kf.y0;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class StoreMonitor {
    private final r0 _isInitialized;
    private StoreBilling storeBilling;
    private final StoreExceptionHandler storeExceptionHandler;
    private StoreLifecycleListener storeLifecycleListener;

    public StoreMonitor(StoreExceptionHandler storeExceptionHandler) {
        k.e(storeExceptionHandler, "storeExceptionHandler");
        this.storeExceptionHandler = storeExceptionHandler;
        this._isInitialized = y0.c(Boolean.FALSE);
    }

    public final void getPurchaseHistory(int i6, String str, int i10, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        k.e(purchaseHistoryResponseListener, "purchaseHistoryResponseListener");
        try {
            StoreBilling storeBilling = this.storeBilling;
            if (storeBilling != null) {
                storeBilling.getPurchaseHistory(str, i10, purchaseHistoryResponseListener);
            }
        } catch (Exception e10) {
            this.storeExceptionHandler.handleStoreException(StoreEvent.PURCHASE_HISTORY_LIST_REQUEST_ERROR, i6, e10);
        }
    }

    public final void getPurchases(int i6, String str, PurchasesResponseListener purchasesResponseListener) {
        k.e(purchasesResponseListener, "purchasesResponseListener");
        try {
            StoreBilling storeBilling = this.storeBilling;
            if (storeBilling != null) {
                if (storeBilling != null) {
                    storeBilling.getPurchases(str, purchasesResponseListener);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        } catch (Exception e10) {
            this.storeExceptionHandler.handleStoreException(StoreEvent.PURCHASES_REQUEST_ERROR, i6, e10);
        }
    }

    public final void getSkuDetails(int i6, String str, List<String> list, SkuDetailsResponseListener skuDetailsResponseListener) {
        k.e(skuDetailsResponseListener, "skuDetailsResponseListener");
        try {
            StoreBilling storeBilling = this.storeBilling;
            if (storeBilling != null) {
                storeBilling.getSkuDetails(str, list, skuDetailsResponseListener);
            }
        } catch (Exception e10) {
            this.storeExceptionHandler.handleStoreException(StoreEvent.SKU_DETAILS_LIST_REQUEST_ERROR, i6, e10);
        }
    }

    public final void initialize(BillingInitializationListener billingInitializationListener) {
        k.e(billingInitializationListener, "billingInitializationListener");
        if (isInitialized()) {
            billingInitializationListener.onIsAlreadyInitialized();
            return;
        }
        StoreBilling storeBilling = new StoreBilling(ClientProperties.getApplicationContext(), billingInitializationListener);
        this.storeBilling = storeBilling;
        storeBilling.initialize(billingInitializationListener);
        r0 r0Var = this._isInitialized;
        Boolean bool = Boolean.TRUE;
        f1 f1Var = (f1) r0Var;
        f1Var.getClass();
        f1Var.h(null, bool);
    }

    public final int isFeatureSupported(int i6, String str, FeatureSupportedListener featureSupportedListener) {
        k.e(featureSupportedListener, "featureSupportedListener");
        int i10 = -1;
        try {
            StoreBilling storeBilling = this.storeBilling;
            if (storeBilling != null) {
                i10 = storeBilling.isFeatureSupported(str);
            }
            featureSupportedListener.onFeatureSupported(i10);
            return i10;
        } catch (Exception e10) {
            this.storeExceptionHandler.handleStoreException(StoreEvent.IS_FEATURE_SUPPORTED_REQUEST_ERROR, i6, e10);
            return i10;
        }
    }

    public final boolean isInitialized() {
        return ((Boolean) ((f1) this._isInitialized).getValue()).booleanValue();
    }

    public final void startPurchaseTracking(ArrayList<String> purchaseTypes, StoreEventListener storeEventListener) {
        k.e(purchaseTypes, "purchaseTypes");
        k.e(storeEventListener, "storeEventListener");
        if (this.storeLifecycleListener != null) {
            stopPurchaseTracking();
        }
        StoreBilling storeBilling = this.storeBilling;
        k.b(storeBilling);
        this.storeLifecycleListener = new StoreLifecycleListener(purchaseTypes, storeBilling, storeEventListener);
        ClientProperties.getApplication().registerActivityLifecycleCallbacks(this.storeLifecycleListener);
    }

    public final void stopPurchaseTracking() {
        if (this.storeLifecycleListener != null) {
            ClientProperties.getApplication().unregisterActivityLifecycleCallbacks(this.storeLifecycleListener);
            this.storeLifecycleListener = null;
        }
    }
}
