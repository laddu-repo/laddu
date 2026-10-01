package com.unity3d.ads.core.data.manager;

import kf.h;
import le.c;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public interface OfferwallManager {
    Object getVersion(c cVar);

    Object isAdReady(String str, c cVar);

    Object isConnected(c cVar);

    Object loadAd(String str, c cVar);

    h showAd(String str);
}
