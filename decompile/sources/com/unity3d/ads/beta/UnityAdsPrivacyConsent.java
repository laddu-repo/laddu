package com.unity3d.ads.beta;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public enum UnityAdsPrivacyConsent {
    GDPR_CONSENT(0),
    PRIVACY_CONSENT(1),
    PIPL_CONSENT(2);

    private final int value;

    UnityAdsPrivacyConsent(int i6) {
        this.value = i6;
    }

    public final int getValue() {
        return this.value;
    }
}
