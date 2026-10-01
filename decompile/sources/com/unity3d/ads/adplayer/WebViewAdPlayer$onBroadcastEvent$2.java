package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.OnBroadcastEvent;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import org.json.JSONObject;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class WebViewAdPlayer$onBroadcastEvent$2 extends l implements ve.a {
    final /* synthetic */ String $event;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewAdPlayer$onBroadcastEvent$2(String str) {
        super(0);
        this.$event = str;
    }

    @Override // ve.a
    public final WebViewEvent invoke() {
        JSONObject jSONObject = new JSONObject(this.$event);
        String eventType = jSONObject.getString("eventType");
        String optString = jSONObject.optString(JsonStorageKeyNames.DATA_KEY);
        k.d(eventType, "eventType");
        return new OnBroadcastEvent(eventType, optString);
    }
}
