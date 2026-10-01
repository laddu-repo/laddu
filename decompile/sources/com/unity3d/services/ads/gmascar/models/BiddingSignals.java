package com.unity3d.services.ads.gmascar.models;

import android.text.TextUtils;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class BiddingSignals {
    private final String bannerSignal;
    private final String interstitialSignal;
    private final String rvSignal;

    public BiddingSignals(String str, String str2, String str3) {
        this.rvSignal = str;
        this.interstitialSignal = str2;
        this.bannerSignal = str3;
    }

    public String getBannerSignal() {
        return this.bannerSignal;
    }

    public String getInterstitialSignal() {
        return this.interstitialSignal;
    }

    public Map<String, String> getMap() {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(getRvSignal())) {
            hashMap.put(ScarConstants.RV_SIGNAL_KEY, getRvSignal());
        }
        if (!TextUtils.isEmpty(getInterstitialSignal())) {
            hashMap.put(ScarConstants.IN_SIGNAL_KEY, getInterstitialSignal());
        }
        if (!TextUtils.isEmpty(getBannerSignal())) {
            hashMap.put(ScarConstants.BN_SIGNAL_KEY, getBannerSignal());
        }
        return hashMap;
    }

    public String getRvSignal() {
        return this.rvSignal;
    }

    public boolean isEmpty() {
        if (TextUtils.isEmpty(getRvSignal()) && TextUtils.isEmpty(getInterstitialSignal()) && TextUtils.isEmpty(getBannerSignal())) {
            return true;
        }
        return false;
    }

    public BiddingSignals(String str, String str2) {
        this.rvSignal = str;
        this.interstitialSignal = str2;
        this.bannerSignal = HttpUrl.FRAGMENT_ENCODE_SET;
    }
}
