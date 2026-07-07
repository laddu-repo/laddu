package com.unity3d.ads.metadata;

import android.content.Context;
import com.unity3d.services.core.device.StorageManager;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class MediationMetaData extends MetaData {
    public static final String KEY_MISSED_IMPRESSION_ORDINAL = "missedImpressionOrdinal";
    public static final String KEY_NAME = "name";
    public static final String KEY_ORDINAL = "ordinal";
    public static final String KEY_VERSION = "version";

    public MediationMetaData(Context context) {
        super(context);
        setCategory("mediation");
    }

    @Override // com.unity3d.ads.metadata.MetaData
    public StorageManager.StorageType getStorageType() {
        return StorageManager.StorageType.MEMORY;
    }

    public void setMissedImpressionOrdinal(int i6) {
        set(KEY_MISSED_IMPRESSION_ORDINAL, Integer.valueOf(i6));
    }

    public void setName(String str) {
        set(KEY_NAME, str);
    }

    public void setOrdinal(int i6) {
        set(KEY_ORDINAL, Integer.valueOf(i6));
    }

    public void setVersion(String str) {
        set("version", str);
    }
}
