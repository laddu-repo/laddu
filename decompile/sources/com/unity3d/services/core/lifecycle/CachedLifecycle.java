package com.unity3d.services.core.lifecycle;

import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.properties.ClientProperties;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class CachedLifecycle {
    private static LifecycleCache _listener;

    public static LifecycleCache getLifecycleListener() {
        return _listener;
    }

    public static void register() {
        if (ClientProperties.getApplication() != null && getLifecycleListener() == null) {
            setLifecycleListener(new LifecycleCache(new ConfigurationReader()));
            ClientProperties.getApplication().registerActivityLifecycleCallbacks(getLifecycleListener());
        }
    }

    public static void setLifecycleListener(LifecycleCache lifecycleCache) {
        _listener = lifecycleCache;
    }

    public static void unregister() {
        if (ClientProperties.getApplication() != null && getLifecycleListener() != null) {
            ClientProperties.getApplication().unregisterActivityLifecycleCallbacks(getLifecycleListener());
            setLifecycleListener(null);
        }
    }
}
