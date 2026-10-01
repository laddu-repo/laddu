package com.unity3d.ads.core.domain.scar;

import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import gf.c0;
import gf.f0;
import ie.i;
import ie.j;
import kf.q0;
import kf.s0;
import kf.u0;
import kf.x0;
import kf.y0;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class CommonScarEventReceiver implements IEventSender {
    private final q0 _gmaEventFlow;
    private final q0 _versionFlow;
    private final u0 gmaEventFlow;
    private final c0 scope;
    private final u0 versionFlow;

    public CommonScarEventReceiver(c0 scope) {
        k.e(scope, "scope");
        this.scope = scope;
        x0 b10 = y0.b(0, 7);
        this._versionFlow = b10;
        this.versionFlow = new s0(b10);
        x0 b11 = y0.b(0, 7);
        this._gmaEventFlow = b11;
        this.gmaEventFlow = new s0(b11);
    }

    @Override // com.unity3d.services.core.webview.bridge.IEventSender
    public boolean canSend() {
        return true;
    }

    public final u0 getGmaEventFlow() {
        return this.gmaEventFlow;
    }

    public final u0 getVersionFlow() {
        return this.versionFlow;
    }

    @Override // com.unity3d.services.core.webview.bridge.IEventSender
    public boolean sendEvent(Enum<?> eventCategory, Enum<?> eventId, Object... params) {
        k.e(eventCategory, "eventCategory");
        k.e(eventId, "eventId");
        k.e(params, "params");
        if (!j.D(i.s0(new WebViewEventCategory[]{WebViewEventCategory.INIT_GMA, WebViewEventCategory.GMA, WebViewEventCategory.BANNER}), eventCategory)) {
            return false;
        }
        f0.w(this.scope, null, new CommonScarEventReceiver$sendEvent$1(eventId, params, this, null), 3);
        return true;
    }
}
