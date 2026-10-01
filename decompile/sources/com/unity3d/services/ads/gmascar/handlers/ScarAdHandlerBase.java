package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.b;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.core.misc.EventSubject;
import com.unity3d.services.core.misc.IEventListener;
import sd.c;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class ScarAdHandlerBase {
    protected final EventSubject<b> _eventSubject;
    protected final GMAEventSender _gmaEventSender;
    protected final c _scarAdMetadata;

    public ScarAdHandlerBase(c cVar, EventSubject<b> eventSubject, GMAEventSender gMAEventSender) {
        this._scarAdMetadata = cVar;
        this._eventSubject = eventSubject;
        this._gmaEventSender = gMAEventSender;
    }

    public void onAdClicked() {
        this._gmaEventSender.send(b.X, new Object[0]);
    }

    public void onAdClosed() {
        this._gmaEventSender.send(b.f3388a0, new Object[0]);
        this._eventSubject.unsubscribe();
    }

    public void onAdFailedToLoad(int i6, String str) {
        GMAEventSender gMAEventSender = this._gmaEventSender;
        c cVar = this._scarAdMetadata;
        gMAEventSender.send(b.L, cVar.f12287a, cVar.f12288b, str, Integer.valueOf(i6));
    }

    public void onAdLoaded() {
        GMAEventSender gMAEventSender = this._gmaEventSender;
        c cVar = this._scarAdMetadata;
        gMAEventSender.send(b.H, cVar.f12287a, cVar.f12288b);
    }

    public void onAdOpened() {
        this._gmaEventSender.send(b.N, new Object[0]);
        this._eventSubject.subscribe(new IEventListener<b>() { // from class: com.unity3d.services.ads.gmascar.handlers.ScarAdHandlerBase.1
            @Override // com.unity3d.services.core.misc.IEventListener
            public void onNextEvent(b bVar) {
                ScarAdHandlerBase.this._gmaEventSender.send(bVar, new Object[0]);
            }
        });
    }
}
