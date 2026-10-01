package com.unity3d.services.core.timer;

import com.unity3d.services.core.lifecycle.CachedLifecycle;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class DefaultIntervalTimerFactory implements IIntervalTimerFactory {
    @Override // com.unity3d.services.core.timer.IIntervalTimerFactory
    public IIntervalTimer createTimer(Integer num, Integer num2, IIntervalTimerListener iIntervalTimerListener) {
        return new IntervalTimer(num, num2, iIntervalTimerListener, CachedLifecycle.getLifecycleListener());
    }
}
