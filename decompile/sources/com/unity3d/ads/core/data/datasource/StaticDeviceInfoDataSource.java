package com.unity3d.ads.core.data.datasource;

import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.util.List;
import le.c;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public interface StaticDeviceInfoDataSource {
    Object fetch(List<String> list, c cVar);

    StaticDeviceInfoOuterClass.StaticDeviceInfo fetchCached();

    String getAnalyticsUserId();

    String getAppName();

    Object getAuid(c cVar);

    Object getIdfi(c cVar);

    String getManufacturer();

    String getModel();

    String getOsVersion();

    long getSystemBootTime();

    Object getUnityBuildGuid(c cVar);
}
