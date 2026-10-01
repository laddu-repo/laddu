package com.unity3d.ads.core.domain.scar;

import com.unity3d.ads.core.data.manager.ScarManager;
import he.y;
import kotlin.jvm.internal.k;
import le.c;
import me.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class LoadScarAd {
    private final ScarManager scarManager;

    public LoadScarAd(ScarManager scarManager) {
        k.e(scarManager, "scarManager");
        this.scarManager = scarManager;
    }

    public final Object invoke(String str, String str2, String str3, String str4, String str5, int i6, c cVar) {
        boolean a10 = k.a(str, "banner");
        y yVar = y.f6101a;
        if (a10) {
            return yVar;
        }
        Object loadAd = this.scarManager.loadAd(str, str2, str4, str3, str5, i6, cVar);
        if (loadAd == a.f8833x) {
            return loadAd;
        }
        return yVar;
    }
}
