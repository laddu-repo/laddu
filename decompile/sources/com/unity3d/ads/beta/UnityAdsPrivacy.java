package com.unity3d.ads.beta;

import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class UnityAdsPrivacy {
    public static final void set(UnityAdsPrivacyConsent consent, UnityAdsPrivacyConsentValue value) {
        k.e(consent, "consent");
        k.e(value, "value");
    }

    public static final void setPrivacy(String flag, UnityAdsPrivacyConsentValue value) {
        k.e(flag, "flag");
        k.e(value, "value");
    }

    public static final void set(UnityAdsPrivacyFlag privacy, UnityAdsPrivacyValue value) {
        k.e(privacy, "privacy");
        k.e(value, "value");
    }

    public static final void setPrivacy(String flag, UnityAdsPrivacyValue consent) {
        k.e(flag, "flag");
        k.e(consent, "consent");
    }
}
