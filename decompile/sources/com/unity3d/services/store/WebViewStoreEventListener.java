package com.unity3d.services.store;

import com.unity3d.ads.core.extensions.JsonSerializableExtensionsKt;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseHistoryRecordBridge;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsBridge;
import com.unity3d.services.store.gpbl.listeners.StoreEventListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import org.json.JSONArray;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class WebViewStoreEventListener implements StoreEventListener {
    private final boolean isLifecycleListener;
    private final int operationId;
    private final StoreWebViewEventSender storeWebViewEventSender;

    public WebViewStoreEventListener(int i6, StoreWebViewEventSender storeWebViewEventSender, boolean z10) {
        k.e(storeWebViewEventSender, "storeWebViewEventSender");
        this.operationId = i6;
        this.storeWebViewEventSender = storeWebViewEventSender;
        this.isLifecycleListener = z10;
    }

    @Override // com.unity3d.services.store.gpbl.listeners.StoreEventListener
    public int getOperationId() {
        return this.operationId;
    }

    @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
    public void onBillingServiceDisconnected() {
        this.storeWebViewEventSender.send(StoreEvent.DISCONNECTED_RESULT, new Object[0]);
    }

    @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
    public void onBillingSetupFinished(BillingResultBridge billingResult) {
        k.e(billingResult, "billingResult");
        if (billingResult.getResponseCode() == BillingResultResponseCode.OK) {
            StoreWebViewEventSender storeWebViewEventSender = this.storeWebViewEventSender;
            StoreEvent storeEvent = StoreEvent.INITIALIZATION_REQUEST_RESULT;
            BillingResultResponseCode responseCode = billingResult.getResponseCode();
            k.d(responseCode, "billingResult.responseCode");
            storeWebViewEventSender.send(storeEvent, responseCode);
            return;
        }
        StoreWebViewEventSender storeWebViewEventSender2 = this.storeWebViewEventSender;
        StoreEvent storeEvent2 = StoreEvent.INITIALIZATION_REQUEST_FAILED;
        BillingResultResponseCode responseCode2 = billingResult.getResponseCode();
        k.d(responseCode2, "billingResult.responseCode");
        storeWebViewEventSender2.send(storeEvent2, responseCode2);
    }

    @Override // com.unity3d.services.store.gpbl.listeners.FeatureSupportedListener
    public void onFeatureSupported(int i6) {
        this.storeWebViewEventSender.send(StoreEvent.IS_FEATURE_SUPPORTED_REQUEST_RESULT, Integer.valueOf(getOperationId()), Integer.valueOf(i6));
    }

    @Override // com.unity3d.services.store.gpbl.listeners.BillingInitializationListener
    public void onIsAlreadyInitialized() {
        this.storeWebViewEventSender.send(StoreEvent.INITIALIZATION_REQUEST_RESULT, Integer.valueOf(BillingResultResponseCode.OK.getResponseCode()));
    }

    @Override // com.unity3d.services.store.gpbl.listeners.PurchaseHistoryResponseListener
    public void onPurchaseHistoryUpdated(BillingResultBridge billingResult, List<? extends PurchaseHistoryRecordBridge> list) {
        JSONArray jSONArray;
        k.e(billingResult, "billingResult");
        StoreWebViewEventSender storeWebViewEventSender = this.storeWebViewEventSender;
        StoreEvent storeEvent = StoreEvent.PURCHASE_HISTORY_LIST_REQUEST_RESULT;
        Integer valueOf = Integer.valueOf(getOperationId());
        BillingResultResponseCode responseCode = billingResult.getResponseCode();
        k.d(responseCode, "billingResult.responseCode");
        if (list == null || (jSONArray = JsonSerializableExtensionsKt.toJsonArray(list)) == null) {
            jSONArray = new JSONArray();
        }
        storeWebViewEventSender.send(storeEvent, valueOf, responseCode, jSONArray);
    }

    @Override // com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener
    public void onPurchaseResponse(BillingResultBridge billingResult, List<? extends PurchaseBridge> list) {
        StoreEvent storeEvent;
        JSONArray jSONArray;
        StoreEvent storeEvent2;
        k.e(billingResult, "billingResult");
        ArrayList arrayList = new ArrayList();
        if (getOperationId() != -1) {
            arrayList.add(Integer.valueOf(getOperationId()));
        }
        if (billingResult.getResponseCode() == BillingResultResponseCode.OK) {
            if (list == null || (jSONArray = JsonSerializableExtensionsKt.toJsonArray(list)) == null) {
                jSONArray = new JSONArray();
            }
            arrayList.add(jSONArray);
            StoreWebViewEventSender storeWebViewEventSender = this.storeWebViewEventSender;
            if (this.isLifecycleListener) {
                storeEvent2 = StoreEvent.PURCHASES_ON_RESUME_RESULT;
            } else {
                storeEvent2 = StoreEvent.PURCHASES_REQUEST_RESULT;
            }
            Object[] array = arrayList.toArray(new Object[0]);
            storeWebViewEventSender.send(storeEvent2, Arrays.copyOf(array, array.length));
            return;
        }
        arrayList.add(billingResult.getResponseCode());
        StoreWebViewEventSender storeWebViewEventSender2 = this.storeWebViewEventSender;
        if (this.isLifecycleListener) {
            storeEvent = StoreEvent.PURCHASES_ON_RESUME_ERROR;
        } else {
            storeEvent = StoreEvent.PURCHASES_REQUEST_ERROR;
        }
        Object[] array2 = arrayList.toArray(new Object[0]);
        storeWebViewEventSender2.send(storeEvent, Arrays.copyOf(array2, array2.length));
    }

    @Override // com.unity3d.services.store.gpbl.listeners.PurchaseUpdatedResponseListener
    public void onPurchaseUpdated(BillingResultBridge billingResult, List<? extends PurchaseBridge> list) {
        JSONArray jSONArray;
        k.e(billingResult, "billingResult");
        if (billingResult.getResponseCode() == BillingResultResponseCode.OK) {
            StoreWebViewEventSender storeWebViewEventSender = this.storeWebViewEventSender;
            StoreEvent storeEvent = StoreEvent.PURCHASES_UPDATED_RESULT;
            if (list == null || (jSONArray = JsonSerializableExtensionsKt.toJsonArray(list)) == null) {
                jSONArray = new JSONArray();
            }
            storeWebViewEventSender.send(storeEvent, jSONArray);
            return;
        }
        StoreWebViewEventSender storeWebViewEventSender2 = this.storeWebViewEventSender;
        StoreEvent storeEvent2 = StoreEvent.PURCHASES_UPDATED_ERROR;
        BillingResultResponseCode responseCode = billingResult.getResponseCode();
        k.d(responseCode, "billingResult.responseCode");
        storeWebViewEventSender2.send(storeEvent2, responseCode);
    }

    @Override // com.unity3d.services.store.gpbl.listeners.SkuDetailsResponseListener
    public void onSkuDetailsUpdated(BillingResultBridge billingResult, List<? extends SkuDetailsBridge> list) {
        JSONArray jSONArray;
        k.e(billingResult, "billingResult");
        StoreWebViewEventSender storeWebViewEventSender = this.storeWebViewEventSender;
        StoreEvent storeEvent = StoreEvent.SKU_DETAILS_LIST_REQUEST_RESULT;
        Integer valueOf = Integer.valueOf(getOperationId());
        if (list == null || (jSONArray = JsonSerializableExtensionsKt.toJsonArray(list)) == null) {
            jSONArray = new JSONArray();
        }
        storeWebViewEventSender.send(storeEvent, valueOf, jSONArray);
    }

    public /* synthetic */ WebViewStoreEventListener(int i6, StoreWebViewEventSender storeWebViewEventSender, boolean z10, int i10, f fVar) {
        this(i6, storeWebViewEventSender, (i10 & 4) != 0 ? false : z10);
    }
}
