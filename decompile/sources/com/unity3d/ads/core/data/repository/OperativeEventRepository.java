package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import jf.a;
import kf.q0;
import kf.s0;
import kf.u0;
import kf.x0;
import kf.y0;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class OperativeEventRepository {
    private final q0 _operativeEvents;
    private final u0 operativeEvents;

    public OperativeEventRepository() {
        x0 a10 = y0.a(10, 10, a.f7437y);
        this._operativeEvents = a10;
        this.operativeEvents = new s0(a10);
    }

    public final void addOperativeEvent(OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest) {
        k.e(operativeEventRequest, "operativeEventRequest");
        this._operativeEvents.m(operativeEventRequest);
    }

    public final u0 getOperativeEvents() {
        return this.operativeEvents;
    }
}
