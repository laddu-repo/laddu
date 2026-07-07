package com.unity3d.services.ads.gmascar.utils;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.RequestType;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import okhttp3.HttpUrl;
import org.json.JSONObject;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class ScarRequestHandler {
    private final HttpClient httpClient = (HttpClient) Utilities.getService(HttpClient.class);

    public void makeUploadRequest(String str, BiddingSignals biddingSignals, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(CommonGatewayClient.HEADER_CONTENT_TYPE, Collections.singletonList("application/json"));
        HashMap hashMap2 = new HashMap();
        hashMap2.put(ScarConstants.IDFI_KEY, Device.getIdfi());
        hashMap2.put(ScarConstants.TOKEN_ID_KEY, str);
        hashMap2.putAll(biddingSignals.getMap());
        this.httpClient.executeBlocking(new HttpRequest(str2, HttpUrl.FRAGMENT_ENCODE_SET, RequestType.POST, new JSONObject(hashMap2).toString().getBytes(StandardCharsets.UTF_8), hashMap));
    }
}
