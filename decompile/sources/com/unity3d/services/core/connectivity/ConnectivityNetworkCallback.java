package com.unity3d.services.core.connectivity;

import android.annotation.TargetApi;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import com.unity3d.services.core.properties.ClientProperties;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@TargetApi(21)
/* loaded from: classes.dex */
public class ConnectivityNetworkCallback extends ConnectivityManager.NetworkCallback {
    private static ConnectivityNetworkCallback _impl;

    public static synchronized void register() {
        synchronized (ConnectivityNetworkCallback.class) {
            if (_impl == null) {
                _impl = new ConnectivityNetworkCallback();
                ((ConnectivityManager) ClientProperties.getApplicationContext().getSystemService("connectivity")).registerNetworkCallback(new NetworkRequest.Builder().build(), _impl);
            }
        }
    }

    public static synchronized void unregister() {
        synchronized (ConnectivityNetworkCallback.class) {
            if (_impl != null) {
                ((ConnectivityManager) ClientProperties.getApplicationContext().getSystemService("connectivity")).unregisterNetworkCallback(_impl);
                _impl = null;
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        ConnectivityMonitor.connected();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        ConnectivityMonitor.connectionStatusChanged();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        ConnectivityMonitor.connectionStatusChanged();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        ConnectivityMonitor.disconnected();
    }
}
