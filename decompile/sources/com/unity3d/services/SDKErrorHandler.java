package com.unity3d.services;

import cf.m;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.data.model.CoroutineOpportunity;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import gf.a0;
import gf.b0;
import gf.c0;
import gf.f0;
import gf.y;
import gf.z;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import le.g;
import le.h;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class SDKErrorHandler implements a0 {
    public static final Companion Companion = new Companion(null);
    public static final String UNITY_PACKAGE = "com.unity3d";
    public static final String UNKNOWN_FILE = "unknown";
    private final AlternativeFlowReader alternativeFlowReader;
    private final y ioDispatcher;
    private final z key;
    private final c0 scope;
    private final SDKMetricsSender sdkMetricsSender;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private Companion() {
        }
    }

    public SDKErrorHandler(y ioDispatcher, AlternativeFlowReader alternativeFlowReader, SendDiagnosticEvent sendDiagnosticEvent, SDKMetricsSender sdkMetricsSender) {
        k.e(ioDispatcher, "ioDispatcher");
        k.e(alternativeFlowReader, "alternativeFlowReader");
        k.e(sendDiagnosticEvent, "sendDiagnosticEvent");
        k.e(sdkMetricsSender, "sdkMetricsSender");
        this.ioDispatcher = ioDispatcher;
        this.alternativeFlowReader = alternativeFlowReader;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.sdkMetricsSender = sdkMetricsSender;
        this.scope = f0.y(f0.b(ioDispatcher), new b0("SDKErrorHandler"));
        this.key = z.f5729x;
    }

    private final String retrieveCoroutineName(h hVar) {
        String str;
        b0 b0Var = (b0) hVar.get(b0.f5650y);
        if (b0Var != null && (str = b0Var.f5651x) != null) {
            return str;
        }
        return "unknown";
    }

    private final ByteString retrieveOpportunityId(h hVar) {
        CoroutineOpportunity coroutineOpportunity = (CoroutineOpportunity) hVar.get(CoroutineOpportunity.Key);
        if (coroutineOpportunity != null) {
            return coroutineOpportunity.getValue();
        }
        return null;
    }

    private final void sendDiagnostic(String str, String str2, String str3, String str4, ByteString byteString) {
        f0.w(this.scope, null, new SDKErrorHandler$sendDiagnostic$1(this, str, str2, str4, str3, byteString, null), 3);
    }

    private final void sendMetric(Metric metric) {
        this.sdkMetricsSender.sendMetric(metric);
    }

    @Override // le.h
    public <R> R fold(R r10, p pVar) {
        return (R) m.l(this, r10, pVar);
    }

    @Override // le.h
    public <E extends le.f> E get(g gVar) {
        return (E) m.o(this, gVar);
    }

    @Override // gf.a0
    public void handleException(h context, Throwable exception) {
        String str;
        k.e(context, "context");
        k.e(exception, "exception");
        String retrieveCoroutineName = retrieveCoroutineName(context);
        ByteString retrieveOpportunityId = retrieveOpportunityId(context);
        if (exception instanceof NullPointerException) {
            str = "native_exception_npe";
        } else if (exception instanceof OutOfMemoryError) {
            str = "native_exception_oom";
        } else if (exception instanceof IllegalStateException) {
            str = "native_exception_ise";
        } else if (exception instanceof SecurityException) {
            str = "native_exception_se";
        } else if (exception instanceof RuntimeException) {
            str = "native_exception_re";
        } else {
            str = "native_exception";
        }
        String str2 = str;
        boolean invoke = this.alternativeFlowReader.invoke();
        String retrieveUnityCrashValue = ExceptionExtensionsKt.retrieveUnityCrashValue(exception);
        DeviceLog.error("Unity Ads SDK encountered an exception: " + retrieveUnityCrashValue);
        if (invoke) {
            sendDiagnostic(str2, retrieveUnityCrashValue, retrieveCoroutineName, ExceptionExtensionsKt.getShortenedStackTrace(exception, 15), retrieveOpportunityId);
        } else {
            sendMetric(new Metric(str2, retrieveUnityCrashValue, null, 4, null));
        }
    }

    @Override // le.h
    public h minusKey(g gVar) {
        return m.x(this, gVar);
    }

    @Override // le.h
    public h plus(h hVar) {
        return m.A(this, hVar);
    }

    @Override // le.f
    public z getKey() {
        return this.key;
    }
}
