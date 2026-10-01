package com.unity3d.ads.core.domain;

import com.unity3d.services.core.log.DeviceLog;
import gf.a0;
import gf.z;
import le.h;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class CleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1 extends le.a implements a0 {
    public CleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1(z zVar) {
        super(zVar);
    }

    @Override // gf.a0
    public void handleException(h hVar, Throwable th) {
        DeviceLog.debug("CleanUpExpiredOpportunity: " + th.getMessage());
    }
}
