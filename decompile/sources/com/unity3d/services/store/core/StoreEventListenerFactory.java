package com.unity3d.services.store.core;

import com.unity3d.services.store.StoreWebViewEventSender;
import com.unity3d.services.store.WebViewStoreEventListener;
import com.unity3d.services.store.gpbl.listeners.StoreEventListener;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class StoreEventListenerFactory {
    private final StoreWebViewEventSender storeWebViewEventSender;

    public StoreEventListenerFactory(StoreWebViewEventSender storeWebViewEventSender) {
        k.e(storeWebViewEventSender, "storeWebViewEventSender");
        this.storeWebViewEventSender = storeWebViewEventSender;
    }

    public static /* synthetic */ StoreEventListener invoke$default(StoreEventListenerFactory storeEventListenerFactory, int i6, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i6 = -1;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return storeEventListenerFactory.invoke(i6, z10);
    }

    public final StoreEventListener invoke() {
        return invoke$default(this, 0, false, 3, null);
    }

    public final StoreEventListener invoke(int i6) {
        return invoke$default(this, i6, false, 2, null);
    }

    public final StoreEventListener invoke(int i6, boolean z10) {
        return new WebViewStoreEventListener(i6, this.storeWebViewEventSender, z10);
    }
}
