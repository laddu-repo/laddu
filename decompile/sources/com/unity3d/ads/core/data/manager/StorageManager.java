package com.unity3d.ads.core.data.manager;

import android.content.Context;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public interface StorageManager {
    void addStorageLocation(StorageManager.StorageType storageType, String str);

    Storage getStorage(StorageManager.StorageType storageType);

    void hasInitialized();

    boolean hasStorage(StorageManager.StorageType storageType);

    boolean init(Context context);

    void initStorage(StorageManager.StorageType storageType);

    void removeStorage(StorageManager.StorageType storageType);
}
