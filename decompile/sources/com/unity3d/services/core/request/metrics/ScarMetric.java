package com.unity3d.services.core.request.metrics;

import h8.c;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class ScarMetric {
    private static final String ASYNC_PREFIX = "async";
    private static final String HB_SIGNALS_FETCH_FAILURE = "native_hb_signals_%s_fetch_failure";
    private static final String HB_SIGNALS_FETCH_START = "native_hb_signals_%s_fetch_start";
    private static final String HB_SIGNALS_FETCH_SUCCESS = "native_hb_signals_%s_fetch_success";
    private static final String HB_SIGNALS_UPLOAD_FAILURE = "native_hb_signals_%s_upload_failure";
    private static final String HB_SIGNALS_UPLOAD_START = "native_hb_signals_%s_upload_start";
    private static final String HB_SIGNALS_UPLOAD_SUCCESS = "native_hb_signals_%s_upload_success";
    private static final String REASON = "reason";
    private static final String SYNC_PREFIX = "sync";
    private static long _fetchStartTime;
    private static long _uploadStartTime;

    private static long getTotalFetchTime() {
        return TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - _fetchStartTime);
    }

    private static long getTotalUploadTime() {
        return TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - _uploadStartTime);
    }

    public static Metric hbSignalsFetchFailure(boolean z10, String str) {
        String str2;
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        if (z10) {
            str2 = ASYNC_PREFIX;
        } else {
            str2 = "sync";
        }
        return new Metric(c.m("native_hb_signals_", str2, "_fetch_failure"), Long.valueOf(getTotalFetchTime()), hashMap);
    }

    public static Metric hbSignalsFetchStart(boolean z10) {
        String str;
        _fetchStartTime = System.nanoTime();
        if (z10) {
            str = ASYNC_PREFIX;
        } else {
            str = "sync";
        }
        return new Metric(c.m("native_hb_signals_", str, "_fetch_start"), null);
    }

    public static Metric hbSignalsFetchSuccess(boolean z10) {
        String str;
        if (z10) {
            str = ASYNC_PREFIX;
        } else {
            str = "sync";
        }
        return new Metric(c.m("native_hb_signals_", str, "_fetch_success"), Long.valueOf(getTotalFetchTime()));
    }

    public static Metric hbSignalsUploadFailure(boolean z10, String str) {
        String str2;
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        if (z10) {
            str2 = ASYNC_PREFIX;
        } else {
            str2 = "sync";
        }
        return new Metric(c.m("native_hb_signals_", str2, "_upload_failure"), Long.valueOf(getTotalUploadTime()), hashMap);
    }

    public static Metric hbSignalsUploadStart(boolean z10) {
        String str;
        _uploadStartTime = System.nanoTime();
        if (z10) {
            str = ASYNC_PREFIX;
        } else {
            str = "sync";
        }
        return new Metric(c.m("native_hb_signals_", str, "_upload_start"), null);
    }

    public static Metric hbSignalsUploadSuccess(boolean z10) {
        String str;
        if (z10) {
            str = ASYNC_PREFIX;
        } else {
            str = "sync";
        }
        return new Metric(c.m("native_hb_signals_", str, "_upload_success"), Long.valueOf(getTotalUploadTime()));
    }
}
