package com.unity3d.ads.adplayer.model;

import java.util.List;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class OnWebRequestComplete implements WebViewEvent {
    private final String category;
    private final String name;
    private final Object[] parameters;

    public OnWebRequestComplete(List<? extends Object> value) {
        k.e(value, "value");
        this.category = "REQUEST";
        this.name = "COMPLETE";
        this.parameters = value.toArray(new Object[0]);
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    public String getCategory() {
        return this.category;
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    public String getName() {
        return this.name;
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    public Object[] getParameters() {
        return this.parameters;
    }
}
