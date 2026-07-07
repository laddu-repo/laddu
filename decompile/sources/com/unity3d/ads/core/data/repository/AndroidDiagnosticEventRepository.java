package com.unity3d.ads.core.data.repository;

import b7.d;
import cf.l;
import cf.t;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import com.unity3d.ads.core.utils.CoroutineTimer;
import com.unity3d.services.core.log.DeviceLog;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gf.b0;
import gf.c0;
import gf.f0;
import gf.y;
import ie.j;
import ie.r;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kf.f1;
import kf.q0;
import kf.r0;
import kf.s0;
import kf.u0;
import kf.x0;
import kf.y0;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidDiagnosticEventRepository implements DiagnosticEventRepository {
    private final q0 _diagnosticEvents;
    private final Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> allowedEvents;
    private final r0 batch;
    private final Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> blockedEvents;
    private final r0 configured;
    private final c0 coroutineScope;
    private final u0 diagnosticEvents;
    private final r0 enabled;
    private final CoroutineTimer flushTimer;
    private final GetDiagnosticEventRequest getDiagnosticEventRequest;
    private int maxBatchSize;

    public AndroidDiagnosticEventRepository(CoroutineTimer flushTimer, GetDiagnosticEventRequest getDiagnosticEventRequest, y dispatcher) {
        k.e(flushTimer, "flushTimer");
        k.e(getDiagnosticEventRequest, "getDiagnosticEventRequest");
        k.e(dispatcher, "dispatcher");
        this.flushTimer = flushTimer;
        this.getDiagnosticEventRequest = getDiagnosticEventRequest;
        this.coroutineScope = f0.y(f0.b(dispatcher), new b0("DiagnosticEventRepository"));
        this.batch = y0.c(r.f6846x);
        this.maxBatchSize = Integer.MAX_VALUE;
        this.allowedEvents = Collections.synchronizedSet(new LinkedHashSet());
        this.blockedEvents = Collections.synchronizedSet(new LinkedHashSet());
        Boolean bool = Boolean.FALSE;
        this.enabled = y0.c(bool);
        this.configured = y0.c(bool);
        x0 b10 = y0.b(100, 6);
        this._diagnosticEvents = b10;
        this.diagnosticEvents = new s0(b10);
    }

    public static /* synthetic */ String a(AndroidDiagnosticEventRepository androidDiagnosticEventRepository, List list) {
        return flush$lambda$3(androidDiagnosticEventRepository, list);
    }

    public static final String flush$lambda$3(AndroidDiagnosticEventRepository this$0, List events) {
        k.e(this$0, "this$0");
        k.e(events, "$events");
        return "Unity Ads Sending diagnostic batch enabled: " + ((Boolean) ((f1) this$0.enabled).getValue()).booleanValue() + " size: " + events.size() + " :: " + events;
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void addDiagnosticEvent(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        f1 f1Var;
        Object value;
        f1 f1Var2;
        Object value2;
        k.e(diagnosticEvent, "diagnosticEvent");
        if (!((Boolean) ((f1) this.configured).getValue()).booleanValue()) {
            r0 r0Var = this.batch;
            do {
                f1Var2 = (f1) r0Var;
                value2 = f1Var2.getValue();
            } while (!f1Var2.f(value2, j.Q((List) value2, diagnosticEvent)));
            return;
        }
        if (((Boolean) ((f1) this.enabled).getValue()).booleanValue()) {
            r0 r0Var2 = this.batch;
            do {
                f1Var = (f1) r0Var2;
                value = f1Var.getValue();
            } while (!f1Var.f(value, j.Q((List) value, diagnosticEvent)));
            if (((List) ((f1) this.batch).getValue()).size() >= this.maxBatchSize) {
                flush();
            }
        }
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void clear() {
        f1 f1Var;
        Object value;
        r0 r0Var = this.batch;
        do {
            f1Var = (f1) r0Var;
            value = f1Var.getValue();
        } while (!f1Var.f(value, r.f6846x));
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void configure(NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticsEventsConfiguration) {
        k.e(diagnosticsEventsConfiguration, "diagnosticsEventsConfiguration");
        r0 r0Var = this.configured;
        Boolean bool = Boolean.TRUE;
        f1 f1Var = (f1) r0Var;
        f1Var.getClass();
        f1Var.h(null, bool);
        r0 r0Var2 = this.enabled;
        Boolean valueOf = Boolean.valueOf(diagnosticsEventsConfiguration.getEnabled());
        f1 f1Var2 = (f1) r0Var2;
        f1Var2.getClass();
        f1Var2.h(null, valueOf);
        if (!((Boolean) ((f1) this.enabled).getValue()).booleanValue()) {
            clear();
            return;
        }
        this.maxBatchSize = diagnosticsEventsConfiguration.getMaxBatchSize();
        Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> set = this.allowedEvents;
        List<DiagnosticEventRequestOuterClass.DiagnosticEventType> allowedEventsList = diagnosticsEventsConfiguration.getAllowedEventsList();
        k.d(allowedEventsList, "diagnosticsEventsConfiguration.allowedEventsList");
        set.addAll(allowedEventsList);
        Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> set2 = this.blockedEvents;
        List<DiagnosticEventRequestOuterClass.DiagnosticEventType> blockedEventsList = diagnosticsEventsConfiguration.getBlockedEventsList();
        k.d(blockedEventsList, "diagnosticsEventsConfiguration.blockedEventsList");
        set2.addAll(blockedEventsList);
        this.flushTimer.start(0L, diagnosticsEventsConfiguration.getMaxBatchIntervalMs(), new AndroidDiagnosticEventRepository$configure$1(this));
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void flush() {
        f1 f1Var;
        Object value;
        if (((Boolean) ((f1) this.enabled).getValue()).booleanValue()) {
            r0 r0Var = this.batch;
            do {
                f1Var = (f1) r0Var;
                value = f1Var.getValue();
            } while (!f1Var.f(value, r.f6846x));
            List P = l.P(l.L(l.L(new t(j.C((Iterable) value), new AndroidDiagnosticEventRepository$flush$events$2(this), 1), new AndroidDiagnosticEventRepository$flush$events$3(this)), new AndroidDiagnosticEventRepository$flush$events$4(this)));
            if (!P.isEmpty()) {
                DeviceLog.debug(new d(1, this, P));
                f0.w(this.coroutineScope, null, new AndroidDiagnosticEventRepository$flush$2(this, P, null), 3);
            }
        }
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public u0 getDiagnosticEvents() {
        return this.diagnosticEvents;
    }
}
