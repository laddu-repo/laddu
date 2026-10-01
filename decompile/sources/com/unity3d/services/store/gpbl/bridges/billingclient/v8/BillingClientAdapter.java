package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import a8.g;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon;
import com.unity3d.services.store.gpbl.listeners.BillingClientStateListener;
import com.unity3d.services.store.gpbl.listeners.BillingInitializationListener;
import com.unity3d.services.store.gpbl.listeners.ProductDetailsListener;
import com.unity3d.services.store.gpbl.listeners.ProductDetailsResponseListener;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import com.unity3d.services.store.gpbl.proxies.BillingClientStateListenerProxy;
import com.unity3d.services.store.gpbl.proxies.ProductDetailsResponseListenerProxy;
import com.unity3d.services.store.gpbl.proxies.PurchaseUpdatedListenerProxy;
import com.unity3d.services.store.gpbl.proxies.PurchasesResponseListenerProxy;
import java.util.List;
import kf.f1;
import kf.r0;
import kotlin.jvm.internal.k;
import org.json.JSONObject;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class BillingClientAdapter extends com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter {
    private BillingClientBridge billingClient;
    private final BillingClientBuilderBridge billingClientBuilderBridge;

    public BillingClientAdapter(BillingClientBuilderBridge billingClientBuilderBridge) {
        k.e(billingClientBuilderBridge, "billingClientBuilderBridge");
        this.billingClientBuilderBridge = billingClientBuilderBridge;
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public String getAdapterVersion() {
        return "8";
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public void initialize(BillingInitializationListener billingInitializationListener) {
        k.e(billingInitializationListener, "billingInitializationListener");
        if (isInitialized()) {
            billingInitializationListener.onIsAlreadyInitialized();
            return;
        }
        this.billingClientBuilderBridge.setListener(new PurchaseUpdatedListenerProxy(billingInitializationListener));
        this.billingClientBuilderBridge.enablePendingPurchases();
        BillingClientBridgeCommon build = this.billingClientBuilderBridge.build();
        k.c(build, "null cannot be cast to non-null type com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBridge");
        this.billingClient = (BillingClientBridge) build;
        startConnection(billingInitializationListener);
        r0 r0Var = get_isInitialized$unity_ads_defaultRelease();
        Boolean bool = Boolean.TRUE;
        f1 f1Var = (f1) r0Var;
        f1Var.getClass();
        f1Var.h(null, bool);
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public BillingResultResponseCode isFeatureSupported(String str) {
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge != null) {
            return billingClientBridge.isFeatureSupported(str);
        }
        k.k("billingClient");
        throw null;
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public boolean isReady() {
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge != null) {
            return billingClientBridge.isReady();
        }
        k.k("billingClient");
        throw null;
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public void queryProductDetailsAsync(String productId, String productType, final ProductDetailsListener listener) {
        k.e(productId, "productId");
        k.e(productType, "productType");
        k.e(listener, "listener");
        QueryProductDetailsParamsBridge build = QueryProductDetailsParamsBridge.Companion.newBuilder().setProductList(g.m(ProductBridge.Companion.newBuilder().setProductId(productId).setProductType(productType).build())).build();
        ProductDetailsResponseListenerProxy productDetailsResponseListenerProxy = new ProductDetailsResponseListenerProxy(new ProductDetailsResponseListener() { // from class: com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientAdapter$queryProductDetailsAsync$productDetailsResponseListenerProxy$1
            @Override // com.unity3d.services.store.gpbl.listeners.ProductDetailsResponseListener
            public void onProductDetailsResponse(BillingResultBridge billingResult, QueryProductDetailsResultsBridge queryProductDetailsResults) {
                k.e(billingResult, "billingResult");
                k.e(queryProductDetailsResults, "queryProductDetailsResults");
                List<ProductDetailsBridge> productDetailsList = queryProductDetailsResults.getProductDetailsList();
                String str = null;
                if (productDetailsList.isEmpty()) {
                    ProductDetailsListener.this.onProductDetailsResponse(billingResult, null);
                    return;
                }
                JSONObject originalJson = productDetailsList.get(0).getOriginalJson();
                ProductDetailsListener productDetailsListener = ProductDetailsListener.this;
                if (originalJson != null) {
                    str = originalJson.toString();
                }
                productDetailsListener.onProductDetailsResponse(billingResult, str);
            }
        });
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge != null) {
            billingClientBridge.queryProductDetailsAsync(build, productDetailsResponseListenerProxy);
        } else {
            k.k("billingClient");
            throw null;
        }
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public void queryPurchasesAsync(String str, PurchasesResponseListener purchasesResponseListener) {
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge != null) {
            billingClientBridge.queryPurchasesAsync(str, new PurchasesResponseListenerProxy(purchasesResponseListener));
        } else {
            k.k("billingClient");
            throw null;
        }
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public void startConnection(BillingClientStateListener billingClientStateListener) {
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge != null) {
            billingClientBridge.startConnection(new BillingClientStateListenerProxy(billingClientStateListener));
        } else {
            k.k("billingClient");
            throw null;
        }
    }
}
