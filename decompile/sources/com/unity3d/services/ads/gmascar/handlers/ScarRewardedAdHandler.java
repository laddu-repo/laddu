package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.b;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.core.misc.EventSubject;
import sd.c;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class ScarRewardedAdHandler extends ScarAdHandlerBase {
    private boolean _hasEarnedReward;

    public ScarRewardedAdHandler(c cVar, EventSubject<b> eventSubject, GMAEventSender gMAEventSender) {
        super(cVar, eventSubject, gMAEventSender);
        this._hasEarnedReward = false;
    }

    @Override // com.unity3d.services.ads.gmascar.handlers.ScarAdHandlerBase
    public void onAdClosed() {
        if (!this._hasEarnedReward) {
            onAdSkipped();
        }
        super.onAdClosed();
    }

    public void onAdFailedToShow(int i6, String str) {
        GMAEventSender gMAEventSender = this._gmaEventSender;
        c cVar = this._scarAdMetadata;
        gMAEventSender.send(b.Q, cVar.f12287a, cVar.f12288b, str, Integer.valueOf(i6));
    }

    public void onAdImpression() {
        this._gmaEventSender.send(b.J, new Object[0]);
    }

    public void onAdSkipped() {
        this._gmaEventSender.send(b.Y, new Object[0]);
    }

    public void onUserEarnedReward() {
        this._hasEarnedReward = true;
        this._gmaEventSender.send(b.W, new Object[0]);
    }
}
