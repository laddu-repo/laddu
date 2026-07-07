package com.unity3d.services.core.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;
import r4.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class BroadcastEventReceiver extends BroadcastReceiver {
    private String _name;

    public BroadcastEventReceiver(String str) {
        this._name = str;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        String action = intent.getAction();
        if (action != null) {
            if (intent.getDataString() != null) {
                str = intent.getDataString();
            } else {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                if (intent.getExtras() != null) {
                    Bundle extras = intent.getExtras();
                    for (String str2 : extras.keySet()) {
                        jSONObject.put(str2, extras.get(str2));
                    }
                }
            } catch (JSONException e10) {
                StringBuilder q9 = a.q("JSONException when composing extras for broadcast action ", action, ": ");
                q9.append(e10.getMessage());
                DeviceLog.debug(q9.toString());
            }
            WebViewApp currentApp = WebViewApp.getCurrentApp();
            if (currentApp != null && currentApp.isWebAppLoaded()) {
                currentApp.sendEvent(WebViewEventCategory.BROADCAST, BroadcastEvent.ACTION, this._name, action, str, jSONObject);
            }
        }
    }
}
