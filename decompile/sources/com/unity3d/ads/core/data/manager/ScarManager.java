package com.unity3d.ads.core.data.manager;

import android.content.Context;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import gatewayprotocol.v1.AdFormatOuterClass;
import java.util.List;
import kf.h;
import le.c;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public interface ScarManager {
    Object getSignals(List<? extends AdFormatOuterClass.AdFormat> list, c cVar);

    Object getVersion(c cVar);

    Object loadAd(String str, String str2, String str3, String str4, String str5, int i6, c cVar);

    h loadBannerAd(Context context, BannerView bannerView, sd.c cVar, UnityBannerSize unityBannerSize, String str);

    h show(String str, String str2);
}
