package com.unity3d.ads.core.domain;

import cf.m;
import com.unity3d.ads.core.data.model.AdObject;
import gf.a0;
import gf.c0;
import gf.f0;
import gf.y;
import gf.z;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class CleanUpWhenOpportunityExpires {
    private final a0 coroutineExceptionHandler;
    private final c0 coroutineScope;

    public CleanUpWhenOpportunityExpires(y defaultDispatcher) {
        k.e(defaultDispatcher, "defaultDispatcher");
        CleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1 cleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1 = new CleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1(z.f5729x);
        this.coroutineExceptionHandler = cleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1;
        this.coroutineScope = f0.b(m.A(f0.e(), defaultDispatcher).plus(cleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1));
    }

    public final void invoke(AdObject adObject) {
        k.e(adObject, "adObject");
        if (adObject.getAdPlayer() != null) {
            f0.q(adObject.getAdPlayer().getScope().getCoroutineContext()).y(new CleanUpWhenOpportunityExpires$invoke$2(f0.w(this.coroutineScope, null, new CleanUpWhenOpportunityExpires$invoke$job$1(adObject, null), 3)));
            return;
        }
        throw new IllegalArgumentException("AdObject does not have an adPlayer.");
    }
}
