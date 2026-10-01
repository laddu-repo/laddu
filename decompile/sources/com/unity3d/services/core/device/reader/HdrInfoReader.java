package com.unity3d.services.core.device.reader;

import android.app.Activity;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import com.unity3d.services.core.configuration.ExperimentsReader;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class HdrInfoReader implements IHdrInfoReader {
    private static final AtomicBoolean _hdrMetricsCaptured = new AtomicBoolean(false);
    private static volatile HdrInfoReader _instance;
    private final SDKMetricsSender _sdkMetricsSender = (SDKMetricsSender) Utilities.getService(SDKMetricsSender.class);

    private HdrInfoReader() {
    }

    public static HdrInfoReader getInstance() {
        if (_instance == null) {
            synchronized (HdrInfoReader.class) {
                try {
                    if (_instance == null) {
                        _instance = new HdrInfoReader();
                    }
                } finally {
                }
            }
        }
        return _instance;
    }

    @Override // com.unity3d.services.core.device.reader.IHdrInfoReader
    public void captureHDRCapabilityMetrics(Activity activity, ExperimentsReader experimentsReader) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        Display.HdrCapabilities hdrCapabilities;
        int[] supportedHdrTypes;
        float desiredMaxAverageLuminance;
        float desiredMaxLuminance;
        float desiredMinLuminance;
        boolean isScreenHdr;
        if (activity != null && experimentsReader.getCurrentlyActiveExperiments().isCaptureHDRCapabilitiesEnabled()) {
            boolean z14 = false;
            if (_hdrMetricsCaptured.compareAndSet(false, true)) {
                ArrayList arrayList = new ArrayList(5);
                if (Build.VERSION.SDK_INT >= 24) {
                    hdrCapabilities = ((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getHdrCapabilities();
                    supportedHdrTypes = hdrCapabilities.getSupportedHdrTypes();
                    boolean z15 = false;
                    z11 = false;
                    z12 = false;
                    z13 = false;
                    for (int i6 : supportedHdrTypes) {
                        if (i6 != 1) {
                            if (i6 != 2) {
                                if (i6 != 3) {
                                    if (i6 == 4) {
                                        z12 = true;
                                    }
                                } else {
                                    z13 = true;
                                }
                            } else {
                                z11 = true;
                            }
                        } else {
                            z15 = true;
                        }
                    }
                    desiredMaxAverageLuminance = hdrCapabilities.getDesiredMaxAverageLuminance();
                    long round = Math.round(desiredMaxAverageLuminance);
                    desiredMaxLuminance = hdrCapabilities.getDesiredMaxLuminance();
                    long round2 = Math.round(desiredMaxLuminance);
                    desiredMinLuminance = hdrCapabilities.getDesiredMinLuminance();
                    long round3 = Math.round(desiredMinLuminance);
                    arrayList.add(new Metric("native_device_hdr_lum_max_average", Long.valueOf(round)));
                    arrayList.add(new Metric("native_device_hdr_lum_max", Long.valueOf(round2)));
                    arrayList.add(new Metric("native_device_hdr_lum_min", Long.valueOf(round3)));
                    if (Build.VERSION.SDK_INT >= 26) {
                        isScreenHdr = activity.getResources().getConfiguration().isScreenHdr();
                        z10 = isScreenHdr;
                        z14 = z15;
                    } else {
                        z14 = z15;
                        z10 = false;
                    }
                } else {
                    z10 = false;
                    z11 = false;
                    z12 = false;
                    z13 = false;
                }
                if (z14) {
                    arrayList.add(new Metric("native_device_hdr_dolby_vision_success"));
                } else {
                    arrayList.add(new Metric("native_device_hdr_dolby_vision_failure"));
                }
                if (z11) {
                    arrayList.add(new Metric("native_device_hdr_hdr10_success"));
                } else {
                    arrayList.add(new Metric("native_device_hdr_hdr10_failure"));
                }
                if (z12) {
                    arrayList.add(new Metric("native_device_hdr_hdr10_plus_success"));
                } else {
                    arrayList.add(new Metric("native_device_hdr_hdr10_plus_failure"));
                }
                if (z13) {
                    arrayList.add(new Metric("native_device_hdr_hlg_success"));
                } else {
                    arrayList.add(new Metric("native_device_hdr_hlg_failure"));
                }
                if (z10) {
                    arrayList.add(new Metric("native_device_hdr_screen_hdr_success"));
                } else {
                    arrayList.add(new Metric("native_device_hdr_screen_hdr_failure"));
                }
                this._sdkMetricsSender.sendMetrics(arrayList);
            }
        }
    }
}
