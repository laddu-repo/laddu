package com.unity3d.services.store.gpbl.bridges.billingclient;

import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge;
import com.unity3d.services.store.gpbl.proxies.BillingClientStateListenerProxy;
import com.unity3d.services.store.gpbl.proxies.PurchaseHistoryResponseListenerProxy;
import com.unity3d.services.store.gpbl.proxies.PurchasesResponseListenerProxy;
import com.unity3d.services.store.gpbl.proxies.SkuDetailsResponseListenerProxy;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public interface IBillingClient {
    BillingResultResponseCode isFeatureSupported(String str);

    boolean isReady();

    void queryPurchaseHistoryAsync(String str, PurchaseHistoryResponseListenerProxy purchaseHistoryResponseListenerProxy);

    void queryPurchasesAsync(String str, PurchasesResponseListenerProxy purchasesResponseListenerProxy);

    void querySkuDetailsAsync(SkuDetailsParamsBridge skuDetailsParamsBridge, SkuDetailsResponseListenerProxy skuDetailsResponseListenerProxy);

    void startConnection(BillingClientStateListenerProxy billingClientStateListenerProxy);
}
