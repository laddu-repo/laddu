package com.unity3d.services.store;

import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import java.util.Arrays;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class StoreWebViewEventSender {
    private final IEventSender eventSender;

    public StoreWebViewEventSender(IEventSender eventSender) {
        k.e(eventSender, "eventSender");
        this.eventSender = eventSender;
    }

    public final void send(StoreEvent event, Object... params) {
        k.e(event, "event");
        k.e(params, "params");
        this.eventSender.sendEvent(WebViewEventCategory.STORE, event, Arrays.copyOf(params, params.length));
    }
}
