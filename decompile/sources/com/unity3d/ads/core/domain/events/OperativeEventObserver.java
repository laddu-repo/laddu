package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import gf.c0;
import gf.f0;
import gf.y;
import gf.z;
import kf.r0;
import kf.y0;
import kotlin.jvm.internal.k;
import le.c;
import me.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class OperativeEventObserver {
    private final BackgroundWorker backgroundWorker;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final r0 isRunning;
    private final OperativeEventRepository operativeEventRepository;
    private final GetRequestPolicy operativeRequestPolicy;
    private final c0 scope;
    private final UniversalRequestDataSource universalRequestDataSource;
    private final UniversalRequestEventSender universalRequestEventSender;

    public OperativeEventObserver(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, y defaultDispatcher, OperativeEventRepository operativeEventRepository, UniversalRequestDataSource universalRequestDataSource, BackgroundWorker backgroundWorker, UniversalRequestEventSender universalRequestEventSender, GetRequestPolicy operativeRequestPolicy) {
        k.e(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        k.e(defaultDispatcher, "defaultDispatcher");
        k.e(operativeEventRepository, "operativeEventRepository");
        k.e(universalRequestDataSource, "universalRequestDataSource");
        k.e(backgroundWorker, "backgroundWorker");
        k.e(universalRequestEventSender, "universalRequestEventSender");
        k.e(operativeRequestPolicy, "operativeRequestPolicy");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.operativeEventRepository = operativeEventRepository;
        this.universalRequestDataSource = universalRequestDataSource;
        this.backgroundWorker = backgroundWorker;
        this.universalRequestEventSender = universalRequestEventSender;
        this.operativeRequestPolicy = operativeRequestPolicy;
        this.isRunning = y0.c(Boolean.FALSE);
        this.scope = f0.b(defaultDispatcher.plus(new OperativeEventObserver$special$$inlined$CoroutineExceptionHandler$1(z.f5729x)));
    }

    public final Object invoke(c cVar) {
        Object J = f0.J(this.scope.getCoroutineContext(), new OperativeEventObserver$invoke$2(this, null), cVar);
        if (J == a.f8833x) {
            return J;
        }
        return he.y.f6101a;
    }
}
