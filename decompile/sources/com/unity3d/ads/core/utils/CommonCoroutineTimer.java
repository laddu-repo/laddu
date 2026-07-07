package com.unity3d.ads.core.utils;

import gf.c0;
import gf.c2;
import gf.f0;
import gf.j1;
import gf.r;
import gf.y;
import kotlin.jvm.internal.k;
import ve.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class CommonCoroutineTimer implements CoroutineTimer {
    private final y dispatcher;
    private final r job;
    private final c0 scope;

    public CommonCoroutineTimer(y dispatcher) {
        k.e(dispatcher, "dispatcher");
        this.dispatcher = dispatcher;
        c2 e10 = f0.e();
        this.job = e10;
        this.scope = f0.b(dispatcher.plus(e10));
    }

    @Override // com.unity3d.ads.core.utils.CoroutineTimer
    public j1 start(long j, long j10, a action) {
        k.e(action, "action");
        return f0.w(this.scope, this.dispatcher, new CommonCoroutineTimer$start$1(j, action, j10, null), 2);
    }
}
