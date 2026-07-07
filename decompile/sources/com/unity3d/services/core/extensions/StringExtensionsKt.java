package com.unity3d.services.core.extensions;

import com.unity3d.services.UnityAdsConstants;
import r4.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class StringExtensionsKt {
    public static final String toUnityMessage(String str) {
        if (str != null && str.length() != 0) {
            return a.k(UnityAdsConstants.Messages.MSG_UNITY_BASE, str);
        }
        return "[Unity Ads] Internal error";
    }
}
