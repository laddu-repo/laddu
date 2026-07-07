package com.unity3d.ads.core.domain.offerwall;

import com.unity3d.ads.core.data.manager.OfferwallManager;
import he.y;
import kotlin.jvm.internal.k;
import le.c;
import me.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class LoadOfferwallAd {
    private final OfferwallManager offerwallManager;

    public LoadOfferwallAd(OfferwallManager offerwallManager) {
        k.e(offerwallManager, "offerwallManager");
        this.offerwallManager = offerwallManager;
    }

    public final Object invoke(String str, c cVar) {
        Object loadAd = this.offerwallManager.loadAd(str, cVar);
        if (loadAd == a.f8833x) {
            return loadAd;
        }
        return y.f6101a;
    }
}
