package com.unity3d.ads.core.data.repository;

import android.content.Context;
import android.webkit.WebView;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.OMData;
import com.unity3d.ads.core.data.model.OmidOptions;
import le.c;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public interface OpenMeasurementRepository {
    Object activateOM(Context context, c cVar);

    Object finishSession(ByteString byteString, c cVar);

    OMData getOmData();

    boolean hasSessionFinished(ByteString byteString);

    Object impressionOccurred(ByteString byteString, boolean z10, c cVar);

    boolean isOMActive();

    void setOMActive(boolean z10);

    Object startSession(ByteString byteString, WebView webView, OmidOptions omidOptions, c cVar);
}
