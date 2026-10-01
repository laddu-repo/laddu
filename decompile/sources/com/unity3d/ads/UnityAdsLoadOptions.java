package com.unity3d.ads;

import com.unity3d.ads.core.domain.LegacyLoadUseCase;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class UnityAdsLoadOptions extends UnityAdsBaseOptions {
    private String AD_MARKUP = LegacyLoadUseCase.KEY_AD_MARKUP;

    public void setAdMarkup(String str) {
        set(this.AD_MARKUP, str);
    }
}
