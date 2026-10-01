package com.unity3d.services.core.api;

import android.annotation.TargetApi;
import com.unity3d.services.core.lifecycle.LifecycleError;
import com.unity3d.services.core.lifecycle.LifecycleListener;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@TargetApi(14)
/* loaded from: classes.dex */
public class Lifecycle {
    private static LifecycleListener _listener;

    public static LifecycleListener getLifecycleListener() {
        return _listener;
    }

    @WebViewExposed
    public static void register(JSONArray jSONArray, WebViewCallback webViewCallback) {
        if (ClientProperties.getApplication() != null) {
            if (getLifecycleListener() == null) {
                ArrayList arrayList = new ArrayList();
                for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                    try {
                        arrayList.add((String) jSONArray.get(i6));
                    } catch (JSONException unused) {
                        webViewCallback.error(LifecycleError.JSON_ERROR, new Object[0]);
                        return;
                    }
                }
                setLifecycleListener(new LifecycleListener(arrayList));
                ClientProperties.getApplication().registerActivityLifecycleCallbacks(getLifecycleListener());
                webViewCallback.invoke(new Object[0]);
                return;
            }
            webViewCallback.error(LifecycleError.LISTENER_NOT_NULL, new Object[0]);
            return;
        }
        webViewCallback.error(LifecycleError.APPLICATION_NULL, new Object[0]);
    }

    public static void setLifecycleListener(LifecycleListener lifecycleListener) {
        _listener = lifecycleListener;
    }

    @WebViewExposed
    public static void unregister(WebViewCallback webViewCallback) {
        if (ClientProperties.getApplication() != null) {
            if (getLifecycleListener() != null) {
                ClientProperties.getApplication().unregisterActivityLifecycleCallbacks(getLifecycleListener());
                setLifecycleListener(null);
            }
            webViewCallback.invoke(new Object[0]);
            return;
        }
        webViewCallback.error(LifecycleError.APPLICATION_NULL, new Object[0]);
    }
}
