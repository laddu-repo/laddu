package com.unity3d.services.core.request.metrics;

import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.core.misc.Utilities;
import kotlin.jvm.internal.l;
import ve.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class MetricSenderWithBatch$_logger$2 extends l implements a {
    public static final MetricSenderWithBatch$_logger$2 INSTANCE = new MetricSenderWithBatch$_logger$2();

    public MetricSenderWithBatch$_logger$2() {
        super(0);
    }

    @Override // ve.a
    public final Logger invoke() {
        return (Logger) Utilities.getService(Logger.class);
    }
}
