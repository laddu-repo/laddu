package org.chromium.support_lib_boundary;

import java.io.OutputStream;
import java.util.Collection;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public interface TracingControllerBoundaryInterface {
    boolean isTracing();

    void start(int i6, Collection<String> collection, int i10);

    boolean stop(OutputStream outputStream, Executor executor);
}
