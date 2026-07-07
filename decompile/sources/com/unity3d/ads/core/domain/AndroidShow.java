package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.configuration.GameServerIdReader;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.AdRepository;
import he.y;
import kf.h;
import kotlin.jvm.internal.k;
import lc.c;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidShow implements Show {
    private final AdRepository adRepository;
    private final GameServerIdReader gameServerIdReader;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidShow(AdRepository adRepository, GameServerIdReader gameServerIdReader, SendDiagnosticEvent sendDiagnosticEvent) {
        k.e(adRepository, "adRepository");
        k.e(gameServerIdReader, "gameServerIdReader");
        k.e(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.adRepository = adRepository;
        this.gameServerIdReader = gameServerIdReader;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    @Override // com.unity3d.ads.core.domain.Show
    public h invoke(AdObject adObject, UnityAdsShowOptions unityAdsShowOptions) {
        k.e(adObject, "adObject");
        return new c((p) new AndroidShow$invoke$1(adObject, this, unityAdsShowOptions, null));
    }

    @Override // com.unity3d.ads.core.domain.Show
    public Object terminate(AdObject adObject, le.c cVar) {
        Object destroy;
        AdPlayer adPlayer = adObject.getAdPlayer();
        y yVar = y.f6101a;
        if (adPlayer != null && (destroy = adPlayer.destroy(cVar)) == me.a.f8833x) {
            return destroy;
        }
        return yVar;
    }
}
