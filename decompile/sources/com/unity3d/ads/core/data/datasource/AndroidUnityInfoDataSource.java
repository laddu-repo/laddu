package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.preferences.AndroidPreferences;
import df.m;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidUnityInfoDataSource {
    private final String prefName;

    public AndroidUnityInfoDataSource(Context applicationContext) {
        k.e(applicationContext, "applicationContext");
        this.prefName = applicationContext.getPackageName() + ".v2.playerprefs";
    }

    private final String getPlayerPrefId(String str) {
        String string = AndroidPreferences.getString(this.prefName, str);
        if (string == null || m.S(string)) {
            return null;
        }
        return string;
    }

    public final String getUnityInstallationId() {
        return getPlayerPrefId(UnityAdsConstants.Preferences.PREF_KEY_UNITY_INSTALLATION_ID);
    }

    public final String getUnityMegaSessionId() {
        return getPlayerPrefId(UnityAdsConstants.Preferences.PREF_KEY_UNITY_MEGA_SESSION_ID);
    }
}
