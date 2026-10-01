package com.unity3d.services.core.domain;

import gf.o0;
import gf.y;
import mf.o;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class SDKDispatchers implements ISDKDispatchers {
    private final y io = o0.f5694b;

    /* renamed from: default, reason: not valid java name */
    private final y f0default = o0.f5693a;
    private final y main = o.f8875a;

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    public y getDefault() {
        return this.f0default;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    public y getIo() {
        return this.io;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    public y getMain() {
        return this.main;
    }
}
