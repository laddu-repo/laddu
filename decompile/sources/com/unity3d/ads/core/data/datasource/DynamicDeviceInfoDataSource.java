package com.unity3d.ads.core.data.datasource;

import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import java.util.List;
import kf.h;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public interface DynamicDeviceInfoDataSource {
    DynamicDeviceInfoOuterClass.DynamicDeviceInfo fetch();

    String getConnectionTypeStr();

    int getCurrentUiTheme();

    List<String> getLocaleList();

    String getOrientation();

    int getRingerMode();

    h getVolumeSettingsChange();

    boolean hasInternet();
}
