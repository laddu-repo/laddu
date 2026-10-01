package com.unity3d.services.store.gpbl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public enum BillingResultResponseCode {
    UNKNOWN(-100),
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8),
    NETWORK_ERROR(12);

    private final int _responseCode;

    BillingResultResponseCode(int i6) {
        this._responseCode = i6;
    }

    public static BillingResultResponseCode fromResponseCode(int i6) {
        for (BillingResultResponseCode billingResultResponseCode : values()) {
            if (billingResultResponseCode.getResponseCode() == i6) {
                return billingResultResponseCode;
            }
        }
        return UNKNOWN;
    }

    public int getResponseCode() {
        return this._responseCode;
    }
}
