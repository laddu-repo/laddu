package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.configuration.InitRequestType;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class DeviceInfoReaderWithRequestType implements IDeviceInfoReader {
    private final IDeviceInfoReader _deviceInfoReader;
    private final InitRequestType _initRequestType;

    public DeviceInfoReaderWithRequestType(IDeviceInfoReader iDeviceInfoReader, InitRequestType initRequestType) {
        this._deviceInfoReader = iDeviceInfoReader;
        this._initRequestType = initRequestType;
    }

    @Override // com.unity3d.services.core.device.reader.IDeviceInfoReader
    public Map<String, Object> getDeviceInfoData() {
        Map<String, Object> deviceInfoData = this._deviceInfoReader.getDeviceInfoData();
        InitRequestType initRequestType = this._initRequestType;
        if (initRequestType != null) {
            deviceInfoData.put("callType", initRequestType.toString().toLowerCase());
        }
        return deviceInfoData;
    }
}
