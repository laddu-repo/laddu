package com.unity3d.services.store.core;

import com.unity3d.services.store.StoreEvent;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public interface StoreExceptionHandler {
    void handleStoreException(StoreEvent storeEvent, int i6, Exception exc);
}
