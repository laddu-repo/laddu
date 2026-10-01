package com.unity3d.services.ads.token;

import com.unity3d.services.ads.gmascar.managers.IBiddingManager;
import com.unity3d.services.core.configuration.Configuration;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public interface AsyncTokenStorage {
    void getToken(IBiddingManager iBiddingManager);

    void onTokenAvailable();

    void setConfiguration(Configuration configuration);
}
