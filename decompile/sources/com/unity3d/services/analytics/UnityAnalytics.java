package com.unity3d.services.analytics;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class UnityAnalytics {
    protected static JSONArray eventQueue = new JSONArray();

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public enum AnalyticsEventType {
        POSTEVENT
    }

    private static JSONObject createAdComplete(String str, String str2, Boolean bool) {
        HashMap hashMap = new HashMap();
        hashMap.put("rewarded", bool);
        hashMap.put("network", str);
        hashMap.put("placement_id", str2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("custom_params", hashMap);
        hashMap2.put("ts", Long.valueOf(new Date().getTime()));
        hashMap2.put(MediationMetaData.KEY_NAME, "ad_complete");
        HashMap hashMap3 = new HashMap();
        hashMap3.put(HandleInvocationsFromAdViewer.KEY_AD_TYPE, "analytics.custom.v1");
        hashMap3.put("msg", hashMap2);
        return new JSONObject(hashMap3);
    }

    private static JSONObject createIapTransaction(String str, Float f3, String str2, Boolean bool, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("ts", Long.valueOf(new Date().getTime()));
        hashMap.put("productid", str);
        hashMap.put("amount", f3);
        hashMap.put(InAppPurchaseMetaData.KEY_CURRENCY, str2);
        hashMap.put("promo", bool);
        hashMap.put("receipt", str3);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(HandleInvocationsFromAdViewer.KEY_AD_TYPE, "analytics.transaction.v1");
        hashMap2.put("msg", hashMap);
        return new JSONObject(hashMap2);
    }

    private static JSONObject createItemAcquired(String str, Float f3, String str2, Float f10, String str3, String str4, String str5, AcquisitionType acquisitionType) {
        HashMap hashMap = new HashMap();
        hashMap.put("currency_type", acquisitionType.toString());
        hashMap.put("transaction_context", str);
        hashMap.put("amount", f3);
        hashMap.put("item_id", str2);
        hashMap.put("balance", f10);
        hashMap.put("item_type", str3);
        hashMap.put("level", str4);
        hashMap.put("transaction_id", str5);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("custom_params", hashMap);
        hashMap2.put("ts", 1533594423477L);
        hashMap2.put(MediationMetaData.KEY_NAME, "item_acquired");
        HashMap hashMap3 = new HashMap();
        hashMap3.put(HandleInvocationsFromAdViewer.KEY_AD_TYPE, "analytics.custom.v1");
        hashMap3.put("msg", hashMap2);
        return new JSONObject(hashMap3);
    }

    private static JSONObject createItemSpent(String str, Float f3, String str2, Float f10, String str3, String str4, String str5, AcquisitionType acquisitionType) {
        HashMap hashMap = new HashMap();
        hashMap.put("currency_type", acquisitionType.toString());
        hashMap.put("transaction_context", str);
        hashMap.put("amount", f3);
        hashMap.put("item_id", str2);
        hashMap.put("balance", f10);
        hashMap.put("item_type", str3);
        hashMap.put("level", str4);
        hashMap.put("transaction_id", str5);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("custom_params", hashMap);
        hashMap2.put("ts", Long.valueOf(new Date().getTime()));
        hashMap2.put(MediationMetaData.KEY_NAME, "item_spent");
        HashMap hashMap3 = new HashMap();
        hashMap3.put(HandleInvocationsFromAdViewer.KEY_AD_TYPE, "analytics.custom.v1");
        hashMap3.put("msg", hashMap2);
        return new JSONObject(hashMap3);
    }

    private static JSONObject createLevelFail(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("level_index", str);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("custom_params", hashMap);
        hashMap2.put("ts", Long.valueOf(new Date().getTime()));
        hashMap2.put(MediationMetaData.KEY_NAME, "level_fail");
        HashMap hashMap3 = new HashMap();
        hashMap3.put(HandleInvocationsFromAdViewer.KEY_AD_TYPE, "analytics.custom.v1");
        hashMap3.put("msg", hashMap2);
        return new JSONObject(hashMap3);
    }

    private static JSONObject createLevelUp(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("new_level_index", str);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("custom_params", hashMap);
        hashMap2.put("ts", Long.valueOf(new Date().getTime()));
        hashMap2.put(MediationMetaData.KEY_NAME, "level_up");
        HashMap hashMap3 = new HashMap();
        hashMap3.put(HandleInvocationsFromAdViewer.KEY_AD_TYPE, "analytics.custom.v1");
        hashMap3.put("msg", hashMap2);
        return new JSONObject(hashMap3);
    }

    public static void onAdComplete(String str, String str2, Boolean bool) {
        postEvent(createAdComplete(str, str2, bool));
    }

    public static void onEvent(JSONObject jSONObject) {
        postEvent(jSONObject);
    }

    public static void onIapTransaction(String str, Float f3, String str2, Boolean bool, String str3) {
        postEvent(createIapTransaction(str, f3, str2, bool, str3));
    }

    public static void onItemAcquired(String str, Float f3, String str2, Float f10, String str3, String str4, String str5, AcquisitionType acquisitionType) {
        postEvent(createItemAcquired(str, f3, str2, f10, str3, str4, str5, acquisitionType));
    }

    public static void onItemSpent(String str, Float f3, String str2, Float f10, String str3, String str4, String str5, AcquisitionType acquisitionType) {
        postEvent(createItemSpent(str, f3, str2, f10, str3, str4, str5, acquisitionType));
    }

    public static void onLevelFail(String str) {
        postEvent(createLevelFail(str));
    }

    public static void onLevelUp(String str) {
        postEvent(createLevelUp(str));
    }

    private static synchronized void postEvent(JSONObject jSONObject) {
        synchronized (UnityAnalytics.class) {
            try {
                if (eventQueue.length() < 200) {
                    eventQueue.put(jSONObject);
                }
                WebViewApp currentApp = WebViewApp.getCurrentApp();
                if (currentApp != null && currentApp.sendEvent(WebViewEventCategory.ANALYTICS, AnalyticsEventType.POSTEVENT, eventQueue.toString())) {
                    eventQueue = new JSONArray();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
