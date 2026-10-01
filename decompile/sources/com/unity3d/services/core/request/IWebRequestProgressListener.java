package com.unity3d.services.core.request;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public interface IWebRequestProgressListener {
    void onRequestProgress(String str, long j, long j10);

    void onRequestStart(String str, long j, int i6, Map<String, List<String>> map);
}
