package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.misc.IJsonStorageReader;
import com.unity3d.services.core.misc.JsonFlattener;
import com.unity3d.services.core.misc.JsonFlattenerRules;
import com.unity3d.services.core.misc.JsonStorageAggregator;
import com.unity3d.services.core.misc.Utilities;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class DeviceInfoReaderWithStorageInfo implements IDeviceInfoReader {
    private final IDeviceInfoReader _deviceInfoReader;
    private final JsonFlattenerRules _jsonFlattenerRules;
    private final List<IJsonStorageReader> _storageReaders;

    public DeviceInfoReaderWithStorageInfo(IDeviceInfoReader iDeviceInfoReader, JsonFlattenerRules jsonFlattenerRules, IJsonStorageReader... iJsonStorageReaderArr) {
        this._deviceInfoReader = iDeviceInfoReader;
        this._jsonFlattenerRules = jsonFlattenerRules;
        this._storageReaders = Arrays.asList(iJsonStorageReaderArr);
    }

    @Override // com.unity3d.services.core.device.reader.IDeviceInfoReader
    public Map<String, Object> getDeviceInfoData() {
        Map<String, Object> deviceInfoData = this._deviceInfoReader.getDeviceInfoData();
        if (deviceInfoData != null) {
            return Utilities.combineJsonIntoMap(deviceInfoData, new JsonFlattener(new JsonStorageAggregator(this._storageReaders).getData()).flattenJson(".", this._jsonFlattenerRules));
        }
        return deviceInfoData;
    }
}
