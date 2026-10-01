package com.unity3d.services.core.device;

import android.util.SparseArray;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class VolumeChangeMonitor {
    private final IEventSender eventSender;
    private final VolumeChange volumeChange;
    private final SparseArray<VolumeChangeListener> volumeChangeListeners;

    public VolumeChangeMonitor(IEventSender eventSender, VolumeChange volumeChange) {
        k.e(eventSender, "eventSender");
        k.e(volumeChange, "volumeChange");
        this.eventSender = eventSender;
        this.volumeChange = volumeChange;
        this.volumeChangeListeners = new SparseArray<>();
    }

    public final void registerVolumeChangeListener(final int i6) {
        if (this.volumeChangeListeners.get(i6) == null) {
            VolumeChangeListener volumeChangeListener = new VolumeChangeListener() { // from class: com.unity3d.services.core.device.VolumeChangeMonitor$registerVolumeChangeListener$listener$1
                @Override // com.unity3d.services.core.device.VolumeChangeListener
                public int getStreamType() {
                    return i6;
                }

                @Override // com.unity3d.services.core.device.VolumeChangeListener
                public void onVolumeChanged(int i10) {
                    IEventSender iEventSender;
                    iEventSender = VolumeChangeMonitor.this.eventSender;
                    iEventSender.sendEvent(WebViewEventCategory.DEVICEINFO, DeviceInfoEvent.VOLUME_CHANGED, Integer.valueOf(getStreamType()), Integer.valueOf(i10), Integer.valueOf(Device.getStreamMaxVolume(i6)));
                }
            };
            this.volumeChangeListeners.append(i6, volumeChangeListener);
            this.volumeChange.registerListener(volumeChangeListener);
        }
    }

    public final void unregisterVolumeChangeListener(int i6) {
        if (this.volumeChangeListeners.get(i6) != null) {
            VolumeChangeListener listener = this.volumeChangeListeners.get(i6);
            VolumeChange volumeChange = this.volumeChange;
            k.d(listener, "listener");
            volumeChange.unregisterListener(listener);
            this.volumeChangeListeners.remove(i6);
        }
    }
}
